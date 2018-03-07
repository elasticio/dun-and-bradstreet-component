
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shareholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shareholder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Ownership">
 *       &lt;sequence>
 *         &lt;element name="OrganizationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IndividualName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="UnClassifiedShareholderNames" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShareHoldingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndirectShareHoldingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VotingShareHoldingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MinorShareHolderIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShareOwnershipStockDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CapitalStockDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JointParentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FamilyTreeMemberRoleText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://services.dnb.com/CustomProductServiceV2.0}Events" minOccurs="0"/>
 *         &lt;element name="ShareholdingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="Linkage" type="{http://services.dnb.com/CustomProductServiceV2.0}Linkage" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NonSpecificDataProviderText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalDetailForLinkage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrusteeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrincipalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfirmedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationStartYear" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStandardRatingTypeForPrincipal" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RegisteredAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredAddressNewType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameAddressText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shareholder", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationIndicator",
    "individualName",
    "unClassifiedShareholderNames",
    "shareHoldingPercentage",
    "indirectShareHoldingPercentage",
    "votingShareHoldingPercentage",
    "minorShareHolderIndicator",
    "shareOwnershipStockDetail",
    "jointParentIndicator",
    "familyTreeMemberRoleText",
    "events",
    "shareholdingAmount",
    "linkage",
    "dataProviderName",
    "nonSpecificDataProviderText",
    "organizationIdentificationNumber",
    "principalIdentificationNumber",
    "principal",
    "birthDate",
    "organizationIdentificationNumberDetail",
    "trusteeIndicator",
    "principalIndicator",
    "confirmedDate",
    "industryCode",
    "organizationStartYear",
    "dnbStandardRating",
    "operatingStatusText",
    "registeredAddress",
    "nameAddressText"
})
public class Shareholder
    extends Ownership
{

    @XmlElement(name = "OrganizationIndicator")
    protected Boolean organizationIndicator;
    @XmlElement(name = "IndividualName")
    protected IndividualNameType individualName;
    @XmlElement(name = "UnClassifiedShareholderNames")
    protected List<String> unClassifiedShareholderNames;
    @XmlElement(name = "ShareHoldingPercentage")
    protected BigDecimal shareHoldingPercentage;
    @XmlElement(name = "IndirectShareHoldingPercentage")
    protected BigDecimal indirectShareHoldingPercentage;
    @XmlElement(name = "VotingShareHoldingPercentage")
    protected BigDecimal votingShareHoldingPercentage;
    @XmlElement(name = "MinorShareHolderIndicator")
    protected Boolean minorShareHolderIndicator;
    @XmlElement(name = "ShareOwnershipStockDetail")
    protected List<CapitalStockDetails> shareOwnershipStockDetail;
    @XmlElement(name = "JointParentIndicator")
    protected Boolean jointParentIndicator;
    @XmlElement(name = "FamilyTreeMemberRoleText")
    protected List<DNBDecodedStringType> familyTreeMemberRoleText;
    @XmlElement(name = "Events")
    protected Events events;
    @XmlElement(name = "ShareholdingAmount")
    protected AmountType shareholdingAmount;
    @XmlElement(name = "Linkage")
    protected Linkage linkage;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "NonSpecificDataProviderText")
    protected String nonSpecificDataProviderText;
    @XmlElement(name = "OrganizationIdentificationNumber")
    protected String organizationIdentificationNumber;
    @XmlElement(name = "PrincipalIdentificationNumber")
    protected String principalIdentificationNumber;
    @XmlElement(name = "Principal")
    protected List<PrincipalDetailForLinkage> principal;
    @XmlElement(name = "BirthDate")
    protected DNBDateType birthDate;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected List<OrganizationIdentificationNumberSimpleType> organizationIdentificationNumberDetail;
    @XmlElement(name = "TrusteeIndicator")
    protected Boolean trusteeIndicator;
    @XmlElement(name = "PrincipalIndicator")
    protected Boolean principalIndicator;
    @XmlElement(name = "ConfirmedDate")
    protected DNBDateType confirmedDate;
    @XmlElement(name = "IndustryCode")
    protected List<IndustryCodeType> industryCode;
    @XmlElement(name = "OrganizationStartYear")
    protected String organizationStartYear;
    @XmlElement(name = "DNBStandardRating")
    protected DNBStandardRatingTypeForPrincipal dnbStandardRating;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "RegisteredAddress")
    protected List<RegisteredAddressNewType> registeredAddress;
    @XmlElement(name = "NameAddressText")
    protected DNBStringType256 nameAddressText;

    /**
     * Gets the value of the organizationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationIndicator() {
        return organizationIndicator;
    }

    /**
     * Sets the value of the organizationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationIndicator(Boolean value) {
        this.organizationIndicator = value;
    }

    /**
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setIndividualName(IndividualNameType value) {
        this.individualName = value;
    }

    /**
     * Gets the value of the unClassifiedShareholderNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unClassifiedShareholderNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnClassifiedShareholderNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnClassifiedShareholderNames() {
        if (unClassifiedShareholderNames == null) {
            unClassifiedShareholderNames = new ArrayList<String>();
        }
        return this.unClassifiedShareholderNames;
    }

    /**
     * Gets the value of the shareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShareHoldingPercentage() {
        return shareHoldingPercentage;
    }

    /**
     * Sets the value of the shareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShareHoldingPercentage(BigDecimal value) {
        this.shareHoldingPercentage = value;
    }

    /**
     * Gets the value of the indirectShareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectShareHoldingPercentage() {
        return indirectShareHoldingPercentage;
    }

    /**
     * Sets the value of the indirectShareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectShareHoldingPercentage(BigDecimal value) {
        this.indirectShareHoldingPercentage = value;
    }

    /**
     * Gets the value of the votingShareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVotingShareHoldingPercentage() {
        return votingShareHoldingPercentage;
    }

    /**
     * Sets the value of the votingShareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVotingShareHoldingPercentage(BigDecimal value) {
        this.votingShareHoldingPercentage = value;
    }

    /**
     * Gets the value of the minorShareHolderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorShareHolderIndicator() {
        return minorShareHolderIndicator;
    }

    /**
     * Sets the value of the minorShareHolderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorShareHolderIndicator(Boolean value) {
        this.minorShareHolderIndicator = value;
    }

    /**
     * Gets the value of the shareOwnershipStockDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareOwnershipStockDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareOwnershipStockDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapitalStockDetails }
     * 
     * 
     */
    public List<CapitalStockDetails> getShareOwnershipStockDetail() {
        if (shareOwnershipStockDetail == null) {
            shareOwnershipStockDetail = new ArrayList<CapitalStockDetails>();
        }
        return this.shareOwnershipStockDetail;
    }

    /**
     * Gets the value of the jointParentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJointParentIndicator() {
        return jointParentIndicator;
    }

    /**
     * Sets the value of the jointParentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJointParentIndicator(Boolean value) {
        this.jointParentIndicator = value;
    }

    /**
     * Gets the value of the familyTreeMemberRoleText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyTreeMemberRoleText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyTreeMemberRoleText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getFamilyTreeMemberRoleText() {
        if (familyTreeMemberRoleText == null) {
            familyTreeMemberRoleText = new ArrayList<DNBDecodedStringType>();
        }
        return this.familyTreeMemberRoleText;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link Events }
     *     
     */
    public Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link Events }
     *     
     */
    public void setEvents(Events value) {
        this.events = value;
    }

    /**
     * Gets the value of the shareholdingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShareholdingAmount() {
        return shareholdingAmount;
    }

    /**
     * Sets the value of the shareholdingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShareholdingAmount(AmountType value) {
        this.shareholdingAmount = value;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * @return
     *     possible object is
     *     {@link Linkage }
     *     
     */
    public Linkage getLinkage() {
        return linkage;
    }

    /**
     * Sets the value of the linkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkage }
     *     
     */
    public void setLinkage(Linkage value) {
        this.linkage = value;
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

    /**
     * Gets the value of the nonSpecificDataProviderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonSpecificDataProviderText() {
        return nonSpecificDataProviderText;
    }

    /**
     * Sets the value of the nonSpecificDataProviderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonSpecificDataProviderText(String value) {
        this.nonSpecificDataProviderText = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationIdentificationNumber() {
        return organizationIdentificationNumber;
    }

    /**
     * Sets the value of the organizationIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationIdentificationNumber(String value) {
        this.organizationIdentificationNumber = value;
    }

    /**
     * Gets the value of the principalIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalIdentificationNumber() {
        return principalIdentificationNumber;
    }

    /**
     * Sets the value of the principalIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalIdentificationNumber(String value) {
        this.principalIdentificationNumber = value;
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
     * {@link PrincipalDetailForLinkage }
     * 
     * 
     */
    public List<PrincipalDetailForLinkage> getPrincipal() {
        if (principal == null) {
            principal = new ArrayList<PrincipalDetailForLinkage>();
        }
        return this.principal;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setBirthDate(DNBDateType value) {
        this.birthDate = value;
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
     * {@link OrganizationIdentificationNumberSimpleType }
     * 
     * 
     */
    public List<OrganizationIdentificationNumberSimpleType> getOrganizationIdentificationNumberDetail() {
        if (organizationIdentificationNumberDetail == null) {
            organizationIdentificationNumberDetail = new ArrayList<OrganizationIdentificationNumberSimpleType>();
        }
        return this.organizationIdentificationNumberDetail;
    }

    /**
     * Gets the value of the trusteeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrusteeIndicator() {
        return trusteeIndicator;
    }

    /**
     * Sets the value of the trusteeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrusteeIndicator(Boolean value) {
        this.trusteeIndicator = value;
    }

    /**
     * Gets the value of the principalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipalIndicator() {
        return principalIndicator;
    }

    /**
     * Sets the value of the principalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalIndicator(Boolean value) {
        this.principalIndicator = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setConfirmedDate(DNBDateType value) {
        this.confirmedDate = value;
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
     * Gets the value of the organizationStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationStartYear() {
        return organizationStartYear;
    }

    /**
     * Sets the value of the organizationStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationStartYear(String value) {
        this.organizationStartYear = value;
    }

    /**
     * Gets the value of the dnbStandardRating property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStandardRatingTypeForPrincipal }
     *     
     */
    public DNBStandardRatingTypeForPrincipal getDNBStandardRating() {
        return dnbStandardRating;
    }

    /**
     * Sets the value of the dnbStandardRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStandardRatingTypeForPrincipal }
     *     
     */
    public void setDNBStandardRating(DNBStandardRatingTypeForPrincipal value) {
        this.dnbStandardRating = value;
    }

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
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
     * {@link RegisteredAddressNewType }
     * 
     * 
     */
    public List<RegisteredAddressNewType> getRegisteredAddress() {
        if (registeredAddress == null) {
            registeredAddress = new ArrayList<RegisteredAddressNewType>();
        }
        return this.registeredAddress;
    }

    /**
     * Gets the value of the nameAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getNameAddressText() {
        return nameAddressText;
    }

    /**
     * Sets the value of the nameAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setNameAddressText(DNBStringType256 value) {
        this.nameAddressText = value;
    }

}
