/** \mainpage Documentation of the generated Code for ECU: approacherR2
 * 	The generated Code is documented for Doxygen @link http://www.doxygen.org @endlink.
 * 	Thus, a useful Documentation can be generated via Doxygen in html, latex,...!
 *
 *
 * \tableofcontents
 *
*/
//general includes
#include <stdio.h>
#include <stdlib.h>
//nxtOSEK includes
#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "Configuration.h"
#include "lib/NetworkInterface.h"
#include "Middleware/NetworkInterfaceImplementation.h"
#include "Middleware/MiddlewareCore.h"


//declaring the middleware
Middleware *mw;


//declare used OSEK tasks and counter
DeclareTask(Task_Main);
DeclareTask(Task_initModel);
DeclareTask(Task_MsgExchange);
DeclareTask(Task_approacherCommunicatorComponent);
DeclareTask(Task_approacherColorComponent);




/* nxtOSEK hook to be invoked from an ISR in category 2 */
void user_1ms_isr_type2(void){ /* do nothing */ }

/* LEJOS OSEK hooks */
void ecrobot_device_initialize()
{
//initialize all network interfaces
networkInterface_VirtualBluetoothPort_init();
networkInterface_VirtualWifiPort_init();
networkInterface_UsbPort_init();
networkInterface_InputPort4_init();

//initialize sensors and actors
	approacherColor_color_InitApi();
}
void ecrobot_device_terminate()
{
}
TASK(Task_initModel){
	mw = Middleware_create();
	configureApproacherR2CIC();
	//initialize model
	initializeApproacherR2CIC();
//initialize all network interfaces
NetworkInterface_init(mw->intern, NetworkInterface_intern_init, NetworkInterface_intern_send, NetworkInterface_intern_receive);
	NetworkInterface_init(mw->virtualBluetoothPort,networkInterface_VirtualBluetoothPort_init, networkInterface_VirtualBluetoothPort_send, networkInterface_VirtualBluetoothPort_receive);
	NetworkInterface_init(mw->VirtualWifiPort,networkInterface_VirtualWifiPort_init, networkInterface_VirtualWifiPort_send, networkInterface_VirtualWifiPort_receive);
	NetworkInterface_init(mw->usbPort,networkInterface_UsbPort_init, networkInterface_UsbPort_send, networkInterface_UsbPort_receive);
	NetworkInterface_init(mw->inputPort4,networkInterface_InputPort4_init, networkInterface_InputPort4_send, networkInterface_InputPort4_receive);
ChainTask(Task_Main);
}


TASK(Task_Main){

	//Activate a task per component instance
		ActivateTask(Task_approacherCommunicatorComponent);
		ActivateTask(Task_approacherColorComponent);
	ActivateTask(Task_MsgExchange);


TerminateTask();
}

TASK(Task_approacherCommunicatorComponent){
	ApproacherCommunicatorComponent_processStep(mw->approacherCommunicatorComponent);
	TerminateTask();
}	
TASK(Task_approacherColorComponent){
	ColorComponent_processStep(mw->approacherColorComponent);
	TerminateTask();
}	

TASK(Task_MsgExchange){
	    MW_NIsendMessages();
		MW_NIreceiveMessages();
        MW_deliverReceivedMessages();
ChainTask(Task_Main);
}
