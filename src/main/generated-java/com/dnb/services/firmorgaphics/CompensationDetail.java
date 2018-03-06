
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompensationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompensationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompensationTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CompensationAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensationDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "compensationTypeText",
    "compensationAmount"
})
public class CompensationDetail {

    @XmlElement(name = "CompensationTypeText")
    protected DNBDecodedStringType compensationTypeText;
    @XmlElement(name = "CompensationAmount")
    protected AmountType compensationAmount;

    /**
     * Gets the value of the compensationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCompensationTypeText() {
        return compensationTypeText;
    }

    /**
     * Sets the value of the compensationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCompensationTypeText(DNBDecodedStringType value) {
        this.compensationTypeText = value;
    }

    /**
     * Gets the value of the compensationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCompensationAmount() {
        return compensationAmount;
    }

    /**
     * Sets the value of the compensationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCompensationAmount(AmountType value) {
        this.compensationAmount = value;
    }

}
