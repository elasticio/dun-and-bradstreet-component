
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentAccountPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentAccountPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OpenAccountsWithBalanceCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OpenAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalOriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LatestOriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LatestMaximumOriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalUtilizationPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalPastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumPastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle1Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle2Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle3Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="PastDuePaymentCycle4Summary" type="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentType" minOccurs="0"/>
 *         &lt;element name="WorstPaymentPeriodCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="TotalChargeOffAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChargedOffAccountsCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ChargedOffAccountsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AverageBalanceVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumBalanceVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AverageLiquidityCreditLimitVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumLiquidityCreditLimitVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumLiquidityCreditLimitVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AverageBalanceLiquidityVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumBalanceLiquidityVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumBalanceLiquidityVelocityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentAccountPeriodSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currencyISOAlpha3Code",
    "unitOfSizeText",
    "openAccountsWithBalanceCount",
    "openAccountsCount",
    "totalCurrentBalanceAmount",
    "maximumBalanceAmount",
    "totalOriginalAmount",
    "latestOriginalAmount",
    "latestMaximumOriginalAmount",
    "totalUtilizationPercentage",
    "totalPastDueAmount",
    "maximumPastDueAmount",
    "pastDuePaymentCycle1Summary",
    "pastDuePaymentCycle2Summary",
    "pastDuePaymentCycle3Summary",
    "pastDuePaymentCycle4Summary",
    "worstPaymentPeriodCode",
    "totalChargeOffAmount",
    "chargedOffAccountsCount",
    "chargedOffAccountsPercentage",
    "averageBalanceVelocityAmount",
    "maximumBalanceVelocityAmount",
    "minimumBalanceVelocityAmount",
    "averageLiquidityCreditLimitVelocityAmount",
    "maximumLiquidityCreditLimitVelocityAmount",
    "minimumLiquidityCreditLimitVelocityAmount",
    "averageBalanceLiquidityVelocityAmount",
    "maximumBalanceLiquidityVelocityAmount",
    "minimumBalanceLiquidityVelocityAmount"
})
public class InstallmentAccountPeriodSummaryType {

    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "UnitOfSizeText")
    protected DNBDecodedStringType unitOfSizeText;
    @XmlElement(name = "OpenAccountsWithBalanceCount")
    protected BigInteger openAccountsWithBalanceCount;
    @XmlElement(name = "OpenAccountsCount")
    protected BigInteger openAccountsCount;
    @XmlElement(name = "TotalCurrentBalanceAmount")
    protected BigDecimal totalCurrentBalanceAmount;
    @XmlElement(name = "MaximumBalanceAmount")
    protected BigDecimal maximumBalanceAmount;
    @XmlElement(name = "TotalOriginalAmount")
    protected BigDecimal totalOriginalAmount;
    @XmlElement(name = "LatestOriginalAmount")
    protected BigDecimal latestOriginalAmount;
    @XmlElement(name = "LatestMaximumOriginalAmount")
    protected BigDecimal latestMaximumOriginalAmount;
    @XmlElement(name = "TotalUtilizationPercentage")
    protected BigDecimal totalUtilizationPercentage;
    @XmlElement(name = "TotalPastDueAmount")
    protected BigDecimal totalPastDueAmount;
    @XmlElement(name = "MaximumPastDueAmount")
    protected BigDecimal maximumPastDueAmount;
    @XmlElement(name = "PastDuePaymentCycle1Summary")
    protected PastDuePaymentType pastDuePaymentCycle1Summary;
    @XmlElement(name = "PastDuePaymentCycle2Summary")
    protected PastDuePaymentType pastDuePaymentCycle2Summary;
    @XmlElement(name = "PastDuePaymentCycle3Summary")
    protected PastDuePaymentType pastDuePaymentCycle3Summary;
    @XmlElement(name = "PastDuePaymentCycle4Summary")
    protected PastDuePaymentType pastDuePaymentCycle4Summary;
    @XmlElement(name = "WorstPaymentPeriodCode")
    protected String worstPaymentPeriodCode;
    @XmlElement(name = "TotalChargeOffAmount")
    protected BigDecimal totalChargeOffAmount;
    @XmlElement(name = "ChargedOffAccountsCount")
    protected BigInteger chargedOffAccountsCount;
    @XmlElement(name = "ChargedOffAccountsPercentage")
    protected BigDecimal chargedOffAccountsPercentage;
    @XmlElement(name = "AverageBalanceVelocityAmount")
    protected BigDecimal averageBalanceVelocityAmount;
    @XmlElement(name = "MaximumBalanceVelocityAmount")
    protected BigDecimal maximumBalanceVelocityAmount;
    @XmlElement(name = "MinimumBalanceVelocityAmount")
    protected BigDecimal minimumBalanceVelocityAmount;
    @XmlElement(name = "AverageLiquidityCreditLimitVelocityAmount")
    protected BigDecimal averageLiquidityCreditLimitVelocityAmount;
    @XmlElement(name = "MaximumLiquidityCreditLimitVelocityAmount")
    protected BigDecimal maximumLiquidityCreditLimitVelocityAmount;
    @XmlElement(name = "MinimumLiquidityCreditLimitVelocityAmount")
    protected BigDecimal minimumLiquidityCreditLimitVelocityAmount;
    @XmlElement(name = "AverageBalanceLiquidityVelocityAmount")
    protected BigDecimal averageBalanceLiquidityVelocityAmount;
    @XmlElement(name = "MaximumBalanceLiquidityVelocityAmount")
    protected BigDecimal maximumBalanceLiquidityVelocityAmount;
    @XmlElement(name = "MinimumBalanceLiquidityVelocityAmount")
    protected BigDecimal minimumBalanceLiquidityVelocityAmount;

    /**
     * Gets the value of the currencyISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISOAlpha3Code() {
        return currencyISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISOAlpha3Code(String value) {
        this.currencyISOAlpha3Code = value;
    }

    /**
     * Gets the value of the unitOfSizeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getUnitOfSizeText() {
        return unitOfSizeText;
    }

    /**
     * Sets the value of the unitOfSizeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setUnitOfSizeText(DNBDecodedStringType value) {
        this.unitOfSizeText = value;
    }

    /**
     * Gets the value of the openAccountsWithBalanceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenAccountsWithBalanceCount() {
        return openAccountsWithBalanceCount;
    }

    /**
     * Sets the value of the openAccountsWithBalanceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenAccountsWithBalanceCount(BigInteger value) {
        this.openAccountsWithBalanceCount = value;
    }

    /**
     * Gets the value of the openAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenAccountsCount() {
        return openAccountsCount;
    }

    /**
     * Sets the value of the openAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenAccountsCount(BigInteger value) {
        this.openAccountsCount = value;
    }

    /**
     * Gets the value of the totalCurrentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentBalanceAmount() {
        return totalCurrentBalanceAmount;
    }

    /**
     * Sets the value of the totalCurrentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentBalanceAmount(BigDecimal value) {
        this.totalCurrentBalanceAmount = value;
    }

    /**
     * Gets the value of the maximumBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalanceAmount() {
        return maximumBalanceAmount;
    }

    /**
     * Sets the value of the maximumBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalanceAmount(BigDecimal value) {
        this.maximumBalanceAmount = value;
    }

    /**
     * Gets the value of the totalOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOriginalAmount() {
        return totalOriginalAmount;
    }

    /**
     * Sets the value of the totalOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOriginalAmount(BigDecimal value) {
        this.totalOriginalAmount = value;
    }

    /**
     * Gets the value of the latestOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatestOriginalAmount() {
        return latestOriginalAmount;
    }

    /**
     * Sets the value of the latestOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatestOriginalAmount(BigDecimal value) {
        this.latestOriginalAmount = value;
    }

    /**
     * Gets the value of the latestMaximumOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatestMaximumOriginalAmount() {
        return latestMaximumOriginalAmount;
    }

    /**
     * Sets the value of the latestMaximumOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatestMaximumOriginalAmount(BigDecimal value) {
        this.latestMaximumOriginalAmount = value;
    }

    /**
     * Gets the value of the totalUtilizationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalUtilizationPercentage() {
        return totalUtilizationPercentage;
    }

    /**
     * Sets the value of the totalUtilizationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalUtilizationPercentage(BigDecimal value) {
        this.totalUtilizationPercentage = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPastDueAmount(BigDecimal value) {
        this.totalPastDueAmount = value;
    }

    /**
     * Gets the value of the maximumPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPastDueAmount() {
        return maximumPastDueAmount;
    }

    /**
     * Sets the value of the maximumPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPastDueAmount(BigDecimal value) {
        this.maximumPastDueAmount = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle1Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle1Summary() {
        return pastDuePaymentCycle1Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle1Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle1Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle1Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle2Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle2Summary() {
        return pastDuePaymentCycle2Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle2Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle2Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle2Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle3Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle3Summary() {
        return pastDuePaymentCycle3Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle3Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle3Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle3Summary = value;
    }

    /**
     * Gets the value of the pastDuePaymentCycle4Summary property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePaymentType }
     *     
     */
    public PastDuePaymentType getPastDuePaymentCycle4Summary() {
        return pastDuePaymentCycle4Summary;
    }

    /**
     * Sets the value of the pastDuePaymentCycle4Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePaymentType }
     *     
     */
    public void setPastDuePaymentCycle4Summary(PastDuePaymentType value) {
        this.pastDuePaymentCycle4Summary = value;
    }

    /**
     * Gets the value of the worstPaymentPeriodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorstPaymentPeriodCode() {
        return worstPaymentPeriodCode;
    }

    /**
     * Sets the value of the worstPaymentPeriodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorstPaymentPeriodCode(String value) {
        this.worstPaymentPeriodCode = value;
    }

    /**
     * Gets the value of the totalChargeOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalChargeOffAmount() {
        return totalChargeOffAmount;
    }

    /**
     * Sets the value of the totalChargeOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalChargeOffAmount(BigDecimal value) {
        this.totalChargeOffAmount = value;
    }

    /**
     * Gets the value of the chargedOffAccountsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargedOffAccountsCount() {
        return chargedOffAccountsCount;
    }

    /**
     * Sets the value of the chargedOffAccountsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargedOffAccountsCount(BigInteger value) {
        this.chargedOffAccountsCount = value;
    }

    /**
     * Gets the value of the chargedOffAccountsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargedOffAccountsPercentage() {
        return chargedOffAccountsPercentage;
    }

    /**
     * Sets the value of the chargedOffAccountsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargedOffAccountsPercentage(BigDecimal value) {
        this.chargedOffAccountsPercentage = value;
    }

    /**
     * Gets the value of the averageBalanceVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageBalanceVelocityAmount() {
        return averageBalanceVelocityAmount;
    }

    /**
     * Sets the value of the averageBalanceVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageBalanceVelocityAmount(BigDecimal value) {
        this.averageBalanceVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumBalanceVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalanceVelocityAmount() {
        return maximumBalanceVelocityAmount;
    }

    /**
     * Sets the value of the maximumBalanceVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalanceVelocityAmount(BigDecimal value) {
        this.maximumBalanceVelocityAmount = value;
    }

    /**
     * Gets the value of the minimumBalanceVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBalanceVelocityAmount() {
        return minimumBalanceVelocityAmount;
    }

    /**
     * Sets the value of the minimumBalanceVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBalanceVelocityAmount(BigDecimal value) {
        this.minimumBalanceVelocityAmount = value;
    }

    /**
     * Gets the value of the averageLiquidityCreditLimitVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageLiquidityCreditLimitVelocityAmount() {
        return averageLiquidityCreditLimitVelocityAmount;
    }

    /**
     * Sets the value of the averageLiquidityCreditLimitVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageLiquidityCreditLimitVelocityAmount(BigDecimal value) {
        this.averageLiquidityCreditLimitVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumLiquidityCreditLimitVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLiquidityCreditLimitVelocityAmount() {
        return maximumLiquidityCreditLimitVelocityAmount;
    }

    /**
     * Sets the value of the maximumLiquidityCreditLimitVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLiquidityCreditLimitVelocityAmount(BigDecimal value) {
        this.maximumLiquidityCreditLimitVelocityAmount = value;
    }

    /**
     * Gets the value of the minimumLiquidityCreditLimitVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLiquidityCreditLimitVelocityAmount() {
        return minimumLiquidityCreditLimitVelocityAmount;
    }

    /**
     * Sets the value of the minimumLiquidityCreditLimitVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLiquidityCreditLimitVelocityAmount(BigDecimal value) {
        this.minimumLiquidityCreditLimitVelocityAmount = value;
    }

    /**
     * Gets the value of the averageBalanceLiquidityVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageBalanceLiquidityVelocityAmount() {
        return averageBalanceLiquidityVelocityAmount;
    }

    /**
     * Sets the value of the averageBalanceLiquidityVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageBalanceLiquidityVelocityAmount(BigDecimal value) {
        this.averageBalanceLiquidityVelocityAmount = value;
    }

    /**
     * Gets the value of the maximumBalanceLiquidityVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalanceLiquidityVelocityAmount() {
        return maximumBalanceLiquidityVelocityAmount;
    }

    /**
     * Sets the value of the maximumBalanceLiquidityVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalanceLiquidityVelocityAmount(BigDecimal value) {
        this.maximumBalanceLiquidityVelocityAmount = value;
    }

    /**
     * Gets the value of the minimumBalanceLiquidityVelocityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBalanceLiquidityVelocityAmount() {
        return minimumBalanceLiquidityVelocityAmount;
    }

    /**
     * Sets the value of the minimumBalanceLiquidityVelocityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBalanceLiquidityVelocityAmount(BigDecimal value) {
        this.minimumBalanceLiquidityVelocityAmount = value;
    }

}
