
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalEquity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalEquity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="SharePremiumAccountAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="Capital" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="RevaluationSurplusesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TotalReservesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="AccumulatedProfitsOrLossesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossFortheFinancialYearAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentGrantsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalEquity", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalCapitalAmount",
    "sharePremiumAccountAmount",
    "capital",
    "revaluationSurplusesAmount",
    "totalReservesAmount",
    "accumulatedProfitsOrLossesAmount",
    "profitOrLossFortheFinancialYearAmount",
    "investmentGrantsAmount"
})
public class GlobalEquity {

    @XmlElement(name = "TotalCapitalAmount")
    protected FinancialAmountType totalCapitalAmount;
    @XmlElement(name = "SharePremiumAccountAmount")
    protected FinancialAmountType sharePremiumAccountAmount;
    @XmlElement(name = "Capital")
    protected StatementItemType capital;
    @XmlElement(name = "RevaluationSurplusesAmount")
    protected FinancialAmountType revaluationSurplusesAmount;
    @XmlElement(name = "TotalReservesAmount")
    protected FinancialAmountType totalReservesAmount;
    @XmlElement(name = "AccumulatedProfitsOrLossesAmount")
    protected FinancialAmountType accumulatedProfitsOrLossesAmount;
    @XmlElement(name = "ProfitOrLossFortheFinancialYearAmount")
    protected FinancialAmountType profitOrLossFortheFinancialYearAmount;
    @XmlElement(name = "InvestmentGrantsAmount")
    protected FinancialAmountType investmentGrantsAmount;

    /**
     * Gets the value of the totalCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalCapitalAmount() {
        return totalCapitalAmount;
    }

    /**
     * Sets the value of the totalCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalCapitalAmount(FinancialAmountType value) {
        this.totalCapitalAmount = value;
    }

    /**
     * Gets the value of the sharePremiumAccountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getSharePremiumAccountAmount() {
        return sharePremiumAccountAmount;
    }

    /**
     * Sets the value of the sharePremiumAccountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setSharePremiumAccountAmount(FinancialAmountType value) {
        this.sharePremiumAccountAmount = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setCapital(StatementItemType value) {
        this.capital = value;
    }

    /**
     * Gets the value of the revaluationSurplusesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getRevaluationSurplusesAmount() {
        return revaluationSurplusesAmount;
    }

    /**
     * Sets the value of the revaluationSurplusesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setRevaluationSurplusesAmount(FinancialAmountType value) {
        this.revaluationSurplusesAmount = value;
    }

    /**
     * Gets the value of the totalReservesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalReservesAmount() {
        return totalReservesAmount;
    }

    /**
     * Sets the value of the totalReservesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalReservesAmount(FinancialAmountType value) {
        this.totalReservesAmount = value;
    }

    /**
     * Gets the value of the accumulatedProfitsOrLossesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getAccumulatedProfitsOrLossesAmount() {
        return accumulatedProfitsOrLossesAmount;
    }

    /**
     * Sets the value of the accumulatedProfitsOrLossesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setAccumulatedProfitsOrLossesAmount(FinancialAmountType value) {
        this.accumulatedProfitsOrLossesAmount = value;
    }

    /**
     * Gets the value of the profitOrLossFortheFinancialYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getProfitOrLossFortheFinancialYearAmount() {
        return profitOrLossFortheFinancialYearAmount;
    }

    /**
     * Sets the value of the profitOrLossFortheFinancialYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setProfitOrLossFortheFinancialYearAmount(FinancialAmountType value) {
        this.profitOrLossFortheFinancialYearAmount = value;
    }

    /**
     * Gets the value of the investmentGrantsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getInvestmentGrantsAmount() {
        return investmentGrantsAmount;
    }

    /**
     * Sets the value of the investmentGrantsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setInvestmentGrantsAmount(FinancialAmountType value) {
        this.investmentGrantsAmount = value;
    }

}
