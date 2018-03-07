
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedPlacedForCollectionPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedPlacedForCollectionPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighCreditTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditMaximumAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPlacedForCollectionPayments", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "experienceCount",
    "highCreditTotalAmount",
    "highCreditMaximumAmount"
})
public class PurchaserDerivedPlacedForCollectionPayments {

    @XmlElement(name = "ExperienceCount")
    protected Integer experienceCount;
    @XmlElement(name = "HighCreditTotalAmount")
    protected AmountType highCreditTotalAmount;
    @XmlElement(name = "HighCreditMaximumAmount")
    protected AmountType highCreditMaximumAmount;

    /**
     * Gets the value of the experienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceCount() {
        return experienceCount;
    }

    /**
     * Sets the value of the experienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceCount(Integer value) {
        this.experienceCount = value;
    }

    /**
     * Gets the value of the highCreditTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditTotalAmount() {
        return highCreditTotalAmount;
    }

    /**
     * Sets the value of the highCreditTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditTotalAmount(AmountType value) {
        this.highCreditTotalAmount = value;
    }

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

}
