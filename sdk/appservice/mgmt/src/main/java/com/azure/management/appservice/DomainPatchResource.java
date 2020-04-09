// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The DomainPatchResource model.
 */
@JsonFlatten
@Fluent
public class DomainPatchResource extends ProxyOnlyResource {
    /*
     * Contact information for domain registration. If 'Domain Privacy' option
     * is not selected then the contact information is made publicly available
     * through the Whois
     * directories as per ICANN requirements.
     */
    @JsonProperty(value = "properties.contactAdmin")
    private Contact contactAdmin;

    /*
     * Contact information for domain registration. If 'Domain Privacy' option
     * is not selected then the contact information is made publicly available
     * through the Whois
     * directories as per ICANN requirements.
     */
    @JsonProperty(value = "properties.contactBilling")
    private Contact contactBilling;

    /*
     * Contact information for domain registration. If 'Domain Privacy' option
     * is not selected then the contact information is made publicly available
     * through the Whois
     * directories as per ICANN requirements.
     */
    @JsonProperty(value = "properties.contactRegistrant")
    private Contact contactRegistrant;

    /*
     * Contact information for domain registration. If 'Domain Privacy' option
     * is not selected then the contact information is made publicly available
     * through the Whois
     * directories as per ICANN requirements.
     */
    @JsonProperty(value = "properties.contactTech")
    private Contact contactTech;

