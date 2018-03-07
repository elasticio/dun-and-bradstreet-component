
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JudicialActionSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JudicialActionSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalFilingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "JudicialActionSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalFilingCount",
    "mostRecentFilingDate"
})
public class JudicialActionSummaryType {

    @XmlElement(name = "TotalFilingCount")
    protected Integer totalFilingCount;
    @XmlElement(name = "MostRecentFilingDate")
    protected DNBDateType mostRecentFilingDate;

    /**
     * Gets the value of the totalFilingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalFilingCount() {
        return totalFilingCount;
    }

    /**
     * Sets the value of the totalFilingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalFilingCount(Integer value) {
        this.totalFilingCount = value;
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
