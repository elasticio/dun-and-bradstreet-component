
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankruptcyFinancialStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyFinancialStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementHeaderDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementHeaderDetails" minOccurs="0"/>
 *         &lt;element name="BalanceSheet" type="{http://services.dnb.com/CustomProductServiceV2.0}BaseBalanceSheetType" minOccurs="0"/>
 *         &lt;element name="ProfitAndLossStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}BaseProfitAndLossStatementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyFinancialStatement", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "statementHeaderDetails",
    "balanceSheet",
    "profitAndLossStatement"
})
public class BankruptcyFinancialStatement {

    @XmlElement(name = "StatementHeaderDetails")
    protected StatementHeaderDetails statementHeaderDetails;
    @XmlElement(name = "BalanceSheet")
    protected BaseBalanceSheetType balanceSheet;
    @XmlElement(name = "ProfitAndLossStatement")
    protected BaseProfitAndLossStatementType profitAndLossStatement;

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

}
