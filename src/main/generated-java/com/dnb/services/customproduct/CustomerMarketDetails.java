
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of several different logical group of customers to which the subject organization sells its goods and / or services, including the portion of sales to the logical grouping of customers.
 *          
 * 
 * <p>Java class for CustomerMarketDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMarketDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerMarketTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMarketDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "customerMarketTypeText"
})
public class CustomerMarketDetails {

    @XmlElement(name = "CustomerMarketTypeText", required = true)
    protected DNBDecodedStringType customerMarketTypeText;

    /**
     * Gets the value of the customerMarketTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCustomerMarketTypeText() {
        return customerMarketTypeText;
    }

    /**
     * Sets the value of the customerMarketTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCustomerMarketTypeText(DNBDecodedStringType value) {
        this.customerMarketTypeText = value;
    }

}
