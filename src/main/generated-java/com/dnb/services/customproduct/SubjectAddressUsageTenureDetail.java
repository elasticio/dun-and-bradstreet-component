
package com.dnb.services.customproduct;

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
 *         &lt;element name="TenureTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="TenureExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectAddressUsageTenureDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "tenureTypeText",
    "tenureExpirationDate"
})
public class SubjectAddressUsageTenureDetail {

    @XmlElement(name = "TenureTypeText", required = true)
    protected DNBDecodedStringType tenureTypeText;
    @XmlElement(name = "TenureExpirationDate")
    protected DNBDateType tenureExpirationDate;

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

    /**
     * Gets the value of the tenureExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getTenureExpirationDate() {
        return tenureExpirationDate;
    }

    /**
     * Sets the value of the tenureExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setTenureExpirationDate(DNBDateType value) {
        this.tenureExpirationDate = value;
    }

}
