/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.InsightsManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ApplicationInsightsComponentQuotaStatusInner;

/**
 * Type representing ApplicationInsightsComponentQuotaStatus.
 */
public interface ApplicationInsightsComponentQuotaStatus extends HasInner<ApplicationInsightsComponentQuotaStatusInner>, HasManager<InsightsManager> {
    /**
     * @return the appId value.
     */
    String appId();

    /**
     * @return the expirationTime value.
     */
    String expirationTime();

    /**
     * @return the shouldBeThrottled value.
     */
    Boolean shouldBeThrottled();

}