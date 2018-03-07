
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentExperienceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentExperienceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentExperienceDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *         &lt;element name="TotalOwingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalOwingAmountPlusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalPastDueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPastDueAmountPlusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiscountLowPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountDaysLowQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountPeriodLowText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="DiscountHighPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountDaysHighQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountPeriodHighText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NetDueDaysQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetDuePeriodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PaymentCommentText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LastSaleWithinText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SpecialTermsText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PaymentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}TradeExperiencePaymentSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="MonthsSinceLastSale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellingTermsText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentExperienceType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "paymentExperienceDate",
    "totalOwingAmount",
    "totalOwingAmountPlusIndicator",
    "totalPastDueAmount",
    "totalPastDueAmountPlusIndicator",
    "discountLowPercentage",
    "discountDaysLowQuantity",
    "discountPeriodLowText",
    "discountHighPercentage",
    "discountDaysHighQuantity",
    "discountPeriodHighText",
    "netDueDaysQuantity",
    "netDuePeriodText",
    "paymentCommentText",
    "lastSaleWithinText",
    "specialTermsText",
    "paymentSummary",
    "currencyISOAlpha3Code",
    "monthsSinceLastSale",
    "sellingTermsText"
})
public class PaymentExperienceType {

    @XmlElement(name = "PaymentExperienceDate", required = true)
    protected DNBDateType paymentExperienceDate;
    @XmlElement(name = "TotalOwingAmount")
    protected AmountType totalOwingAmount;
    @XmlElement(name = "TotalOwingAmountPlusIndicator")
    protected Boolean totalOwingAmountPlusIndicator;
    @XmlElement(name = "TotalPastDueAmount")
    protected AmountType totalPastDueAmount;
    @XmlElement(name = "TotalPastDueAmountPlusIndicator")
    protected Boolean totalPastDueAmountPlusIndicator;
    @XmlElement(name = "DiscountLowPercentage")
    protected BigDecimal discountLowPercentage;
    @XmlElement(name = "DiscountDaysLowQuantity")
    protected Integer discountDaysLowQuantity;
    @XmlElement(name = "DiscountPeriodLowText")
    protected DNBDecodedStringType discountPeriodLowText;
    @XmlElement(name = "DiscountHighPercentage")
    protected BigDecimal discountHighPercentage;
    @XmlElement(name = "DiscountDaysHighQuantity")
    protected Integer discountDaysHighQuantity;
    @XmlElement(name = "DiscountPeriodHighText")
    protected DNBDecodedStringType discountPeriodHighText;
    @XmlElement(name = "NetDueDaysQuantity")
    protected Integer netDueDaysQuantity;
    @XmlElement(name = "NetDuePeriodText")
    protected DNBDecodedStringType netDuePeriodText;
    @XmlElement(name = "PaymentCommentText")
    protected DNBDecodedStringType paymentCommentText;
    @XmlElement(name = "LastSaleWithinText")
    protected DNBDecodedStringType lastSaleWithinText;
    @XmlElement(name = "SpecialTermsText")
    protected DNBDecodedStringType specialTermsText;
    @XmlElement(name = "PaymentSummary")
    protected List<TradeExperiencePaymentSummary> paymentSummary;
    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "MonthsSinceLastSale")
    protected Integer monthsSinceLastSale;
    @XmlElement(name = "SellingTermsText")
    protected DNBDecodedStringNewType sellingTermsText;

    /**
     * Gets the value of the paymentExperienceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getPaymentExperienceDate() {
        return paymentExperienceDate;
    }

    /**
     * Sets the value of the paymentExperienceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setPaymentExperienceDate(DNBDateType value) {
        this.paymentExperienceDate = value;
    }

    /**
     * Gets the value of the totalOwingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOwingAmount() {
        return totalOwingAmount;
    }

    /**
     * Sets the value of the totalOwingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOwingAmount(AmountType value) {
        this.totalOwingAmount = value;
    }

    /**
     * Gets the value of the totalOwingAmountPlusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalOwingAmountPlusIndicator() {
        return totalOwingAmountPlusIndicator;
    }

    /**
     * Sets the value of the totalOwingAmountPlusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalOwingAmountPlusIndicator(Boolean value) {
        this.totalOwingAmountPlusIndicator = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalPastDueAmount(AmountType value) {
        this.totalPastDueAmount = value;
    }

    /**
     * Gets the value of the totalPastDueAmountPlusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPastDueAmountPlusIndicator() {
        return totalPastDueAmountPlusIndicator;
    }

    /**
     * Sets the value of the totalPastDueAmountPlusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPastDueAmountPlusIndicator(Boolean value) {
        this.totalPastDueAmountPlusIndicator = value;
    }

    /**
     * Gets the value of the discountLowPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountLowPercentage() {
        return discountLowPercentage;
    }

    /**
     * Sets the value of the discountLowPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountLowPercentage(BigDecimal value) {
        this.discountLowPercentage = value;
    }

    /**
     * Gets the value of the discountDaysLowQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDaysLowQuantity() {
        return discountDaysLowQuantity;
    }

    /**
     * Sets the value of the discountDaysLowQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDaysLowQuantity(Integer value) {
        this.discountDaysLowQuantity = value;
    }

    /**
     * Gets the value of the discountPeriodLowText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDiscountPeriodLowText() {
        return discountPeriodLowText;
    }

    /**
     * Sets the value of the discountPeriodLowText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDiscountPeriodLowText(DNBDecodedStringType value) {
        this.discountPeriodLowText = value;
    }

    /**
     * Gets the value of the discountHighPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountHighPercentage() {
        return discountHighPercentage;
    }

    /**
     * Sets the value of the discountHighPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountHighPercentage(BigDecimal value) {
        this.discountHighPercentage = value;
    }

    /**
     * Gets the value of the discountDaysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDaysHighQuantity() {
        return discountDaysHighQuantity;
    }

    /**
     * Sets the value of the discountDaysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDaysHighQuantity(Integer value) {
        this.discountDaysHighQuantity = value;
    }

    /**
     * Gets the value of the discountPeriodHighText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDiscountPeriodHighText() {
        return discountPeriodHighText;
    }

    /**
     * Sets the value of the discountPeriodHighText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDiscountPeriodHighText(DNBDecodedStringType value) {
        this.discountPeriodHighText = value;
    }

    /**
     * Gets the value of the netDueDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetDueDaysQuantity() {
        return netDueDaysQuantity;
    }

    /**
     * Sets the value of the netDueDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetDueDaysQuantity(Integer value) {
        this.netDueDaysQuantity = value;
    }

    /**
     * Gets the value of the netDuePeriodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNetDuePeriodText() {
        return netDuePeriodText;
    }

    /**
     * Sets the value of the netDuePeriodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNetDuePeriodText(DNBDecodedStringType value) {
        this.netDuePeriodText = value;
    }

    /**
     * Gets the value of the paymentCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPaymentCommentText() {
        return paymentCommentText;
    }

    /**
     * Sets the value of the paymentCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPaymentCommentText(DNBDecodedStringType value) {
        this.paymentCommentText = value;
    }

    /**
     * Gets the value of the lastSaleWithinText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLastSaleWithinText() {
        return lastSaleWithinText;
    }

    /**
     * Sets the value of the lastSaleWithinText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLastSaleWithinText(DNBDecodedStringType value) {
        this.lastSaleWithinText = value;
    }

    /**
     * Gets the value of the specialTermsText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSpecialTermsText() {
        return specialTermsText;
    }

    /**
     * Sets the value of the specialTermsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSpecialTermsText(DNBDecodedStringType value) {
        this.specialTermsText = value;
    }

    /**
     * Gets the value of the paymentSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeExperiencePaymentSummary }
     * 
     * 
     */
    public List<TradeExperiencePaymentSummary> getPaymentSummary() {
        if (paymentSummary == null) {
            paymentSummary = new ArrayList<TradeExperiencePaymentSummary>();
        }
        return this.paymentSummary;
    }

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
     * Gets the value of the monthsSinceLastSale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthsSinceLastSale() {
        return monthsSinceLastSale;
    }

    /**
     * Sets the value of the monthsSinceLastSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthsSinceLastSale(Integer value) {
        this.monthsSinceLastSale = value;
    }

    /**
     * Gets the value of the sellingTermsText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getSellingTermsText() {
        return sellingTermsText;
    }

    /**
     * Sets the value of the sellingTermsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setSellingTermsText(DNBDecodedStringNewType value) {
        this.sellingTermsText = value;
    }

}
