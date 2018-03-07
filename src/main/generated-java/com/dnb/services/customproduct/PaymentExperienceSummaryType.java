
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentExperienceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentExperienceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HighCreditAverageAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SlowPaymentsExistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NegativePaymentsExistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExperiencesTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsWithinTermsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlacedForCollectionTotalAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SummarizedPastDue" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedPastDueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlacedForCollectionExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalHighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CashExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CashExperiencesTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="UnfavorableExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnfavorableExperiencesTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PastDueTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SlowPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NegativePaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SatisfactoryPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowNegativePaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentExperienceSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "experiencesTotalCount",
    "highCreditAverageAmount",
    "highCreditAmount",
    "slowPaymentsExistIndicator",
    "negativePaymentsExistIndicator",
    "experiencesTotalAmount",
    "paymentsWithinTermsPercentage",
    "placedForCollectionTotalAmount",
    "summarizedPastDue",
    "placedForCollectionExperiencesTotalCount",
    "totalHighCreditAmount",
    "cashExperiencesTotalCount",
    "cashExperiencesTotalAmount",
    "unfavorableExperiencesTotalCount",
    "unfavorableExperiencesTotalAmount",
    "pastDueTotalCount",
    "pastDueTotalAmount",
    "slowPaymentsCount",
    "negativePaymentsCount",
    "satisfactoryPaymentsCount",
    "slowNegativePaymentsCount"
})
public class PaymentExperienceSummaryType {

    @XmlElement(name = "ExperiencesTotalCount")
    protected Long experiencesTotalCount;
    @XmlElement(name = "HighCreditAverageAmount")
    protected AmountType highCreditAverageAmount;
    @XmlElement(name = "HighCreditAmount")
    protected AmountType highCreditAmount;
    @XmlElement(name = "SlowPaymentsExistIndicator")
    protected Boolean slowPaymentsExistIndicator;
    @XmlElement(name = "NegativePaymentsExistIndicator")
    protected Boolean negativePaymentsExistIndicator;
    @XmlElement(name = "ExperiencesTotalAmount")
    protected AmountType experiencesTotalAmount;
    @XmlElement(name = "PaymentsWithinTermsPercentage")
    protected BigDecimal paymentsWithinTermsPercentage;
    @XmlElement(name = "PlacedForCollectionTotalAmount")
    protected Long placedForCollectionTotalAmount;
    @XmlElement(name = "SummarizedPastDue")
    protected List<SummarizedPastDueType> summarizedPastDue;
    @XmlElement(name = "PlacedForCollectionExperiencesTotalCount")
    protected Integer placedForCollectionExperiencesTotalCount;
    @XmlElement(name = "TotalHighCreditAmount")
    protected AmountType totalHighCreditAmount;
    @XmlElement(name = "CashExperiencesTotalCount")
    protected Integer cashExperiencesTotalCount;
    @XmlElement(name = "CashExperiencesTotalAmount")
    protected AmountType cashExperiencesTotalAmount;
    @XmlElement(name = "UnfavorableExperiencesTotalCount")
    protected Integer unfavorableExperiencesTotalCount;
    @XmlElement(name = "UnfavorableExperiencesTotalAmount")
    protected AmountType unfavorableExperiencesTotalAmount;
    @XmlElement(name = "PastDueTotalCount")
    protected Integer pastDueTotalCount;
    @XmlElement(name = "PastDueTotalAmount")
    protected AmountType pastDueTotalAmount;
    @XmlElement(name = "SlowPaymentsCount")
    protected Integer slowPaymentsCount;
    @XmlElement(name = "NegativePaymentsCount")
    protected Integer negativePaymentsCount;
    @XmlElement(name = "SatisfactoryPaymentsCount")
    protected Integer satisfactoryPaymentsCount;
    @XmlElement(name = "SlowNegativePaymentsCount")
    protected Integer slowNegativePaymentsCount;

