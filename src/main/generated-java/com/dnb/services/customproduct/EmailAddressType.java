
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details regarding electronic mail addresses used for electronic messaging communication with the subject.
 *          
 * 
 * <p>Java class for EmailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelecommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddressType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "telecommunicationAddress"
})
public class EmailAddressType {

    @XmlElement(name = "TelecommunicationAddress")
    protected String telecommunicationAddress;

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

}
