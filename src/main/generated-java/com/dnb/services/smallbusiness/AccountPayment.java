
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentPayment" type="{http://services.dnb.com/SBRIProductServiceV2.0}CurrentPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentHistory" type="{http://services.dnb.com/SBRIProductServiceV2.0}PaymentHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentPaymentSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}CurrentPaymentSummary" minOccurs="0"/>
 *         &lt;element name="PaymentHistorySummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}PaymentHistorySummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountPayment", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "currentPayment",
    "paymentHistory",
    "currentPaymentSummary",
    "paymentHistorySummary"
})
public class AccountPayment {

    @XmlElement(name = "CurrentPayment")
    protected List<CurrentPayment> currentPayment;
    @XmlElement(name = "PaymentHistory")
    protected List<PaymentHistory> paymentHistory;
    @XmlElement(name = "CurrentPaymentSummary")
    protected CurrentPaymentSummary currentPaymentSummary;
    @XmlElement(name = "PaymentHistorySummary")
    protected PaymentHistorySummary paymentHistorySummary;

    /**
     * Gets the value of the currentPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentPayment }
     * 
     * 
     */
    public List<CurrentPayment> getCurrentPayment() {
        if (currentPayment == null) {
            currentPayment = new ArrayList<CurrentPayment>();
        }
        return this.currentPayment;
    }

    /**
     * Gets the value of the paymentHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentHistory }
     * 
     * 
     */
    public List<PaymentHistory> getPaymentHistory() {
        if (paymentHistory == null) {
            paymentHistory = new ArrayList<PaymentHistory>();
        }
        return this.paymentHistory;
    }

    /**
     * Gets the value of the currentPaymentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentPaymentSummary }
     *     
     */
    public CurrentPaymentSummary getCurrentPaymentSummary() {
        return currentPaymentSummary;
    }

    /**
     * Sets the value of the currentPaymentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentPaymentSummary }
     *     
     */
    public void setCurrentPaymentSummary(CurrentPaymentSummary value) {
        this.currentPaymentSummary = value;
    }

    /**
     * Gets the value of the paymentHistorySummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHistorySummary }
     *     
     */
    public PaymentHistorySummary getPaymentHistorySummary() {
        return paymentHistorySummary;
    }

    /**
     * Sets the value of the paymentHistorySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHistorySummary }
     *     
     */
    public void setPaymentHistorySummary(PaymentHistorySummary value) {
        this.paymentHistorySummary = value;
    }

}
