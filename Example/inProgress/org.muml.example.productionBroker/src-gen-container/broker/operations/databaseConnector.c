/*
 * Connects to the database microservice specified in the config.json
 *
 */
#include <stdlib.h>
#include <string.h> /* strchr(), strlen(), .. */
#include <curl/curl.h>
#include <time.h>
#include "cJSON.h"

int insertOrder(int orderId, int ingredientID, int amount, int timeout);
int defineProductionStationForOrder(int orderID, int productionStationID);
int getOrderIngredientID(int orderID);
int getOrderAmount(int orderID);
int searchOrder(int searchingPS, int producibleIngredients);
int markOrderAsDone(int orderID);
int heartBeatProductionStation(int productionStationID);
int markOrdersAsFailedForUnreachableStations();

struct producingStation {
	int stationID;
	int orderID;
	time_t lastSeen;
	struct producingStation *next;
} node;

CURL *curl;
char *url;
int baseUrlLength;
const int LONGEST_API_URL=33;
struct producingStation *first;
time_t tnow;


char * readConfigFile()
{
	char *buffer = 0;
	long length;
	char *url = "";

	FILE *fp = fopen("config.json", "r");
	if (fp)
	{
		fseek(fp, 0, SEEK_END);
		length = ftell(fp);
		fseek(fp, 0, SEEK_SET);
		buffer = malloc(length);
		if (buffer)
		{
			fread(buffer, 1, length, fp);
		}
		fclose(fp);
	}
	if (buffer)
	{
		cJSON *root = cJSON_Parse(buffer);
		if (root)
		{
			baseUrlLength=strlen(cJSON_GetObjectItem(root, "baseurl")->valuestring);
			url = malloc(baseUrlLength);
			sprintf(url, "%s", cJSON_GetObjectItem(root, "baseurl")->valuestring);
			cJSON_Delete(root);
			printf("Found the following baseurl: %s\n", url);
		}
	}

	return url;
}

/**
 * Takes a json string and sends it to the server via post request
 *
 */
int getFromDatabaseServer(char *apiEndPoint, char *jsonString)
{
	int ret = -1;
	curl = curl_easy_init();
	if (curl)
	{
		//Compute and set full url of endpoint
		if (!url){
			url = readConfigFile();
		}
		char *fullUrl = malloc(baseUrlLength+LONGEST_API_URL);
		strcpy(fullUrl, url);
		strncat(fullUrl, apiEndPoint, LONGEST_API_URL);
		curl_easy_setopt(curl, CURLOPT_URL, url);

		printf("Json String %s \n Sent to %s\n", jsonString, fullUrl);

		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "Accept: application/json");
		headers = curl_slist_append(headers, "Content-Type: application/json");
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);

		CURLcode res = curl_easy_perform(curl);
		if (res != CURLE_OK)
		{
			fprintf(stderr, "curl_easy_perform() failed: %s\n", curl_easy_strerror(res));
		}
		else
		{
			 long *responseCode;
			 res = curl_easy_getinfo(curl, CURLINFO_RESPONSE_CODE, &responseCode);

			 if((CURLE_OK == res) && responseCode)
			 {
				if (*responseCode != 404){
					ret = *responseCode;
				}
			    printf("Received response code: %ld\n", *responseCode);
			 }
		}
		curl_easy_cleanup(curl);
	}
	return ret;
}

/**
 * Takes a json string and sends it to the server via post request
 *
 */
void postToDatabaseServer(char *apiEndPoint, char *jsonString)
{
	curl = curl_easy_init();
	if (curl)
	{
		//Compute and set full url of endpoint
		if (!url){
			url = readConfigFile();
		}
		char *fullUrl = malloc(baseUrlLength+LONGEST_API_URL);
		strcpy(fullUrl, url);
		strncat(fullUrl, apiEndPoint, LONGEST_API_URL);
		curl_easy_setopt(curl, CURLOPT_URL, url);

		printf("Json String %s \nSent to %s\n", jsonString, fullUrl);

		/* setting correct headers so that the server will interpret the post body as json */
		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "Accept: application/json");
		headers = curl_slist_append(headers, "Content-Type: application/json");
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);

		/* pass in a pointer to the data - libcurl will not copy */
		curl_easy_setopt(curl, CURLOPT_POSTFIELDS, jsonString);
		CURLcode res = curl_easy_perform(curl);

		if (res != CURLE_OK)
		{
			fprintf(stderr, "curl_easy_perform() failed: %s\n",
					curl_easy_strerror(res));
		}
		else
		{
			 long *responseCode;
			 res = curl_easy_getinfo(curl, CURLINFO_RESPONSE_CODE, &responseCode);

			 if((CURLE_OK == res) && responseCode)
			 {
				if (*responseCode != 200){
					printf("Something went wrong while posting, status code: %ld \n", *responseCode);
				}
			 }
		}
		curl_easy_cleanup(curl);
	}
}


