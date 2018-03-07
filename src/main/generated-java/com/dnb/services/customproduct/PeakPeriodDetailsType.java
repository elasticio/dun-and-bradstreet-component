
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeakPeriodDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeakPeriodDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeakPeriodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeakPeriodDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "peakPeriodText"
})
public class PeakPeriodDetailsType {

    @XmlElement(name = "PeakPeriodText", required = true)
    protected DNBDecodedStringType peakPeriodText;

    /**
     * Gets the value of the peakPeriodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPeakPeriodText() {
        return peakPeriodText;
    }

    /**
     * Sets the value of the peakPeriodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPeakPeriodText(DNBDecodedStringType value) {
        this.peakPeriodText = value;
    }

}
