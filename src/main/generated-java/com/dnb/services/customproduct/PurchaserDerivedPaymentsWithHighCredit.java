
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedPaymentsWithHighCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedPaymentsWithHighCredit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighCreditTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditMaximumAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageHighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditPromptTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PromptPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SlowExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SummarizedSlow" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedSlowType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PastDueTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowNegativeExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PastDueTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="WorstOwedAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorstPastDueAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPaymentsWithHighCredit", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "experienceCount",
    "highCreditTotalAmount",
    "highCreditMaximumAmount",
    "averageHighCreditAmount",
    "highCreditPromptTotalAmount",
    "promptPercentage",
    "slowExperienceCount",
    "summarizedSlow",
    "pastDueTotalCount",
    "slowNegativeExperienceCount",
    "pastDueTotalAmount",
    "worstOwedAmountIndicator",
    "worstPastDueAmountIndicator"
})
public class PurchaserDerivedPaymentsWithHighCredit {

    @XmlElement(name = "ExperienceCount")
    protected Integer experienceCount;
    @XmlElement(name = "HighCreditTotalAmount")
    protected AmountType highCreditTotalAmount;
    @XmlElement(name = "HighCreditMaximumAmount")
    protected AmountType highCreditMaximumAmount;
    @XmlElement(name = "AverageHighCreditAmount")
    protected AmountType averageHighCreditAmount;
    @XmlElement(name = "HighCreditPromptTotalAmount")
    protected AmountType highCreditPromptTotalAmount;
    @XmlElement(name = "PromptPercentage")
    protected BigDecimal promptPercentage;
    @XmlElement(name = "SlowExperienceCount")
    protected Integer slowExperienceCount;
    @XmlElement(name = "SummarizedSlow")
    protected List<SummarizedSlowType> summarizedSlow;
    @XmlElement(name = "PastDueTotalCount")
    protected Integer pastDueTotalCount;
    @XmlElement(name = "SlowNegativeExperienceCount")
    protected Integer slowNegativeExperienceCount;
    @XmlElement(name = "PastDueTotalAmount")
    protected AmountType pastDueTotalAmount;
    @XmlElement(name = "WorstOwedAmountIndicator")
    protected Boolean worstOwedAmountIndicator;
    @XmlElement(name = "WorstPastDueAmountIndicator")
    protected Boolean worstPastDueAmountIndicator;

    /**
     * Gets the value of the experienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceCount() {
        return experienceCount;
    }

    /**
     * Sets the value of the experienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceCount(Integer value) {
        this.experienceCount = value;
    }

    /**
     * Gets the value of the highCreditTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditTotalAmount() {
        return highCreditTotalAmount;
    }

    /**
     * Sets the value of the highCreditTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditTotalAmount(AmountType value) {
        this.highCreditTotalAmount = value;
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
     * Gets the value of the highCreditPromptTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditPromptTotalAmount() {
        return highCreditPromptTotalAmount;
    }

    /**
     * Sets the value of the highCreditPromptTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditPromptTotalAmount(AmountType value) {
        this.highCreditPromptTotalAmount = value;
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
     * Gets the value of the summarizedSlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarizedSlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarizedSlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarizedSlowType }
     * 
     * 
     */
    public List<SummarizedSlowType> getSummarizedSlow() {
        if (summarizedSlow == null) {
            summarizedSlow = new ArrayList<SummarizedSlowType>();
        }
        return this.summarizedSlow;
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
     * Gets the value of the worstOwedAmountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorstOwedAmountIndicator() {
        return worstOwedAmountIndicator;
    }

    /**
     * Sets the value of the worstOwedAmountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorstOwedAmountIndicator(Boolean value) {
        this.worstOwedAmountIndicator = value;
    }

    /**
     * Gets the value of the worstPastDueAmountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorstPastDueAmountIndicator() {
        return worstPastDueAmountIndicator;
    }

    /**
     * Sets the value of the worstPastDueAmountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorstPastDueAmountIndicator(Boolean value) {
        this.worstPastDueAmountIndicator = value;
    }

}
