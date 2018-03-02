
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradeDataYearMonth" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TwentyFourMonthsDataCoveragePayments" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PurchaserDerivedDataCoveragePayments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedData", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "tradeDataYearMonth",
    "twentyFourMonthsDataCoveragePayments"
})
public class PurchaserDerivedData {

    @XmlElement(name = "TradeDataYearMonth")
    protected DNBDateType tradeDataYearMonth;
    @XmlElement(name = "TwentyFourMonthsDataCoveragePayments")
    protected PurchaserDerivedDataCoveragePayments twentyFourMonthsDataCoveragePayments;

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
     * Gets the value of the twentyFourMonthsDataCoveragePayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public PurchaserDerivedDataCoveragePayments getTwentyFourMonthsDataCoveragePayments() {
        return twentyFourMonthsDataCoveragePayments;
    }

    /**
     * Sets the value of the twentyFourMonthsDataCoveragePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public void setTwentyFourMonthsDataCoveragePayments(PurchaserDerivedDataCoveragePayments value) {
        this.twentyFourMonthsDataCoveragePayments = value;
    }

}
