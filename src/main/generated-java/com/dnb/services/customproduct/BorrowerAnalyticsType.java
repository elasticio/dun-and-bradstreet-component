
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BorrowerAnalyticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorrowerAnalyticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LoanAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="LoanAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LoanAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LoanAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LoanAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LoanAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LoanAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="CommercialCardAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCardAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="CommercialCardAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCardAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="CommercialCardAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCardAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="CommercialCardAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCardAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LeaseAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LeaseAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="LeaseAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LeaseAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LeaseAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LeaseAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LeaseAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LeaseAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountThreeMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountTwentyFourMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountThirtySixMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="RevolvingAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}RevolvingAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="RevolvingAccountThreeMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}RevolvingAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="RevolvingAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}RevolvingAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="RevolvingAccountTwentyFourMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}RevolvingAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="RevolvingAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}RevolvingAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="InstallmentAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InstallmentAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="InstallmentAccountThreeMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InstallmentAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="InstallmentAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InstallmentAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="InstallmentAccountTwentyFourMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InstallmentAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="InstallmentAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InstallmentAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="OpenEndedCreditLineAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}OpenEndedCreditLineAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="OpenEndedCreditLineAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}OpenEndedCreditLineAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="OpenEndedCreditLineAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}OpenEndedCreditLineAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="OpenEndedCreditLineAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}OpenEndedCreditLineAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LettersOfCreditAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LettersOfCreditAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="LettersOfCreditAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LettersOfCreditAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LettersOfCreditAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LettersOfCreditAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LettersOfCreditAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LettersOfCreditAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LinesOfCreditAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LinesOfCreditAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="LinesOfCreditAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LinesOfCreditAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LinesOfCreditAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LinesOfCreditAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="LinesOfCreditAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LinesOfCreditAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="UnclassifiedAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UnclassifiedAccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="UnclassifiedAccountCurrentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UnclassifiedAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="UnclassifiedAccountTwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UnclassifiedAccountPeriodSummaryType" minOccurs="0"/>
 *         &lt;element name="UnclassifiedAccountFortyEightMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UnclassifiedAccountPeriodSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerAnalyticsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "loanAccountSummary",
    "loanAccountCurrentSummary",
    "loanAccountTwelveMonthsSummary",
    "loanAccountFortyEightMonthsSummary",
    "commercialCardAccountSummary",
    "commercialCardAccountCurrentSummary",
    "commercialCardAccountTwelveMonthsSummary",
    "commercialCardAccountFortyEightMonthsSummary",
    "leaseAccountSummary",
    "leaseAccountCurrentSummary",
    "leaseAccountTwelveMonthsSummary",
    "leaseAccountFortyEightMonthsSummary",
    "financialAccountSummary",
    "financialAccountCurrentSummary",
    "financialAccountThreeMonthsSummary",
    "financialAccountTwelveMonthsSummary",
    "financialAccountTwentyFourMonthsSummary",
    "financialAccountThirtySixMonthsSummary",
    "financialAccountFortyEightMonthsSummary",
    "revolvingAccountCurrentSummary",
    "revolvingAccountThreeMonthsSummary",
    "revolvingAccountTwelveMonthsSummary",
    "revolvingAccountTwentyFourMonthsSummary",
    "revolvingAccountFortyEightMonthsSummary",
    "installmentAccountCurrentSummary",
    "installmentAccountThreeMonthsSummary",
    "installmentAccountTwelveMonthsSummary",
    "installmentAccountTwentyFourMonthsSummary",
    "installmentAccountFortyEightMonthsSummary",
    "openEndedCreditLineAccountSummary",
    "openEndedCreditLineAccountCurrentSummary",
    "openEndedCreditLineAccountTwelveMonthsSummary",
    "openEndedCreditLineAccountFortyEightMonthsSummary",
    "lettersOfCreditAccountSummary",
    "lettersOfCreditAccountCurrentSummary",
    "lettersOfCreditAccountTwelveMonthsSummary",
    "lettersOfCreditAccountFortyEightMonthsSummary",
    "linesOfCreditAccountSummary",
    "linesOfCreditAccountCurrentSummary",
    "linesOfCreditAccountFortyEightMonthsSummary",
    "linesOfCreditAccountTwelveMonthsSummary",
    "unclassifiedAccountSummary",
    "unclassifiedAccountCurrentSummary",
    "unclassifiedAccountTwelveMonthsSummary",
    "unclassifiedAccountFortyEightMonthsSummary"
})
public class BorrowerAnalyticsType {

