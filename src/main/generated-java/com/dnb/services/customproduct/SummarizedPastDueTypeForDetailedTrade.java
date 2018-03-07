
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizedPastDueTypeForDetailedTrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarizedPastDueTypeForDetailedTrade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaysLowQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DaysHighQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExperiencesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MonthlyAveragePastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="MonthlyAverageOwedTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="LastPastDueElapsedMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighestPastDueElapsedMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueMonthCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueMonthCountPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AverageMonthlyPastDuePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="4"/>
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
@XmlType(name = "SummarizedPastDueTypeForDetailedTrade", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "daysLowQuantity",
    "daysHighQuantity",
    "experiencesCount",
    "totalAmount",
    "monthlyAveragePastDueTotalAmount",
    "accountsCount",
    "pastDueAmountPercentage",
    "pastDueExperiencePercentage",
    "maximumCumulativePastDueAmountPercentage",
    "maximumCumulativePastDueExperiencesPercentage",
    "monthlyAverageOwedTotalAmount",
    "lastPastDueElapsedMonthCount",
    "highestPastDueElapsedMonthCount",
    "pastDueMonthCount",
    "pastDueMonthCountPercentage",
    "averageMonthlyPastDuePercentage"
})
public class SummarizedPastDueTypeForDetailedTrade {

    @XmlElement(name = "DaysLowQuantity")
    protected int daysLowQuantity;
    @XmlElement(name = "DaysHighQuantity")
    protected Integer daysHighQuantity;
    @XmlElement(name = "ExperiencesCount")
    protected Integer experiencesCount;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;
    @XmlElement(name = "MonthlyAveragePastDueTotalAmount")
    protected AmountType monthlyAveragePastDueTotalAmount;
    @XmlElement(name = "AccountsCount")
    protected Integer accountsCount;
    @XmlElement(name = "PastDueAmountPercentage")
    protected BigDecimal pastDueAmountPercentage;
    @XmlElement(name = "PastDueExperiencePercentage")
    protected BigDecimal pastDueExperiencePercentage;
    @XmlElement(name = "MaximumCumulativePastDueAmountPercentage")
    protected BigDecimal maximumCumulativePastDueAmountPercentage;
    @XmlElement(name = "MaximumCumulativePastDueExperiencesPercentage")
    protected BigDecimal maximumCumulativePastDueExperiencesPercentage;
    @XmlElement(name = "MonthlyAverageOwedTotalAmount")
    protected AmountType monthlyAverageOwedTotalAmount;
    @XmlElement(name = "LastPastDueElapsedMonthCount")
    protected Integer lastPastDueElapsedMonthCount;
    @XmlElement(name = "HighestPastDueElapsedMonthCount")
    protected Integer highestPastDueElapsedMonthCount;
    @XmlElement(name = "PastDueMonthCount")
    protected Integer pastDueMonthCount;
    @XmlElement(name = "PastDueMonthCountPercentage")
    protected BigDecimal pastDueMonthCountPercentage;
    @XmlElement(name = "AverageMonthlyPastDuePercentage")
    protected BigDecimal averageMonthlyPastDuePercentage;

    /**
     * Gets the value of the daysLowQuantity property.
     * 
     */
    public int getDaysLowQuantity() {
        return daysLowQuantity;
    }

    /**
     * Sets the value of the daysLowQuantity property.
     * 
     */
    public void setDaysLowQuantity(int value) {
        this.daysLowQuantity = value;
    }

    /**
     * Gets the value of the daysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysHighQuantity() {
        return daysHighQuantity;
    }

    /**
     * Sets the value of the daysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysHighQuantity(Integer value) {
        this.daysHighQuantity = value;
    }

    /**
     * Gets the value of the experiencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperiencesCount() {
        return experiencesCount;
    }

    /**
     * Sets the value of the experiencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperiencesCount(Integer value) {
        this.experiencesCount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
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
     * Gets the value of the pastDueMonthCountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDueMonthCountPercentage() {
        return pastDueMonthCountPercentage;
    }

    /**
     * Sets the value of the pastDueMonthCountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDueMonthCountPercentage(BigDecimal value) {
        this.pastDueMonthCountPercentage = value;
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

}
