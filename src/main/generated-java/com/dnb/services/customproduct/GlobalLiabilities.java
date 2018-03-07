
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalLiabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalLiabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Equity" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalEquity" minOccurs="0"/>
 *         &lt;element name="NetworthAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="AmountsPayable" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountsPayable" minOccurs="0"/>
 *         &lt;element name="LongTermLiabilities" type="{http://services.dnb.com/CustomProductServiceV2.0}LongTermLiabilities" minOccurs="0"/>
 *         &lt;element name="TotalEquityAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="GroupEquityAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="AdvanceAssociatesSharingOutAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TotalProvisionsAndDeferredTaxesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TotalPayableAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalLiabilities", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "equity",
    "networthAmount",
    "amountsPayable",
    "longTermLiabilities",
    "totalEquityAmount",
    "groupEquityAmount",
    "advanceAssociatesSharingOutAssetsAmount",
    "totalProvisionsAndDeferredTaxesAmount",
    "totalPayableAmount"
})
public class GlobalLiabilities {

    @XmlElement(name = "Equity")
    protected GlobalEquity equity;
    @XmlElement(name = "NetworthAmount")
    protected FinancialAmountType networthAmount;
    @XmlElement(name = "AmountsPayable")
    protected AmountsPayable amountsPayable;
    @XmlElement(name = "LongTermLiabilities")
    protected LongTermLiabilities longTermLiabilities;
    @XmlElement(name = "TotalEquityAmount")
    protected FinancialAmountType totalEquityAmount;
    @XmlElement(name = "GroupEquityAmount")
    protected FinancialAmountType groupEquityAmount;
    @XmlElement(name = "AdvanceAssociatesSharingOutAssetsAmount")
    protected FinancialAmountType advanceAssociatesSharingOutAssetsAmount;
    @XmlElement(name = "TotalProvisionsAndDeferredTaxesAmount")
    protected FinancialAmountType totalProvisionsAndDeferredTaxesAmount;
    @XmlElement(name = "TotalPayableAmount")
    protected FinancialAmountType totalPayableAmount;

    /**
     * Gets the value of the equity property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalEquity }
     *     
     */
    public GlobalEquity getEquity() {
        return equity;
    }

    /**
     * Sets the value of the equity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalEquity }
     *     
     */
    public void setEquity(GlobalEquity value) {
        this.equity = value;
    }

    /**
     * Gets the value of the networthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getNetworthAmount() {
        return networthAmount;
    }

    /**
     * Sets the value of the networthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setNetworthAmount(FinancialAmountType value) {
        this.networthAmount = value;
    }

    /**
     * Gets the value of the amountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsPayable }
     *     
     */
    public AmountsPayable getAmountsPayable() {
        return amountsPayable;
    }

    /**
     * Sets the value of the amountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsPayable }
     *     
     */
    public void setAmountsPayable(AmountsPayable value) {
        this.amountsPayable = value;
    }

    /**
     * Gets the value of the longTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermLiabilities }
     *     
     */
    public LongTermLiabilities getLongTermLiabilities() {
        return longTermLiabilities;
    }

    /**
     * Sets the value of the longTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermLiabilities }
     *     
     */
    public void setLongTermLiabilities(LongTermLiabilities value) {
        this.longTermLiabilities = value;
    }

    /**
     * Gets the value of the totalEquityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalEquityAmount() {
        return totalEquityAmount;
    }

    /**
     * Sets the value of the totalEquityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalEquityAmount(FinancialAmountType value) {
        this.totalEquityAmount = value;
    }

    /**
     * Gets the value of the groupEquityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getGroupEquityAmount() {
        return groupEquityAmount;
    }

    /**
     * Sets the value of the groupEquityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setGroupEquityAmount(FinancialAmountType value) {
        this.groupEquityAmount = value;
    }

    /**
     * Gets the value of the advanceAssociatesSharingOutAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getAdvanceAssociatesSharingOutAssetsAmount() {
        return advanceAssociatesSharingOutAssetsAmount;
    }

    /**
     * Sets the value of the advanceAssociatesSharingOutAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setAdvanceAssociatesSharingOutAssetsAmount(FinancialAmountType value) {
        this.advanceAssociatesSharingOutAssetsAmount = value;
    }

    /**
     * Gets the value of the totalProvisionsAndDeferredTaxesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalProvisionsAndDeferredTaxesAmount() {
        return totalProvisionsAndDeferredTaxesAmount;
    }

    /**
     * Sets the value of the totalProvisionsAndDeferredTaxesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalProvisionsAndDeferredTaxesAmount(FinancialAmountType value) {
        this.totalProvisionsAndDeferredTaxesAmount = value;
    }

    /**
     * Gets the value of the totalPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalPayableAmount() {
        return totalPayableAmount;
    }

    /**
     * Sets the value of the totalPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalPayableAmount(FinancialAmountType value) {
        this.totalPayableAmount = value;
    }

}
