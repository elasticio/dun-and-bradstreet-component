
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMannerExperienceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMannerExperienceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentMannerSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMannerExperienceSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryDate",
    "twelveMonthsSummary"
})
public class PaymentMannerExperienceSummaryType {

    @XmlElement(name = "SummaryDate")
    protected DNBDateType summaryDate;
    @XmlElement(name = "TwelveMonthsSummary")
    protected List<PaymentMannerSummaryType> twelveMonthsSummary;

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
     * {@link PaymentMannerSummaryType }
     * 
     * 
     */
    public List<PaymentMannerSummaryType> getTwelveMonthsSummary() {
        if (twelveMonthsSummary == null) {
            twelveMonthsSummary = new ArrayList<PaymentMannerSummaryType>();
        }
        return this.twelveMonthsSummary;
    }

}
