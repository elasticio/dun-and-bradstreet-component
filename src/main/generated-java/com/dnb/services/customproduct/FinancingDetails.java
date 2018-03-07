
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop that can repeat multiple times to allow the recording of different means by which an organization raises money for it be able to run or invest in itself.
 *          
 * 
 * <p>Java class for FinancingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancingMethodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financingMethodText"
})
public class FinancingDetails {

    @XmlElement(name = "FinancingMethodText", required = true)
    protected DNBDecodedStringType financingMethodText;

    /**
     * Gets the value of the financingMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFinancingMethodText() {
        return financingMethodText;
    }

    /**
     * Sets the value of the financingMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFinancingMethodText(DNBDecodedStringType value) {
        this.financingMethodText = value;
    }

}
