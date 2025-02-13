// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Salesforce. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Salesforce")
@JsonFlatten
@Fluent
public class SalesforceLinkedService extends LinkedService {
    /*
     * The URL of Salesforce instance. Default is
     * 'https://login.salesforce.com'. To copy data from sandbox, specify
     * 'https://test.salesforce.com'. To copy data from custom domain, specify,
     * for example, 'https://[domain].my.salesforce.com'. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.environmentUrl")
    private Object environmentUrl;

    /*
     * The username for Basic authentication of the Salesforce instance. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password for Basic authentication of the Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The security token is optional to remotely access Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.securityToken")
    private SecretBase securityToken;

    /*
     * The Salesforce API version used in ADF. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.apiVersion")
    private Object apiVersion;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @return the environmentUrl value.
     */
    public Object getEnvironmentUrl() {
        return this.environmentUrl;
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService setEnvironmentUrl(Object environmentUrl) {
        this.environmentUrl = environmentUrl;
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @param password the password value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the securityToken property: The security token is optional to remotely access Salesforce instance.
     *
     * @return the securityToken value.
     */
    public SecretBase getSecurityToken() {
        return this.securityToken;
    }

    /**
     * Set the securityToken property: The security token is optional to remotely access Salesforce instance.
     *
     * @param securityToken the securityToken value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService setSecurityToken(SecretBase securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     *
     * @return the apiVersion value.
     */
    public Object getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     *
     * @param apiVersion the apiVersion value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService setApiVersion(Object apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
