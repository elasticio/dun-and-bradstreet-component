
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetailsSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetailsSectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentReportDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AccountTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryStatusCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="AccountSecondaryStatusCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="AccountOpenedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AccountClosedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AccountClosureReasonCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="AccountMaturityDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="MostRecentActivityDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AccountConversionTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="AccountConversionDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OriginalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentCreditLineAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumUtilizedAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SecuredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CollateralTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="MostRecentPaymentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="MostRecentPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentBalanceAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ScheduledPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NewChargesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPastDueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NonDelinquentPaymentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle1Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle2Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle3Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle4Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle5Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle6Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle7Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="ChargeOffDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ChargeOffAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ChargeOffRecoveredAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ChargeOffAmountTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="BalloonAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BalloonPaymentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PaymentFrequencyCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="FinalPaymentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PaymentHistory12MonthsPatternText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentHistory24MonthsPatternText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovernmentGuaranteeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GovernmentGuaranteeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="GovernmentGuaranteedPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GuarantorsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuarantorsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GuarantorDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}GuarantorDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecentActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetailsSectionType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "accountSystemIdentifier",
    "paymentReportDate",
    "accountTypeCode",
    "accountPrimaryStatusCode",
    "accountSecondaryStatusCode",
    "accountOpenedDate",
    "accountClosedDate",
    "accountClosureReasonCode",
    "accountMaturityDate",
    "mostRecentActivityDate",
    "accountConversionTypeCode",
    "accountConversionDate",
    "originalAmount",
    "currentCreditLineAmount",
    "maximumUtilizedAmount",
    "securedIndicator",
    "collateralTypeCode",
    "mostRecentPaymentDate",
    "mostRecentPaymentAmount",
    "currentBalanceAmount",
    "scheduledPaymentAmount",
    "newChargesAmount",
    "totalPastDueAmount",
    "nonDelinquentPaymentCount",
    "pastDuePaymentCycle1Summary",
    "pastDuePaymentCycle2Summary",
    "pastDuePaymentCycle3Summary",
    "pastDuePaymentCycle4Summary",
    "pastDuePaymentCycle5Summary",
    "pastDuePaymentCycle6Summary",
    "pastDuePaymentCycle7Summary",
    "chargeOffDate",
    "chargeOffAmount",
    "chargeOffRecoveredAmount",
    "chargeOffAmountTypeCode",
    "balloonAmount",
    "balloonPaymentDate",
    "paymentFrequencyCode",
    "finalPaymentDate",
    "paymentHistory12MonthsPatternText",
    "paymentHistory24MonthsPatternText",
    "governmentGuaranteeIndicator",
    "governmentGuaranteeCode",
    "governmentGuaranteedPercentage",
    "guarantorsIndicator",
    "guarantorsCount",
    "guarantorDetails",
    "recentActivityIndicator"
})
public class AccountDetailsSectionType {

