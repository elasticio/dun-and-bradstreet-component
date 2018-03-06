
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectAddressUsageTenureDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectAddressUsageTenureDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TenureTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectAddressUsageTenureDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "tenureTypeText"
})
public class SubjectAddressUsageTenureDetail {

    @XmlElement(name = "TenureTypeText", required = true)
    protected DNBDecodedStringType tenureTypeText;

    /**
     * Gets the value of the tenureTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTenureTypeText() {
        return tenureTypeText;
    }

    /**
     * Sets the value of the tenureTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTenureTypeText(DNBDecodedStringType value) {
        this.tenureTypeText = value;
    }

}
