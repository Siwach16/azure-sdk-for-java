// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of ProtectedItem resources. */
@Fluent
public final class ProtectedItemResourceList extends ResourceList {
    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<ProtectedItemResourceInner> value;

    /**
     * Get the value property: List of resources.
     *
     * @return the value value.
     */
    public List<ProtectedItemResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     *
     * @param value the value value to set.
     * @return the ProtectedItemResourceList object itself.
     */
    public ProtectedItemResourceList withValue(List<ProtectedItemResourceInner> value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectedItemResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
