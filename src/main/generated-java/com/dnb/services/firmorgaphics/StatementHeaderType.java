
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for StatementHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialStatementToDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FinancialPeriodDuration" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="TimePeriodText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementHeaderType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "financialStatementToDate",
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "financialPeriodDuration",
    "timePeriodText"
})
@XmlSeeAlso({
    StatementHeaderDetails.class
})
public class StatementHeaderType {

    @XmlElement(name = "FinancialStatementToDate")
    protected DNBDateType financialStatementToDate;
    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "UnitOfSizeText")
    protected DNBDecodedStringType unitOfSizeText;
    @XmlElement(name = "FinancialPeriodDuration")
    protected Duration financialPeriodDuration;
    @XmlElement(name = "TimePeriodText")
    protected DNBDecodedStringType timePeriodText;

    /**
     * Gets the value of the financialStatementToDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFinancialStatementToDate() {
        return financialStatementToDate;
    }

    /**
     * Sets the value of the financialStatementToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFinancialStatementToDate(DNBDateType value) {
        this.financialStatementToDate = value;
    }

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
     * Gets the value of the financialPeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFinancialPeriodDuration() {
        return financialPeriodDuration;
    }

    /**
     * Sets the value of the financialPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFinancialPeriodDuration(Duration value) {
        this.financialPeriodDuration = value;
    }

    /**
     * Gets the value of the timePeriodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTimePeriodText() {
        return timePeriodText;
    }

    /**
     * Sets the value of the timePeriodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTimePeriodText(DNBDecodedStringType value) {
        this.timePeriodText = value;
    }

}
