
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType"/>
 *         &lt;element name="SummaryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryText",
    "summaryDate"
})
public class RegistrationSummary {

    @XmlElement(name = "SummaryText", required = true)
    protected String summaryText;
    @XmlElement(name = "SummaryDate", required = true)
    protected DNBDateType summaryDate;

    /**
     * Gets the value of the summaryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryText() {
        return summaryText;
    }

    /**
     * Sets the value of the summaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryText(String value) {
        this.summaryText = value;
    }

    /**
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSummaryDate(DNBDateType value) {
        this.summaryDate = value;
    }

}
