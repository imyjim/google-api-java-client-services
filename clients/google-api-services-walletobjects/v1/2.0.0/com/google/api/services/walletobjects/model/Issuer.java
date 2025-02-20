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

package com.google.api.services.walletobjects.model;

/**
 * Model definition for Issuer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Wallet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Issuer extends com.google.api.client.json.GenericJson {

  /**
   * Allows the issuer to provide their callback settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CallbackOptions callbackOptions;

  /**
   * Issuer contact information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IssuerContactInfo contactInfo;

  /**
   * URL for the issuer's home page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String homepageUrl;

  /**
   * The unique identifier for an issuer account. This is automatically generated when the issuer is
   * inserted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long issuerId;

  /**
   * The account name of the issuer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Available only to Smart Tap enabled partners. Contact support for additional guidance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SmartTapMerchantData smartTapMerchantData;

  /**
   * Allows the issuer to provide their callback settings.
   * @return value or {@code null} for none
   */
  public CallbackOptions getCallbackOptions() {
    return callbackOptions;
  }

  /**
   * Allows the issuer to provide their callback settings.
   * @param callbackOptions callbackOptions or {@code null} for none
   */
  public Issuer setCallbackOptions(CallbackOptions callbackOptions) {
    this.callbackOptions = callbackOptions;
    return this;
  }

  /**
   * Issuer contact information.
   * @return value or {@code null} for none
   */
  public IssuerContactInfo getContactInfo() {
    return contactInfo;
  }

  /**
   * Issuer contact information.
   * @param contactInfo contactInfo or {@code null} for none
   */
  public Issuer setContactInfo(IssuerContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  /**
   * URL for the issuer's home page.
   * @return value or {@code null} for none
   */
  public java.lang.String getHomepageUrl() {
    return homepageUrl;
  }

  /**
   * URL for the issuer's home page.
   * @param homepageUrl homepageUrl or {@code null} for none
   */
  public Issuer setHomepageUrl(java.lang.String homepageUrl) {
    this.homepageUrl = homepageUrl;
    return this;
  }

  /**
   * The unique identifier for an issuer account. This is automatically generated when the issuer is
   * inserted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIssuerId() {
    return issuerId;
  }

  /**
   * The unique identifier for an issuer account. This is automatically generated when the issuer is
   * inserted.
   * @param issuerId issuerId or {@code null} for none
   */
  public Issuer setIssuerId(java.lang.Long issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * The account name of the issuer.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The account name of the issuer.
   * @param name name or {@code null} for none
   */
  public Issuer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Available only to Smart Tap enabled partners. Contact support for additional guidance.
   * @return value or {@code null} for none
   */
  public SmartTapMerchantData getSmartTapMerchantData() {
    return smartTapMerchantData;
  }

  /**
   * Available only to Smart Tap enabled partners. Contact support for additional guidance.
   * @param smartTapMerchantData smartTapMerchantData or {@code null} for none
   */
  public Issuer setSmartTapMerchantData(SmartTapMerchantData smartTapMerchantData) {
    this.smartTapMerchantData = smartTapMerchantData;
    return this;
  }

  @Override
  public Issuer set(String fieldName, Object value) {
    return (Issuer) super.set(fieldName, value);
  }

  @Override
  public Issuer clone() {
    return (Issuer) super.clone();
  }

}
