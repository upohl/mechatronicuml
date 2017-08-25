/*
 * Connects to the database microservice specified in the config.json
 *
 */

#include <string.h> /* strchr(), strlen(), .. */
#include <curl/curl.h>
#include "cJSON.h"

const char * readConfigFile();
int getFromDatabaseServer(char[] apiEndPoint, char *jsonString);
void postToDatabaseServer(char[] apiEndPoint, char *jsonString);
int insertOrder(int orderId, int ingredientID, int amount, int timeout);
int defineProductionStationForOrder(int orderID, int productionStationID);
int getOrderIngredientID(int orderID);
int getOrderAmount(int orderID);
int searchOrder(int searchingPS, int producibleIngredients);
int deleteOrder(int orderID);
int heartBeatProductionStation(int productionStationID);

CURL *curl;
char *url = readConfigFile();

/**
 * Takes a json string and sends it to the server via post request
 *
 */
int getFromDatabaseServer(char[] apiEndPoint, char *jsonString)
{
	int ret = -1;
	curl = curl_easy_init();
	if (curl)
	{
		//Compute and set full url of endpoint
		char *fullUrl = malloc(sizeof(url)+sizeof(apiEndPoint));
		strcopy(fullUrl, url);
		strncat(fullUrl, apiEndPoint, sizeof(apiEndPoint));
		curl_easy_setopt(curl, CURLOPT_URL, url);

		printf("Json String: %s \n", jsonString);

		curl_easy_setopt(curl, CURLOPT_PROTOCOLS, CURLPROTO_HTTP);

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
			    printf("Received response code: %s\n", responseCode);
			    ret = responseCode;
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
void postToDatabaseServer(char[] apiEndPoint, char *jsonString)
{
	curl = curl_easy_init();
	if (curl)
	{
		//Compute and set full url of endpoint
		char *fullUrl = malloc(sizeof(url)+sizeof(apiEndPoint));
		strcopy(fullUrl, url);
		strncat(fullUrl, apiEndPoint, sizeof(apiEndPoint));
		curl_easy_setopt(curl, CURLOPT_URL, url);

		printf("Json String: %s \n", jsonString);

		curl_easy_setopt(curl, CURLOPT_PROTOCOLS, CURLPROTO_HTTP);

		/* setting correct headers so that the server will interpret the post body as json */
		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "Accept: application/json");
		headers = curl_slist_append(headers, "Content-Type: application/json");
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);

		/* pass in a pointer to the data - libcurl will not copy */
		curl_easy_setopt(curl, CURLOPT_POSTFIELDS, jsonString);
		CURLcode res = curl_easy_perform(curl);

		if (res != CURL_OK)
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
				if (responseCode != 200){
					printf("Something went wrong while posting, status code: %d \n", responseCode)
				}
			 }
		}
		curl_easy_cleanup(curl);
	}
}

const char * readConfigFile()
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
			url = malloc(strlen(cJSON_GetObjectItem(root, "url")->valuestring));
			sprintf(url, "%s", cJSON_GetObjectItem(root, "url")->valuestring);
			cJSON_Delete(root);
		}
	}

	return url;
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
	postToDatabaseServer("order/insert", cJSON_Print(order));

	return 0;
}

/**
 * Inserts pair orderId and productionStation into the table OrderAllocation
 * Sets status of the order in table Orders to 'IN_PRODUCTION'
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	cJSON *orderAllocation = cJSON_CreateObject();
	cJSON_AddNumberToObject(orderAllocation, "OrderID", orderID);
	cJSON_AddNumberToObject(orderAllocation, "ProductionStationID", productionStationID);
	postToDatabaseServer(cJSON_Print(orderAllocation));

	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "OrderID", orderID);
	cJSON_AddStringToObject(order, "OrderStatus", "IN_PRODUCTION");
	postToDatabaseServer("productionStation/assignOrder", cJSON_Print(order));

	return 0;
}

/**
 * Sets orderStatus to DONE
 */
int deleteOrder(int orderID)
{
	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "orderID", orderID);
	postToDatabaseServer("order/done", cJSON_Print(order));

	return 0;
}


/**
 * Retrieve the ingredientID for the order with the given id.
 */
int getOrderIngredientID(int orderID)
{
	//TODO get ingredient
	int ingredientID = getFromDatabaseServer("order/ingredient", cJSON_Print(update));
	printf("Successfully retrieved ingredientID %d for order %d.\n", ingredientID, orderID);
	return ingredientID;
}

/**
 * Retrieve the amount for the order with the given id.
 */
int getOrderAmount(int orderID)
{
	//TODO get amount
	int orderAmount = getFromDatabaseServer("order/amount", cJSON_Print(update));
	printf("Successfully retrieved amount %d for order %d.\n", orderAmount, orderID);
	return orderAmount;
}

/**
 * Searches an order without a production station assigned
 */
int searchOrder(int searchingPS, int producibleIngredients)
{
	//TODO search order
	cJSON *update;
	update = cJSON_CreateObject();
	cJSON_AddItemToObject(update, "update", cJSON_CreateString("searchOrder"));
	cJSON *changedTables;
	cJSON_AddItemToObject(update, "changedTables", changedTables = cJSON_CreateObject());
	cJSON *productionStations;
	cJSON_AddItemToObject(changedTables, "ProductionStations", productionStations = cJSON_CreateObject());
	cJSON_AddNumberToObject(productionStations, "ProductionStationID", searchingPS);

	int orderID = getFromDatabaseServer("order/search", cJSON_Print(update));

	return orderID;
}


/**
 * Tells the server we have recently seen the productionStation with the given ID
 */
int heartBeatProductionStation(int productionStationID)
{
	cJSON *heartBeat = cJSON_CreateObject();
	cJSON_AddNumberToObject(heartBeat, "productionStationID", productionStationID);
    postToDatabaseServer("productionStation/heartBeat", cJSON_Print(heartBeat));

	return 0;
}

