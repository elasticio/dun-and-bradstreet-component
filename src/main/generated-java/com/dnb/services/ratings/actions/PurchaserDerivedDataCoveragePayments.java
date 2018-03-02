
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedDataCoveragePayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedDataCoveragePayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentPeriodSummary" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PurchaserDerivedPaymentPeriodSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SlowPaymentsExistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedDataCoveragePayments", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "paymentPeriodSummary",
    "slowPaymentsExistIndicator"
})
public class PurchaserDerivedDataCoveragePayments {

    @XmlElement(name = "PaymentPeriodSummary")
    protected List<PurchaserDerivedPaymentPeriodSummary> paymentPeriodSummary;
    @XmlElement(name = "SlowPaymentsExistIndicator")
    protected Boolean slowPaymentsExistIndicator;

    /**
     * Gets the value of the paymentPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaserDerivedPaymentPeriodSummary }
     * 
     * 
     */
    public List<PurchaserDerivedPaymentPeriodSummary> getPaymentPeriodSummary() {
        if (paymentPeriodSummary == null) {
            paymentPeriodSummary = new ArrayList<PurchaserDerivedPaymentPeriodSummary>();
        }
        return this.paymentPeriodSummary;
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

}
