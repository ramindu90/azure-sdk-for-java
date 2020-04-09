/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiDiagnostics;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiDiagnosticContract;

class ApiDiagnosticsImpl extends WrapperImpl<ApiDiagnosticsInner> implements ApiDiagnostics {
    private final ApiManagementManager manager;

    ApiDiagnosticsImpl(ApiManagementManager manager) {
        super(manager.inner().apiDiagnostics());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ApiDiagnosticContractImpl define(String name) {
        return wrapModel(name);
    }

    private ApiDiagnosticContractImpl wrapModel(DiagnosticContractInner inner) {
        return  new ApiDiagnosticContractImpl(inner, manager());
    }

    private ApiDiagnosticContractImpl wrapModel(String name) {
        return new ApiDiagnosticContractImpl(name, this.manager());
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String diagnosticId) {
        ApiDiagnosticsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId, diagnosticId).toCompletable();
    }

    @Override
    public Observable<ApiDiagnosticContract> listByServiceAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        ApiDiagnosticsInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName, apiId)
        .flatMapIterable(new Func1<Page<DiagnosticContractInner>, Iterable<DiagnosticContractInner>>() {
            @Override
            public Iterable<DiagnosticContractInner> call(Page<DiagnosticContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DiagnosticContractInner, ApiDiagnosticContract>() {
            @Override
            public ApiDiagnosticContract call(DiagnosticContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ApiDiagnosticContract> getAsync(String resourceGroupName, String serviceName, String apiId, String diagnosticId) {
        ApiDiagnosticsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId, diagnosticId)
        .flatMap(new Func1<DiagnosticContractInner, Observable<ApiDiagnosticContract>>() {
            @Override
            public Observable<ApiDiagnosticContract> call(DiagnosticContractInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ApiDiagnosticContract)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String diagnosticId, String ifMatch) {
        ApiDiagnosticsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, diagnosticId, ifMatch).toCompletable();
    }

}
