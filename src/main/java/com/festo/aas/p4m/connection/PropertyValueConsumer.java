/*-
 * #%L
 * Papyrus4Manufacturing helpers
 * %%
 * Copyright (C) 2021 - 2022 Festo Didactic SE
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

package com.festo.aas.p4m.connection;

import org.eclipse.basyx.vab.exception.provider.ProviderException;

/**
 * Applies a changed property value to an asset.
 */
public interface PropertyValueConsumer {
  /**
   * Applies an updated property value to the asset.
   *
   * @param value The new property value.
   * @throws ProviderException If the communication with the asset failed.
   */
  void applyValue(Object value) throws ProviderException;
}
