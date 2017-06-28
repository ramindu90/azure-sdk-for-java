/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.search.implementation;

import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.search.AdminKeys;

/**
 * Response containing the primary and secondary admin API keys for a given Azure Search service.
 */
class AdminKeysImpl extends WrapperImpl<AdminKeyResultInner> implements AdminKeys {

  /**
   * Create AdminKeysImpl.
   */
  protected AdminKeysImpl(AdminKeyResultInner innerObject) {
    super(innerObject);
  }

  /**
   * Get the primaryKey value.
   *
   * @return the primaryKey value
   */
  @Override
  public String primaryKey() {
    return this.inner().primaryKey();
  }

  /**
   * Get the secondaryKey value.
   *
   * @return the secondaryKey value
   */
  @Override
  public String secondaryKey() {
    return this.inner().secondaryKey();
  }

}
