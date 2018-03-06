
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementHeaderDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StatementHeaderDetails" minOccurs="0"/>
 *         &lt;element name="BalanceSheet" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}BaseBalanceSheetType" minOccurs="0"/>
 *         &lt;element name="ProfitAndLossStatement" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}BaseProfitAndLossStatementType" minOccurs="0"/>
 *         &lt;element name="FinancialRatios" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}FinancialRatios" minOccurs="0"/>
 *         &lt;element name="AccountantDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AccountantDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialStatement", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "statementHeaderDetails",
    "balanceSheet",
    "profitAndLossStatement",
    "financialRatios",
    "accountantDetails"
})
public class FinancialStatement {

    @XmlElement(name = "StatementHeaderDetails")
    protected StatementHeaderDetails statementHeaderDetails;
    @XmlElement(name = "BalanceSheet")
    protected BaseBalanceSheetType balanceSheet;
    @XmlElement(name = "ProfitAndLossStatement")
    protected BaseProfitAndLossStatementType profitAndLossStatement;
    @XmlElement(name = "FinancialRatios")
    protected FinancialRatios financialRatios;
    @XmlElement(name = "AccountantDetails")
    protected List<AccountantDetails> accountantDetails;

    /**
     * Gets the value of the statementHeaderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatementHeaderDetails }
     *     
     */
    public StatementHeaderDetails getStatementHeaderDetails() {
        return statementHeaderDetails;
    }

    /**
     * Sets the value of the statementHeaderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementHeaderDetails }
     *     
     */
    public void setStatementHeaderDetails(StatementHeaderDetails value) {
        this.statementHeaderDetails = value;
    }

    /**
     * Gets the value of the balanceSheet property.
     * 
     * @return
     *     possible object is
     *     {@link BaseBalanceSheetType }
     *     
     */
    public BaseBalanceSheetType getBalanceSheet() {
        return balanceSheet;
    }

    /**
     * Sets the value of the balanceSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseBalanceSheetType }
     *     
     */
    public void setBalanceSheet(BaseBalanceSheetType value) {
        this.balanceSheet = value;
    }

    /**
     * Gets the value of the profitAndLossStatement property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProfitAndLossStatementType }
     *     
     */
    public BaseProfitAndLossStatementType getProfitAndLossStatement() {
        return profitAndLossStatement;
    }

    /**
     * Sets the value of the profitAndLossStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProfitAndLossStatementType }
     *     
     */
    public void setProfitAndLossStatement(BaseProfitAndLossStatementType value) {
        this.profitAndLossStatement = value;
    }

    /**
     * Gets the value of the financialRatios property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatios }
     *     
     */
    public FinancialRatios getFinancialRatios() {
        return financialRatios;
    }

    /**
     * Sets the value of the financialRatios property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatios }
     *     
     */
    public void setFinancialRatios(FinancialRatios value) {
        this.financialRatios = value;
    }

    /**
     * Gets the value of the accountantDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountantDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountantDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountantDetails }
     * 
     * 
     */
    public List<AccountantDetails> getAccountantDetails() {
        if (accountantDetails == null) {
            accountantDetails = new ArrayList<AccountantDetails>();
        }
        return this.accountantDetails;
    }

}
