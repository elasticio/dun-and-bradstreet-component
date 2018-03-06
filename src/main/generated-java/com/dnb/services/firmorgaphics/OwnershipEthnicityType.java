
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipEthnicityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnershipEthnicityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EthnicityTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipEthnicityType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "ethnicityTypeText"
})
public class OwnershipEthnicityType {

    @XmlElement(name = "EthnicityTypeText")
    protected DNBDecodedStringType ethnicityTypeText;

    /**
     * Gets the value of the ethnicityTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEthnicityTypeText() {
        return ethnicityTypeText;
    }

    /**
     * Sets the value of the ethnicityTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEthnicityTypeText(DNBDecodedStringType value) {
        this.ethnicityTypeText = value;
    }

}
