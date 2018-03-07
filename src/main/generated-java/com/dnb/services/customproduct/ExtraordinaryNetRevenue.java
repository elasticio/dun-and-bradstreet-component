
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtraordinaryNetRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraordinaryNetRevenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtraordinaryIncome" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalExtraordinaryIncomeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="ExtraordinaryCharges" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalExtraordinaryChargesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraordinaryNetRevenue", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "extraordinaryIncome",
    "totalExtraordinaryIncomeAmount",
    "extraordinaryCharges",
    "totalExtraordinaryChargesAmount"
})
public class ExtraordinaryNetRevenue {

    @XmlElement(name = "ExtraordinaryIncome")
    protected StatementItemType extraordinaryIncome;
    @XmlElement(name = "TotalExtraordinaryIncomeAmount")
    protected FinancialAmountType totalExtraordinaryIncomeAmount;
    @XmlElement(name = "ExtraordinaryCharges")
    protected StatementItemType extraordinaryCharges;
    @XmlElement(name = "TotalExtraordinaryChargesAmount")
    protected FinancialAmountType totalExtraordinaryChargesAmount;

    /**
     * Gets the value of the extraordinaryIncome property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getExtraordinaryIncome() {
        return extraordinaryIncome;
    }

    /**
     * Sets the value of the extraordinaryIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setExtraordinaryIncome(StatementItemType value) {
        this.extraordinaryIncome = value;
    }

    /**
     * Gets the value of the totalExtraordinaryIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalExtraordinaryIncomeAmount() {
        return totalExtraordinaryIncomeAmount;
    }

    /**
     * Sets the value of the totalExtraordinaryIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalExtraordinaryIncomeAmount(FinancialAmountType value) {
        this.totalExtraordinaryIncomeAmount = value;
    }

    /**
     * Gets the value of the extraordinaryCharges property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getExtraordinaryCharges() {
        return extraordinaryCharges;
    }

    /**
     * Sets the value of the extraordinaryCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setExtraordinaryCharges(StatementItemType value) {
        this.extraordinaryCharges = value;
    }

    /**
     * Gets the value of the totalExtraordinaryChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalExtraordinaryChargesAmount() {
        return totalExtraordinaryChargesAmount;
    }

    /**
     * Sets the value of the totalExtraordinaryChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalExtraordinaryChargesAmount(FinancialAmountType value) {
        this.totalExtraordinaryChargesAmount = value;
    }

}
