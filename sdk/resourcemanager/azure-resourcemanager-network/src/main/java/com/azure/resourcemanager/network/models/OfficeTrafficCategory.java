// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OfficeTrafficCategory. */
public final class OfficeTrafficCategory extends ExpandableStringEnum<OfficeTrafficCategory> {
    /** Static value Optimize for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory OPTIMIZE = fromString("Optimize");

    /** Static value OptimizeAndAllow for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory OPTIMIZE_AND_ALLOW = fromString("OptimizeAndAllow");

    /** Static value All for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory ALL = fromString("All");

    /** Static value None for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory NONE = fromString("None");

    /**
     * Creates or finds a OfficeTrafficCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OfficeTrafficCategory.
     */
    @JsonCreator
    public static OfficeTrafficCategory fromString(String name) {
        return fromString(name, OfficeTrafficCategory.class);
    }

    /**
     * Gets known OfficeTrafficCategory values.
     *
     * @return known OfficeTrafficCategory values.
     */
    public static Collection<OfficeTrafficCategory> values() {
        return values(OfficeTrafficCategory.class);
    }
}
