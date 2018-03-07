
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Subject">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="OrganizationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationDetail" minOccurs="0"/>
 *         &lt;element name="RegisteredDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredDetail" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCode" minOccurs="0"/>
 *         &lt;element name="ActivitiesAndOperations" type="{http://services.dnb.com/CustomProductServiceV2.0}ActivitiesAndOperations" minOccurs="0"/>
 *         &lt;element name="EmployeeFigures" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeFigures" minOccurs="0"/>
 *         &lt;element name="Linkage" type="{http://services.dnb.com/CustomProductServiceV2.0}Linkage" minOccurs="0"/>
 *         &lt;element name="ContactInterview" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactInterview" minOccurs="0"/>
 *         &lt;element name="Assessment" type="{http://services.dnb.com/CustomProductServiceV2.0}Assessment" minOccurs="0"/>
 *         &lt;element name="BusinessTrading" type="{http://services.dnb.com/CustomProductServiceV2.0}BusinessTrading" minOccurs="0"/>
 *         &lt;element name="PrincipalsAndManagement" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalsAndManagement" minOccurs="0"/>
 *         &lt;element name="SocioEconomicIdentification" type="{http://services.dnb.com/CustomProductServiceV2.0}SocioEconomicIdentification" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAssessment" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationThirdPartyAssessment" minOccurs="0"/>
 *         &lt;element name="DataSufficiency" type="{http://services.dnb.com/CustomProductServiceV2.0}DataSufficiency" minOccurs="0"/>
 *         &lt;element name="ComplianceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ComplianceDetail" minOccurs="0"/>
 *         &lt;element name="Competitors" type="{http://services.dnb.com/CustomProductServiceV2.0}Competitors" minOccurs="0"/>
 *         &lt;element name="News" type="{http://services.dnb.com/CustomProductServiceV2.0}News" minOccurs="0"/>
 *         &lt;element name="FinancialRelationship" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRelationship" minOccurs="0"/>
 *         &lt;element name="BorrowerAnalytics" type="{http://services.dnb.com/CustomProductServiceV2.0}BorrowerAnalytics" minOccurs="0"/>
 *         &lt;element name="ThirdPartyInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}ThirdPartyDataType" minOccurs="0"/>
 *         &lt;element name="BusinessSignals" type="{http://services.dnb.com/CustomProductServiceV2.0}BusinessSignalsSummaryType" minOccurs="0"/>
 *         &lt;element name="CommercialCollectionClaims" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCollectionClaims" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationName",
    "organizationDetail",
    "registeredDetail",
    "industryCode",
    "activitiesAndOperations",
    "employeeFigures",
    "linkage",
    "contactInterview",
    "assessment",
    "businessTrading",
    "principalsAndManagement",
    "socioEconomicIdentification",
    "thirdPartyAssessment",
    "dataSufficiency",
    "complianceDetail",
    "competitors",
    "news",
    "financialRelationship",
    "borrowerAnalytics",
    "thirdPartyInformation",
    "businessSignals",
    "commercialCollectionClaims"
})
public class Organization
    extends Subject
{

    @XmlElement(name = "OrganizationName")
    protected OrganizationName organizationName;
    @XmlElement(name = "OrganizationDetail")
    protected OrganizationDetail organizationDetail;
    @XmlElement(name = "RegisteredDetail")
    protected RegisteredDetail registeredDetail;
    @XmlElement(name = "IndustryCode")
    protected IndustryCode industryCode;
    @XmlElement(name = "ActivitiesAndOperations")
    protected ActivitiesAndOperations activitiesAndOperations;
    @XmlElement(name = "EmployeeFigures")
    protected EmployeeFigures employeeFigures;
    @XmlElement(name = "Linkage")
    protected Linkage linkage;
    @XmlElement(name = "ContactInterview")
    protected ContactInterview contactInterview;
    @XmlElement(name = "Assessment")
    protected Assessment assessment;
    @XmlElement(name = "BusinessTrading")
    protected BusinessTrading businessTrading;
    @XmlElement(name = "PrincipalsAndManagement")
    protected PrincipalsAndManagement principalsAndManagement;
    @XmlElement(name = "SocioEconomicIdentification")
    protected SocioEconomicIdentification socioEconomicIdentification;
    @XmlElement(name = "ThirdPartyAssessment")
    protected OrganizationThirdPartyAssessment thirdPartyAssessment;
    @XmlElement(name = "DataSufficiency")
    protected DataSufficiency dataSufficiency;
    @XmlElement(name = "ComplianceDetail")
    protected ComplianceDetail complianceDetail;
    @XmlElement(name = "Competitors")
    protected Competitors competitors;
    @XmlElement(name = "News")
    protected News news;
    @XmlElement(name = "FinancialRelationship")
    protected FinancialRelationship financialRelationship;
    @XmlElement(name = "BorrowerAnalytics")
    protected BorrowerAnalytics borrowerAnalytics;
    @XmlElement(name = "ThirdPartyInformation")
    protected ThirdPartyDataType thirdPartyInformation;
    @XmlElement(name = "BusinessSignals")
    protected BusinessSignalsSummaryType businessSignals;
    @XmlElement(name = "CommercialCollectionClaims")
    protected CommercialCollectionClaims commercialCollectionClaims;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName }
     *     
     */
    public OrganizationName getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName }
     *     
     */
    public void setOrganizationName(OrganizationName value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetail }
     *     
     */
    public OrganizationDetail getOrganizationDetail() {
        return organizationDetail;
    }

    /**
     * Sets the value of the organizationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetail }
     *     
     */
    public void setOrganizationDetail(OrganizationDetail value) {
        this.organizationDetail = value;
    }

    /**
     * Gets the value of the registeredDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredDetail }
     *     
     */
    public RegisteredDetail getRegisteredDetail() {
        return registeredDetail;
    }

    /**
     * Sets the value of the registeredDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredDetail }
     *     
     */
    public void setRegisteredDetail(RegisteredDetail value) {
        this.registeredDetail = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryCode }
     *     
     */
    public IndustryCode getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryCode }
     *     
     */
    public void setIndustryCode(IndustryCode value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the activitiesAndOperations property.
     * 
     * @return
     *     possible object is
     *     {@link ActivitiesAndOperations }
     *     
     */
    public ActivitiesAndOperations getActivitiesAndOperations() {
        return activitiesAndOperations;
    }

    /**
     * Sets the value of the activitiesAndOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitiesAndOperations }
     *     
     */
    public void setActivitiesAndOperations(ActivitiesAndOperations value) {
        this.activitiesAndOperations = value;
    }

    /**
     * Gets the value of the employeeFigures property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeFigures }
     *     
     */
    public EmployeeFigures getEmployeeFigures() {
        return employeeFigures;
    }

    /**
     * Sets the value of the employeeFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeFigures }
     *     
     */
    public void setEmployeeFigures(EmployeeFigures value) {
        this.employeeFigures = value;
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
     * Gets the value of the contactInterview property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInterview }
     *     
     */
    public ContactInterview getContactInterview() {
        return contactInterview;
    }

    /**
     * Sets the value of the contactInterview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInterview }
     *     
     */
    public void setContactInterview(ContactInterview value) {
        this.contactInterview = value;
    }

    /**
     * Gets the value of the assessment property.
     * 
     * @return
     *     possible object is
     *     {@link Assessment }
     *     
     */
    public Assessment getAssessment() {
        return assessment;
    }

    /**
     * Sets the value of the assessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assessment }
     *     
     */
    public void setAssessment(Assessment value) {
        this.assessment = value;
    }

    /**
     * Gets the value of the businessTrading property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTrading }
     *     
     */
    public BusinessTrading getBusinessTrading() {
        return businessTrading;
    }

    /**
     * Sets the value of the businessTrading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTrading }
     *     
     */
    public void setBusinessTrading(BusinessTrading value) {
        this.businessTrading = value;
    }

    /**
     * Gets the value of the principalsAndManagement property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsAndManagement }
     *     
     */
    public PrincipalsAndManagement getPrincipalsAndManagement() {
        return principalsAndManagement;
    }

    /**
     * Sets the value of the principalsAndManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsAndManagement }
     *     
     */
    public void setPrincipalsAndManagement(PrincipalsAndManagement value) {
        this.principalsAndManagement = value;
    }

    /**
     * Gets the value of the socioEconomicIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SocioEconomicIdentification }
     *     
     */
    public SocioEconomicIdentification getSocioEconomicIdentification() {
        return socioEconomicIdentification;
    }

    /**
     * Sets the value of the socioEconomicIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioEconomicIdentification }
     *     
     */
    public void setSocioEconomicIdentification(SocioEconomicIdentification value) {
        this.socioEconomicIdentification = value;
    }

    /**
     * Gets the value of the thirdPartyAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationThirdPartyAssessment }
     *     
     */
    public OrganizationThirdPartyAssessment getThirdPartyAssessment() {
        return thirdPartyAssessment;
    }

    /**
     * Sets the value of the thirdPartyAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationThirdPartyAssessment }
     *     
     */
    public void setThirdPartyAssessment(OrganizationThirdPartyAssessment value) {
        this.thirdPartyAssessment = value;
    }

    /**
     * Gets the value of the dataSufficiency property.
     * 
     * @return
     *     possible object is
     *     {@link DataSufficiency }
     *     
     */
    public DataSufficiency getDataSufficiency() {
        return dataSufficiency;
    }

    /**
     * Sets the value of the dataSufficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSufficiency }
     *     
     */
    public void setDataSufficiency(DataSufficiency value) {
        this.dataSufficiency = value;
    }

    /**
     * Gets the value of the complianceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceDetail }
     *     
     */
    public ComplianceDetail getComplianceDetail() {
        return complianceDetail;
    }

    /**
     * Sets the value of the complianceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceDetail }
     *     
     */
    public void setComplianceDetail(ComplianceDetail value) {
        this.complianceDetail = value;
    }

    /**
     * Gets the value of the competitors property.
     * 
     * @return
     *     possible object is
     *     {@link Competitors }
     *     
     */
    public Competitors getCompetitors() {
        return competitors;
    }

    /**
     * Sets the value of the competitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Competitors }
     *     
     */
    public void setCompetitors(Competitors value) {
        this.competitors = value;
    }

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link News }
     *     
     */
    public News getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link News }
     *     
     */
    public void setNews(News value) {
        this.news = value;
    }

    /**
     * Gets the value of the financialRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRelationship }
     *     
     */
    public FinancialRelationship getFinancialRelationship() {
        return financialRelationship;
    }

    /**
     * Sets the value of the financialRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRelationship }
     *     
     */
    public void setFinancialRelationship(FinancialRelationship value) {
        this.financialRelationship = value;
    }

    /**
     * Gets the value of the borrowerAnalytics property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalytics }
     *     
     */
    public BorrowerAnalytics getBorrowerAnalytics() {
        return borrowerAnalytics;
    }

    /**
     * Sets the value of the borrowerAnalytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalytics }
     *     
     */
    public void setBorrowerAnalytics(BorrowerAnalytics value) {
        this.borrowerAnalytics = value;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyDataType }
     *     
     */
    public ThirdPartyDataType getThirdPartyInformation() {
        return thirdPartyInformation;
    }

    /**
     * Sets the value of the thirdPartyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyDataType }
     *     
     */
    public void setThirdPartyInformation(ThirdPartyDataType value) {
        this.thirdPartyInformation = value;
    }

    /**
     * Gets the value of the businessSignals property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSignalsSummaryType }
     *     
     */
    public BusinessSignalsSummaryType getBusinessSignals() {
        return businessSignals;
    }

    /**
     * Sets the value of the businessSignals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSignalsSummaryType }
     *     
     */
    public void setBusinessSignals(BusinessSignalsSummaryType value) {
        this.businessSignals = value;
    }

    /**
     * Gets the value of the commercialCollectionClaims property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialCollectionClaims }
     *     
     */
    public CommercialCollectionClaims getCommercialCollectionClaims() {
        return commercialCollectionClaims;
    }

    /**
     * Sets the value of the commercialCollectionClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialCollectionClaims }
     *     
     */
    public void setCommercialCollectionClaims(CommercialCollectionClaims value) {
        this.commercialCollectionClaims = value;
    }

}
