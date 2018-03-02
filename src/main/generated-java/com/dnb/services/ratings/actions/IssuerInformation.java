
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records information about the Letter of Liability issuers who have taken responsibility for the liabilities of the subject company.
 *          
 * 
 * <p>Java class for IssuerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="DunsNumber" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SubscriberAddress" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SubjectAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerInformation", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "businessName",
    "dunsNumber",
    "filingDate",
    "subscriberAddress"
})
public class IssuerInformation {

    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "DunsNumber")
    protected String dunsNumber;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "SubscriberAddress")
    protected SubjectAddressType subscriberAddress;

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
     * Gets the value of the subscriberAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressType }
     *     
     */
    public SubjectAddressType getSubscriberAddress() {
        return subscriberAddress;
    }

    /**
     * Sets the value of the subscriberAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressType }
     *     
     */
    public void setSubscriberAddress(SubjectAddressType value) {
        this.subscriberAddress = value;
    }

}
