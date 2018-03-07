
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedDataCoveragePayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedDataCoveragePayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashPayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedCashPayments" minOccurs="0"/>
 *         &lt;element name="OwedTotalMaximumAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PastDueTotalMaximumAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedPaymentPeriodSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SuppliersCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OwedTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PastDueExperiencesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnfavorableExperiencesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonthlyAverageOwedTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MonthlyAveragePastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PlacedForCollectionExperiencesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlacedforCollectionPastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BadDebtExperiencesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BadDebtTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SlowExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowNegativeExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowPaymentsExistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NegativeExperiencePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AverageHighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditMaximumAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SatisfactoryExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManneredExperiencesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManneredExperiencesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NegativePaymentsExistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SplitManneredExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SplitManneredExperienceTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SummarizedPastDue" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedPastDueTypeForDetailedTrade" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SlowOrNegativePaymentsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NegativeExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueAmountPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PastDueExperiencePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaximumPastdueAmountPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaximumCumulativePastDueAmountPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaximumCumulativePastDueExperiencesPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HighestMaximumPastdueAmountPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastPastDueElapsedMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighestOwedElapsedMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighestPastDueElapsedMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AverageMonthlyPastDuePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorstPastDueCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="TotalExperienceAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PromptPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedDataCoveragePayments", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "cashPayments",
    "owedTotalMaximumAmount",
    "pastDueTotalMaximumAmount",
    "paymentPeriodSummary",
    "suppliersCount",
    "accountsCount",
    "owedTotalAmount",
    "totalPastDueTotalAmount",
    "pastDueExperiencesCount",
    "unfavorableExperiencesCount",
    "monthlyAverageOwedTotalAmount",
    "monthlyAveragePastDueTotalAmount",
    "currentAccountsCount",
    "currentTotalAmount",
    "placedForCollectionExperiencesCount",
    "placedforCollectionPastDueTotalAmount",
    "badDebtExperiencesCount",
    "badDebtTotalAmount",
    "slowExperienceCount",
    "slowNegativeExperienceCount",
    "slowPaymentsExistIndicator",
    "negativeExperiencePercentage",
    "averageHighCreditAmount",
    "highCreditMaximumAmount",
    "satisfactoryExperienceCount",
    "manneredExperiencesCount",
    "manneredExperiencesAmount",
    "negativePaymentsExistIndicator",
    "splitManneredExperienceCount",
    "splitManneredExperienceTotalAmount",
    "totalExperienceCount",
    "summarizedPastDue",
    "slowOrNegativePaymentsPercentage",
    "negativeExperienceCount",
    "pastDueAmountPercentage",
    "pastDueExperiencePercentage",
    "maximumPastdueAmountPercentage",
    "maximumCumulativePastDueAmountPercentage",
    "maximumCumulativePastDueExperiencesPercentage",
    "highestMaximumPastdueAmountPercentage",
    "lastPastDueElapsedMonthCount",
    "highestOwedElapsedMonthCount",
    "highestPastDueElapsedMonthCount",
    "pastDueMonthCount",
    "averageMonthlyPastDuePercentage",
    "worstPastDueCode",
    "totalExperienceAmount",
    "promptPercentage"
})
public class PurchaserDerivedDataCoveragePayments {

