
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialNetRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialNetRevenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialIncome" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalFinancialIncomeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="FinancialCharges" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalFinancialChargesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialNetRevenue", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialIncome",
    "totalFinancialIncomeAmount",
    "financialCharges",
    "totalFinancialChargesAmount"
})
public class FinancialNetRevenue {

    @XmlElement(name = "FinancialIncome")
    protected StatementItemType financialIncome;
    @XmlElement(name = "TotalFinancialIncomeAmount")
    protected FinancialAmountType totalFinancialIncomeAmount;
    @XmlElement(name = "FinancialCharges")
    protected StatementItemType financialCharges;
    @XmlElement(name = "TotalFinancialChargesAmount")
    protected FinancialAmountType totalFinancialChargesAmount;

    /**
     * Gets the value of the financialIncome property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getFinancialIncome() {
        return financialIncome;
    }

    /**
     * Sets the value of the financialIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setFinancialIncome(StatementItemType value) {
        this.financialIncome = value;
    }

    /**
     * Gets the value of the totalFinancialIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalFinancialIncomeAmount() {
        return totalFinancialIncomeAmount;
    }

    /**
     * Sets the value of the totalFinancialIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalFinancialIncomeAmount(FinancialAmountType value) {
        this.totalFinancialIncomeAmount = value;
    }

    /**
     * Gets the value of the financialCharges property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getFinancialCharges() {
        return financialCharges;
    }

    /**
     * Sets the value of the financialCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setFinancialCharges(StatementItemType value) {
        this.financialCharges = value;
    }

    /**
     * Gets the value of the totalFinancialChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalFinancialChargesAmount() {
        return totalFinancialChargesAmount;
    }

    /**
     * Sets the value of the totalFinancialChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalFinancialChargesAmount(FinancialAmountType value) {
        this.totalFinancialChargesAmount = value;
    }

}
