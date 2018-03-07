
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSufficiency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSufficiency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationRegisteredName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationRegisteredNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegisteredAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="LegalFormDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalFormDetailsType" minOccurs="0"/>
 *         &lt;element name="LanguagePreferenceText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopDistributionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LatestAccountClosingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="LatestAccountFiledDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TotalPaymentExperiencesUsedCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinancialConditionOrRiskCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinancialStrengthCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DNBCreditLimitRecommendation" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCreditLimitRecommendationType" minOccurs="0"/>
 *         &lt;element name="FullUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DataInsufficientIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InformationConfirmationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InformationConfirmation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UpwardAssociationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}UpwardAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/CustomProductServiceV2.0}FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DNBScore" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectHandlingDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DUNSAuditTrailDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSAuditTrail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSufficiency", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationTypeText",
    "organizationPrimaryName",
    "organizationRegisteredName",
    "primaryAddress",
    "registeredAddress",
    "organizationIdentificationNumberDetail",
    "telephoneNumber",
    "legalFormDetails",
    "languagePreferenceText",
    "operatingStatusText",
    "marketabilityIndicator",
    "stopDistributionIndicator",
    "latestAccountClosingDate",
    "latestAccountFiledDate",
    "totalPaymentExperiencesUsedCount",
    "financialConditionOrRiskCode",
    "financialStrengthCode",
    "dnbCreditLimitRecommendation",
    "fullUpdateDate",
    "lastUpdateDate",
    "dataInsufficientIndicator",
    "informationConfirmationDetail",
    "industryCode",
    "upwardAssociationDetail",
    "familyTreeMemberRole",
    "dnbScore",
    "subjectHandlingDetail",
    "dunsAuditTrailDetail"
})
public class DataSufficiency {

