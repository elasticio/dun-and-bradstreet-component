
package com.dnb.services.entitylist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dnb.services.entitylist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindIndustryResponse_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindIndustryResponse");
    private final static QName _FindCompetitorRequest_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindCompetitorRequest");
    private final static QName _FindContactRequest_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindContactRequest");
    private final static QName _FindContactResponse_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindContactResponse");
    private final static QName _FindCompetitorResponse_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindCompetitorResponse");
    private final static QName _FindIndustryRequest_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindIndustryRequest");
    private final static QName _FindCompanyResponse_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindCompanyResponse");
    private final static QName _FindCompanyRequest_QNAME = new QName("http://services.dnb.com/EntityListServiceV2.0", "FindCompanyRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dnb.services.entitylist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindContactRequestDetail }
     * 
     */
    public FindContactRequestDetail createFindContactRequestDetail() {
        return new FindContactRequestDetail();
    }

    /**
     * Create an instance of {@link IndustryNavigatorDetailType }
     * 
     */
    public IndustryNavigatorDetailType createIndustryNavigatorDetailType() {
        return new IndustryNavigatorDetailType();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail }
     * 
     */
    public FindContactResponseDetail createFindContactResponseDetail() {
        return new FindContactResponseDetail();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail createFindContactResponseDetailNavigatorDetail() {
        return new FindContactResponseDetail.NavigatorDetail();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail createFindContactResponseDetailNavigatorDetailContactDataNavigatorDetail() {
        return new FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail createFindContactResponseDetailNavigatorDetailJobTitleNavigatorDetail() {
        return new FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail createFindContactResponseDetailNavigatorDetailManagementResponsibilityCodeNavigatorDetail() {
        return new FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode createFindContactResponseDetailNavigatorDetailManagementResponsibilityCodeNavigatorDetailManagementResponsibilityCode() {
        return new FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail }
     * 
     */
    public FindCompanyRequestDetail createFindCompanyRequestDetail() {
        return new FindCompanyRequestDetail();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification createFindCompanyRequestDetailNavigatorSpecification() {
        return new FindCompanyRequestDetail.NavigatorSpecification();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification createFindCompanyRequestDetailNavigatorSpecificationIndividualEmployeeQuantityNavigatorSpecification() {
        return new FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification createFindCompanyRequestDetailNavigatorSpecificationConsolidatedEmployeeQuantityNavigatorSpecification() {
        return new FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification createFindCompanyRequestDetailNavigatorSpecificationSalesNavigatorSpecification() {
        return new FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail }
     * 
     */
    public FindCompanyResponseDetail createFindCompanyResponseDetail() {
        return new FindCompanyResponseDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail createFindCompanyResponseDetailNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification createFindCompanyResponseDetailNavigatorDetailControlOwnershipTypeNavigatorSpecification() {
        return new FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail createFindCompanyResponseDetailNavigatorDetailFamilyTreeMemberRoleNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail createFindCompanyResponseDetailNavigatorDetailIndividualEmployeeQuantityNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail createFindCompanyResponseDetailNavigatorDetailConsolidatedEmployeeQuantityNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail createFindCompanyResponseDetailNavigatorDetailSalesNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail();
    }

    /**
     * Create an instance of {@link SearchBaseAddressType }
     * 
     */
    public SearchBaseAddressType createSearchBaseAddressType() {
        return new SearchBaseAddressType();
    }

    /**
     * Create an instance of {@link FindContactResponse }
     * 
     */
    public FindContactResponse createFindContactResponse() {
        return new FindContactResponse();
    }

    /**
     * Create an instance of {@link FindCompetitorResponse }
     * 
     */
    public FindCompetitorResponse createFindCompetitorResponse() {
        return new FindCompetitorResponse();
    }

    /**
     * Create an instance of {@link FindIndustryResponse }
     * 
     */
    public FindIndustryResponse createFindIndustryResponse() {
        return new FindIndustryResponse();
    }

    /**
     * Create an instance of {@link FindCompetitorRequest }
     * 
     */
    public FindCompetitorRequest createFindCompetitorRequest() {
        return new FindCompetitorRequest();
    }

    /**
     * Create an instance of {@link FindContactRequest }
     * 
     */
    public FindContactRequest createFindContactRequest() {
        return new FindContactRequest();
    }

    /**
     * Create an instance of {@link FindCompanyRequest }
     * 
     */
    public FindCompanyRequest createFindCompanyRequest() {
        return new FindCompanyRequest();
    }

    /**
     * Create an instance of {@link FindCompanyResponse }
     * 
     */
    public FindCompanyResponse createFindCompanyResponse() {
        return new FindCompanyResponse();
    }

    /**
     * Create an instance of {@link FindIndustryRequest }
     * 
     */
    public FindIndustryRequest createFindIndustryRequest() {
        return new FindIndustryRequest();
    }

    /**
     * Create an instance of {@link SocioEconomicIdentification }
     * 
     */
    public SocioEconomicIdentification createSocioEconomicIdentification() {
        return new SocioEconomicIdentification();
    }

    /**
     * Create an instance of {@link InclusionCriteria }
     * 
     */
    public InclusionCriteria createInclusionCriteria() {
        return new InclusionCriteria();
    }

    /**
     * Create an instance of {@link ContactInclusionCriteria }
     * 
     */
    public ContactInclusionCriteria createContactInclusionCriteria() {
        return new ContactInclusionCriteria();
    }

    /**
     * Create an instance of {@link OwnershipEthnicityType }
     * 
     */
    public OwnershipEthnicityType createOwnershipEthnicityType() {
        return new OwnershipEthnicityType();
    }

    /**
     * Create an instance of {@link StreetAddressLine }
     * 
     */
    public StreetAddressLine createStreetAddressLine() {
        return new StreetAddressLine();
    }

    /**
     * Create an instance of {@link TypeTextStringType }
     * 
     */
    public TypeTextStringType createTypeTextStringType() {
        return new TypeTextStringType();
    }

    /**
     * Create an instance of {@link EmployeeDetailsType }
     * 
     */
    public EmployeeDetailsType createEmployeeDetailsType() {
        return new EmployeeDetailsType();
    }

    /**
     * Create an instance of {@link TelecommunicationNumberSimpleType }
     * 
     */
    public TelecommunicationNumberSimpleType createTelecommunicationNumberSimpleType() {
        return new TelecommunicationNumberSimpleType();
    }

    /**
     * Create an instance of {@link LegalFormDetailsType }
     * 
     */
    public LegalFormDetailsType createLegalFormDetailsType() {
        return new LegalFormDetailsType();
    }

    /**
     * Create an instance of {@link IndustryCodeType }
     * 
     */
    public IndustryCodeType createIndustryCodeType() {
        return new IndustryCodeType();
    }

    /**
     * Create an instance of {@link SearchContactInquiryDetail }
     * 
     */
    public SearchContactInquiryDetail createSearchContactInquiryDetail() {
        return new SearchContactInquiryDetail();
    }

    /**
     * Create an instance of {@link UnmatchedCandidatesType }
     * 
     */
    public UnmatchedCandidatesType createUnmatchedCandidatesType() {
        return new UnmatchedCandidatesType();
    }

    /**
     * Create an instance of {@link TransactionResult }
     * 
     */
    public TransactionResult createTransactionResult() {
        return new TransactionResult();
    }

    /**
     * Create an instance of {@link ResponseTransactionDetail }
     * 
     */
    public ResponseTransactionDetail createResponseTransactionDetail() {
        return new ResponseTransactionDetail();
    }

    /**
     * Create an instance of {@link PrimaryAddressType }
     * 
     */
    public PrimaryAddressType createPrimaryAddressType() {
        return new PrimaryAddressType();
    }

    /**
     * Create an instance of {@link FindIndustrySpecification }
     * 
     */
    public FindIndustrySpecification createFindIndustrySpecification() {
        return new FindIndustrySpecification();
    }

    /**
     * Create an instance of {@link SearchTelephoneNumber }
     * 
     */
    public SearchTelephoneNumber createSearchTelephoneNumber() {
        return new SearchTelephoneNumber();
    }

    /**
     * Create an instance of {@link SearchInquiryDetail }
     * 
     */
    public SearchInquiryDetail createSearchInquiryDetail() {
        return new SearchInquiryDetail();
    }

    /**
     * Create an instance of {@link LocationNavigatorSpecificationType }
     * 
     */
    public LocationNavigatorSpecificationType createLocationNavigatorSpecificationType() {
        return new LocationNavigatorSpecificationType();
    }

    /**
     * Create an instance of {@link TelexNumberType }
     * 
     */
    public TelexNumberType createTelexNumberType() {
        return new TelexNumberType();
    }

    /**
     * Create an instance of {@link OrganizationNameBaseType }
     * 
     */
    public OrganizationNameBaseType createOrganizationNameBaseType() {
        return new OrganizationNameBaseType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link com.dnb.services.entitylist.FamilyTreeMemberRole }
     * 
     */
    public com.dnb.services.entitylist.FamilyTreeMemberRole createFamilyTreeMemberRole() {
        return new com.dnb.services.entitylist.FamilyTreeMemberRole();
    }

    /**
     * Create an instance of {@link OrganizationPrimaryNameType }
     * 
     */
    public OrganizationPrimaryNameType createOrganizationPrimaryNameType() {
        return new OrganizationPrimaryNameType();
    }

    /**
     * Create an instance of {@link RadiusSearchDetail }
     * 
     */
    public RadiusSearchDetail createRadiusSearchDetail() {
        return new RadiusSearchDetail();
    }

    /**
     * Create an instance of {@link IndustryNavigatorSpecificationType }
     * 
     */
    public IndustryNavigatorSpecificationType createIndustryNavigatorSpecificationType() {
        return new IndustryNavigatorSpecificationType();
    }

    /**
     * Create an instance of {@link WebPageAddressType }
     * 
     */
    public WebPageAddressType createWebPageAddressType() {
        return new WebPageAddressType();
    }

    /**
     * Create an instance of {@link BaseAddressType }
     * 
     */
    public BaseAddressType createBaseAddressType() {
        return new BaseAddressType();
    }

    /**
     * Create an instance of {@link com.dnb.services.entitylist.JobTitle }
     * 
     */
    public com.dnb.services.entitylist.JobTitle createJobTitle() {
        return new com.dnb.services.entitylist.JobTitle();
    }

    /**
     * Create an instance of {@link InquiryReferenceDetail }
     * 
     */
    public InquiryReferenceDetail createInquiryReferenceDetail() {
        return new InquiryReferenceDetail();
    }

    /**
     * Create an instance of {@link FindCompetitorInquiryDetail }
     * 
     */
    public FindCompetitorInquiryDetail createFindCompetitorInquiryDetail() {
        return new FindCompetitorInquiryDetail();
    }

    /**
     * Create an instance of {@link Association }
     * 
     */
    public Association createAssociation() {
        return new Association();
    }

    /**
     * Create an instance of {@link DNBDateType }
     * 
     */
    public DNBDateType createDNBDateType() {
        return new DNBDateType();
    }

    /**
     * Create an instance of {@link PremisesAreaDetail }
     * 
     */
    public PremisesAreaDetail createPremisesAreaDetail() {
        return new PremisesAreaDetail();
    }

    /**
     * Create an instance of {@link LocationNavigatorDetailType }
     * 
     */
    public LocationNavigatorDetailType createLocationNavigatorDetailType() {
        return new LocationNavigatorDetailType();
    }

    /**
     * Create an instance of {@link PrincipalIdentificationNumberType }
     * 
     */
    public PrincipalIdentificationNumberType createPrincipalIdentificationNumberType() {
        return new PrincipalIdentificationNumberType();
    }

    /**
     * Create an instance of {@link DNBStringType256 }
     * 
     */
    public DNBStringType256 createDNBStringType256() {
        return new DNBStringType256();
    }

    /**
     * Create an instance of {@link SearchInquirySocioEconomicType }
     * 
     */
    public SearchInquirySocioEconomicType createSearchInquirySocioEconomicType() {
        return new SearchInquirySocioEconomicType();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link ResultMessage }
     * 
     */
    public ResultMessage createResultMessage() {
        return new ResultMessage();
    }

    /**
     * Create an instance of {@link IndustryCodeDescriptionType }
     * 
     */
    public IndustryCodeDescriptionType createIndustryCodeDescriptionType() {
        return new IndustryCodeDescriptionType();
    }

    /**
     * Create an instance of {@link FindCompetitorResult }
     * 
     */
    public FindCompetitorResult createFindCompetitorResult() {
        return new FindCompetitorResult();
    }

    /**
     * Create an instance of {@link SocioEconomicReferenceDetailType }
     * 
     */
    public SocioEconomicReferenceDetailType createSocioEconomicReferenceDetailType() {
        return new SocioEconomicReferenceDetailType();
    }

    /**
     * Create an instance of {@link DNBDecodedStringType }
     * 
     */
    public DNBDecodedStringType createDNBDecodedStringType() {
        return new DNBDecodedStringType();
    }

    /**
     * Create an instance of {@link SearchSpecification }
     * 
     */
    public SearchSpecification createSearchSpecification() {
        return new SearchSpecification();
    }

    /**
     * Create an instance of {@link SearchContactResult }
     * 
     */
    public SearchContactResult createSearchContactResult() {
        return new SearchContactResult();
    }

    /**
     * Create an instance of {@link SearchLocation }
     * 
     */
    public SearchLocation createSearchLocation() {
        return new SearchLocation();
    }

    /**
     * Create an instance of {@link FindIndustryInquiryDetail }
     * 
     */
    public FindIndustryInquiryDetail createFindIndustryInquiryDetail() {
        return new FindIndustryInquiryDetail();
    }

    /**
     * Create an instance of {@link IndividualNameType }
     * 
     */
    public IndividualNameType createIndividualNameType() {
        return new IndividualNameType();
    }

    /**
     * Create an instance of {@link ManagementResponsibilityCodeTextType }
     * 
     */
    public ManagementResponsibilityCodeTextType createManagementResponsibilityCodeTextType() {
        return new ManagementResponsibilityCodeTextType();
    }

    /**
     * Create an instance of {@link FindIndustryCodeType }
     * 
     */
    public FindIndustryCodeType createFindIndustryCodeType() {
        return new FindIndustryCodeType();
    }

    /**
     * Create an instance of {@link NameSuffix }
     * 
     */
    public NameSuffix createNameSuffix() {
        return new NameSuffix();
    }

    /**
     * Create an instance of {@link LocationNavigatorType }
     * 
     */
    public LocationNavigatorType createLocationNavigatorType() {
        return new LocationNavigatorType();
    }

    /**
     * Create an instance of {@link FamilyTreeMemberRoleCodeType }
     * 
     */
    public FamilyTreeMemberRoleCodeType createFamilyTreeMemberRoleCodeType() {
        return new FamilyTreeMemberRoleCodeType();
    }

    /**
     * Create an instance of {@link SimpleAddress }
     * 
     */
    public SimpleAddress createSimpleAddress() {
        return new SimpleAddress();
    }

    /**
     * Create an instance of {@link LegalFormDetailsCodeType }
     * 
     */
    public LegalFormDetailsCodeType createLegalFormDetailsCodeType() {
        return new LegalFormDetailsCodeType();
    }

    /**
     * Create an instance of {@link FindIndustryResponseDetail }
     * 
     */
    public FindIndustryResponseDetail createFindIndustryResponseDetail() {
        return new FindIndustryResponseDetail();
    }

    /**
     * Create an instance of {@link FindCompetitorResponseDetail }
     * 
     */
    public FindCompetitorResponseDetail createFindCompetitorResponseDetail() {
        return new FindCompetitorResponseDetail();
    }

    /**
     * Create an instance of {@link PrimaryIndustryCodeType }
     * 
     */
    public PrimaryIndustryCodeType createPrimaryIndustryCodeType() {
        return new PrimaryIndustryCodeType();
    }

    /**
     * Create an instance of {@link FindIndustryRequestDetail }
     * 
     */
    public FindIndustryRequestDetail createFindIndustryRequestDetail() {
        return new FindIndustryRequestDetail();
    }

    /**
     * Create an instance of {@link SearchContactSpecification }
     * 
     */
    public SearchContactSpecification createSearchContactSpecification() {
        return new SearchContactSpecification();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link SubjectHandling }
     * 
     */
    public SubjectHandling createSubjectHandling() {
        return new SubjectHandling();
    }

    /**
     * Create an instance of {@link TelecommunicationNumberType }
     * 
     */
    public TelecommunicationNumberType createTelecommunicationNumberType() {
        return new TelecommunicationNumberType();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberSimpleType }
     * 
     */
    public OrganizationIdentificationNumberSimpleType createOrganizationIdentificationNumberSimpleType() {
        return new OrganizationIdentificationNumberSimpleType();
    }

    /**
     * Create an instance of {@link ConnectMailDetail }
     * 
     */
    public ConnectMailDetail createConnectMailDetail() {
        return new ConnectMailDetail();
    }

    /**
     * Create an instance of {@link SearchCompanySpecification }
     * 
     */
    public SearchCompanySpecification createSearchCompanySpecification() {
        return new SearchCompanySpecification();
    }

    /**
     * Create an instance of {@link FindCompetitorRequestDetail }
     * 
     */
    public FindCompetitorRequestDetail createFindCompetitorRequestDetail() {
        return new FindCompetitorRequestDetail();
    }

    /**
     * Create an instance of {@link RequestTransactionDetail }
     * 
     */
    public RequestTransactionDetail createRequestTransactionDetail() {
        return new RequestTransactionDetail();
    }

    /**
     * Create an instance of {@link NamePrefix }
     * 
     */
    public NamePrefix createNamePrefix() {
        return new NamePrefix();
    }

    /**
     * Create an instance of {@link SearchWebPageAddressType }
     * 
     */
    public SearchWebPageAddressType createSearchWebPageAddressType() {
        return new SearchWebPageAddressType();
    }

    /**
     * Create an instance of {@link StockExchangeDetails }
     * 
     */
    public StockExchangeDetails createStockExchangeDetails() {
        return new StockExchangeDetails();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link FindCompetitorSpecification }
     * 
     */
    public FindCompetitorSpecification createFindCompetitorSpecification() {
        return new FindCompetitorSpecification();
    }

    /**
     * Create an instance of {@link Management }
     * 
     */
    public Management createManagement() {
        return new Management();
    }

    /**
     * Create an instance of {@link DNBStringType }
     * 
     */
    public DNBStringType createDNBStringType() {
        return new DNBStringType();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link SearchIndustryCodeType }
     * 
     */
    public SearchIndustryCodeType createSearchIndustryCodeType() {
        return new SearchIndustryCodeType();
    }

    /**
     * Create an instance of {@link FindContactRequestDetail.NavigatorSpecification }
     * 
     */
    public FindContactRequestDetail.NavigatorSpecification createFindContactRequestDetailNavigatorSpecification() {
        return new FindContactRequestDetail.NavigatorSpecification();
    }

    /**
     * Create an instance of {@link IndustryNavigatorDetailType.IndustryCode }
     * 
     */
    public IndustryNavigatorDetailType.IndustryCode createIndustryNavigatorDetailTypeIndustryCode() {
        return new IndustryNavigatorDetailType.IndustryCode();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData createFindContactResponseDetailNavigatorDetailContactDataNavigatorDetailContactData() {
        return new FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle createFindContactResponseDetailNavigatorDetailJobTitleNavigatorDetailJobTitle() {
        return new FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle();
    }

    /**
     * Create an instance of {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText }
     * 
     */
    public FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText createFindContactResponseDetailNavigatorDetailManagementResponsibilityCodeNavigatorDetailManagementResponsibilityCodeManagementResponsibilityCodeText() {
        return new FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange createFindCompanyRequestDetailNavigatorSpecificationIndividualEmployeeQuantityNavigatorSpecificationIndividualEmployeeNavigatorRange() {
        return new FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange createFindCompanyRequestDetailNavigatorSpecificationConsolidatedEmployeeQuantityNavigatorSpecificationConsolidatedEmployeeNavigatorQuantityRange() {
        return new FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange();
    }

    /**
     * Create an instance of {@link FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange }
     * 
     */
    public FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange createFindCompanyRequestDetailNavigatorSpecificationSalesNavigatorSpecificationSalesNavigatorRange() {
        return new FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail createFindCompanyResponseDetailNavigatorDetailStandaloneOrganizationNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail createFindCompanyResponseDetailNavigatorDetailUpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail createFindCompanyResponseDetailNavigatorDetailPubliclyTradedCompanyNavigatorDetail() {
        return new FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType createFindCompanyResponseDetailNavigatorDetailControlOwnershipTypeNavigatorSpecificationControlOwnershipType() {
        return new FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole createFindCompanyResponseDetailNavigatorDetailFamilyTreeMemberRoleNavigatorDetailFamilyTreeMemberRole() {
        return new FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange createFindCompanyResponseDetailNavigatorDetailIndividualEmployeeQuantityNavigatorDetailIndividualEmployeeQuantityRange() {
        return new FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange createFindCompanyResponseDetailNavigatorDetailConsolidatedEmployeeQuantityNavigatorDetailConsolidatedEmployeeQuantityRange() {
        return new FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange();
    }

    /**
     * Create an instance of {@link FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange }
     * 
     */
    public FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange createFindCompanyResponseDetailNavigatorDetailSalesNavigatorDetailSalesNavigatorRange() {
        return new FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange();
    }

    /**
     * Create an instance of {@link SearchBaseAddressType.PostalCodeRange }
     * 
     */
    public SearchBaseAddressType.PostalCodeRange createSearchBaseAddressTypePostalCodeRange() {
        return new SearchBaseAddressType.PostalCodeRange();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIndustryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindIndustryResponse")
    public JAXBElement<FindIndustryResponse> createFindIndustryResponse(FindIndustryResponse value) {
        return new JAXBElement<FindIndustryResponse>(_FindIndustryResponse_QNAME, FindIndustryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompetitorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindCompetitorRequest")
    public JAXBElement<FindCompetitorRequest> createFindCompetitorRequest(FindCompetitorRequest value) {
        return new JAXBElement<FindCompetitorRequest>(_FindCompetitorRequest_QNAME, FindCompetitorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindContactRequest")
    public JAXBElement<FindContactRequest> createFindContactRequest(FindContactRequest value) {
        return new JAXBElement<FindContactRequest>(_FindContactRequest_QNAME, FindContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindContactResponse")
    public JAXBElement<FindContactResponse> createFindContactResponse(FindContactResponse value) {
        return new JAXBElement<FindContactResponse>(_FindContactResponse_QNAME, FindContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompetitorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindCompetitorResponse")
    public JAXBElement<FindCompetitorResponse> createFindCompetitorResponse(FindCompetitorResponse value) {
        return new JAXBElement<FindCompetitorResponse>(_FindCompetitorResponse_QNAME, FindCompetitorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIndustryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindIndustryRequest")
    public JAXBElement<FindIndustryRequest> createFindIndustryRequest(FindIndustryRequest value) {
        return new JAXBElement<FindIndustryRequest>(_FindIndustryRequest_QNAME, FindIndustryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindCompanyResponse")
    public JAXBElement<FindCompanyResponse> createFindCompanyResponse(FindCompanyResponse value) {
        return new JAXBElement<FindCompanyResponse>(_FindCompanyResponse_QNAME, FindCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompanyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/EntityListServiceV2.0", name = "FindCompanyRequest")
    public JAXBElement<FindCompanyRequest> createFindCompanyRequest(FindCompanyRequest value) {
        return new JAXBElement<FindCompanyRequest>(_FindCompanyRequest_QNAME, FindCompanyRequest.class, null, value);
    }

}
