
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of information regarding the filing details of the document.
 *          
 * 
 * <p>Java class for DocumentFilingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentFilingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingStatusDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingStatusDetail" minOccurs="0"/>
 *         &lt;element name="FilingRolePlayerDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingRolePlayerDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncorporatedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingVerifiedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="FilingReportedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FiledDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingDueDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingMailedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PreviousDocumentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FiscalPeriodEndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://services.dnb.com/CustomProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingOrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocumentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingLanguageISOAlpha2Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingOrganizationRegistrationNumberDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberType" minOccurs="0"/>
 *         &lt;element name="CharterTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="IncorporatedTerritoryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncorporatedTerritoryAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncorporatedCountryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncorporatedCountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="IncorporatedTerritoryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PerpetualBusinessOperationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}TaxDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShareCapitalDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ShareCapitalDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingOrganizationIdentificationNumberDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingOfficeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingOfficeDetails" minOccurs="0"/>
 *         &lt;element name="FilingExpirationDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingExpirationDetails" minOccurs="0"/>
 *         &lt;element name="IncorporatedCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingDelinquencyNotificationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DisplayGroupSequence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="StopDistributionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InformationSourceText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LegalFormDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalFormDetailsType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingOrganizationLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="FilingPrincipalDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="ReceivedDateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentFilingDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingStatusDetail",
    "filingRolePlayerDetails",
    "incorporatedDate",
    "industryCode",
    "filingVerifiedDate",
    "filingDetailText",
    "filingReportedDate",
    "filedDate",
    "filingDueDate",
    "filingMailedDate",
    "previousDocumentDate",
    "fiscalPeriodEndDate",
    "principal",
    "filingReasonText",
    "documentTypeText",
    "filingOrganizationName",
    "filingReferenceNumber",
    "documentDate",
    "filingLanguageISOAlpha2Code",
    "filingOrganizationRegistrationNumberDetails",
    "charterTypeText",
    "incorporatedTerritoryOfficialName",
    "incorporatedTerritoryAbbreviatedName",
    "incorporatedCountryOfficialName",
    "incorporatedCountryISOAlpha2Code",
    "incorporatedTerritoryName",
    "perpetualBusinessOperationIndicator",
    "taxDetail",
    "shareCapitalDetails",
    "filingOrganizationIdentificationNumberDetails",
    "filingOfficeDetails",
    "filingExpirationDetails",
    "incorporatedCountryName",
    "filingDelinquencyNotificationDate",
    "displayGroupSequence",
    "stopDistributionIndicator",
    "informationSourceText",
    "legalFormDetails",
    "lastUpdateDate",
    "filingOrganizationLocation",
    "filingPrincipalDetails",
    "lastUpdateTime",
    "receivedDateTime",
    "dataProviderName"
})
public class DocumentFilingDetails {

