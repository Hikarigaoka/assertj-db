/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.db.error;

import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;

/**
 * Creates an error message indicating that an assertion that verifies the number of modified columns.
 *
 * @author Régis Pouiller
 *
 */
public class ShouldHaveNumberOfModificationsLess extends BasicErrorMessageFactory {

  /**
   * Creates a new <code>{@link ShouldHaveNumberOfModificationsLess}</code>.
   *
   * @param numberOfModifications The number of modifications.
   * @param expectedNumber The expected number of modifications.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldHaveNumberOfModificationsLess(int numberOfModifications, int expectedNumber) {
    return new ShouldHaveNumberOfModificationsLess(numberOfModifications, expectedNumber);
  }

  /**
   * Constructor.
   *
   * @param numberOfModifications The number of modifications.
   * @param expectedNumber The expected number of modifications.
   */
  private ShouldHaveNumberOfModificationsLess(int numberOfModifications, int expectedNumber) {
    super("%nExpecting :%n  number of modifications is less than %s%nbut was:%n  %s", expectedNumber, numberOfModifications);
  }
}