    @XmlElement(name = "LoanAccountSummary")
    protected LoanAccountSummaryDetailType loanAccountSummary;
    @XmlElement(name = "LoanAccountCurrentSummary")
    protected LoanAccountPeriodSummaryType loanAccountCurrentSummary;
    @XmlElement(name = "LoanAccountTwelveMonthsSummary")
    protected LoanAccountPeriodSummaryType loanAccountTwelveMonthsSummary;
    @XmlElement(name = "LoanAccountFortyEightMonthsSummary")
    protected LoanAccountPeriodSummaryType loanAccountFortyEightMonthsSummary;
    @XmlElement(name = "CommercialCardAccountSummary")
    protected CommercialCardAccountSummaryDetailType commercialCardAccountSummary;
    @XmlElement(name = "CommercialCardAccountCurrentSummary")
    protected CommercialCardAccountPeriodSummaryType commercialCardAccountCurrentSummary;
    @XmlElement(name = "CommercialCardAccountTwelveMonthsSummary")
    protected CommercialCardAccountPeriodSummaryType commercialCardAccountTwelveMonthsSummary;
    @XmlElement(name = "CommercialCardAccountFortyEightMonthsSummary")
    protected CommercialCardAccountPeriodSummaryType commercialCardAccountFortyEightMonthsSummary;
    @XmlElement(name = "LeaseAccountSummary")
    protected LeaseAccountSummaryDetailType leaseAccountSummary;
    @XmlElement(name = "LeaseAccountCurrentSummary")
    protected LeaseAccountPeriodSummaryType leaseAccountCurrentSummary;
    @XmlElement(name = "LeaseAccountTwelveMonthsSummary")
    protected LeaseAccountPeriodSummaryType leaseAccountTwelveMonthsSummary;
    @XmlElement(name = "LeaseAccountFortyEightMonthsSummary")
    protected LeaseAccountPeriodSummaryType leaseAccountFortyEightMonthsSummary;
    @XmlElement(name = "FinancialAccountSummary")
    protected FinancialAccountSummaryDetailType financialAccountSummary;
    @XmlElement(name = "FinancialAccountCurrentSummary")
    protected FinancialAccountPeriodSummaryType financialAccountCurrentSummary;
    @XmlElement(name = "FinancialAccountThreeMonthsSummary")
    protected FinancialAccountPeriodSummaryType financialAccountThreeMonthsSummary;
    @XmlElement(name = "FinancialAccountTwelveMonthsSummary")
    protected FinancialAccountPeriodSummaryType financialAccountTwelveMonthsSummary;
    @XmlElement(name = "FinancialAccountTwentyFourMonthsSummary")
    protected FinancialAccountPeriodSummaryType financialAccountTwentyFourMonthsSummary;
    @XmlElement(name = "FinancialAccountThirtySixMonthsSummary")
    protected FinancialAccountPeriodSummaryType financialAccountThirtySixMonthsSummary;
    @XmlElement(name = "FinancialAccountFortyEightMonthsSummary")
    protected FinancialAccountPeriodSummaryType financialAccountFortyEightMonthsSummary;
    @XmlElement(name = "RevolvingAccountCurrentSummary")
    protected RevolvingAccountPeriodSummaryType revolvingAccountCurrentSummary;
    @XmlElement(name = "RevolvingAccountThreeMonthsSummary")
    protected RevolvingAccountPeriodSummaryType revolvingAccountThreeMonthsSummary;
    @XmlElement(name = "RevolvingAccountTwelveMonthsSummary")
    protected RevolvingAccountPeriodSummaryType revolvingAccountTwelveMonthsSummary;
    @XmlElement(name = "RevolvingAccountTwentyFourMonthsSummary")
    protected RevolvingAccountPeriodSummaryType revolvingAccountTwentyFourMonthsSummary;
    @XmlElement(name = "RevolvingAccountFortyEightMonthsSummary")
    protected RevolvingAccountPeriodSummaryType revolvingAccountFortyEightMonthsSummary;
    @XmlElement(name = "InstallmentAccountCurrentSummary")
    protected InstallmentAccountPeriodSummaryType installmentAccountCurrentSummary;
    @XmlElement(name = "InstallmentAccountThreeMonthsSummary")
    protected InstallmentAccountPeriodSummaryType installmentAccountThreeMonthsSummary;
    @XmlElement(name = "InstallmentAccountTwelveMonthsSummary")
    protected InstallmentAccountPeriodSummaryType installmentAccountTwelveMonthsSummary;
    @XmlElement(name = "InstallmentAccountTwentyFourMonthsSummary")
    protected InstallmentAccountPeriodSummaryType installmentAccountTwentyFourMonthsSummary;
    @XmlElement(name = "InstallmentAccountFortyEightMonthsSummary")
    protected InstallmentAccountPeriodSummaryType installmentAccountFortyEightMonthsSummary;
    @XmlElement(name = "OpenEndedCreditLineAccountSummary")
    protected OpenEndedCreditLineAccountSummaryDetailType openEndedCreditLineAccountSummary;
    @XmlElement(name = "OpenEndedCreditLineAccountCurrentSummary")
    protected OpenEndedCreditLineAccountPeriodSummaryType openEndedCreditLineAccountCurrentSummary;
    @XmlElement(name = "OpenEndedCreditLineAccountTwelveMonthsSummary")
    protected OpenEndedCreditLineAccountPeriodSummaryType openEndedCreditLineAccountTwelveMonthsSummary;
    @XmlElement(name = "OpenEndedCreditLineAccountFortyEightMonthsSummary")
    protected OpenEndedCreditLineAccountPeriodSummaryType openEndedCreditLineAccountFortyEightMonthsSummary;
    @XmlElement(name = "LettersOfCreditAccountSummary")
    protected LettersOfCreditAccountSummaryDetailType lettersOfCreditAccountSummary;
    @XmlElement(name = "LettersOfCreditAccountCurrentSummary")
    protected LettersOfCreditAccountPeriodSummaryType lettersOfCreditAccountCurrentSummary;
    @XmlElement(name = "LettersOfCreditAccountTwelveMonthsSummary")
    protected LettersOfCreditAccountPeriodSummaryType lettersOfCreditAccountTwelveMonthsSummary;
    @XmlElement(name = "LettersOfCreditAccountFortyEightMonthsSummary")
    protected LettersOfCreditAccountPeriodSummaryType lettersOfCreditAccountFortyEightMonthsSummary;
    @XmlElement(name = "LinesOfCreditAccountSummary")
    protected LinesOfCreditAccountSummaryDetailType linesOfCreditAccountSummary;
    @XmlElement(name = "LinesOfCreditAccountCurrentSummary")
    protected LinesOfCreditAccountPeriodSummaryType linesOfCreditAccountCurrentSummary;
    @XmlElement(name = "LinesOfCreditAccountFortyEightMonthsSummary")
    protected LinesOfCreditAccountPeriodSummaryType linesOfCreditAccountFortyEightMonthsSummary;
    @XmlElement(name = "LinesOfCreditAccountTwelveMonthsSummary")
    protected LinesOfCreditAccountPeriodSummaryType linesOfCreditAccountTwelveMonthsSummary;
    @XmlElement(name = "UnclassifiedAccountSummary")
    protected UnclassifiedAccountSummaryDetailType unclassifiedAccountSummary;
    @XmlElement(name = "UnclassifiedAccountCurrentSummary")
    protected UnclassifiedAccountPeriodSummaryType unclassifiedAccountCurrentSummary;
    @XmlElement(name = "UnclassifiedAccountTwelveMonthsSummary")
    protected UnclassifiedAccountPeriodSummaryType unclassifiedAccountTwelveMonthsSummary;
    @XmlElement(name = "UnclassifiedAccountFortyEightMonthsSummary")
    protected UnclassifiedAccountPeriodSummaryType unclassifiedAccountFortyEightMonthsSummary;

