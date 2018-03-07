
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDataSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDataSummaryView" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentDataSummaryViewType" minOccurs="0"/>
 *         &lt;element name="HighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditAverageAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageTotalOverdueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageTotalOwingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuppliersTotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OwedTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CashTypeAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SummarizedPastDue" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedPastDueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlacedForCollectionAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlacedForCollectionPastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BadDebtAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BadDebtTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalHighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PastDueTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnfavorableExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "paymentDataSummaryView",
    "highCreditAmount",
    "highCreditAverageAmount",
    "averageTotalOverdueAmount",
    "averageTotalOwingAmount",
    "accountsTotalCount",
    "suppliersTotalCount",
    "owedTotalAmount",
    "currentTotalAmount",
    "currentAccountsTotalCount",
    "pastDueTotalAmount",
    "cashTypeAccountsTotalCount",
    "summarizedPastDue",
    "placedForCollectionAccountsTotalCount",
    "placedForCollectionPastDueTotalAmount",
    "badDebtAccountsTotalCount",
    "badDebtTotalAmount",
    "totalHighCreditAmount",
    "pastDueTotalCount",
    "unfavorableExperiencesTotalCount"
})
public class PaymentDataSummaryType {

    @XmlElement(name = "PaymentDataSummaryView")
    protected PaymentDataSummaryViewType paymentDataSummaryView;
    @XmlElement(name = "HighCreditAmount")
    protected AmountType highCreditAmount;
    @XmlElement(name = "HighCreditAverageAmount")
    protected AmountType highCreditAverageAmount;
    @XmlElement(name = "AverageTotalOverdueAmount")
    protected AmountType averageTotalOverdueAmount;
    @XmlElement(name = "AverageTotalOwingAmount")
    protected AmountType averageTotalOwingAmount;
    @XmlElement(name = "AccountsTotalCount")
    protected int accountsTotalCount;
    @XmlElement(name = "SuppliersTotalCount")
    protected int suppliersTotalCount;
    @XmlElement(name = "OwedTotalAmount")
    protected AmountType owedTotalAmount;
    @XmlElement(name = "CurrentTotalAmount")
    protected AmountType currentTotalAmount;
    @XmlElement(name = "CurrentAccountsTotalCount")
    protected Integer currentAccountsTotalCount;
    @XmlElement(name = "PastDueTotalAmount")
    protected AmountType pastDueTotalAmount;
    @XmlElement(name = "CashTypeAccountsTotalCount")
    protected Integer cashTypeAccountsTotalCount;
    @XmlElement(name = "SummarizedPastDue")
    protected List<SummarizedPastDueType> summarizedPastDue;
    @XmlElement(name = "PlacedForCollectionAccountsTotalCount")
    protected Integer placedForCollectionAccountsTotalCount;
    @XmlElement(name = "PlacedForCollectionPastDueTotalAmount")
    protected AmountType placedForCollectionPastDueTotalAmount;
    @XmlElement(name = "BadDebtAccountsTotalCount")
    protected Integer badDebtAccountsTotalCount;
    @XmlElement(name = "BadDebtTotalAmount")
    protected AmountType badDebtTotalAmount;
    @XmlElement(name = "TotalHighCreditAmount")
    protected AmountType totalHighCreditAmount;
    @XmlElement(name = "PastDueTotalCount")
    protected Integer pastDueTotalCount;
    @XmlElement(name = "UnfavorableExperiencesTotalCount")
    protected Integer unfavorableExperiencesTotalCount;

    /**
     * Gets the value of the paymentDataSummaryView property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataSummaryViewType }
     *     
     */
    public PaymentDataSummaryViewType getPaymentDataSummaryView() {
        return paymentDataSummaryView;
    }

    /**
     * Sets the value of the paymentDataSummaryView property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataSummaryViewType }
     *     
     */
    public void setPaymentDataSummaryView(PaymentDataSummaryViewType value) {
        this.paymentDataSummaryView = value;
    }

