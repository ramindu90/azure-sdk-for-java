/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.table;

import com.microsoft.windowsazure.services.core.FilterableService;
import com.microsoft.windowsazure.services.core.ServiceException;
import com.microsoft.windowsazure.services.table.models.GetServicePropertiesResult;
import com.microsoft.windowsazure.services.table.models.ServiceProperties;
import com.microsoft.windowsazure.services.table.models.TableServiceOptions;

public interface TableContract extends FilterableService<TableContract> {
    GetServicePropertiesResult getServiceProperties() throws ServiceException;

    GetServicePropertiesResult getServiceProperties(TableServiceOptions options) throws ServiceException;

    void setServiceProperties(ServiceProperties serviceProperties) throws ServiceException;

    void setServiceProperties(ServiceProperties serviceProperties, TableServiceOptions options) throws ServiceException;
}
