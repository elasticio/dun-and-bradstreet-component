
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankExperienceSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankExperienceSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnfavorableExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoanAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecuredLoanAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecuredUnsecuredLoanAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnsecuredLoanAccountsTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankExperienceSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "experiencesTotalCount",
    "slowPaymentsCount",
    "unfavorableExperiencesTotalCount",
    "loanAccountsTotalCount",
    "securedLoanAccountsTotalCount",
    "securedUnsecuredLoanAccountsTotalCount",
    "unsecuredLoanAccountsTotalCount"
})
public class BankExperienceSummary {

    @XmlElement(name = "ExperiencesTotalCount")
    protected Integer experiencesTotalCount;
    @XmlElement(name = "SlowPaymentsCount")
    protected Integer slowPaymentsCount;
    @XmlElement(name = "UnfavorableExperiencesTotalCount")
    protected Integer unfavorableExperiencesTotalCount;
    @XmlElement(name = "LoanAccountsTotalCount")
    protected Integer loanAccountsTotalCount;
    @XmlElement(name = "SecuredLoanAccountsTotalCount")
    protected Integer securedLoanAccountsTotalCount;
    @XmlElement(name = "SecuredUnsecuredLoanAccountsTotalCount")
    protected Integer securedUnsecuredLoanAccountsTotalCount;
    @XmlElement(name = "UnsecuredLoanAccountsTotalCount")
    protected Integer unsecuredLoanAccountsTotalCount;

    /**
     * Gets the value of the experiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperiencesTotalCount() {
        return experiencesTotalCount;
    }

    /**
     * Sets the value of the experiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperiencesTotalCount(Integer value) {
        this.experiencesTotalCount = value;
    }

    /**
     * Gets the value of the slowPaymentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowPaymentsCount() {
        return slowPaymentsCount;
    }

    /**
     * Sets the value of the slowPaymentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowPaymentsCount(Integer value) {
        this.slowPaymentsCount = value;
    }

    /**
     * Gets the value of the unfavorableExperiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnfavorableExperiencesTotalCount() {
        return unfavorableExperiencesTotalCount;
    }

    /**
     * Sets the value of the unfavorableExperiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnfavorableExperiencesTotalCount(Integer value) {
        this.unfavorableExperiencesTotalCount = value;
    }

    /**
     * Gets the value of the loanAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanAccountsTotalCount() {
        return loanAccountsTotalCount;
    }

    /**
     * Sets the value of the loanAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanAccountsTotalCount(Integer value) {
        this.loanAccountsTotalCount = value;
    }

    /**
     * Gets the value of the securedLoanAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecuredLoanAccountsTotalCount() {
        return securedLoanAccountsTotalCount;
    }

    /**
     * Sets the value of the securedLoanAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecuredLoanAccountsTotalCount(Integer value) {
        this.securedLoanAccountsTotalCount = value;
    }

    /**
     * Gets the value of the securedUnsecuredLoanAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecuredUnsecuredLoanAccountsTotalCount() {
        return securedUnsecuredLoanAccountsTotalCount;
    }

    /**
     * Sets the value of the securedUnsecuredLoanAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecuredUnsecuredLoanAccountsTotalCount(Integer value) {
        this.securedUnsecuredLoanAccountsTotalCount = value;
    }

    /**
     * Gets the value of the unsecuredLoanAccountsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsecuredLoanAccountsTotalCount() {
        return unsecuredLoanAccountsTotalCount;
    }

    /**
     * Sets the value of the unsecuredLoanAccountsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsecuredLoanAccountsTotalCount(Integer value) {
        this.unsecuredLoanAccountsTotalCount = value;
    }

}
