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

package com.google.api.services.compute.model;

/**
 * Optional settings for individual wires. Allows wire-level control that can be useful for
 * migration purposes. If you use this field, you opt-out of the SLA for the wire group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WireGroupWireInputs extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the wire is enabled. When false, the wire is disabled. When true and when the
   * wire group of the wire is also enabled, the wire is enabled. Defaults to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adminEnabled;

  /**
   * The overridden properties for the wire. Any properties that are not overridden are omitted from
   * the object. Review the following guidelines: - If you apply wire overrides to a wire and its
   * wire group bandwidth configuration is set to `SHARED_WITH_WIRE_GROUP`, the `meteredBandwidth`
   * and `unmeteredBandwidth` properties must not differ from the wire group. - Overrides generate a
   * `configurationNotice`. Ensure that differences in wire configuration are temporary. An example
   * use case for wire overrides is slowly rolling out configuration changes to individual wires in
   * a wire group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WireProperties wirePropertyOverrides;

  /**
   * Indicates whether the wire is enabled. When false, the wire is disabled. When true and when the
   * wire group of the wire is also enabled, the wire is enabled. Defaults to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdminEnabled() {
    return adminEnabled;
  }

  /**
   * Indicates whether the wire is enabled. When false, the wire is disabled. When true and when the
   * wire group of the wire is also enabled, the wire is enabled. Defaults to true.
   * @param adminEnabled adminEnabled or {@code null} for none
   */
  public WireGroupWireInputs setAdminEnabled(java.lang.Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
    return this;
  }

  /**
   * The overridden properties for the wire. Any properties that are not overridden are omitted from
   * the object. Review the following guidelines: - If you apply wire overrides to a wire and its
   * wire group bandwidth configuration is set to `SHARED_WITH_WIRE_GROUP`, the `meteredBandwidth`
   * and `unmeteredBandwidth` properties must not differ from the wire group. - Overrides generate a
   * `configurationNotice`. Ensure that differences in wire configuration are temporary. An example
   * use case for wire overrides is slowly rolling out configuration changes to individual wires in
   * a wire group.
   * @return value or {@code null} for none
   */
  public WireProperties getWirePropertyOverrides() {
    return wirePropertyOverrides;
  }

  /**
   * The overridden properties for the wire. Any properties that are not overridden are omitted from
   * the object. Review the following guidelines: - If you apply wire overrides to a wire and its
   * wire group bandwidth configuration is set to `SHARED_WITH_WIRE_GROUP`, the `meteredBandwidth`
   * and `unmeteredBandwidth` properties must not differ from the wire group. - Overrides generate a
   * `configurationNotice`. Ensure that differences in wire configuration are temporary. An example
   * use case for wire overrides is slowly rolling out configuration changes to individual wires in
   * a wire group.
   * @param wirePropertyOverrides wirePropertyOverrides or {@code null} for none
   */
  public WireGroupWireInputs setWirePropertyOverrides(WireProperties wirePropertyOverrides) {
    this.wirePropertyOverrides = wirePropertyOverrides;
    return this;
  }

  @Override
  public WireGroupWireInputs set(String fieldName, Object value) {
    return (WireGroupWireInputs) super.set(fieldName, value);
  }

  @Override
  public WireGroupWireInputs clone() {
    return (WireGroupWireInputs) super.clone();
  }

}
