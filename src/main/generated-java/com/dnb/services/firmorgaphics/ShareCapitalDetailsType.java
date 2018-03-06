
package com.dnb.services.firmorgaphics;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the current Capital information.
 *          
 * 
 * <p>Java class for ShareCapitalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareCapitalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapitalAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StringBaseType256" />
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareCapitalDetailsType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "capitalAmount",
    "startDate"
})
public class ShareCapitalDetailsType {

    @XmlElement(name = "CapitalAmount")
    protected AmountType capitalAmount;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlAttribute(name = "TypeText")
    protected String typeText;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;

    /**
     * Gets the value of the capitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalAmount() {
        return capitalAmount;
    }

    /**
     * Sets the value of the capitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalAmount(AmountType value) {
        this.capitalAmount = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
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

}