    @XmlElement(name = "FilingStatusDetail")
    protected FilingStatusDetail filingStatusDetail;
    @XmlElement(name = "FilingRolePlayerDetails")
    protected List<FilingRolePlayerDetails> filingRolePlayerDetails;
    @XmlElement(name = "IncorporatedDate")
    protected DNBDateType incorporatedDate;
    @XmlElement(name = "IndustryCode")
    protected List<IndustryCodeType> industryCode;
    @XmlElement(name = "FilingVerifiedDate")
    protected DNBDateType filingVerifiedDate;
    @XmlElement(name = "FilingDetailText")
    protected DNBStringType filingDetailText;
    @XmlElement(name = "FilingReportedDate")
    protected DNBDateType filingReportedDate;
    @XmlElement(name = "FiledDate")
    protected DNBDateType filedDate;
    @XmlElement(name = "FilingDueDate")
    protected DNBDateType filingDueDate;
    @XmlElement(name = "FilingMailedDate")
    protected DNBDateType filingMailedDate;
    @XmlElement(name = "PreviousDocumentDate")
    protected DNBDateType previousDocumentDate;
    @XmlElement(name = "FiscalPeriodEndDate")
    protected DNBDateType fiscalPeriodEndDate;
    @XmlElement(name = "Principal")
    protected List<Management> principal;
    @XmlElement(name = "FilingReasonText")
    protected List<DNBDecodedStringType> filingReasonText;
    @XmlElement(name = "DocumentTypeText")
    protected DNBDecodedStringType documentTypeText;
    @XmlElement(name = "FilingOrganizationName")
    protected OrganizationName filingOrganizationName;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "DocumentDate")
    protected DNBDateType documentDate;
    @XmlElement(name = "FilingLanguageISOAlpha2Code")
    protected String filingLanguageISOAlpha2Code;
    @XmlElement(name = "FilingOrganizationRegistrationNumberDetails")
    protected OrganizationIdentificationNumberType filingOrganizationRegistrationNumberDetails;
    @XmlElement(name = "CharterTypeText")
    protected DNBDecodedStringType charterTypeText;
    @XmlElement(name = "IncorporatedTerritoryOfficialName")
    protected String incorporatedTerritoryOfficialName;
    @XmlElement(name = "IncorporatedTerritoryAbbreviatedName")
    protected String incorporatedTerritoryAbbreviatedName;
    @XmlElement(name = "IncorporatedCountryOfficialName")
    protected String incorporatedCountryOfficialName;
    @XmlElement(name = "IncorporatedCountryISOAlpha2Code")
    protected String incorporatedCountryISOAlpha2Code;
    @XmlElement(name = "IncorporatedTerritoryName")
    protected String incorporatedTerritoryName;
    @XmlElement(name = "PerpetualBusinessOperationIndicator")
    protected Boolean perpetualBusinessOperationIndicator;
    @XmlElement(name = "TaxDetail")
    protected List<TaxDetailType> taxDetail;
    @XmlElement(name = "ShareCapitalDetails")
    protected List<ShareCapitalDetailsType> shareCapitalDetails;
    @XmlElement(name = "FilingOrganizationIdentificationNumberDetails")
    protected List<OrganizationIdentificationNumberType> filingOrganizationIdentificationNumberDetails;
    @XmlElement(name = "FilingOfficeDetails")
    protected FilingOfficeDetails filingOfficeDetails;
    @XmlElement(name = "FilingExpirationDetails")
    protected FilingExpirationDetails filingExpirationDetails;
    @XmlElement(name = "IncorporatedCountryName")
    protected String incorporatedCountryName;
    @XmlElement(name = "FilingDelinquencyNotificationDate")
    protected DNBDateType filingDelinquencyNotificationDate;
    @XmlElement(name = "DisplayGroupSequence")
    protected BigInteger displayGroupSequence;
    @XmlElement(name = "StopDistributionIndicator")
    protected Boolean stopDistributionIndicator;
    @XmlElement(name = "InformationSourceText")
    protected DNBDecodedStringType informationSourceText;
    @XmlElement(name = "LegalFormDetails")
    protected LegalFormDetailsType legalFormDetails;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "FilingOrganizationLocation")
    protected Location filingOrganizationLocation;
    @XmlElement(name = "FilingPrincipalDetails")
    protected List<Management> filingPrincipalDetails;
    @XmlElement(name = "LastUpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElement(name = "ReceivedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateTime;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;

    /**
     * Gets the value of the filingStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FilingStatusDetail }
     *     
     */
    public FilingStatusDetail getFilingStatusDetail() {
        return filingStatusDetail;
    }

    /**
     * Sets the value of the filingStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingStatusDetail }
     *     
     */
    public void setFilingStatusDetail(FilingStatusDetail value) {
        this.filingStatusDetail = value;
    }

    /**
     * Gets the value of the filingRolePlayerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingRolePlayerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingRolePlayerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingRolePlayerDetails }
     * 
     * 
     */
    public List<FilingRolePlayerDetails> getFilingRolePlayerDetails() {
        if (filingRolePlayerDetails == null) {
            filingRolePlayerDetails = new ArrayList<FilingRolePlayerDetails>();
        }
        return this.filingRolePlayerDetails;
    }

    /**
     * Gets the value of the incorporatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getIncorporatedDate() {
        return incorporatedDate;
    }

    /**
     * Sets the value of the incorporatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setIncorporatedDate(DNBDateType value) {
        this.incorporatedDate = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryCodeType }
     * 
     * 
     */
    public List<IndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<IndustryCodeType>();
        }
        return this.industryCode;
    }

    /**
     * Gets the value of the filingVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingVerifiedDate() {
        return filingVerifiedDate;
    }

    /**
     * Sets the value of the filingVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingVerifiedDate(DNBDateType value) {
        this.filingVerifiedDate = value;
    }

    /**
     * Gets the value of the filingDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getFilingDetailText() {
        return filingDetailText;
    }

    /**
     * Sets the value of the filingDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setFilingDetailText(DNBStringType value) {
        this.filingDetailText = value;
    }

    /**
     * Gets the value of the filingReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingReportedDate() {
        return filingReportedDate;
    }

    /**
     * Sets the value of the filingReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingReportedDate(DNBDateType value) {
        this.filingReportedDate = value;
    }

    /**
     * Gets the value of the filedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFiledDate() {
        return filedDate;
    }

    /**
     * Sets the value of the filedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFiledDate(DNBDateType value) {
        this.filedDate = value;
    }

    /**
     * Gets the value of the filingDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingDueDate() {
        return filingDueDate;
    }

    /**
     * Sets the value of the filingDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingDueDate(DNBDateType value) {
        this.filingDueDate = value;
    }

    /**
     * Gets the value of the filingMailedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingMailedDate() {
        return filingMailedDate;
    }

    /**
     * Sets the value of the filingMailedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingMailedDate(DNBDateType value) {
        this.filingMailedDate = value;
    }

    /**
     * Gets the value of the previousDocumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getPreviousDocumentDate() {
        return previousDocumentDate;
    }

    /**
     * Sets the value of the previousDocumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setPreviousDocumentDate(DNBDateType value) {
        this.previousDocumentDate = value;
    }

    /**
     * Gets the value of the fiscalPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFiscalPeriodEndDate() {
        return fiscalPeriodEndDate;
    }

    /**
     * Sets the value of the fiscalPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFiscalPeriodEndDate(DNBDateType value) {
        this.fiscalPeriodEndDate = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Management }
     * 
     * 
     */
    public List<Management> getPrincipal() {
        if (principal == null) {
            principal = new ArrayList<Management>();
        }
        return this.principal;
    }

    /**
     * Gets the value of the filingReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getFilingReasonText() {
        if (filingReasonText == null) {
            filingReasonText = new ArrayList<DNBDecodedStringType>();
        }
        return this.filingReasonText;
    }

    /**
     * Gets the value of the documentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDocumentTypeText() {
        return documentTypeText;
    }

    /**
     * Sets the value of the documentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDocumentTypeText(DNBDecodedStringType value) {
        this.documentTypeText = value;
    }

    /**
     * Gets the value of the filingOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName }
     *     
     */
    public OrganizationName getFilingOrganizationName() {
        return filingOrganizationName;
    }

    /**
     * Sets the value of the filingOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName }
     *     
     */
    public void setFilingOrganizationName(OrganizationName value) {
        this.filingOrganizationName = value;
    }

    /**
     * Gets the value of the filingReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingReferenceNumber() {
        return filingReferenceNumber;
    }

    /**
     * Sets the value of the filingReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingReferenceNumber(String value) {
        this.filingReferenceNumber = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDocumentDate(DNBDateType value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the filingLanguageISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingLanguageISOAlpha2Code() {
        return filingLanguageISOAlpha2Code;
    }

    /**
     * Sets the value of the filingLanguageISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingLanguageISOAlpha2Code(String value) {
        this.filingLanguageISOAlpha2Code = value;
    }

    /**
     * Gets the value of the filingOrganizationRegistrationNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberType }
     *     
     */
    public OrganizationIdentificationNumberType getFilingOrganizationRegistrationNumberDetails() {
        return filingOrganizationRegistrationNumberDetails;
    }

    /**
     * Sets the value of the filingOrganizationRegistrationNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberType }
     *     
     */
    public void setFilingOrganizationRegistrationNumberDetails(OrganizationIdentificationNumberType value) {
        this.filingOrganizationRegistrationNumberDetails = value;
    }

    /**
     * Gets the value of the charterTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCharterTypeText() {
        return charterTypeText;
    }

    /**
     * Sets the value of the charterTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCharterTypeText(DNBDecodedStringType value) {
        this.charterTypeText = value;
    }

    /**
     * Gets the value of the incorporatedTerritoryOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporatedTerritoryOfficialName() {
        return incorporatedTerritoryOfficialName;
    }

    /**
     * Sets the value of the incorporatedTerritoryOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporatedTerritoryOfficialName(String value) {
        this.incorporatedTerritoryOfficialName = value;
    }

    /**
     * Gets the value of the incorporatedTerritoryAbbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporatedTerritoryAbbreviatedName() {
        return incorporatedTerritoryAbbreviatedName;
    }

    /**
     * Sets the value of the incorporatedTerritoryAbbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporatedTerritoryAbbreviatedName(String value) {
        this.incorporatedTerritoryAbbreviatedName = value;
    }

    /**
     * Gets the value of the incorporatedCountryOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporatedCountryOfficialName() {
        return incorporatedCountryOfficialName;
    }

    /**
     * Sets the value of the incorporatedCountryOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporatedCountryOfficialName(String value) {
        this.incorporatedCountryOfficialName = value;
    }

    /**
     * Gets the value of the incorporatedCountryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporatedCountryISOAlpha2Code() {
        return incorporatedCountryISOAlpha2Code;
    }

    /**
     * Sets the value of the incorporatedCountryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporatedCountryISOAlpha2Code(String value) {
        this.incorporatedCountryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the incorporatedTerritoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporatedTerritoryName() {
        return incorporatedTerritoryName;
    }

    /**
     * Sets the value of the incorporatedTerritoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporatedTerritoryName(String value) {
        this.incorporatedTerritoryName = value;
    }

    /**
     * Gets the value of the perpetualBusinessOperationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerpetualBusinessOperationIndicator() {
        return perpetualBusinessOperationIndicator;
    }

    /**
     * Sets the value of the perpetualBusinessOperationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerpetualBusinessOperationIndicator(Boolean value) {
        this.perpetualBusinessOperationIndicator = value;
    }

    /**
     * Gets the value of the taxDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailType }
     * 
     * 
     */
    public List<TaxDetailType> getTaxDetail() {
        if (taxDetail == null) {
            taxDetail = new ArrayList<TaxDetailType>();
        }
        return this.taxDetail;
    }

    /**
     * Gets the value of the shareCapitalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareCapitalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareCapitalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareCapitalDetailsType }
     * 
     * 
     */
    public List<ShareCapitalDetailsType> getShareCapitalDetails() {
        if (shareCapitalDetails == null) {
            shareCapitalDetails = new ArrayList<ShareCapitalDetailsType>();
        }
        return this.shareCapitalDetails;
    }

    /**
     * Gets the value of the filingOrganizationIdentificationNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingOrganizationIdentificationNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingOrganizationIdentificationNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationIdentificationNumberType }
     * 
     * 
     */
    public List<OrganizationIdentificationNumberType> getFilingOrganizationIdentificationNumberDetails() {
        if (filingOrganizationIdentificationNumberDetails == null) {
            filingOrganizationIdentificationNumberDetails = new ArrayList<OrganizationIdentificationNumberType>();
        }
        return this.filingOrganizationIdentificationNumberDetails;
    }

    /**
     * Gets the value of the filingOfficeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FilingOfficeDetails }
     *     
     */
    public FilingOfficeDetails getFilingOfficeDetails() {
        return filingOfficeDetails;
    }

    /**
     * Sets the value of the filingOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingOfficeDetails }
     *     
     */
    public void setFilingOfficeDetails(FilingOfficeDetails value) {
        this.filingOfficeDetails = value;
    }

    /**
     * Gets the value of the filingExpirationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FilingExpirationDetails }
     *     
     */
    public FilingExpirationDetails getFilingExpirationDetails() {
        return filingExpirationDetails;
    }

    /**
     * Sets the value of the filingExpirationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingExpirationDetails }
     *     
     */
    public void setFilingExpirationDetails(FilingExpirationDetails value) {
        this.filingExpirationDetails = value;
    }

    /**
     * Gets the value of the incorporatedCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporatedCountryName() {
        return incorporatedCountryName;
    }

    /**
     * Sets the value of the incorporatedCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporatedCountryName(String value) {
        this.incorporatedCountryName = value;
    }

    /**
     * Gets the value of the filingDelinquencyNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingDelinquencyNotificationDate() {
        return filingDelinquencyNotificationDate;
    }

    /**
     * Sets the value of the filingDelinquencyNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingDelinquencyNotificationDate(DNBDateType value) {
        this.filingDelinquencyNotificationDate = value;
    }

    /**
     * Gets the value of the displayGroupSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayGroupSequence() {
        return displayGroupSequence;
    }

    /**
     * Sets the value of the displayGroupSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayGroupSequence(BigInteger value) {
        this.displayGroupSequence = value;
    }

    /**
     * Gets the value of the stopDistributionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopDistributionIndicator() {
        return stopDistributionIndicator;
    }

    /**
     * Sets the value of the stopDistributionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopDistributionIndicator(Boolean value) {
        this.stopDistributionIndicator = value;
    }

    /**
     * Gets the value of the informationSourceText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getInformationSourceText() {
        return informationSourceText;
    }

    /**
     * Sets the value of the informationSourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setInformationSourceText(DNBDecodedStringType value) {
        this.informationSourceText = value;
    }

    /**
     * Gets the value of the legalFormDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFormDetailsType }
     *     
     */
    public LegalFormDetailsType getLegalFormDetails() {
        return legalFormDetails;
    }

    /**
     * Sets the value of the legalFormDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFormDetailsType }
     *     
     */
    public void setLegalFormDetails(LegalFormDetailsType value) {
        this.legalFormDetails = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLastUpdateDate(DNBDateType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the filingOrganizationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getFilingOrganizationLocation() {
        return filingOrganizationLocation;
    }

    /**
     * Sets the value of the filingOrganizationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setFilingOrganizationLocation(Location value) {
        this.filingOrganizationLocation = value;
    }

    /**
     * Gets the value of the filingPrincipalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingPrincipalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingPrincipalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Management }
     * 
     * 
     */
    public List<Management> getFilingPrincipalDetails() {
        if (filingPrincipalDetails == null) {
            filingPrincipalDetails = new ArrayList<Management>();
        }
        return this.filingPrincipalDetails;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the receivedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDateTime() {
        return receivedDateTime;
    }

    /**
     * Sets the value of the receivedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDateTime(XMLGregorianCalendar value) {
        this.receivedDateTime = value;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

}
