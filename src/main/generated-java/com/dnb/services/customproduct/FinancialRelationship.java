
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanAccountDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LeaseAccountDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineOfCreditAccountDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditCardAccountDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoanAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountSummaryType" minOccurs="0"/>
 *         &lt;element name="LeaseAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountSummaryType" minOccurs="0"/>
 *         &lt;element name="LineOfCreditAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountSummaryType" minOccurs="0"/>
 *         &lt;element name="CreditCardAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountSummaryType" minOccurs="0"/>
 *         &lt;element name="LoanPayment" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountPayment" minOccurs="0"/>
 *         &lt;element name="LeasePayment" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountPayment" minOccurs="0"/>
 *         &lt;element name="LineOfCreditPayment" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountPayment" minOccurs="0"/>
 *         &lt;element name="CreditCardPayment" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountPayment" minOccurs="0"/>
 *         &lt;element name="OverallCurrentPaymentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}OverallSummary" minOccurs="0"/>
 *         &lt;element name="OverallPaymentHistorySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}OverallPaymentHistorySummary" minOccurs="0"/>
 *         &lt;element name="GuaranteeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}GuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MiscellaneousDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}MiscellaneousDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRelationship", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "loanAccountDetail",
    "leaseAccountDetail",
    "lineOfCreditAccountDetail",
    "creditCardAccountDetail",
    "loanAccountSummary",
    "leaseAccountSummary",
    "lineOfCreditAccountSummary",
    "creditCardAccountSummary",
    "loanPayment",
    "leasePayment",
    "lineOfCreditPayment",
    "creditCardPayment",
    "overallCurrentPaymentSummary",
    "overallPaymentHistorySummary",
    "guaranteeDetails",
    "miscellaneousDetails"
})
public class FinancialRelationship {

    @XmlElement(name = "LoanAccountDetail")
    protected List<AccountDetail> loanAccountDetail;
    @XmlElement(name = "LeaseAccountDetail")
    protected List<AccountDetail> leaseAccountDetail;
    @XmlElement(name = "LineOfCreditAccountDetail")
    protected List<AccountDetail> lineOfCreditAccountDetail;
    @XmlElement(name = "CreditCardAccountDetail")
    protected List<AccountDetail> creditCardAccountDetail;
    @XmlElement(name = "LoanAccountSummary")
    protected AccountSummaryType loanAccountSummary;
    @XmlElement(name = "LeaseAccountSummary")
    protected AccountSummaryType leaseAccountSummary;
    @XmlElement(name = "LineOfCreditAccountSummary")
    protected AccountSummaryType lineOfCreditAccountSummary;
    @XmlElement(name = "CreditCardAccountSummary")
    protected AccountSummaryType creditCardAccountSummary;
    @XmlElement(name = "LoanPayment")
    protected AccountPayment loanPayment;
    @XmlElement(name = "LeasePayment")
    protected AccountPayment leasePayment;
    @XmlElement(name = "LineOfCreditPayment")
    protected AccountPayment lineOfCreditPayment;
    @XmlElement(name = "CreditCardPayment")
    protected AccountPayment creditCardPayment;
    @XmlElement(name = "OverallCurrentPaymentSummary")
    protected OverallSummary overallCurrentPaymentSummary;
    @XmlElement(name = "OverallPaymentHistorySummary")
    protected OverallPaymentHistorySummary overallPaymentHistorySummary;
    @XmlElement(name = "GuaranteeDetails")
    protected List<GuaranteeDetails> guaranteeDetails;
    @XmlElement(name = "MiscellaneousDetails")
    protected List<MiscellaneousDetails> miscellaneousDetails;

    /**
     * Gets the value of the loanAccountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanAccountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanAccountDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDetail }
     * 
     * 
     */
    public List<AccountDetail> getLoanAccountDetail() {
        if (loanAccountDetail == null) {
            loanAccountDetail = new ArrayList<AccountDetail>();
        }
        return this.loanAccountDetail;
    }

    /**
     * Gets the value of the leaseAccountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaseAccountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaseAccountDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDetail }
     * 
     * 
     */
    public List<AccountDetail> getLeaseAccountDetail() {
        if (leaseAccountDetail == null) {
            leaseAccountDetail = new ArrayList<AccountDetail>();
        }
        return this.leaseAccountDetail;
    }

    /**
     * Gets the value of the lineOfCreditAccountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOfCreditAccountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOfCreditAccountDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDetail }
     * 
     * 
     */
    public List<AccountDetail> getLineOfCreditAccountDetail() {
        if (lineOfCreditAccountDetail == null) {
            lineOfCreditAccountDetail = new ArrayList<AccountDetail>();
        }
        return this.lineOfCreditAccountDetail;
    }