    /*
     * Domain registration status.
     */
    @JsonProperty(value = "properties.registrationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DomainStatus registrationStatus;

    /*
     * Status of certificate order.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Name servers.
     */
    @JsonProperty(value = "properties.nameServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nameServers;

    /*
     * <code>true</code> if domain privacy is enabled for this domain;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.privacy")
    private Boolean privacy;

    /*
     * Domain creation timestamp.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Domain expiration timestamp.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationTime;

    /*
     * Timestamp when the domain was renewed last time.
     */
    @JsonProperty(value = "properties.lastRenewedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRenewedTime;

    /*
     * <code>true</code> if the domain should be automatically renewed;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.autoRenew")
    private Boolean autoRenew;

    /*
     * <code>true</code> if Azure can assign this domain to App Service apps;
     * otherwise, <code>false</code>. This value will be <code>true</code> if
     * domain registration status is active and
     * it is hosted on name servers Azure has programmatic access to.
     */
    @JsonProperty(value = "properties.readyForDnsRecordManagement", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean readyForDnsRecordManagement;

    /*
     * All hostnames derived from the domain and assigned to Azure resources.
     */
    @JsonProperty(value = "properties.managedHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<HostName> managedHostNames;

    /*
     * Domain purchase consent object, representing acceptance of applicable
     * legal agreements.
     */
    @JsonProperty(value = "properties.consent")
    private DomainPurchaseConsent consent;

    /*
     * Reasons why domain is not renewable.
     */
    @JsonProperty(value = "properties.domainNotRenewableReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<DomainPatchResourcePropertiesDomainNotRenewableReasonsItem> domainNotRenewableReasons;

    /*
     * Current DNS type
     */
    @JsonProperty(value = "properties.dnsType")
    private DnsType dnsType;

    /*
     * Azure DNS Zone to use
     */
    @JsonProperty(value = "properties.dnsZoneId")
    private String dnsZoneId;

    /*
     * Current DNS type
     */
    @JsonProperty(value = "properties.targetDnsType")
    private DnsType targetDnsType;

    /*
     * The authCode property.
     */
    @JsonProperty(value = "properties.authCode")
    private String authCode;

    /**
     * Get the contactAdmin property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @return the contactAdmin value.
     */
    public Contact contactAdmin() {
        return this.contactAdmin;
    }

    /**
     * Set the contactAdmin property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @param contactAdmin the contactAdmin value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactAdmin(Contact contactAdmin) {
        this.contactAdmin = contactAdmin;
        return this;
    }

    /**
     * Get the contactBilling property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @return the contactBilling value.
     */
    public Contact contactBilling() {
        return this.contactBilling;
    }

    /**
     * Set the contactBilling property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @param contactBilling the contactBilling value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactBilling(Contact contactBilling) {
        this.contactBilling = contactBilling;
        return this;
    }

    /**
     * Get the contactRegistrant property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @return the contactRegistrant value.
     */
    public Contact contactRegistrant() {
        return this.contactRegistrant;
    }

    /**
     * Set the contactRegistrant property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @param contactRegistrant the contactRegistrant value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactRegistrant(Contact contactRegistrant) {
        this.contactRegistrant = contactRegistrant;
        return this;
    }

    /**
     * Get the contactTech property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @return the contactTech value.
     */
    public Contact contactTech() {
        return this.contactTech;
    }

    /**
     * Set the contactTech property: Contact information for domain
     * registration. If 'Domain Privacy' option is not selected then the
     * contact information is made publicly available through the Whois
     * directories as per ICANN requirements.
     * 
     * @param contactTech the contactTech value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withContactTech(Contact contactTech) {
        this.contactTech = contactTech;
        return this;
    }

    /**
     * Get the registrationStatus property: Domain registration status.
     * 
     * @return the registrationStatus value.
     */
    public DomainStatus registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Get the provisioningState property: Status of certificate order.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the nameServers property: Name servers.
     * 
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Get the privacy property: &lt;code&gt;true&lt;/code&gt; if domain
     * privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the privacy value.
     */
    public Boolean privacy() {
        return this.privacy;
    }

    /**
     * Set the privacy property: &lt;code&gt;true&lt;/code&gt; if domain
     * privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param privacy the privacy value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get the createdTime property: Domain creation timestamp.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the expirationTime property: Domain expiration timestamp.
     * 
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the lastRenewedTime property: Timestamp when the domain was renewed
     * last time.
     * 
     * @return the lastRenewedTime value.
     */
    public OffsetDateTime lastRenewedTime() {
        return this.lastRenewedTime;
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain
     * should be automatically renewed; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain
     * should be automatically renewed; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param autoRenew the autoRenew value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the readyForDnsRecordManagement property:
     * &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to App
     * Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will
     * be &lt;code&gt;true&lt;/code&gt; if domain registration status is active
     * and
     * it is hosted on name servers Azure has programmatic access to.
     * 
     * @return the readyForDnsRecordManagement value.
     */
    public Boolean readyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }

    /**
     * Get the managedHostNames property: All hostnames derived from the domain
     * and assigned to Azure resources.
     * 
     * @return the managedHostNames value.
     */
    public List<HostName> managedHostNames() {
        return this.managedHostNames;
    }

    /**
     * Get the consent property: Domain purchase consent object, representing
     * acceptance of applicable legal agreements.
     * 
     * @return the consent value.
     */
    public DomainPurchaseConsent consent() {
        return this.consent;
    }

    /**
     * Set the consent property: Domain purchase consent object, representing
     * acceptance of applicable legal agreements.
     * 
     * @param consent the consent value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withConsent(DomainPurchaseConsent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get the domainNotRenewableReasons property: Reasons why domain is not
     * renewable.
     * 
     * @return the domainNotRenewableReasons value.
     */
    public List<DomainPatchResourcePropertiesDomainNotRenewableReasonsItem> domainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }

    /**
     * Get the dnsType property: Current DNS type.
     * 
     * @return the dnsType value.
     */
    public DnsType dnsType() {
        return this.dnsType;
    }

    /**
     * Set the dnsType property: Current DNS type.
     * 
     * @param dnsType the dnsType value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withDnsType(DnsType dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * Get the dnsZoneId property: Azure DNS Zone to use.
     * 
     * @return the dnsZoneId value.
     */
    public String dnsZoneId() {
        return this.dnsZoneId;
    }

    /**
     * Set the dnsZoneId property: Azure DNS Zone to use.
     * 
     * @param dnsZoneId the dnsZoneId value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withDnsZoneId(String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
        return this;
    }

    /**
     * Get the targetDnsType property: Current DNS type.
     * 
     * @return the targetDnsType value.
     */
    public DnsType targetDnsType() {
        return this.targetDnsType;
    }

    /**
     * Set the targetDnsType property: Current DNS type.
     * 
     * @param targetDnsType the targetDnsType value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withTargetDnsType(DnsType targetDnsType) {
        this.targetDnsType = targetDnsType;
        return this;
    }

    /**
     * Get the authCode property: The authCode property.
     * 
     * @return the authCode value.
     */
    public String authCode() {
        return this.authCode;
    }

    /**
     * Set the authCode property: The authCode property.
     * 
     * @param authCode the authCode value to set.
     * @return the DomainPatchResource object itself.
     */
    public DomainPatchResource withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
}
