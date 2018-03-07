
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the results of summarizing the payments made by the subject for this account over different lengths of time (all ending as of the Experience Date), e.g., 3, 6, 9, 12, 24 months.
 *          
 * 
 * <p>Java class for TradeExperiencePaymentSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeExperiencePaymentSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType"/>
 *         &lt;element name="HighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditAmountPlusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentMannerText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PaymentMannerSlowDaysLowQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentMannerSlowDaysHighQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentMannerSlowDaysHighPlusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeExperiencePaymentSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryPeriod",
    "highCreditAmount",
    "highCreditAmountPlusIndicator",
    "paymentMannerText",
    "paymentMannerSlowDaysLowQuantity",
    "paymentMannerSlowDaysHighQuantity",
    "paymentMannerSlowDaysHighPlusIndicator"
})
public class TradeExperiencePaymentSummary {

    @XmlElement(name = "SummaryPeriod", required = true)
    protected Duration summaryPeriod;
    @XmlElement(name = "HighCreditAmount")
    protected AmountType highCreditAmount;
    @XmlElement(name = "HighCreditAmountPlusIndicator")
    protected Boolean highCreditAmountPlusIndicator;
    @XmlElement(name = "PaymentMannerText")
    protected DNBDecodedStringType paymentMannerText;
    @XmlElement(name = "PaymentMannerSlowDaysLowQuantity")
    protected Integer paymentMannerSlowDaysLowQuantity;
    @XmlElement(name = "PaymentMannerSlowDaysHighQuantity")
    protected Integer paymentMannerSlowDaysHighQuantity;
    @XmlElement(name = "PaymentMannerSlowDaysHighPlusIndicator")
    protected Boolean paymentMannerSlowDaysHighPlusIndicator;

    /**
     * Gets the value of the summaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSummaryPeriod() {
        return summaryPeriod;
    }

    /**
     * Sets the value of the summaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSummaryPeriod(Duration value) {
        this.summaryPeriod = value;
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
     * Gets the value of the highCreditAmountPlusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighCreditAmountPlusIndicator() {
        return highCreditAmountPlusIndicator;
    }

    /**
     * Sets the value of the highCreditAmountPlusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighCreditAmountPlusIndicator(Boolean value) {
        this.highCreditAmountPlusIndicator = value;
    }

    /**
     * Gets the value of the paymentMannerText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPaymentMannerText() {
        return paymentMannerText;
    }

    /**
     * Sets the value of the paymentMannerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPaymentMannerText(DNBDecodedStringType value) {
        this.paymentMannerText = value;
    }

    /**
     * Gets the value of the paymentMannerSlowDaysLowQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMannerSlowDaysLowQuantity() {
        return paymentMannerSlowDaysLowQuantity;
    }

    /**
     * Sets the value of the paymentMannerSlowDaysLowQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMannerSlowDaysLowQuantity(Integer value) {
        this.paymentMannerSlowDaysLowQuantity = value;
    }

    /**
     * Gets the value of the paymentMannerSlowDaysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMannerSlowDaysHighQuantity() {
        return paymentMannerSlowDaysHighQuantity;
    }

    /**
     * Sets the value of the paymentMannerSlowDaysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMannerSlowDaysHighQuantity(Integer value) {
        this.paymentMannerSlowDaysHighQuantity = value;
    }

    /**
     * Gets the value of the paymentMannerSlowDaysHighPlusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentMannerSlowDaysHighPlusIndicator() {
        return paymentMannerSlowDaysHighPlusIndicator;
    }

    /**
     * Sets the value of the paymentMannerSlowDaysHighPlusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentMannerSlowDaysHighPlusIndicator(Boolean value) {
        this.paymentMannerSlowDaysHighPlusIndicator = value;
    }

}
