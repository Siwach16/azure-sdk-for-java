// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AfdCertificateType. */
public final class AfdCertificateType extends ExpandableStringEnum<AfdCertificateType> {
    /** Static value CustomerCertificate for AfdCertificateType. */
    public static final AfdCertificateType CUSTOMER_CERTIFICATE = fromString("CustomerCertificate");

    /** Static value ManagedCertificate for AfdCertificateType. */
    public static final AfdCertificateType MANAGED_CERTIFICATE = fromString("ManagedCertificate");

    /** Static value AzureFirstPartyManagedCertificate for AfdCertificateType. */
    public static final AfdCertificateType AZURE_FIRST_PARTY_MANAGED_CERTIFICATE =
        fromString("AzureFirstPartyManagedCertificate");

    /**
     * Creates or finds a AfdCertificateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AfdCertificateType.
     */
    @JsonCreator
    public static AfdCertificateType fromString(String name) {
        return fromString(name, AfdCertificateType.class);
    }

    /** @return known AfdCertificateType values. */
    public static Collection<AfdCertificateType> values() {
        return values(AfdCertificateType.class);
    }
}
