
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessSignalsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSignalsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MostRecentSignalDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}BusinessSignalsPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSignalsUnavailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSignalsSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "mostRecentSignalDate",
    "periodSummary",
    "businessSignalsUnavailabilityIndicator"
})
public class BusinessSignalsSummaryType {

    @XmlElement(name = "MostRecentSignalDate")
    protected DNBDateType mostRecentSignalDate;
    @XmlElement(name = "PeriodSummary")
    protected List<BusinessSignalsPeriodSummaryType> periodSummary;
    @XmlElement(name = "BusinessSignalsUnavailabilityIndicator")
    protected Boolean businessSignalsUnavailabilityIndicator;

    /**
     * Gets the value of the mostRecentSignalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentSignalDate() {
        return mostRecentSignalDate;
    }

    /**
     * Sets the value of the mostRecentSignalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentSignalDate(DNBDateType value) {
        this.mostRecentSignalDate = value;
    }

    /**
     * Gets the value of the periodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSignalsPeriodSummaryType }
     * 
     * 
     */
    public List<BusinessSignalsPeriodSummaryType> getPeriodSummary() {
        if (periodSummary == null) {
            periodSummary = new ArrayList<BusinessSignalsPeriodSummaryType>();
        }
        return this.periodSummary;
    }

    /**
     * Gets the value of the businessSignalsUnavailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessSignalsUnavailabilityIndicator() {
        return businessSignalsUnavailabilityIndicator;
    }

    /**
     * Sets the value of the businessSignalsUnavailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessSignalsUnavailabilityIndicator(Boolean value) {
        this.businessSignalsUnavailabilityIndicator = value;
    }

}
