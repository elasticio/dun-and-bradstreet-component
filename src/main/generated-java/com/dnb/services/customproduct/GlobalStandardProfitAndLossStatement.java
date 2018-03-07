
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalStandardProfitAndLossStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalStandardProfitAndLossStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialNetRevenue" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialNetRevenue" minOccurs="0"/>
 *         &lt;element name="TotalOperatingProfitAndLossAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TotalGainOrLossToBeAppropriatedAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="IncomeStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="OperatingNetRevenue" type="{http://services.dnb.com/CustomProductServiceV2.0}OperatingNetRevenue" minOccurs="0"/>
 *         &lt;element name="TotalGainOrLossOfThePeriodAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TotalFinancialProfitAndLossAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="ExtraOrdinaryNetRevenue" type="{http://services.dnb.com/CustomProductServiceV2.0}ExtraordinaryNetRevenue" minOccurs="0"/>
 *         &lt;element name="ExtraOrdinaryProfitAndLossAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TransferToOrFromDeferredTaxesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="IncomeTaxesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TransferToOrFromUntaxedReservesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="StatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalStandardProfitAndLossStatement", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialNetRevenue",
    "totalOperatingProfitAndLossAmount",
    "totalGainOrLossToBeAppropriatedAmount",
    "incomeStatement",
    "operatingNetRevenue",
    "totalGainOrLossOfThePeriodAmount",
    "totalFinancialProfitAndLossAmount",
    "extraOrdinaryNetRevenue",
    "extraOrdinaryProfitAndLossAmount",
    "transferToOrFromDeferredTaxesAmount",
    "incomeTaxesAmount",
    "transferToOrFromUntaxedReservesAmount",
    "statementItem"
})
public class GlobalStandardProfitAndLossStatement {

    @XmlElement(name = "FinancialNetRevenue")
    protected FinancialNetRevenue financialNetRevenue;
    @XmlElement(name = "TotalOperatingProfitAndLossAmount")
    protected FinancialAmountType totalOperatingProfitAndLossAmount;
    @XmlElement(name = "TotalGainOrLossToBeAppropriatedAmount")
    protected FinancialAmountType totalGainOrLossToBeAppropriatedAmount;
    @XmlElement(name = "IncomeStatement")
    protected StatementItemType incomeStatement;
    @XmlElement(name = "OperatingNetRevenue")
    protected OperatingNetRevenue operatingNetRevenue;
    @XmlElement(name = "TotalGainOrLossOfThePeriodAmount")
    protected FinancialAmountType totalGainOrLossOfThePeriodAmount;
    @XmlElement(name = "TotalFinancialProfitAndLossAmount")
    protected FinancialAmountType totalFinancialProfitAndLossAmount;
    @XmlElement(name = "ExtraOrdinaryNetRevenue")
    protected ExtraordinaryNetRevenue extraOrdinaryNetRevenue;
    @XmlElement(name = "ExtraOrdinaryProfitAndLossAmount")
    protected FinancialAmountType extraOrdinaryProfitAndLossAmount;
    @XmlElement(name = "TransferToOrFromDeferredTaxesAmount")
    protected FinancialAmountType transferToOrFromDeferredTaxesAmount;
    @XmlElement(name = "IncomeTaxesAmount")
    protected FinancialAmountType incomeTaxesAmount;
    @XmlElement(name = "TransferToOrFromUntaxedReservesAmount")
    protected FinancialAmountType transferToOrFromUntaxedReservesAmount;
    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;

    /**
     * Gets the value of the financialNetRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialNetRevenue }
     *     
     */
    public FinancialNetRevenue getFinancialNetRevenue() {
        return financialNetRevenue;
    }

    /**
     * Sets the value of the financialNetRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialNetRevenue }
     *     
     */
    public void setFinancialNetRevenue(FinancialNetRevenue value) {
        this.financialNetRevenue = value;
    }

