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

package com.google.api.services.solar.v1.model;

/**
 * Analysis of the cost and benefits of the optimum solar layout for a particular electric bill
 * size.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Solar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FinancialAnalysis extends com.google.api.client.json.GenericJson {

  /**
   * How much electricity the house uses in an average month, based on the bill size and the local
   * electricity rates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float averageKwhPerMonth;

  /**
   * Cost and benefit of buying the solar panels with cash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CashPurchaseSavings cashPurchaseSavings;

  /**
   * Whether this is the bill size selected to be the default bill for the area this building is in.
   * Exactly one `FinancialAnalysis` in `BuildingSolarPotential` should have `default_bill` set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean defaultBill;

  /**
   * Cost and benefit of buying the solar panels by financing the purchase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FinancedPurchaseSavings financedPurchaseSavings;

  /**
   * Financial information that applies regardless of the financing method used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FinancialDetails financialDetails;

  /**
   * Cost and benefit of leasing the solar panels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LeasingSavings leasingSavings;

  /**
   * The monthly electric bill this analysis assumes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money monthlyBill;

  /**
   * Index in solar_panel_configs of the optimum solar layout for this bill size. This can be -1
   * indicating that there is no layout. In this case, the remaining submessages will be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer panelConfigIndex;

  /**
   * How much electricity the house uses in an average month, based on the bill size and the local
   * electricity rates.
   * @return value or {@code null} for none
   */
  public java.lang.Float getAverageKwhPerMonth() {
    return averageKwhPerMonth;
  }

  /**
   * How much electricity the house uses in an average month, based on the bill size and the local
   * electricity rates.
   * @param averageKwhPerMonth averageKwhPerMonth or {@code null} for none
   */
  public FinancialAnalysis setAverageKwhPerMonth(java.lang.Float averageKwhPerMonth) {
    this.averageKwhPerMonth = averageKwhPerMonth;
    return this;
  }

  /**
   * Cost and benefit of buying the solar panels with cash.
   * @return value or {@code null} for none
   */
  public CashPurchaseSavings getCashPurchaseSavings() {
    return cashPurchaseSavings;
  }

  /**
   * Cost and benefit of buying the solar panels with cash.
   * @param cashPurchaseSavings cashPurchaseSavings or {@code null} for none
   */
  public FinancialAnalysis setCashPurchaseSavings(CashPurchaseSavings cashPurchaseSavings) {
    this.cashPurchaseSavings = cashPurchaseSavings;
    return this;
  }

  /**
   * Whether this is the bill size selected to be the default bill for the area this building is in.
   * Exactly one `FinancialAnalysis` in `BuildingSolarPotential` should have `default_bill` set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDefaultBill() {
    return defaultBill;
  }

  /**
   * Whether this is the bill size selected to be the default bill for the area this building is in.
   * Exactly one `FinancialAnalysis` in `BuildingSolarPotential` should have `default_bill` set.
   * @param defaultBill defaultBill or {@code null} for none
   */
  public FinancialAnalysis setDefaultBill(java.lang.Boolean defaultBill) {
    this.defaultBill = defaultBill;
    return this;
  }

  /**
   * Cost and benefit of buying the solar panels by financing the purchase.
   * @return value or {@code null} for none
   */
  public FinancedPurchaseSavings getFinancedPurchaseSavings() {
    return financedPurchaseSavings;
  }

  /**
   * Cost and benefit of buying the solar panels by financing the purchase.
   * @param financedPurchaseSavings financedPurchaseSavings or {@code null} for none
   */
  public FinancialAnalysis setFinancedPurchaseSavings(FinancedPurchaseSavings financedPurchaseSavings) {
    this.financedPurchaseSavings = financedPurchaseSavings;
    return this;
  }

  /**
   * Financial information that applies regardless of the financing method used.
   * @return value or {@code null} for none
   */
  public FinancialDetails getFinancialDetails() {
    return financialDetails;
  }

  /**
   * Financial information that applies regardless of the financing method used.
   * @param financialDetails financialDetails or {@code null} for none
   */
  public FinancialAnalysis setFinancialDetails(FinancialDetails financialDetails) {
    this.financialDetails = financialDetails;
    return this;
  }

  /**
   * Cost and benefit of leasing the solar panels.
   * @return value or {@code null} for none
   */
  public LeasingSavings getLeasingSavings() {
    return leasingSavings;
  }

  /**
   * Cost and benefit of leasing the solar panels.
   * @param leasingSavings leasingSavings or {@code null} for none
   */
  public FinancialAnalysis setLeasingSavings(LeasingSavings leasingSavings) {
    this.leasingSavings = leasingSavings;
    return this;
  }

  /**
   * The monthly electric bill this analysis assumes.
   * @return value or {@code null} for none
   */
  public Money getMonthlyBill() {
    return monthlyBill;
  }

  /**
   * The monthly electric bill this analysis assumes.
   * @param monthlyBill monthlyBill or {@code null} for none
   */
  public FinancialAnalysis setMonthlyBill(Money monthlyBill) {
    this.monthlyBill = monthlyBill;
    return this;
  }

  /**
   * Index in solar_panel_configs of the optimum solar layout for this bill size. This can be -1
   * indicating that there is no layout. In this case, the remaining submessages will be omitted.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPanelConfigIndex() {
    return panelConfigIndex;
  }

  /**
   * Index in solar_panel_configs of the optimum solar layout for this bill size. This can be -1
   * indicating that there is no layout. In this case, the remaining submessages will be omitted.
   * @param panelConfigIndex panelConfigIndex or {@code null} for none
   */
  public FinancialAnalysis setPanelConfigIndex(java.lang.Integer panelConfigIndex) {
    this.panelConfigIndex = panelConfigIndex;
    return this;
  }

  @Override
  public FinancialAnalysis set(String fieldName, Object value) {
    return (FinancialAnalysis) super.set(fieldName, value);
  }

  @Override
  public FinancialAnalysis clone() {
    return (FinancialAnalysis) super.clone();
  }

}
