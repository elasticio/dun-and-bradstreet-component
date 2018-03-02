
package com.dnb.services.ratings.actions;

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
 *         &lt;element name="StatementHeaderDetails" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StatementHeaderDetails" minOccurs="0"/>
 *         &lt;element name="BalanceSheet" type="{http://services.dnb.com/AssessmentProductServiceV2.0}BaseBalanceSheetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialStatement", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "statementHeaderDetails",
    "balanceSheet"
})
public class FinancialStatement {

    @XmlElement(name = "StatementHeaderDetails")
    protected StatementHeaderDetails statementHeaderDetails;
    @XmlElement(name = "BalanceSheet")
    protected BaseBalanceSheetType balanceSheet;

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

}