    @XmlElement(name = "AccountSystemIdentifier")
    protected String accountSystemIdentifier;
    @XmlElement(name = "PaymentReportDate")
    protected DNBDateType paymentReportDate;
    @XmlElement(name = "AccountTypeCode")
    protected String accountTypeCode;
    @XmlElement(name = "AccountPrimaryStatusCode")
    protected String accountPrimaryStatusCode;
    @XmlElement(name = "AccountSecondaryStatusCode")
    protected String accountSecondaryStatusCode;
    @XmlElement(name = "AccountOpenedDate")
    protected DNBDateType accountOpenedDate;
    @XmlElement(name = "AccountClosedDate")
    protected DNBDateType accountClosedDate;
    @XmlElement(name = "AccountClosureReasonCode")
    protected String accountClosureReasonCode;
    @XmlElement(name = "AccountMaturityDate")
    protected DNBDateType accountMaturityDate;
    @XmlElement(name = "MostRecentActivityDate")
    protected DNBDateType mostRecentActivityDate;
    @XmlElement(name = "AccountConversionTypeCode")
    protected String accountConversionTypeCode;
    @XmlElement(name = "AccountConversionDate")
    protected DNBDateType accountConversionDate;
    @XmlElement(name = "OriginalAmount")
    protected AmountType originalAmount;
    @XmlElement(name = "CurrentCreditLineAmount")
    protected AmountType currentCreditLineAmount;
    @XmlElement(name = "MaximumUtilizedAmount")
    protected AmountType maximumUtilizedAmount;
    @XmlElement(name = "SecuredIndicator")
    protected Boolean securedIndicator;
    @XmlElement(name = "CollateralTypeCode")
    protected String collateralTypeCode;
    @XmlElement(name = "MostRecentPaymentDate")
    protected DNBDateType mostRecentPaymentDate;
    @XmlElement(name = "MostRecentPaymentAmount")
    protected AmountType mostRecentPaymentAmount;
    @XmlElement(name = "CurrentBalanceAmount")
    protected AmountType currentBalanceAmount;
    @XmlElement(name = "ScheduledPaymentAmount")
    protected AmountType scheduledPaymentAmount;
    @XmlElement(name = "NewChargesAmount")
    protected AmountType newChargesAmount;
    @XmlElement(name = "TotalPastDueAmount")
    protected AmountType totalPastDueAmount;
    @XmlElement(name = "NonDelinquentPaymentCount")
    protected Integer nonDelinquentPaymentCount;
    @XmlElement(name = "PastDuePaymentCycle1Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle1Summary;
    @XmlElement(name = "PastDuePaymentCycle2Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle2Summary;
    @XmlElement(name = "PastDuePaymentCycle3Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle3Summary;
    @XmlElement(name = "PastDuePaymentCycle4Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle4Summary;
    @XmlElement(name = "PastDuePaymentCycle5Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle5Summary;
    @XmlElement(name = "PastDuePaymentCycle6Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle6Summary;
    @XmlElement(name = "PastDuePaymentCycle7Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle7Summary;
    @XmlElement(name = "ChargeOffDate")
    protected DNBDateType chargeOffDate;
    @XmlElement(name = "ChargeOffAmount")
    protected AmountType chargeOffAmount;
    @XmlElement(name = "ChargeOffRecoveredAmount")
    protected AmountType chargeOffRecoveredAmount;
    @XmlElement(name = "ChargeOffAmountTypeCode")
    protected String chargeOffAmountTypeCode;
    @XmlElement(name = "BalloonAmount")
    protected AmountType balloonAmount;
    @XmlElement(name = "BalloonPaymentDate")
    protected DNBDateType balloonPaymentDate;
    @XmlElement(name = "PaymentFrequencyCode")
    protected String paymentFrequencyCode;
    @XmlElement(name = "FinalPaymentDate")
    protected DNBDateType finalPaymentDate;
    @XmlElement(name = "PaymentHistory12MonthsPatternText")
    protected String paymentHistory12MonthsPatternText;
    @XmlElement(name = "PaymentHistory24MonthsPatternText")
    protected String paymentHistory24MonthsPatternText;
    @XmlElement(name = "GovernmentGuaranteeIndicator")
    protected Boolean governmentGuaranteeIndicator;
    @XmlElement(name = "GovernmentGuaranteeCode")
    protected String governmentGuaranteeCode;
    @XmlElement(name = "GovernmentGuaranteedPercentage")
    protected BigDecimal governmentGuaranteedPercentage;
    @XmlElement(name = "GuarantorsIndicator")
    protected Boolean guarantorsIndicator;
    @XmlElement(name = "GuarantorsCount")
    protected BigInteger guarantorsCount;
    @XmlElement(name = "GuarantorDetails")
    protected List<GuarantorDetailsType> guarantorDetails;
    @XmlElement(name = "RecentActivityIndicator")
    protected Boolean recentActivityIndicator;

    /**
     * Gets the value of the accountSystemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSystemIdentifier() {
        return accountSystemIdentifier;
    }

    /**
     * Sets the value of the accountSystemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSystemIdentifier(String value) {
        this.accountSystemIdentifier = value;
    }

    /**
     * Gets the value of the paymentReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getPaymentReportDate() {
        return paymentReportDate;
    }

    /**
     * Sets the value of the paymentReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setPaymentReportDate(DNBDateType value) {
        this.paymentReportDate = value;
    }

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the accountPrimaryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryStatusCode() {
        return accountPrimaryStatusCode;
    }

    /**
     * Sets the value of the accountPrimaryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryStatusCode(String value) {
        this.accountPrimaryStatusCode = value;
    }

    /**
     * Gets the value of the accountSecondaryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSecondaryStatusCode() {
        return accountSecondaryStatusCode;
    }

    /**
     * Sets the value of the accountSecondaryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSecondaryStatusCode(String value) {
        this.accountSecondaryStatusCode = value;
    }

    /**
     * Gets the value of the accountOpenedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAccountOpenedDate() {
        return accountOpenedDate;
    }

    /**
     * Sets the value of the accountOpenedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAccountOpenedDate(DNBDateType value) {
        this.accountOpenedDate = value;
    }

    /**
     * Gets the value of the accountClosedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAccountClosedDate() {
        return accountClosedDate;
    }

    /**
     * Sets the value of the accountClosedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAccountClosedDate(DNBDateType value) {
        this.accountClosedDate = value;
    }

    /**
     * Gets the value of the accountClosureReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountClosureReasonCode() {
        return accountClosureReasonCode;
    }

    /**
     * Sets the value of the accountClosureReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountClosureReasonCode(String value) {
        this.accountClosureReasonCode = value;
    }

    /**
     * Gets the value of the accountMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAccountMaturityDate() {
        return accountMaturityDate;
    }

    /**
     * Sets the value of the accountMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAccountMaturityDate(DNBDateType value) {
        this.accountMaturityDate = value;
    }

    /**
     * Gets the value of the mostRecentActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentActivityDate() {
        return mostRecentActivityDate;
    }

    /**
     * Sets the value of the mostRecentActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentActivityDate(DNBDateType value) {
        this.mostRecentActivityDate = value;
    }

    /**
     * Gets the value of the accountConversionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountConversionTypeCode() {
        return accountConversionTypeCode;
    }

    /**
     * Sets the value of the accountConversionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountConversionTypeCode(String value) {
        this.accountConversionTypeCode = value;
    }

    /**
     * Gets the value of the accountConversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAccountConversionDate() {
        return accountConversionDate;
    }

    /**
     * Sets the value of the accountConversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAccountConversionDate(DNBDateType value) {
        this.accountConversionDate = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalAmount(AmountType value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the currentCreditLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentCreditLineAmount() {
        return currentCreditLineAmount;
    }

    /**
     * Sets the value of the currentCreditLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentCreditLineAmount(AmountType value) {
        this.currentCreditLineAmount = value;
    }

    /**
     * Gets the value of the maximumUtilizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumUtilizedAmount() {
        return maximumUtilizedAmount;
    }

    /**
     * Sets the value of the maximumUtilizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumUtilizedAmount(AmountType value) {
        this.maximumUtilizedAmount = value;
    }

    /**
     * Gets the value of the securedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuredIndicator() {
        return securedIndicator;
    }

    /**
     * Sets the value of the securedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuredIndicator(Boolean value) {
        this.securedIndicator = value;
    }

    /**
     * Gets the value of the collateralTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralTypeCode() {
        return collateralTypeCode;
    }

    /**
     * Sets the value of the collateralTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralTypeCode(String value) {
        this.collateralTypeCode = value;
    }

    /**
     * Gets the value of the mostRecentPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentPaymentDate() {
        return mostRecentPaymentDate;
    }

    /**
     * Sets the value of the mostRecentPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentPaymentDate(DNBDateType value) {
        this.mostRecentPaymentDate = value;
    }

    /**
     * Gets the value of the mostRecentPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMostRecentPaymentAmount() {
        return mostRecentPaymentAmount;
    }

    /**
     * Sets the value of the mostRecentPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMostRecentPaymentAmount(AmountType value) {
        this.mostRecentPaymentAmount = value;
    }

    /**
     * Gets the value of the currentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    /**
     * Sets the value of the currentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentBalanceAmount(AmountType value) {
        this.currentBalanceAmount = value;
    }

    /**
     * Gets the value of the scheduledPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getScheduledPaymentAmount() {
        return scheduledPaymentAmount;
    }

    /**
     * Sets the value of the scheduledPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setScheduledPaymentAmount(AmountType value) {
        this.scheduledPaymentAmount = value;
    }

    /**
     * Gets the value of the newChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNewChargesAmount() {
        return newChargesAmount;
    }

    /**
     * Sets the value of the newChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNewChargesAmount(AmountType value) {
        this.newChargesAmount = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalPastDueAmount(AmountType value) {
        this.totalPastDueAmount = value;
    }

    /**
     * Gets the value of the nonDelinquentPaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonDelinquentPaymentCount() {
        return nonDelinquentPaymentCount;
    }

    /**
     * Sets the value of the nonDelinquentPaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonDelinquentPaymentCount(Integer value) {
        this.nonDelinquentPaymentCount = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle1Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle1Summary() {
        return pastDuePaymentCycle1Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle1Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle1Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle1Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle2Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle2Summary() {
        return pastDuePaymentCycle2Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle2Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle2Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle2Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle3Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle3Summary() {
        return pastDuePaymentCycle3Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle3Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle3Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle3Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle4Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle4Summary() {
        return pastDuePaymentCycle4Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle4Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle4Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle4Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle5Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle5Summary() {
        return pastDuePaymentCycle5Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle5Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle5Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle5Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle6Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle6Summary() {
        return pastDuePaymentCycle6Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle6Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle6Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle6Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle7Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public PastDuePaymentCycleSummaryType getPastDuePaymentCycle7Summary() {
        return pastDuePaymentCycle7Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle7Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentCycleSummaryType }
     *     
     */
    public void setPastDuePaymentCycle7Summary(PastDuePaymentCycleSummaryType value) {
        this.pastDuePaymentCycle7Summary = value;
    }

    /**
     * Gets the value of the chargeOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getChargeOffDate() {
        return chargeOffDate;
    }

    /**
     * Sets the value of the chargeOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setChargeOffDate(DNBDateType value) {
        this.chargeOffDate = value;
    }

    /**
     * Gets the value of the chargeOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargeOffAmount() {
        return chargeOffAmount;
    }

    /**
     * Sets the value of the chargeOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargeOffAmount(AmountType value) {
        this.chargeOffAmount = value;
    }

    /**
     * Gets the value of the chargeOffRecoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargeOffRecoveredAmount() {
        return chargeOffRecoveredAmount;
    }

    /**
     * Sets the value of the chargeOffRecoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargeOffRecoveredAmount(AmountType value) {
        this.chargeOffRecoveredAmount = value;
    }

    /**
     * Gets the value of the chargeOffAmountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeOffAmountTypeCode() {
        return chargeOffAmountTypeCode;
    }

    /**
     * Sets the value of the chargeOffAmountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeOffAmountTypeCode(String value) {
        this.chargeOffAmountTypeCode = value;
    }

    /**
     * Gets the value of the balloonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalloonAmount() {
        return balloonAmount;
    }

    /**
     * Sets the value of the balloonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalloonAmount(AmountType value) {
        this.balloonAmount = value;
    }

    /**
     * Gets the value of the balloonPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getBalloonPaymentDate() {
        return balloonPaymentDate;
    }

    /**
     * Sets the value of the balloonPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setBalloonPaymentDate(DNBDateType value) {
        this.balloonPaymentDate = value;
    }

    /**
     * Gets the value of the paymentFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFrequencyCode() {
        return paymentFrequencyCode;
    }

    /**
     * Sets the value of the paymentFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFrequencyCode(String value) {
        this.paymentFrequencyCode = value;
    }

    /**
     * Gets the value of the finalPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFinalPaymentDate() {
        return finalPaymentDate;
    }

    /**
     * Sets the value of the finalPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFinalPaymentDate(DNBDateType value) {
        this.finalPaymentDate = value;
    }

    /**
     * Gets the value of the paymentHistory12MonthsPatternText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentHistory12MonthsPatternText() {
        return paymentHistory12MonthsPatternText;
    }

    /**
     * Sets the value of the paymentHistory12MonthsPatternText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentHistory12MonthsPatternText(String value) {
        this.paymentHistory12MonthsPatternText = value;
    }

    /**
     * Gets the value of the paymentHistory24MonthsPatternText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentHistory24MonthsPatternText() {
        return paymentHistory24MonthsPatternText;
    }

    /**
     * Sets the value of the paymentHistory24MonthsPatternText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentHistory24MonthsPatternText(String value) {
        this.paymentHistory24MonthsPatternText = value;
    }

    /**
     * Gets the value of the governmentGuaranteeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGovernmentGuaranteeIndicator() {
        return governmentGuaranteeIndicator;
    }

    /**
     * Sets the value of the governmentGuaranteeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGovernmentGuaranteeIndicator(Boolean value) {
        this.governmentGuaranteeIndicator = value;
    }

    /**
     * Gets the value of the governmentGuaranteeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentGuaranteeCode() {
        return governmentGuaranteeCode;
    }

    /**
     * Sets the value of the governmentGuaranteeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentGuaranteeCode(String value) {
        this.governmentGuaranteeCode = value;
    }

    /**
     * Gets the value of the governmentGuaranteedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGovernmentGuaranteedPercentage() {
        return governmentGuaranteedPercentage;
    }

    /**
     * Sets the value of the governmentGuaranteedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGovernmentGuaranteedPercentage(BigDecimal value) {
        this.governmentGuaranteedPercentage = value;
    }

    /**
     * Gets the value of the guarantorsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuarantorsIndicator() {
        return guarantorsIndicator;
    }

    /**
     * Sets the value of the guarantorsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuarantorsIndicator(Boolean value) {
        this.guarantorsIndicator = value;
    }

    /**
     * Gets the value of the guarantorsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuarantorsCount() {
        return guarantorsCount;
    }

    /**
     * Sets the value of the guarantorsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuarantorsCount(BigInteger value) {
        this.guarantorsCount = value;
    }

    /**
     * Gets the value of the guarantorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuarantorDetailsType }
     * 
     * 
     */
    public List<GuarantorDetailsType> getGuarantorDetails() {
        if (guarantorDetails == null) {
            guarantorDetails = new ArrayList<GuarantorDetailsType>();
        }
        return this.guarantorDetails;
    }

    /**
     * Gets the value of the recentActivityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecentActivityIndicator() {
        return recentActivityIndicator;
    }

    /**
     * Sets the value of the recentActivityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecentActivityIndicator(Boolean value) {
        this.recentActivityIndicator = value;
    }

}
