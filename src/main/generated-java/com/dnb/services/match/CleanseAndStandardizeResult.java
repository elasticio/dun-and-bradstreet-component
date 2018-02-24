
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleanseAndStandardizeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleanseAndStandardizeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardizedName" type="{http://services.dnb.com/CompanyServiceV2.0}StandardizedNameType" minOccurs="0"/>
 *         &lt;element name="StandardizedAddress" type="{http://services.dnb.com/CompanyServiceV2.0}StandardizedAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanseAndStandardizeResult", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "standardizedName",
    "standardizedAddress"
})
public class CleanseAndStandardizeResult {

    @XmlElement(name = "StandardizedName")
    protected StandardizedNameType standardizedName;
    @XmlElement(name = "StandardizedAddress")
    protected StandardizedAddress standardizedAddress;

    /**
     * Gets the value of the standardizedName property.
     * 
     * @return
     *     possible object is
     *     {@link StandardizedNameType }
     *     
     */
    public StandardizedNameType getStandardizedName() {
        return standardizedName;
    }

    /**
     * Sets the value of the standardizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardizedNameType }
     *     
     */
    public void setStandardizedName(StandardizedNameType value) {
        this.standardizedName = value;
    }

    /**
     * Gets the value of the standardizedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StandardizedAddress }
     *     
     */
    public StandardizedAddress getStandardizedAddress() {
        return standardizedAddress;
    }

    /**
     * Sets the value of the standardizedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardizedAddress }
     *     
     */
    public void setStandardizedAddress(StandardizedAddress value) {
        this.standardizedAddress = value;
    }

}