    @XmlElement(name = "CashPayments")
    protected PurchaserDerivedCashPayments cashPayments;
    @XmlElement(name = "OwedTotalMaximumAmount")
    protected AmountType owedTotalMaximumAmount;
    @XmlElement(name = "PastDueTotalMaximumAmount")
    protected AmountType pastDueTotalMaximumAmount;
    @XmlElement(name = "PaymentPeriodSummary")
    protected List<PurchaserDerivedPaymentPeriodSummary> paymentPeriodSummary;
    @XmlElement(name = "SuppliersCount")
    protected Integer suppliersCount;
    @XmlElement(name = "AccountsCount")
    protected Integer accountsCount;
    @XmlElement(name = "OwedTotalAmount")
    protected AmountType owedTotalAmount;
    @XmlElement(name = "TotalPastDueTotalAmount")
    protected AmountType totalPastDueTotalAmount;
    @XmlElement(name = "PastDueExperiencesCount")
    protected Integer pastDueExperiencesCount;
    @XmlElement(name = "UnfavorableExperiencesCount")
    protected Integer unfavorableExperiencesCount;
    @XmlElement(name = "MonthlyAverageOwedTotalAmount")
    protected AmountType monthlyAverageOwedTotalAmount;
    @XmlElement(name = "MonthlyAveragePastDueTotalAmount")
    protected AmountType monthlyAveragePastDueTotalAmount;
    @XmlElement(name = "CurrentAccountsCount")
    protected Integer currentAccountsCount;
    @XmlElement(name = "CurrentTotalAmount")
    protected AmountType currentTotalAmount;
    @XmlElement(name = "PlacedForCollectionExperiencesCount")
    protected Integer placedForCollectionExperiencesCount;
    @XmlElement(name = "PlacedforCollectionPastDueTotalAmount")
    protected AmountType placedforCollectionPastDueTotalAmount;
    @XmlElement(name = "BadDebtExperiencesCount")
    protected Integer badDebtExperiencesCount;
    @XmlElement(name = "BadDebtTotalAmount")
    protected AmountType badDebtTotalAmount;
    @XmlElement(name = "SlowExperienceCount")
    protected Integer slowExperienceCount;
    @XmlElement(name = "SlowNegativeExperienceCount")
    protected Integer slowNegativeExperienceCount;
    @XmlElement(name = "SlowPaymentsExistIndicator")
    protected Boolean slowPaymentsExistIndicator;
    @XmlElement(name = "NegativeExperiencePercentage")
    protected BigDecimal negativeExperiencePercentage;
    @XmlElement(name = "AverageHighCreditAmount")
    protected AmountType averageHighCreditAmount;
    @XmlElement(name = "HighCreditMaximumAmount")
    protected AmountType highCreditMaximumAmount;
    @XmlElement(name = "SatisfactoryExperienceCount")
    protected Integer satisfactoryExperienceCount;
    @XmlElement(name = "ManneredExperiencesCount")
    protected Integer manneredExperiencesCount;
    @XmlElement(name = "ManneredExperiencesAmount")
    protected AmountType manneredExperiencesAmount;
    @XmlElement(name = "NegativePaymentsExistIndicator")
    protected Boolean negativePaymentsExistIndicator;
    @XmlElement(name = "SplitManneredExperienceCount")
    protected Integer splitManneredExperienceCount;
    @XmlElement(name = "SplitManneredExperienceTotalAmount")
    protected AmountType splitManneredExperienceTotalAmount;
    @XmlElement(name = "TotalExperienceCount")
    protected Integer totalExperienceCount;
    @XmlElement(name = "SummarizedPastDue")
    protected List<SummarizedPastDueTypeForDetailedTrade> summarizedPastDue;
    @XmlElement(name = "SlowOrNegativePaymentsPercentage")
    protected BigDecimal slowOrNegativePaymentsPercentage;
    @XmlElement(name = "NegativeExperienceCount")
    protected Integer negativeExperienceCount;
    @XmlElement(name = "PastDueAmountPercentage")
    protected BigDecimal pastDueAmountPercentage;
    @XmlElement(name = "PastDueExperiencePercentage")
    protected BigDecimal pastDueExperiencePercentage;
    @XmlElement(name = "MaximumPastdueAmountPercentage")
    protected BigDecimal maximumPastdueAmountPercentage;
    @XmlElement(name = "MaximumCumulativePastDueAmountPercentage")
    protected BigDecimal maximumCumulativePastDueAmountPercentage;
    @XmlElement(name = "MaximumCumulativePastDueExperiencesPercentage")
    protected BigDecimal maximumCumulativePastDueExperiencesPercentage;
    @XmlElement(name = "HighestMaximumPastdueAmountPercentage")
    protected BigDecimal highestMaximumPastdueAmountPercentage;
    @XmlElement(name = "LastPastDueElapsedMonthCount")
    protected Integer lastPastDueElapsedMonthCount;
    @XmlElement(name = "HighestOwedElapsedMonthCount")
    protected Integer highestOwedElapsedMonthCount;
    @XmlElement(name = "HighestPastDueElapsedMonthCount")
    protected Integer highestPastDueElapsedMonthCount;
    @XmlElement(name = "PastDueMonthCount")
    protected Integer pastDueMonthCount;
    @XmlElement(name = "AverageMonthlyPastDuePercentage")
    protected BigDecimal averageMonthlyPastDuePercentage;
    @XmlElement(name = "WorstPastDueCode")
    protected String worstPastDueCode;
    @XmlElement(name = "TotalExperienceAmount")
    protected AmountType totalExperienceAmount;
    @XmlElement(name = "PromptPercentage")
    protected BigDecimal promptPercentage;