    /**
     * Gets the value of the experiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExperiencesTotalCount() {
        return experiencesTotalCount;
    }

    /**
     * Sets the value of the experiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExperiencesTotalCount(Long value) {
        this.experiencesTotalCount = value;
    }

    /**
     * Gets the value of the highCreditAverageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditAverageAmount() {
        return highCreditAverageAmount;
    }

    /**
     * Sets the value of the highCreditAverageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditAverageAmount(AmountType value) {
        this.highCreditAverageAmount = value;
    }

    /**
     * Gets the value of the highCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditAmount() {
        return highCreditAmount;
    }

    /**
     * Sets the value of the highCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditAmount(AmountType value) {
        this.highCreditAmount = value;
    }

    /**
     * Gets the value of the slowPaymentsExistIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlowPaymentsExistIndicator() {
        return slowPaymentsExistIndicator;
    }

    /**
     * Sets the value of the slowPaymentsExistIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlowPaymentsExistIndicator(Boolean value) {
        this.slowPaymentsExistIndicator = value;
    }

    /**
     * Gets the value of the negativePaymentsExistIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegativePaymentsExistIndicator() {
        return negativePaymentsExistIndicator;
    }

    /**
     * Sets the value of the negativePaymentsExistIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegativePaymentsExistIndicator(Boolean value) {
        this.negativePaymentsExistIndicator = value;
    }

    /**
     * Gets the value of the experiencesTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExperiencesTotalAmount() {
        return experiencesTotalAmount;
    }

    /**
     * Sets the value of the experiencesTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExperiencesTotalAmount(AmountType value) {
        this.experiencesTotalAmount = value;
    }

    /**
     * Gets the value of the paymentsWithinTermsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentsWithinTermsPercentage() {
        return paymentsWithinTermsPercentage;
    }

    /**
     * Sets the value of the paymentsWithinTermsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentsWithinTermsPercentage(BigDecimal value) {
        this.paymentsWithinTermsPercentage = value;
    }

    /**
     * Gets the value of the placedForCollectionTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlacedForCollectionTotalAmount() {
        return placedForCollectionTotalAmount;
    }

    /**
     * Sets the value of the placedForCollectionTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlacedForCollectionTotalAmount(Long value) {
        this.placedForCollectionTotalAmount = value;
    }

    /**
     * Gets the value of the summarizedPastDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarizedPastDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarizedPastDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarizedPastDueType }
     * 
     * 
     */
    public List<SummarizedPastDueType> getSummarizedPastDue() {
        if (summarizedPastDue == null) {
            summarizedPastDue = new ArrayList<SummarizedPastDueType>();
        }
        return this.summarizedPastDue;
    }

    /**
     * Gets the value of the placedForCollectionExperiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlacedForCollectionExperiencesTotalCount() {
        return placedForCollectionExperiencesTotalCount;
    }

    /**
     * Sets the value of the placedForCollectionExperiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlacedForCollectionExperiencesTotalCount(Integer value) {
        this.placedForCollectionExperiencesTotalCount = value;
    }

    /**
     * Gets the value of the totalHighCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalHighCreditAmount() {
        return totalHighCreditAmount;
    }

    /**
     * Sets the value of the totalHighCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalHighCreditAmount(AmountType value) {
        this.totalHighCreditAmount = value;
    }

    /**
     * Gets the value of the cashExperiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCashExperiencesTotalCount() {
        return cashExperiencesTotalCount;
    }

    /**
     * Sets the value of the cashExperiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCashExperiencesTotalCount(Integer value) {
        this.cashExperiencesTotalCount = value;
    }

    /**
     * Gets the value of the cashExperiencesTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashExperiencesTotalAmount() {
        return cashExperiencesTotalAmount;
    }

    /**
     * Sets the value of the cashExperiencesTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashExperiencesTotalAmount(AmountType value) {
        this.cashExperiencesTotalAmount = value;
    }

    /**
     * Gets the value of the unfavorableExperiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnfavorableExperiencesTotalCount() {
        return unfavorableExperiencesTotalCount;
    }

    /**
     * Sets the value of the unfavorableExperiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnfavorableExperiencesTotalCount(Integer value) {
        this.unfavorableExperiencesTotalCount = value;
    }

    /**
     * Gets the value of the unfavorableExperiencesTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnfavorableExperiencesTotalAmount() {
        return unfavorableExperiencesTotalAmount;
    }

    /**
     * Sets the value of the unfavorableExperiencesTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnfavorableExperiencesTotalAmount(AmountType value) {
        this.unfavorableExperiencesTotalAmount = value;
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

    /**
     * Gets the value of the slowPaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowPaymentsCount() {
        return slowPaymentsCount;
    }

    /**
     * Sets the value of the slowPaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowPaymentsCount(Integer value) {
        this.slowPaymentsCount = value;
    }

    /**
     * Gets the value of the negativePaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativePaymentsCount() {
        return negativePaymentsCount;
    }

    /**
     * Sets the value of the negativePaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativePaymentsCount(Integer value) {
        this.negativePaymentsCount = value;
    }

    /**
     * Gets the value of the satisfactoryPaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSatisfactoryPaymentsCount() {
        return satisfactoryPaymentsCount;
    }

    /**
     * Sets the value of the satisfactoryPaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSatisfactoryPaymentsCount(Integer value) {
        this.satisfactoryPaymentsCount = value;
    }

    /**
     * Gets the value of the slowNegativePaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowNegativePaymentsCount() {
        return slowNegativePaymentsCount;
    }

    /**
     * Sets the value of the slowNegativePaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowNegativePaymentsCount(Integer value) {
        this.slowNegativePaymentsCount = value;
    }

}
