
package com.dnb.services.ratings.actions;

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
 *         &lt;element name="SummaryPeriod" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DurationType"/>
 *         &lt;element name="PaymentsWithHighCredit" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PurchaserDerivedPaymentsWithHighCredit" minOccurs="0"/>
 *         &lt;element name="UnfavorablePayments" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PurchaserDerivedUnfavorablePayments" minOccurs="0"/>
 *         &lt;element name="SatisfactoryPayments" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SatisfactoryPayments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPaymentPeriodSummary", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "summaryPeriod",
    "paymentsWithHighCredit",
    "unfavorablePayments",
    "satisfactoryPayments"
})
public class PurchaserDerivedPaymentPeriodSummary {

    @XmlElement(name = "SummaryPeriod", required = true)
    protected Duration summaryPeriod;
    @XmlElement(name = "PaymentsWithHighCredit")
    protected PurchaserDerivedPaymentsWithHighCredit paymentsWithHighCredit;
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
