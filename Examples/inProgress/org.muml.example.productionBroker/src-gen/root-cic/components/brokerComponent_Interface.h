	/**
 * @file 
 * @author generated by Fraunhofer IEM
 * @brief Specification of Component of Type: Broker
 * @details This files contains a description of the Broker in form of the BrokerComponent
 * 			and all methods which can be executed on an Instance of this Component
 */
		#ifndef BROKERCOMPONENT_INTERFACE_H_
		#define BROKERCOMPONENT_INTERFACE_H_

#ifdef __cplusplus
  extern "C" {
#endif
				// Library
				#include "../types/standardTypes.h"
				#include "../types/customTypes.h"
					#include "../lib/port.h"
					#include "../messages/Messages.h"
			
					
					
				
			
				#include "../lib/clock.h"
			#include "../lib/Debug.h"
			#include "../lib/MiddlewareTypes.h"
			#include "../Middleware/MiddlewareCore.h"
				
			
	
			/**
			 * @brief Forward Declaration of the struct BrokerBrokerStateChart which describes the behavior of BrokerComponent
			 * 
			 */
			 typedef struct BrokerBrokerStateChart BrokerBrokerStateChart;
			/**
			 * @brief Forward Declaration of the struct BrokerComponent
			 */
				typedef struct BrokerComponent BrokerComponent;
			
			/**
			*  
			* @brief Description for a ComponentInstance of Type: Broker
			* @details This struct describes a specific Component Instances which is typed over the Component: Broker
			*/
			struct BrokerComponent {
			
			
						BrokerBrokerStateChart* stateChart;	/**< The BrokerBrokerStateChart of the Component Broker */
				
							Port* getOrderPort; /**< A Pointer to the Component's Port: getOrder */
							Port* brokerForPSPortPort; /**< A Pointer to the Component's Port: brokerForPSPort */
			
						
					
					
			
					BrokerComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
					
				};
		
			/**
			* @brief This Methodes intializes the Component: Broker
			* @details All struct members of the struct BrokerComponent are initialized
			* 
			* @param component The BrokerComponent to be initialized
			*/	
				void BrokerComponent_initialize(BrokerComponent* component);
	
			/**
			* @brief Creates a Instance of the Component: Broker
			* @details Allocates Memory for the struct BrokerComponent
			* @return A Pointer to the new created BrokerComponent
			*/
				BrokerComponent* BrokerComponent_create();
	
			/**
			 * @brief Destroys a Component: Broker
			 * @details Frees the Memory for the struct BrokerComponent
			 * 
			* @param component The specific BrokerComponent to be destroyed
			 */
				void BrokerComponent_destroy(BrokerComponent* component);
		
			
			/**
			* @brief Executes the next Step of the behavior an Instance of the Component: Broker
			* @details The behavior of the Component:  Broker is executed.
			*			
			* @param component The BrokerComponent whose behavior shall be checked
			*/
				void BrokerComponent_processStep(BrokerComponent* component);
		
			/**
					 * @brief Get the Port: getOrder of an Instance of the Component: Broker
					 * @details The Pointer BrokerComponent::getOrderPort is returned
					 * 
					 * @param component The specific Instance BrokerComponent  of the Component: Broker whose Port shall be returned
					 * @return A Pointer to the Port getOrder of the struct BrokerComponent
					 */
					Port* BrokerComponent_getgetOrder(BrokerComponent* component);
			/**
					 * @brief Get the Port: brokerForPSPort of an Instance of the Component: Broker
					 * @details The Pointer BrokerComponent::brokerForPSPortPort is returned
					 * 
					 * @param component The specific Instance BrokerComponent  of the Component: Broker whose Port shall be returned
					 * @return A Pointer to the Port brokerForPSPort of the struct BrokerComponent
					 */
					Port* BrokerComponent_getbrokerForPSPort(BrokerComponent* component);
		
			

		
/**
 * @file 
 * @author generated by Fraunhofer IEM
 * @brief Specification of Realtime-StateChart: BrokerBroker
 * @details This files contains the description of the Realtime-StateChart: BrokerBroker and its behavior which is executed
 */
	//ENUM
	/** 
	 * @brief This enum represents the States of the Realtime-StateChart: BrokerBroker
	 */
		typedef enum {
			BROKERBROKER_INACTIVE,
			STATE_BROKERINIT /**< Represents the State: STATE_BROKERINIT of the Realtime-StateChart: BrokerBroker */
			,
					STATE_BROKERGETORDERINIT /**< Represents the State: STATE_BROKERGETORDERINIT of the Realtime-StateChart: BrokerGetOrderGetOrderStatechart */
			,		STATE_BROKERGETORDERMANAGEORDERS /**< Represents the State: STATE_BROKERGETORDERMANAGEORDERS of the Realtime-StateChart: BrokerGetOrderGetOrderStatechart */
			,		STATE_BROKERBROKERFORPSPORTINIT /**< Represents the State: STATE_BROKERBROKERFORPSPORTINIT of the Realtime-StateChart: BrokerBrokerForPSPortOrderBrokerforPsRTSC */
			,		STATE_BROKERBROKERFORPSPORTPROCESSORDERREQUEST /**< Represents the State: STATE_BROKERBROKERFORPSPORTPROCESSORDERREQUEST of the Realtime-StateChart: BrokerBrokerForPSPortOrderBrokerforPsRTSC */
			,		STATE_BROKERBROKERFORPSPORTRESET /**< Represents the State: STATE_BROKERBROKERFORPSPORTRESET of the Realtime-StateChart: BrokerBrokerForPSPortOrderBrokerforPsRTSC */	
		}BrokerBrokerState;
	
	
		/**
		 * 
		 * @brief Description of the Realtime-StateChart: BrokerBroker
		 * @details This struct represents the  Realtime-StateChart: BrokerBroker and its States
		 */
	struct BrokerBrokerStateChart {	
			BrokerComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: BrokerComponent , which has this Realtime-StateChart as its behavior */			
	
	
						BrokerBrokerState currentStateOfBrokerBroker;/**< The current State of the Realtime-StateChart: BrokerBroker */
	
				BrokerBrokerState currentStateOfBrokerGetOrderGetOrderStatechart;/**< Represents the state of region: BrokerGetOrderGetOrderStatechart */
				BrokerBrokerState currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC;/**< Represents the state of region: BrokerBrokerForPSPortOrderBrokerforPsRTSC */
	
			bool_t BrokerBroker_isExecutable;/**< Execution Verifier of RTSC: BrokerBroker. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t BrokerGetOrderGetOrderStatechart_isExecutable;/**< Execution Verifier of RTSC: BrokerGetOrderGetOrderStatechart. This variable is used to ensure that a RTSC is executed only once per execution cycle */
				bool_t BrokerBrokerForPSPortOrderBrokerforPsRTSC_isExecutable;/**< Execution Verifier of RTSC: BrokerBrokerForPSPortOrderBrokerforPsRTSC. This variable is used to ensure that a RTSC is executed only once per execution cycle */
		
	
	
		
	
				int32_T testLatestOrderIDGlobal; /**< The Realtime-StateChart Variable: testLatestOrderIDGlobal of Type: int32; */
				int32_T testLatestOrderID; /**< The Realtime-StateChart Variable: testLatestOrderID of Type: int32; */
				int32_T currentPsID; /**< The Realtime-StateChart Variable: currentPsID of Type: int32; */
				int32_T provideOrderID; /**< The Realtime-StateChart Variable: provideOrderID of Type: int32; */
				int32_T provideAmount; /**< The Realtime-StateChart Variable: provideAmount of Type: int32; */
				int32_T provideIncredientID; /**< The Realtime-StateChart Variable: provideIncredientID of Type: int32; */
	
	
	
			
	
		} ;

//METHOD STUBS
	/**
	 * @brief Creates an Instance of the Realtime-StateChart: BrokerBroker
	 * @details Allocates Memory for the struct BrokerBrokerStateChart
	 * 
	 * @param parentComponent An Instance of the Component: BrokerComponent which behavior is described via this Realtime-StateChart
	 * @return A Pointer to the new created BrokerBrokerStateChart
	 */
		BrokerBrokerStateChart* BrokerBrokerStateChart_create(BrokerComponent* parentComponent);
	/**
	 * @brief Initializes an Instance of the Realtime-StateChart: BrokerBroker
	 * @details All struct members of the struct BrokerBrokerStateChart are initialized,
	 *			and all Regions of the Realtime-StateChart are initialized, too.
	 * 
	 * @param rtsc The specific BrokerBrokerStateChart to be initialized
	 */
		void BrokerBrokerStateChart_initialize(BrokerBrokerStateChart* rtsc);
	/**
	 * @brief Initializes the Region: BrokerGetOrderGetOrderStatechart of the Realtime-StateChart: BrokerBroker
	 * @details The Member BrokerBrokerStateChart::currentStateOfBrokerGetOrderGetOrderStatechart is initialized
	 * 
	 * @param stateChart The specific BrokerBrokerStateChart whose Region shall be initialized
	 */
	
		void initializeBrokerGetOrderGetOrderStatechartRegion(BrokerBrokerStateChart* stateChart);
	/**
	 * @brief Initializes the Region: BrokerBrokerForPSPortOrderBrokerforPsRTSC of the Realtime-StateChart: BrokerBroker
	 * @details The Member BrokerBrokerStateChart::currentStateOfBrokerBrokerForPSPortOrderBrokerforPsRTSC is initialized
	 * 
	 * @param stateChart The specific BrokerBrokerStateChart whose Region shall be initialized
	 */
	
		void initializeBrokerBrokerForPSPortOrderBrokerforPsRTSCRegion(BrokerBrokerStateChart* stateChart);
	/**
	 * @brief Destroys the Realtime-StateChart: BrokerBroker
	 * @details Frees the Memory for the struct BrokerBrokerStateChart
	 * 
	 * @param rtsc The specific BrokerBrokerStateChart to be destroyed
	 */	
		void BrokerBrokerStateChart_destroy(BrokerBrokerStateChart* rtsc);		
	/**
	 * @brief Executes the next Step of the Realtime-StateChart: BrokerBroker
	 * 
	 * @param rtsc The specific BrokerBrokerStateChart to be executed
	 */	
		void BrokerBrokerStateChart_processStep(BrokerBrokerStateChart* rtsc);

	/**
	 * @brief Leaves the Region: getOrderStatechart of the Realtime-StateChart: BrokerBroker
	 * @details This method is called, whenever a the Region: getOrderStatechart is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific BrokerBrokerStateChart whose Region: getOrderStatechart shall be exit
	 */
		void BrokerGetOrderGetOrderStatechartStateChart_exit(BrokerBrokerStateChart* rtsc);
	/**
	 * @brief Leaves the Region: orderBrokerforPsRTSC of the Realtime-StateChart: BrokerBroker
	 * @details This method is called, whenever a the Region: orderBrokerforPsRTSC is left.
	 * 			The correct State is set and all Exit-Events are executed.
	 *
	 * @param rtsc The specific BrokerBrokerStateChart whose Region: orderBrokerforPsRTSC shall be exit
	 */
		void BrokerBrokerForPSPortOrderBrokerforPsRTSCStateChart_exit(BrokerBrokerStateChart* rtsc);
			
	/**
	 * @brief Returns wether the Realtime-StateChart: BrokerBroker is in a specific State
	 * 
	 * @param rtsc The specific Realtime-StateChart: BrokerBrokerStateChart
	 * @param state One of the States of the Enum: BrokerBrokerState
	 * 
	 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
	 */	
		bool_t BrokerBrokerStateChart_isInState(BrokerBrokerStateChart* rtsc, BrokerBrokerState state);
	

//RTSC internal operations









#ifdef __cplusplus
  }
#endif
		#endif /* BROKERCOMPONENT_INTERFACE_H_ */


