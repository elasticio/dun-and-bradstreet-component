
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousNonEmploymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousNonEmploymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NonEmploymentReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NonEmploymentStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="NonEmploymentEndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousNonEmploymentDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "nonEmploymentReasonText",
    "nonEmploymentStartDate",
    "nonEmploymentEndDate"
})
public class PreviousNonEmploymentDetailsType {

    @XmlElement(name = "NonEmploymentReasonText")
    protected DNBDecodedStringType nonEmploymentReasonText;
    @XmlElement(name = "NonEmploymentStartDate")
    protected DNBDateType nonEmploymentStartDate;
    @XmlElement(name = "NonEmploymentEndDate")
    protected DNBDateType nonEmploymentEndDate;

    /**
     * Gets the value of the nonEmploymentReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNonEmploymentReasonText() {
        return nonEmploymentReasonText;
    }

    /**
     * Sets the value of the nonEmploymentReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNonEmploymentReasonText(DNBDecodedStringType value) {
        this.nonEmploymentReasonText = value;
    }

    /**
     * Gets the value of the nonEmploymentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getNonEmploymentStartDate() {
        return nonEmploymentStartDate;
    }

    /**
     * Sets the value of the nonEmploymentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setNonEmploymentStartDate(DNBDateType value) {
        this.nonEmploymentStartDate = value;
    }

    /**
     * Gets the value of the nonEmploymentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getNonEmploymentEndDate() {
        return nonEmploymentEndDate;
    }

    /**
     * Sets the value of the nonEmploymentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setNonEmploymentEndDate(DNBDateType value) {
        this.nonEmploymentEndDate = value;
    }

}
