
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyProcessSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyProcessSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "InsolvencyProcessSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "mostRecentFilingDate"
})
public class InsolvencyProcessSummaryType {

    @XmlElement(name = "MostRecentFilingDate")
    protected DNBDateType mostRecentFilingDate;

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
