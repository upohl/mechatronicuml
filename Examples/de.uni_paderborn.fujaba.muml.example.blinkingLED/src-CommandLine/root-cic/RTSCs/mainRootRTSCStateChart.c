
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include "../Middleware/GlobalIdentifier.h"
		#include "mainRootRTSCStateChart.h"
		


		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeMainInitRegion(MainRootRTSCStateChart* stateChart) {
			Clock_reset(stateChart->mainInitChangingClockMainInitClock);
		
			stateChart->currentStateOfMainInit = STATE_MAININITLED_OFF;
		
			// execute entry actions
			stateChart->LED_voltage = 0;
			;
		
			Clock_reset(stateChart->mainInitChangingClockMainInitClock);
		
			stateChart->MainInit_isExecutable = true;
		
		}
		
		void MainRootRTSCStateChart_initialize(MainRootRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfMainRootRTSC = STATE_MAININIT;
		
			// execute entry actions
			// nothing to do
		
			initializeMainInitRegion(stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		MainRootRTSCStateChart* MainRootRTSCStateChart_create(
				MainComponent* parentComponent) {
			MainRootRTSCStateChart* stateChart = (MainRootRTSCStateChart*) malloc(
					sizeof(MainRootRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
				if (stateChart->parentComponent != NULL) {
					MainRootRTSCStateChart_initialize(stateChart);
				} else {
		
					MainRootRTSCStateChart_destroy(stateChart);
					stateChart = NULL;
				}
			} else {
		
			}
			return stateChart;
		}
		

			void MainRootRTSCStateChart_destroy(MainRootRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
		
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	

		
		void MainInitStateChart_processStep(MainRootRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfMainInit) {
			case STATE_MAININITLED_OFF:
				if (Clock_getTime(stateChart->mainInitChangingClockMainInitClock)
						>= 500 * 1.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfMainInit = STATE_MAININITLED_ON;
		#ifdef DEBUG
					printDebugInformation("currentStateOfMainInit switched state to STATE_MAININITLED_ON" );
		#endif		
		
					// execute entry actions
					stateChart->LED_voltage = 1;
					;
		
					Clock_reset(stateChart->mainInitChangingClockMainInitClock);
		
				} else {
		
				}
				break;
			case STATE_MAININITLED_ON:
				if (Clock_getTime(stateChart->mainInitChangingClockMainInitClock)
						>= 500 * 1.0
		
						) {
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					//release all created sent events
					// change the state
					stateChart->currentStateOfMainInit = STATE_MAININITLED_OFF;
		#ifdef DEBUG
					printDebugInformation("currentStateOfMainInit switched state to STATE_MAININITLED_OFF" );
		#endif		
		
					// execute entry actions
					stateChart->LED_voltage = 0;
					;
		
					Clock_reset(stateChart->mainInitChangingClockMainInitClock);
		
				} else {
		
				}
				break;
			default:
				break;
			}
			stateChart->MainInit_isExecutable = false;
		}
		
		void MainRootRTSCStateChart_processStep(MainRootRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfMainRootRTSC) {
			case STATE_MAININIT:
		
				if (stateChart->MainInit_isExecutable)
					MainInitStateChart_processStep(stateChart);
		
				break;
			default:
				break;
			}
			stateChart->MainRootRTSC_isExecutable = false;
		}
		
		
		void MainInitStateChart_exit(MainRootRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfMainInit) {
			case STATE_MAININITLED_OFF:
				// nothing to do
		
				break;
			case STATE_MAININITLED_ON:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		bool_t MainRootRTSCStateChart_isInState(MainRootRTSCStateChart* stateChart,
				MainRootRTSCState state) {
			return (stateChart->currentStateOfMainInit == state);
		
		}
		
		bool_t MainRootRTSCStateChart_isTerminated(MainRootRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		

