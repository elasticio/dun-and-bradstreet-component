
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the current legal form of a subject.
 *          
 * 
 * <p>Java class for LegalFormDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFormDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalFormText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="RegistrationLocation" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFormDetailsType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "legalFormText",
    "registrationLocation"
})
public class LegalFormDetailsType {

    @XmlElement(name = "LegalFormText", required = true)
    protected DNBDecodedStringType legalFormText;
    @XmlElement(name = "RegistrationLocation")
    protected Location registrationLocation;

    /**
     * Gets the value of the legalFormText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalFormText() {
        return legalFormText;
    }

    /**
     * Sets the value of the legalFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalFormText(DNBDecodedStringType value) {
        this.legalFormText = value;
    }

    /**
     * Gets the value of the registrationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getRegistrationLocation() {
        return registrationLocation;
    }

    /**
     * Sets the value of the registrationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setRegistrationLocation(Location value) {
        this.registrationLocation = value;
    }

}
