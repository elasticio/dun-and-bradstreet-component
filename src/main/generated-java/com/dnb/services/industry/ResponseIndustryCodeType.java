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
 * <p>Java class for ResponseIndustryCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseIndustryCodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/IndustryProductServiceV2.0}PrimaryIndustryCodeType">
 *       &lt;sequence>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseIndustryCodeType", propOrder = {
    "displaySequence"
})
public class ResponseIndustryCodeType
    extends PrimaryIndustryCodeType
{

    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}