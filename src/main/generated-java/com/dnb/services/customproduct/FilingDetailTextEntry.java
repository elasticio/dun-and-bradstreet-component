
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingDetailTextEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingDetailTextEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="FilingDetailTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingDetailTextEntry", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingDetailText",
    "filingDetailTypeText"
})
public class FilingDetailTextEntry {

    @XmlElement(name = "FilingDetailText")
    protected String filingDetailText;
    @XmlElement(name = "FilingDetailTypeText")
    protected DNBDecodedStringType filingDetailTypeText;

    /**
     * Gets the value of the filingDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDetailText() {
        return filingDetailText;
    }

    /**
     * Sets the value of the filingDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDetailText(String value) {
        this.filingDetailText = value;
    }

    /**
     * Gets the value of the filingDetailTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingDetailTypeText() {
        return filingDetailTypeText;
    }

    /**
     * Sets the value of the filingDetailTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingDetailTypeText(DNBDecodedStringType value) {
        this.filingDetailTypeText = value;
    }

}
