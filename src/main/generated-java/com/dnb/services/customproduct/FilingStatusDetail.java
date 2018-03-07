
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to record the textual status, language and nature of the status of the filed document.
 *          
 * 
 * <p>Java class for FilingStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingStatusDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="FilingStatusDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingStatusDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingStatusText",
    "filingStatusDate"
})
public class FilingStatusDetail {

    @XmlElement(name = "FilingStatusText")
    protected DNBStringType filingStatusText;
    @XmlElement(name = "FilingStatusDate")
    protected DNBDateType filingStatusDate;

    /**
     * Gets the value of the filingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getFilingStatusText() {
        return filingStatusText;
    }

    /**
     * Sets the value of the filingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setFilingStatusText(DNBStringType value) {
        this.filingStatusText = value;
    }

    /**
     * Gets the value of the filingStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingStatusDate() {
        return filingStatusDate;
    }

    /**
     * Sets the value of the filingStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingStatusDate(DNBDateType value) {
        this.filingStatusDate = value;
    }

}
