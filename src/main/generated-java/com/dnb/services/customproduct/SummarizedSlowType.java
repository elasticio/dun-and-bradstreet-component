
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizedSlowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarizedSlowType">
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
 *         &lt;element name="HighCreditSlowTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SlowExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AverageMonthlyPastDuePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorstPastDueAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorstAveragePastDueAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummarizedSlowType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "daysLowQuantity",
    "daysHighQuantity",
    "highCreditSlowTotalAmount",
    "slowExperienceCount",
    "slowPercentage",
    "averageMonthlyPastDuePercentage",
    "worstPastDueAmountIndicator",
    "worstAveragePastDueAmountIndicator"
})
public class SummarizedSlowType {

    @XmlElement(name = "DaysLowQuantity")
    protected int daysLowQuantity;
    @XmlElement(name = "DaysHighQuantity")
    protected Integer daysHighQuantity;
    @XmlElement(name = "HighCreditSlowTotalAmount")
    protected AmountType highCreditSlowTotalAmount;
    @XmlElement(name = "SlowExperienceCount")
    protected Integer slowExperienceCount;
    @XmlElement(name = "SlowPercentage")
    protected BigDecimal slowPercentage;
    @XmlElement(name = "AverageMonthlyPastDuePercentage")
    protected BigDecimal averageMonthlyPastDuePercentage;
    @XmlElement(name = "WorstPastDueAmountIndicator")
    protected Boolean worstPastDueAmountIndicator;
    @XmlElement(name = "WorstAveragePastDueAmountIndicator")
    protected Boolean worstAveragePastDueAmountIndicator;

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
     * Gets the value of the highCreditSlowTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditSlowTotalAmount() {
        return highCreditSlowTotalAmount;
    }

    /**
     * Sets the value of the highCreditSlowTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditSlowTotalAmount(AmountType value) {
        this.highCreditSlowTotalAmount = value;
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
     * Gets the value of the slowPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSlowPercentage() {
        return slowPercentage;
    }

    /**
     * Sets the value of the slowPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSlowPercentage(BigDecimal value) {
        this.slowPercentage = value;
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

    /**
     * Gets the value of the worstAveragePastDueAmountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorstAveragePastDueAmountIndicator() {
        return worstAveragePastDueAmountIndicator;
    }

    /**
     * Sets the value of the worstAveragePastDueAmountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorstAveragePastDueAmountIndicator(Boolean value) {
        this.worstAveragePastDueAmountIndicator = value;
    }

}
