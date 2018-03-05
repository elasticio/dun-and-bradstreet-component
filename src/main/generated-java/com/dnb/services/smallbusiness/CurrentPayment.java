
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentPayment">
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
 *         &lt;element name="MinimumPaymentAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentBalanceAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentDueAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPastDueAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PastDueCycleSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}PastDueCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentPayment", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "lenderName",
    "lenderID",
    "paymentReportedDate",
    "minimumPaymentAmount",
    "currentBalanceAmount",
    "currentDueAmount",
    "totalPastDueAmount",
    "pastDueCycleSummary"
})
public class CurrentPayment {

    @XmlElementRef(name = "LenderName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lenderName;
    @XmlElementRef(name = "LenderID", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lenderID;
    @XmlElementRef(name = "PaymentReportedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> paymentReportedDate;
    @XmlElementRef(name = "MinimumPaymentAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> minimumPaymentAmount;
    @XmlElementRef(name = "CurrentBalanceAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> currentBalanceAmount;
    @XmlElementRef(name = "CurrentDueAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> currentDueAmount;
    @XmlElementRef(name = "TotalPastDueAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalPastDueAmount;
    @XmlElement(name = "PastDueCycleSummary", nillable = true)
    protected List<PastDueCycleSummary> pastDueCycleSummary;

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
     * Gets the value of the minimumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getMinimumPaymentAmount() {
        return minimumPaymentAmount;
    }

    /**
     * Sets the value of the minimumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setMinimumPaymentAmount(JAXBElement<AmountType> value) {
        this.minimumPaymentAmount = value;
    }

    /**
     * Gets the value of the currentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    /**
     * Sets the value of the currentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentBalanceAmount(JAXBElement<AmountType> value) {
        this.currentBalanceAmount = value;
    }

    /**
     * Gets the value of the currentDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentDueAmount() {
        return currentDueAmount;
    }

    /**
     * Sets the value of the currentDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentDueAmount(JAXBElement<AmountType> value) {
        this.currentDueAmount = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalPastDueAmount(JAXBElement<AmountType> value) {
        this.totalPastDueAmount = value;
    }

    /**
     * Gets the value of the pastDueCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastDueCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastDueCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PastDueCycleSummary }
     * 
     * 
     */
    public List<PastDueCycleSummary> getPastDueCycleSummary() {
        if (pastDueCycleSummary == null) {
            pastDueCycleSummary = new ArrayList<PastDueCycleSummary>();
        }
        return this.pastDueCycleSummary;
    }

}
