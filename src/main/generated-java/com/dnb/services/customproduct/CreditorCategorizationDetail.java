
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of several different classifications of parties that claim the subject owes them money. The priority in which the claimants are paid is based on the classification to which they belong.
 *          
 * 
 * <p>Java class for CreditorCategorizationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorCategorizationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditorTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ClaimAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorCategorizationDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "creditorTypeText",
    "claimAmount"
})
public class CreditorCategorizationDetail {

    @XmlElement(name = "CreditorTypeText")
    protected DNBDecodedStringType creditorTypeText;
    @XmlElement(name = "ClaimAmount")
    protected AmountType claimAmount;

    /**
     * Gets the value of the creditorTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCreditorTypeText() {
        return creditorTypeText;
    }

    /**
     * Sets the value of the creditorTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCreditorTypeText(DNBDecodedStringType value) {
        this.creditorTypeText = value;
    }

    /**
     * Gets the value of the claimAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimAmount() {
        return claimAmount;
    }

    /**
     * Sets the value of the claimAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimAmount(AmountType value) {
        this.claimAmount = value;
    }

}
