
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationPrimaryNameType"/>
 *         &lt;element name="TradeStyleName" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/EntityListServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://services.dnb.com/EntityListServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/EntityListServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="FacsimileNumber" type="{http://services.dnb.com/EntityListServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/EntityListServiceV2.0}FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StandaloneOrganizationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubjectHandling" type="{http://services.dnb.com/EntityListServiceV2.0}SubjectHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ManufacturingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetails" type="{http://services.dnb.com/EntityListServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="PubliclyTradedCompanyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpwardFamilyMemberPubliclyTradedCompanyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockExchangeDetails" type="{http://services.dnb.com/EntityListServiceV2.0}StockExchangeDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesRevenueAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
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
@XmlType(name = "SearchResult", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationPrimaryName",
    "tradeStyleName",
    "marketabilityIndicator",
    "primaryAddress",
    "mailingAddress",
    "telephoneNumber",
    "facsimileNumber",
    "familyTreeMemberRole",
    "standaloneOrganizationIndicator",
    "subjectHandling",
    "industryCode",
    "manufacturingIndicator",
    "consolidatedEmployeeDetails",
    "publiclyTradedCompanyIndicator",
    "upwardFamilyMemberPubliclyTradedCompanyIndicator",
    "stockExchangeDetails",
    "salesRevenueAmount",
    "displaySequence"
})
public class SearchResult {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "OrganizationPrimaryName", required = true)
    protected OrganizationPrimaryNameType organizationPrimaryName;
    @XmlElement(name = "TradeStyleName")
    protected List<OrganizationNameBaseType> tradeStyleName;
    @XmlElement(name = "MarketabilityIndicator")
    protected Boolean marketabilityIndicator;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddressType primaryAddress;
    @XmlElement(name = "MailingAddress")
    protected PrimaryAddressType mailingAddress;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberType telephoneNumber;
    @XmlElement(name = "FacsimileNumber")
    protected TelecommunicationNumberType facsimileNumber;
    @XmlElement(name = "FamilyTreeMemberRole")
    protected List<FamilyTreeMemberRole> familyTreeMemberRole;
    @XmlElement(name = "StandaloneOrganizationIndicator")
    protected Boolean standaloneOrganizationIndicator;
    @XmlElement(name = "SubjectHandling")
    protected List<SubjectHandling> subjectHandling;
    @XmlElement(name = "IndustryCode")
    protected List<IndustryCodeType> industryCode;
    @XmlElement(name = "ManufacturingIndicator")
    protected Boolean manufacturingIndicator;
    @XmlElement(name = "ConsolidatedEmployeeDetails")
    protected EmployeeDetailsType consolidatedEmployeeDetails;
    @XmlElement(name = "PubliclyTradedCompanyIndicator")
    protected Boolean publiclyTradedCompanyIndicator;
    @XmlElement(name = "UpwardFamilyMemberPubliclyTradedCompanyIndicator")
    protected Boolean upwardFamilyMemberPubliclyTradedCompanyIndicator;
    @XmlElement(name = "StockExchangeDetails")
    protected List<StockExchangeDetails> stockExchangeDetails;
    @XmlElement(name = "SalesRevenueAmount")
    protected AmountType salesRevenueAmount;
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
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setMailingAddress(PrimaryAddressType value) {
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
     * Gets the value of the facsimileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public TelecommunicationNumberType getFacsimileNumber() {
        return facsimileNumber;
    }

    /**
     * Sets the value of the facsimileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public void setFacsimileNumber(TelecommunicationNumberType value) {
        this.facsimileNumber = value;
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
     * Gets the value of the publiclyTradedCompanyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPubliclyTradedCompanyIndicator() {
        return publiclyTradedCompanyIndicator;
    }

    /**
     * Sets the value of the publiclyTradedCompanyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPubliclyTradedCompanyIndicator(Boolean value) {
        this.publiclyTradedCompanyIndicator = value;
    }

    /**
     * Gets the value of the upwardFamilyMemberPubliclyTradedCompanyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpwardFamilyMemberPubliclyTradedCompanyIndicator() {
        return upwardFamilyMemberPubliclyTradedCompanyIndicator;
    }

    /**
     * Sets the value of the upwardFamilyMemberPubliclyTradedCompanyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpwardFamilyMemberPubliclyTradedCompanyIndicator(Boolean value) {
        this.upwardFamilyMemberPubliclyTradedCompanyIndicator = value;
    }

    /**
     * Gets the value of the stockExchangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockExchangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockExchangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockExchangeDetails }
     * 
     * 
     */
    public List<StockExchangeDetails> getStockExchangeDetails() {
        if (stockExchangeDetails == null) {
            stockExchangeDetails = new ArrayList<StockExchangeDetails>();
        }
        return this.stockExchangeDetails;
    }

    /**
     * Gets the value of the salesRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesRevenueAmount() {
        return salesRevenueAmount;
    }

    /**
     * Sets the value of the salesRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesRevenueAmount(AmountType value) {
        this.salesRevenueAmount = value;
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
