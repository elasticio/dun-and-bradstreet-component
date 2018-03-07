
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Purchaser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Purchaser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentPaydexScore" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrentPaydexScoreType" minOccurs="0"/>
 *         &lt;element name="PaydexScoreHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}PaydexScoreHistoryType" minOccurs="0"/>
 *         &lt;element name="CurrentCreditRangePaydexScore" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrentCreditRangePaydexScoreType" minOccurs="0"/>
 *         &lt;element name="CurrentCompositePaydexScore" type="{http://services.dnb.com/CustomProductServiceV2.0}CompositePaydexScoreType" minOccurs="0"/>
 *         &lt;element name="CompositePaydexScoreHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}CompositePaydexScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentExperience" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentExperienceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaserDerivedData" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentExperienceSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentExperienceSummary" minOccurs="0"/>
 *         &lt;element name="IndustryPaymentExperienceSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryPaymentExperienceSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DetailedTradePaymentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditRangePaymentExperienceSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditRangePaymentExperienceSummaryType" minOccurs="0"/>
 *         &lt;element name="NetTermsPaymentExperienceSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentMannerExperienceSummaryType" minOccurs="0"/>
 *         &lt;element name="DiscountedTermsPaymentExperienceSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentMannerExperienceSummaryType" minOccurs="0"/>
 *         &lt;element name="PaydexScoreSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaydexScoreSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purchaser", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currentPaydexScore",
    "paydexScoreHistory",
    "currentCreditRangePaydexScore",
    "currentCompositePaydexScore",
    "compositePaydexScoreHistory",
    "paymentExperience",
    "purchaserDerivedData",
    "paymentExperienceSummary",
    "industryPaymentExperienceSummary",
    "detailedTradePaymentSummary",
    "creditRangePaymentExperienceSummary",
    "netTermsPaymentExperienceSummary",
    "discountedTermsPaymentExperienceSummary",
    "paydexScoreSummary"
})
public class Purchaser {

    @XmlElement(name = "CurrentPaydexScore")
    protected CurrentPaydexScoreType currentPaydexScore;
    @XmlElement(name = "PaydexScoreHistory")
    protected PaydexScoreHistoryType paydexScoreHistory;
    @XmlElement(name = "CurrentCreditRangePaydexScore")
    protected CurrentCreditRangePaydexScoreType currentCreditRangePaydexScore;
    @XmlElement(name = "CurrentCompositePaydexScore")
    protected CompositePaydexScoreType currentCompositePaydexScore;
    @XmlElement(name = "CompositePaydexScoreHistory")
    protected List<CompositePaydexScoreType> compositePaydexScoreHistory;
    @XmlElement(name = "PaymentExperience")
    protected List<PaymentExperienceType> paymentExperience;
    @XmlElement(name = "PurchaserDerivedData")
    protected List<PurchaserDerivedData> purchaserDerivedData;
    @XmlElement(name = "PaymentExperienceSummary")
    protected PaymentExperienceSummary paymentExperienceSummary;
    @XmlElement(name = "IndustryPaymentExperienceSummary")
    protected List<IndustryPaymentExperienceSummaryType> industryPaymentExperienceSummary;
    @XmlElement(name = "DetailedTradePaymentSummary")
    protected List<PaymentSummaryType> detailedTradePaymentSummary;
    @XmlElement(name = "CreditRangePaymentExperienceSummary")
    protected CreditRangePaymentExperienceSummaryType creditRangePaymentExperienceSummary;
    @XmlElement(name = "NetTermsPaymentExperienceSummary")
    protected PaymentMannerExperienceSummaryType netTermsPaymentExperienceSummary;
    @XmlElement(name = "DiscountedTermsPaymentExperienceSummary")
    protected PaymentMannerExperienceSummaryType discountedTermsPaymentExperienceSummary;
    @XmlElement(name = "PaydexScoreSummary")
    protected PaydexScoreSummaryType paydexScoreSummary;

    /**
     * Gets the value of the currentPaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentPaydexScoreType }
     *     
     */
    public CurrentPaydexScoreType getCurrentPaydexScore() {
        return currentPaydexScore;
    }

    /**
     * Sets the value of the currentPaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentPaydexScoreType }
     *     
     */
    public void setCurrentPaydexScore(CurrentPaydexScoreType value) {
        this.currentPaydexScore = value;
    }

    /**
     * Gets the value of the paydexScoreHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PaydexScoreHistoryType }
     *     
     */
    public PaydexScoreHistoryType getPaydexScoreHistory() {
        return paydexScoreHistory;
    }

    /**
     * Sets the value of the paydexScoreHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaydexScoreHistoryType }
     *     
     */
    public void setPaydexScoreHistory(PaydexScoreHistoryType value) {
        this.paydexScoreHistory = value;
    }

    /**
     * Gets the value of the currentCreditRangePaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentCreditRangePaydexScoreType }
     *     
     */
    public CurrentCreditRangePaydexScoreType getCurrentCreditRangePaydexScore() {
        return currentCreditRangePaydexScore;
    }

    /**
     * Sets the value of the currentCreditRangePaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentCreditRangePaydexScoreType }
     *     
     */
    public void setCurrentCreditRangePaydexScore(CurrentCreditRangePaydexScoreType value) {
        this.currentCreditRangePaydexScore = value;
    }

