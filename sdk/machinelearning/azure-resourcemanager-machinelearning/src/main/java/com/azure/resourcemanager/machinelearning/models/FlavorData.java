// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The FlavorData model. */
@Fluent
public final class FlavorData {
    /*
     * Model flavor-specific data.
     */
    @JsonProperty(value = "data")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> data;

    /**
     * Get the data property: Model flavor-specific data.
     *
     * @return the data value.
     */
    public Map<String, String> data() {
        return this.data;
    }

    /**
     * Set the data property: Model flavor-specific data.
     *
     * @param data the data value to set.
     * @return the FlavorData object itself.
     */
    public FlavorData withData(Map<String, String> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
