
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for PurchaserDerivedPaymentPeriodSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedPaymentPeriodSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType"/>
 *         &lt;element name="PaymentsWithHighCredit" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedPaymentsWithHighCredit" minOccurs="0"/>
 *         &lt;element name="PaymentsByCreditRange" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedPaymentsByCreditRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentsToSupplierIndustry" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedPaymentsToSupplierIndustry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetTermsPayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedNetTermsPayments" minOccurs="0"/>
 *         &lt;element name="DiscountTermsPayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedDiscountTermsPayments" minOccurs="0"/>
 *         &lt;element name="NoPaymentMannerPayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedNoPaymentMannerPayments" minOccurs="0"/>
 *         &lt;element name="PlacedForCollectionPayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedPlacedForCollectionPayments" minOccurs="0"/>
 *         &lt;element name="UnfavorablePayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedUnfavorablePayments" minOccurs="0"/>
 *         &lt;element name="SatisfactoryPayments" type="{http://services.dnb.com/CustomProductServiceV2.0}SatisfactoryPayments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPaymentPeriodSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryPeriod",
    "paymentsWithHighCredit",
    "paymentsByCreditRange",
    "paymentsToSupplierIndustry",
    "netTermsPayments",
    "discountTermsPayments",
    "noPaymentMannerPayments",
    "placedForCollectionPayments",
    "unfavorablePayments",
    "satisfactoryPayments"
})
public class PurchaserDerivedPaymentPeriodSummary {

    @XmlElement(name = "SummaryPeriod", required = true)
    protected Duration summaryPeriod;
    @XmlElement(name = "PaymentsWithHighCredit")
    protected PurchaserDerivedPaymentsWithHighCredit paymentsWithHighCredit;
    @XmlElement(name = "PaymentsByCreditRange")
    protected List<PurchaserDerivedPaymentsByCreditRange> paymentsByCreditRange;
    @XmlElement(name = "PaymentsToSupplierIndustry")
    protected List<PurchaserDerivedPaymentsToSupplierIndustry> paymentsToSupplierIndustry;
    @XmlElement(name = "NetTermsPayments")
    protected PurchaserDerivedNetTermsPayments netTermsPayments;
    @XmlElement(name = "DiscountTermsPayments")
    protected PurchaserDerivedDiscountTermsPayments discountTermsPayments;
    @XmlElement(name = "NoPaymentMannerPayments")
    protected PurchaserDerivedNoPaymentMannerPayments noPaymentMannerPayments;
    @XmlElement(name = "PlacedForCollectionPayments")
    protected PurchaserDerivedPlacedForCollectionPayments placedForCollectionPayments;
    @XmlElement(name = "UnfavorablePayments")
    protected PurchaserDerivedUnfavorablePayments unfavorablePayments;
    @XmlElement(name = "SatisfactoryPayments")
    protected SatisfactoryPayments satisfactoryPayments;

    /**
     * Gets the value of the summaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSummaryPeriod() {
        return summaryPeriod;
    }

    /**
     * Sets the value of the summaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSummaryPeriod(Duration value) {
        this.summaryPeriod = value;
    }

    /**
     * Gets the value of the paymentsWithHighCredit property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedPaymentsWithHighCredit }
     *     
     */
    public PurchaserDerivedPaymentsWithHighCredit getPaymentsWithHighCredit() {
        return paymentsWithHighCredit;
    }

    /**
     * Sets the value of the paymentsWithHighCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedPaymentsWithHighCredit }
     *     
     */
    public void setPaymentsWithHighCredit(PurchaserDerivedPaymentsWithHighCredit value) {
        this.paymentsWithHighCredit = value;
    }

    /**
     * Gets the value of the paymentsByCreditRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentsByCreditRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentsByCreditRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaserDerivedPaymentsByCreditRange }
     * 
     * 
     */
    public List<PurchaserDerivedPaymentsByCreditRange> getPaymentsByCreditRange() {
        if (paymentsByCreditRange == null) {
            paymentsByCreditRange = new ArrayList<PurchaserDerivedPaymentsByCreditRange>();
        }
        return this.paymentsByCreditRange;
    }

    /**
     * Gets the value of the paymentsToSupplierIndustry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentsToSupplierIndustry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentsToSupplierIndustry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaserDerivedPaymentsToSupplierIndustry }
     * 
     * 
     */
    public List<PurchaserDerivedPaymentsToSupplierIndustry> getPaymentsToSupplierIndustry() {
        if (paymentsToSupplierIndustry == null) {
            paymentsToSupplierIndustry = new ArrayList<PurchaserDerivedPaymentsToSupplierIndustry>();
        }
        return this.paymentsToSupplierIndustry;
    }

    /**
     * Gets the value of the netTermsPayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedNetTermsPayments }
     *     
     */
    public PurchaserDerivedNetTermsPayments getNetTermsPayments() {
        return netTermsPayments;
    }

    /**
     * Sets the value of the netTermsPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedNetTermsPayments }
     *     
     */
    public void setNetTermsPayments(PurchaserDerivedNetTermsPayments value) {
        this.netTermsPayments = value;
    }

    /**
     * Gets the value of the discountTermsPayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedDiscountTermsPayments }
     *     
     */
    public PurchaserDerivedDiscountTermsPayments getDiscountTermsPayments() {
        return discountTermsPayments;
    }

    /**
     * Sets the value of the discountTermsPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedDiscountTermsPayments }
     *     
     */
    public void setDiscountTermsPayments(PurchaserDerivedDiscountTermsPayments value) {
        this.discountTermsPayments = value;
    }

    /**
     * Gets the value of the noPaymentMannerPayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedNoPaymentMannerPayments }
     *     
     */
    public PurchaserDerivedNoPaymentMannerPayments getNoPaymentMannerPayments() {
        return noPaymentMannerPayments;
    }

    /**
     * Sets the value of the noPaymentMannerPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedNoPaymentMannerPayments }
     *     
     */
    public void setNoPaymentMannerPayments(PurchaserDerivedNoPaymentMannerPayments value) {
        this.noPaymentMannerPayments = value;
    }

    /**
     * Gets the value of the placedForCollectionPayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedPlacedForCollectionPayments }
     *     
     */
    public PurchaserDerivedPlacedForCollectionPayments getPlacedForCollectionPayments() {
        return placedForCollectionPayments;
    }

    /**
     * Sets the value of the placedForCollectionPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedPlacedForCollectionPayments }
     *     
     */
    public void setPlacedForCollectionPayments(PurchaserDerivedPlacedForCollectionPayments value) {
        this.placedForCollectionPayments = value;
    }

    /**
     * Gets the value of the unfavorablePayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedUnfavorablePayments }
     *     
     */
    public PurchaserDerivedUnfavorablePayments getUnfavorablePayments() {
        return unfavorablePayments;
    }

    /**
     * Sets the value of the unfavorablePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedUnfavorablePayments }
     *     
     */
    public void setUnfavorablePayments(PurchaserDerivedUnfavorablePayments value) {
        this.unfavorablePayments = value;
    }

    /**
     * Gets the value of the satisfactoryPayments property.
     * 
     * @return
     *     possible object is
     *     {@link SatisfactoryPayments }
     *     
     */
    public SatisfactoryPayments getSatisfactoryPayments() {
        return satisfactoryPayments;
    }

    /**
     * Sets the value of the satisfactoryPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SatisfactoryPayments }
     *     
     */
    public void setSatisfactoryPayments(SatisfactoryPayments value) {
        this.satisfactoryPayments = value;
    }

}
