
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmallBusinessFinancialExchangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmallBusinessFinancialExchangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountHolderInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountHolderInformationType" minOccurs="0"/>
 *         &lt;element name="InquirySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InquirySummaryType" minOccurs="0"/>
 *         &lt;element name="AccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountSummaryDetailType" minOccurs="0"/>
 *         &lt;element name="AccountDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountDetailsSectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BorrowerAnalytics" type="{http://services.dnb.com/CustomProductServiceV2.0}BorrowerAnalyticsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmallBusinessFinancialExchangeType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "accountHolderInformation",
    "inquirySummary",
    "accountSummary",
    "accountDetails",
    "borrowerAnalytics"
})
public class SmallBusinessFinancialExchangeType {

    @XmlElement(name = "AccountHolderInformation")
    protected AccountHolderInformationType accountHolderInformation;
    @XmlElement(name = "InquirySummary")
    protected InquirySummaryType inquirySummary;
    @XmlElement(name = "AccountSummary")
    protected AccountSummaryDetailType accountSummary;
    @XmlElement(name = "AccountDetails")
    protected List<AccountDetailsSectionType> accountDetails;
    @XmlElement(name = "BorrowerAnalytics")
    protected BorrowerAnalyticsType borrowerAnalytics;

    /**
     * Gets the value of the accountHolderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHolderInformationType }
     *     
     */
    public AccountHolderInformationType getAccountHolderInformation() {
        return accountHolderInformation;
    }

    /**
     * Sets the value of the accountHolderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHolderInformationType }
     *     
     */
    public void setAccountHolderInformation(AccountHolderInformationType value) {
        this.accountHolderInformation = value;
    }

    /**
     * Gets the value of the inquirySummary property.
     * 
     * @return
     *     possible object is
     *     {@link InquirySummaryType }
     *     
     */
    public InquirySummaryType getInquirySummary() {
        return inquirySummary;
    }

    /**
     * Sets the value of the inquirySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquirySummaryType }
     *     
     */
    public void setInquirySummary(InquirySummaryType value) {
        this.inquirySummary = value;
    }

    /**
     * Gets the value of the accountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummaryDetailType }
     *     
     */
    public AccountSummaryDetailType getAccountSummary() {
        return accountSummary;
    }

    /**
     * Sets the value of the accountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummaryDetailType }
     *     
     */
    public void setAccountSummary(AccountSummaryDetailType value) {
        this.accountSummary = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDetailsSectionType }
     * 
     * 
     */
    public List<AccountDetailsSectionType> getAccountDetails() {
        if (accountDetails == null) {
            accountDetails = new ArrayList<AccountDetailsSectionType>();
        }
        return this.accountDetails;
    }

    /**
     * Gets the value of the borrowerAnalytics property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsType }
     *     
     */
    public BorrowerAnalyticsType getBorrowerAnalytics() {
        return borrowerAnalytics;
    }

    /**
     * Sets the value of the borrowerAnalytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsType }
     *     
     */
    public void setBorrowerAnalytics(BorrowerAnalyticsType value) {
        this.borrowerAnalytics = value;
    }

}
