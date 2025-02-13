// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.OperationDisplay;
import com.azure.resourcemanager.network.models.OperationPropertiesFormatServiceSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network REST API operation definition. */
@Fluent
public final class OperationInner {
    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display metadata associated with the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Operation properties format.
     */
    @JsonProperty(value = "properties")
    private OperationPropertiesFormat innerProperties;

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Display metadata associated with the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display metadata associated with the operation.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the innerProperties property: Operation properties format.
     *
     * @return the innerProperties value.
     */
    private OperationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serviceSpecification property: Specification of the service.
     *
     * @return the serviceSpecification value.
     */
    public OperationPropertiesFormatServiceSpecification serviceSpecification() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceSpecification();
    }

    /**
     * Set the serviceSpecification property: Specification of the service.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withServiceSpecification(OperationPropertiesFormatServiceSpecification serviceSpecification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationPropertiesFormat();
        }
        this.innerProperties().withServiceSpecification(serviceSpecification);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
