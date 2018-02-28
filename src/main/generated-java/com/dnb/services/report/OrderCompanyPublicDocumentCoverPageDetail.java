
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the cover page details from the customer to use in the public document image fabrication.
 *          
 * 
 * <p>Java class for OrderCompanyPublicDocumentCoverPageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCompanyPublicDocumentCoverPageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/ReportProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/ReportProductServiceV2.0}OrganizationPrimaryNameType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/ReportProductServiceV2.0}BaseAddressType" minOccurs="0"/>
 *         &lt;element name="UserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomerReferenceText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCompanyPublicDocumentCoverPageDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationPrimaryName",
    "primaryAddress",
    "userName",
    "customerReferenceText"
})
public class OrderCompanyPublicDocumentCoverPageDetail {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "OrganizationPrimaryName")
    protected OrganizationPrimaryNameType organizationPrimaryName;
    @XmlElement(name = "PrimaryAddress")
    protected BaseAddressType primaryAddress;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "CustomerReferenceText")
    protected String customerReferenceText;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
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
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public OrganizationPrimaryNameType getOrganizationPrimaryName() {
        return organizationPrimaryName;
    }

    /**
     * Sets the value of the organizationPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public void setOrganizationPrimaryName(OrganizationPrimaryNameType value) {
        this.organizationPrimaryName = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAddressType }
     *     
     */
    public BaseAddressType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAddressType }
     *     
     */
    public void setPrimaryAddress(BaseAddressType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the customerReferenceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceText() {
        return customerReferenceText;
    }

    /**
     * Sets the value of the customerReferenceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReferenceText(String value) {
        this.customerReferenceText = value;
    }

}
