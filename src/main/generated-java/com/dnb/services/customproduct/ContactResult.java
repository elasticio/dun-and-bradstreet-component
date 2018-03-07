
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactResultTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="DeferredUntilDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DataScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactResult", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "contactResultTypeText",
    "deferredUntilDate",
    "dataScopeText"
})
public class ContactResult {

    @XmlElement(name = "ContactResultTypeText")
    protected DNBDecodedStringType contactResultTypeText;
    @XmlElement(name = "DeferredUntilDate")
    protected DNBDateType deferredUntilDate;
    @XmlElement(name = "DataScopeText")
    protected DNBDecodedStringType dataScopeText;

    /**
     * Gets the value of the contactResultTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getContactResultTypeText() {
        return contactResultTypeText;
    }

    /**
     * Sets the value of the contactResultTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setContactResultTypeText(DNBDecodedStringType value) {
        this.contactResultTypeText = value;
    }

    /**
     * Gets the value of the deferredUntilDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDeferredUntilDate() {
        return deferredUntilDate;
    }

    /**
     * Sets the value of the deferredUntilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDeferredUntilDate(DNBDateType value) {
        this.deferredUntilDate = value;
    }

    /**
     * Gets the value of the dataScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataScopeText() {
        return dataScopeText;
    }

    /**
     * Sets the value of the dataScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataScopeText(DNBDecodedStringType value) {
        this.dataScopeText = value;
    }

}
