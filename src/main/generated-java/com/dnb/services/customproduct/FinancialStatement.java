
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 *         &lt;element name="StatementHeaderDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementHeaderDetails" minOccurs="0"/>
 *         &lt;element name="BalanceSheet" type="{http://services.dnb.com/CustomProductServiceV2.0}BaseBalanceSheetType" minOccurs="0"/>
 *         &lt;element name="ProfitAndLossStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}BaseProfitAndLossStatementType" minOccurs="0"/>
 *         &lt;element name="NetworthReconciliation" type="{http://services.dnb.com/CustomProductServiceV2.0}NetworthReconciliation" minOccurs="0"/>
 *         &lt;element name="FinancialRatios" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRatios" minOccurs="0"/>
 *         &lt;element name="AccountantDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountantDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStatementComments" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialStatementCommentsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStatementExplanation" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialStatementExplanation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GlobalStandardBalanceSheet" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalBalanceSheetType" minOccurs="0"/>
 *         &lt;element name="GlobalStandardProfitAndLossStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalStandardProfitAndLossStatement" minOccurs="0"/>
 *         &lt;element name="CashFlowStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}CashFlowStatement" minOccurs="0"/>
 *         &lt;element name="StatementSourceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialStatementFiledDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FreeFormStatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}FreeFormStatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ManagementInterviewDetailsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialStatementNotQuotedReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *         &lt;element name="NotesToAccounts" type="{http://services.dnb.com/CustomProductServiceV2.0}NotesToAccounts" minOccurs="0"/>
 *         &lt;element name="FinancialStatementRolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePlayer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialStatement", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "statementHeaderDetails",
    "balanceSheet",
    "profitAndLossStatement",
    "networthReconciliation",
    "financialRatios",
    "accountantDetails",
    "financialStatementComments",
    "financialStatementExplanation",
    "globalStandardBalanceSheet",
    "globalStandardProfitAndLossStatement",
    "cashFlowStatement",
    "statementSourceText",
    "financialStatementFiledDate",
    "freeFormStatementItem",
    "lastUpdateDate",
    "managementInterviewDetailsText",
    "financialStatementNotQuotedReasonText",
    "notesToAccounts",
    "financialStatementRolePlayer"
})
@XmlSeeAlso({
    ParentFinancialStatement.class
})
public class FinancialStatement {

