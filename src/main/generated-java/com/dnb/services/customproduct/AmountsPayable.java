
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountsPayable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountsPayable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountsPayableWithinOneYear" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="CreditorsPayableAfterOneYearAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalPayableAfterOneYearAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TotalPayableWithinOneYearAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="AccruedChargesAndDeferredIncomeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsPayable", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "amountsPayableWithinOneYear",
    "creditorsPayableAfterOneYearAmount",
    "totalPayableAfterOneYearAmount",
    "totalPayableWithinOneYearAmount",
    "accruedChargesAndDeferredIncomeAmount"
})
public class AmountsPayable {

    @XmlElement(name = "AmountsPayableWithinOneYear")
    protected StatementItemType amountsPayableWithinOneYear;
    @XmlElement(name = "CreditorsPayableAfterOneYearAmount")
    protected StatementItemType creditorsPayableAfterOneYearAmount;
    @XmlElement(name = "TotalPayableAfterOneYearAmount")
    protected FinancialAmountType totalPayableAfterOneYearAmount;
    @XmlElement(name = "TotalPayableWithinOneYearAmount")
    protected FinancialAmountType totalPayableWithinOneYearAmount;
    @XmlElement(name = "AccruedChargesAndDeferredIncomeAmount")
    protected FinancialAmountType accruedChargesAndDeferredIncomeAmount;

    /**
     * Gets the value of the amountsPayableWithinOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getAmountsPayableWithinOneYear() {
        return amountsPayableWithinOneYear;
    }

    /**
     * Sets the value of the amountsPayableWithinOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setAmountsPayableWithinOneYear(StatementItemType value) {
        this.amountsPayableWithinOneYear = value;
    }

    /**
     * Gets the value of the creditorsPayableAfterOneYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getCreditorsPayableAfterOneYearAmount() {
        return creditorsPayableAfterOneYearAmount;
    }

    /**
     * Sets the value of the creditorsPayableAfterOneYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setCreditorsPayableAfterOneYearAmount(StatementItemType value) {
        this.creditorsPayableAfterOneYearAmount = value;
    }

    /**
     * Gets the value of the totalPayableAfterOneYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalPayableAfterOneYearAmount() {
        return totalPayableAfterOneYearAmount;
    }

    /**
     * Sets the value of the totalPayableAfterOneYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalPayableAfterOneYearAmount(FinancialAmountType value) {
        this.totalPayableAfterOneYearAmount = value;
    }

    /**
     * Gets the value of the totalPayableWithinOneYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalPayableWithinOneYearAmount() {
        return totalPayableWithinOneYearAmount;
    }

    /**
     * Sets the value of the totalPayableWithinOneYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalPayableWithinOneYearAmount(FinancialAmountType value) {
        this.totalPayableWithinOneYearAmount = value;
    }

    /**
     * Gets the value of the accruedChargesAndDeferredIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getAccruedChargesAndDeferredIncomeAmount() {
        return accruedChargesAndDeferredIncomeAmount;
    }

    /**
     * Sets the value of the accruedChargesAndDeferredIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setAccruedChargesAndDeferredIncomeAmount(FinancialAmountType value) {
        this.accruedChargesAndDeferredIncomeAmount = value;
    }

}
