
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * An entry loop which can repeat multiple times to record aggregated views of the buying/spending trend of a company that has been summarized by the period.
 *          
 * 
 * <p>Java class for PeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimePeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType"/>
 *         &lt;element name="SpendAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AverageSpendAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumMonthlyAverageSpendAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumMonthlyAveragePurchaseAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PurchaseRequestorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumWeeksSinceFirstPurchaseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumWeeksSinceFirstPurchaseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumWeekSinceLastPurchaseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumWeekSinceLastPurchaseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SpendCategorySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}SpendCategorySummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "timePeriod",
    "spendAmount",
    "purchaseOrderCount",
    "averageSpendAmount",
    "maximumMonthlyAverageSpendAmount",
    "minimumMonthlyAveragePurchaseAmount",
    "purchaseRequestorCount",
    "maximumWeeksSinceFirstPurchaseCount",
    "minimumWeeksSinceFirstPurchaseCount",
    "maximumWeekSinceLastPurchaseCount",
    "minimumWeekSinceLastPurchaseCount",
    "spendCategorySummary"
})
public class PeriodSummaryType {

    @XmlElement(name = "TimePeriod", required = true)
    protected Duration timePeriod;
    @XmlElement(name = "SpendAmount")
    protected AmountType spendAmount;
    @XmlElement(name = "PurchaseOrderCount")
    protected Integer purchaseOrderCount;
    @XmlElement(name = "AverageSpendAmount")
    protected AmountType averageSpendAmount;
    @XmlElement(name = "MaximumMonthlyAverageSpendAmount")
    protected AmountType maximumMonthlyAverageSpendAmount;
    @XmlElement(name = "MinimumMonthlyAveragePurchaseAmount")
    protected AmountType minimumMonthlyAveragePurchaseAmount;
    @XmlElement(name = "PurchaseRequestorCount")
    protected Integer purchaseRequestorCount;
    @XmlElement(name = "MaximumWeeksSinceFirstPurchaseCount")
    protected Integer maximumWeeksSinceFirstPurchaseCount;
    @XmlElement(name = "MinimumWeeksSinceFirstPurchaseCount")
    protected Integer minimumWeeksSinceFirstPurchaseCount;
    @XmlElement(name = "MaximumWeekSinceLastPurchaseCount")
    protected Integer maximumWeekSinceLastPurchaseCount;
    @XmlElement(name = "MinimumWeekSinceLastPurchaseCount")
    protected Integer minimumWeekSinceLastPurchaseCount;
    @XmlElement(name = "SpendCategorySummary")
    protected List<SpendCategorySummaryType> spendCategorySummary;

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
     * Gets the value of the spendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpendAmount() {
        return spendAmount;
    }

    /**
     * Sets the value of the spendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpendAmount(AmountType value) {
        this.spendAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseOrderCount() {
        return purchaseOrderCount;
    }

    /**
     * Sets the value of the purchaseOrderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseOrderCount(Integer value) {
        this.purchaseOrderCount = value;
    }

    /**
     * Gets the value of the averageSpendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageSpendAmount() {
        return averageSpendAmount;
    }

    /**
     * Sets the value of the averageSpendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageSpendAmount(AmountType value) {
        this.averageSpendAmount = value;
    }

    /**
     * Gets the value of the maximumMonthlyAverageSpendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumMonthlyAverageSpendAmount() {
        return maximumMonthlyAverageSpendAmount;
    }

    /**
     * Sets the value of the maximumMonthlyAverageSpendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumMonthlyAverageSpendAmount(AmountType value) {
        this.maximumMonthlyAverageSpendAmount = value;
    }

    /**
     * Gets the value of the minimumMonthlyAveragePurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumMonthlyAveragePurchaseAmount() {
        return minimumMonthlyAveragePurchaseAmount;
    }

    /**
     * Sets the value of the minimumMonthlyAveragePurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumMonthlyAveragePurchaseAmount(AmountType value) {
        this.minimumMonthlyAveragePurchaseAmount = value;
    }

    /**
     * Gets the value of the purchaseRequestorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseRequestorCount() {
        return purchaseRequestorCount;
    }

    /**
     * Sets the value of the purchaseRequestorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseRequestorCount(Integer value) {
        this.purchaseRequestorCount = value;
    }

    /**
     * Gets the value of the maximumWeeksSinceFirstPurchaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumWeeksSinceFirstPurchaseCount() {
        return maximumWeeksSinceFirstPurchaseCount;
    }

    /**
     * Sets the value of the maximumWeeksSinceFirstPurchaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumWeeksSinceFirstPurchaseCount(Integer value) {
        this.maximumWeeksSinceFirstPurchaseCount = value;
    }

    /**
     * Gets the value of the minimumWeeksSinceFirstPurchaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumWeeksSinceFirstPurchaseCount() {
        return minimumWeeksSinceFirstPurchaseCount;
    }

    /**
     * Sets the value of the minimumWeeksSinceFirstPurchaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumWeeksSinceFirstPurchaseCount(Integer value) {
        this.minimumWeeksSinceFirstPurchaseCount = value;
    }

    /**
     * Gets the value of the maximumWeekSinceLastPurchaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumWeekSinceLastPurchaseCount() {
        return maximumWeekSinceLastPurchaseCount;
    }

    /**
     * Sets the value of the maximumWeekSinceLastPurchaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumWeekSinceLastPurchaseCount(Integer value) {
        this.maximumWeekSinceLastPurchaseCount = value;
    }

    /**
     * Gets the value of the minimumWeekSinceLastPurchaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumWeekSinceLastPurchaseCount() {
        return minimumWeekSinceLastPurchaseCount;
    }

    /**
     * Sets the value of the minimumWeekSinceLastPurchaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumWeekSinceLastPurchaseCount(Integer value) {
        this.minimumWeekSinceLastPurchaseCount = value;
    }

    /**
     * Gets the value of the spendCategorySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spendCategorySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpendCategorySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpendCategorySummaryType }
     * 
     * 
     */
    public List<SpendCategorySummaryType> getSpendCategorySummary() {
        if (spendCategorySummary == null) {
            spendCategorySummary = new ArrayList<SpendCategorySummaryType>();
        }
        return this.spendCategorySummary;
    }

}
