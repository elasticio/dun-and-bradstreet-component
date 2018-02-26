
package com.dnb.services.entitylist;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationNameSimpleType" minOccurs="0"/>
 *         &lt;element name="WebPageAddress" type="{http://services.dnb.com/EntityListServiceV2.0}SearchWebPageAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/EntityListServiceV2.0}SearchLocation" minOccurs="0"/>
 *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/EntityListServiceV2.0}FamilyTreeMemberRoleCodeType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="StandaloneOrganizationIndicator" type="{http://services.dnb.com/EntityListServiceV2.0}StandaloneOrganizationIndicatorType" minOccurs="0"/>
 *         &lt;element name="IndustryCodeDetail" type="{http://services.dnb.com/EntityListServiceV2.0}SearchIndustryCodeType" minOccurs="0"/>
 *         &lt;element name="LegalFormDetail" type="{http://services.dnb.com/EntityListServiceV2.0}LegalFormDetailsCodeType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ControlOwnershipTypeCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ControlOwnershipFromYear" type="{http://services.dnb.com/EntityListServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="ControlOwnershipToYear" type="{http://services.dnb.com/EntityListServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="OrganizationStartFromYear" type="{http://services.dnb.com/EntityListServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="OrganizationStartToYear" type="{http://services.dnb.com/EntityListServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="MarketingRiskClassCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://services.dnb.com/EntityListServiceV2.0}MarketingRiskClassCodeEnum">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GlobalUltimateDUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="FiscalPeriodEndMonth" type="{http://services.dnb.com/EntityListServiceV2.0}MonthType" maxOccurs="12" minOccurs="0"/>
 *         &lt;element name="AuditorID" type="{http://services.dnb.com/EntityListServiceV2.0}TypeTextStringType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="UnderwriterID" type="{http://services.dnb.com/EntityListServiceV2.0}TypeTextStringType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="DUNSNumberLowRangeValue" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="DUNSNumberHighRangeValue" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SalesLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SalesHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssetLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssetHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MarketCapitalizationLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MarketCapitalizationHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NetIncomeLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NetIncomeHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NetIncomeGrowthLowRangePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetIncomeGrowthHighRangePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndividualEntityEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndividualEntityEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeesGrowthLowRangePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsolidatedEmployeesGrowthHighRangePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesGrowthLowRangePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesGrowthHighRangePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PremisesAreaDetail" type="{http://services.dnb.com/EntityListServiceV2.0}PremisesAreaDetail" minOccurs="0"/>
 *         &lt;element name="PubliclyTradedCompanyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpwardFamilyMemberPubliclyTradedCompanyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockExchangeNameCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StockExchangeTickerName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InitialPublicOfferingFilingFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingFilingToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingTradingFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingTradingToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingShareValueLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="InitialPublicOfferingShareValueHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAssessmentTypeCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SocioEconomicIdentification" type="{http://services.dnb.com/EntityListServiceV2.0}SearchInquirySocioEconomicType" minOccurs="0"/>
 *         &lt;element name="KeywordText" type="{http://services.dnb.com/EntityListServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationIdentificationNumberSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FranchisingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManufacturingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchInquiryDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationName",
    "webPageAddress",
    "location",
    "familyTreeMemberRole",
    "standaloneOrganizationIndicator",
    "industryCodeDetail",
    "legalFormDetail",
    "controlOwnershipTypeCode",
    "controlOwnershipFromYear",
    "controlOwnershipToYear",
    "organizationStartFromYear",
    "organizationStartToYear",
    "marketingRiskClassCode",
    "globalUltimateDUNSNumber",
    "fiscalPeriodEndMonth",
    "auditorID",
    "underwriterID",
    "dunsNumberLowRangeValue",
    "dunsNumberHighRangeValue",
    "salesLowRangeAmount",
    "salesHighRangeAmount",
    "totalAssetLowRangeAmount",
    "totalAssetHighRangeAmount",
    "marketCapitalizationLowRangeAmount",
    "marketCapitalizationHighRangeAmount",
    "netIncomeLowRangeAmount",
    "netIncomeHighRangeAmount",
    "netIncomeGrowthLowRangePercentage",
    "netIncomeGrowthHighRangePercentage",
    "individualEntityEmployeeLowRangeQuantity",
    "individualEntityEmployeeHighRangeQuantity",
    "consolidatedEmployeeLowRangeQuantity",
    "consolidatedEmployeeHighRangeQuantity",
    "consolidatedEmployeesGrowthLowRangePercentage",
    "consolidatedEmployeesGrowthHighRangePercentage",
    "salesGrowthLowRangePercentage",
    "salesGrowthHighRangePercentage",
    "premisesAreaDetail",
    "publiclyTradedCompanyIndicator",
    "upwardFamilyMemberPubliclyTradedCompanyIndicator",
    "stockExchangeNameCode",
    "stockExchangeTickerName",
    "initialPublicOfferingFilingFromDate",
    "initialPublicOfferingFilingToDate",
    "initialPublicOfferingTradingFromDate",
    "initialPublicOfferingTradingToDate",
    "initialPublicOfferingLowRangeAmount",
    "initialPublicOfferingHighRangeAmount",
    "initialPublicOfferingShareValueLowRangeAmount",
    "initialPublicOfferingShareValueHighRangeAmount",
    "thirdPartyAssessmentTypeCode",
    "socioEconomicIdentification",
    "keywordText",
    "organizationIdentificationNumberDetail",
    "franchisingIndicator",
    "importIndicator",
    "exportIndicator",
    "manufacturingIndicator"
})
@XmlSeeAlso({
    SearchContactInquiryDetail.class
})
public class SearchInquiryDetail {

    @XmlElement(name = "DUNSNumber")
    protected List<String> dunsNumber;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "WebPageAddress")
    protected List<SearchWebPageAddressType> webPageAddress;
    @XmlElement(name = "Location")
    protected SearchLocation location;
    @XmlElement(name = "FamilyTreeMemberRole")
    protected List<FamilyTreeMemberRoleCodeType> familyTreeMemberRole;
    @XmlElement(name = "StandaloneOrganizationIndicator")
    protected Boolean standaloneOrganizationIndicator;
    @XmlElement(name = "IndustryCodeDetail")
    protected SearchIndustryCodeType industryCodeDetail;
    @XmlElement(name = "LegalFormDetail")
    protected List<LegalFormDetailsCodeType> legalFormDetail;
    @XmlElement(name = "ControlOwnershipTypeCode")
    protected List<BigInteger> controlOwnershipTypeCode;
    @XmlElement(name = "ControlOwnershipFromYear")
    protected String controlOwnershipFromYear;
    @XmlElement(name = "ControlOwnershipToYear")
    protected String controlOwnershipToYear;
    @XmlElement(name = "OrganizationStartFromYear")
    protected String organizationStartFromYear;
    @XmlElement(name = "OrganizationStartToYear")
    protected String organizationStartToYear;
    @XmlElement(name = "MarketingRiskClassCode")
    protected List<BigInteger> marketingRiskClassCode;
    @XmlElement(name = "GlobalUltimateDUNSNumber")
    protected List<String> globalUltimateDUNSNumber;
    @XmlElement(name = "FiscalPeriodEndMonth")
    @XmlSchemaType(name = "gMonth")
    protected List<XMLGregorianCalendar> fiscalPeriodEndMonth;
    @XmlElement(name = "AuditorID")
    protected List<TypeTextStringType> auditorID;
    @XmlElement(name = "UnderwriterID")
    protected List<TypeTextStringType> underwriterID;
    @XmlElement(name = "DUNSNumberLowRangeValue")
    protected String dunsNumberLowRangeValue;
    @XmlElement(name = "DUNSNumberHighRangeValue")
    protected String dunsNumberHighRangeValue;
    @XmlElement(name = "SalesLowRangeAmount")
    protected AmountType salesLowRangeAmount;
    @XmlElement(name = "SalesHighRangeAmount")
    protected AmountType salesHighRangeAmount;
    @XmlElement(name = "TotalAssetLowRangeAmount")
    protected AmountType totalAssetLowRangeAmount;
    @XmlElement(name = "TotalAssetHighRangeAmount")
    protected AmountType totalAssetHighRangeAmount;
    @XmlElement(name = "MarketCapitalizationLowRangeAmount")
    protected AmountType marketCapitalizationLowRangeAmount;
    @XmlElement(name = "MarketCapitalizationHighRangeAmount")
    protected AmountType marketCapitalizationHighRangeAmount;
    @XmlElement(name = "NetIncomeLowRangeAmount")
    protected AmountType netIncomeLowRangeAmount;
    @XmlElement(name = "NetIncomeHighRangeAmount")
    protected AmountType netIncomeHighRangeAmount;
    @XmlElement(name = "NetIncomeGrowthLowRangePercentage")
    protected BigDecimal netIncomeGrowthLowRangePercentage;
    @XmlElement(name = "NetIncomeGrowthHighRangePercentage")
    protected BigDecimal netIncomeGrowthHighRangePercentage;
    @XmlElement(name = "IndividualEntityEmployeeLowRangeQuantity")
    protected Integer individualEntityEmployeeLowRangeQuantity;
    @XmlElement(name = "IndividualEntityEmployeeHighRangeQuantity")
    protected Integer individualEntityEmployeeHighRangeQuantity;
    @XmlElement(name = "ConsolidatedEmployeeLowRangeQuantity")
    protected Integer consolidatedEmployeeLowRangeQuantity;
    @XmlElement(name = "ConsolidatedEmployeeHighRangeQuantity")
    protected Integer consolidatedEmployeeHighRangeQuantity;
    @XmlElement(name = "ConsolidatedEmployeesGrowthLowRangePercentage")
    protected BigDecimal consolidatedEmployeesGrowthLowRangePercentage;
    @XmlElement(name = "ConsolidatedEmployeesGrowthHighRangePercentage")
    protected BigDecimal consolidatedEmployeesGrowthHighRangePercentage;
    @XmlElement(name = "SalesGrowthLowRangePercentage")
    protected BigDecimal salesGrowthLowRangePercentage;
    @XmlElement(name = "SalesGrowthHighRangePercentage")
    protected BigDecimal salesGrowthHighRangePercentage;
    @XmlElement(name = "PremisesAreaDetail")
    protected PremisesAreaDetail premisesAreaDetail;
    @XmlElement(name = "PubliclyTradedCompanyIndicator")
    protected Boolean publiclyTradedCompanyIndicator;
    @XmlElement(name = "UpwardFamilyMemberPubliclyTradedCompanyIndicator")
    protected Boolean upwardFamilyMemberPubliclyTradedCompanyIndicator;
    @XmlElement(name = "StockExchangeNameCode")
    protected List<BigInteger> stockExchangeNameCode;
    @XmlElement(name = "StockExchangeTickerName")
    protected String stockExchangeTickerName;
    @XmlElement(name = "InitialPublicOfferingFilingFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialPublicOfferingFilingFromDate;
    @XmlElement(name = "InitialPublicOfferingFilingToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialPublicOfferingFilingToDate;
    @XmlElement(name = "InitialPublicOfferingTradingFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialPublicOfferingTradingFromDate;
    @XmlElement(name = "InitialPublicOfferingTradingToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialPublicOfferingTradingToDate;
    @XmlElement(name = "InitialPublicOfferingLowRangeAmount")
    protected AmountType initialPublicOfferingLowRangeAmount;
    @XmlElement(name = "InitialPublicOfferingHighRangeAmount")
    protected AmountType initialPublicOfferingHighRangeAmount;
    @XmlElement(name = "InitialPublicOfferingShareValueLowRangeAmount")
    protected AmountType initialPublicOfferingShareValueLowRangeAmount;
    @XmlElement(name = "InitialPublicOfferingShareValueHighRangeAmount")
    protected AmountType initialPublicOfferingShareValueHighRangeAmount;
    @XmlElement(name = "ThirdPartyAssessmentTypeCode")
    protected List<BigInteger> thirdPartyAssessmentTypeCode;
    @XmlElement(name = "SocioEconomicIdentification")
    protected SearchInquirySocioEconomicType socioEconomicIdentification;
    @XmlElement(name = "KeywordText")
    protected String keywordText;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected List<OrganizationIdentificationNumberSimpleType> organizationIdentificationNumberDetail;
    @XmlElement(name = "FranchisingIndicator")
    protected Boolean franchisingIndicator;
    @XmlElement(name = "ImportIndicator")
    protected Boolean importIndicator;
    @XmlElement(name = "ExportIndicator")
    protected Boolean exportIndicator;
    @XmlElement(name = "ManufacturingIndicator")
    protected Boolean manufacturingIndicator;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dunsNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUNSNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDUNSNumber() {
        if (dunsNumber == null) {
            dunsNumber = new ArrayList<String>();
        }
        return this.dunsNumber;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the webPageAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webPageAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebPageAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchWebPageAddressType }
     * 
     * 
     */
    public List<SearchWebPageAddressType> getWebPageAddress() {
        if (webPageAddress == null) {
            webPageAddress = new ArrayList<SearchWebPageAddressType>();
        }
        return this.webPageAddress;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLocation }
     *     
     */
    public SearchLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLocation }
     *     
     */
    public void setLocation(SearchLocation value) {
        this.location = value;
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
     * {@link FamilyTreeMemberRoleCodeType }
     * 
     * 
     */
    public List<FamilyTreeMemberRoleCodeType> getFamilyTreeMemberRole() {
        if (familyTreeMemberRole == null) {
            familyTreeMemberRole = new ArrayList<FamilyTreeMemberRoleCodeType>();
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
     * Gets the value of the industryCodeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIndustryCodeType }
     *     
     */
    public SearchIndustryCodeType getIndustryCodeDetail() {
        return industryCodeDetail;
    }

    /**
     * Sets the value of the industryCodeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIndustryCodeType }
     *     
     */
    public void setIndustryCodeDetail(SearchIndustryCodeType value) {
        this.industryCodeDetail = value;
    }

    /**
     * Gets the value of the legalFormDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalFormDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalFormDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalFormDetailsCodeType }
     * 
     * 
     */
    public List<LegalFormDetailsCodeType> getLegalFormDetail() {
        if (legalFormDetail == null) {
            legalFormDetail = new ArrayList<LegalFormDetailsCodeType>();
        }
        return this.legalFormDetail;
    }

    /**
     * Gets the value of the controlOwnershipTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlOwnershipTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlOwnershipTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getControlOwnershipTypeCode() {
        if (controlOwnershipTypeCode == null) {
            controlOwnershipTypeCode = new ArrayList<BigInteger>();
        }
        return this.controlOwnershipTypeCode;
    }

    /**
     * Gets the value of the controlOwnershipFromYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlOwnershipFromYear() {
        return controlOwnershipFromYear;
    }

    /**
     * Sets the value of the controlOwnershipFromYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlOwnershipFromYear(String value) {
        this.controlOwnershipFromYear = value;
    }

    /**
     * Gets the value of the controlOwnershipToYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlOwnershipToYear() {
        return controlOwnershipToYear;
    }

    /**
     * Sets the value of the controlOwnershipToYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlOwnershipToYear(String value) {
        this.controlOwnershipToYear = value;
    }

    /**
     * Gets the value of the organizationStartFromYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationStartFromYear() {
        return organizationStartFromYear;
    }

    /**
     * Sets the value of the organizationStartFromYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationStartFromYear(String value) {
        this.organizationStartFromYear = value;
    }

    /**
     * Gets the value of the organizationStartToYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationStartToYear() {
        return organizationStartToYear;
    }

    /**
     * Sets the value of the organizationStartToYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationStartToYear(String value) {
        this.organizationStartToYear = value;
    }

    /**
     * Gets the value of the marketingRiskClassCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingRiskClassCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingRiskClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getMarketingRiskClassCode() {
        if (marketingRiskClassCode == null) {
            marketingRiskClassCode = new ArrayList<BigInteger>();
        }
        return this.marketingRiskClassCode;
    }

    /**
     * Gets the value of the globalUltimateDUNSNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalUltimateDUNSNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalUltimateDUNSNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGlobalUltimateDUNSNumber() {
        if (globalUltimateDUNSNumber == null) {
            globalUltimateDUNSNumber = new ArrayList<String>();
        }
        return this.globalUltimateDUNSNumber;
    }

    /**
     * Gets the value of the fiscalPeriodEndMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiscalPeriodEndMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiscalPeriodEndMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getFiscalPeriodEndMonth() {
        if (fiscalPeriodEndMonth == null) {
            fiscalPeriodEndMonth = new ArrayList<XMLGregorianCalendar>();
        }
        return this.fiscalPeriodEndMonth;
    }

    /**
     * Gets the value of the auditorID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditorID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditorID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextStringType }
     * 
     * 
     */
    public List<TypeTextStringType> getAuditorID() {
        if (auditorID == null) {
            auditorID = new ArrayList<TypeTextStringType>();
        }
        return this.auditorID;
    }

    /**
     * Gets the value of the underwriterID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underwriterID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderwriterID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextStringType }
     * 
     * 
     */
    public List<TypeTextStringType> getUnderwriterID() {
        if (underwriterID == null) {
            underwriterID = new ArrayList<TypeTextStringType>();
        }
        return this.underwriterID;
    }

    /**
     * Gets the value of the dunsNumberLowRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumberLowRangeValue() {
        return dunsNumberLowRangeValue;
    }

    /**
     * Sets the value of the dunsNumberLowRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumberLowRangeValue(String value) {
        this.dunsNumberLowRangeValue = value;
    }

    /**
     * Gets the value of the dunsNumberHighRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumberHighRangeValue() {
        return dunsNumberHighRangeValue;
    }

    /**
     * Sets the value of the dunsNumberHighRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumberHighRangeValue(String value) {
        this.dunsNumberHighRangeValue = value;
    }

    /**
     * Gets the value of the salesLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesLowRangeAmount() {
        return salesLowRangeAmount;
    }

    /**
     * Sets the value of the salesLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesLowRangeAmount(AmountType value) {
        this.salesLowRangeAmount = value;
    }

    /**
     * Gets the value of the salesHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesHighRangeAmount() {
        return salesHighRangeAmount;
    }

    /**
     * Sets the value of the salesHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesHighRangeAmount(AmountType value) {
        this.salesHighRangeAmount = value;
    }

    /**
     * Gets the value of the totalAssetLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssetLowRangeAmount() {
        return totalAssetLowRangeAmount;
    }

    /**
     * Sets the value of the totalAssetLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssetLowRangeAmount(AmountType value) {
        this.totalAssetLowRangeAmount = value;
    }

    /**
     * Gets the value of the totalAssetHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssetHighRangeAmount() {
        return totalAssetHighRangeAmount;
    }

    /**
     * Sets the value of the totalAssetHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssetHighRangeAmount(AmountType value) {
        this.totalAssetHighRangeAmount = value;
    }

    /**
     * Gets the value of the marketCapitalizationLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMarketCapitalizationLowRangeAmount() {
        return marketCapitalizationLowRangeAmount;
    }

    /**
     * Sets the value of the marketCapitalizationLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMarketCapitalizationLowRangeAmount(AmountType value) {
        this.marketCapitalizationLowRangeAmount = value;
    }

    /**
     * Gets the value of the marketCapitalizationHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMarketCapitalizationHighRangeAmount() {
        return marketCapitalizationHighRangeAmount;
    }

    /**
     * Sets the value of the marketCapitalizationHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMarketCapitalizationHighRangeAmount(AmountType value) {
        this.marketCapitalizationHighRangeAmount = value;
    }

    /**
     * Gets the value of the netIncomeLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetIncomeLowRangeAmount() {
        return netIncomeLowRangeAmount;
    }

    /**
     * Sets the value of the netIncomeLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetIncomeLowRangeAmount(AmountType value) {
        this.netIncomeLowRangeAmount = value;
    }

    /**
     * Gets the value of the netIncomeHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetIncomeHighRangeAmount() {
        return netIncomeHighRangeAmount;
    }

    /**
     * Sets the value of the netIncomeHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetIncomeHighRangeAmount(AmountType value) {
        this.netIncomeHighRangeAmount = value;
    }

    /**
     * Gets the value of the netIncomeGrowthLowRangePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetIncomeGrowthLowRangePercentage() {
        return netIncomeGrowthLowRangePercentage;
    }

    /**
     * Sets the value of the netIncomeGrowthLowRangePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetIncomeGrowthLowRangePercentage(BigDecimal value) {
        this.netIncomeGrowthLowRangePercentage = value;
    }

    /**
     * Gets the value of the netIncomeGrowthHighRangePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetIncomeGrowthHighRangePercentage() {
        return netIncomeGrowthHighRangePercentage;
    }

    /**
     * Sets the value of the netIncomeGrowthHighRangePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetIncomeGrowthHighRangePercentage(BigDecimal value) {
        this.netIncomeGrowthHighRangePercentage = value;
    }

    /**
     * Gets the value of the individualEntityEmployeeLowRangeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndividualEntityEmployeeLowRangeQuantity() {
        return individualEntityEmployeeLowRangeQuantity;
    }

    /**
     * Sets the value of the individualEntityEmployeeLowRangeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndividualEntityEmployeeLowRangeQuantity(Integer value) {
        this.individualEntityEmployeeLowRangeQuantity = value;
    }

    /**
     * Gets the value of the individualEntityEmployeeHighRangeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndividualEntityEmployeeHighRangeQuantity() {
        return individualEntityEmployeeHighRangeQuantity;
    }

    /**
     * Sets the value of the individualEntityEmployeeHighRangeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndividualEntityEmployeeHighRangeQuantity(Integer value) {
        this.individualEntityEmployeeHighRangeQuantity = value;
    }

    /**
     * Gets the value of the consolidatedEmployeeLowRangeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsolidatedEmployeeLowRangeQuantity() {
        return consolidatedEmployeeLowRangeQuantity;
    }

    /**
     * Sets the value of the consolidatedEmployeeLowRangeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsolidatedEmployeeLowRangeQuantity(Integer value) {
        this.consolidatedEmployeeLowRangeQuantity = value;
    }

    /**
     * Gets the value of the consolidatedEmployeeHighRangeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsolidatedEmployeeHighRangeQuantity() {
        return consolidatedEmployeeHighRangeQuantity;
    }

    /**
     * Sets the value of the consolidatedEmployeeHighRangeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsolidatedEmployeeHighRangeQuantity(Integer value) {
        this.consolidatedEmployeeHighRangeQuantity = value;
    }

    /**
     * Gets the value of the consolidatedEmployeesGrowthLowRangePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsolidatedEmployeesGrowthLowRangePercentage() {
        return consolidatedEmployeesGrowthLowRangePercentage;
    }

    /**
     * Sets the value of the consolidatedEmployeesGrowthLowRangePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsolidatedEmployeesGrowthLowRangePercentage(BigDecimal value) {
        this.consolidatedEmployeesGrowthLowRangePercentage = value;
    }

    /**
     * Gets the value of the consolidatedEmployeesGrowthHighRangePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsolidatedEmployeesGrowthHighRangePercentage() {
        return consolidatedEmployeesGrowthHighRangePercentage;
    }

    /**
     * Sets the value of the consolidatedEmployeesGrowthHighRangePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsolidatedEmployeesGrowthHighRangePercentage(BigDecimal value) {
        this.consolidatedEmployeesGrowthHighRangePercentage = value;
    }

    /**
     * Gets the value of the salesGrowthLowRangePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesGrowthLowRangePercentage() {
        return salesGrowthLowRangePercentage;
    }

    /**
     * Sets the value of the salesGrowthLowRangePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesGrowthLowRangePercentage(BigDecimal value) {
        this.salesGrowthLowRangePercentage = value;
    }

    /**
     * Gets the value of the salesGrowthHighRangePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesGrowthHighRangePercentage() {
        return salesGrowthHighRangePercentage;
    }

    /**
     * Sets the value of the salesGrowthHighRangePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesGrowthHighRangePercentage(BigDecimal value) {
        this.salesGrowthHighRangePercentage = value;
    }

    /**
     * Gets the value of the premisesAreaDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesAreaDetail }
     *     
     */
    public PremisesAreaDetail getPremisesAreaDetail() {
        return premisesAreaDetail;
    }

    /**
     * Sets the value of the premisesAreaDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesAreaDetail }
     *     
     */
    public void setPremisesAreaDetail(PremisesAreaDetail value) {
        this.premisesAreaDetail = value;
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
     * Gets the value of the stockExchangeNameCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockExchangeNameCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockExchangeNameCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getStockExchangeNameCode() {
        if (stockExchangeNameCode == null) {
            stockExchangeNameCode = new ArrayList<BigInteger>();
        }
        return this.stockExchangeNameCode;
    }

    /**
     * Gets the value of the stockExchangeTickerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchangeTickerName() {
        return stockExchangeTickerName;
    }

    /**
     * Sets the value of the stockExchangeTickerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchangeTickerName(String value) {
        this.stockExchangeTickerName = value;
    }

    /**
     * Gets the value of the initialPublicOfferingFilingFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialPublicOfferingFilingFromDate() {
        return initialPublicOfferingFilingFromDate;
    }

    /**
     * Sets the value of the initialPublicOfferingFilingFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialPublicOfferingFilingFromDate(XMLGregorianCalendar value) {
        this.initialPublicOfferingFilingFromDate = value;
    }

    /**
     * Gets the value of the initialPublicOfferingFilingToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialPublicOfferingFilingToDate() {
        return initialPublicOfferingFilingToDate;
    }

    /**
     * Sets the value of the initialPublicOfferingFilingToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialPublicOfferingFilingToDate(XMLGregorianCalendar value) {
        this.initialPublicOfferingFilingToDate = value;
    }

    /**
     * Gets the value of the initialPublicOfferingTradingFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialPublicOfferingTradingFromDate() {
        return initialPublicOfferingTradingFromDate;
    }

    /**
     * Sets the value of the initialPublicOfferingTradingFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialPublicOfferingTradingFromDate(XMLGregorianCalendar value) {
        this.initialPublicOfferingTradingFromDate = value;
    }

    /**
     * Gets the value of the initialPublicOfferingTradingToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialPublicOfferingTradingToDate() {
        return initialPublicOfferingTradingToDate;
    }

    /**
     * Sets the value of the initialPublicOfferingTradingToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialPublicOfferingTradingToDate(XMLGregorianCalendar value) {
        this.initialPublicOfferingTradingToDate = value;
    }

    /**
     * Gets the value of the initialPublicOfferingLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialPublicOfferingLowRangeAmount() {
        return initialPublicOfferingLowRangeAmount;
    }

    /**
     * Sets the value of the initialPublicOfferingLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialPublicOfferingLowRangeAmount(AmountType value) {
        this.initialPublicOfferingLowRangeAmount = value;
    }

    /**
     * Gets the value of the initialPublicOfferingHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialPublicOfferingHighRangeAmount() {
        return initialPublicOfferingHighRangeAmount;
    }

    /**
     * Sets the value of the initialPublicOfferingHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialPublicOfferingHighRangeAmount(AmountType value) {
        this.initialPublicOfferingHighRangeAmount = value;
    }

    /**
     * Gets the value of the initialPublicOfferingShareValueLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialPublicOfferingShareValueLowRangeAmount() {
        return initialPublicOfferingShareValueLowRangeAmount;
    }

    /**
     * Sets the value of the initialPublicOfferingShareValueLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialPublicOfferingShareValueLowRangeAmount(AmountType value) {
        this.initialPublicOfferingShareValueLowRangeAmount = value;
    }

    /**
     * Gets the value of the initialPublicOfferingShareValueHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialPublicOfferingShareValueHighRangeAmount() {
        return initialPublicOfferingShareValueHighRangeAmount;
    }

    /**
     * Sets the value of the initialPublicOfferingShareValueHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialPublicOfferingShareValueHighRangeAmount(AmountType value) {
        this.initialPublicOfferingShareValueHighRangeAmount = value;
    }

    /**
     * Gets the value of the thirdPartyAssessmentTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyAssessmentTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyAssessmentTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getThirdPartyAssessmentTypeCode() {
        if (thirdPartyAssessmentTypeCode == null) {
            thirdPartyAssessmentTypeCode = new ArrayList<BigInteger>();
        }
        return this.thirdPartyAssessmentTypeCode;
    }

    /**
     * Gets the value of the socioEconomicIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInquirySocioEconomicType }
     *     
     */
    public SearchInquirySocioEconomicType getSocioEconomicIdentification() {
        return socioEconomicIdentification;
    }

    /**
     * Sets the value of the socioEconomicIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInquirySocioEconomicType }
     *     
     */
    public void setSocioEconomicIdentification(SearchInquirySocioEconomicType value) {
        this.socioEconomicIdentification = value;
    }

    /**
     * Gets the value of the keywordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordText() {
        return keywordText;
    }

    /**
     * Sets the value of the keywordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordText(String value) {
        this.keywordText = value;
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
     * Gets the value of the franchisingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFranchisingIndicator() {
        return franchisingIndicator;
    }

    /**
     * Sets the value of the franchisingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFranchisingIndicator(Boolean value) {
        this.franchisingIndicator = value;
    }

    /**
     * Gets the value of the importIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportIndicator() {
        return importIndicator;
    }

    /**
     * Sets the value of the importIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportIndicator(Boolean value) {
        this.importIndicator = value;
    }

    /**
     * Gets the value of the exportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportIndicator() {
        return exportIndicator;
    }

    /**
     * Sets the value of the exportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportIndicator(Boolean value) {
        this.exportIndicator = value;
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

}
