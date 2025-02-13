// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Identifies the unique system identifier for each Azure resource. */
@Fluent
public final class Sku {
    /*
     * The Sku name.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The Sku tier.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The sku family
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * The sku size
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * The sku capacity
     */
    @JsonProperty(value = "capacity")
    private String capacity;

    /**
     * Get the name property: The Sku name.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The Sku name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The Sku tier.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The Sku tier.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the family property: The sku family.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: The sku family.
     *
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the size property: The sku size.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The sku size.
     *
     * @param size the size value to set.
     * @return the Sku object itself.
     */
    public Sku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the capacity property: The sku capacity.
     *
     * @return the capacity value.
     */
    public String capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The sku capacity.
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sku.class);
}
