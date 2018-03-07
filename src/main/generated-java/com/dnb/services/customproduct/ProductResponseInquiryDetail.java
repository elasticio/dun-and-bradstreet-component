
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductResponseInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductResponseInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberSimpleType" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeBranchesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DivisionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DivisionDetail" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/CustomProductServiceV2.0}RequestAddress" minOccurs="0"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationRegisteredName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationRegisteredNameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductResponseInquiryDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsNumber",
    "subjectID",
    "countryISOAlpha2Code",
    "organizationIdentificationNumberDetail",
    "principalIdentificationNumberDetail",
    "excludeBranchesIndicator",
    "divisionDetail",
    "location",
    "organizationPrimaryName",
    "organizationRegisteredName"
})
public class ProductResponseInquiryDetail {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectID")
    protected String subjectID;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected OrganizationIdentificationNumberSimpleType organizationIdentificationNumberDetail;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected List<PrincipalIdentificationNumberType> principalIdentificationNumberDetail;
    @XmlElement(name = "ExcludeBranchesIndicator")
    protected Boolean excludeBranchesIndicator;
    @XmlElement(name = "DivisionDetail")
    protected DivisionDetail divisionDetail;
    @XmlElement(name = "Location")
    protected RequestAddress location;
    @XmlElement(name = "OrganizationPrimaryName")
    protected List<OrganizationPrimaryNameType> organizationPrimaryName;
    @XmlElement(name = "OrganizationRegisteredName")
    protected List<OrganizationRegisteredNameType> organizationRegisteredName;

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
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectID(String value) {
        this.subjectID = value;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberSimpleType }
     *     
     */
    public OrganizationIdentificationNumberSimpleType getOrganizationIdentificationNumberDetail() {
        return organizationIdentificationNumberDetail;
    }

    /**
     * Sets the value of the organizationIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberSimpleType }
     *     
     */
    public void setOrganizationIdentificationNumberDetail(OrganizationIdentificationNumberSimpleType value) {
        this.organizationIdentificationNumberDetail = value;
    }

    /**
     * Gets the value of the principalIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalIdentificationNumberType }
     * 
     * 
     */
    public List<PrincipalIdentificationNumberType> getPrincipalIdentificationNumberDetail() {
        if (principalIdentificationNumberDetail == null) {
            principalIdentificationNumberDetail = new ArrayList<PrincipalIdentificationNumberType>();
        }
        return this.principalIdentificationNumberDetail;
    }

    /**
     * Gets the value of the excludeBranchesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeBranchesIndicator() {
        return excludeBranchesIndicator;
    }

    /**
     * Sets the value of the excludeBranchesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBranchesIndicator(Boolean value) {
        this.excludeBranchesIndicator = value;
    }

    /**
     * Gets the value of the divisionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionDetail }
     *     
     */
    public DivisionDetail getDivisionDetail() {
        return divisionDetail;
    }

    /**
     * Sets the value of the divisionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionDetail }
     *     
     */
    public void setDivisionDetail(DivisionDetail value) {
        this.divisionDetail = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAddress }
     *     
     */
    public RequestAddress getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAddress }
     *     
     */
    public void setLocation(RequestAddress value) {
        this.location = value;
    }

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationPrimaryNameType }
     * 
     * 
     */
    public List<OrganizationPrimaryNameType> getOrganizationPrimaryName() {
        if (organizationPrimaryName == null) {
            organizationPrimaryName = new ArrayList<OrganizationPrimaryNameType>();
        }
        return this.organizationPrimaryName;
    }

    /**
     * Gets the value of the organizationRegisteredName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRegisteredName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationRegisteredName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationRegisteredNameType }
     * 
     * 
     */
    public List<OrganizationRegisteredNameType> getOrganizationRegisteredName() {
        if (organizationRegisteredName == null) {
            organizationRegisteredName = new ArrayList<OrganizationRegisteredNameType>();
        }
        return this.organizationRegisteredName;
    }

}