    /**
     * Gets the value of the totalOperatingProfitAndLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalOperatingProfitAndLossAmount() {
        return totalOperatingProfitAndLossAmount;
    }

    /**
     * Sets the value of the totalOperatingProfitAndLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalOperatingProfitAndLossAmount(FinancialAmountType value) {
        this.totalOperatingProfitAndLossAmount = value;
    }

    /**
     * Gets the value of the totalGainOrLossToBeAppropriatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalGainOrLossToBeAppropriatedAmount() {
        return totalGainOrLossToBeAppropriatedAmount;
    }

    /**
     * Sets the value of the totalGainOrLossToBeAppropriatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalGainOrLossToBeAppropriatedAmount(FinancialAmountType value) {
        this.totalGainOrLossToBeAppropriatedAmount = value;
    }

    /**
     * Gets the value of the incomeStatement property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getIncomeStatement() {
        return incomeStatement;
    }

    /**
     * Sets the value of the incomeStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setIncomeStatement(StatementItemType value) {
        this.incomeStatement = value;
    }

    /**
     * Gets the value of the operatingNetRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingNetRevenue }
     *     
     */
    public OperatingNetRevenue getOperatingNetRevenue() {
        return operatingNetRevenue;
    }

    /**
     * Sets the value of the operatingNetRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingNetRevenue }
     *     
     */
    public void setOperatingNetRevenue(OperatingNetRevenue value) {
        this.operatingNetRevenue = value;
    }

    /**
     * Gets the value of the totalGainOrLossOfThePeriodAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalGainOrLossOfThePeriodAmount() {
        return totalGainOrLossOfThePeriodAmount;
    }

    /**
     * Sets the value of the totalGainOrLossOfThePeriodAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalGainOrLossOfThePeriodAmount(FinancialAmountType value) {
        this.totalGainOrLossOfThePeriodAmount = value;
    }

    /**
     * Gets the value of the totalFinancialProfitAndLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalFinancialProfitAndLossAmount() {
        return totalFinancialProfitAndLossAmount;
    }

    /**
     * Sets the value of the totalFinancialProfitAndLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalFinancialProfitAndLossAmount(FinancialAmountType value) {
        this.totalFinancialProfitAndLossAmount = value;
    }

    /**
     * Gets the value of the extraOrdinaryNetRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraordinaryNetRevenue }
     *     
     */
    public ExtraordinaryNetRevenue getExtraOrdinaryNetRevenue() {
        return extraOrdinaryNetRevenue;
    }

    /**
     * Sets the value of the extraOrdinaryNetRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraordinaryNetRevenue }
     *     
     */
    public void setExtraOrdinaryNetRevenue(ExtraordinaryNetRevenue value) {
        this.extraOrdinaryNetRevenue = value;
    }

    /**
     * Gets the value of the extraOrdinaryProfitAndLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getExtraOrdinaryProfitAndLossAmount() {
        return extraOrdinaryProfitAndLossAmount;
    }

    /**
     * Sets the value of the extraOrdinaryProfitAndLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setExtraOrdinaryProfitAndLossAmount(FinancialAmountType value) {
        this.extraOrdinaryProfitAndLossAmount = value;
    }

    /**
     * Gets the value of the transferToOrFromDeferredTaxesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTransferToOrFromDeferredTaxesAmount() {
        return transferToOrFromDeferredTaxesAmount;
    }

    /**
     * Sets the value of the transferToOrFromDeferredTaxesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTransferToOrFromDeferredTaxesAmount(FinancialAmountType value) {
        this.transferToOrFromDeferredTaxesAmount = value;
    }

    /**
     * Gets the value of the incomeTaxesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getIncomeTaxesAmount() {
        return incomeTaxesAmount;
    }

    /**
     * Sets the value of the incomeTaxesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setIncomeTaxesAmount(FinancialAmountType value) {
        this.incomeTaxesAmount = value;
    }

    /**
     * Gets the value of the transferToOrFromUntaxedReservesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTransferToOrFromUntaxedReservesAmount() {
        return transferToOrFromUntaxedReservesAmount;
    }

    /**
     * Sets the value of the transferToOrFromUntaxedReservesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTransferToOrFromUntaxedReservesAmount(FinancialAmountType value) {
        this.transferToOrFromUntaxedReservesAmount = value;
    }

    /**
     * Gets the value of the statementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementItem }
     * 
     * 
     */
    public List<StatementItem> getStatementItem() {
        if (statementItem == null) {
            statementItem = new ArrayList<StatementItem>();
        }
        return this.statementItem;
    }

}
