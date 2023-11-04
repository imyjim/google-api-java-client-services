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

package com.google.api.services.searchads360.v0.model;

/**
 * A language.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ResourcesLanguageConstant extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Output only. The ID of the language constant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Output only. The full name of the language in English, for example, "English (US)", "Spanish",
   * etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The resource name of the language constant. Language constant resource names have
   * the form: `languageConstants/{criterion_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Output only. Whether the language is targetable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean targetable;

  /**
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * @param code code or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesLanguageConstant setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Output only. The ID of the language constant.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Output only. The ID of the language constant.
   * @param id id or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesLanguageConstant setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. The full name of the language in English, for example, "English (US)", "Spanish",
   * etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The full name of the language in English, for example, "English (US)", "Spanish",
   * etc.
   * @param name name or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesLanguageConstant setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The resource name of the language constant. Language constant resource names have
   * the form: `languageConstants/{criterion_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * Output only. The resource name of the language constant. Language constant resource names have
   * the form: `languageConstants/{criterion_id}`
   * @param resourceName resourceName or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesLanguageConstant setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Output only. Whether the language is targetable.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTargetable() {
    return targetable;
  }

  /**
   * Output only. Whether the language is targetable.
   * @param targetable targetable or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesLanguageConstant setTargetable(java.lang.Boolean targetable) {
    this.targetable = targetable;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesLanguageConstant set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ResourcesLanguageConstant) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesLanguageConstant clone() {
    return (GoogleAdsSearchads360V0ResourcesLanguageConstant) super.clone();
  }

}