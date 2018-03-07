
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinesOfCreditAccountPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinesOfCreditAccountPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsWithBalanceCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *         &lt;element name="PastDuePaymentCycle1Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle2Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle3Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle4Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType" minOccurs="0"/>
 *         &lt;element name="WorstPaymentPeriodCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="MaximumExposureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalExposureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "LinesOfCreditAccountPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "openAccountsWithBalanceCount",
    "openAccountsCount",
    "closedAccountsCount",
    "totalCurrentBalanceAmount",
    "maximumBalanceAmount",
    "totalCreditLimitAmount",
    "latestCreditLimitAmount",
    "latestMaximumCreditLimitAmount",
    "totalUtilizationPercentage",
    "totalPastDueAmount",
    "pastDuePaymentCycle1Summary",
    "pastDuePaymentCycle2Summary",
    "pastDuePaymentCycle3Summary",
    "pastDuePaymentCycle4Summary",
    "worstPaymentPeriodCode",
    "maximumExposureAmount",
    "totalExposureAmount",
    "guaranteedAccountsCount",
    "guaranteedAccountsPercentage"
})
public class LinesOfCreditAccountPeriodSummaryType {

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
    @XmlElement(name = "PastDuePaymentCycle1Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle1Summary;
    @XmlElement(name = "PastDuePaymentCycle2Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle2Summary;
    @XmlElement(name = "PastDuePaymentCycle3Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle3Summary;
    @XmlElement(name = "PastDuePaymentCycle4Summary")
    protected PastDuePaymentCycleSummaryType pastDuePaymentCycle4Summary;
    @XmlElement(name = "WorstPaymentPeriodCode")
    protected String worstPaymentPeriodCode;
    @XmlElement(name = "MaximumExposureAmount")
    protected BigDecimal maximumExposureAmount;
    @XmlElement(name = "TotalExposureAmount")
    protected BigDecimal totalExposureAmount;
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
