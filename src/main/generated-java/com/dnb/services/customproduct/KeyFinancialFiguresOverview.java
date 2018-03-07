
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyFinancialFiguresOverview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyFinancialFiguresOverview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementHeaderDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementHeaderDetails" minOccurs="0"/>
 *         &lt;element name="SalesRevenueTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FinancialStatementFiledDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivableAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleNetWorthAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntangibleAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CostOfSalesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="DividendsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CashAndLiquidAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="InventoryAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SalesRevenueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkingCapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsPayableAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossBeforeTaxAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RetainedEarningsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermDebtAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="FreeFormStatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}FreeFormStatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalEquityAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalNonCurrentLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesAndEquityAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="GrossProfitAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetCurrentAssetsLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NetProfitOrLossAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NetProfitAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RolePlayerDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePlayerDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesRevenueLowRangeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SalesRevenueHighRangeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountantDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountantDetails" minOccurs="0"/>
 *         &lt;element name="SalesTurnoverGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantityGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdvertisingExpensesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ResearchAndDevelopmentExpensesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuickRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AssetToSalesRevenueRatio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLiabilitiesToNetworthRatio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReturnOnNetworthRatio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesAmountComparisonCommentText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="TangibleNetWorthAmountComparisonText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProfitAndLossStatementText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DividendGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkinCapitalGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SalesOverEmployeeRatio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmployeeQuantityReliabilityText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="WithdrawalsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyFinancialFiguresOverview", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "statementHeaderDetails",
    "salesRevenueTypeText",
    "financialStatementFiledDate",
    "accountsReceivableAmount",
    "tangibleNetWorthAmount",
    "intangibleAssetsAmount",
    "costOfSalesAmount",
    "dividendsAmount",
    "cashAndLiquidAssetsAmount",
    "inventoryAmount",
    "salesRevenueAmount",
    "workingCapitalAmount",
    "accountsPayableAmount",
    "profitOrLossBeforeTaxAmount",
    "retainedEarningsAmount",
    "longTermDebtAmount",
    "freeFormStatementItem",
    "statementItem",
    "totalFixedAssetsAmount",
    "totalCurrentAssetsAmount",
    "totalAssetsAmount",
    "totalEquityAmount",
    "totalCurrentLiabilitiesAmount",
    "totalNonCurrentLiabilitiesAmount",
    "totalLiabilitiesAmount",
    "totalLiabilitiesAndEquityAmount",
    "grossProfitAmount",
    "profitOrLossAmount",
    "netCurrentAssetsLiabilitiesAmount",
    "netProfitOrLossAmount",
    "netProfitAmount",
    "rolePlayerDetails",
    "salesRevenueLowRangeAmount",
    "salesRevenueHighRangeAmount",
    "accountantDetails",
    "salesTurnoverGrowthRate",
    "profitOrLossGrowthRate",
    "employeeQuantityGrowthRate",
    "advertisingExpensesAmount",
    "researchAndDevelopmentExpensesAmount",
    "currentRatio",
    "quickRatio",
    "assetToSalesRevenueRatio",
    "totalLiabilitiesToNetworthRatio",
    "returnOnNetworthRatio",
    "salesAmountComparisonCommentText",
    "tangibleNetWorthAmountComparisonText",
    "profitAndLossStatementText",
    "dividendGrowthRate",
    "workinCapitalGrowthRate",
    "employeeQuantity",
    "salesOverEmployeeRatio",
    "employeeQuantityReliabilityText",
    "withdrawalsAmount",
    "totalLongTermAssetsAmount"
})
public class KeyFinancialFiguresOverview {

