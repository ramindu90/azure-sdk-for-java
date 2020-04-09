// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.DataMaskingState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataMaskingPolicy model. */
@JsonFlatten
@Fluent
public class DataMaskingPolicyInner extends ProxyResource {
    /*
     * The location of the data masking policy.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The kind of data masking policy. Metadata, used for Azure portal.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * The state of the data masking policy.
     */
    @JsonProperty(value = "properties.dataMaskingState")
    private DataMaskingState dataMaskingState;

    /*
     * The list of the exempt principals. Specifies the semicolon-separated
     * list of database users for which the data masking policy does not apply.
     * The specified users receive data results without masking for all of the
     * database queries.
     */
    @JsonProperty(value = "properties.exemptPrincipals")
    private String exemptPrincipals;

    /*
     * The list of the application principals. This is a legacy parameter and
     * is no longer used.
     */
    @JsonProperty(value = "properties.applicationPrincipals", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationPrincipals;

    /*
     * The masking level. This is a legacy parameter and is no longer used.
     */
    @JsonProperty(value = "properties.maskingLevel", access = JsonProperty.Access.WRITE_ONLY)
    private String maskingLevel;

    /**
     * Get the location property: The location of the data masking policy.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the kind property: The kind of data masking policy. Metadata, used for Azure portal.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the dataMaskingState property: The state of the data masking policy.
     *
     * @return the dataMaskingState value.
     */
    public DataMaskingState dataMaskingState() {
        return this.dataMaskingState;
    }

    /**
     * Set the dataMaskingState property: The state of the data masking policy.
     *
     * @param dataMaskingState the dataMaskingState value to set.
     * @return the DataMaskingPolicyInner object itself.
     */
    public DataMaskingPolicyInner withDataMaskingState(DataMaskingState dataMaskingState) {
        this.dataMaskingState = dataMaskingState;
        return this;
    }

    /**
     * Get the exemptPrincipals property: The list of the exempt principals. Specifies the semicolon-separated list of
     * database users for which the data masking policy does not apply. The specified users receive data results without
     * masking for all of the database queries.
     *
     * @return the exemptPrincipals value.
     */
    public String exemptPrincipals() {
        return this.exemptPrincipals;
    }

    /**
     * Set the exemptPrincipals property: The list of the exempt principals. Specifies the semicolon-separated list of
     * database users for which the data masking policy does not apply. The specified users receive data results without
     * masking for all of the database queries.
     *
     * @param exemptPrincipals the exemptPrincipals value to set.
     * @return the DataMaskingPolicyInner object itself.
     */
    public DataMaskingPolicyInner withExemptPrincipals(String exemptPrincipals) {
        this.exemptPrincipals = exemptPrincipals;
        return this;
    }

    /**
     * Get the applicationPrincipals property: The list of the application principals. This is a legacy parameter and is
     * no longer used.
     *
     * @return the applicationPrincipals value.
     */
    public String applicationPrincipals() {
        return this.applicationPrincipals;
    }

    /**
     * Get the maskingLevel property: The masking level. This is a legacy parameter and is no longer used.
     *
     * @return the maskingLevel value.
     */
    public String maskingLevel() {
        return this.maskingLevel;
    }
}
