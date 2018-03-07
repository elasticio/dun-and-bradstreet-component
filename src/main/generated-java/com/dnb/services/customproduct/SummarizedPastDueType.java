
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizedPastDueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarizedPastDueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummarizedPastDuePeriodView" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedPastDuePeriodViewType" minOccurs="0"/>
 *         &lt;element name="DaysLowQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DaysHighQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PastDuePercentage" minOccurs="0">
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
@XmlType(name = "SummarizedPastDueType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summarizedPastDuePeriodView",
    "daysLowQuantity",
    "daysHighQuantity",
    "accountsTotalCount",
    "totalAmount",
    "pastDuePercentage"
})
public class SummarizedPastDueType {

    @XmlElement(name = "SummarizedPastDuePeriodView")
    protected SummarizedPastDuePeriodViewType summarizedPastDuePeriodView;
    @XmlElement(name = "DaysLowQuantity", required = true)
    protected BigInteger daysLowQuantity;
    @XmlElement(name = "DaysHighQuantity")
    protected BigInteger daysHighQuantity;
    @XmlElement(name = "AccountsTotalCount")
    protected Integer accountsTotalCount;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;
    @XmlElement(name = "PastDuePercentage")
    protected BigDecimal pastDuePercentage;

    /**
     * Gets the value of the summarizedPastDuePeriodView property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPastDuePeriodViewType }
     *     
     */
    public SummarizedPastDuePeriodViewType getSummarizedPastDuePeriodView() {
        return summarizedPastDuePeriodView;
    }

    /**
     * Sets the value of the summarizedPastDuePeriodView property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPastDuePeriodViewType }
     *     
     */
    public void setSummarizedPastDuePeriodView(SummarizedPastDuePeriodViewType value) {
        this.summarizedPastDuePeriodView = value;
    }

    /**
     * Gets the value of the daysLowQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysLowQuantity() {
        return daysLowQuantity;
    }

    /**
     * Sets the value of the daysLowQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysLowQuantity(BigInteger value) {
        this.daysLowQuantity = value;
    }

    /**
     * Gets the value of the daysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysHighQuantity() {
        return daysHighQuantity;
    }

    /**
     * Sets the value of the daysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysHighQuantity(BigInteger value) {
        this.daysHighQuantity = value;
    }

    /**
     * Gets the value of the accountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountsTotalCount() {
        return accountsTotalCount;
    }

    /**
     * Sets the value of the accountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountsTotalCount(Integer value) {
        this.accountsTotalCount = value;
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
     * Gets the value of the pastDuePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDuePercentage() {
        return pastDuePercentage;
    }

    /**
     * Sets the value of the pastDuePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDuePercentage(BigDecimal value) {
        this.pastDuePercentage = value;
    }

}
