
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the number of accounts collected over time.
 *          
 * 
 * <p>Java class for CustomerAccountSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccountDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *         &lt;element name="CustomerAccountQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "customerAccountDate",
    "customerAccountQuantity"
})
public class CustomerAccountSummary {

    @XmlElement(name = "CustomerAccountDate", required = true)
    protected DNBDateType customerAccountDate;
    @XmlElement(name = "CustomerAccountQuantity")
    protected int customerAccountQuantity;

    /**
     * Gets the value of the customerAccountDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCustomerAccountDate() {
        return customerAccountDate;
    }

    /**
     * Sets the value of the customerAccountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCustomerAccountDate(DNBDateType value) {
        this.customerAccountDate = value;
    }

    /**
     * Gets the value of the customerAccountQuantity property.
     * 
     */
    public int getCustomerAccountQuantity() {
        return customerAccountQuantity;
    }

    /**
     * Sets the value of the customerAccountQuantity property.
     * 
     */
    public void setCustomerAccountQuantity(int value) {
        this.customerAccountQuantity = value;
    }

}
