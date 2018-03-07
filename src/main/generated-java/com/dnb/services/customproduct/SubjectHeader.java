
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records high level information about the subject such as the D-U-N-S Number assigned to the subject, the primary language of the subject and the primary currency in which this subject trades. When the subject is an organizantion, this will also include country details where the organization is registered.
 *          
 * 
 * <p>Java class for SubjectHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectHeader">
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
 *         &lt;element name="LanguagePreferenceCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="SubjectInformationScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OrganizationSummaryText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DUNSSupportRecordIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopDistributionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopDistributionDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateSimpleType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TotalInquiriesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubjectHandling" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransferDUNSNumberRegistration" type="{http://services.dnb.com/CustomProductServiceV2.0}TransferDUNSNumberRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NonMarketableReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UpdaterKey" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="CurrencyISOAlpha3Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullReportDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateSimpleType" minOccurs="0"/>
 *         &lt;element name="InquirySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InquirySummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostRecentInquiryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DUNSAssignedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateSimpleType" minOccurs="0"/>
 *         &lt;element name="ReportTypeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalContinuousInquiriesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DUNSSelfRequestIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DUNSSelfRequestDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DeletedDUNSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InquirySummaryUnavailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MostRecentCustomerInquiryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectHeader", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsNumber",
    "subjectID",
    "countryISOAlpha2Code",
    "languagePreferenceCode",
    "subjectInformationScopeText",
    "organizationSummaryText",
    "dunsSupportRecordIndicator",
    "stopDistributionIndicator",
    "stopDistributionDate",
    "lastUpdateDate",
    "totalInquiriesCount",
    "subjectHandling",
    "transferDUNSNumberRegistration",
    "marketabilityIndicator",
    "nonMarketableReasonText",
    "updaterKey",
    "currencyISOAlpha3Code",
    "fullReportDate",
    "inquirySummary",
    "mostRecentInquiryDate",
    "dunsAssignedDate",
    "reportTypeValue",
    "totalContinuousInquiriesCount",
    "dunsSelfRequestIndicator",
    "dunsSelfRequestDate",
    "deletedDUNSIndicator",
    "inquirySummaryUnavailabilityIndicator",
    "mostRecentCustomerInquiryDate"
})
public class SubjectHeader {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectID")
    protected String subjectID;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "LanguagePreferenceCode")
    protected BigInteger languagePreferenceCode;
    @XmlElement(name = "SubjectInformationScopeText")
    protected DNBDecodedStringType subjectInformationScopeText;
    @XmlElement(name = "OrganizationSummaryText")
    protected String organizationSummaryText;
    @XmlElement(name = "DUNSSupportRecordIndicator")
    protected Boolean dunsSupportRecordIndicator;
    @XmlElement(name = "StopDistributionIndicator")
    protected Boolean stopDistributionIndicator;
    @XmlElement(name = "StopDistributionDate")
    protected String stopDistributionDate;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "TotalInquiriesCount")
    protected Integer totalInquiriesCount;
    @XmlElement(name = "SubjectHandling")
    protected List<SubjectHandling> subjectHandling;
    @XmlElement(name = "TransferDUNSNumberRegistration")
    protected List<TransferDUNSNumberRegistration> transferDUNSNumberRegistration;
    @XmlElement(name = "MarketabilityIndicator")
    protected Boolean marketabilityIndicator;
    @XmlElement(name = "NonMarketableReasonText")
    protected List<DNBDecodedStringType> nonMarketableReasonText;
    @XmlElement(name = "UpdaterKey")
    protected String updaterKey;
    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "FullReportDate")
    protected String fullReportDate;
    @XmlElement(name = "InquirySummary")
    protected List<InquirySummary> inquirySummary;
    @XmlElement(name = "MostRecentInquiryDate")
    protected DNBDateType mostRecentInquiryDate;
    @XmlElement(name = "DUNSAssignedDate")
    protected String dunsAssignedDate;
    @XmlElement(name = "ReportTypeValue")
    protected String reportTypeValue;
    @XmlElement(name = "TotalContinuousInquiriesCount")
    protected Integer totalContinuousInquiriesCount;
    @XmlElement(name = "DUNSSelfRequestIndicator")
    protected Boolean dunsSelfRequestIndicator;
    @XmlElement(name = "DUNSSelfRequestDate")
    protected DNBDateType dunsSelfRequestDate;
    @XmlElement(name = "DeletedDUNSIndicator")
    protected Boolean deletedDUNSIndicator;
    @XmlElement(name = "InquirySummaryUnavailabilityIndicator")
    protected Boolean inquirySummaryUnavailabilityIndicator;
    @XmlElement(name = "MostRecentCustomerInquiryDate")
    protected DNBDateType mostRecentCustomerInquiryDate;

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
     * Gets the value of the languagePreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }

    /**
     * Sets the value of the languagePreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguagePreferenceCode(BigInteger value) {
        this.languagePreferenceCode = value;
    }

    /**
     * Gets the value of the subjectInformationScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSubjectInformationScopeText() {
        return subjectInformationScopeText;
    }

    /**
     * Sets the value of the subjectInformationScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSubjectInformationScopeText(DNBDecodedStringType value) {
        this.subjectInformationScopeText = value;
    }

    /**
     * Gets the value of the organizationSummaryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationSummaryText() {
        return organizationSummaryText;
    }

    /**
     * Sets the value of the organizationSummaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationSummaryText(String value) {
        this.organizationSummaryText = value;
    }

    /**
     * Gets the value of the dunsSupportRecordIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDUNSSupportRecordIndicator() {
        return dunsSupportRecordIndicator;
    }

    /**
     * Sets the value of the dunsSupportRecordIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDUNSSupportRecordIndicator(Boolean value) {
        this.dunsSupportRecordIndicator = value;
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
     * Gets the value of the stopDistributionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDistributionDate() {
        return stopDistributionDate;
    }

    /**
     * Sets the value of the stopDistributionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDistributionDate(String value) {
        this.stopDistributionDate = value;
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
     * Gets the value of the totalInquiriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalInquiriesCount() {
        return totalInquiriesCount;
    }

    /**
     * Sets the value of the totalInquiriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalInquiriesCount(Integer value) {
        this.totalInquiriesCount = value;
    }

    /**
     * Gets the value of the subjectHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectHandling }
     * 
     * 
     */
    public List<SubjectHandling> getSubjectHandling() {
        if (subjectHandling == null) {
            subjectHandling = new ArrayList<SubjectHandling>();
        }
        return this.subjectHandling;
    }

    /**
     * Gets the value of the transferDUNSNumberRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferDUNSNumberRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferDUNSNumberRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferDUNSNumberRegistration }
     * 
     * 
     */
    public List<TransferDUNSNumberRegistration> getTransferDUNSNumberRegistration() {
        if (transferDUNSNumberRegistration == null) {
            transferDUNSNumberRegistration = new ArrayList<TransferDUNSNumberRegistration>();
        }
        return this.transferDUNSNumberRegistration;
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
     * Gets the value of the updaterKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdaterKey() {
        return updaterKey;
    }

    /**
     * Sets the value of the updaterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdaterKey(String value) {
        this.updaterKey = value;
    }

    /**
     * Gets the value of the currencyISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISOAlpha3Code() {
        return currencyISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISOAlpha3Code(String value) {
        this.currencyISOAlpha3Code = value;
    }

    /**
     * Gets the value of the fullReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullReportDate() {
        return fullReportDate;
    }

    /**
     * Sets the value of the fullReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullReportDate(String value) {
        this.fullReportDate = value;
    }

    /**
     * Gets the value of the inquirySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inquirySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInquirySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InquirySummary }
     * 
     * 
     */
    public List<InquirySummary> getInquirySummary() {
        if (inquirySummary == null) {
            inquirySummary = new ArrayList<InquirySummary>();
        }
        return this.inquirySummary;
    }

    /**
     * Gets the value of the mostRecentInquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentInquiryDate() {
        return mostRecentInquiryDate;
    }

    /**
     * Sets the value of the mostRecentInquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentInquiryDate(DNBDateType value) {
        this.mostRecentInquiryDate = value;
    }

    /**
     * Gets the value of the dunsAssignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSAssignedDate() {
        return dunsAssignedDate;
    }

    /**
     * Sets the value of the dunsAssignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSAssignedDate(String value) {
        this.dunsAssignedDate = value;
    }

    /**
     * Gets the value of the reportTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTypeValue() {
        return reportTypeValue;
    }

    /**
     * Sets the value of the reportTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTypeValue(String value) {
        this.reportTypeValue = value;
    }

    /**
     * Gets the value of the totalContinuousInquiriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalContinuousInquiriesCount() {
        return totalContinuousInquiriesCount;
    }

    /**
     * Sets the value of the totalContinuousInquiriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalContinuousInquiriesCount(Integer value) {
        this.totalContinuousInquiriesCount = value;
    }

    /**
     * Gets the value of the dunsSelfRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDUNSSelfRequestIndicator() {
        return dunsSelfRequestIndicator;
    }

    /**
     * Sets the value of the dunsSelfRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDUNSSelfRequestIndicator(Boolean value) {
        this.dunsSelfRequestIndicator = value;
    }

    /**
     * Gets the value of the dunsSelfRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDUNSSelfRequestDate() {
        return dunsSelfRequestDate;
    }

    /**
     * Sets the value of the dunsSelfRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDUNSSelfRequestDate(DNBDateType value) {
        this.dunsSelfRequestDate = value;
    }

    /**
     * Gets the value of the deletedDUNSIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletedDUNSIndicator() {
        return deletedDUNSIndicator;
    }

    /**
     * Sets the value of the deletedDUNSIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletedDUNSIndicator(Boolean value) {
        this.deletedDUNSIndicator = value;
    }

    /**
     * Gets the value of the inquirySummaryUnavailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInquirySummaryUnavailabilityIndicator() {
        return inquirySummaryUnavailabilityIndicator;
    }

    /**
     * Sets the value of the inquirySummaryUnavailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInquirySummaryUnavailabilityIndicator(Boolean value) {
        this.inquirySummaryUnavailabilityIndicator = value;
    }

    /**
     * Gets the value of the mostRecentCustomerInquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentCustomerInquiryDate() {
        return mostRecentCustomerInquiryDate;
    }

    /**
     * Sets the value of the mostRecentCustomerInquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentCustomerInquiryDate(DNBDateType value) {
        this.mostRecentCustomerInquiryDate = value;
    }

}
