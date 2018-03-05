
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebPageAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebPageAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelecommunicationAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnreachableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebPageAddressType", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "telecommunicationAddress",
    "unreachableIndicator"
})
public class WebPageAddressType {

    @XmlElement(name = "TelecommunicationAddress", required = true)
    protected String telecommunicationAddress;
    @XmlElement(name = "UnreachableIndicator")
    protected Boolean unreachableIndicator;

    /**
     * Gets the value of the telecommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelecommunicationAddress() {
        return telecommunicationAddress;
    }

    /**
     * Sets the value of the telecommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelecommunicationAddress(String value) {
        this.telecommunicationAddress = value;
    }

    /**
     * Gets the value of the unreachableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnreachableIndicator() {
        return unreachableIndicator;
    }

    /**
     * Sets the value of the unreachableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnreachableIndicator(Boolean value) {
        this.unreachableIndicator = value;
    }

}
