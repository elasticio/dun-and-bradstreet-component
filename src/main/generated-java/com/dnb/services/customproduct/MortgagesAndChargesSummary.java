
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgagesAndChargesSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgagesAndChargesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalFilingCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalFilingRegisteredCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalFilingClosedCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MostRecentFilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgagesAndChargesSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalFilingCount",
    "totalFilingRegisteredCount",
    "totalFilingClosedCount",
    "mostRecentFilingDate"
})
public class MortgagesAndChargesSummary {

    @XmlElement(name = "TotalFilingCount")
    protected BigInteger totalFilingCount;
    @XmlElement(name = "TotalFilingRegisteredCount")
    protected BigInteger totalFilingRegisteredCount;
    @XmlElement(name = "TotalFilingClosedCount")
    protected BigInteger totalFilingClosedCount;
    @XmlElement(name = "MostRecentFilingDate")
    protected DNBDateType mostRecentFilingDate;

    /**
     * Gets the value of the totalFilingCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFilingCount() {
        return totalFilingCount;
    }

    /**
     * Sets the value of the totalFilingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFilingCount(BigInteger value) {
        this.totalFilingCount = value;
    }

    /**
     * Gets the value of the totalFilingRegisteredCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFilingRegisteredCount() {
        return totalFilingRegisteredCount;
    }

    /**
     * Sets the value of the totalFilingRegisteredCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFilingRegisteredCount(BigInteger value) {
        this.totalFilingRegisteredCount = value;
    }

    /**
     * Gets the value of the totalFilingClosedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFilingClosedCount() {
        return totalFilingClosedCount;
    }

    /**
     * Sets the value of the totalFilingClosedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFilingClosedCount(BigInteger value) {
        this.totalFilingClosedCount = value;
    }

    /**
     * Gets the value of the mostRecentFilingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentFilingDate() {
        return mostRecentFilingDate;
    }

    /**
     * Sets the value of the mostRecentFilingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentFilingDate(DNBDateType value) {
        this.mostRecentFilingDate = value;
    }

}
