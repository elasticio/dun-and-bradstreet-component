
package com.dnb.services.customproduct;

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
 *         &lt;element name="TradeDataYearMonth" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OneMonthDataCoveragePayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedDataCoveragePayments" minOccurs="0"/>
 *         &lt;element name="ThreeMonthsDataCoveragePayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedDataCoveragePayments" minOccurs="0"/>
 *         &lt;element name="TwelveMonthsDataCoveragePayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedDataCoveragePayments" minOccurs="0"/>
 *         &lt;element name="TwentyFourMonthsDataCoveragePayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedDataCoveragePayments" minOccurs="0"/>
 *         &lt;element name="GlobalDataCoveragePayments" type="{http://services.dnb.com/CustomProductServiceV2.0}PurchaserDerivedDataCoveragePayments" minOccurs="0"/>
 *         &lt;element name="PrecalculatedSummaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedData", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "tradeDataYearMonth",
    "dataProviderName",
    "oneMonthDataCoveragePayments",
    "threeMonthsDataCoveragePayments",
    "twelveMonthsDataCoveragePayments",
    "twentyFourMonthsDataCoveragePayments",
    "globalDataCoveragePayments",
    "precalculatedSummaryIndicator"
})
public class PurchaserDerivedData {

    @XmlElement(name = "TradeDataYearMonth")
    protected DNBDateType tradeDataYearMonth;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "OneMonthDataCoveragePayments")
    protected PurchaserDerivedDataCoveragePayments oneMonthDataCoveragePayments;
    @XmlElement(name = "ThreeMonthsDataCoveragePayments")
    protected PurchaserDerivedDataCoveragePayments threeMonthsDataCoveragePayments;
    @XmlElement(name = "TwelveMonthsDataCoveragePayments")
    protected PurchaserDerivedDataCoveragePayments twelveMonthsDataCoveragePayments;
    @XmlElement(name = "TwentyFourMonthsDataCoveragePayments")
    protected PurchaserDerivedDataCoveragePayments twentyFourMonthsDataCoveragePayments;
    @XmlElement(name = "GlobalDataCoveragePayments")
    protected PurchaserDerivedDataCoveragePayments globalDataCoveragePayments;
    @XmlElement(name = "PrecalculatedSummaryIndicator")
    protected Boolean precalculatedSummaryIndicator;

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
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

    /**
     * Gets the value of the oneMonthDataCoveragePayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public PurchaserDerivedDataCoveragePayments getOneMonthDataCoveragePayments() {
        return oneMonthDataCoveragePayments;
    }

    /**
     * Sets the value of the oneMonthDataCoveragePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public void setOneMonthDataCoveragePayments(PurchaserDerivedDataCoveragePayments value) {
        this.oneMonthDataCoveragePayments = value;
    }

    /**
     * Gets the value of the threeMonthsDataCoveragePayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public PurchaserDerivedDataCoveragePayments getThreeMonthsDataCoveragePayments() {
        return threeMonthsDataCoveragePayments;
    }

    /**
     * Sets the value of the threeMonthsDataCoveragePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public void setThreeMonthsDataCoveragePayments(PurchaserDerivedDataCoveragePayments value) {
        this.threeMonthsDataCoveragePayments = value;
    }

    /**
     * Gets the value of the twelveMonthsDataCoveragePayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public PurchaserDerivedDataCoveragePayments getTwelveMonthsDataCoveragePayments() {
        return twelveMonthsDataCoveragePayments;
    }

    /**
     * Sets the value of the twelveMonthsDataCoveragePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public void setTwelveMonthsDataCoveragePayments(PurchaserDerivedDataCoveragePayments value) {
        this.twelveMonthsDataCoveragePayments = value;
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

    /**
     * Gets the value of the globalDataCoveragePayments property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public PurchaserDerivedDataCoveragePayments getGlobalDataCoveragePayments() {
        return globalDataCoveragePayments;
    }

    /**
     * Sets the value of the globalDataCoveragePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDerivedDataCoveragePayments }
     *     
     */
    public void setGlobalDataCoveragePayments(PurchaserDerivedDataCoveragePayments value) {
        this.globalDataCoveragePayments = value;
    }

    /**
     * Gets the value of the precalculatedSummaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrecalculatedSummaryIndicator() {
        return precalculatedSummaryIndicator;
    }

    /**
     * Sets the value of the precalculatedSummaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrecalculatedSummaryIndicator(Boolean value) {
        this.precalculatedSummaryIndicator = value;
    }

}
