
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
 * <p>Java class for PaymentHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LenderName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReportedDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="NumberOfPaymentsPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="TotalPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentHistoryPattern" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OnTimePaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentsCountCycleSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}PaymentsCountCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChargeOffAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ChargeOffDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ChargeOffRecoveredAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentHistory", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "lenderName",
    "lenderID",
    "paymentReportedDate",
    "numberOfPaymentsPeriod",
    "totalPaymentsCount",
    "paymentHistoryPattern",
    "onTimePaymentsCount",
    "paymentsCountCycleSummary",
    "chargeOffAmount",
    "chargeOffDate",
    "chargeOffRecoveredAmount"
})
public class PaymentHistory {

    @XmlElementRef(name = "LenderName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lenderName;
    @XmlElementRef(name = "LenderID", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lenderID;
    @XmlElementRef(name = "PaymentReportedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> paymentReportedDate;
    @XmlElementRef(name = "NumberOfPaymentsPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> numberOfPaymentsPeriod;
    @XmlElementRef(name = "TotalPaymentsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalPaymentsCount;
    @XmlElementRef(name = "PaymentHistoryPattern", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentHistoryPattern;
    @XmlElementRef(name = "OnTimePaymentsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> onTimePaymentsCount;
    @XmlElement(name = "PaymentsCountCycleSummary", nillable = true)
    protected List<PaymentsCountCycleSummary> paymentsCountCycleSummary;
    @XmlElementRef(name = "ChargeOffAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> chargeOffAmount;
    @XmlElementRef(name = "ChargeOffDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> chargeOffDate;
    @XmlElementRef(name = "ChargeOffRecoveredAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> chargeOffRecoveredAmount;

    /**
     * Gets the value of the lenderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLenderName() {
        return lenderName;
    }

    /**
     * Sets the value of the lenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLenderName(JAXBElement<String> value) {
        this.lenderName = value;
    }

    /**
     * Gets the value of the lenderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLenderID() {
        return lenderID;
    }

    /**
     * Sets the value of the lenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLenderID(JAXBElement<Integer> value) {
        this.lenderID = value;
    }

    /**
     * Gets the value of the paymentReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getPaymentReportedDate() {
        return paymentReportedDate;
    }

    /**
     * Sets the value of the paymentReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setPaymentReportedDate(JAXBElement<DNBDateType> value) {
        this.paymentReportedDate = value;
    }

    /**
     * Gets the value of the numberOfPaymentsPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getNumberOfPaymentsPeriod() {
        return numberOfPaymentsPeriod;
    }

    /**
     * Sets the value of the numberOfPaymentsPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setNumberOfPaymentsPeriod(JAXBElement<Duration> value) {
        this.numberOfPaymentsPeriod = value;
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
     * Gets the value of the paymentHistoryPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentHistoryPattern() {
        return paymentHistoryPattern;
    }

    /**
     * Sets the value of the paymentHistoryPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentHistoryPattern(JAXBElement<String> value) {
        this.paymentHistoryPattern = value;
    }

    /**
     * Gets the value of the onTimePaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOnTimePaymentsCount() {
        return onTimePaymentsCount;
    }

    /**
     * Sets the value of the onTimePaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOnTimePaymentsCount(JAXBElement<Integer> value) {
        this.onTimePaymentsCount = value;
    }

    /**
     * Gets the value of the paymentsCountCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentsCountCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentsCountCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentsCountCycleSummary }
     * 
     * 
     */
    public List<PaymentsCountCycleSummary> getPaymentsCountCycleSummary() {
        if (paymentsCountCycleSummary == null) {
            paymentsCountCycleSummary = new ArrayList<PaymentsCountCycleSummary>();
        }
        return this.paymentsCountCycleSummary;
    }

    /**
     * Gets the value of the chargeOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getChargeOffAmount() {
        return chargeOffAmount;
    }

    /**
     * Sets the value of the chargeOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setChargeOffAmount(JAXBElement<AmountType> value) {
        this.chargeOffAmount = value;
    }

    /**
     * Gets the value of the chargeOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getChargeOffDate() {
        return chargeOffDate;
    }

    /**
     * Sets the value of the chargeOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setChargeOffDate(JAXBElement<DNBDateType> value) {
        this.chargeOffDate = value;
    }

    /**
     * Gets the value of the chargeOffRecoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getChargeOffRecoveredAmount() {
        return chargeOffRecoveredAmount;
    }

    /**
     * Sets the value of the chargeOffRecoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setChargeOffRecoveredAmount(JAXBElement<AmountType> value) {
        this.chargeOffRecoveredAmount = value;
    }

}