/**
 * Inserts an order with its ID, ingredient, amount and timeout
 *
 */
int insertOrder(int orderID, int ingredientID, int amount, int timeout)
{
	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "amount", amount);
	cJSON_AddNumberToObject(order, "ingredientID", ingredientID);
	cJSON_AddNumberToObject(order, "orderID", orderID);
	cJSON_AddNumberToObject(order, "timeout", timeout);
	postToDatabaseServer("order/insert" , cJSON_Print(order));

	return 0;
}

/**
 * Defines a production station as producer of the order with the given ID
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	cJSON *request = cJSON_CreateObject();
	cJSON_AddNumberToObject(request, "orderID", orderID);
	cJSON_AddNumberToObject(request, "productionStationID", productionStationID);
	postToDatabaseServer("productionStation/assignOrder",cJSON_Print(request));

	//Add tuple to list of producing stations
	struct producingStation *newElement=first;
	if (newElement != NULL){
		struct producingStation *endOfList=first;
		while(endOfList->next != NULL){
			endOfList = endOfList->next;
		}
		newElement = endOfList->next;
	}
	newElement = malloc(sizeof(node));
	newElement->orderID = orderID;
	newElement->stationID = productionStationID;
	newElement->lastSeen= time(&tnow);
	newElement->next = NULL;

	return 0;
}

/**
 * Sets orderStatus to DONE
 */
int markOrderAsDone(int orderID)
{
	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "orderID", orderID);
	postToDatabaseServer("order/done", cJSON_Print(order));

	//TODO remove from list

	return 0;
}

/**
 * Retrieve the ingredientID for the order with the given id.
 */
int getOrderIngredientID(int orderID)
{
	cJSON *request = cJSON_CreateObject();
	cJSON_AddNumberToObject(request, "orderID", orderID);
	int ingredientID = getFromDatabaseServer("order/ingredient", cJSON_Print(request));
	printf("Successfully retrieved ingredientID %d for order %d.\n", ingredientID, orderID);
	return ingredientID;
}

/**
 * Retrieve the amount for the order with the given id.
 */
int getOrderAmount(int orderID)
{
	cJSON *request = cJSON_CreateObject();
	cJSON_AddNumberToObject(request, "amount", orderID);
	int orderAmount = getFromDatabaseServer("order/amount", cJSON_Print(request));
	printf("Successfully retrieved amount %d for order %d.\n", orderAmount, orderID);
	return orderAmount;
}

/**
 * Searches an order without a production station assigned
 */
int searchOrder(int searchingPS, int producibleIngredients)
{
	cJSON *request = cJSON_CreateObject();
	cJSON_AddNumberToObject(request, "productionStationID", searchingPS);
	cJSON *producibleIngredientArray = cJSON_CreateArray();
	cJSON_AddItemToArray(producibleIngredientArray, cJSON_CreateNumber(producibleIngredients));
	cJSON_AddItemToObject(request, "producibleIngredients", producibleIngredientArray);

	int orderID = getFromDatabaseServer("order/search", cJSON_Print(request));
	return orderID;
}


/**
 * Updates the last time we saw the producing productionStation
 */
int heartBeatProductionStation(int productionStationID)
{
	if (first == NULL)
	{
		printf("Error: Heart beat without producing station");
		exit(1);
	}
	//Find producing station in list and update its lastSeen timestamp
	struct producingStation *currentStation=first;
	while (currentStation->stationID != productionStationID)
	{
		if (currentStation->next != NULL)
		{
			currentStation = currentStation->next;
		} else{
			printf("Error: Heart beat without producing station");
			exit(1);
		}
	}
	currentStation->lastSeen = time(&tnow);

	return 0;
}

/**
 * Checks periodically whether any of the production stations that are meant to be producing for us
 * have not sent a heart beat in a while
 */
int markOrdersAsFailedForUnreachableStations(){
	//TODO traverse list, for every failed station send message to the server
	return 0;
}