    @XmlElement(name = "StatementHeaderDetails")
    protected StatementHeaderDetails statementHeaderDetails;
    @XmlElement(name = "SalesRevenueTypeText")
    protected DNBDecodedStringType salesRevenueTypeText;
    @XmlElement(name = "FinancialStatementFiledDate")
    protected DNBDateType financialStatementFiledDate;
    @XmlElement(name = "AccountsReceivableAmount")
    protected AmountType accountsReceivableAmount;
    @XmlElement(name = "TangibleNetWorthAmount")
    protected List<AmountType> tangibleNetWorthAmount;
    @XmlElement(name = "IntangibleAssetsAmount")
    protected AmountType intangibleAssetsAmount;
    @XmlElement(name = "CostOfSalesAmount")
    protected AmountType costOfSalesAmount;
    @XmlElement(name = "DividendsAmount")
    protected AmountType dividendsAmount;
    @XmlElement(name = "CashAndLiquidAssetsAmount")
    protected AmountType cashAndLiquidAssetsAmount;
    @XmlElement(name = "InventoryAmount")
    protected AmountType inventoryAmount;
    @XmlElement(name = "SalesRevenueAmount")
    protected List<AmountType> salesRevenueAmount;
    @XmlElement(name = "WorkingCapitalAmount")
    protected AmountType workingCapitalAmount;
    @XmlElement(name = "AccountsPayableAmount")
    protected AmountType accountsPayableAmount;
    @XmlElement(name = "ProfitOrLossBeforeTaxAmount")
    protected AmountType profitOrLossBeforeTaxAmount;
    @XmlElement(name = "RetainedEarningsAmount")
    protected AmountType retainedEarningsAmount;
    @XmlElement(name = "LongTermDebtAmount")
    protected AmountType longTermDebtAmount;
    @XmlElement(name = "FreeFormStatementItem")
    protected List<FreeFormStatementItem> freeFormStatementItem;
    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;
    @XmlElement(name = "TotalFixedAssetsAmount")
    protected AmountType totalFixedAssetsAmount;
    @XmlElement(name = "TotalCurrentAssetsAmount")
    protected AmountType totalCurrentAssetsAmount;
    @XmlElement(name = "TotalAssetsAmount")
    protected AmountType totalAssetsAmount;
    @XmlElement(name = "TotalEquityAmount")
    protected AmountType totalEquityAmount;
    @XmlElement(name = "TotalCurrentLiabilitiesAmount")
    protected AmountType totalCurrentLiabilitiesAmount;
    @XmlElement(name = "TotalNonCurrentLiabilitiesAmount")
    protected AmountType totalNonCurrentLiabilitiesAmount;
    @XmlElement(name = "TotalLiabilitiesAmount")
    protected AmountType totalLiabilitiesAmount;
    @XmlElement(name = "TotalLiabilitiesAndEquityAmount")
    protected AmountType totalLiabilitiesAndEquityAmount;
    @XmlElement(name = "GrossProfitAmount")
    protected AmountType grossProfitAmount;
    @XmlElement(name = "ProfitOrLossAmount")
    protected List<AmountType> profitOrLossAmount;
    @XmlElement(name = "NetCurrentAssetsLiabilitiesAmount")
    protected AmountType netCurrentAssetsLiabilitiesAmount;
    @XmlElement(name = "NetProfitOrLossAmount")
    protected AmountType netProfitOrLossAmount;
    @XmlElement(name = "NetProfitAmount")
    protected AmountType netProfitAmount;
    @XmlElement(name = "RolePlayerDetails")
    protected List<RolePlayerDetailsType> rolePlayerDetails;
    @XmlElement(name = "SalesRevenueLowRangeAmount")
    protected AmountType salesRevenueLowRangeAmount;
    @XmlElement(name = "SalesRevenueHighRangeAmount")
    protected AmountType salesRevenueHighRangeAmount;
    @XmlElement(name = "AccountantDetails")
    protected AccountantDetails accountantDetails;
    @XmlElement(name = "SalesTurnoverGrowthRate")
    protected BigDecimal salesTurnoverGrowthRate;
    @XmlElement(name = "ProfitOrLossGrowthRate")
    protected BigDecimal profitOrLossGrowthRate;
    @XmlElement(name = "EmployeeQuantityGrowthRate")
    protected BigDecimal employeeQuantityGrowthRate;
    @XmlElement(name = "AdvertisingExpensesAmount")
    protected AmountType advertisingExpensesAmount;
    @XmlElement(name = "ResearchAndDevelopmentExpensesAmount")
    protected AmountType researchAndDevelopmentExpensesAmount;
    @XmlElement(name = "CurrentRatio")
    protected BigDecimal currentRatio;
    @XmlElement(name = "QuickRatio")
    protected BigDecimal quickRatio;
    @XmlElement(name = "AssetToSalesRevenueRatio")
    protected BigDecimal assetToSalesRevenueRatio;
    @XmlElement(name = "TotalLiabilitiesToNetworthRatio")
    protected BigDecimal totalLiabilitiesToNetworthRatio;
    @XmlElement(name = "ReturnOnNetworthRatio")
    protected BigDecimal returnOnNetworthRatio;
    @XmlElement(name = "SalesAmountComparisonCommentText")
    protected String salesAmountComparisonCommentText;
    @XmlElement(name = "TangibleNetWorthAmountComparisonText")
    protected String tangibleNetWorthAmountComparisonText;
    @XmlElement(name = "ProfitAndLossStatementText")
    protected String profitAndLossStatementText;
    @XmlElement(name = "DividendGrowthRate")
    protected BigDecimal dividendGrowthRate;
    @XmlElement(name = "WorkinCapitalGrowthRate")
    protected BigDecimal workinCapitalGrowthRate;
    @XmlElement(name = "EmployeeQuantity")
    protected Integer employeeQuantity;
    @XmlElement(name = "SalesOverEmployeeRatio")
    protected BigDecimal salesOverEmployeeRatio;
    @XmlElement(name = "EmployeeQuantityReliabilityText")
    protected DNBDecodedStringType employeeQuantityReliabilityText;
    @XmlElement(name = "WithdrawalsAmount")
    protected AmountType withdrawalsAmount;
    @XmlElement(name = "TotalLongTermAssetsAmount")
    protected AmountType totalLongTermAssetsAmount;

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
     * Gets the value of the salesRevenueTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSalesRevenueTypeText() {
        return salesRevenueTypeText;
    }