    /**
     * Gets the value of the loanAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAccountSummaryDetailType }
     *     
     */
    public LoanAccountSummaryDetailType getLoanAccountSummary() {
        return loanAccountSummary;
    }

    /**
     * Sets the value of the loanAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAccountSummaryDetailType }
     *     
     */
    public void setLoanAccountSummary(LoanAccountSummaryDetailType value) {
        this.loanAccountSummary = value;
    }

    /**
     * Gets the value of the loanAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAccountPeriodSummaryType }
     *     
     */
    public LoanAccountPeriodSummaryType getLoanAccountCurrentSummary() {
        return loanAccountCurrentSummary;
    }

    /**
     * Sets the value of the loanAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAccountPeriodSummaryType }
     *     
     */
    public void setLoanAccountCurrentSummary(LoanAccountPeriodSummaryType value) {
        this.loanAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the loanAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAccountPeriodSummaryType }
     *     
     */
    public LoanAccountPeriodSummaryType getLoanAccountTwelveMonthsSummary() {
        return loanAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the loanAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAccountPeriodSummaryType }
     *     
     */
    public void setLoanAccountTwelveMonthsSummary(LoanAccountPeriodSummaryType value) {
        this.loanAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the loanAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAccountPeriodSummaryType }
     *     
     */
    public LoanAccountPeriodSummaryType getLoanAccountFortyEightMonthsSummary() {
        return loanAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the loanAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAccountPeriodSummaryType }
     *     
     */
    public void setLoanAccountFortyEightMonthsSummary(LoanAccountPeriodSummaryType value) {
        this.loanAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the commercialCardAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialCardAccountSummaryDetailType }
     *     
     */
    public CommercialCardAccountSummaryDetailType getCommercialCardAccountSummary() {
        return commercialCardAccountSummary;
    }

