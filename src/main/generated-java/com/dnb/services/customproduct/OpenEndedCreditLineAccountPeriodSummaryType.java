
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenEndedCreditLineAccountPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenEndedCreditLineAccountPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsWithBalanceCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "OpenEndedCreditLineAccountPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "openAccountsWithBalanceCount",
    "openAccountsCount",
    "closedAccountsCount",
    "totalCurrentBalanceAmount",
    "worstPaymentPeriodCode",
    "maximumExposureAmount",
    "totalExposureAmount",
    "guaranteedAccountsCount",
    "guaranteedAccountsPercentage"
})
public class OpenEndedCreditLineAccountPeriodSummaryType {

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