    /**
     * Gets the value of the creditCardAccountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardAccountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardAccountDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDetail }
     * 
     * 
     */
    public List<AccountDetail> getCreditCardAccountDetail() {
        if (creditCardAccountDetail == null) {
            creditCardAccountDetail = new ArrayList<AccountDetail>();
        }
        return this.creditCardAccountDetail;
    }

    /**
     * Gets the value of the loanAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummaryType }
     *     
     */
    public AccountSummaryType getLoanAccountSummary() {
        return loanAccountSummary;
    }

    /**
     * Sets the value of the loanAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummaryType }
     *     
     */
    public void setLoanAccountSummary(AccountSummaryType value) {
        this.loanAccountSummary = value;
    }

    /**
     * Gets the value of the leaseAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummaryType }
     *     
     */
    public AccountSummaryType getLeaseAccountSummary() {
        return leaseAccountSummary;
    }

    /**
     * Sets the value of the leaseAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummaryType }
     *     
     */
    public void setLeaseAccountSummary(AccountSummaryType value) {
        this.leaseAccountSummary = value;
    }

    /**
     * Gets the value of the lineOfCreditAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummaryType }
     *     
     */
    public AccountSummaryType getLineOfCreditAccountSummary() {
        return lineOfCreditAccountSummary;
    }

    /**
     * Sets the value of the lineOfCreditAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummaryType }
     *     
     */
    public void setLineOfCreditAccountSummary(AccountSummaryType value) {
        this.lineOfCreditAccountSummary = value;
    }

    /**
     * Gets the value of the creditCardAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummaryType }
     *     
     */
    public AccountSummaryType getCreditCardAccountSummary() {
        return creditCardAccountSummary;
    }

    /**
     * Sets the value of the creditCardAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummaryType }
     *     
     */
    public void setCreditCardAccountSummary(AccountSummaryType value) {
        this.creditCardAccountSummary = value;
    }

    /**
     * Gets the value of the loanPayment property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPayment }
     *     
     */
    public AccountPayment getLoanPayment() {
        return loanPayment;
    }

    /**
     * Sets the value of the loanPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPayment }
     *     
     */
    public void setLoanPayment(AccountPayment value) {
        this.loanPayment = value;
    }

    /**
     * Gets the value of the leasePayment property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPayment }
     *     
     */
    public AccountPayment getLeasePayment() {
        return leasePayment;
    }

    /**
     * Sets the value of the leasePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPayment }
     *     
     */
    public void setLeasePayment(AccountPayment value) {
        this.leasePayment = value;
    }

    /**
     * Gets the value of the lineOfCreditPayment property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPayment }
     *     
     */
    public AccountPayment getLineOfCreditPayment() {
        return lineOfCreditPayment;
    }

    /**
     * Sets the value of the lineOfCreditPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPayment }
     *     
     */
    public void setLineOfCreditPayment(AccountPayment value) {
        this.lineOfCreditPayment = value;
    }

    /**
     * Gets the value of the creditCardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPayment }
     *     
     */
    public AccountPayment getCreditCardPayment() {
        return creditCardPayment;
    }

    /**
     * Sets the value of the creditCardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPayment }
     *     
     */
    public void setCreditCardPayment(AccountPayment value) {
        this.creditCardPayment = value;
    }

    /**
     * Gets the value of the overallCurrentPaymentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OverallSummary }
     *     
     */
    public OverallSummary getOverallCurrentPaymentSummary() {
        return overallCurrentPaymentSummary;
    }

    /**
     * Sets the value of the overallCurrentPaymentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallSummary }
     *     
     */
    public void setOverallCurrentPaymentSummary(OverallSummary value) {
        this.overallCurrentPaymentSummary = value;
    }

    /**
     * Gets the value of the overallPaymentHistorySummary property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPaymentHistorySummary }
     *     
     */
    public OverallPaymentHistorySummary getOverallPaymentHistorySummary() {
        return overallPaymentHistorySummary;
    }

    /**
     * Sets the value of the overallPaymentHistorySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPaymentHistorySummary }
     *     
     */
    public void setOverallPaymentHistorySummary(OverallPaymentHistorySummary value) {
        this.overallPaymentHistorySummary = value;
    }

    /**
     * Gets the value of the guaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeDetails }
     * 
     * 
     */
    public List<GuaranteeDetails> getGuaranteeDetails() {
        if (guaranteeDetails == null) {
            guaranteeDetails = new ArrayList<GuaranteeDetails>();
        }
        return this.guaranteeDetails;
    }

    /**
     * Gets the value of the miscellaneousDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscellaneousDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscellaneousDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscellaneousDetails }
     * 
     * 
     */
    public List<MiscellaneousDetails> getMiscellaneousDetails() {
        if (miscellaneousDetails == null) {
            miscellaneousDetails = new ArrayList<MiscellaneousDetails>();
        }
        return this.miscellaneousDetails;
    }

}
