/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Active Directory Key Credential information.
 */
public class KeyCredentialInner {
    /**
     * Start date.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * End date.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * Key value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Key ID.
     */
    @JsonProperty(value = "keyId")
    private String keyId;

    /**
     * Usage. Acceptable values are 'Verify' and 'Sign'.
     */
    @JsonProperty(value = "usage")
    private String usage;

    /**
     * Type. Acceptable values are 'AsymmetricX509Cert' and 'Symmetric'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the startDate value.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate value.
     *
     * @param startDate the startDate value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate value.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate value.
     *
     * @param endDate the endDate value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the keyId value.
     *
     * @return the keyId value
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId value.
     *
     * @param keyId the keyId value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the usage value.
     *
     * @return the usage value
     */
    public String usage() {
        return this.usage;
    }

    /**
     * Set the usage value.
     *
     * @param usage the usage value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the KeyCredentialInner object itself.
     */
    public KeyCredentialInner withType(String type) {
        this.type = type;
        return this;
    }

}
