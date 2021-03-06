/**
 * @file 
 * @author Fraunhofer IPT-EM
 * @brief This file specifies the MessageBuffer, which are contained at the Components
 * @details  The MessageBuffer are used at the Components to store  MiddlewareMessage%s
 */
#ifndef DEBUG_H_
#define DEBUG_H_
#ifdef __cplusplus
  extern "C" {
#endif


#include "stdlib.h"
#include "stdio.h"
#include <time.h>

void printDebugInformation(char * debugInformation);


#ifdef __cplusplus
  }
#endif
#endif /* DEBUG_H_ */
