
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * Records a summarized  data regarding business accounts that have had monies extended to them by one or more lenders participating in the Small Business Risk Insight program, through financial vehicles like loans, leases, credit cards, or lines of credit, and who are expected to repay those amounts, sometimes with additional interest.
 *          
 * 
 * <p>Java class for BorrowerAnalyticsOverallSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorrowerAnalyticsOverallSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountsOpenedLast12MonthsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenClosedendAccountsOriginalProportionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenAccountsAverageDuration" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsMinimumDuration" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsMaximumDuration" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsTotalPastDueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="OpenOpenendedAccountsUtilizationPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SatisfactorilyClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceFirstAccountOpenedPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastChargeOffPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="TimeSinceAccountLastOpenedPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsTotalExposureAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="WorstDelinquencyPast12MonthsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorstDelinquencyPast3MonthsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorstDelinquencyPast6MonthsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoluntarilyClosedAccountsAveragePeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="InvoluntarilyClosedAccountsMaximumPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="VoluntarilyClosedAccountsMaximumPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="VoluntarilyClosedAccountsMinimumPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="InvoluntarilyClosedAccountsMinimumPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="InquiriesBeforeLastWeekCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InquiriesLast6MonthsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenAccountsEverPastDueWrittenOffCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerAnalyticsOverallSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "openAccountsCount",
    "accountsOpenedLast12MonthsCount",
    "openClosedendAccountsOriginalProportionPercentage",
    "openAccountsAverageDuration",
    "openAccountsMinimumDuration",
    "openAccountsMaximumDuration",
    "openAccountsTotalPastDueAmount",
    "openOpenendedAccountsUtilizationPercentage",
    "satisfactorilyClosedAccountsCount",
    "timeSinceFirstAccountOpenedPeriod",
    "timeSinceLastChargeOffPeriod",
    "timeSinceAccountLastOpenedPeriod",
    "openAccountsTotalExposureAmount",
    "worstDelinquencyPast12MonthsCode",
    "worstDelinquencyPast3MonthsCode",
    "worstDelinquencyPast6MonthsCode",
    "involuntarilyClosedAccountsAveragePeriod",
    "involuntarilyClosedAccountsMaximumPeriod",
    "voluntarilyClosedAccountsMaximumPeriod",
    "voluntarilyClosedAccountsMinimumPeriod",
    "involuntarilyClosedAccountsMinimumPeriod",
    "inquiriesBeforeLastWeekCount",
    "inquiriesLast6MonthsCount",
    "openAccountsEverPastDueWrittenOffCount"
})
public class BorrowerAnalyticsOverallSummary {

    @XmlElement(name = "OpenAccountsCount")
    protected Integer openAccountsCount;
    @XmlElement(name = "AccountsOpenedLast12MonthsCount")
    protected Integer accountsOpenedLast12MonthsCount;
    @XmlElement(name = "OpenClosedendAccountsOriginalProportionPercentage")
    protected BigDecimal openClosedendAccountsOriginalProportionPercentage;
    @XmlElement(name = "OpenAccountsAverageDuration")
    protected Duration openAccountsAverageDuration;
    @XmlElement(name = "OpenAccountsMinimumDuration")
    protected Duration openAccountsMinimumDuration;
    @XmlElement(name = "OpenAccountsMaximumDuration")
    protected Duration openAccountsMaximumDuration;
    @XmlElement(name = "OpenAccountsTotalPastDueAmount")
    protected AmountType openAccountsTotalPastDueAmount;
    @XmlElement(name = "OpenOpenendedAccountsUtilizationPercentage")
    protected BigDecimal openOpenendedAccountsUtilizationPercentage;
    @XmlElement(name = "SatisfactorilyClosedAccountsCount")
    protected Integer satisfactorilyClosedAccountsCount;
    @XmlElement(name = "TimeSinceFirstAccountOpenedPeriod")
    protected Duration timeSinceFirstAccountOpenedPeriod;
    @XmlElement(name = "TimeSinceLastChargeOffPeriod")
    protected Duration timeSinceLastChargeOffPeriod;
    @XmlElement(name = "TimeSinceAccountLastOpenedPeriod")
    protected Duration timeSinceAccountLastOpenedPeriod;
    @XmlElement(name = "OpenAccountsTotalExposureAmount")
    protected AmountType openAccountsTotalExposureAmount;
    @XmlElement(name = "WorstDelinquencyPast12MonthsCode")
    protected Integer worstDelinquencyPast12MonthsCode;
    @XmlElement(name = "WorstDelinquencyPast3MonthsCode")
    protected Integer worstDelinquencyPast3MonthsCode;
    @XmlElement(name = "WorstDelinquencyPast6MonthsCode")
    protected Integer worstDelinquencyPast6MonthsCode;
    @XmlElement(name = "InvoluntarilyClosedAccountsAveragePeriod")
    protected Duration involuntarilyClosedAccountsAveragePeriod;
    @XmlElement(name = "InvoluntarilyClosedAccountsMaximumPeriod")
    protected Duration involuntarilyClosedAccountsMaximumPeriod;
    @XmlElement(name = "VoluntarilyClosedAccountsMaximumPeriod")
    protected Duration voluntarilyClosedAccountsMaximumPeriod;
    @XmlElement(name = "VoluntarilyClosedAccountsMinimumPeriod")
    protected Duration voluntarilyClosedAccountsMinimumPeriod;
    @XmlElement(name = "InvoluntarilyClosedAccountsMinimumPeriod")
    protected Duration involuntarilyClosedAccountsMinimumPeriod;
    @XmlElement(name = "InquiriesBeforeLastWeekCount")
    protected Integer inquiriesBeforeLastWeekCount;
    @XmlElement(name = "InquiriesLast6MonthsCount")
    protected Integer inquiriesLast6MonthsCount;
    @XmlElement(name = "OpenAccountsEverPastDueWrittenOffCount")
    protected Integer openAccountsEverPastDueWrittenOffCount;