    /**
     * Sets the value of the commercialCardAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialCardAccountSummaryDetailType }
     *     
     */
    public void setCommercialCardAccountSummary(CommercialCardAccountSummaryDetailType value) {
        this.commercialCardAccountSummary = value;
    }

    /**
     * Gets the value of the commercialCardAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialCardAccountPeriodSummaryType }
     *     
     */
    public CommercialCardAccountPeriodSummaryType getCommercialCardAccountCurrentSummary() {
        return commercialCardAccountCurrentSummary;
    }

    /**
     * Sets the value of the commercialCardAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialCardAccountPeriodSummaryType }
     *     
     */
    public void setCommercialCardAccountCurrentSummary(CommercialCardAccountPeriodSummaryType value) {
        this.commercialCardAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the commercialCardAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialCardAccountPeriodSummaryType }
     *     
     */
    public CommercialCardAccountPeriodSummaryType getCommercialCardAccountTwelveMonthsSummary() {
        return commercialCardAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the commercialCardAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialCardAccountPeriodSummaryType }
     *     
     */
    public void setCommercialCardAccountTwelveMonthsSummary(CommercialCardAccountPeriodSummaryType value) {
        this.commercialCardAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the commercialCardAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialCardAccountPeriodSummaryType }
     *     
     */
    public CommercialCardAccountPeriodSummaryType getCommercialCardAccountFortyEightMonthsSummary() {
        return commercialCardAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the commercialCardAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialCardAccountPeriodSummaryType }
     *     
     */
    public void setCommercialCardAccountFortyEightMonthsSummary(CommercialCardAccountPeriodSummaryType value) {
        this.commercialCardAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the leaseAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseAccountSummaryDetailType }
     *     
     */
    public LeaseAccountSummaryDetailType getLeaseAccountSummary() {
        return leaseAccountSummary;
    }

    /**
     * Sets the value of the leaseAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseAccountSummaryDetailType }
     *     
     */
    public void setLeaseAccountSummary(LeaseAccountSummaryDetailType value) {
        this.leaseAccountSummary = value;
    }

    /**
     * Gets the value of the leaseAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseAccountPeriodSummaryType }
     *     
     */
    public LeaseAccountPeriodSummaryType getLeaseAccountCurrentSummary() {
        return leaseAccountCurrentSummary;
    }

