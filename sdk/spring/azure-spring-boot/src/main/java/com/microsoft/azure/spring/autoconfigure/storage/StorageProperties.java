// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.microsoft.azure.spring.autoconfigure.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Validated
@ConfigurationProperties("azure.storage")
public class StorageProperties {
    @NotEmpty
    private String accountName;

    @NotEmpty
    private String accountKey;

    private boolean useEmulator = false;

    private String emulatorBlobHost;

    private String containerName;

    private boolean allowTelemetry = true;

    private boolean enableHttps = false;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    public boolean isUseEmulator() {
        return useEmulator;
    }

    public void setUseEmulator(boolean useEmulator) {
        this.useEmulator = useEmulator;
    }

    public String getEmulatorBlobHost() {
        return emulatorBlobHost;
    }

    public void setEmulatorBlobHost(String emulatorBlobHost) {
        this.emulatorBlobHost = emulatorBlobHost;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public boolean isAllowTelemetry() {
        return allowTelemetry;
    }

    public void setAllowTelemetry(boolean allowTelemetry) {
        this.allowTelemetry = allowTelemetry;
    }

    public boolean isEnableHttps() {
        return enableHttps;
    }

    public void setEnableHttps(boolean enableHttps) {
        this.enableHttps = enableHttps;
    }
}
