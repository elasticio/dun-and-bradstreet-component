
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LettersOfCreditAccountPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LettersOfCreditAccountPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumExposureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalExposureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GuaranteedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GuaranteedAccountsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LettersOfCreditAccountPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "totalCurrentBalanceAmount",
    "maximumExposureAmount",
    "totalExposureAmount",
    "guaranteedAccountsCount",
    "guaranteedAccountsPercentage"
})
public class LettersOfCreditAccountPeriodSummaryType {

    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "UnitOfSizeText")
    protected DNBDecodedStringType unitOfSizeText;
    @XmlElement(name = "TotalCurrentBalanceAmount")
    protected BigDecimal totalCurrentBalanceAmount;
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
