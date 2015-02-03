
		////////////////////////////////////////////////////////////////////////////////
		// Includes
		////////////////////////////////////////////////////////////////////////////////
		#include <stdio.h>
		#include <stdlib.h>
		#include "../GlobalIdentifier.h"
		#include "rootapproacherDriverRTSCStateChart.h"
		
		



		
		////////////////////////////////////////////////////////////////////////////////
		// Initialization
		////////////////////////////////////////////////////////////////////////////////
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSCRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE;
		
			// execute entry actions
			// nothing to do
		
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSCRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSCRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_CHECKDISTANCE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behaviorRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behaviorRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behaviorRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behaviorRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(
					stateChart);
		}
		void initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmissionRegion(
				RootapproacherDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
			stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
			// execute entry actions
		
			Clock_reset(
					stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
		}
		
		void RootapproacherDriverRTSCStateChart_initialize(
				RootapproacherDriverRTSCStateChart* stateChart) {
			Clock_reset(
					stateChart->changeClock_ofcurrentStateOfRootapproacherDriverRTSCClock);
		
			stateChart->constVelFast = 18;
			stateChart->constVelSlow = 14;
			stateChart->Vel = stateChart->constVelSlow;
			stateChart->constChangeInterval = 3;
			stateChart->constBreakDistance = 20;
			stateChart->velocityL_apiValue = 0;
			stateChart->velocityR_apiValue = 0;
			stateChart->lineApproacher_apiValue = 0;
			stateChart->distance_apiValue = 150;
		
			stateChart->currentStateOfRootapproacherDriverRTSC =
					ROOTAPPROACHERDRIVERRTSC_INIT_STATE;
		
			// execute entry actions
		
			// nothing to do
		
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSCRegion(
					stateChart);
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSCRegion(
					stateChart);
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSCRegion(
					stateChart);
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behaviorRegion(
					stateChart);
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behaviorRegion(
					stateChart);
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behaviorRegion(
					stateChart);
			initializeROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behaviorRegion(
					stateChart);
		}
		
		

		////////////////////////////////////////////////////////////////////////////////
		// Construction and destruction
		////////////////////////////////////////////////////////////////////////////////
		RootapproacherDriverRTSCStateChart* RootapproacherDriverRTSCStateChart_create(
				ApproacherDriverComponent* parentComponent) {
			RootapproacherDriverRTSCStateChart* stateChart =
					(RootapproacherDriverRTSCStateChart*) malloc(
							sizeof(RootapproacherDriverRTSCStateChart));
			if (stateChart != NULL) {
				stateChart->parentComponent = parentComponent;
		
				stateChart->freeSyncChannel = SyncChannel_create();
				stateChart->fixSyncChannel = SyncChannel_create();
				/*
				 if (stateChart->parentComponent != NULL
				 && stateChart->freeSyncChannel != NULL				
				 && stateChart->fixSyncChannel != NULL				
				 ) {
				 RootapproacherDriverRTSCStateChart_initialize(stateChart);
				 } else {
				 fprintf(stderr, "Initialization of RootapproacherDriverRTSCStateChart failed\n");
		
				 RootapproacherDriverRTSCStateChart_destroy(stateChart);
				 stateChart = NULL;
				 }
				 } else {
				 fprintf(stderr, "Creation of RootapproacherDriverRTSCStateChart failed\n");
				 */}
			return stateChart;
		}
		

			void RootapproacherDriverRTSCStateChart_destroy(RootapproacherDriverRTSCStateChart* stateChart) {
				if(stateChart != NULL) {
					SyncChannel_destroy(stateChart->freeSyncChannel);
					SyncChannel_destroy(stateChart->fixSyncChannel);
		
					free(stateChart);
				}
			}
	
		////////////////////////////////////////////////////////////////////////////////
		// Processing the statechart
		////////////////////////////////////////////////////////////////////////////////
	
		static void verifySyncChannelsOfinit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			// fix synchronization channel
			if (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC
					== ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE
					&& Port_doesMessageExist(
							ApproacherDriverComponent_getlimiterP(
									stateChart->parentComponent),
							MESSAGE_FIXVELOCITYOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->fixSyncChannel);
			}
			if (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC
					== ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->fixSyncChannel);
			}
			// free synchronization channel
			if (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC
					== ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FIXED_STATE
					&& Port_doesMessageExist(
							ApproacherDriverComponent_getlimiterP(
									stateChart->parentComponent),
							MESSAGE_FREEVELOCITYOVERTAKINGMESSAGESMESSAGE)
		
							) {
				SyncChannel_enableSend(stateChart->freeSyncChannel);
			}
			if (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC
					== ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE
		
					) {
				SyncChannel_enableReceive(stateChart->freeSyncChannel);
			}
		}
		

		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSCStateChart_processStep(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE:
				if (SyncChannel_send((SyncChannel*) stateChart->fixSyncChannel)) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
							ApproacherDriverComponent_getlimiterP(
									stateChart->parentComponent),
							MESSAGE_FIXVELOCITYOVERTAKINGMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
					fflush (stdout);
		
					// execute exit actions
					// nothing to do
		
					// Transition Effects (incl. clock resets)
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
					free(mwMsg);
		
					//release all created sent events
					// change the state
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC =
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FIXED_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FIXED_STATE:
				if (SyncChannel_send((SyncChannel*) stateChart->freeSyncChannel)
		
				) {
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ApproacherDriverComponent_getlimiterP(stateChart->parentComponent),
		
					MESSAGE_FREEVELOCITYOVERTAKINGMESSAGESMESSAGE);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC =
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
					// execute do action
					// nothing to do
		
				}
				break;
			default:
				break;
			}
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSCStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE:
		
				if (Clock_getTime(
		
				stateChart->changeClock_ofcurrentStateOfRootapproacherDriverRTSCClock)
		
				>= stateChart->constChangeInterval * 1000.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					if (stateChart->Vel == stateChart->constVelSlow) {
		
						stateChart->Vel = stateChart->constVelFast;
		
					}
		
					else {
		
						stateChart->Vel = stateChart->constVelSlow;
		
					}
		
					;
		
					Clock_reset(
		
							stateChart->changeClock_ofcurrentStateOfRootapproacherDriverRTSCClock);
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (SyncChannel_receive(
		
				(SyncChannel*) stateChart->fixSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelSlow;
		
					;
		
				} else if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					updateMotors(stateChart->Vel, stateChart->lineApproacher_apiValue)
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE:
		
				if (SyncChannel_receive((SyncChannel*) stateChart->freeSyncChannel)
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else if (1
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE;
		
					// execute entry actions
		
					stateChart->Vel = stateChart->constVelSlow;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSCStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_CHECKDISTANCE_STATE:
		
				if (
		
				stateChart->distance_apiValue < stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_BREAK_STATE;
		
					// execute entry actions
		
					stateChart->Vel = 0;
		
					;
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_BREAK_STATE:
		
				if (
		
				stateChart->distance_apiValue < stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_BREAK_STATE;
		
					// execute entry actions
		
					stateChart->Vel = 0;
		
					;
		
				} else if (
		
				stateChart->distance_apiValue >= stateChart->constBreakDistance
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_CHECKDISTANCE_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 50 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Motor_velocity_messageapi_messageType_RepositoryMessage
		
					struct Motor_velocity_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_velocity_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_velocity_messageapi_messageType_RepositoryMessage));
		
					msg->_velocity_value = stateChart->velocityL_apiValue;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocityLPort->ID),
		
					MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
		
					msg);
		
					//printf("sent message of type %d",MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behaviorStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
		
				if (Clock_getTime(
		
						stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 50 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					//create new Parameter struct for Motor_velocity_messageapi_messageType_RepositoryMessage
		
					struct Motor_velocity_messageapi_messageType_RepositoryMessage * msg =
		
							(Motor_velocity_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Motor_velocity_messageapi_messageType_RepositoryMessage));
		
					msg->_velocity_value = stateChart->velocityR_apiValue;
		
					//send Message
		
					MW_sendMessage(
		
					MW_getTargetPortIDforIdentifier(
		
					stateChart->parentComponent->velocityRPort->ID),
		
					MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE,
		
					msg);
		
					//printf("sent message of type %d",MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE );
		
					fflush (stdout);
		
					//release all created received events
		
					//release all created sent events
		
					free(msg);
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->clockSending_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behaviorStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				ApproacherDriverComponent_getlineApproacher(
		
				stateChart->parentComponent),
		
				MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					ApproacherDriverComponent_getlineApproacher(
		
					stateChart->parentComponent),
		
					MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Line_lineLight_messageapi_messageType_RepositoryMessage * msg =
		
							(Line_lineLight_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Line_lineLight_messageapi_messageType_RepositoryMessage));
		
					Line_lineLight_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->lineApproacher_apiValue = msg->_lineLight_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 55 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				ApproacherDriverComponent_getlineApproacher(
		
				stateChart->parentComponent),
		
				MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ApproacherDriverComponent_getlineApproacher(
		
					stateChart->parentComponent),
		
					MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Line_lineLight_messageapi_messageType_RepositoryMessage * msg =
		
							(Line_lineLight_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Line_lineLight_messageapi_messageType_RepositoryMessage));
		
					Line_lineLight_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->lineApproacher_apiValue = msg->_lineLight_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behaviorStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
		
				if (Port_doesMessageExist(
		
				ApproacherDriverComponent_getdistance(
		
				stateChart->parentComponent),
		
				MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg =
		
					Port_receiveMessage(
		
					ApproacherDriverComponent_getdistance(
		
					stateChart->parentComponent),
		
					MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Distance_distance_messageapi_messageType_RepositoryMessage * msg =
		
							(Distance_distance_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Distance_distance_messageapi_messageType_RepositoryMessage));
		
					Distance_distance_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->distance_apiValue = msg->_distance_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else if (
		
				Clock_getTime(
		
						stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock)
		
				>= 55 * 1.0
		
				) {
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					// nothing to do
		
					// nothing to do			
		
					//release all created received events
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE;
		
					// execute entry actions
		
					// nothing to do
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
		
				if (Port_doesMessageExist(
		
				ApproacherDriverComponent_getdistance(
		
				stateChart->parentComponent),
		
				MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE)
		
				) {
		
					MiddlewareMessage* mwMsg = Port_receiveMessage(
		
					ApproacherDriverComponent_getdistance(stateChart->parentComponent),
		
					MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE);
		
					struct Distance_distance_messageapi_messageType_RepositoryMessage * msg =
		
							(Distance_distance_messageapi_messageType_RepositoryMessage*) malloc(
		
									sizeof(struct Distance_distance_messageapi_messageType_RepositoryMessage));
		
					Distance_distance_messageapi_messageType_RepositoryMessage_read_delimited_from(
		
					mwMsg->_mumlMsg, msg, 0);
		
					//printf("received message of type %d",mwMsg->_msgID );
		
					fflush (stdout);
		
					// execute exit actions
		
					// nothing to do
		
					// Transition Effects (incl. clock resets)
		
					stateChart->distance_apiValue = msg->_distance_value;
		
					;
		
					// nothing to do			
		
					//release all created received events
		
					free(msg);
		
					free(mwMsg);
		
					//release all created sent events
		
					// change the state
		
					stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission =
		
							ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE;
		
					// execute entry actions
		
					Clock_reset(
		
							stateChart->receiverTimeout_ofcurrentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionClock);
		
				} else {
		
					// execute do action
		
					// nothing to do
		
				}
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behaviorStateChart_processStep(
		
		RootapproacherDriverRTSCStateChart* stateChart) {
		
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior) {
		
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE:
		
				// execute do action
		
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_processStep(
		
				stateChart);
		
				break;
		
			default:
		
				break;
		
			}
		
		}
		
		void RootapproacherDriverRTSCStateChart_processStep(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfRootapproacherDriverRTSC) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE:
				// execute do action
				// nothing to do
		
				verifySyncChannelsOfinit(stateChart);
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behaviorStateChart_processStep(
						stateChart);
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behaviorStateChart_processStep(
						stateChart);
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behaviorStateChart_processStep(
						stateChart);
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behaviorStateChart_processStep(
						stateChart);
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSCStateChart_processStep(
						stateChart);
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSCStateChart_processStep(
						stateChart);
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSCStateChart_processStep(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		
		
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behaviorStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE:
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSCStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FREE_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_LIMITERPORTRTSC_LIMITERPORTRTSC_FIXED_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behaviorStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE:
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICRECEIVING_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_TIMEOUT_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behaviorStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE:
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSCStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_DRIVE_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVINGRTSC_APPROACHERDRIVINGRTSC_FIXEDSLOW_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSCStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_CHECKDISTANCE_STATE:
				// nothing to do
		
				break;
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPRACHERSAVEBREAKRTSC_APPRACHERSAVEBREAKRTSC_BREAK_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behaviorStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE:
				// nothing to do
		
				ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
						stateChart);
		
				break;
			default:
				break;
			}
		}
		void ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmissionStateChart_exit(
				RootapproacherDriverRTSCStateChart* stateChart) {
			switch (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission) {
			case ROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PERIODICTRANSMISSION_PERIODICTRANSMISSION_PERIODICSENDING_STATE:
				// nothing to do
		
				break;
			default:
				break;
			}
		}
				
			
		int_t RootapproacherDriverRTSCStateChart_isInState(
				RootapproacherDriverRTSCStateChart* stateChart,
				RootapproacherDriverRTSCState state) {
			return (stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityR_behavior_approacherDriver_velocityR_behavior
					== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_limiterPortRTSC_limiterPortRTSC
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_distance_behavior_approacherDriver_distance_behavior
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_APPROACHERDRIVER_LINEAPPROACHER_BEHAVIOR_LINEAPPROACHER_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_DISTANCE_BEHAVIOR_APPROACHERDRIVER_DISTANCE_BEHAVIOR_DISTANCE_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_velocityL_behavior_approacherDriver_velocityL_behavior
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDrivingRTSC_approacherDrivingRTSC
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_appracherSaveBreakRTSC_appracherSaveBreakRTSC
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_APPROACHERDRIVER_VELOCITYL_BEHAVIOR_VELOCITYL_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_approacherDriver_lineApproacher_behavior_approacherDriver_lineApproacher_behavior
							== state
					|| stateChart->currentStateOfROOTAPPROACHERDRIVERRTSC_INIT_STATE_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_APPROACHERDRIVER_VELOCITYR_BEHAVIOR_VELOCITYR_INITSTATE_STATE_PeriodicTransmission_PeriodicTransmission
							== state);
		
		}
		
		bool_t RootapproacherDriverRTSCStateChart_isTerminated(
				RootapproacherDriverRTSCStateChart* stateChart) {
			//TODO
			return true;
		}
		



