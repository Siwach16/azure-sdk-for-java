// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.dashboard.models.ManagedGrafanaProperties;
import com.azure.resourcemanager.dashboard.models.ManagedIdentity;
import com.azure.resourcemanager.dashboard.models.ResourceSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The grafana resource type. */
@Fluent
public final class ManagedGrafanaInner extends Resource {
    /*
     * The Sku of the grafana resource.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * Properties specific to the grafana resource.
     */
    @JsonProperty(value = "properties")
    private ManagedGrafanaProperties properties;

    /*
     * The managed identity of the grafana resource.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * The system meta data relating to this grafana resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the sku property: The Sku of the grafana resource.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Sku of the grafana resource.
     *
     * @param sku the sku value to set.
     * @return the ManagedGrafanaInner object itself.
     */
    public ManagedGrafanaInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: Properties specific to the grafana resource.
     *
     * @return the properties value.
     */
    public ManagedGrafanaProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties specific to the grafana resource.
     *
     * @param properties the properties value to set.
     * @return the ManagedGrafanaInner object itself.
     */
    public ManagedGrafanaInner withProperties(ManagedGrafanaProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The managed identity of the grafana resource.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity of the grafana resource.
     *
     * @param identity the identity value to set.
     * @return the ManagedGrafanaInner object itself.
     */
    public ManagedGrafanaInner withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this grafana resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedGrafanaInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedGrafanaInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