    /**
     * Sets the value of the leaseAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseAccountPeriodSummaryType }
     *     
     */
    public void setLeaseAccountCurrentSummary(LeaseAccountPeriodSummaryType value) {
        this.leaseAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the leaseAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseAccountPeriodSummaryType }
     *     
     */
    public LeaseAccountPeriodSummaryType getLeaseAccountTwelveMonthsSummary() {
        return leaseAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the leaseAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseAccountPeriodSummaryType }
     *     
     */
    public void setLeaseAccountTwelveMonthsSummary(LeaseAccountPeriodSummaryType value) {
        this.leaseAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the leaseAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseAccountPeriodSummaryType }
     *     
     */
    public LeaseAccountPeriodSummaryType getLeaseAccountFortyEightMonthsSummary() {
        return leaseAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the leaseAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseAccountPeriodSummaryType }
     *     
     */
    public void setLeaseAccountFortyEightMonthsSummary(LeaseAccountPeriodSummaryType value) {
        this.leaseAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the financialAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountSummaryDetailType }
     *     
     */
    public FinancialAccountSummaryDetailType getFinancialAccountSummary() {
        return financialAccountSummary;
    }

    /**
     * Sets the value of the financialAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountSummaryDetailType }
     *     
     */
    public void setFinancialAccountSummary(FinancialAccountSummaryDetailType value) {
        this.financialAccountSummary = value;
    }

