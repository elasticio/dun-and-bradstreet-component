
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for BusinessSignalsPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSignalsPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimePeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType"/>
 *         &lt;element name="SignalsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StrongSignalsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DataProviderCategorySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}DataProviderSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MatchGradeSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}MatchGradeSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSignalsPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "timePeriod",
    "signalsCount",
    "strongSignalsCount",
    "dataProviderCategorySummary",
    "matchGradeSummary"
})
public class BusinessSignalsPeriodSummaryType {

    @XmlElement(name = "TimePeriod", required = true)
    protected Duration timePeriod;
    @XmlElement(name = "SignalsCount")
    protected Integer signalsCount;
    @XmlElement(name = "StrongSignalsCount")
    protected Integer strongSignalsCount;
    @XmlElement(name = "DataProviderCategorySummary")
    protected List<DataProviderSummaryType> dataProviderCategorySummary;
    @XmlElement(name = "MatchGradeSummary")
    protected List<MatchGradeSummaryType> matchGradeSummary;

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimePeriod(Duration value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the signalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignalsCount() {
        return signalsCount;
    }

    /**
     * Sets the value of the signalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignalsCount(Integer value) {
        this.signalsCount = value;
    }

    /**
     * Gets the value of the strongSignalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrongSignalsCount() {
        return strongSignalsCount;
    }

    /**
     * Sets the value of the strongSignalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrongSignalsCount(Integer value) {
        this.strongSignalsCount = value;
    }

    /**
     * Gets the value of the dataProviderCategorySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataProviderCategorySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataProviderCategorySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataProviderSummaryType }
     * 
     * 
     */
    public List<DataProviderSummaryType> getDataProviderCategorySummary() {
        if (dataProviderCategorySummary == null) {
            dataProviderCategorySummary = new ArrayList<DataProviderSummaryType>();
        }
        return this.dataProviderCategorySummary;
    }

    /**
     * Gets the value of the matchGradeSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchGradeSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchGradeSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchGradeSummaryType }
     * 
     * 
     */
    public List<MatchGradeSummaryType> getMatchGradeSummary() {
        if (matchGradeSummary == null) {
            matchGradeSummary = new ArrayList<MatchGradeSummaryType>();
        }
        return this.matchGradeSummary;
    }

}
