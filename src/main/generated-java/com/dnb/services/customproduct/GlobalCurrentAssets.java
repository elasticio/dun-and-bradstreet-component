
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCurrentAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCurrentAssets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountReceivable" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalReceivableAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="LiquidFundsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="StocksAndContractsInProgress" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalStocksAndContractsInProgressAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="CurrentInvestmentsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="DeferredChargesAndAccruedIncomeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="OtherCurrentAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCurrentAssets", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "amountReceivable",
    "totalReceivableAmount",
    "liquidFundsAmount",
    "stocksAndContractsInProgress",
    "totalStocksAndContractsInProgressAmount",
    "currentInvestmentsAmount",
    "deferredChargesAndAccruedIncomeAmount",
    "otherCurrentAssetsAmount"
})
public class GlobalCurrentAssets {

    @XmlElement(name = "AmountReceivable")
    protected StatementItemType amountReceivable;
    @XmlElement(name = "TotalReceivableAmount")
    protected FinancialAmountType totalReceivableAmount;
    @XmlElement(name = "LiquidFundsAmount")
    protected FinancialAmountType liquidFundsAmount;
    @XmlElement(name = "StocksAndContractsInProgress")
    protected StatementItemType stocksAndContractsInProgress;
    @XmlElement(name = "TotalStocksAndContractsInProgressAmount")
    protected FinancialAmountType totalStocksAndContractsInProgressAmount;
    @XmlElement(name = "CurrentInvestmentsAmount")
    protected FinancialAmountType currentInvestmentsAmount;
    @XmlElement(name = "DeferredChargesAndAccruedIncomeAmount")
    protected FinancialAmountType deferredChargesAndAccruedIncomeAmount;
    @XmlElement(name = "OtherCurrentAssetsAmount")
    protected FinancialAmountType otherCurrentAssetsAmount;

    /**
     * Gets the value of the amountReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getAmountReceivable() {
        return amountReceivable;
    }

    /**
     * Sets the value of the amountReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setAmountReceivable(StatementItemType value) {
        this.amountReceivable = value;
    }

    /**
     * Gets the value of the totalReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalReceivableAmount() {
        return totalReceivableAmount;
    }

    /**
     * Sets the value of the totalReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalReceivableAmount(FinancialAmountType value) {
        this.totalReceivableAmount = value;
    }

    /**
     * Gets the value of the liquidFundsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getLiquidFundsAmount() {
        return liquidFundsAmount;
    }

    /**
     * Sets the value of the liquidFundsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setLiquidFundsAmount(FinancialAmountType value) {
        this.liquidFundsAmount = value;
    }

    /**
     * Gets the value of the stocksAndContractsInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getStocksAndContractsInProgress() {
        return stocksAndContractsInProgress;
    }

    /**
     * Sets the value of the stocksAndContractsInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setStocksAndContractsInProgress(StatementItemType value) {
        this.stocksAndContractsInProgress = value;
    }

    /**
     * Gets the value of the totalStocksAndContractsInProgressAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalStocksAndContractsInProgressAmount() {
        return totalStocksAndContractsInProgressAmount;
    }

    /**
     * Sets the value of the totalStocksAndContractsInProgressAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalStocksAndContractsInProgressAmount(FinancialAmountType value) {
        this.totalStocksAndContractsInProgressAmount = value;
    }

    /**
     * Gets the value of the currentInvestmentsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getCurrentInvestmentsAmount() {
        return currentInvestmentsAmount;
    }

    /**
     * Sets the value of the currentInvestmentsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setCurrentInvestmentsAmount(FinancialAmountType value) {
        this.currentInvestmentsAmount = value;
    }

    /**
     * Gets the value of the deferredChargesAndAccruedIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getDeferredChargesAndAccruedIncomeAmount() {
        return deferredChargesAndAccruedIncomeAmount;
    }

    /**
     * Sets the value of the deferredChargesAndAccruedIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setDeferredChargesAndAccruedIncomeAmount(FinancialAmountType value) {
        this.deferredChargesAndAccruedIncomeAmount = value;
    }

    /**
     * Gets the value of the otherCurrentAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getOtherCurrentAssetsAmount() {
        return otherCurrentAssetsAmount;
    }

    /**
     * Sets the value of the otherCurrentAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setOtherCurrentAssetsAmount(FinancialAmountType value) {
        this.otherCurrentAssetsAmount = value;
    }

}