    /**
     * Gets the value of the currentCompositePaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link CompositePaydexScoreType }
     *     
     */
    public CompositePaydexScoreType getCurrentCompositePaydexScore() {
        return currentCompositePaydexScore;
    }

    /**
     * Sets the value of the currentCompositePaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositePaydexScoreType }
     *     
     */
    public void setCurrentCompositePaydexScore(CompositePaydexScoreType value) {
        this.currentCompositePaydexScore = value;
    }

    /**
     * Gets the value of the compositePaydexScoreHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositePaydexScoreHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositePaydexScoreHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositePaydexScoreType }
     * 
     * 
     */
    public List<CompositePaydexScoreType> getCompositePaydexScoreHistory() {
        if (compositePaydexScoreHistory == null) {
            compositePaydexScoreHistory = new ArrayList<CompositePaydexScoreType>();
        }
        return this.compositePaydexScoreHistory;
    }

    /**
     * Gets the value of the paymentExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentExperienceType }
     * 
     * 
     */
    public List<PaymentExperienceType> getPaymentExperience() {
        if (paymentExperience == null) {
            paymentExperience = new ArrayList<PaymentExperienceType>();
        }
        return this.paymentExperience;
    }

    /**
     * Gets the value of the purchaserDerivedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaserDerivedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaserDerivedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaserDerivedData }
     * 
     * 
     */
    public List<PurchaserDerivedData> getPurchaserDerivedData() {
        if (purchaserDerivedData == null) {
            purchaserDerivedData = new ArrayList<PurchaserDerivedData>();
        }
        return this.purchaserDerivedData;
    }

    /**
     * Gets the value of the paymentExperienceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExperienceSummary }
     *     
     */
    public PaymentExperienceSummary getPaymentExperienceSummary() {
        return paymentExperienceSummary;
    }

    /**
     * Sets the value of the paymentExperienceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExperienceSummary }
     *     
     */
    public void setPaymentExperienceSummary(PaymentExperienceSummary value) {
        this.paymentExperienceSummary = value;
    }

    /**
     * Gets the value of the industryPaymentExperienceSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryPaymentExperienceSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryPaymentExperienceSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryPaymentExperienceSummaryType }
     * 
     * 
     */
    public List<IndustryPaymentExperienceSummaryType> getIndustryPaymentExperienceSummary() {
        if (industryPaymentExperienceSummary == null) {
            industryPaymentExperienceSummary = new ArrayList<IndustryPaymentExperienceSummaryType>();
        }
        return this.industryPaymentExperienceSummary;
    }

    /**
     * Gets the value of the detailedTradePaymentSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedTradePaymentSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedTradePaymentSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSummaryType }
     * 
     * 
     */
    public List<PaymentSummaryType> getDetailedTradePaymentSummary() {
        if (detailedTradePaymentSummary == null) {
            detailedTradePaymentSummary = new ArrayList<PaymentSummaryType>();
        }
        return this.detailedTradePaymentSummary;
    }

    /**
     * Gets the value of the creditRangePaymentExperienceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRangePaymentExperienceSummaryType }
     *     
     */
    public CreditRangePaymentExperienceSummaryType getCreditRangePaymentExperienceSummary() {
        return creditRangePaymentExperienceSummary;
    }

    /**
     * Sets the value of the creditRangePaymentExperienceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRangePaymentExperienceSummaryType }
     *     
     */
    public void setCreditRangePaymentExperienceSummary(CreditRangePaymentExperienceSummaryType value) {
        this.creditRangePaymentExperienceSummary = value;
    }

    /**
     * Gets the value of the netTermsPaymentExperienceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMannerExperienceSummaryType }
     *     
     */
    public PaymentMannerExperienceSummaryType getNetTermsPaymentExperienceSummary() {
        return netTermsPaymentExperienceSummary;
    }

    /**
     * Sets the value of the netTermsPaymentExperienceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMannerExperienceSummaryType }
     *     
     */
    public void setNetTermsPaymentExperienceSummary(PaymentMannerExperienceSummaryType value) {
        this.netTermsPaymentExperienceSummary = value;
    }

    /**
     * Gets the value of the discountedTermsPaymentExperienceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMannerExperienceSummaryType }
     *     
     */
    public PaymentMannerExperienceSummaryType getDiscountedTermsPaymentExperienceSummary() {
        return discountedTermsPaymentExperienceSummary;
    }

    /**
     * Sets the value of the discountedTermsPaymentExperienceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMannerExperienceSummaryType }
     *     
     */
    public void setDiscountedTermsPaymentExperienceSummary(PaymentMannerExperienceSummaryType value) {
        this.discountedTermsPaymentExperienceSummary = value;
    }

    /**
     * Gets the value of the paydexScoreSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaydexScoreSummaryType }
     *     
     */
    public PaydexScoreSummaryType getPaydexScoreSummary() {
        return paydexScoreSummary;
    }

    /**
     * Sets the value of the paydexScoreSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaydexScoreSummaryType }
     *     
     */
    public void setPaydexScoreSummary(PaydexScoreSummaryType value) {
        this.paydexScoreSummary = value;
    }

}