    @XmlElement(name = "StatementHeaderDetails")
    protected StatementHeaderDetails statementHeaderDetails;
    @XmlElement(name = "BalanceSheet")
    protected BaseBalanceSheetType balanceSheet;
    @XmlElement(name = "ProfitAndLossStatement")
    protected BaseProfitAndLossStatementType profitAndLossStatement;
    @XmlElement(name = "NetworthReconciliation")
    protected NetworthReconciliation networthReconciliation;
    @XmlElement(name = "FinancialRatios")
    protected FinancialRatios financialRatios;
    @XmlElement(name = "AccountantDetails")
    protected List<AccountantDetails> accountantDetails;
    @XmlElement(name = "FinancialStatementComments")
    protected List<FinancialStatementCommentsType> financialStatementComments;
    @XmlElement(name = "FinancialStatementExplanation")
    protected List<FinancialStatementExplanation> financialStatementExplanation;
    @XmlElement(name = "GlobalStandardBalanceSheet")
    protected GlobalBalanceSheetType globalStandardBalanceSheet;
    @XmlElement(name = "GlobalStandardProfitAndLossStatement")
    protected GlobalStandardProfitAndLossStatement globalStandardProfitAndLossStatement;
    @XmlElement(name = "CashFlowStatement")
    protected CashFlowStatement cashFlowStatement;
    @XmlElement(name = "StatementSourceText")
    protected String statementSourceText;
    @XmlElement(name = "FinancialStatementFiledDate")
    protected DNBDateType financialStatementFiledDate;
    @XmlElement(name = "FreeFormStatementItem")
    protected List<FreeFormStatementItem> freeFormStatementItem;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "ManagementInterviewDetailsText")
    protected String managementInterviewDetailsText;
    @XmlElement(name = "FinancialStatementNotQuotedReasonText")
    protected DNBDecodedStringNewType financialStatementNotQuotedReasonText;
    @XmlElement(name = "NotesToAccounts")
    protected NotesToAccounts notesToAccounts;
    @XmlElement(name = "FinancialStatementRolePlayer")
    protected List<RolePlayer> financialStatementRolePlayer;

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
     * Gets the value of the networthReconciliation property.
     * 
     * @return
     *     possible object is
     *     {@link NetworthReconciliation }
     *     
     */
    public NetworthReconciliation getNetworthReconciliation() {
        return networthReconciliation;
    }

    /**
     * Sets the value of the networthReconciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworthReconciliation }
     *     
     */
    public void setNetworthReconciliation(NetworthReconciliation value) {
        this.networthReconciliation = value;
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

    /**
     * Gets the value of the financialStatementComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStatementComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStatementComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialStatementCommentsType }
     * 
     * 
     */
    public List<FinancialStatementCommentsType> getFinancialStatementComments() {
        if (financialStatementComments == null) {
            financialStatementComments = new ArrayList<FinancialStatementCommentsType>();
        }
        return this.financialStatementComments;
    }

    /**
     * Gets the value of the financialStatementExplanation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStatementExplanation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStatementExplanation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialStatementExplanation }
     * 
     * 
     */
    public List<FinancialStatementExplanation> getFinancialStatementExplanation() {
        if (financialStatementExplanation == null) {
            financialStatementExplanation = new ArrayList<FinancialStatementExplanation>();
        }
        return this.financialStatementExplanation;
    }

    /**
     * Gets the value of the globalStandardBalanceSheet property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalBalanceSheetType }
     *     
     */
    public GlobalBalanceSheetType getGlobalStandardBalanceSheet() {
        return globalStandardBalanceSheet;
    }

    /**
     * Sets the value of the globalStandardBalanceSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalBalanceSheetType }
     *     
     */
    public void setGlobalStandardBalanceSheet(GlobalBalanceSheetType value) {
        this.globalStandardBalanceSheet = value;
    }

    /**
     * Gets the value of the globalStandardProfitAndLossStatement property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalStandardProfitAndLossStatement }
     *     
     */
    public GlobalStandardProfitAndLossStatement getGlobalStandardProfitAndLossStatement() {
        return globalStandardProfitAndLossStatement;
    }

    /**
     * Sets the value of the globalStandardProfitAndLossStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalStandardProfitAndLossStatement }
     *     
     */
    public void setGlobalStandardProfitAndLossStatement(GlobalStandardProfitAndLossStatement value) {
        this.globalStandardProfitAndLossStatement = value;
    }

    /**
     * Gets the value of the cashFlowStatement property.
     * 
     * @return
     *     possible object is
     *     {@link CashFlowStatement }
     *     
     */
    public CashFlowStatement getCashFlowStatement() {
        return cashFlowStatement;
    }

    /**
     * Sets the value of the cashFlowStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashFlowStatement }
     *     
     */
    public void setCashFlowStatement(CashFlowStatement value) {
        this.cashFlowStatement = value;
    }

    /**
     * Gets the value of the statementSourceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementSourceText() {
        return statementSourceText;
    }

    /**
     * Sets the value of the statementSourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementSourceText(String value) {
        this.statementSourceText = value;
    }

    /**
     * Gets the value of the financialStatementFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFinancialStatementFiledDate() {
        return financialStatementFiledDate;
    }

    /**
     * Sets the value of the financialStatementFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFinancialStatementFiledDate(DNBDateType value) {
        this.financialStatementFiledDate = value;
    }

    /**
     * Gets the value of the freeFormStatementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeFormStatementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeFormStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeFormStatementItem }
     * 
     * 
     */
    public List<FreeFormStatementItem> getFreeFormStatementItem() {
        if (freeFormStatementItem == null) {
            freeFormStatementItem = new ArrayList<FreeFormStatementItem>();
        }
        return this.freeFormStatementItem;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLastUpdateDate(DNBDateType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the managementInterviewDetailsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementInterviewDetailsText() {
        return managementInterviewDetailsText;
    }

    /**
     * Sets the value of the managementInterviewDetailsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementInterviewDetailsText(String value) {
        this.managementInterviewDetailsText = value;
    }

    /**
     * Gets the value of the financialStatementNotQuotedReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getFinancialStatementNotQuotedReasonText() {
        return financialStatementNotQuotedReasonText;
    }

    /**
     * Sets the value of the financialStatementNotQuotedReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setFinancialStatementNotQuotedReasonText(DNBDecodedStringNewType value) {
        this.financialStatementNotQuotedReasonText = value;
    }

    /**
     * Gets the value of the notesToAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link NotesToAccounts }
     *     
     */
    public NotesToAccounts getNotesToAccounts() {
        return notesToAccounts;
    }

    /**
     * Sets the value of the notesToAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesToAccounts }
     *     
     */
    public void setNotesToAccounts(NotesToAccounts value) {
        this.notesToAccounts = value;
    }

    /**
     * Gets the value of the financialStatementRolePlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStatementRolePlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStatementRolePlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePlayer }
     * 
     * 
     */
    public List<RolePlayer> getFinancialStatementRolePlayer() {
        if (financialStatementRolePlayer == null) {
            financialStatementRolePlayer = new ArrayList<RolePlayer>();
        }
        return this.financialStatementRolePlayer;
    }

}
