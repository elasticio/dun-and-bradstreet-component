
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareCapitalTrendDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareCapitalTrendDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecentCapitalStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *         &lt;element name="PriorCapitalStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *         &lt;element name="TypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="CapitalDifferenceAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType"/>
 *         &lt;element name="DNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareCapitalTrendDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "recentCapitalStartDate",
    "priorCapitalStartDate",
    "typeText",
    "capitalDifferenceAmount",
    "dnbCodeValue",
    "dnbCodeTableNumber"
})
public class ShareCapitalTrendDetails {

    @XmlElement(name = "RecentCapitalStartDate", required = true)
    protected DNBDateType recentCapitalStartDate;
    @XmlElement(name = "PriorCapitalStartDate", required = true)
    protected DNBDateType priorCapitalStartDate;
    @XmlElement(name = "TypeText")
    protected String typeText;
    @XmlElement(name = "CapitalDifferenceAmount", required = true)
    protected AmountType capitalDifferenceAmount;
    @XmlElement(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlElement(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;

    /**
     * Gets the value of the recentCapitalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getRecentCapitalStartDate() {
        return recentCapitalStartDate;
    }

    /**
     * Sets the value of the recentCapitalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setRecentCapitalStartDate(DNBDateType value) {
        this.recentCapitalStartDate = value;
    }

    /**
     * Gets the value of the priorCapitalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getPriorCapitalStartDate() {
        return priorCapitalStartDate;
    }

    /**
     * Sets the value of the priorCapitalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setPriorCapitalStartDate(DNBDateType value) {
        this.priorCapitalStartDate = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

    /**
     * Gets the value of the capitalDifferenceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalDifferenceAmount() {
        return capitalDifferenceAmount;
    }

    /**
     * Sets the value of the capitalDifferenceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalDifferenceAmount(AmountType value) {
        this.capitalDifferenceAmount = value;
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

}
