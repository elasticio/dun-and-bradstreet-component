
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizedPastDuePeriodViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarizedPastDuePeriodViewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PastDueAverageMonthlyAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SummaryDataBasisText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummarizedPastDuePeriodViewType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "pastDueAverageMonthlyAmount",
    "summaryDataBasisText"
})
public class SummarizedPastDuePeriodViewType {

    @XmlElement(name = "PastDueAverageMonthlyAmount")
    protected AmountType pastDueAverageMonthlyAmount;
    @XmlElement(name = "SummaryDataBasisText")
    protected DNBDecodedStringType summaryDataBasisText;

    /**
     * Gets the value of the pastDueAverageMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPastDueAverageMonthlyAmount() {
        return pastDueAverageMonthlyAmount;
    }

    /**
     * Sets the value of the pastDueAverageMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPastDueAverageMonthlyAmount(AmountType value) {
        this.pastDueAverageMonthlyAmount = value;
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

}
