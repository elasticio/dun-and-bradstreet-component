
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousSelfEmploymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousSelfEmploymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelfEmploymentStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SelfEmploymentEndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousSelfEmploymentDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "selfEmploymentStartDate",
    "selfEmploymentEndDate"
})
public class PreviousSelfEmploymentDetailsType {

    @XmlElement(name = "SelfEmploymentStartDate")
    protected DNBDateType selfEmploymentStartDate;
    @XmlElement(name = "SelfEmploymentEndDate")
    protected DNBDateType selfEmploymentEndDate;

    /**
     * Gets the value of the selfEmploymentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSelfEmploymentStartDate() {
        return selfEmploymentStartDate;
    }

    /**
     * Sets the value of the selfEmploymentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSelfEmploymentStartDate(DNBDateType value) {
        this.selfEmploymentStartDate = value;
    }

    /**
     * Gets the value of the selfEmploymentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSelfEmploymentEndDate() {
        return selfEmploymentEndDate;
    }

    /**
     * Sets the value of the selfEmploymentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSelfEmploymentEndDate(DNBDateType value) {
        this.selfEmploymentEndDate = value;
    }

}
