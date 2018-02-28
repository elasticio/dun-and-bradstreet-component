
package com.dnb.services.report;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryMethodCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType"/>
 *         &lt;element name="EmailAddress" type="{http://services.dnb.com/ReportProductServiceV2.0}EmailAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "deliveryMethodCode",
    "emailAddress"
})
public class DeliveryDetail {

    @XmlElement(name = "DeliveryMethodCode", required = true)
    protected BigInteger deliveryMethodCode;
    @XmlElement(name = "EmailAddress")
    protected EmailAddressType emailAddress;

    /**
     * Gets the value of the deliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * Sets the value of the deliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryMethodCode(BigInteger value) {
        this.deliveryMethodCode = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setEmailAddress(EmailAddressType value) {
        this.emailAddress = value;
    }

}
