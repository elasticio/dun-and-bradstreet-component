
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAccountPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAccountPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsWithBalanceCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="VoluntarilyClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="InvoluntarilyClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCreditLimitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LatestCreditLimitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LatestMaximumCreditLimitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalUtilizationPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalPastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumPastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle1Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle2Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle3Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle4Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="WorstPaymentPeriodCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="TotalChargeOffAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChargedOffAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ChargedOffAccountsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SatisfactoryAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SatisfactoryAccountsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AveragePaymentToCreditLimitRatioAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumPaymentToCreditLimitRatioAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumPaymentToCreditLimitRatioAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AveragePaymentToBalanceRatioAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumPaymentToBalanceRatioAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumPaymentToBalanceRatioAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AverageBalanceVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumBalanceVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumExposureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalExposureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AverageLiquidityCreditLimitVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumLiquidityCreditLimitVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumLiquidityCreditLimitVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AverageBalanceLiquidityVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceLiquidityVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumBalanceLiquidityVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GuaranteedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GuaranteedAccountsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "openAccountsWithBalanceCount",
    "openAccountsCount",
    "closedAccountsCount",
    "voluntarilyClosedAccountsCount",
    "involuntarilyClosedAccountsCount",
    "totalCurrentBalanceAmount",
    "maximumBalanceAmount",
    "totalCreditLimitAmount",
    "latestCreditLimitAmount",
    "latestMaximumCreditLimitAmount",
    "totalUtilizationPercentage",
    "totalPastDueAmount",
    "maximumPastDueAmount",
    "pastDuePaymentCycle1Summary",
    "pastDuePaymentCycle2Summary",
    "pastDuePaymentCycle3Summary",
    "pastDuePaymentCycle4Summary",
    "worstPaymentPeriodCode",
    "totalChargeOffAmount",
    "chargedOffAccountsCount",
    "chargedOffAccountsPercentage",
    "satisfactoryAccountsCount",
    "satisfactoryAccountsPercentage",
    "averagePaymentToCreditLimitRatioAmount",
    "maximumPaymentToCreditLimitRatioAmount",
    "minimumPaymentToCreditLimitRatioAmount",
    "averagePaymentToBalanceRatioAmount",
    "maximumPaymentToBalanceRatioAmount",
    "minimumPaymentToBalanceRatioAmount",
    "averageBalanceVelocityAmount",
    "maximumBalanceVelocityAmount",
    "minimumBalanceVelocityAmount",
    "maximumExposureAmount",
    "totalExposureAmount",
    "averageLiquidityCreditLimitVelocityAmount",
    "maximumLiquidityCreditLimitVelocityAmount",
    "minimumLiquidityCreditLimitVelocityAmount",
    "averageBalanceLiquidityVelocityAmount",
    "maximumBalanceLiquidityVelocityAmount",
    "minimumBalanceLiquidityVelocityAmount",
    "guaranteedAccountsCount",
    "guaranteedAccountsPercentage"
})
public class FinancialAccountPeriodSummaryType {

    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "UnitOfSizeText")
    protected DNBDecodedStringType unitOfSizeText;
    @XmlElement(name = "OpenAccountsWithBalanceCount")
    protected BigInteger openAccountsWithBalanceCount;
    @XmlElement(name = "OpenAccountsCount")
    protected BigInteger openAccountsCount;
    @XmlElement(name = "ClosedAccountsCount")
    protected BigInteger closedAccountsCount;
    @XmlElement(name = "VoluntarilyClosedAccountsCount")
    protected BigInteger voluntarilyClosedAccountsCount;
    @XmlElement(name = "InvoluntarilyClosedAccountsCount")
    protected BigInteger involuntarilyClosedAccountsCount;
    @XmlElement(name = "TotalCurrentBalanceAmount")
    protected BigDecimal totalCurrentBalanceAmount;
    @XmlElement(name = "MaximumBalanceAmount")
    protected BigDecimal maximumBalanceAmount;
    @XmlElement(name = "TotalCreditLimitAmount")
    protected BigDecimal totalCreditLimitAmount;
    @XmlElement(name = "LatestCreditLimitAmount")
    protected BigDecimal latestCreditLimitAmount;
    @XmlElement(name = "LatestMaximumCreditLimitAmount")
    protected BigDecimal latestMaximumCreditLimitAmount;
    @XmlElement(name = "TotalUtilizationPercentage")
    protected BigDecimal totalUtilizationPercentage;
    @XmlElement(name = "TotalPastDueAmount")
    protected BigDecimal totalPastDueAmount;
    @XmlElement(name = "MaximumPastDueAmount")
    protected BigDecimal maximumPastDueAmount;
    @XmlElement(name = "PastDuePaymentCycle1Summary")
    protected PastDuePaymentType pastDuePaymentCycle1Summary;
    @XmlElement(name = "PastDuePaymentCycle2Summary")
    protected PastDuePaymentType pastDuePaymentCycle2Summary;
    @XmlElement(name = "PastDuePaymentCycle3Summary")
    protected PastDuePaymentType pastDuePaymentCycle3Summary;
    @XmlElement(name = "PastDuePaymentCycle4Summary")
    protected PastDuePaymentType pastDuePaymentCycle4Summary;
    @XmlElement(name = "WorstPaymentPeriodCode")
    protected String worstPaymentPeriodCode;
    @XmlElement(name = "TotalChargeOffAmount")
    protected BigDecimal totalChargeOffAmount;
    @XmlElement(name = "ChargedOffAccountsCount")
    protected BigInteger chargedOffAccountsCount;
    @XmlElement(name = "ChargedOffAccountsPercentage")
    protected BigDecimal chargedOffAccountsPercentage;
    @XmlElement(name = "SatisfactoryAccountsCount")
    protected BigInteger satisfactoryAccountsCount;
    @XmlElement(name = "SatisfactoryAccountsPercentage")
    protected BigDecimal satisfactoryAccountsPercentage;
    @XmlElement(name = "AveragePaymentToCreditLimitRatioAmount")
    protected BigDecimal averagePaymentToCreditLimitRatioAmount;
    @XmlElement(name = "MaximumPaymentToCreditLimitRatioAmount")
    protected BigDecimal maximumPaymentToCreditLimitRatioAmount;
    @XmlElement(name = "MinimumPaymentToCreditLimitRatioAmount")
    protected BigDecimal minimumPaymentToCreditLimitRatioAmount;
    @XmlElement(name = "AveragePaymentToBalanceRatioAmount")
    protected BigDecimal averagePaymentToBalanceRatioAmount;
    @XmlElement(name = "MaximumPaymentToBalanceRatioAmount")
    protected BigDecimal maximumPaymentToBalanceRatioAmount;
    @XmlElement(name = "MinimumPaymentToBalanceRatioAmount")
    protected BigDecimal minimumPaymentToBalanceRatioAmount;
    @XmlElement(name = "AverageBalanceVelocityAmount")
    protected BigDecimal averageBalanceVelocityAmount;
    @XmlElement(name = "MaximumBalanceVelocityAmount")
    protected BigDecimal maximumBalanceVelocityAmount;
    @XmlElement(name = "MinimumBalanceVelocityAmount")
    protected BigDecimal minimumBalanceVelocityAmount;
    @XmlElement(name = "MaximumExposureAmount")
    protected BigDecimal maximumExposureAmount;
    @XmlElement(name = "TotalExposureAmount")
    protected BigDecimal totalExposureAmount;
    @XmlElement(name = "AverageLiquidityCreditLimitVelocityAmount")
    protected BigDecimal averageLiquidityCreditLimitVelocityAmount;
    @XmlElement(name = "MaximumLiquidityCreditLimitVelocityAmount")
    protected BigDecimal maximumLiquidityCreditLimitVelocityAmount;
    @XmlElement(name = "MinimumLiquidityCreditLimitVelocityAmount")
    protected BigDecimal minimumLiquidityCreditLimitVelocityAmount;
    @XmlElement(name = "AverageBalanceLiquidityVelocityAmount")
    protected BigDecimal averageBalanceLiquidityVelocityAmount;
    @XmlElement(name = "MaximumBalanceLiquidityVelocityAmount")
    protected BigDecimal maximumBalanceLiquidityVelocityAmount;
    @XmlElement(name = "MinimumBalanceLiquidityVelocityAmount")
    protected BigDecimal minimumBalanceLiquidityVelocityAmount;
    @XmlElement(name = "GuaranteedAccountsCount")
    protected BigInteger guaranteedAccountsCount;
    @XmlElement(name = "GuaranteedAccountsPercentage")
    protected BigDecimal guaranteedAccountsPercentage;

    /**
     * Gets the value of the currencyISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISOAlpha3Code() {
        return currencyISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISOAlpha3Code(String value) {
        this.currencyISOAlpha3Code = value;
    }

    /**
     * Gets the value of the unitOfSizeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getUnitOfSizeText() {
        return unitOfSizeText;
    }

    /**
     * Sets the value of the unitOfSizeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setUnitOfSizeText(DNBDecodedStringType value) {
        this.unitOfSizeText = value;
    }

    /**
     * Gets the value of the openAccountsWithBalanceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenAccountsWithBalanceCount() {
        return openAccountsWithBalanceCount;
    }

    /**
     * Sets the value of the openAccountsWithBalanceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenAccountsWithBalanceCount(BigInteger value) {
        this.openAccountsWithBalanceCount = value;
    }

    /**
     * Gets the value of the openAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenAccountsCount() {
        return openAccountsCount;
    }

    /**
     * Sets the value of the openAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenAccountsCount(BigInteger value) {
        this.openAccountsCount = value;
    }

    /**
     * Gets the value of the closedAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClosedAccountsCount() {
        return closedAccountsCount;
    }

    /**
     * Sets the value of the closedAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClosedAccountsCount(BigInteger value) {
        this.closedAccountsCount = value;
    }

    /**
     * Gets the value of the voluntarilyClosedAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVoluntarilyClosedAccountsCount() {
        return voluntarilyClosedAccountsCount;
    }

    /**
     * Sets the value of the voluntarilyClosedAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVoluntarilyClosedAccountsCount(BigInteger value) {
        this.voluntarilyClosedAccountsCount = value;
    }

    /**
     * Gets the value of the involuntarilyClosedAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInvoluntarilyClosedAccountsCount() {
        return involuntarilyClosedAccountsCount;
    }

    /**
     * Sets the value of the involuntarilyClosedAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInvoluntarilyClosedAccountsCount(BigInteger value) {
        this.involuntarilyClosedAccountsCount = value;
    }

    /**
     * Gets the value of the totalCurrentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentBalanceAmount() {
        return totalCurrentBalanceAmount;
    }

    /**
     * Sets the value of the totalCurrentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentBalanceAmount(BigDecimal value) {
        this.totalCurrentBalanceAmount = value;
    }

    /**
     * Gets the value of the maximumBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalanceAmount() {
        return maximumBalanceAmount;
    }

    /**
     * Sets the value of the maximumBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalanceAmount(BigDecimal value) {
        this.maximumBalanceAmount = value;
    }

    /**
     * Gets the value of the totalCreditLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditLimitAmount() {
        return totalCreditLimitAmount;
    }

    /**
     * Sets the value of the totalCreditLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditLimitAmount(BigDecimal value) {
        this.totalCreditLimitAmount = value;
    }

    /**
     * Gets the value of the latestCreditLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatestCreditLimitAmount() {
        return latestCreditLimitAmount;
    }

    /**
     * Sets the value of the latestCreditLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatestCreditLimitAmount(BigDecimal value) {
        this.latestCreditLimitAmount = value;
    }

    /**
     * Gets the value of the latestMaximumCreditLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatestMaximumCreditLimitAmount() {
        return latestMaximumCreditLimitAmount;
    }

    /**
     * Sets the value of the latestMaximumCreditLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatestMaximumCreditLimitAmount(BigDecimal value) {
        this.latestMaximumCreditLimitAmount = value;
    }

    /**
     * Gets the value of the totalUtilizationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalUtilizationPercentage() {
        return totalUtilizationPercentage;
    }

    /**
     * Sets the value of the totalUtilizationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalUtilizationPercentage(BigDecimal value) {
        this.totalUtilizationPercentage = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPastDueAmount(BigDecimal value) {
        this.totalPastDueAmount = value;
    }

    /**
     * Gets the value of the maximumPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPastDueAmount() {
        return maximumPastDueAmount;
    }

    /**
     * Sets the value of the maximumPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPastDueAmount(BigDecimal value) {
        this.maximumPastDueAmount = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle1Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle1Summary() {
        return pastDuePaymentCycle1Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle1Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle1Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle1Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle2Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle2Summary() {
        return pastDuePaymentCycle2Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle2Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle2Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle2Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle3Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle3Summary() {
        return pastDuePaymentCycle3Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle3Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle3Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle3Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle4Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle4Summary() {
        return pastDuePaymentCycle4Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle4Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle4Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle4Summary = value;
    }

    /**
     * Gets the value of the worstPaymentPeriodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorstPaymentPeriodCode() {
        return worstPaymentPeriodCode;
    }

    /**
     * Sets the value of the worstPaymentPeriodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorstPaymentPeriodCode(String value) {
        this.worstPaymentPeriodCode = value;
    }

    /**
     * Gets the value of the totalChargeOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalChargeOffAmount() {
        return totalChargeOffAmount;
    }

    /**
     * Sets the value of the totalChargeOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalChargeOffAmount(BigDecimal value) {
        this.totalChargeOffAmount = value;
    }

    /**
     * Gets the value of the chargedOffAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargedOffAccountsCount() {
        return chargedOffAccountsCount;
    }

    /**
     * Sets the value of the chargedOffAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargedOffAccountsCount(BigInteger value) {
        this.chargedOffAccountsCount = value;
    }

    /**
     * Gets the value of the chargedOffAccountsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargedOffAccountsPercentage() {
        return chargedOffAccountsPercentage;
    }

    /**
     * Sets the value of the chargedOffAccountsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargedOffAccountsPercentage(BigDecimal value) {
        this.chargedOffAccountsPercentage = value;
    }

    /**
     * Gets the value of the satisfactoryAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSatisfactoryAccountsCount() {
        return satisfactoryAccountsCount;
    }

    /**
     * Sets the value of the satisfactoryAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSatisfactoryAccountsCount(BigInteger value) {
        this.satisfactoryAccountsCount = value;
    }

    /**
     * Gets the value of the satisfactoryAccountsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSatisfactoryAccountsPercentage() {
        return satisfactoryAccountsPercentage;
    }

    /**
     * Sets the value of the satisfactoryAccountsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSatisfactoryAccountsPercentage(BigDecimal value) {
        this.satisfactoryAccountsPercentage = value;
    }

    /**
     * Gets the value of the averagePaymentToCreditLimitRatioAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAveragePaymentToCreditLimitRatioAmount() {
        return averagePaymentToCreditLimitRatioAmount;
    }

    /**
     * Sets the value of the averagePaymentToCreditLimitRatioAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAveragePaymentToCreditLimitRatioAmount(BigDecimal value) {
        this.averagePaymentToCreditLimitRatioAmount = value;
    }

    /**
     * Gets the value of the maximumPaymentToCreditLimitRatioAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPaymentToCreditLimitRatioAmount() {
        return maximumPaymentToCreditLimitRatioAmount;
    }

    /**
     * Sets the value of the maximumPaymentToCreditLimitRatioAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPaymentToCreditLimitRatioAmount(BigDecimal value) {
        this.maximumPaymentToCreditLimitRatioAmount = value;
    }

    /**
     * Gets the value of the minimumPaymentToCreditLimitRatioAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPaymentToCreditLimitRatioAmount() {
        return minimumPaymentToCreditLimitRatioAmount;
    }

    /**
     * Sets the value of the minimumPaymentToCreditLimitRatioAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPaymentToCreditLimitRatioAmount(BigDecimal value) {
        this.minimumPaymentToCreditLimitRatioAmount = value;
    }

    /**
     * Gets the value of the averagePaymentToBalanceRatioAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAveragePaymentToBalanceRatioAmount() {
        return averagePaymentToBalanceRatioAmount;
    }

    /**
     * Sets the value of the averagePaymentToBalanceRatioAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAveragePaymentToBalanceRatioAmount(BigDecimal value) {
        this.averagePaymentToBalanceRatioAmount = value;
    }

    /**
     * Gets the value of the maximumPaymentToBalanceRatioAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPaymentToBalanceRatioAmount() {
        return maximumPaymentToBalanceRatioAmount;
    }

    /**
     * Sets the value of the maximumPaymentToBalanceRatioAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPaymentToBalanceRatioAmount(BigDecimal value) {
        this.maximumPaymentToBalanceRatioAmount = value;
    }

    /**
     * Gets the value of the minimumPaymentToBalanceRatioAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPaymentToBalanceRatioAmount() {
        return minimumPaymentToBalanceRatioAmount;
    }

    /**
     * Sets the value of the minimumPaymentToBalanceRatioAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPaymentToBalanceRatioAmount(BigDecimal value) {
        this.minimumPaymentToBalanceRatioAmount = value;
    }

    /**
     * Gets the value of the averageBalanceVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageBalanceVelocityAmount() {
        return averageBalanceVelocityAmount;
    }

    /**
     * Sets the value of the averageBalanceVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageBalanceVelocityAmount(BigDecimal value) {
        this.averageBalanceVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumBalanceVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalanceVelocityAmount() {
        return maximumBalanceVelocityAmount;
    }

    /**
     * Sets the value of the maximumBalanceVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalanceVelocityAmount(BigDecimal value) {
        this.maximumBalanceVelocityAmount = value;
    }

    /**
     * Gets the value of the minimumBalanceVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBalanceVelocityAmount() {
        return minimumBalanceVelocityAmount;
    }

    /**
     * Sets the value of the minimumBalanceVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBalanceVelocityAmount(BigDecimal value) {
        this.minimumBalanceVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumExposureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumExposureAmount() {
        return maximumExposureAmount;
    }

    /**
     * Sets the value of the maximumExposureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumExposureAmount(BigDecimal value) {
        this.maximumExposureAmount = value;
    }

    /**
     * Gets the value of the totalExposureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExposureAmount() {
        return totalExposureAmount;
    }

    /**
     * Sets the value of the totalExposureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExposureAmount(BigDecimal value) {
        this.totalExposureAmount = value;
    }

    /**
     * Gets the value of the averageLiquidityCreditLimitVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageLiquidityCreditLimitVelocityAmount() {
        return averageLiquidityCreditLimitVelocityAmount;
    }

    /**
     * Sets the value of the averageLiquidityCreditLimitVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageLiquidityCreditLimitVelocityAmount(BigDecimal value) {
        this.averageLiquidityCreditLimitVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumLiquidityCreditLimitVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLiquidityCreditLimitVelocityAmount() {
        return maximumLiquidityCreditLimitVelocityAmount;
    }

    /**
     * Sets the value of the maximumLiquidityCreditLimitVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLiquidityCreditLimitVelocityAmount(BigDecimal value) {
        this.maximumLiquidityCreditLimitVelocityAmount = value;
    }

    /**
     * Gets the value of the minimumLiquidityCreditLimitVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLiquidityCreditLimitVelocityAmount() {
        return minimumLiquidityCreditLimitVelocityAmount;
    }

    /**
     * Sets the value of the minimumLiquidityCreditLimitVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLiquidityCreditLimitVelocityAmount(BigDecimal value) {
        this.minimumLiquidityCreditLimitVelocityAmount = value;
    }

    /**
     * Gets the value of the averageBalanceLiquidityVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageBalanceLiquidityVelocityAmount() {
        return averageBalanceLiquidityVelocityAmount;
    }

    /**
     * Sets the value of the averageBalanceLiquidityVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageBalanceLiquidityVelocityAmount(BigDecimal value) {
        this.averageBalanceLiquidityVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumBalanceLiquidityVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalanceLiquidityVelocityAmount() {
        return maximumBalanceLiquidityVelocityAmount;
    }

    /**
     * Sets the value of the maximumBalanceLiquidityVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalanceLiquidityVelocityAmount(BigDecimal value) {
        this.maximumBalanceLiquidityVelocityAmount = value;
    }

    /**
     * Gets the value of the minimumBalanceLiquidityVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBalanceLiquidityVelocityAmount() {
        return minimumBalanceLiquidityVelocityAmount;
    }

    /**
     * Sets the value of the minimumBalanceLiquidityVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBalanceLiquidityVelocityAmount(BigDecimal value) {
        this.minimumBalanceLiquidityVelocityAmount = value;
    }

    /**
     * Gets the value of the guaranteedAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuaranteedAccountsCount() {
        return guaranteedAccountsCount;
    }

    /**
     * Sets the value of the guaranteedAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuaranteedAccountsCount(BigInteger value) {
        this.guaranteedAccountsCount = value;
    }

    /**
     * Gets the value of the guaranteedAccountsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuaranteedAccountsPercentage() {
        return guaranteedAccountsPercentage;
    }

    /**
     * Sets the value of the guaranteedAccountsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuaranteedAccountsPercentage(BigDecimal value) {
        this.guaranteedAccountsPercentage = value;
    }

}
