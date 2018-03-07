
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentExperienceSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentExperienceSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentExperienceSummaryType" minOccurs="0"/>
 *         &lt;element name="ThreeMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentExperienceSummaryType" minOccurs="0"/>
 *         &lt;element name="CompleteSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentExperienceSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentExperienceSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryDate",
    "twelveMonthsSummary",
    "threeMonthsSummary",
    "completeSummary"
})
public class PaymentExperienceSummary {

    @XmlElement(name = "SummaryDate")
    protected DNBDateType summaryDate;
    @XmlElement(name = "TwelveMonthsSummary")
    protected PaymentExperienceSummaryType twelveMonthsSummary;
    @XmlElement(name = "ThreeMonthsSummary")
    protected PaymentExperienceSummaryType threeMonthsSummary;
    @XmlElement(name = "CompleteSummary")
    protected PaymentExperienceSummaryType completeSummary;

    /**
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSummaryDate(DNBDateType value) {
        this.summaryDate = value;
    }

    /**
     * Gets the value of the twelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExperienceSummaryType }
     *     
     */
    public PaymentExperienceSummaryType getTwelveMonthsSummary() {
        return twelveMonthsSummary;
    }

    /**
     * Sets the value of the twelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExperienceSummaryType }
     *     
     */
    public void setTwelveMonthsSummary(PaymentExperienceSummaryType value) {
        this.twelveMonthsSummary = value;
    }

    /**
     * Gets the value of the threeMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExperienceSummaryType }
     *     
     */
    public PaymentExperienceSummaryType getThreeMonthsSummary() {
        return threeMonthsSummary;
    }

    /**
     * Sets the value of the threeMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExperienceSummaryType }
     *     
     */
    public void setThreeMonthsSummary(PaymentExperienceSummaryType value) {
        this.threeMonthsSummary = value;
    }

    /**
     * Gets the value of the completeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExperienceSummaryType }
     *     
     */
    public PaymentExperienceSummaryType getCompleteSummary() {
        return completeSummary;
    }

    /**
     * Sets the value of the completeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExperienceSummaryType }
     *     
     */
    public void setCompleteSummary(PaymentExperienceSummaryType value) {
        this.completeSummary = value;
    }

}
