
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradeDataYearMonth" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ThreeMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentDataSummaryType" minOccurs="0"/>
 *         &lt;element name="TwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentDataSummaryType" minOccurs="0"/>
 *         &lt;element name="CompleteSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PaymentDataSummaryType" minOccurs="0"/>
 *         &lt;element name="TradeDataScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "tradeDataYearMonth",
    "threeMonthsSummary",
    "twelveMonthsSummary",
    "completeSummary",
    "tradeDataScopeText"
})
public class PaymentSummaryType {

    @XmlElement(name = "TradeDataYearMonth")
    protected DNBDateType tradeDataYearMonth;
    @XmlElement(name = "ThreeMonthsSummary")
    protected PaymentDataSummaryType threeMonthsSummary;
    @XmlElement(name = "TwelveMonthsSummary")
    protected PaymentDataSummaryType twelveMonthsSummary;
    @XmlElement(name = "CompleteSummary")
    protected PaymentDataSummaryType completeSummary;
    @XmlElement(name = "TradeDataScopeText")
    protected DNBDecodedStringType tradeDataScopeText;

    /**
     * Gets the value of the tradeDataYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getTradeDataYearMonth() {
        return tradeDataYearMonth;
    }

    /**
     * Sets the value of the tradeDataYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setTradeDataYearMonth(DNBDateType value) {
        this.tradeDataYearMonth = value;
    }

    /**
     * Gets the value of the threeMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataSummaryType }
     *     
     */
    public PaymentDataSummaryType getThreeMonthsSummary() {
        return threeMonthsSummary;
    }

    /**
     * Sets the value of the threeMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataSummaryType }
     *     
     */
    public void setThreeMonthsSummary(PaymentDataSummaryType value) {
        this.threeMonthsSummary = value;
    }

    /**
     * Gets the value of the twelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataSummaryType }
     *     
     */
    public PaymentDataSummaryType getTwelveMonthsSummary() {
        return twelveMonthsSummary;
    }

    /**
     * Sets the value of the twelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataSummaryType }
     *     
     */
    public void setTwelveMonthsSummary(PaymentDataSummaryType value) {
        this.twelveMonthsSummary = value;
    }

    /**
     * Gets the value of the completeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataSummaryType }
     *     
     */
    public PaymentDataSummaryType getCompleteSummary() {
        return completeSummary;
    }

    /**
     * Sets the value of the completeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataSummaryType }
     *     
     */
    public void setCompleteSummary(PaymentDataSummaryType value) {
        this.completeSummary = value;
    }

    /**
     * Gets the value of the tradeDataScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTradeDataScopeText() {
        return tradeDataScopeText;
    }

    /**
     * Sets the value of the tradeDataScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTradeDataScopeText(DNBDecodedStringType value) {
        this.tradeDataScopeText = value;
    }

}