    /**
     * Sets the value of the salesRevenueTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSalesRevenueTypeText(DNBDecodedStringType value) {
        this.salesRevenueTypeText = value;
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
     * Gets the value of the accountsReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsReceivableAmount() {
        return accountsReceivableAmount;
    }

    /**
     * Sets the value of the accountsReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsReceivableAmount(AmountType value) {
        this.accountsReceivableAmount = value;
    }

    /**
     * Gets the value of the tangibleNetWorthAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tangibleNetWorthAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTangibleNetWorthAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getTangibleNetWorthAmount() {
        if (tangibleNetWorthAmount == null) {
            tangibleNetWorthAmount = new ArrayList<AmountType>();
        }
        return this.tangibleNetWorthAmount;
    }

    /**
     * Gets the value of the intangibleAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIntangibleAssetsAmount() {
        return intangibleAssetsAmount;
    }

    /**
     * Sets the value of the intangibleAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIntangibleAssetsAmount(AmountType value) {
        this.intangibleAssetsAmount = value;
    }

    /**
     * Gets the value of the costOfSalesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCostOfSalesAmount() {
        return costOfSalesAmount;
    }

    /**
     * Sets the value of the costOfSalesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCostOfSalesAmount(AmountType value) {
        this.costOfSalesAmount = value;
    }

    /**
     * Gets the value of the dividendsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDividendsAmount() {
        return dividendsAmount;
    }

    /**
     * Sets the value of the dividendsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDividendsAmount(AmountType value) {
        this.dividendsAmount = value;
    }

    /**
     * Gets the value of the cashAndLiquidAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashAndLiquidAssetsAmount() {
        return cashAndLiquidAssetsAmount;
    }

    /**
     * Sets the value of the cashAndLiquidAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashAndLiquidAssetsAmount(AmountType value) {
        this.cashAndLiquidAssetsAmount = value;
    }

    /**
     * Gets the value of the inventoryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInventoryAmount() {
        return inventoryAmount;
    }

    /**
     * Sets the value of the inventoryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInventoryAmount(AmountType value) {
        this.inventoryAmount = value;
    }

    /**
     * Gets the value of the salesRevenueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRevenueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRevenueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSalesRevenueAmount() {
        if (salesRevenueAmount == null) {
            salesRevenueAmount = new ArrayList<AmountType>();
        }
        return this.salesRevenueAmount;
    }

    /**
     * Gets the value of the workingCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWorkingCapitalAmount() {
        return workingCapitalAmount;
    }

    /**
     * Sets the value of the workingCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWorkingCapitalAmount(AmountType value) {
        this.workingCapitalAmount = value;
    }

    /**
     * Gets the value of the accountsPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsPayableAmount() {
        return accountsPayableAmount;
    }

    /**
     * Sets the value of the accountsPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsPayableAmount(AmountType value) {
        this.accountsPayableAmount = value;
    }

    /**
     * Gets the value of the profitOrLossBeforeTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitOrLossBeforeTaxAmount() {
        return profitOrLossBeforeTaxAmount;
    }

    /**
     * Sets the value of the profitOrLossBeforeTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitOrLossBeforeTaxAmount(AmountType value) {
        this.profitOrLossBeforeTaxAmount = value;
    }

    /**
     * Gets the value of the retainedEarningsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRetainedEarningsAmount() {
        return retainedEarningsAmount;
    }

    /**
     * Sets the value of the retainedEarningsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRetainedEarningsAmount(AmountType value) {
        this.retainedEarningsAmount = value;
    }

    /**
     * Gets the value of the longTermDebtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermDebtAmount() {
        return longTermDebtAmount;
    }

    /**
     * Sets the value of the longTermDebtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermDebtAmount(AmountType value) {
        this.longTermDebtAmount = value;
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

    /**
     * Gets the value of the totalFixedAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalFixedAssetsAmount() {
        return totalFixedAssetsAmount;
    }

    /**
     * Sets the value of the totalFixedAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalFixedAssetsAmount(AmountType value) {
        this.totalFixedAssetsAmount = value;
    }

    /**
     * Gets the value of the totalCurrentAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCurrentAssetsAmount() {
        return totalCurrentAssetsAmount;
    }

    /**
     * Sets the value of the totalCurrentAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCurrentAssetsAmount(AmountType value) {
        this.totalCurrentAssetsAmount = value;
    }

    /**
     * Gets the value of the totalAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssetsAmount() {
        return totalAssetsAmount;
    }

    /**
     * Sets the value of the totalAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssetsAmount(AmountType value) {
        this.totalAssetsAmount = value;
    }

    /**
     * Gets the value of the totalEquityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalEquityAmount() {
        return totalEquityAmount;
    }

    /**
     * Sets the value of the totalEquityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalEquityAmount(AmountType value) {
        this.totalEquityAmount = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCurrentLiabilitiesAmount() {
        return totalCurrentLiabilitiesAmount;
    }

    /**
     * Sets the value of the totalCurrentLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCurrentLiabilitiesAmount(AmountType value) {
        this.totalCurrentLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the totalNonCurrentLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalNonCurrentLiabilitiesAmount() {
        return totalNonCurrentLiabilitiesAmount;
    }

    /**
     * Sets the value of the totalNonCurrentLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalNonCurrentLiabilitiesAmount(AmountType value) {
        this.totalNonCurrentLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the totalLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilitiesAmount() {
        return totalLiabilitiesAmount;
    }

    /**
     * Sets the value of the totalLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilitiesAmount(AmountType value) {
        this.totalLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the totalLiabilitiesAndEquityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilitiesAndEquityAmount() {
        return totalLiabilitiesAndEquityAmount;
    }

    /**
     * Sets the value of the totalLiabilitiesAndEquityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilitiesAndEquityAmount(AmountType value) {
        this.totalLiabilitiesAndEquityAmount = value;
    }

    /**
     * Gets the value of the grossProfitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrossProfitAmount() {
        return grossProfitAmount;
    }

    /**
     * Sets the value of the grossProfitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrossProfitAmount(AmountType value) {
        this.grossProfitAmount = value;
    }

    /**
     * Gets the value of the profitOrLossAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profitOrLossAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfitOrLossAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getProfitOrLossAmount() {
        if (profitOrLossAmount == null) {
            profitOrLossAmount = new ArrayList<AmountType>();
        }
        return this.profitOrLossAmount;
    }

    /**
     * Gets the value of the netCurrentAssetsLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetCurrentAssetsLiabilitiesAmount() {
        return netCurrentAssetsLiabilitiesAmount;
    }

    /**
     * Sets the value of the netCurrentAssetsLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetCurrentAssetsLiabilitiesAmount(AmountType value) {
        this.netCurrentAssetsLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the netProfitOrLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetProfitOrLossAmount() {
        return netProfitOrLossAmount;
    }

    /**
     * Sets the value of the netProfitOrLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetProfitOrLossAmount(AmountType value) {
        this.netProfitOrLossAmount = value;
    }

    /**
     * Gets the value of the netProfitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetProfitAmount() {
        return netProfitAmount;
    }

    /**
     * Sets the value of the netProfitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetProfitAmount(AmountType value) {
        this.netProfitAmount = value;
    }

    /**
     * Gets the value of the rolePlayerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePlayerDetailsType }
     * 
     * 
     */
    public List<RolePlayerDetailsType> getRolePlayerDetails() {
        if (rolePlayerDetails == null) {
            rolePlayerDetails = new ArrayList<RolePlayerDetailsType>();
        }
        return this.rolePlayerDetails;
    }

