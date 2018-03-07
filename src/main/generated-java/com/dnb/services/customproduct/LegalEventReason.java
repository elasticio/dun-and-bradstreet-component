
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of various underlying factors that contributed to the Legal Event.
 *          
 * 
 * <p>Java class for LegalEventReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEventReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalEventReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LegalEventReasonDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *         &lt;element name="NonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEventReason", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "legalEventReasonText",
    "legalEventReasonDescription",
    "nonPaymentAmount"
})
public class LegalEventReason {

    @XmlElement(name = "LegalEventReasonText")
    protected DNBDecodedStringType legalEventReasonText;
    @XmlElement(name = "LegalEventReasonDescription")
    protected DNBStringType256 legalEventReasonDescription;
    @XmlElement(name = "NonPaymentAmount")
    protected AmountType nonPaymentAmount;

    /**
     * Gets the value of the legalEventReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalEventReasonText() {
        return legalEventReasonText;
    }

    /**
     * Sets the value of the legalEventReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalEventReasonText(DNBDecodedStringType value) {
        this.legalEventReasonText = value;
    }

    /**
     * Gets the value of the legalEventReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getLegalEventReasonDescription() {
        return legalEventReasonDescription;
    }

    /**
     * Sets the value of the legalEventReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setLegalEventReasonDescription(DNBStringType256 value) {
        this.legalEventReasonDescription = value;
    }

    /**
     * Gets the value of the nonPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonPaymentAmount() {
        return nonPaymentAmount;
    }

    /**
     * Sets the value of the nonPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonPaymentAmount(AmountType value) {
        this.nonPaymentAmount = value;
    }

}
