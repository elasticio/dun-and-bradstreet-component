
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CompanyServiceV2.0}OrganizationPrimaryNameType"/>
 *         &lt;element name="TradeStyleName" type="{http://services.dnb.com/CompanyServiceV2.0}OrganizationNameBaseType" minOccurs="0"/>
 *         &lt;element name="SeniorPrincipalName" type="{http://services.dnb.com/CompanyServiceV2.0}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CompanyServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://services.dnb.com/CompanyServiceV2.0}MailAddressType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CompanyServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="WebPageAddress" type="{http://services.dnb.com/CompanyServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/CompanyServiceV2.0}FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StandaloneOrganizationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CompanyServiceV2.0}OrganizationIdentificationNumberType" minOccurs="0"/>
 *         &lt;element name="MatchQualityInformation" type="{http://services.dnb.com/CompanyServiceV2.0}MatchQualityInformation" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "MatchResult", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "dunsNumber",
    "subjectID",
    "organizationPrimaryName",
    "tradeStyleName",
    "seniorPrincipalName",
    "primaryAddress",
    "mailingAddress",
    "telephoneNumber",
    "webPageAddress",
    "operatingStatusText",
    "familyTreeMemberRole",
    "marketabilityIndicator",
    "standaloneOrganizationIndicator",
    "organizationIdentificationNumberDetail",
    "matchQualityInformation",
    "displaySequence"
})
public class MatchResult {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectID")
    protected String subjectID;
    @XmlElement(name = "OrganizationPrimaryName", required = true)
    protected OrganizationPrimaryNameType organizationPrimaryName;
    @XmlElement(name = "TradeStyleName")
    protected OrganizationNameBaseType tradeStyleName;
    @XmlElement(name = "SeniorPrincipalName")
    protected IndividualNameType seniorPrincipalName;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddressType primaryAddress;
    @XmlElement(name = "MailingAddress")
    protected MailAddressType mailingAddress;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberType telephoneNumber;
    @XmlElement(name = "WebPageAddress")
    protected WebPageAddressType webPageAddress;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "FamilyTreeMemberRole")
    protected List<FamilyTreeMemberRole> familyTreeMemberRole;
    @XmlElement(name = "MarketabilityIndicator")
    protected Boolean marketabilityIndicator;
    @XmlElement(name = "StandaloneOrganizationIndicator")
    protected Boolean standaloneOrganizationIndicator;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected OrganizationIdentificationNumberType organizationIdentificationNumberDetail;
    @XmlElement(name = "MatchQualityInformation")
    protected MatchQualityInformation matchQualityInformation;
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
     * @return
     *     possible object is
     *     {@link OrganizationNameBaseType }
     *     
     */
    public OrganizationNameBaseType getTradeStyleName() {
        return tradeStyleName;
    }

    /**
     * Sets the value of the tradeStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationNameBaseType }
     *     
     */
    public void setTradeStyleName(OrganizationNameBaseType value) {
        this.tradeStyleName = value;
    }

    /**
     * Gets the value of the seniorPrincipalName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getSeniorPrincipalName() {
        return seniorPrincipalName;
    }

    /**
     * Sets the value of the seniorPrincipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setSeniorPrincipalName(IndividualNameType value) {
        this.seniorPrincipalName = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setPrimaryAddress(PrimaryAddressType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddressType }
     *     
     */
    public MailAddressType getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddressType }
     *     
     */
    public void setMailingAddress(MailAddressType value) {
        this.mailingAddress = value;
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
     * Gets the value of the webPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getWebPageAddress() {
        return webPageAddress;
    }

    /**
     * Sets the value of the webPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setWebPageAddress(WebPageAddressType value) {
        this.webPageAddress = value;
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
     * Gets the value of the standaloneOrganizationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandaloneOrganizationIndicator() {
        return standaloneOrganizationIndicator;
    }

    /**
     * Sets the value of the standaloneOrganizationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandaloneOrganizationIndicator(Boolean value) {
        this.standaloneOrganizationIndicator = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberType }
     *     
     */
    public OrganizationIdentificationNumberType getOrganizationIdentificationNumberDetail() {
        return organizationIdentificationNumberDetail;
    }

    /**
     * Sets the value of the organizationIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberType }
     *     
     */
    public void setOrganizationIdentificationNumberDetail(OrganizationIdentificationNumberType value) {
        this.organizationIdentificationNumberDetail = value;
    }

    /**
     * Gets the value of the matchQualityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MatchQualityInformation }
     *     
     */
    public MatchQualityInformation getMatchQualityInformation() {
        return matchQualityInformation;
    }

    /**
     * Sets the value of the matchQualityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchQualityInformation }
     *     
     */
    public void setMatchQualityInformation(MatchQualityInformation value) {
        this.matchQualityInformation = value;
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
