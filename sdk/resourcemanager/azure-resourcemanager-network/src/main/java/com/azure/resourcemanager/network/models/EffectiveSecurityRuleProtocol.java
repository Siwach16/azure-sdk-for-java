// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EffectiveSecurityRuleProtocol. */
public final class EffectiveSecurityRuleProtocol extends ExpandableStringEnum<EffectiveSecurityRuleProtocol> {
    /** Static value Tcp for EffectiveSecurityRuleProtocol. */
    public static final EffectiveSecurityRuleProtocol TCP = fromString("Tcp");

    /** Static value Udp for EffectiveSecurityRuleProtocol. */
    public static final EffectiveSecurityRuleProtocol UDP = fromString("Udp");

    /** Static value All for EffectiveSecurityRuleProtocol. */
    public static final EffectiveSecurityRuleProtocol ALL = fromString("All");

    /**
     * Creates or finds a EffectiveSecurityRuleProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EffectiveSecurityRuleProtocol.
     */
    @JsonCreator
    public static EffectiveSecurityRuleProtocol fromString(String name) {
        return fromString(name, EffectiveSecurityRuleProtocol.class);
    }

    /**
     * Gets known EffectiveSecurityRuleProtocol values.
     *
     * @return known EffectiveSecurityRuleProtocol values.
     */
    public static Collection<EffectiveSecurityRuleProtocol> values() {
        return values(EffectiveSecurityRuleProtocol.class);
    }
}
