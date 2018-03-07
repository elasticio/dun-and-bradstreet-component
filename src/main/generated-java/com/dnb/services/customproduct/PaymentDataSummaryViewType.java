
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDataSummaryViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataSummaryViewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumTotalHighCreditAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SummaryDataBasisCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="MaximumTotalOwingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumTotalOverdueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SummaryDataBasisText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PastDueAverageMonthlyTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalOwingAverageMonthlyAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataSummaryViewType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "maximumTotalHighCreditAmount",
    "summaryDataBasisCode",
    "maximumTotalOwingAmount",
    "maximumTotalOverdueAmount",
    "summaryDataBasisText",
    "pastDueAverageMonthlyTotalAmount",
    "totalOwingAverageMonthlyAmount"
})
public class PaymentDataSummaryViewType {

    @XmlElement(name = "MaximumTotalHighCreditAmount")
    protected AmountType maximumTotalHighCreditAmount;
    @XmlElement(name = "SummaryDataBasisCode")
    protected DNBDecodedStringType summaryDataBasisCode;
    @XmlElement(name = "MaximumTotalOwingAmount")
    protected AmountType maximumTotalOwingAmount;
    @XmlElement(name = "MaximumTotalOverdueAmount")
    protected AmountType maximumTotalOverdueAmount;
    @XmlElement(name = "SummaryDataBasisText")
    protected DNBDecodedStringType summaryDataBasisText;
    @XmlElement(name = "PastDueAverageMonthlyTotalAmount")
    protected AmountType pastDueAverageMonthlyTotalAmount;
    @XmlElement(name = "TotalOwingAverageMonthlyAmount")
    protected AmountType totalOwingAverageMonthlyAmount;

    /**
     * Gets the value of the maximumTotalHighCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumTotalHighCreditAmount() {
        return maximumTotalHighCreditAmount;
    }

    /**
     * Sets the value of the maximumTotalHighCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumTotalHighCreditAmount(AmountType value) {
        this.maximumTotalHighCreditAmount = value;
    }

    /**
     * Gets the value of the summaryDataBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSummaryDataBasisCode() {
        return summaryDataBasisCode;
    }

    /**
     * Sets the value of the summaryDataBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSummaryDataBasisCode(DNBDecodedStringType value) {
        this.summaryDataBasisCode = value;
    }

    /**
     * Gets the value of the maximumTotalOwingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumTotalOwingAmount() {
        return maximumTotalOwingAmount;
    }

    /**
     * Sets the value of the maximumTotalOwingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumTotalOwingAmount(AmountType value) {
        this.maximumTotalOwingAmount = value;
    }

    /**
     * Gets the value of the maximumTotalOverdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumTotalOverdueAmount() {
        return maximumTotalOverdueAmount;
    }

    /**
     * Sets the value of the maximumTotalOverdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumTotalOverdueAmount(AmountType value) {
        this.maximumTotalOverdueAmount = value;
    }

    /**
     * Gets the value of the summaryDataBasisText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSummaryDataBasisText() {
        return summaryDataBasisText;
    }

    /**
     * Sets the value of the summaryDataBasisText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSummaryDataBasisText(DNBDecodedStringType value) {
        this.summaryDataBasisText = value;
    }

    /**
     * Gets the value of the pastDueAverageMonthlyTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPastDueAverageMonthlyTotalAmount() {
        return pastDueAverageMonthlyTotalAmount;
    }

    /**
     * Sets the value of the pastDueAverageMonthlyTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPastDueAverageMonthlyTotalAmount(AmountType value) {
        this.pastDueAverageMonthlyTotalAmount = value;
    }

    /**
     * Gets the value of the totalOwingAverageMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOwingAverageMonthlyAmount() {
        return totalOwingAverageMonthlyAmount;
    }

    /**
     * Sets the value of the totalOwingAverageMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOwingAverageMonthlyAmount(AmountType value) {
        this.totalOwingAverageMonthlyAmount = value;
    }

}
