
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingNetRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingNetRevenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrossOperatingMarginAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="OperatingIncome" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalOperatingIncomeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="OperatingCharges" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalOperatingChargesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingNetRevenue", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "grossOperatingMarginAmount",
    "operatingIncome",
    "totalOperatingIncomeAmount",
    "operatingCharges",
    "totalOperatingChargesAmount"
})
public class OperatingNetRevenue {

    @XmlElement(name = "GrossOperatingMarginAmount")
    protected FinancialAmountType grossOperatingMarginAmount;
    @XmlElement(name = "OperatingIncome")
    protected StatementItemType operatingIncome;
    @XmlElement(name = "TotalOperatingIncomeAmount")
    protected FinancialAmountType totalOperatingIncomeAmount;
    @XmlElement(name = "OperatingCharges")
    protected StatementItemType operatingCharges;
    @XmlElement(name = "TotalOperatingChargesAmount")
    protected FinancialAmountType totalOperatingChargesAmount;

    /**
     * Gets the value of the grossOperatingMarginAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getGrossOperatingMarginAmount() {
        return grossOperatingMarginAmount;
    }

    /**
     * Sets the value of the grossOperatingMarginAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setGrossOperatingMarginAmount(FinancialAmountType value) {
        this.grossOperatingMarginAmount = value;
    }

    /**
     * Gets the value of the operatingIncome property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getOperatingIncome() {
        return operatingIncome;
    }

    /**
     * Sets the value of the operatingIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setOperatingIncome(StatementItemType value) {
        this.operatingIncome = value;
    }

    /**
     * Gets the value of the totalOperatingIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalOperatingIncomeAmount() {
        return totalOperatingIncomeAmount;
    }

    /**
     * Sets the value of the totalOperatingIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalOperatingIncomeAmount(FinancialAmountType value) {
        this.totalOperatingIncomeAmount = value;
    }

    /**
     * Gets the value of the operatingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getOperatingCharges() {
        return operatingCharges;
    }

    /**
     * Sets the value of the operatingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setOperatingCharges(StatementItemType value) {
        this.operatingCharges = value;
    }

    /**
     * Gets the value of the totalOperatingChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalOperatingChargesAmount() {
        return totalOperatingChargesAmount;
    }

    /**
     * Sets the value of the totalOperatingChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalOperatingChargesAmount(FinancialAmountType value) {
        this.totalOperatingChargesAmount = value;
    }

}