    /**
     * Gets the value of the cashPayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedCashPayments }
     *     
     */
    public PurchaserDerivedCashPayments getCashPayments() {
        return cashPayments;
    }

    /**
     * Sets the value of the cashPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedCashPayments }
     *     
     */
    public void setCashPayments(PurchaserDerivedCashPayments value) {
        this.cashPayments = value;
    }

    /**
     * Gets the value of the owedTotalMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwedTotalMaximumAmount() {
        return owedTotalMaximumAmount;
    }

    /**
     * Sets the value of the owedTotalMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwedTotalMaximumAmount(AmountType value) {
        this.owedTotalMaximumAmount = value;
    }

    /**
     * Gets the value of the pastDueTotalMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPastDueTotalMaximumAmount() {
        return pastDueTotalMaximumAmount;
    }

    /**
     * Sets the value of the pastDueTotalMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPastDueTotalMaximumAmount(AmountType value) {
        this.pastDueTotalMaximumAmount = value;
    }

    /**
     * Gets the value of the paymentPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaserDerivedPaymentPeriodSummary }
     * 
     * 
     */
    public List<PurchaserDerivedPaymentPeriodSummary> getPaymentPeriodSummary() {
        if (paymentPeriodSummary == null) {
            paymentPeriodSummary = new ArrayList<PurchaserDerivedPaymentPeriodSummary>();
        }
        return this.paymentPeriodSummary;
    }

