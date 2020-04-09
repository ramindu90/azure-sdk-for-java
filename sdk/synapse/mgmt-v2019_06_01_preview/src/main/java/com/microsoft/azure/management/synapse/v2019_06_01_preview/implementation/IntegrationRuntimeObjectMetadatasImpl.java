/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeObjectMetadatas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SsisObjectMetadataListResponse;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SsisObjectMetadataStatusResponse;

class IntegrationRuntimeObjectMetadatasImpl extends WrapperImpl<IntegrationRuntimeObjectMetadatasInner> implements IntegrationRuntimeObjectMetadatas {
    private final SynapseManager manager;

    IntegrationRuntimeObjectMetadatasImpl(SynapseManager manager) {
        super(manager.inner().integrationRuntimeObjectMetadatas());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SsisObjectMetadataListResponse> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeObjectMetadatasInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, integrationRuntimeName)
        .map(new Func1<SsisObjectMetadataListResponseInner, SsisObjectMetadataListResponse>() {
            @Override
            public SsisObjectMetadataListResponse call(SsisObjectMetadataListResponseInner inner) {
                return new SsisObjectMetadataListResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SsisObjectMetadataStatusResponse> refreshAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeObjectMetadatasInner client = this.inner();
        return client.refreshAsync(resourceGroupName, workspaceName, integrationRuntimeName)
        .map(new Func1<SsisObjectMetadataStatusResponseInner, SsisObjectMetadataStatusResponse>() {
            @Override
            public SsisObjectMetadataStatusResponse call(SsisObjectMetadataStatusResponseInner inner) {
                return new SsisObjectMetadataStatusResponseImpl(inner, manager());
            }
        });
    }

}
