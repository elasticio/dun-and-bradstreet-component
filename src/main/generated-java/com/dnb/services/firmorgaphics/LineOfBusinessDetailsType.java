
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineOfBusinessDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineOfBusinessDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusinessDescription" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineOfBusinessDetailsType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "lineOfBusinessDescription"
})
public class LineOfBusinessDetailsType {

    @XmlElement(name = "LineOfBusinessDescription")
    protected DNBStringType lineOfBusinessDescription;

    /**
     * Gets the value of the lineOfBusinessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getLineOfBusinessDescription() {
        return lineOfBusinessDescription;
    }

    /**
     * Sets the value of the lineOfBusinessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setLineOfBusinessDescription(DNBStringType value) {
        this.lineOfBusinessDescription = value;
    }

}
