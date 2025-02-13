// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.Context;

/** Samples for AvailabilityGroupListeners Get. */
public final class AvailabilityGroupListenersGetSamples {
    /*
     * x-ms-original-file: specification/sqlvirtualmachine/resource-manager/Microsoft.SqlVirtualMachine/preview/2021-11-01-preview/examples/GetAvailabilityGroupListener.json
     */
    /**
     * Sample code: Gets an availability group listener.
     *
     * @param manager Entry point to SqlVirtualMachineManager.
     */
    public static void getsAnAvailabilityGroupListener(
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager) {
        manager.availabilityGroupListeners().getWithResponse("testrg", "testvmgroup", "agl-test", null, Context.NONE);
    }
}
