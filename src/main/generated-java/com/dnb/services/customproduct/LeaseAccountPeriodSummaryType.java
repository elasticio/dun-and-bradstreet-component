
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeaseAccountPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaseAccountPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalOriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LatestMaximumOriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "LeaseAccountPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "openAccountsCount",
    "closedAccountsCount",
    "totalCurrentBalanceAmount",
    "maximumBalanceAmount",
    "totalOriginalAmount",
    "latestMaximumOriginalAmount",
    "totalUtilizationPercentage",
    "totalPastDueAmount",
    "pastDuePaymentCycle1Summary",
    "pastDuePaymentCycle2Summary",
    "pastDuePaymentCycle3Summary",
    "pastDuePaymentCycle4Summary",
    "worstPaymentPeriodCode",
    "guaranteedAccountsCount",
    "guaranteedAccountsPercentage"
})
public class LeaseAccountPeriodSummaryType {

    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "UnitOfSizeText")
    protected DNBDecodedStringType unitOfSizeText;
    @XmlElement(name = "OpenAccountsCount")
    protected BigInteger openAccountsCount;
    @XmlElement(name = "ClosedAccountsCount")
    protected BigInteger closedAccountsCount;
    @XmlElement(name = "TotalCurrentBalanceAmount")
    protected BigDecimal totalCurrentBalanceAmount;
    @XmlElement(name = "MaximumBalanceAmount")
    protected BigDecimal maximumBalanceAmount;
    @XmlElement(name = "TotalOriginalAmount")
    protected BigDecimal totalOriginalAmount;
    @XmlElement(name = "LatestMaximumOriginalAmount")
    protected BigDecimal latestMaximumOriginalAmount;
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
     * Gets the value of the totalOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOriginalAmount() {
        return totalOriginalAmount;
    }

    /**
     * Sets the value of the totalOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOriginalAmount(BigDecimal value) {
        this.totalOriginalAmount = value;
    }

    /**
     * Gets the value of the latestMaximumOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatestMaximumOriginalAmount() {
        return latestMaximumOriginalAmount;
    }

    /**
     * Sets the value of the latestMaximumOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatestMaximumOriginalAmount(BigDecimal value) {
        this.latestMaximumOriginalAmount = value;
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