    @XmlElement(name = "OrganizationTypeText", required = true)
    protected DNBDecodedStringType organizationTypeText;
    @XmlElement(name = "OrganizationPrimaryName")
    protected List<OrganizationPrimaryNameType> organizationPrimaryName;
    @XmlElement(name = "OrganizationRegisteredName")
    protected List<OrganizationRegisteredNameType> organizationRegisteredName;
    @XmlElement(name = "PrimaryAddress")
    protected List<PrimaryAddressType> primaryAddress;
    @XmlElement(name = "RegisteredAddress")
    protected List<RegisteredAddressType> registeredAddress;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected List<OrganizationIdentificationNumberType> organizationIdentificationNumberDetail;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberType telephoneNumber;
    @XmlElement(name = "LegalFormDetails")
    protected LegalFormDetailsType legalFormDetails;
    @XmlElement(name = "LanguagePreferenceText")
    protected DNBDecodedStringType languagePreferenceText;
    @XmlElement(name = "OperatingStatusText")
    protected List<DNBDecodedStringType> operatingStatusText;
    @XmlElement(name = "MarketabilityIndicator")
    protected Boolean marketabilityIndicator;
    @XmlElement(name = "StopDistributionIndicator")
    protected boolean stopDistributionIndicator;
    @XmlElement(name = "LatestAccountClosingDate")
    protected DNBDateType latestAccountClosingDate;
    @XmlElement(name = "LatestAccountFiledDate")
    protected DNBDateType latestAccountFiledDate;
    @XmlElement(name = "TotalPaymentExperiencesUsedCount")
    protected Integer totalPaymentExperiencesUsedCount;
    @XmlElement(name = "FinancialConditionOrRiskCode")
    protected String financialConditionOrRiskCode;
    @XmlElement(name = "FinancialStrengthCode")
    protected String financialStrengthCode;
    @XmlElement(name = "DNBCreditLimitRecommendation")
    protected DNBCreditLimitRecommendationType dnbCreditLimitRecommendation;
    @XmlElement(name = "FullUpdateDate")
    protected DNBDateType fullUpdateDate;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "DataInsufficientIndicator")
    protected boolean dataInsufficientIndicator;
    @XmlElement(name = "InformationConfirmationDetail")
    protected List<InformationConfirmation> informationConfirmationDetail;
    @XmlElement(name = "IndustryCode")
    protected List<IndustryCodeType> industryCode;
    @XmlElement(name = "UpwardAssociationDetail")
    protected List<UpwardAssociation> upwardAssociationDetail;
    @XmlElement(name = "FamilyTreeMemberRole")
    protected List<FamilyTreeMemberRole> familyTreeMemberRole;
    @XmlElement(name = "DNBScore")
    protected List<DNBScore> dnbScore;
    @XmlElement(name = "SubjectHandlingDetail")
    protected List<SubjectHandling> subjectHandlingDetail;
    @XmlElement(name = "DUNSAuditTrailDetail")
    protected List<DUNSAuditTrail> dunsAuditTrailDetail;

    /**
     * Gets the value of the organizationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOrganizationTypeText() {
        return organizationTypeText;
    }

    /**
     * Sets the value of the organizationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOrganizationTypeText(DNBDecodedStringType value) {
        this.organizationTypeText = value;
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

    /**
     * Gets the value of the primaryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryAddressType }
     * 
     * 
     */
    public List<PrimaryAddressType> getPrimaryAddress() {
        if (primaryAddress == null) {
            primaryAddress = new ArrayList<PrimaryAddressType>();
        }
        return this.primaryAddress;
    }

    /**
     * Gets the value of the registeredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredAddressType }
     * 
     * 
     */
    public List<RegisteredAddressType> getRegisteredAddress() {
        if (registeredAddress == null) {
            registeredAddress = new ArrayList<RegisteredAddressType>();
        }
        return this.registeredAddress;
    }

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationIdentificationNumberType }
     * 
     * 
     */
    public List<OrganizationIdentificationNumberType> getOrganizationIdentificationNumberDetail() {
        if (organizationIdentificationNumberDetail == null) {
            organizationIdentificationNumberDetail = new ArrayList<OrganizationIdentificationNumberType>();
        }
        return this.organizationIdentificationNumberDetail;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public TelecommunicationNumberType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberType value) {
        this.telephoneNumber = value;
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
     * Gets the value of the languagePreferenceText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLanguagePreferenceText() {
        return languagePreferenceText;
    }

    /**
     * Sets the value of the languagePreferenceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLanguagePreferenceText(DNBDecodedStringType value) {
        this.languagePreferenceText = value;
    }

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingStatusText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingStatusText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getOperatingStatusText() {
        if (operatingStatusText == null) {
            operatingStatusText = new ArrayList<DNBDecodedStringType>();
        }
        return this.operatingStatusText;
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
     * Gets the value of the stopDistributionIndicator property.
     * 
     */
    public boolean isStopDistributionIndicator() {
        return stopDistributionIndicator;
    }

    /**
     * Sets the value of the stopDistributionIndicator property.
     * 
     */
    public void setStopDistributionIndicator(boolean value) {
        this.stopDistributionIndicator = value;
    }

    /**
     * Gets the value of the latestAccountClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLatestAccountClosingDate() {
        return latestAccountClosingDate;
    }

    /**
     * Sets the value of the latestAccountClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLatestAccountClosingDate(DNBDateType value) {
        this.latestAccountClosingDate = value;
    }

    /**
     * Gets the value of the latestAccountFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLatestAccountFiledDate() {
        return latestAccountFiledDate;
    }

    /**
     * Sets the value of the latestAccountFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLatestAccountFiledDate(DNBDateType value) {
        this.latestAccountFiledDate = value;
    }

    /**
     * Gets the value of the totalPaymentExperiencesUsedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPaymentExperiencesUsedCount() {
        return totalPaymentExperiencesUsedCount;
    }

    /**
     * Sets the value of the totalPaymentExperiencesUsedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPaymentExperiencesUsedCount(Integer value) {
        this.totalPaymentExperiencesUsedCount = value;
    }

    /**
     * Gets the value of the financialConditionOrRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialConditionOrRiskCode() {
        return financialConditionOrRiskCode;
    }

    /**
     * Sets the value of the financialConditionOrRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialConditionOrRiskCode(String value) {
        this.financialConditionOrRiskCode = value;
    }

    /**
     * Gets the value of the financialStrengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialStrengthCode() {
        return financialStrengthCode;
    }

    /**
     * Sets the value of the financialStrengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialStrengthCode(String value) {
        this.financialStrengthCode = value;
    }

    /**
     * Gets the value of the dnbCreditLimitRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link DNBCreditLimitRecommendationType }
     *     
     */
    public DNBCreditLimitRecommendationType getDNBCreditLimitRecommendation() {
        return dnbCreditLimitRecommendation;
    }

    /**
     * Sets the value of the dnbCreditLimitRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBCreditLimitRecommendationType }
     *     
     */
    public void setDNBCreditLimitRecommendation(DNBCreditLimitRecommendationType value) {
        this.dnbCreditLimitRecommendation = value;
    }

    /**
     * Gets the value of the fullUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFullUpdateDate() {
        return fullUpdateDate;
    }

    /**
     * Sets the value of the fullUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFullUpdateDate(DNBDateType value) {
        this.fullUpdateDate = value;
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
     * Gets the value of the dataInsufficientIndicator property.
     * 
     */
    public boolean isDataInsufficientIndicator() {
        return dataInsufficientIndicator;
    }

    /**
     * Sets the value of the dataInsufficientIndicator property.
     * 
     */
    public void setDataInsufficientIndicator(boolean value) {
        this.dataInsufficientIndicator = value;
    }

    /**
     * Gets the value of the informationConfirmationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationConfirmationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationConfirmationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationConfirmation }
     * 
     * 
     */
    public List<InformationConfirmation> getInformationConfirmationDetail() {
        if (informationConfirmationDetail == null) {
            informationConfirmationDetail = new ArrayList<InformationConfirmation>();
        }
        return this.informationConfirmationDetail;
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
     * Gets the value of the upwardAssociationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upwardAssociationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpwardAssociationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpwardAssociation }
     * 
     * 
     */
    public List<UpwardAssociation> getUpwardAssociationDetail() {
        if (upwardAssociationDetail == null) {
            upwardAssociationDetail = new ArrayList<UpwardAssociation>();
        }
        return this.upwardAssociationDetail;
    }

    /**
     * Gets the value of the familyTreeMemberRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyTreeMemberRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyTreeMemberRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyTreeMemberRole }
     * 
     * 
     */
    public List<FamilyTreeMemberRole> getFamilyTreeMemberRole() {
        if (familyTreeMemberRole == null) {
            familyTreeMemberRole = new ArrayList<FamilyTreeMemberRole>();
        }
        return this.familyTreeMemberRole;
    }

    /**
     * Gets the value of the dnbScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnbScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNBScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBScore }
     * 
     * 
     */
    public List<DNBScore> getDNBScore() {
        if (dnbScore == null) {
            dnbScore = new ArrayList<DNBScore>();
        }
        return this.dnbScore;
    }

    /**
     * Gets the value of the subjectHandlingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectHandlingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectHandlingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectHandling }
     * 
     * 
     */
    public List<SubjectHandling> getSubjectHandlingDetail() {
        if (subjectHandlingDetail == null) {
            subjectHandlingDetail = new ArrayList<SubjectHandling>();
        }
        return this.subjectHandlingDetail;
    }

    /**
     * Gets the value of the dunsAuditTrailDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dunsAuditTrailDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUNSAuditTrailDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUNSAuditTrail }
     * 
     * 
     */
    public List<DUNSAuditTrail> getDUNSAuditTrailDetail() {
        if (dunsAuditTrailDetail == null) {
            dunsAuditTrailDetail = new ArrayList<DUNSAuditTrail>();
        }
        return this.dunsAuditTrailDetail;
    }

}
