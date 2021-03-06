// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The HostName model. */
@Fluent
public final class HostName {
    /*
     * Name of the hostname.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * List of apps the hostname is assigned to. This list will have more than
     * one app only if the hostname is pointing to a Traffic Manager.
     */
    @JsonProperty(value = "siteNames")
    private List<String> siteNames;

    /*
     * Name of the Azure resource the hostname is assigned to. If it is
     * assigned to a Traffic Manager then it will be the Traffic Manager name
     * otherwise it will be the app name.
     */
    @JsonProperty(value = "azureResourceName")
    private String azureResourceName;

    /*
     * Type of the Azure resource the hostname is assigned to.
     */
    @JsonProperty(value = "azureResourceType")
    private AzureResourceType azureResourceType;

    /*
     * Type of the DNS record.
     */
    @JsonProperty(value = "customHostNameDnsRecordType")
    private CustomHostNameDnsRecordType customHostNameDnsRecordType;

    /*
     * Type of the hostname.
     */
    @JsonProperty(value = "hostNameType")
    private HostNameType hostNameType;

    /**
     * Get the name property: Name of the hostname.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the hostname.
     *
     * @param name the name value to set.
     * @return the HostName object itself.
     */
    public HostName withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the siteNames property: List of apps the hostname is assigned to. This list will have more than one app only
     * if the hostname is pointing to a Traffic Manager.
     *
     * @return the siteNames value.
     */
    public List<String> siteNames() {
        return this.siteNames;
    }

    /**
     * Set the siteNames property: List of apps the hostname is assigned to. This list will have more than one app only
     * if the hostname is pointing to a Traffic Manager.
     *
     * @param siteNames the siteNames value to set.
     * @return the HostName object itself.
     */
    public HostName withSiteNames(List<String> siteNames) {
        this.siteNames = siteNames;
        return this;
    }

    /**
     * Get the azureResourceName property: Name of the Azure resource the hostname is assigned to. If it is assigned to
     * a Traffic Manager then it will be the Traffic Manager name otherwise it will be the app name.
     *
     * @return the azureResourceName value.
     */
    public String azureResourceName() {
        return this.azureResourceName;
    }

    /**
     * Set the azureResourceName property: Name of the Azure resource the hostname is assigned to. If it is assigned to
     * a Traffic Manager then it will be the Traffic Manager name otherwise it will be the app name.
     *
     * @param azureResourceName the azureResourceName value to set.
     * @return the HostName object itself.
     */
    public HostName withAzureResourceName(String azureResourceName) {
        this.azureResourceName = azureResourceName;
        return this;
    }

    /**
     * Get the azureResourceType property: Type of the Azure resource the hostname is assigned to.
     *
     * @return the azureResourceType value.
     */
    public AzureResourceType azureResourceType() {
        return this.azureResourceType;
    }

    /**
     * Set the azureResourceType property: Type of the Azure resource the hostname is assigned to.
     *
     * @param azureResourceType the azureResourceType value to set.
     * @return the HostName object itself.
     */
    public HostName withAzureResourceType(AzureResourceType azureResourceType) {
        this.azureResourceType = azureResourceType;
        return this;
    }

    /**
     * Get the customHostNameDnsRecordType property: Type of the DNS record.
     *
     * @return the customHostNameDnsRecordType value.
     */
    public CustomHostNameDnsRecordType customHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }

    /**
     * Set the customHostNameDnsRecordType property: Type of the DNS record.
     *
     * @param customHostNameDnsRecordType the customHostNameDnsRecordType value to set.
     * @return the HostName object itself.
     */
    public HostName withCustomHostNameDnsRecordType(CustomHostNameDnsRecordType customHostNameDnsRecordType) {
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        return this;
    }

    /**
     * Get the hostNameType property: Type of the hostname.
     *
     * @return the hostNameType value.
     */
    public HostNameType hostNameType() {
        return this.hostNameType;
    }

    /**
     * Set the hostNameType property: Type of the hostname.
     *
     * @param hostNameType the hostNameType value to set.
     * @return the HostName object itself.
     */
    public HostName withHostNameType(HostNameType hostNameType) {
        this.hostNameType = hostNameType;
        return this;
    }
}
