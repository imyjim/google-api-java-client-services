/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.tpu.v2alpha1.model;

/**
 * Model definition for Usage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Usage extends com.google.api.client.json.GenericJson {

  /**
   * The real-time value of usage within the reservation, with the unit specified in field
   * capacity_units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long total;

  /**
   * The real-time value of usage within the reservation, with the unit specified in field
   * capacity_units.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotal() {
    return total;
  }

  /**
   * The real-time value of usage within the reservation, with the unit specified in field
   * capacity_units.
   * @param total total or {@code null} for none
   */
  public Usage setTotal(java.lang.Long total) {
    this.total = total;
    return this;
  }

  @Override
  public Usage set(String fieldName, Object value) {
    return (Usage) super.set(fieldName, value);
  }

  @Override
  public Usage clone() {
    return (Usage) super.clone();
  }

}