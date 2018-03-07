
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the stock trading details of the subject.
 *          
 * 
 * <p>Java class for StockTradingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockTradingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReportedClosingStockValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BetaSixtyMonthValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DividendRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DividendYieldValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InstitutionalStockHolderQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="InstitutionalStockHoldingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LatestShortInterestRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LongTermDebtRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetInsiderTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTradingDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "tradingDate",
    "reportedClosingStockValue",
    "betaSixtyMonthValue",
    "dividendRate",
    "dividendYieldValue",
    "institutionalStockHolderQuantity",
    "institutionalStockHoldingPercentage",
    "latestShortInterestRatio",
    "longTermDebtRatio",
    "netInsiderTransactionAmount"
})
public class StockTradingDetail {

    @XmlElement(name = "TradingDate")
    protected DNBDateType tradingDate;
    @XmlElement(name = "ReportedClosingStockValue")
    protected BigDecimal reportedClosingStockValue;
    @XmlElement(name = "BetaSixtyMonthValue")
    protected BigDecimal betaSixtyMonthValue;
    @XmlElement(name = "DividendRate")
    protected BigDecimal dividendRate;
    @XmlElement(name = "DividendYieldValue")
    protected BigDecimal dividendYieldValue;
    @XmlElement(name = "InstitutionalStockHolderQuantity")
    protected BigInteger institutionalStockHolderQuantity;
    @XmlElement(name = "InstitutionalStockHoldingPercentage")
    protected BigDecimal institutionalStockHoldingPercentage;
    @XmlElement(name = "LatestShortInterestRatio")
    protected BigDecimal latestShortInterestRatio;
    @XmlElement(name = "LongTermDebtRatio")
    protected BigDecimal longTermDebtRatio;
    @XmlElement(name = "NetInsiderTransactionAmount")
    protected BigDecimal netInsiderTransactionAmount;

    /**
     * Gets the value of the tradingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getTradingDate() {
        return tradingDate;
    }

    /**
     * Sets the value of the tradingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setTradingDate(DNBDateType value) {
        this.tradingDate = value;
    }

    /**
     * Gets the value of the reportedClosingStockValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReportedClosingStockValue() {
        return reportedClosingStockValue;
    }

    /**
     * Sets the value of the reportedClosingStockValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReportedClosingStockValue(BigDecimal value) {
        this.reportedClosingStockValue = value;
    }

    /**
     * Gets the value of the betaSixtyMonthValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBetaSixtyMonthValue() {
        return betaSixtyMonthValue;
    }

    /**
     * Sets the value of the betaSixtyMonthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBetaSixtyMonthValue(BigDecimal value) {
        this.betaSixtyMonthValue = value;
    }

    /**
     * Gets the value of the dividendRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendRate() {
        return dividendRate;
    }

    /**
     * Sets the value of the dividendRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendRate(BigDecimal value) {
        this.dividendRate = value;
    }

    /**
     * Gets the value of the dividendYieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendYieldValue() {
        return dividendYieldValue;
    }

    /**
     * Sets the value of the dividendYieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendYieldValue(BigDecimal value) {
        this.dividendYieldValue = value;
    }

    /**
     * Gets the value of the institutionalStockHolderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstitutionalStockHolderQuantity() {
        return institutionalStockHolderQuantity;
    }

    /**
     * Sets the value of the institutionalStockHolderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstitutionalStockHolderQuantity(BigInteger value) {
        this.institutionalStockHolderQuantity = value;
    }

    /**
     * Gets the value of the institutionalStockHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstitutionalStockHoldingPercentage() {
        return institutionalStockHoldingPercentage;
    }

    /**
     * Sets the value of the institutionalStockHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstitutionalStockHoldingPercentage(BigDecimal value) {
        this.institutionalStockHoldingPercentage = value;
    }

    /**
     * Gets the value of the latestShortInterestRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatestShortInterestRatio() {
        return latestShortInterestRatio;
    }

    /**
     * Sets the value of the latestShortInterestRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatestShortInterestRatio(BigDecimal value) {
        this.latestShortInterestRatio = value;
    }

    /**
     * Gets the value of the longTermDebtRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongTermDebtRatio() {
        return longTermDebtRatio;
    }

    /**
     * Sets the value of the longTermDebtRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongTermDebtRatio(BigDecimal value) {
        this.longTermDebtRatio = value;
    }

    /**
     * Gets the value of the netInsiderTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetInsiderTransactionAmount() {
        return netInsiderTransactionAmount;
    }

    /**
     * Sets the value of the netInsiderTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetInsiderTransactionAmount(BigDecimal value) {
        this.netInsiderTransactionAmount = value;
    }

}
