
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotesToAccountsStatementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotesToAccountsStatementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *         &lt;element name="ItemAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScheduleTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *         &lt;element name="AveragePaymentDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DerivedFinancialItemIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="ExternalCodingSchemeTypeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalCodingSchemeValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentDNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotesToAccountsStatementItem", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "itemAmount",
    "displaySequence",
    "scheduleTypeText",
    "averagePaymentDays",
    "derivedFinancialItemIndicator"
})
public class NotesToAccountsStatementItem {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBStringType256 itemDescriptionText;
    @XmlElement(name = "ItemAmount")
    protected AmountType itemAmount;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "ScheduleTypeText")
    protected DNBDecodedStringNewType scheduleTypeText;
    @XmlElement(name = "AveragePaymentDays")
    protected String averagePaymentDays;
    @XmlElement(name = "DerivedFinancialItemIndicator")
    protected Boolean derivedFinancialItemIndicator;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "ExternalCodingSchemeTypeText")
    protected String externalCodingSchemeTypeText;
    @XmlAttribute(name = "ExternalCodingSchemeValue")
    protected String externalCodingSchemeValue;
    @XmlAttribute(name = "ParentDNBCodeValue")
    protected BigInteger parentDNBCodeValue;

    /**
     * Gets the value of the itemDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getItemDescriptionText() {
        return itemDescriptionText;
    }

    /**
     * Sets the value of the itemDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setItemDescriptionText(DNBStringType256 value) {
        this.itemDescriptionText = value;
    }

    /**
     * Gets the value of the itemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemAmount() {
        return itemAmount;
    }

    /**
     * Sets the value of the itemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemAmount(AmountType value) {
        this.itemAmount = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the scheduleTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getScheduleTypeText() {
        return scheduleTypeText;
    }

    /**
     * Sets the value of the scheduleTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setScheduleTypeText(DNBDecodedStringNewType value) {
        this.scheduleTypeText = value;
    }

    /**
     * Gets the value of the averagePaymentDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAveragePaymentDays() {
        return averagePaymentDays;
    }

    /**
     * Sets the value of the averagePaymentDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAveragePaymentDays(String value) {
        this.averagePaymentDays = value;
    }

    /**
     * Gets the value of the derivedFinancialItemIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivedFinancialItemIndicator() {
        return derivedFinancialItemIndicator;
    }

    /**
     * Sets the value of the derivedFinancialItemIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDerivedFinancialItemIndicator(Boolean value) {
        this.derivedFinancialItemIndicator = value;
    }

    /**
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDNBCodeTableNumber(Integer value) {
        this.dnbCodeTableNumber = value;
    }

    /**
     * Gets the value of the dnbCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeValue() {
        return dnbCodeValue;
    }

    /**
     * Sets the value of the dnbCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeValue(BigInteger value) {
        this.dnbCodeValue = value;
    }

    /**
     * Gets the value of the externalCodingSchemeTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodingSchemeTypeText() {
        return externalCodingSchemeTypeText;
    }

    /**
     * Sets the value of the externalCodingSchemeTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodingSchemeTypeText(String value) {
        this.externalCodingSchemeTypeText = value;
    }

    /**
     * Gets the value of the externalCodingSchemeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodingSchemeValue() {
        return externalCodingSchemeValue;
    }

    /**
     * Sets the value of the externalCodingSchemeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodingSchemeValue(String value) {
        this.externalCodingSchemeValue = value;
    }

    /**
     * Gets the value of the parentDNBCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentDNBCodeValue() {
        return parentDNBCodeValue;
    }

    /**
     * Sets the value of the parentDNBCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentDNBCodeValue(BigInteger value) {
        this.parentDNBCodeValue = value;
    }

}