    /**
     * Gets the value of the suppliersCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuppliersCount() {
        return suppliersCount;
    }

    /**
     * Sets the value of the suppliersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuppliersCount(Integer value) {
        this.suppliersCount = value;
    }

    /**
     * Gets the value of the accountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountsCount() {
        return accountsCount;
    }

    /**
     * Sets the value of the accountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountsCount(Integer value) {
        this.accountsCount = value;
    }

    /**
     * Gets the value of the owedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwedTotalAmount() {
        return owedTotalAmount;
    }

    /**
     * Sets the value of the owedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwedTotalAmount(AmountType value) {
        this.owedTotalAmount = value;
    }

    /**
     * Gets the value of the totalPastDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalPastDueTotalAmount() {
        return totalPastDueTotalAmount;
    }

    /**
     * Sets the value of the totalPastDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalPastDueTotalAmount(AmountType value) {
        this.totalPastDueTotalAmount = value;
    }

    /**
     * Gets the value of the pastDueExperiencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastDueExperiencesCount() {
        return pastDueExperiencesCount;
    }

    /**
     * Sets the value of the pastDueExperiencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastDueExperiencesCount(Integer value) {
        this.pastDueExperiencesCount = value;
    }

    /**
     * Gets the value of the unfavorableExperiencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnfavorableExperiencesCount() {
        return unfavorableExperiencesCount;
    }

    /**
     * Sets the value of the unfavorableExperiencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnfavorableExperiencesCount(Integer value) {
        this.unfavorableExperiencesCount = value;
    }

    /**
     * Gets the value of the monthlyAverageOwedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMonthlyAverageOwedTotalAmount() {
        return monthlyAverageOwedTotalAmount;
    }

    /**
     * Sets the value of the monthlyAverageOwedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMonthlyAverageOwedTotalAmount(AmountType value) {
        this.monthlyAverageOwedTotalAmount = value;
    }

    /**
     * Gets the value of the monthlyAveragePastDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMonthlyAveragePastDueTotalAmount() {
        return monthlyAveragePastDueTotalAmount;
    }

    /**
     * Sets the value of the monthlyAveragePastDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMonthlyAveragePastDueTotalAmount(AmountType value) {
        this.monthlyAveragePastDueTotalAmount = value;
    }

    /**
     * Gets the value of the currentAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentAccountsCount() {
        return currentAccountsCount;
    }

    /**
     * Sets the value of the currentAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentAccountsCount(Integer value) {
        this.currentAccountsCount = value;
    }

    /**
     * Gets the value of the currentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentTotalAmount() {
        return currentTotalAmount;
    }

    /**
     * Sets the value of the currentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentTotalAmount(AmountType value) {
        this.currentTotalAmount = value;
    }

    /**
     * Gets the value of the placedForCollectionExperiencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlacedForCollectionExperiencesCount() {
        return placedForCollectionExperiencesCount;
    }

    /**
     * Sets the value of the placedForCollectionExperiencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlacedForCollectionExperiencesCount(Integer value) {
        this.placedForCollectionExperiencesCount = value;
    }

    /**
     * Gets the value of the placedforCollectionPastDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlacedforCollectionPastDueTotalAmount() {
        return placedforCollectionPastDueTotalAmount;
    }

    /**
     * Sets the value of the placedforCollectionPastDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlacedforCollectionPastDueTotalAmount(AmountType value) {
        this.placedforCollectionPastDueTotalAmount = value;
    }

    /**
     * Gets the value of the badDebtExperiencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBadDebtExperiencesCount() {
        return badDebtExperiencesCount;
    }

    /**
     * Sets the value of the badDebtExperiencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBadDebtExperiencesCount(Integer value) {
        this.badDebtExperiencesCount = value;
    }

    /**
     * Gets the value of the badDebtTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBadDebtTotalAmount() {
        return badDebtTotalAmount;
    }

    /**
     * Sets the value of the badDebtTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBadDebtTotalAmount(AmountType value) {
        this.badDebtTotalAmount = value;
    }

    /**
     * Gets the value of the slowExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowExperienceCount() {
        return slowExperienceCount;
    }

    /**
     * Sets the value of the slowExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowExperienceCount(Integer value) {
        this.slowExperienceCount = value;
    }

    /**
     * Gets the value of the slowNegativeExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowNegativeExperienceCount() {
        return slowNegativeExperienceCount;
    }

    /**
     * Sets the value of the slowNegativeExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowNegativeExperienceCount(Integer value) {
        this.slowNegativeExperienceCount = value;
    }

    /**
     * Gets the value of the slowPaymentsExistIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlowPaymentsExistIndicator() {
        return slowPaymentsExistIndicator;
    }

    /**
     * Sets the value of the slowPaymentsExistIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlowPaymentsExistIndicator(Boolean value) {
        this.slowPaymentsExistIndicator = value;
    }

    /**
     * Gets the value of the negativeExperiencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNegativeExperiencePercentage() {
        return negativeExperiencePercentage;
    }

    /**
     * Sets the value of the negativeExperiencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNegativeExperiencePercentage(BigDecimal value) {
        this.negativeExperiencePercentage = value;
    }

    /**
     * Gets the value of the averageHighCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageHighCreditAmount() {
        return averageHighCreditAmount;
    }

    /**
     * Sets the value of the averageHighCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageHighCreditAmount(AmountType value) {
        this.averageHighCreditAmount = value;
    }

    /**
     * Gets the value of the highCreditMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditMaximumAmount() {
        return highCreditMaximumAmount;
    }

    /**
     * Sets the value of the highCreditMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditMaximumAmount(AmountType value) {
        this.highCreditMaximumAmount = value;
    }

    /**
     * Gets the value of the satisfactoryExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSatisfactoryExperienceCount() {
        return satisfactoryExperienceCount;
    }

    /**
     * Sets the value of the satisfactoryExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSatisfactoryExperienceCount(Integer value) {
        this.satisfactoryExperienceCount = value;
    }

    /**
     * Gets the value of the manneredExperiencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManneredExperiencesCount() {
        return manneredExperiencesCount;
    }

    /**
     * Sets the value of the manneredExperiencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManneredExperiencesCount(Integer value) {
        this.manneredExperiencesCount = value;
    }

    /**
     * Gets the value of the manneredExperiencesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getManneredExperiencesAmount() {
        return manneredExperiencesAmount;
    }

    /**
     * Sets the value of the manneredExperiencesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setManneredExperiencesAmount(AmountType value) {
        this.manneredExperiencesAmount = value;
    }

    /**
     * Gets the value of the negativePaymentsExistIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegativePaymentsExistIndicator() {
        return negativePaymentsExistIndicator;
    }

    /**
     * Sets the value of the negativePaymentsExistIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegativePaymentsExistIndicator(Boolean value) {
        this.negativePaymentsExistIndicator = value;
    }

    /**
     * Gets the value of the splitManneredExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSplitManneredExperienceCount() {
        return splitManneredExperienceCount;
    }

    /**
     * Sets the value of the splitManneredExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSplitManneredExperienceCount(Integer value) {
        this.splitManneredExperienceCount = value;
    }

    /**
     * Gets the value of the splitManneredExperienceTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSplitManneredExperienceTotalAmount() {
        return splitManneredExperienceTotalAmount;
    }

    /**
     * Sets the value of the splitManneredExperienceTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSplitManneredExperienceTotalAmount(AmountType value) {
        this.splitManneredExperienceTotalAmount = value;
    }

    /**
     * Gets the value of the totalExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalExperienceCount() {
        return totalExperienceCount;
    }

    /**
     * Sets the value of the totalExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalExperienceCount(Integer value) {
        this.totalExperienceCount = value;
    }

    /**
     * Gets the value of the summarizedPastDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarizedPastDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarizedPastDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarizedPastDueTypeForDetailedTrade }
     * 
     * 
     */
    public List<SummarizedPastDueTypeForDetailedTrade> getSummarizedPastDue() {
        if (summarizedPastDue == null) {
            summarizedPastDue = new ArrayList<SummarizedPastDueTypeForDetailedTrade>();
        }
        return this.summarizedPastDue;
    }

