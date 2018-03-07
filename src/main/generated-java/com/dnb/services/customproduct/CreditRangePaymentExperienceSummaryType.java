
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditRangePaymentExperienceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRangePaymentExperienceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ThreeMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditRangeSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditRangeSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRangePaymentExperienceSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryDate",
    "threeMonthsSummary",
    "twelveMonthsSummary"
})
public class CreditRangePaymentExperienceSummaryType {

    @XmlElement(name = "SummaryDate")
    protected DNBDateType summaryDate;
    @XmlElement(name = "ThreeMonthsSummary")
    protected List<CreditRangeSummaryType> threeMonthsSummary;
    @XmlElement(name = "TwelveMonthsSummary")
    protected List<CreditRangeSummaryType> twelveMonthsSummary;

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
     * Gets the value of the threeMonthsSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeMonthsSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeMonthsSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditRangeSummaryType }
     * 
     * 
     */
    public List<CreditRangeSummaryType> getThreeMonthsSummary() {
        if (threeMonthsSummary == null) {
            threeMonthsSummary = new ArrayList<CreditRangeSummaryType>();
        }
        return this.threeMonthsSummary;
    }

    /**
     * Gets the value of the twelveMonthsSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twelveMonthsSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwelveMonthsSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditRangeSummaryType }
     * 
     * 
     */
    public List<CreditRangeSummaryType> getTwelveMonthsSummary() {
        if (twelveMonthsSummary == null) {
            twelveMonthsSummary = new ArrayList<CreditRangeSummaryType>();
        }
        return this.twelveMonthsSummary;
    }

}
