//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.22 at 01:48:05 PM EET 
//


package com.dnb.services.industry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/IndustryProductServiceV2.0}SimpleAddress">
 *       &lt;sequence>
 *         &lt;element name="ISOCountrySubDivisionCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAddress", propOrder = {
    "isoCountrySubDivisionCode"
})
public class RequestAddress
    extends SimpleAddress
{

    @XmlElement(name = "ISOCountrySubDivisionCode", required = true)
    protected String isoCountrySubDivisionCode;

    /**
     * Gets the value of the isoCountrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountrySubDivisionCode() {
        return isoCountrySubDivisionCode;
    }

    /**
     * Sets the value of the isoCountrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountrySubDivisionCode(String value) {
        this.isoCountrySubDivisionCode = value;
    }

}