    /**
     * Gets the value of the financialAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public FinancialAccountPeriodSummaryType getFinancialAccountCurrentSummary() {
        return financialAccountCurrentSummary;
    }

    /**
     * Sets the value of the financialAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public void setFinancialAccountCurrentSummary(FinancialAccountPeriodSummaryType value) {
        this.financialAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the financialAccountThreeMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public FinancialAccountPeriodSummaryType getFinancialAccountThreeMonthsSummary() {
        return financialAccountThreeMonthsSummary;
    }

    /**
     * Sets the value of the financialAccountThreeMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public void setFinancialAccountThreeMonthsSummary(FinancialAccountPeriodSummaryType value) {
        this.financialAccountThreeMonthsSummary = value;
    }

    /**
     * Gets the value of the financialAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public FinancialAccountPeriodSummaryType getFinancialAccountTwelveMonthsSummary() {
        return financialAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the financialAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public void setFinancialAccountTwelveMonthsSummary(FinancialAccountPeriodSummaryType value) {
        this.financialAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the financialAccountTwentyFourMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public FinancialAccountPeriodSummaryType getFinancialAccountTwentyFourMonthsSummary() {
        return financialAccountTwentyFourMonthsSummary;
    }

    /**
     * Sets the value of the financialAccountTwentyFourMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public void setFinancialAccountTwentyFourMonthsSummary(FinancialAccountPeriodSummaryType value) {
        this.financialAccountTwentyFourMonthsSummary = value;
    }

    /**
     * Gets the value of the financialAccountThirtySixMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public FinancialAccountPeriodSummaryType getFinancialAccountThirtySixMonthsSummary() {
        return financialAccountThirtySixMonthsSummary;
    }

    /**
     * Sets the value of the financialAccountThirtySixMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public void setFinancialAccountThirtySixMonthsSummary(FinancialAccountPeriodSummaryType value) {
        this.financialAccountThirtySixMonthsSummary = value;
    }

    /**
     * Gets the value of the financialAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public FinancialAccountPeriodSummaryType getFinancialAccountFortyEightMonthsSummary() {
        return financialAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the financialAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountPeriodSummaryType }
     *     
     */
    public void setFinancialAccountFortyEightMonthsSummary(FinancialAccountPeriodSummaryType value) {
        this.financialAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the revolvingAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public RevolvingAccountPeriodSummaryType getRevolvingAccountCurrentSummary() {
        return revolvingAccountCurrentSummary;
    }

    /**
     * Sets the value of the revolvingAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public void setRevolvingAccountCurrentSummary(RevolvingAccountPeriodSummaryType value) {
        this.revolvingAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the revolvingAccountThreeMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public RevolvingAccountPeriodSummaryType getRevolvingAccountThreeMonthsSummary() {
        return revolvingAccountThreeMonthsSummary;
    }

    /**
     * Sets the value of the revolvingAccountThreeMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public void setRevolvingAccountThreeMonthsSummary(RevolvingAccountPeriodSummaryType value) {
        this.revolvingAccountThreeMonthsSummary = value;
    }

    /**
     * Gets the value of the revolvingAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public RevolvingAccountPeriodSummaryType getRevolvingAccountTwelveMonthsSummary() {
        return revolvingAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the revolvingAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public void setRevolvingAccountTwelveMonthsSummary(RevolvingAccountPeriodSummaryType value) {
        this.revolvingAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the revolvingAccountTwentyFourMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public RevolvingAccountPeriodSummaryType getRevolvingAccountTwentyFourMonthsSummary() {
        return revolvingAccountTwentyFourMonthsSummary;
    }

    /**
     * Sets the value of the revolvingAccountTwentyFourMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public void setRevolvingAccountTwentyFourMonthsSummary(RevolvingAccountPeriodSummaryType value) {
        this.revolvingAccountTwentyFourMonthsSummary = value;
    }

    /**
     * Gets the value of the revolvingAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public RevolvingAccountPeriodSummaryType getRevolvingAccountFortyEightMonthsSummary() {
        return revolvingAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the revolvingAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevolvingAccountPeriodSummaryType }
     *     
     */
    public void setRevolvingAccountFortyEightMonthsSummary(RevolvingAccountPeriodSummaryType value) {
        this.revolvingAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the installmentAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public InstallmentAccountPeriodSummaryType getInstallmentAccountCurrentSummary() {
        return installmentAccountCurrentSummary;
    }

    /**
     * Sets the value of the installmentAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public void setInstallmentAccountCurrentSummary(InstallmentAccountPeriodSummaryType value) {
        this.installmentAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the installmentAccountThreeMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public InstallmentAccountPeriodSummaryType getInstallmentAccountThreeMonthsSummary() {
        return installmentAccountThreeMonthsSummary;
    }

    /**
     * Sets the value of the installmentAccountThreeMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public void setInstallmentAccountThreeMonthsSummary(InstallmentAccountPeriodSummaryType value) {
        this.installmentAccountThreeMonthsSummary = value;
    }

    /**
     * Gets the value of the installmentAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public InstallmentAccountPeriodSummaryType getInstallmentAccountTwelveMonthsSummary() {
        return installmentAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the installmentAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public void setInstallmentAccountTwelveMonthsSummary(InstallmentAccountPeriodSummaryType value) {
        this.installmentAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the installmentAccountTwentyFourMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public InstallmentAccountPeriodSummaryType getInstallmentAccountTwentyFourMonthsSummary() {
        return installmentAccountTwentyFourMonthsSummary;
    }

    /**
     * Sets the value of the installmentAccountTwentyFourMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public void setInstallmentAccountTwentyFourMonthsSummary(InstallmentAccountPeriodSummaryType value) {
        this.installmentAccountTwentyFourMonthsSummary = value;
    }

    /**
     * Gets the value of the installmentAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public InstallmentAccountPeriodSummaryType getInstallmentAccountFortyEightMonthsSummary() {
        return installmentAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the installmentAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentAccountPeriodSummaryType }
     *     
     */
    public void setInstallmentAccountFortyEightMonthsSummary(InstallmentAccountPeriodSummaryType value) {
        this.installmentAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the openEndedCreditLineAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEndedCreditLineAccountSummaryDetailType }
     *     
     */
    public OpenEndedCreditLineAccountSummaryDetailType getOpenEndedCreditLineAccountSummary() {
        return openEndedCreditLineAccountSummary;
    }

    /**
     * Sets the value of the openEndedCreditLineAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEndedCreditLineAccountSummaryDetailType }
     *     
     */
    public void setOpenEndedCreditLineAccountSummary(OpenEndedCreditLineAccountSummaryDetailType value) {
        this.openEndedCreditLineAccountSummary = value;
    }

    /**
     * Gets the value of the openEndedCreditLineAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEndedCreditLineAccountPeriodSummaryType }
     *     
     */
    public OpenEndedCreditLineAccountPeriodSummaryType getOpenEndedCreditLineAccountCurrentSummary() {
        return openEndedCreditLineAccountCurrentSummary;
    }

    /**
     * Sets the value of the openEndedCreditLineAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEndedCreditLineAccountPeriodSummaryType }
     *     
     */
    public void setOpenEndedCreditLineAccountCurrentSummary(OpenEndedCreditLineAccountPeriodSummaryType value) {
        this.openEndedCreditLineAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the openEndedCreditLineAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEndedCreditLineAccountPeriodSummaryType }
     *     
     */
    public OpenEndedCreditLineAccountPeriodSummaryType getOpenEndedCreditLineAccountTwelveMonthsSummary() {
        return openEndedCreditLineAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the openEndedCreditLineAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEndedCreditLineAccountPeriodSummaryType }
     *     
     */
    public void setOpenEndedCreditLineAccountTwelveMonthsSummary(OpenEndedCreditLineAccountPeriodSummaryType value) {
        this.openEndedCreditLineAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the openEndedCreditLineAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEndedCreditLineAccountPeriodSummaryType }
     *     
     */
    public OpenEndedCreditLineAccountPeriodSummaryType getOpenEndedCreditLineAccountFortyEightMonthsSummary() {
        return openEndedCreditLineAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the openEndedCreditLineAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEndedCreditLineAccountPeriodSummaryType }
     *     
     */
    public void setOpenEndedCreditLineAccountFortyEightMonthsSummary(OpenEndedCreditLineAccountPeriodSummaryType value) {
        this.openEndedCreditLineAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the lettersOfCreditAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LettersOfCreditAccountSummaryDetailType }
     *     
     */
    public LettersOfCreditAccountSummaryDetailType getLettersOfCreditAccountSummary() {
        return lettersOfCreditAccountSummary;
    }

    /**
     * Sets the value of the lettersOfCreditAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersOfCreditAccountSummaryDetailType }
     *     
     */
    public void setLettersOfCreditAccountSummary(LettersOfCreditAccountSummaryDetailType value) {
        this.lettersOfCreditAccountSummary = value;
    }

    /**
     * Gets the value of the lettersOfCreditAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LettersOfCreditAccountPeriodSummaryType }
     *     
     */
    public LettersOfCreditAccountPeriodSummaryType getLettersOfCreditAccountCurrentSummary() {
        return lettersOfCreditAccountCurrentSummary;
    }

    /**
     * Sets the value of the lettersOfCreditAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersOfCreditAccountPeriodSummaryType }
     *     
     */
    public void setLettersOfCreditAccountCurrentSummary(LettersOfCreditAccountPeriodSummaryType value) {
        this.lettersOfCreditAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the lettersOfCreditAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LettersOfCreditAccountPeriodSummaryType }
     *     
     */
    public LettersOfCreditAccountPeriodSummaryType getLettersOfCreditAccountTwelveMonthsSummary() {
        return lettersOfCreditAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the lettersOfCreditAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersOfCreditAccountPeriodSummaryType }
     *     
     */
    public void setLettersOfCreditAccountTwelveMonthsSummary(LettersOfCreditAccountPeriodSummaryType value) {
        this.lettersOfCreditAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the lettersOfCreditAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LettersOfCreditAccountPeriodSummaryType }
     *     
     */
    public LettersOfCreditAccountPeriodSummaryType getLettersOfCreditAccountFortyEightMonthsSummary() {
        return lettersOfCreditAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the lettersOfCreditAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersOfCreditAccountPeriodSummaryType }
     *     
     */
    public void setLettersOfCreditAccountFortyEightMonthsSummary(LettersOfCreditAccountPeriodSummaryType value) {
        this.lettersOfCreditAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the linesOfCreditAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LinesOfCreditAccountSummaryDetailType }
     *     
     */
    public LinesOfCreditAccountSummaryDetailType getLinesOfCreditAccountSummary() {
        return linesOfCreditAccountSummary;
    }

    /**
     * Sets the value of the linesOfCreditAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesOfCreditAccountSummaryDetailType }
     *     
     */
    public void setLinesOfCreditAccountSummary(LinesOfCreditAccountSummaryDetailType value) {
        this.linesOfCreditAccountSummary = value;
    }

    /**
     * Gets the value of the linesOfCreditAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LinesOfCreditAccountPeriodSummaryType }
     *     
     */
    public LinesOfCreditAccountPeriodSummaryType getLinesOfCreditAccountCurrentSummary() {
        return linesOfCreditAccountCurrentSummary;
    }

    /**
     * Sets the value of the linesOfCreditAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesOfCreditAccountPeriodSummaryType }
     *     
     */
    public void setLinesOfCreditAccountCurrentSummary(LinesOfCreditAccountPeriodSummaryType value) {
        this.linesOfCreditAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the linesOfCreditAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LinesOfCreditAccountPeriodSummaryType }
     *     
     */
    public LinesOfCreditAccountPeriodSummaryType getLinesOfCreditAccountFortyEightMonthsSummary() {
        return linesOfCreditAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the linesOfCreditAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesOfCreditAccountPeriodSummaryType }
     *     
     */
    public void setLinesOfCreditAccountFortyEightMonthsSummary(LinesOfCreditAccountPeriodSummaryType value) {
        this.linesOfCreditAccountFortyEightMonthsSummary = value;
    }

    /**
     * Gets the value of the linesOfCreditAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LinesOfCreditAccountPeriodSummaryType }
     *     
     */
    public LinesOfCreditAccountPeriodSummaryType getLinesOfCreditAccountTwelveMonthsSummary() {
        return linesOfCreditAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the linesOfCreditAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesOfCreditAccountPeriodSummaryType }
     *     
     */
    public void setLinesOfCreditAccountTwelveMonthsSummary(LinesOfCreditAccountPeriodSummaryType value) {
        this.linesOfCreditAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the unclassifiedAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UnclassifiedAccountSummaryDetailType }
     *     
     */
    public UnclassifiedAccountSummaryDetailType getUnclassifiedAccountSummary() {
        return unclassifiedAccountSummary;
    }

    /**
     * Sets the value of the unclassifiedAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnclassifiedAccountSummaryDetailType }
     *     
     */
    public void setUnclassifiedAccountSummary(UnclassifiedAccountSummaryDetailType value) {
        this.unclassifiedAccountSummary = value;
    }

    /**
     * Gets the value of the unclassifiedAccountCurrentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UnclassifiedAccountPeriodSummaryType }
     *     
     */
    public UnclassifiedAccountPeriodSummaryType getUnclassifiedAccountCurrentSummary() {
        return unclassifiedAccountCurrentSummary;
    }

    /**
     * Sets the value of the unclassifiedAccountCurrentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnclassifiedAccountPeriodSummaryType }
     *     
     */
    public void setUnclassifiedAccountCurrentSummary(UnclassifiedAccountPeriodSummaryType value) {
        this.unclassifiedAccountCurrentSummary = value;
    }

    /**
     * Gets the value of the unclassifiedAccountTwelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UnclassifiedAccountPeriodSummaryType }
     *     
     */
    public UnclassifiedAccountPeriodSummaryType getUnclassifiedAccountTwelveMonthsSummary() {
        return unclassifiedAccountTwelveMonthsSummary;
    }

    /**
     * Sets the value of the unclassifiedAccountTwelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnclassifiedAccountPeriodSummaryType }
     *     
     */
    public void setUnclassifiedAccountTwelveMonthsSummary(UnclassifiedAccountPeriodSummaryType value) {
        this.unclassifiedAccountTwelveMonthsSummary = value;
    }

    /**
     * Gets the value of the unclassifiedAccountFortyEightMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UnclassifiedAccountPeriodSummaryType }
     *     
     */
    public UnclassifiedAccountPeriodSummaryType getUnclassifiedAccountFortyEightMonthsSummary() {
        return unclassifiedAccountFortyEightMonthsSummary;
    }

    /**
     * Sets the value of the unclassifiedAccountFortyEightMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnclassifiedAccountPeriodSummaryType }
     *     
     */
    public void setUnclassifiedAccountFortyEightMonthsSummary(UnclassifiedAccountPeriodSummaryType value) {
        this.unclassifiedAccountFortyEightMonthsSummary = value;
    }

}
