
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An aggregate which records derived data that is useful in evaluating the risk posed by a Borrower. Additionally, some of this data is used to dynamically calculate D&B-developed scores that assess risk.
 *          
 * 
 * <p>Java class for BorrowerAnalytics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorrowerAnalytics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BorrowerAnalyticsSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsOverallSummary" minOccurs="0"/>
 *         &lt;element name="BorrowerAnalyticsCycleSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoanAccountSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsAccountSummary" minOccurs="0"/>
 *         &lt;element name="LeaseAccountSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsAccountSummary" minOccurs="0"/>
 *         &lt;element name="CreditCardAccountSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsAccountSummary" minOccurs="0"/>
 *         &lt;element name="CreditLineAccountSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsAccountSummary" minOccurs="0"/>
 *         &lt;element name="BorrowerAnalyticsAccountSummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalyticsAccountSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerAnalytics", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "borrowerAnalyticsSummary",
    "borrowerAnalyticsCycleSummary",
    "loanAccountSummary",
    "leaseAccountSummary",
    "creditCardAccountSummary",
    "creditLineAccountSummary",
    "borrowerAnalyticsAccountSummary"
})
public class BorrowerAnalytics {

    @XmlElement(name = "BorrowerAnalyticsSummary")
    protected BorrowerAnalyticsOverallSummary borrowerAnalyticsSummary;
    @XmlElement(name = "BorrowerAnalyticsCycleSummary")
    protected List<BorrowerAnalyticsCycleSummary> borrowerAnalyticsCycleSummary;
    @XmlElement(name = "LoanAccountSummary")
    protected BorrowerAnalyticsAccountSummary loanAccountSummary;
    @XmlElement(name = "LeaseAccountSummary")
    protected BorrowerAnalyticsAccountSummary leaseAccountSummary;
    @XmlElement(name = "CreditCardAccountSummary")
    protected BorrowerAnalyticsAccountSummary creditCardAccountSummary;
    @XmlElement(name = "CreditLineAccountSummary")
    protected BorrowerAnalyticsAccountSummary creditLineAccountSummary;
    @XmlElement(name = "BorrowerAnalyticsAccountSummary")
    protected BorrowerAnalyticsAccountSummary borrowerAnalyticsAccountSummary;

    /**
     * Gets the value of the borrowerAnalyticsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsOverallSummary }
     *     
     */
    public BorrowerAnalyticsOverallSummary getBorrowerAnalyticsSummary() {
        return borrowerAnalyticsSummary;
    }

    /**
     * Sets the value of the borrowerAnalyticsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsOverallSummary }
     *     
     */
    public void setBorrowerAnalyticsSummary(BorrowerAnalyticsOverallSummary value) {
        this.borrowerAnalyticsSummary = value;
    }

    /**
     * Gets the value of the borrowerAnalyticsCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrowerAnalyticsCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowerAnalyticsCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorrowerAnalyticsCycleSummary }
     * 
     * 
     */
    public List<BorrowerAnalyticsCycleSummary> getBorrowerAnalyticsCycleSummary() {
        if (borrowerAnalyticsCycleSummary == null) {
            borrowerAnalyticsCycleSummary = new ArrayList<BorrowerAnalyticsCycleSummary>();
        }
        return this.borrowerAnalyticsCycleSummary;
    }

    /**
     * Gets the value of the loanAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public BorrowerAnalyticsAccountSummary getLoanAccountSummary() {
        return loanAccountSummary;
    }

    /**
     * Sets the value of the loanAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public void setLoanAccountSummary(BorrowerAnalyticsAccountSummary value) {
        this.loanAccountSummary = value;
    }

    /**
     * Gets the value of the leaseAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public BorrowerAnalyticsAccountSummary getLeaseAccountSummary() {
        return leaseAccountSummary;
    }

    /**
     * Sets the value of the leaseAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public void setLeaseAccountSummary(BorrowerAnalyticsAccountSummary value) {
        this.leaseAccountSummary = value;
    }

    /**
     * Gets the value of the creditCardAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public BorrowerAnalyticsAccountSummary getCreditCardAccountSummary() {
        return creditCardAccountSummary;
    }

    /**
     * Sets the value of the creditCardAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public void setCreditCardAccountSummary(BorrowerAnalyticsAccountSummary value) {
        this.creditCardAccountSummary = value;
    }

    /**
     * Gets the value of the creditLineAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public BorrowerAnalyticsAccountSummary getCreditLineAccountSummary() {
        return creditLineAccountSummary;
    }

    /**
     * Sets the value of the creditLineAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public void setCreditLineAccountSummary(BorrowerAnalyticsAccountSummary value) {
        this.creditLineAccountSummary = value;
    }

    /**
     * Gets the value of the borrowerAnalyticsAccountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public BorrowerAnalyticsAccountSummary getBorrowerAnalyticsAccountSummary() {
        return borrowerAnalyticsAccountSummary;
    }

    /**
     * Sets the value of the borrowerAnalyticsAccountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalyticsAccountSummary }
     *     
     */
    public void setBorrowerAnalyticsAccountSummary(BorrowerAnalyticsAccountSummary value) {
        this.borrowerAnalyticsAccountSummary = value;
    }

}
