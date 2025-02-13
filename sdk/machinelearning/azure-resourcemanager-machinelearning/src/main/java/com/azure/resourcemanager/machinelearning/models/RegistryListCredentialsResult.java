// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RegistryListCredentialsResult model. */
@Fluent
public final class RegistryListCredentialsResult {
    /*
     * The location property.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The username property.
     */
    @JsonProperty(value = "username", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /*
     * The passwords property.
     */
    @JsonProperty(value = "passwords")
    private List<Password> passwords;

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the username property: The username property.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Get the passwords property: The passwords property.
     *
     * @return the passwords value.
     */
    public List<Password> passwords() {
        return this.passwords;
    }

    /**
     * Set the passwords property: The passwords property.
     *
     * @param passwords the passwords value to set.
     * @return the RegistryListCredentialsResult object itself.
     */
    public RegistryListCredentialsResult withPasswords(List<Password> passwords) {
        this.passwords = passwords;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (passwords() != null) {
            passwords().forEach(e -> e.validate());
        }
    }
}
