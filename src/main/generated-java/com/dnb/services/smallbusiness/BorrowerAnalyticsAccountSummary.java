
package com.dnb.services.smallbusiness;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * Records a detailed data regarding business accounts that have had monies extended to them by one or more lenders participating in the Small Business Risk Insight program, through financial vehicles like loans, leases, credit cards, or lines of credit, and who are expected to repay those amounts, sometimes with additional interest. 
 * 
 *          
 * 
 * <p>Java class for BorrowerAnalyticsAccountSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorrowerAnalyticsAccountSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpenAccountsEverPastDueWrittenOffCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorstDelinquencyPast6MonthsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceAccountLastOpenedPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsAverageDuration" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="AccountsOpenedLast12MonthsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenAccountsTotalPastDueAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="WorstDelinquencyPast12MonthsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorstDelinquencyPast3MonthsCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoluntarilyClosedAccountsMinimumPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="VoluntarilyClosedAccountsMinimumPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="SatisfactorilyClosedAccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenAccountsMaximumDuration" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsMinimumDuration" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="BorrowingAccountTypeText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AccountsTotalExposureAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountOutstandingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCurrentBalanceAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoluntarilyClosedAccountsAveragePeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="BorrowerAnalyticsCycleSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerAnalyticsAccountSummary", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "openAccountsEverPastDueWrittenOffCount",
    "worstDelinquencyPast6MonthsCode",
    "timeSinceAccountLastOpenedPeriod",
    "openAccountsAverageDuration",
    "accountsOpenedLast12MonthsCount",
    "openAccountsTotalPastDueAmount",
    "worstDelinquencyPast12MonthsCode",
    "worstDelinquencyPast3MonthsCode",
    "involuntarilyClosedAccountsMinimumPeriod",
    "voluntarilyClosedAccountsMinimumPeriod",
    "satisfactorilyClosedAccountsCount",
    "openAccountsCount",
    "openAccountsMaximumDuration",
    "openAccountsMinimumDuration",
    "borrowingAccountTypeText",
    "accountsTotalExposureAmount",
    "amountOutstandingPercentage",
    "openAccountsCurrentBalanceAmount",
    "involuntarilyClosedAccountsAveragePeriod",
    "borrowerAnalyticsCycleSummary"
})
public class BorrowerAnalyticsAccountSummary {

    @XmlElement(name = "OpenAccountsEverPastDueWrittenOffCount")
    protected Integer openAccountsEverPastDueWrittenOffCount;
    @XmlElement(name = "WorstDelinquencyPast6MonthsCode")
    protected Integer worstDelinquencyPast6MonthsCode;
    @XmlElement(name = "TimeSinceAccountLastOpenedPeriod")
    protected Duration timeSinceAccountLastOpenedPeriod;
    @XmlElement(name = "OpenAccountsAverageDuration")
    protected Duration openAccountsAverageDuration;
    @XmlElement(name = "AccountsOpenedLast12MonthsCount")
    protected Integer accountsOpenedLast12MonthsCount;
    @XmlElement(name = "OpenAccountsTotalPastDueAmount")
    protected AmountType openAccountsTotalPastDueAmount;
    @XmlElement(name = "WorstDelinquencyPast12MonthsCode")
    protected Integer worstDelinquencyPast12MonthsCode;
    @XmlElement(name = "WorstDelinquencyPast3MonthsCode")
    protected Integer worstDelinquencyPast3MonthsCode;
    @XmlElement(name = "InvoluntarilyClosedAccountsMinimumPeriod")
    protected Duration involuntarilyClosedAccountsMinimumPeriod;
    @XmlElement(name = "VoluntarilyClosedAccountsMinimumPeriod")
    protected Duration voluntarilyClosedAccountsMinimumPeriod;
    @XmlElement(name = "SatisfactorilyClosedAccountsCount")
    protected Integer satisfactorilyClosedAccountsCount;
    @XmlElement(name = "OpenAccountsCount")
    protected Integer openAccountsCount;
    @XmlElement(name = "OpenAccountsMaximumDuration")
    protected Duration openAccountsMaximumDuration;
    @XmlElement(name = "OpenAccountsMinimumDuration")
    protected Duration openAccountsMinimumDuration;
    @XmlElement(name = "BorrowingAccountTypeText")
    protected DNBDecodedStringType borrowingAccountTypeText;
    @XmlElement(name = "AccountsTotalExposureAmount")
    protected AmountType accountsTotalExposureAmount;
    @XmlElement(name = "AmountOutstandingPercentage")
    protected BigDecimal amountOutstandingPercentage;
    @XmlElement(name = "OpenAccountsCurrentBalanceAmount")
    protected AmountType openAccountsCurrentBalanceAmount;
    @XmlElement(name = "InvoluntarilyClosedAccountsAveragePeriod")
    protected Duration involuntarilyClosedAccountsAveragePeriod;
    @XmlElement(name = "BorrowerAnalyticsCycleSummary")
    protected List<BorrowerAnalyticsCycleSummary> borrowerAnalyticsCycleSummary;

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
     * Gets the value of the borrowingAccountTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getBorrowingAccountTypeText() {
        return borrowingAccountTypeText;
    }

    /**
     * Sets the value of the borrowingAccountTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setBorrowingAccountTypeText(DNBDecodedStringType value) {
        this.borrowingAccountTypeText = value;
    }

    /**
     * Gets the value of the accountsTotalExposureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsTotalExposureAmount() {
        return accountsTotalExposureAmount;
    }

    /**
     * Sets the value of the accountsTotalExposureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsTotalExposureAmount(AmountType value) {
        this.accountsTotalExposureAmount = value;
    }

    /**
     * Gets the value of the amountOutstandingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOutstandingPercentage() {
        return amountOutstandingPercentage;
    }

    /**
     * Sets the value of the amountOutstandingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountOutstandingPercentage(BigDecimal value) {
        this.amountOutstandingPercentage = value;
    }

    /**
     * Gets the value of the openAccountsCurrentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOpenAccountsCurrentBalanceAmount() {
        return openAccountsCurrentBalanceAmount;
    }

    /**
     * Sets the value of the openAccountsCurrentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOpenAccountsCurrentBalanceAmount(AmountType value) {
        this.openAccountsCurrentBalanceAmount = value;
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
     * Gets the value of the borrowerAnalyticsCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrowerAnalyticsCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowerAnalyticsCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorrowerAnalyticsCycleSummary }
     * 
     * 
     */
    public List<BorrowerAnalyticsCycleSummary> getBorrowerAnalyticsCycleSummary() {
        if (borrowerAnalyticsCycleSummary == null) {
            borrowerAnalyticsCycleSummary = new ArrayList<BorrowerAnalyticsCycleSummary>();
        }
        return this.borrowerAnalyticsCycleSummary;
    }

}
