
package com.dnb.services.ratings.actions;

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
 *         &lt;element name="ExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighCreditMaximumAmount" type="{http://services.dnb.com/AssessmentProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageHighCreditAmount" type="{http://services.dnb.com/AssessmentProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SlowExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowNegativeExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueTotalAmount" type="{http://services.dnb.com/AssessmentProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPaymentsWithHighCredit", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "experienceCount",
    "highCreditMaximumAmount",
    "averageHighCreditAmount",
    "slowExperienceCount",
    "pastDueTotalCount",
    "slowNegativeExperienceCount",
    "pastDueTotalAmount"
})
public class PurchaserDerivedPaymentsWithHighCredit {

    @XmlElement(name = "ExperienceCount")
    protected Integer experienceCount;
    @XmlElement(name = "HighCreditMaximumAmount")
    protected AmountType highCreditMaximumAmount;
    @XmlElement(name = "AverageHighCreditAmount")
    protected AmountType averageHighCreditAmount;
    @XmlElement(name = "SlowExperienceCount")
    protected Integer slowExperienceCount;
    @XmlElement(name = "PastDueTotalCount")
    protected Integer pastDueTotalCount;
    @XmlElement(name = "SlowNegativeExperienceCount")
    protected Integer slowNegativeExperienceCount;
    @XmlElement(name = "PastDueTotalAmount")
    protected AmountType pastDueTotalAmount;

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

    /**
     * Gets the value of the slowExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowExperienceCount() {
        return slowExperienceCount;
    }

    /**
     * Sets the value of the slowExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowExperienceCount(Integer value) {
        this.slowExperienceCount = value;
    }

    /**
     * Gets the value of the pastDueTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastDueTotalCount() {
        return pastDueTotalCount;
    }

    /**
     * Sets the value of the pastDueTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastDueTotalCount(Integer value) {
        this.pastDueTotalCount = value;
    }

    /**
     * Gets the value of the slowNegativeExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowNegativeExperienceCount() {
        return slowNegativeExperienceCount;
    }

    /**
     * Sets the value of the slowNegativeExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowNegativeExperienceCount(Integer value) {
        this.slowNegativeExperienceCount = value;
    }

    /**
     * Gets the value of the pastDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPastDueTotalAmount() {
        return pastDueTotalAmount;
    }

    /**
     * Sets the value of the pastDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPastDueTotalAmount(AmountType value) {
        this.pastDueTotalAmount = value;
    }

}