    /**
     * Gets the value of the salesRevenueLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesRevenueLowRangeAmount() {
        return salesRevenueLowRangeAmount;
    }

    /**
     * Sets the value of the salesRevenueLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesRevenueLowRangeAmount(AmountType value) {
        this.salesRevenueLowRangeAmount = value;
    }

    /**
     * Gets the value of the salesRevenueHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesRevenueHighRangeAmount() {
        return salesRevenueHighRangeAmount;
    }

    /**
     * Sets the value of the salesRevenueHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesRevenueHighRangeAmount(AmountType value) {
        this.salesRevenueHighRangeAmount = value;
    }

    /**
     * Gets the value of the accountantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountantDetails }
     *     
     */
    public AccountantDetails getAccountantDetails() {
        return accountantDetails;
    }

    /**
     * Sets the value of the accountantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountantDetails }
     *     
     */
    public void setAccountantDetails(AccountantDetails value) {
        this.accountantDetails = value;
    }

    /**
     * Gets the value of the salesTurnoverGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTurnoverGrowthRate() {
        return salesTurnoverGrowthRate;
    }

    /**
     * Sets the value of the salesTurnoverGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTurnoverGrowthRate(BigDecimal value) {
        this.salesTurnoverGrowthRate = value;
    }

    /**
     * Gets the value of the profitOrLossGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitOrLossGrowthRate() {
        return profitOrLossGrowthRate;
    }

    /**
     * Sets the value of the profitOrLossGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitOrLossGrowthRate(BigDecimal value) {
        this.profitOrLossGrowthRate = value;
    }

    /**
     * Gets the value of the employeeQuantityGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeQuantityGrowthRate() {
        return employeeQuantityGrowthRate;
    }

    /**
     * Sets the value of the employeeQuantityGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeQuantityGrowthRate(BigDecimal value) {
        this.employeeQuantityGrowthRate = value;
    }

    /**
     * Gets the value of the advertisingExpensesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvertisingExpensesAmount() {
        return advertisingExpensesAmount;
    }

    /**
     * Sets the value of the advertisingExpensesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvertisingExpensesAmount(AmountType value) {
        this.advertisingExpensesAmount = value;
    }

    /**
     * Gets the value of the researchAndDevelopmentExpensesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResearchAndDevelopmentExpensesAmount() {
        return researchAndDevelopmentExpensesAmount;
    }

    /**
     * Sets the value of the researchAndDevelopmentExpensesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResearchAndDevelopmentExpensesAmount(AmountType value) {
        this.researchAndDevelopmentExpensesAmount = value;
    }

    /**
     * Gets the value of the currentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    /**
     * Sets the value of the currentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatio(BigDecimal value) {
        this.currentRatio = value;
    }

    /**
     * Gets the value of the quickRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuickRatio() {
        return quickRatio;
    }

    /**
     * Sets the value of the quickRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuickRatio(BigDecimal value) {
        this.quickRatio = value;
    }

    /**
     * Gets the value of the assetToSalesRevenueRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssetToSalesRevenueRatio() {
        return assetToSalesRevenueRatio;
    }

    /**
     * Sets the value of the assetToSalesRevenueRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssetToSalesRevenueRatio(BigDecimal value) {
        this.assetToSalesRevenueRatio = value;
    }

    /**
     * Gets the value of the totalLiabilitiesToNetworthRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLiabilitiesToNetworthRatio() {
        return totalLiabilitiesToNetworthRatio;
    }

    /**
     * Sets the value of the totalLiabilitiesToNetworthRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLiabilitiesToNetworthRatio(BigDecimal value) {
        this.totalLiabilitiesToNetworthRatio = value;
    }

    /**
     * Gets the value of the returnOnNetworthRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnNetworthRatio() {
        return returnOnNetworthRatio;
    }

    /**
     * Sets the value of the returnOnNetworthRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnNetworthRatio(BigDecimal value) {
        this.returnOnNetworthRatio = value;
    }

    /**
     * Gets the value of the salesAmountComparisonCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAmountComparisonCommentText() {
        return salesAmountComparisonCommentText;
    }

    /**
     * Sets the value of the salesAmountComparisonCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAmountComparisonCommentText(String value) {
        this.salesAmountComparisonCommentText = value;
    }

    /**
     * Gets the value of the tangibleNetWorthAmountComparisonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTangibleNetWorthAmountComparisonText() {
        return tangibleNetWorthAmountComparisonText;
    }

    /**
     * Sets the value of the tangibleNetWorthAmountComparisonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTangibleNetWorthAmountComparisonText(String value) {
        this.tangibleNetWorthAmountComparisonText = value;
    }

    /**
     * Gets the value of the profitAndLossStatementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitAndLossStatementText() {
        return profitAndLossStatementText;
    }

    /**
     * Sets the value of the profitAndLossStatementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitAndLossStatementText(String value) {
        this.profitAndLossStatementText = value;
    }

    /**
     * Gets the value of the dividendGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendGrowthRate() {
        return dividendGrowthRate;
    }

    /**
     * Sets the value of the dividendGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendGrowthRate(BigDecimal value) {
        this.dividendGrowthRate = value;
    }

    /**
     * Gets the value of the workinCapitalGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkinCapitalGrowthRate() {
        return workinCapitalGrowthRate;
    }

    /**
     * Sets the value of the workinCapitalGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkinCapitalGrowthRate(BigDecimal value) {
        this.workinCapitalGrowthRate = value;
    }

    /**
     * Gets the value of the employeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Sets the value of the employeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeQuantity(Integer value) {
        this.employeeQuantity = value;
    }

    /**
     * Gets the value of the salesOverEmployeeRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesOverEmployeeRatio() {
        return salesOverEmployeeRatio;
    }

    /**
     * Sets the value of the salesOverEmployeeRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesOverEmployeeRatio(BigDecimal value) {
        this.salesOverEmployeeRatio = value;
    }

    /**
     * Gets the value of the employeeQuantityReliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEmployeeQuantityReliabilityText() {
        return employeeQuantityReliabilityText;
    }

    /**
     * Sets the value of the employeeQuantityReliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEmployeeQuantityReliabilityText(DNBDecodedStringType value) {
        this.employeeQuantityReliabilityText = value;
    }

    /**
     * Gets the value of the withdrawalsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWithdrawalsAmount() {
        return withdrawalsAmount;
    }

    /**
     * Sets the value of the withdrawalsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWithdrawalsAmount(AmountType value) {
        this.withdrawalsAmount = value;
    }

    /**
     * Gets the value of the totalLongTermAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLongTermAssetsAmount() {
        return totalLongTermAssetsAmount;
    }

    /**
     * Sets the value of the totalLongTermAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLongTermAssetsAmount(AmountType value) {
        this.totalLongTermAssetsAmount = value;
    }

}