    /**
     * Gets the value of the highCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditAmount() {
        return highCreditAmount;
    }

    /**
     * Sets the value of the highCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditAmount(AmountType value) {
        this.highCreditAmount = value;
    }

    /**
     * Gets the value of the highCreditAverageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditAverageAmount() {
        return highCreditAverageAmount;
    }

    /**
     * Sets the value of the highCreditAverageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditAverageAmount(AmountType value) {
        this.highCreditAverageAmount = value;
    }

    /**
     * Gets the value of the averageTotalOverdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageTotalOverdueAmount() {
        return averageTotalOverdueAmount;
    }

    /**
     * Sets the value of the averageTotalOverdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageTotalOverdueAmount(AmountType value) {
        this.averageTotalOverdueAmount = value;
    }

    /**
     * Gets the value of the averageTotalOwingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageTotalOwingAmount() {
        return averageTotalOwingAmount;
    }

    /**
     * Sets the value of the averageTotalOwingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageTotalOwingAmount(AmountType value) {
        this.averageTotalOwingAmount = value;
    }

    /**
     * Gets the value of the accountsTotalCount property.
     * 
     */
    public int getAccountsTotalCount() {
        return accountsTotalCount;
    }

    /**
     * Sets the value of the accountsTotalCount property.
     * 
     */
    public void setAccountsTotalCount(int value) {
        this.accountsTotalCount = value;
    }

    /**
     * Gets the value of the suppliersTotalCount property.
     * 
     */
    public int getSuppliersTotalCount() {
        return suppliersTotalCount;
    }

    /**
     * Sets the value of the suppliersTotalCount property.
     * 
     */
    public void setSuppliersTotalCount(int value) {
        this.suppliersTotalCount = value;
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
     * Gets the value of the currentAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentAccountsTotalCount() {
        return currentAccountsTotalCount;
    }

    /**
     * Sets the value of the currentAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentAccountsTotalCount(Integer value) {
        this.currentAccountsTotalCount = value;
    }

    /**
     * Gets the value of the pastDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPastDueTotalAmount() {
        return pastDueTotalAmount;
    }

    /**
     * Sets the value of the pastDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPastDueTotalAmount(AmountType value) {
        this.pastDueTotalAmount = value;
    }

    /**
     * Gets the value of the cashTypeAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCashTypeAccountsTotalCount() {
        return cashTypeAccountsTotalCount;
    }

    /**
     * Sets the value of the cashTypeAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCashTypeAccountsTotalCount(Integer value) {
        this.cashTypeAccountsTotalCount = value;
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
     * {@link SummarizedPastDueType }
     * 
     * 
     */
    public List<SummarizedPastDueType> getSummarizedPastDue() {
        if (summarizedPastDue == null) {
            summarizedPastDue = new ArrayList<SummarizedPastDueType>();
        }
        return this.summarizedPastDue;
    }

    /**
     * Gets the value of the placedForCollectionAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlacedForCollectionAccountsTotalCount() {
        return placedForCollectionAccountsTotalCount;
    }

    /**
     * Sets the value of the placedForCollectionAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlacedForCollectionAccountsTotalCount(Integer value) {
        this.placedForCollectionAccountsTotalCount = value;
    }

    /**
     * Gets the value of the placedForCollectionPastDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlacedForCollectionPastDueTotalAmount() {
        return placedForCollectionPastDueTotalAmount;
    }

    /**
     * Sets the value of the placedForCollectionPastDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlacedForCollectionPastDueTotalAmount(AmountType value) {
        this.placedForCollectionPastDueTotalAmount = value;
    }

    /**
     * Gets the value of the badDebtAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBadDebtAccountsTotalCount() {
        return badDebtAccountsTotalCount;
    }

    /**
     * Sets the value of the badDebtAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBadDebtAccountsTotalCount(Integer value) {
        this.badDebtAccountsTotalCount = value;
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
     * Gets the value of the totalHighCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalHighCreditAmount() {
        return totalHighCreditAmount;
    }

    /**
     * Sets the value of the totalHighCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalHighCreditAmount(AmountType value) {
        this.totalHighCreditAmount = value;
    }

    /**
     * Gets the value of the pastDueTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastDueTotalCount() {
        return pastDueTotalCount;
    }

    /**
     * Sets the value of the pastDueTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastDueTotalCount(Integer value) {
        this.pastDueTotalCount = value;
    }

    /**
     * Gets the value of the unfavorableExperiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnfavorableExperiencesTotalCount() {
        return unfavorableExperiencesTotalCount;
    }

    /**
     * Sets the value of the unfavorableExperiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnfavorableExperiencesTotalCount(Integer value) {
        this.unfavorableExperiencesTotalCount = value;
    }

}
