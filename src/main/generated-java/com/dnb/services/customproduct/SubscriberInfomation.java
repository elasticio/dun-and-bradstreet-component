
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberInfomation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberInfomation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="IssuerAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddressType" minOccurs="0"/>
 *         &lt;element name="MostRecentAgreementDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DunsNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="LetterofLiabilityWithdrawnDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberInfomation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "businessName",
    "filingDate",
    "issuerAddress",
    "mostRecentAgreementDate",
    "dunsNumber",
    "letterofLiabilityWithdrawnDate"
})
public class SubscriberInfomation {

    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "IssuerAddress")
    protected SubjectAddressType issuerAddress;
    @XmlElement(name = "MostRecentAgreementDate")
    protected DNBDateType mostRecentAgreementDate;
    @XmlElement(name = "DunsNumber")
    protected String dunsNumber;
    @XmlElement(name = "LetterofLiabilityWithdrawnDate")
    protected DNBDateType letterofLiabilityWithdrawnDate;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingDate(DNBDateType value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the issuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressType }
     *     
     */
    public SubjectAddressType getIssuerAddress() {
        return issuerAddress;
    }

    /**
     * Sets the value of the issuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressType }
     *     
     */
    public void setIssuerAddress(SubjectAddressType value) {
        this.issuerAddress = value;
    }

    /**
     * Gets the value of the mostRecentAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentAgreementDate() {
        return mostRecentAgreementDate;
    }

    /**
     * Sets the value of the mostRecentAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentAgreementDate(DNBDateType value) {
        this.mostRecentAgreementDate = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunsNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunsNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the letterofLiabilityWithdrawnDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLetterofLiabilityWithdrawnDate() {
        return letterofLiabilityWithdrawnDate;
    }

    /**
     * Sets the value of the letterofLiabilityWithdrawnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLetterofLiabilityWithdrawnDate(DNBDateType value) {
        this.letterofLiabilityWithdrawnDate = value;
    }

}
