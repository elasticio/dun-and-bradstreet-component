
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchContactResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchContactResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="ContactID" type="{http://services.dnb.com/EntityListServiceV2.0}TypeTextStringType" minOccurs="0"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationPrimaryNameType" minOccurs="0"/>
 *         &lt;element name="TradeStyleName" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetails" type="{http://services.dnb.com/EntityListServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="MarketabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NonMarketableReasonText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://services.dnb.com/EntityListServiceV2.0}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/EntityListServiceV2.0}PrincipalIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/EntityListServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ManagementResponsibilityCodeText" type="{http://services.dnb.com/EntityListServiceV2.0}ManagementResponsibilityCodeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobFunction" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobRanking" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContactDataSourceDetail" type="{http://services.dnb.com/EntityListServiceV2.0}ConnectMailDetail" minOccurs="0"/>
 *         &lt;element name="DirectTelephoneInformationAvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DirectEmailInformationAvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManufacturingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
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
@XmlType(name = "SearchContactResult", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "dunsNumber",
    "contactID",
    "organizationPrimaryName",
    "tradeStyleName",
    "consolidatedEmployeeDetails",
    "marketabilityIndicator",
    "nonMarketableReasonText",
    "contactName",
    "principalIdentificationNumberDetail",
    "jobTitle",
    "managementResponsibilityCodeText",
    "jobFunction",
    "jobRanking",
    "contactDataSourceDetail",
    "directTelephoneInformationAvailableIndicator",
    "directEmailInformationAvailableIndicator",
    "manufacturingIndicator",
    "displaySequence"
})
public class SearchContactResult {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "ContactID")
    protected TypeTextStringType contactID;
    @XmlElement(name = "OrganizationPrimaryName")
    protected OrganizationPrimaryNameType organizationPrimaryName;
    @XmlElement(name = "TradeStyleName")
    protected List<OrganizationNameBaseType> tradeStyleName;
    @XmlElement(name = "ConsolidatedEmployeeDetails")
    protected EmployeeDetailsType consolidatedEmployeeDetails;
    @XmlElement(name = "MarketabilityIndicator")
    protected Boolean marketabilityIndicator;
    @XmlElement(name = "NonMarketableReasonText")
    protected List<DNBDecodedStringType> nonMarketableReasonText;
    @XmlElement(name = "ContactName")
    protected IndividualNameType contactName;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected List<PrincipalIdentificationNumberType> principalIdentificationNumberDetail;
    @XmlElement(name = "JobTitle")
    protected List<JobTitle> jobTitle;
    @XmlElement(name = "ManagementResponsibilityCodeText")
    protected List<ManagementResponsibilityCodeTextType> managementResponsibilityCodeText;
    @XmlElement(name = "JobFunction")
    protected List<String> jobFunction;
    @XmlElement(name = "JobRanking")
    protected Integer jobRanking;
    @XmlElement(name = "ContactDataSourceDetail")
    protected ConnectMailDetail contactDataSourceDetail;
    @XmlElement(name = "DirectTelephoneInformationAvailableIndicator")
    protected Boolean directTelephoneInformationAvailableIndicator;
    @XmlElement(name = "DirectEmailInformationAvailableIndicator")
    protected Boolean directEmailInformationAvailableIndicator;
    @XmlElement(name = "ManufacturingIndicator")
    protected Boolean manufacturingIndicator;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

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
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTextStringType }
     *     
     */
    public TypeTextStringType getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTextStringType }
     *     
     */
    public void setContactID(TypeTextStringType value) {
        this.contactID = value;
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
     * Gets the value of the tradeStyleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeStyleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeStyleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getTradeStyleName() {
        if (tradeStyleName == null) {
            tradeStyleName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.tradeStyleName;
    }

    /**
     * Gets the value of the consolidatedEmployeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public EmployeeDetailsType getConsolidatedEmployeeDetails() {
        return consolidatedEmployeeDetails;
    }

    /**
     * Sets the value of the consolidatedEmployeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public void setConsolidatedEmployeeDetails(EmployeeDetailsType value) {
        this.consolidatedEmployeeDetails = value;
    }

    /**
     * Gets the value of the marketabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketabilityIndicator() {
        return marketabilityIndicator;
    }

    /**
     * Sets the value of the marketabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketabilityIndicator(Boolean value) {
        this.marketabilityIndicator = value;
    }

    /**
     * Gets the value of the nonMarketableReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonMarketableReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonMarketableReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getNonMarketableReasonText() {
        if (nonMarketableReasonText == null) {
            nonMarketableReasonText = new ArrayList<DNBDecodedStringType>();
        }
        return this.nonMarketableReasonText;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setContactName(IndividualNameType value) {
        this.contactName = value;
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
     * Gets the value of the jobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobTitle }
     * 
     * 
     */
    public List<JobTitle> getJobTitle() {
        if (jobTitle == null) {
            jobTitle = new ArrayList<JobTitle>();
        }
        return this.jobTitle;
    }

    /**
     * Gets the value of the managementResponsibilityCodeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementResponsibilityCodeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementResponsibilityCodeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagementResponsibilityCodeTextType }
     * 
     * 
     */
    public List<ManagementResponsibilityCodeTextType> getManagementResponsibilityCodeText() {
        if (managementResponsibilityCodeText == null) {
            managementResponsibilityCodeText = new ArrayList<ManagementResponsibilityCodeTextType>();
        }
        return this.managementResponsibilityCodeText;
    }

    /**
     * Gets the value of the jobFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobFunction() {
        if (jobFunction == null) {
            jobFunction = new ArrayList<String>();
        }
        return this.jobFunction;
    }

    /**
     * Gets the value of the jobRanking property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobRanking() {
        return jobRanking;
    }

    /**
     * Sets the value of the jobRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobRanking(Integer value) {
        this.jobRanking = value;
    }

    /**
     * Gets the value of the contactDataSourceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectMailDetail }
     *     
     */
    public ConnectMailDetail getContactDataSourceDetail() {
        return contactDataSourceDetail;
    }

    /**
     * Sets the value of the contactDataSourceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectMailDetail }
     *     
     */
    public void setContactDataSourceDetail(ConnectMailDetail value) {
        this.contactDataSourceDetail = value;
    }

    /**
     * Gets the value of the directTelephoneInformationAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectTelephoneInformationAvailableIndicator() {
        return directTelephoneInformationAvailableIndicator;
    }

    /**
     * Sets the value of the directTelephoneInformationAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectTelephoneInformationAvailableIndicator(Boolean value) {
        this.directTelephoneInformationAvailableIndicator = value;
    }

    /**
     * Gets the value of the directEmailInformationAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectEmailInformationAvailableIndicator() {
        return directEmailInformationAvailableIndicator;
    }

    /**
     * Sets the value of the directEmailInformationAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectEmailInformationAvailableIndicator(Boolean value) {
        this.directEmailInformationAvailableIndicator = value;
    }

    /**
     * Gets the value of the manufacturingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManufacturingIndicator() {
        return manufacturingIndicator;
    }

    /**
     * Sets the value of the manufacturingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManufacturingIndicator(Boolean value) {
        this.manufacturingIndicator = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