    /**
     * Gets the value of the slowOrNegativePaymentsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSlowOrNegativePaymentsPercentage() {
        return slowOrNegativePaymentsPercentage;
    }

    /**
     * Sets the value of the slowOrNegativePaymentsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSlowOrNegativePaymentsPercentage(BigDecimal value) {
        this.slowOrNegativePaymentsPercentage = value;
    }

    /**
     * Gets the value of the negativeExperienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativeExperienceCount() {
        return negativeExperienceCount;
    }

    /**
     * Sets the value of the negativeExperienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativeExperienceCount(Integer value) {
        this.negativeExperienceCount = value;
    }

    /**
     * Gets the value of the pastDueAmountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDueAmountPercentage() {
        return pastDueAmountPercentage;
    }

    /**
     * Sets the value of the pastDueAmountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDueAmountPercentage(BigDecimal value) {
        this.pastDueAmountPercentage = value;
    }

    /**
     * Gets the value of the pastDueExperiencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDueExperiencePercentage() {
        return pastDueExperiencePercentage;
    }

    /**
     * Sets the value of the pastDueExperiencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDueExperiencePercentage(BigDecimal value) {
        this.pastDueExperiencePercentage = value;
    }

    /**
     * Gets the value of the maximumPastdueAmountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPastdueAmountPercentage() {
        return maximumPastdueAmountPercentage;
    }

    /**
     * Sets the value of the maximumPastdueAmountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPastdueAmountPercentage(BigDecimal value) {
        this.maximumPastdueAmountPercentage = value;
    }

    /**
     * Gets the value of the maximumCumulativePastDueAmountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumCumulativePastDueAmountPercentage() {
        return maximumCumulativePastDueAmountPercentage;
    }

    /**
     * Sets the value of the maximumCumulativePastDueAmountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumCumulativePastDueAmountPercentage(BigDecimal value) {
        this.maximumCumulativePastDueAmountPercentage = value;
    }

    /**
     * Gets the value of the maximumCumulativePastDueExperiencesPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumCumulativePastDueExperiencesPercentage() {
        return maximumCumulativePastDueExperiencesPercentage;
    }

    /**
     * Sets the value of the maximumCumulativePastDueExperiencesPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumCumulativePastDueExperiencesPercentage(BigDecimal value) {
        this.maximumCumulativePastDueExperiencesPercentage = value;
    }

    /**
     * Gets the value of the highestMaximumPastdueAmountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHighestMaximumPastdueAmountPercentage() {
        return highestMaximumPastdueAmountPercentage;
    }

    /**
     * Sets the value of the highestMaximumPastdueAmountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHighestMaximumPastdueAmountPercentage(BigDecimal value) {
        this.highestMaximumPastdueAmountPercentage = value;
    }

    /**
     * Gets the value of the lastPastDueElapsedMonthCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastPastDueElapsedMonthCount() {
        return lastPastDueElapsedMonthCount;
    }

    /**
     * Sets the value of the lastPastDueElapsedMonthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastPastDueElapsedMonthCount(Integer value) {
        this.lastPastDueElapsedMonthCount = value;
    }

    /**
     * Gets the value of the highestOwedElapsedMonthCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighestOwedElapsedMonthCount() {
        return highestOwedElapsedMonthCount;
    }

    /**
     * Sets the value of the highestOwedElapsedMonthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighestOwedElapsedMonthCount(Integer value) {
        this.highestOwedElapsedMonthCount = value;
    }

    /**
     * Gets the value of the highestPastDueElapsedMonthCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighestPastDueElapsedMonthCount() {
        return highestPastDueElapsedMonthCount;
    }

    /**
     * Sets the value of the highestPastDueElapsedMonthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighestPastDueElapsedMonthCount(Integer value) {
        this.highestPastDueElapsedMonthCount = value;
    }

    /**
     * Gets the value of the pastDueMonthCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastDueMonthCount() {
        return pastDueMonthCount;
    }

    /**
     * Sets the value of the pastDueMonthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastDueMonthCount(Integer value) {
        this.pastDueMonthCount = value;
    }

    /**
     * Gets the value of the averageMonthlyPastDuePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageMonthlyPastDuePercentage() {
        return averageMonthlyPastDuePercentage;
    }

    /**
     * Sets the value of the averageMonthlyPastDuePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageMonthlyPastDuePercentage(BigDecimal value) {
        this.averageMonthlyPastDuePercentage = value;
    }

    /**
     * Gets the value of the worstPastDueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorstPastDueCode() {
        return worstPastDueCode;
    }

    /**
     * Sets the value of the worstPastDueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorstPastDueCode(String value) {
        this.worstPastDueCode = value;
    }

    /**
     * Gets the value of the totalExperienceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalExperienceAmount() {
        return totalExperienceAmount;
    }

    /**
     * Sets the value of the totalExperienceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalExperienceAmount(AmountType value) {
        this.totalExperienceAmount = value;
    }

    /**
     * Gets the value of the promptPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromptPercentage() {
        return promptPercentage;
    }

    /**
     * Sets the value of the promptPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromptPercentage(BigDecimal value) {
        this.promptPercentage = value;
    }

}
