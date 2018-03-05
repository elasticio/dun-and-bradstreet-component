
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for PaymentHistorySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHistorySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="ExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentWithinTermsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfPaymentsPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="TotalOnTimePaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalChargeOffAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalChargeOffRecoveredAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPaymentsCountCycleSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}TotalPaymentsCountCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentHistorySummary", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "paymentPeriod",
    "experiencesTotalCount",
    "paymentWithinTermsCount",
    "totalNumberOfPaymentsPeriod",
    "totalOnTimePaymentsCount",
    "totalPaymentsCount",
    "totalChargeOffAmount",
    "totalChargeOffRecoveredAmount",
    "totalPaymentsCountCycleSummary"
})
public class PaymentHistorySummary {

    @XmlElementRef(name = "PaymentPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> paymentPeriod;
    @XmlElementRef(name = "ExperiencesTotalCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> experiencesTotalCount;
    @XmlElementRef(name = "PaymentWithinTermsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paymentWithinTermsCount;
    @XmlElementRef(name = "TotalNumberOfPaymentsPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalNumberOfPaymentsPeriod;
    @XmlElementRef(name = "TotalOnTimePaymentsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalOnTimePaymentsCount;
    @XmlElementRef(name = "TotalPaymentsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalPaymentsCount;
    @XmlElementRef(name = "TotalChargeOffAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalChargeOffAmount;
    @XmlElementRef(name = "TotalChargeOffRecoveredAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalChargeOffRecoveredAmount;
    @XmlElement(name = "TotalPaymentsCountCycleSummary", nillable = true)
    protected List<TotalPaymentsCountCycleSummary> totalPaymentsCountCycleSummary;

    /**
     * Gets the value of the paymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPaymentPeriod() {
        return paymentPeriod;
    }

    /**
     * Sets the value of the paymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPaymentPeriod(JAXBElement<Duration> value) {
        this.paymentPeriod = value;
    }

    /**
     * Gets the value of the experiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExperiencesTotalCount() {
        return experiencesTotalCount;
    }

    /**
     * Sets the value of the experiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExperiencesTotalCount(JAXBElement<Integer> value) {
        this.experiencesTotalCount = value;
    }

    /**
     * Gets the value of the paymentWithinTermsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaymentWithinTermsCount() {
        return paymentWithinTermsCount;
    }

    /**
     * Sets the value of the paymentWithinTermsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaymentWithinTermsCount(JAXBElement<Integer> value) {
        this.paymentWithinTermsCount = value;
    }

    /**
     * Gets the value of the totalNumberOfPaymentsPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalNumberOfPaymentsPeriod() {
        return totalNumberOfPaymentsPeriod;
    }

    /**
     * Sets the value of the totalNumberOfPaymentsPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalNumberOfPaymentsPeriod(JAXBElement<Duration> value) {
        this.totalNumberOfPaymentsPeriod = value;
    }

    /**
     * Gets the value of the totalOnTimePaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalOnTimePaymentsCount() {
        return totalOnTimePaymentsCount;
    }

    /**
     * Sets the value of the totalOnTimePaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalOnTimePaymentsCount(JAXBElement<Integer> value) {
        this.totalOnTimePaymentsCount = value;
    }

    /**
     * Gets the value of the totalPaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalPaymentsCount() {
        return totalPaymentsCount;
    }

    /**
     * Sets the value of the totalPaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalPaymentsCount(JAXBElement<Integer> value) {
        this.totalPaymentsCount = value;
    }

    /**
     * Gets the value of the totalChargeOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalChargeOffAmount() {
        return totalChargeOffAmount;
    }

    /**
     * Sets the value of the totalChargeOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalChargeOffAmount(JAXBElement<AmountType> value) {
        this.totalChargeOffAmount = value;
    }

    /**
     * Gets the value of the totalChargeOffRecoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalChargeOffRecoveredAmount() {
        return totalChargeOffRecoveredAmount;
    }

    /**
     * Sets the value of the totalChargeOffRecoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalChargeOffRecoveredAmount(JAXBElement<AmountType> value) {
        this.totalChargeOffRecoveredAmount = value;
    }

    /**
     * Gets the value of the totalPaymentsCountCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalPaymentsCountCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalPaymentsCountCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalPaymentsCountCycleSummary }
     * 
     * 
     */
    public List<TotalPaymentsCountCycleSummary> getTotalPaymentsCountCycleSummary() {
        if (totalPaymentsCountCycleSummary == null) {
            totalPaymentsCountCycleSummary = new ArrayList<TotalPaymentsCountCycleSummary>();
        }
        return this.totalPaymentsCountCycleSummary;
    }

}
