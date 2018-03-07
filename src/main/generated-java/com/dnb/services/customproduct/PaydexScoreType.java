
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaydexScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaydexScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaydexDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviorText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviorDaysQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReliabilityText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TotalUniqueSuppliersUsedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalPaymentExperiencesUsedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DetailedTradeSourceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
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
@XmlType(name = "PaydexScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "paydexScore",
    "paydexDate",
    "paymentBehaviorText",
    "paymentBehaviorDaysQuantity",
    "reliabilityText",
    "totalUniqueSuppliersUsedCount",
    "totalPaymentExperiencesUsedCount",
    "detailedTradeSourceIndicator",
    "displaySequence"
})
public class PaydexScoreType {

    @XmlElement(name = "PaydexScore")
    protected int paydexScore;
    @XmlElement(name = "PaydexDate")
    protected DNBDateType paydexDate;
    @XmlElement(name = "PaymentBehaviorText")
    protected String paymentBehaviorText;
    @XmlElement(name = "PaymentBehaviorDaysQuantity")
    protected Integer paymentBehaviorDaysQuantity;
    @XmlElement(name = "ReliabilityText")
    protected DNBDecodedStringType reliabilityText;
    @XmlElement(name = "TotalUniqueSuppliersUsedCount")
    protected Long totalUniqueSuppliersUsedCount;
    @XmlElement(name = "TotalPaymentExperiencesUsedCount")
    protected Long totalPaymentExperiencesUsedCount;
    @XmlElement(name = "DetailedTradeSourceIndicator")
    protected Boolean detailedTradeSourceIndicator;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the paydexScore property.
     * 
     */
    public int getPaydexScore() {
        return paydexScore;
    }

    /**
     * Sets the value of the paydexScore property.
     * 
     */
    public void setPaydexScore(int value) {
        this.paydexScore = value;
    }

    /**
     * Gets the value of the paydexDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getPaydexDate() {
        return paydexDate;
    }

    /**
     * Sets the value of the paydexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setPaydexDate(DNBDateType value) {
        this.paydexDate = value;
    }

    /**
     * Gets the value of the paymentBehaviorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBehaviorText() {
        return paymentBehaviorText;
    }

    /**
     * Sets the value of the paymentBehaviorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBehaviorText(String value) {
        this.paymentBehaviorText = value;
    }

    /**
     * Gets the value of the paymentBehaviorDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentBehaviorDaysQuantity() {
        return paymentBehaviorDaysQuantity;
    }

    /**
     * Sets the value of the paymentBehaviorDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentBehaviorDaysQuantity(Integer value) {
        this.paymentBehaviorDaysQuantity = value;
    }

    /**
     * Gets the value of the reliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getReliabilityText() {
        return reliabilityText;
    }

    /**
     * Sets the value of the reliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setReliabilityText(DNBDecodedStringType value) {
        this.reliabilityText = value;
    }

    /**
     * Gets the value of the totalUniqueSuppliersUsedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalUniqueSuppliersUsedCount() {
        return totalUniqueSuppliersUsedCount;
    }

    /**
     * Sets the value of the totalUniqueSuppliersUsedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalUniqueSuppliersUsedCount(Long value) {
        this.totalUniqueSuppliersUsedCount = value;
    }

    /**
     * Gets the value of the totalPaymentExperiencesUsedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPaymentExperiencesUsedCount() {
        return totalPaymentExperiencesUsedCount;
    }

    /**
     * Sets the value of the totalPaymentExperiencesUsedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPaymentExperiencesUsedCount(Long value) {
        this.totalPaymentExperiencesUsedCount = value;
    }

    /**
     * Gets the value of the detailedTradeSourceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailedTradeSourceIndicator() {
        return detailedTradeSourceIndicator;
    }

    /**
     * Sets the value of the detailedTradeSourceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailedTradeSourceIndicator(Boolean value) {
        this.detailedTradeSourceIndicator = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
