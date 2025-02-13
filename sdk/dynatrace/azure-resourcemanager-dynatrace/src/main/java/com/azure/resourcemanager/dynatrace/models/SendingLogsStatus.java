// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SendingLogsStatus. */
public final class SendingLogsStatus extends ExpandableStringEnum<SendingLogsStatus> {
    /** Static value Enabled for SendingLogsStatus. */
    public static final SendingLogsStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for SendingLogsStatus. */
    public static final SendingLogsStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SendingLogsStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SendingLogsStatus.
     */
    @JsonCreator
    public static SendingLogsStatus fromString(String name) {
        return fromString(name, SendingLogsStatus.class);
    }

    /**
     * Gets known SendingLogsStatus values.
     *
     * @return known SendingLogsStatus values.
     */
    public static Collection<SendingLogsStatus> values() {
        return values(SendingLogsStatus.class);
    }
}