    /**
     * Gets the value of the openAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenAccountsCount() {
        return openAccountsCount;
    }

    /**
     * Sets the value of the openAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenAccountsCount(Integer value) {
        this.openAccountsCount = value;
    }

    /**
     * Gets the value of the accountsOpenedLast12MonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountsOpenedLast12MonthsCount() {
        return accountsOpenedLast12MonthsCount;
    }

    /**
     * Sets the value of the accountsOpenedLast12MonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountsOpenedLast12MonthsCount(Integer value) {
        this.accountsOpenedLast12MonthsCount = value;
    }

    /**
     * Gets the value of the openClosedendAccountsOriginalProportionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenClosedendAccountsOriginalProportionPercentage() {
        return openClosedendAccountsOriginalProportionPercentage;
    }

    /**
     * Sets the value of the openClosedendAccountsOriginalProportionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenClosedendAccountsOriginalProportionPercentage(BigDecimal value) {
        this.openClosedendAccountsOriginalProportionPercentage = value;
    }

    /**
     * Gets the value of the openAccountsAverageDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOpenAccountsAverageDuration() {
        return openAccountsAverageDuration;
    }

    /**
     * Sets the value of the openAccountsAverageDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOpenAccountsAverageDuration(Duration value) {
        this.openAccountsAverageDuration = value;
    }

    /**
     * Gets the value of the openAccountsMinimumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOpenAccountsMinimumDuration() {
        return openAccountsMinimumDuration;
    }

    /**
     * Sets the value of the openAccountsMinimumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOpenAccountsMinimumDuration(Duration value) {
        this.openAccountsMinimumDuration = value;
    }

    /**
     * Gets the value of the openAccountsMaximumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOpenAccountsMaximumDuration() {
        return openAccountsMaximumDuration;
    }

    /**
     * Sets the value of the openAccountsMaximumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOpenAccountsMaximumDuration(Duration value) {
        this.openAccountsMaximumDuration = value;
    }

    /**
     * Gets the value of the openAccountsTotalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOpenAccountsTotalPastDueAmount() {
        return openAccountsTotalPastDueAmount;
    }

    /**
     * Sets the value of the openAccountsTotalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOpenAccountsTotalPastDueAmount(AmountType value) {
        this.openAccountsTotalPastDueAmount = value;
    }

    /**
     * Gets the value of the openOpenendedAccountsUtilizationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenOpenendedAccountsUtilizationPercentage() {
        return openOpenendedAccountsUtilizationPercentage;
    }

    /**
     * Sets the value of the openOpenendedAccountsUtilizationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenOpenendedAccountsUtilizationPercentage(BigDecimal value) {
        this.openOpenendedAccountsUtilizationPercentage = value;
    }

    /**
     * Gets the value of the satisfactorilyClosedAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSatisfactorilyClosedAccountsCount() {
        return satisfactorilyClosedAccountsCount;
    }

    /**
     * Sets the value of the satisfactorilyClosedAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSatisfactorilyClosedAccountsCount(Integer value) {
        this.satisfactorilyClosedAccountsCount = value;
    }

    /**
     * Gets the value of the timeSinceFirstAccountOpenedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeSinceFirstAccountOpenedPeriod() {
        return timeSinceFirstAccountOpenedPeriod;
    }

    /**
     * Sets the value of the timeSinceFirstAccountOpenedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeSinceFirstAccountOpenedPeriod(Duration value) {
        this.timeSinceFirstAccountOpenedPeriod = value;
    }

    /**
     * Gets the value of the timeSinceLastChargeOffPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeSinceLastChargeOffPeriod() {
        return timeSinceLastChargeOffPeriod;
    }

    /**
     * Sets the value of the timeSinceLastChargeOffPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeSinceLastChargeOffPeriod(Duration value) {
        this.timeSinceLastChargeOffPeriod = value;
    }

    /**
     * Gets the value of the timeSinceAccountLastOpenedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeSinceAccountLastOpenedPeriod() {
        return timeSinceAccountLastOpenedPeriod;
    }

    /**
     * Sets the value of the timeSinceAccountLastOpenedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeSinceAccountLastOpenedPeriod(Duration value) {
        this.timeSinceAccountLastOpenedPeriod = value;
    }

    /**
     * Gets the value of the openAccountsTotalExposureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOpenAccountsTotalExposureAmount() {
        return openAccountsTotalExposureAmount;
    }

    /**
     * Sets the value of the openAccountsTotalExposureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOpenAccountsTotalExposureAmount(AmountType value) {
        this.openAccountsTotalExposureAmount = value;
    }

    /**
     * Gets the value of the worstDelinquencyPast12MonthsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorstDelinquencyPast12MonthsCode() {
        return worstDelinquencyPast12MonthsCode;
    }

    /**
     * Sets the value of the worstDelinquencyPast12MonthsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorstDelinquencyPast12MonthsCode(Integer value) {
        this.worstDelinquencyPast12MonthsCode = value;
    }

    /**
     * Gets the value of the worstDelinquencyPast3MonthsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorstDelinquencyPast3MonthsCode() {
        return worstDelinquencyPast3MonthsCode;
    }

    /**
     * Sets the value of the worstDelinquencyPast3MonthsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorstDelinquencyPast3MonthsCode(Integer value) {
        this.worstDelinquencyPast3MonthsCode = value;
    }

    /**
     * Gets the value of the worstDelinquencyPast6MonthsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorstDelinquencyPast6MonthsCode() {
        return worstDelinquencyPast6MonthsCode;
    }

    /**
     * Sets the value of the worstDelinquencyPast6MonthsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorstDelinquencyPast6MonthsCode(Integer value) {
        this.worstDelinquencyPast6MonthsCode = value;
    }

    /**
     * Gets the value of the involuntarilyClosedAccountsAveragePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getInvoluntarilyClosedAccountsAveragePeriod() {
        return involuntarilyClosedAccountsAveragePeriod;
    }

    /**
     * Sets the value of the involuntarilyClosedAccountsAveragePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setInvoluntarilyClosedAccountsAveragePeriod(Duration value) {
        this.involuntarilyClosedAccountsAveragePeriod = value;
    }

    /**
     * Gets the value of the involuntarilyClosedAccountsMaximumPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getInvoluntarilyClosedAccountsMaximumPeriod() {
        return involuntarilyClosedAccountsMaximumPeriod;
    }

    /**
     * Sets the value of the involuntarilyClosedAccountsMaximumPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setInvoluntarilyClosedAccountsMaximumPeriod(Duration value) {
        this.involuntarilyClosedAccountsMaximumPeriod = value;
    }

    /**
     * Gets the value of the voluntarilyClosedAccountsMaximumPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVoluntarilyClosedAccountsMaximumPeriod() {
        return voluntarilyClosedAccountsMaximumPeriod;
    }

    /**
     * Sets the value of the voluntarilyClosedAccountsMaximumPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVoluntarilyClosedAccountsMaximumPeriod(Duration value) {
        this.voluntarilyClosedAccountsMaximumPeriod = value;
    }

    /**
     * Gets the value of the voluntarilyClosedAccountsMinimumPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVoluntarilyClosedAccountsMinimumPeriod() {
        return voluntarilyClosedAccountsMinimumPeriod;
    }

    /**
     * Sets the value of the voluntarilyClosedAccountsMinimumPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVoluntarilyClosedAccountsMinimumPeriod(Duration value) {
        this.voluntarilyClosedAccountsMinimumPeriod = value;
    }

    /**
     * Gets the value of the involuntarilyClosedAccountsMinimumPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getInvoluntarilyClosedAccountsMinimumPeriod() {
        return involuntarilyClosedAccountsMinimumPeriod;
    }

    /**
     * Sets the value of the involuntarilyClosedAccountsMinimumPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setInvoluntarilyClosedAccountsMinimumPeriod(Duration value) {
        this.involuntarilyClosedAccountsMinimumPeriod = value;
    }

    /**
     * Gets the value of the inquiriesBeforeLastWeekCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiriesBeforeLastWeekCount() {
        return inquiriesBeforeLastWeekCount;
    }

    /**
     * Sets the value of the inquiriesBeforeLastWeekCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiriesBeforeLastWeekCount(Integer value) {
        this.inquiriesBeforeLastWeekCount = value;
    }

    /**
     * Gets the value of the inquiriesLast6MonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiriesLast6MonthsCount() {
        return inquiriesLast6MonthsCount;
    }

    /**
     * Sets the value of the inquiriesLast6MonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiriesLast6MonthsCount(Integer value) {
        this.inquiriesLast6MonthsCount = value;
    }

    /**
     * Gets the value of the openAccountsEverPastDueWrittenOffCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenAccountsEverPastDueWrittenOffCount() {
        return openAccountsEverPastDueWrittenOffCount;
    }

    /**
     * Sets the value of the openAccountsEverPastDueWrittenOffCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenAccountsEverPastDueWrittenOffCount(Integer value) {
        this.openAccountsEverPastDueWrittenOffCount = value;
    }

}
