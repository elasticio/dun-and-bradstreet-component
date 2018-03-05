
package com.dnb.services.smallbusiness;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallPaymentHistorySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallPaymentHistorySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OnTimePaymentsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PastDuePercentageCycleSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}PastDuePercentageCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalChargeOffPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalChargeOffAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPaymentHistorySummary", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "totalPaymentsCount",
    "onTimePaymentsPercentage",
    "pastDuePercentageCycleSummary",
    "totalChargeOffPaymentsCount",
    "totalChargeOffAmount"
})
public class OverallPaymentHistorySummary {

    @XmlElementRef(name = "TotalPaymentsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalPaymentsCount;
    @XmlElementRef(name = "OnTimePaymentsPercentage", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> onTimePaymentsPercentage;
    @XmlElement(name = "PastDuePercentageCycleSummary", nillable = true)
    protected List<PastDuePercentageCycleSummary> pastDuePercentageCycleSummary;
    @XmlElementRef(name = "TotalChargeOffPaymentsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalChargeOffPaymentsCount;
    @XmlElementRef(name = "TotalChargeOffAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalChargeOffAmount;

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
     * Gets the value of the onTimePaymentsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOnTimePaymentsPercentage() {
        return onTimePaymentsPercentage;
    }

    /**
     * Sets the value of the onTimePaymentsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOnTimePaymentsPercentage(JAXBElement<BigDecimal> value) {
        this.onTimePaymentsPercentage = value;
    }

    /**
     * Gets the value of the pastDuePercentageCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastDuePercentageCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastDuePercentageCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PastDuePercentageCycleSummary }
     * 
     * 
     */
    public List<PastDuePercentageCycleSummary> getPastDuePercentageCycleSummary() {
        if (pastDuePercentageCycleSummary == null) {
            pastDuePercentageCycleSummary = new ArrayList<PastDuePercentageCycleSummary>();
        }
        return this.pastDuePercentageCycleSummary;
    }

    /**
     * Gets the value of the totalChargeOffPaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalChargeOffPaymentsCount() {
        return totalChargeOffPaymentsCount;
    }

    /**
     * Sets the value of the totalChargeOffPaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalChargeOffPaymentsCount(JAXBElement<Integer> value) {
        this.totalChargeOffPaymentsCount = value;
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

}
