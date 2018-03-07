
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * An aggregate which records small businesses account details for the Borrowers on these commercial lending and credit accounts for a particular cycle.
 *          
 * 
 * <p>Java class for BorrowerAnalyticsCycleSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorrowerAnalyticsCycleSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpenAccountsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BorrowingCycleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenAccountsAmountCurrentBalanceProportionRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenAccountsAmountTotalPastDueProportionRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenAccountsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenAccountsEverCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenAccountsEverPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TimeSinceAccountsLastPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerAnalyticsCycleSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "openAccountsAmount",
    "borrowingCycleName",
    "accountsCount",
    "openAccountsAmountCurrentBalanceProportionRatio",
    "openAccountsAmountTotalPastDueProportionRatio",
    "openAccountsPercentage",
    "openAccountsEverCount",
    "openAccountsEverPercentage",
    "timeSinceAccountsLastPeriod"
})
public class BorrowerAnalyticsCycleSummary {

    @XmlElement(name = "OpenAccountsAmount")
    protected AmountType openAccountsAmount;
    @XmlElement(name = "BorrowingCycleName")
    protected String borrowingCycleName;
    @XmlElement(name = "AccountsCount")
    protected Integer accountsCount;
    @XmlElement(name = "OpenAccountsAmountCurrentBalanceProportionRatio")
    protected BigDecimal openAccountsAmountCurrentBalanceProportionRatio;
    @XmlElement(name = "OpenAccountsAmountTotalPastDueProportionRatio")
    protected BigDecimal openAccountsAmountTotalPastDueProportionRatio;
    @XmlElement(name = "OpenAccountsPercentage")
    protected BigDecimal openAccountsPercentage;
    @XmlElement(name = "OpenAccountsEverCount")
    protected Integer openAccountsEverCount;
    @XmlElement(name = "OpenAccountsEverPercentage")
    protected BigDecimal openAccountsEverPercentage;
    @XmlElement(name = "TimeSinceAccountsLastPeriod")
    protected Duration timeSinceAccountsLastPeriod;

    /**
     * Gets the value of the openAccountsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOpenAccountsAmount() {
        return openAccountsAmount;
    }

    /**
     * Sets the value of the openAccountsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOpenAccountsAmount(AmountType value) {
        this.openAccountsAmount = value;
    }

    /**
     * Gets the value of the borrowingCycleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowingCycleName() {
        return borrowingCycleName;
    }

    /**
     * Sets the value of the borrowingCycleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowingCycleName(String value) {
        this.borrowingCycleName = value;
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
     * Gets the value of the openAccountsAmountCurrentBalanceProportionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAccountsAmountCurrentBalanceProportionRatio() {
        return openAccountsAmountCurrentBalanceProportionRatio;
    }

    /**
     * Sets the value of the openAccountsAmountCurrentBalanceProportionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAccountsAmountCurrentBalanceProportionRatio(BigDecimal value) {
        this.openAccountsAmountCurrentBalanceProportionRatio = value;
    }

    /**
     * Gets the value of the openAccountsAmountTotalPastDueProportionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAccountsAmountTotalPastDueProportionRatio() {
        return openAccountsAmountTotalPastDueProportionRatio;
    }

    /**
     * Sets the value of the openAccountsAmountTotalPastDueProportionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAccountsAmountTotalPastDueProportionRatio(BigDecimal value) {
        this.openAccountsAmountTotalPastDueProportionRatio = value;
    }

    /**
     * Gets the value of the openAccountsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAccountsPercentage() {
        return openAccountsPercentage;
    }

    /**
     * Sets the value of the openAccountsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAccountsPercentage(BigDecimal value) {
        this.openAccountsPercentage = value;
    }

    /**
     * Gets the value of the openAccountsEverCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenAccountsEverCount() {
        return openAccountsEverCount;
    }

    /**
     * Sets the value of the openAccountsEverCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenAccountsEverCount(Integer value) {
        this.openAccountsEverCount = value;
    }

    /**
     * Gets the value of the openAccountsEverPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAccountsEverPercentage() {
        return openAccountsEverPercentage;
    }

    /**
     * Sets the value of the openAccountsEverPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAccountsEverPercentage(BigDecimal value) {
        this.openAccountsEverPercentage = value;
    }

    /**
     * Gets the value of the timeSinceAccountsLastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeSinceAccountsLastPeriod() {
        return timeSinceAccountsLastPeriod;
    }

    /**
     * Sets the value of the timeSinceAccountsLastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeSinceAccountsLastPeriod(Duration value) {
        this.timeSinceAccountsLastPeriod = value;
    }

}
