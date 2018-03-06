
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedPaymentsWithHighCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedPaymentsWithHighCredit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HighCreditMaximumAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageHighCreditAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPaymentsWithHighCredit", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "highCreditMaximumAmount",
    "averageHighCreditAmount"
})
public class PurchaserDerivedPaymentsWithHighCredit {

    @XmlElement(name = "HighCreditMaximumAmount")
    protected AmountType highCreditMaximumAmount;
    @XmlElement(name = "AverageHighCreditAmount")
    protected AmountType averageHighCreditAmount;

    /**
     * Gets the value of the highCreditMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditMaximumAmount() {
        return highCreditMaximumAmount;
    }

    /**
     * Sets the value of the highCreditMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditMaximumAmount(AmountType value) {
        this.highCreditMaximumAmount = value;
    }

    /**
     * Gets the value of the averageHighCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageHighCreditAmount() {
        return averageHighCreditAmount;
    }

    /**
     * Sets the value of the averageHighCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageHighCreditAmount(AmountType value) {
        this.averageHighCreditAmount = value;
    }

}
