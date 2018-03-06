
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialStatementHeaderGrowthRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialStatementHeaderGrowthRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialStatementToDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FinancialStatementFromDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
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
@XmlType(name = "FinancialStatementHeaderGrowthRate", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "financialStatementToDate",
    "financialStatementFromDate",
    "timePeriodText"
})
public class FinancialStatementHeaderGrowthRate {

    @XmlElement(name = "FinancialStatementToDate")
    protected DNBDateType financialStatementToDate;
    @XmlElement(name = "FinancialStatementFromDate")
    protected DNBDateType financialStatementFromDate;
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
     * Gets the value of the financialStatementFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFinancialStatementFromDate() {
        return financialStatementFromDate;
    }

    /**
     * Sets the value of the financialStatementFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFinancialStatementFromDate(DNBDateType value) {
        this.financialStatementFromDate = value;
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
