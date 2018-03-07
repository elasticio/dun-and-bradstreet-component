
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details regarding the expiration of the filings.
 *          
 * 
 * <p>Java class for FilingExpirationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingExpirationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoExpirationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpirationText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingExpirationDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "noExpirationIndicator",
    "expirationText",
    "expirationDate"
})
public class FilingExpirationDetails {

    @XmlElement(name = "NoExpirationIndicator")
    protected Boolean noExpirationIndicator;
    @XmlElement(name = "ExpirationText")
    protected DNBStringType expirationText;
    @XmlElement(name = "ExpirationDate")
    protected DNBDateType expirationDate;

    /**
     * Gets the value of the noExpirationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoExpirationIndicator() {
        return noExpirationIndicator;
    }

    /**
     * Sets the value of the noExpirationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoExpirationIndicator(Boolean value) {
        this.noExpirationIndicator = value;
    }

    /**
     * Gets the value of the expirationText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getExpirationText() {
        return expirationText;
    }

    /**
     * Sets the value of the expirationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setExpirationText(DNBStringType value) {
        this.expirationText = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setExpirationDate(DNBDateType value) {
        this.expirationDate = value;
    }

}
