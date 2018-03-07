
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpendBehaviorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpendBehaviorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpendBehaviorUnavailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpendBehaviorType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "locationCount",
    "periodSummary",
    "spendBehaviorUnavailabilityIndicator"
})
public class SpendBehaviorType {

    @XmlElement(name = "LocationCount")
    protected Integer locationCount;
    @XmlElement(name = "PeriodSummary")
    protected List<PeriodSummaryType> periodSummary;
    @XmlElement(name = "SpendBehaviorUnavailabilityIndicator")
    protected Boolean spendBehaviorUnavailabilityIndicator;

    /**
     * Gets the value of the locationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationCount() {
        return locationCount;
    }

    /**
     * Sets the value of the locationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationCount(Integer value) {
        this.locationCount = value;
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
     * {@link PeriodSummaryType }
     * 
     * 
     */
    public List<PeriodSummaryType> getPeriodSummary() {
        if (periodSummary == null) {
            periodSummary = new ArrayList<PeriodSummaryType>();
        }
        return this.periodSummary;
    }

    /**
     * Gets the value of the spendBehaviorUnavailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpendBehaviorUnavailabilityIndicator() {
        return spendBehaviorUnavailabilityIndicator;
    }

    /**
     * Sets the value of the spendBehaviorUnavailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpendBehaviorUnavailabilityIndicator(Boolean value) {
        this.spendBehaviorUnavailabilityIndicator = value;
    }

}
