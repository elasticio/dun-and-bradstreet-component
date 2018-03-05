
package com.dnb.services.smallbusiness;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dnb.services.smallbusiness package. 
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

    private final static QName _OrderProductResponse_QNAME = new QName("http://services.dnb.com/SBRIProductServiceV2.0", "OrderProductResponse");
    private final static QName _OrderProductRequest_QNAME = new QName("http://services.dnb.com/SBRIProductServiceV2.0", "OrderProductRequest");
    private final static QName _RetrieveProductResponse_QNAME = new QName("http://services.dnb.com/SBRIProductServiceV2.0", "RetrieveProductResponse");
    private final static QName _RetrieveProductRequest_QNAME = new QName("http://services.dnb.com/SBRIProductServiceV2.0", "RetrieveProductRequest");
    private final static QName _GuarantorDetailsGovernmentGuaranteedProgramTypeText_QNAME = new QName("", "GovernmentGuaranteedProgramTypeText");
    private final static QName _GuarantorDetailsOwnershipPercentage_QNAME = new QName("", "OwnershipPercentage");
    private final static QName _GuarantorDetailsGuarantorTypeText_QNAME = new QName("", "GuarantorTypeText");
    private final static QName _GuarantorDetailsGuaranteePercentage_QNAME = new QName("", "GuaranteePercentage");
    private final static QName _GuarantorDetailsGuarantorName_QNAME = new QName("", "GuarantorName");
    private final static QName _PastDueCycleSummaryPastDueAmount_QNAME = new QName("", "PastDueAmount");
    private final static QName _AccountDetailHighBalanceAmount_QNAME = new QName("", "HighBalanceAmount");
    private final static QName _AccountDetailLenderID_QNAME = new QName("", "LenderID");
    private final static QName _AccountDetailLenderName_QNAME = new QName("", "LenderName");
    private final static QName _AccountDetailAvailableCreditAmount_QNAME = new QName("", "AvailableCreditAmount");
    private final static QName _AccountDetailLastPaymentDate_QNAME = new QName("", "LastPaymentDate");
    private final static QName _AccountDetailMaturityDate_QNAME = new QName("", "MaturityDate");
    private final static QName _AccountDetailPaymentReportedDate_QNAME = new QName("", "PaymentReportedDate");
    private final static QName _AccountDetailOriginalAmount_QNAME = new QName("", "OriginalAmount");
    private final static QName _AccountDetailOpenedDate_QNAME = new QName("", "OpenedDate");
    private final static QName _AccountDetailBalloonAmount_QNAME = new QName("", "BalloonAmount");
    private final static QName _AccountDetailPaymentTypeText_QNAME = new QName("", "PaymentTypeText");
    private final static QName _AccountDetailAccountRelationshipText_QNAME = new QName("", "AccountRelationshipText");
    private final static QName _AccountDetailVoluntarilyClosedIndicator_QNAME = new QName("", "VoluntarilyClosedIndicator");
    private final static QName _AccountDetailBalloonPaymentDate_QNAME = new QName("", "BalloonPaymentDate");
    private final static QName _AccountDetailOpenAccountIndicator_QNAME = new QName("", "OpenAccountIndicator");
    private final static QName _AccountDetailCurrentCreditLineAmount_QNAME = new QName("", "CurrentCreditLineAmount");
    private final static QName _AccountDetailClosedDate_QNAME = new QName("", "ClosedDate");
    private final static QName _AccountDetailSecuredAccountIndicator_QNAME = new QName("", "SecuredAccountIndicator");
    private final static QName _AccountDetailCurrentBalanceAmount_QNAME = new QName("", "CurrentBalanceAmount");
    private final static QName _AccountDetailCollateralTypeText_QNAME = new QName("", "CollateralTypeText");
    private final static QName _AccountDetailPaymentFrequencyText_QNAME = new QName("", "PaymentFrequencyText");
    private final static QName _PaymentsCountCycleSummaryPastDuePaymentCount_QNAME = new QName("", "PastDuePaymentCount");
    private final static QName _PastDuePercentageCycleSummaryPastDuePercentage_QNAME = new QName("", "PastDuePercentage");
    private final static QName _CurrentPaymentTotalPastDueAmount_QNAME = new QName("", "TotalPastDueAmount");
    private final static QName _CurrentPaymentCurrentDueAmount_QNAME = new QName("", "CurrentDueAmount");
    private final static QName _CurrentPaymentMinimumPaymentAmount_QNAME = new QName("", "MinimumPaymentAmount");
    private final static QName _AccountSummaryTypeTotalAvailableCreditAmount_QNAME = new QName("", "TotalAvailableCreditAmount");
    private final static QName _AccountSummaryTypeTotalCurrentCreditLineAmount_QNAME = new QName("", "TotalCurrentCreditLineAmount");
    private final static QName _AccountSummaryTypeTotalCurrentBalanceAmount_QNAME = new QName("", "TotalCurrentBalanceAmount");
    private final static QName _AccountSummaryTypeTotalBalloonAmount_QNAME = new QName("", "TotalBalloonAmount");
    private final static QName _GuaranteeDetailsGuaranteedPaymentIndicator_QNAME = new QName("", "GuaranteedPaymentIndicator");
    private final static QName _GuaranteeDetailsAccountTypeText_QNAME = new QName("", "AccountTypeText");
    private final static QName _GuaranteeDetailsGuarantorsCount_QNAME = new QName("", "GuarantorsCount");
    private final static QName _PaymentHistorySummaryTotalNumberOfPaymentsPeriod_QNAME = new QName("", "TotalNumberOfPaymentsPeriod");
    private final static QName _PaymentHistorySummaryExperiencesTotalCount_QNAME = new QName("", "ExperiencesTotalCount");
    private final static QName _PaymentHistorySummaryTotalPaymentsCount_QNAME = new QName("", "TotalPaymentsCount");
    private final static QName _PaymentHistorySummaryPaymentPeriod_QNAME = new QName("", "PaymentPeriod");
    private final static QName _PaymentHistorySummaryTotalOnTimePaymentsCount_QNAME = new QName("", "TotalOnTimePaymentsCount");
    private final static QName _PaymentHistorySummaryPaymentWithinTermsCount_QNAME = new QName("", "PaymentWithinTermsCount");
    private final static QName _PaymentHistorySummaryTotalChargeOffAmount_QNAME = new QName("", "TotalChargeOffAmount");
    private final static QName _PaymentHistorySummaryTotalChargeOffRecoveredAmount_QNAME = new QName("", "TotalChargeOffRecoveredAmount");
    private final static QName _TotalPaymentsCountCycleSummaryTotalPastDuePaymentCount_QNAME = new QName("", "TotalPastDuePaymentCount");
    private final static QName _MiscellaneousDetailsCommentText_QNAME = new QName("", "CommentText");
    private final static QName _OverallSummaryTotalMinimumPaymentAmount_QNAME = new QName("", "TotalMinimumPaymentAmount");
    private final static QName _OverallSummaryTotalCurrentDueAmount_QNAME = new QName("", "TotalCurrentDueAmount");
    private final static QName _PaymentHistoryChargeOffDate_QNAME = new QName("", "ChargeOffDate");
    private final static QName _PaymentHistoryPaymentHistoryPattern_QNAME = new QName("", "PaymentHistoryPattern");
    private final static QName _PaymentHistoryOnTimePaymentsCount_QNAME = new QName("", "OnTimePaymentsCount");
    private final static QName _PaymentHistoryChargeOffAmount_QNAME = new QName("", "ChargeOffAmount");
    private final static QName _PaymentHistoryNumberOfPaymentsPeriod_QNAME = new QName("", "NumberOfPaymentsPeriod");
    private final static QName _PaymentHistoryChargeOffRecoveredAmount_QNAME = new QName("", "ChargeOffRecoveredAmount");
    private final static QName _OverallPaymentHistorySummaryOnTimePaymentsPercentage_QNAME = new QName("", "OnTimePaymentsPercentage");
    private final static QName _OverallPaymentHistorySummaryTotalChargeOffPaymentsCount_QNAME = new QName("", "TotalChargeOffPaymentsCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dnb.services.smallbusiness
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderProductResponse }
     * 
     */
    public OrderProductResponse createOrderProductResponse() {
        return new OrderProductResponse();
    }

    /**
     * Create an instance of {@link RetrieveProductRequest }
     * 
     */
    public RetrieveProductRequest createRetrieveProductRequest() {
        return new RetrieveProductRequest();
    }

    /**
     * Create an instance of {@link OrderProductRequest }
     * 
     */
    public OrderProductRequest createOrderProductRequest() {
        return new OrderProductRequest();
    }

    /**
     * Create an instance of {@link RetrieveProductResponse }
     * 
     */
    public RetrieveProductResponse createRetrieveProductResponse() {
        return new RetrieveProductResponse();
    }

    /**
     * Create an instance of {@link FamilyTreeAssociation }
     * 
     */
    public FamilyTreeAssociation createFamilyTreeAssociation() {
        return new FamilyTreeAssociation();
    }

    /**
     * Create an instance of {@link StreetAddressLine }
     * 
     */
    public StreetAddressLine createStreetAddressLine() {
        return new StreetAddressLine();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link OrganizationDetail }
     * 
     */
    public OrganizationDetail createOrganizationDetail() {
        return new OrganizationDetail();
    }

    /**
     * Create an instance of {@link TelecommunicationNumberSimpleType }
     * 
     */
    public TelecommunicationNumberSimpleType createTelecommunicationNumberSimpleType() {
        return new TelecommunicationNumberSimpleType();
    }

    /**
     * Create an instance of {@link ResponseArchiveDetail }
     * 
     */
    public ResponseArchiveDetail createResponseArchiveDetail() {
        return new ResponseArchiveDetail();
    }

    /**
     * Create an instance of {@link OrderProductResponseDetail }
     * 
     */
    public OrderProductResponseDetail createOrderProductResponseDetail() {
        return new OrderProductResponseDetail();
    }

    /**
     * Create an instance of {@link AccountPayment }
     * 
     */
    public AccountPayment createAccountPayment() {
        return new AccountPayment();
    }

    /**
     * Create an instance of {@link PastDueCycleSummary }
     * 
     */
    public PastDueCycleSummary createPastDueCycleSummary() {
        return new PastDueCycleSummary();
    }

    /**
     * Create an instance of {@link SubjectHeader }
     * 
     */
    public SubjectHeader createSubjectHeader() {
        return new SubjectHeader();
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
     * Create an instance of {@link BorrowerAnalyticsOverallSummary }
     * 
     */
    public BorrowerAnalyticsOverallSummary createBorrowerAnalyticsOverallSummary() {
        return new BorrowerAnalyticsOverallSummary();
    }

    /**
     * Create an instance of {@link TransactionResult }
     * 
     */
    public TransactionResult createTransactionResult() {
        return new TransactionResult();
    }

    /**
     * Create an instance of {@link SBRIScore }
     * 
     */
    public SBRIScore createSBRIScore() {
        return new SBRIScore();
    }

    /**
     * Create an instance of {@link ResponseTransactionDetail }
     * 
     */
    public ResponseTransactionDetail createResponseTransactionDetail() {
        return new ResponseTransactionDetail();
    }

    /**
     * Create an instance of {@link RegisteredDetail }
     * 
     */
    public RegisteredDetail createRegisteredDetail() {
        return new RegisteredDetail();
    }

    /**
     * Create an instance of {@link PrimaryAddressType }
     * 
     */
    public PrimaryAddressType createPrimaryAddressType() {
        return new PrimaryAddressType();
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
     * Create an instance of {@link FamilyTreeMemberRole }
     * 
     */
    public FamilyTreeMemberRole createFamilyTreeMemberRole() {
        return new FamilyTreeMemberRole();
    }

    /**
     * Create an instance of {@link OrganizationPrimaryNameType }
     * 
     */
    public OrganizationPrimaryNameType createOrganizationPrimaryNameType() {
        return new OrganizationPrimaryNameType();
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
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link ActivitiesAndOperations }
     * 
     */
    public ActivitiesAndOperations createActivitiesAndOperations() {
        return new ActivitiesAndOperations();
    }

    /**
     * Create an instance of {@link PaymentsCountCycleSummary }
     * 
     */
    public PaymentsCountCycleSummary createPaymentsCountCycleSummary() {
        return new PaymentsCountCycleSummary();
    }

    /**
     * Create an instance of {@link OverallSummary }
     * 
     */
    public OverallSummary createOverallSummary() {
        return new OverallSummary();
    }

    /**
     * Create an instance of {@link InquiryReferenceDetail }
     * 
     */
    public InquiryReferenceDetail createInquiryReferenceDetail() {
        return new InquiryReferenceDetail();
    }

    /**
     * Create an instance of {@link OverallPaymentHistorySummary }
     * 
     */
    public OverallPaymentHistorySummary createOverallPaymentHistorySummary() {
        return new OverallPaymentHistorySummary();
    }

    /**
     * Create an instance of {@link CurrentPaymentSummary }
     * 
     */
    public CurrentPaymentSummary createCurrentPaymentSummary() {
        return new CurrentPaymentSummary();
    }

    /**
     * Create an instance of {@link Association }
     * 
     */
    public Association createAssociation() {
        return new Association();
    }

    /**
     * Create an instance of {@link PaymentHistorySummary }
     * 
     */
    public PaymentHistorySummary createPaymentHistorySummary() {
        return new PaymentHistorySummary();
    }

    /**
     * Create an instance of {@link GuaranteeDetails }
     * 
     */
    public GuaranteeDetails createGuaranteeDetails() {
        return new GuaranteeDetails();
    }

    /**
     * Create an instance of {@link DNBDateType }
     * 
     */
    public DNBDateType createDNBDateType() {
        return new DNBDateType();
    }

    /**
     * Create an instance of {@link ProductResponseInquiryDetail }
     * 
     */
    public ProductResponseInquiryDetail createProductResponseInquiryDetail() {
        return new ProductResponseInquiryDetail();
    }

    /**
     * Create an instance of {@link Linkage }
     * 
     */
    public Linkage createLinkage() {
        return new Linkage();
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
     * Create an instance of {@link ResultMessage }
     * 
     */
    public ResultMessage createResultMessage() {
        return new ResultMessage();
    }

    /**
     * Create an instance of {@link AccountSummaryType }
     * 
     */
    public AccountSummaryType createAccountSummaryType() {
        return new AccountSummaryType();
    }

    /**
     * Create an instance of {@link DNBDecodedStringType }
     * 
     */
    public DNBDecodedStringType createDNBDecodedStringType() {
        return new DNBDecodedStringType();
    }

    /**
     * Create an instance of {@link GuarantorAddress }
     * 
     */
    public GuarantorAddress createGuarantorAddress() {
        return new GuarantorAddress();
    }

    /**
     * Create an instance of {@link BorrowerAnalytics }
     * 
     */
    public BorrowerAnalytics createBorrowerAnalytics() {
        return new BorrowerAnalytics();
    }

    /**
     * Create an instance of {@link RetrieveProductRequestDetail }
     * 
     */
    public RetrieveProductRequestDetail createRetrieveProductRequestDetail() {
        return new RetrieveProductRequestDetail();
    }

    /**
     * Create an instance of {@link MiscellaneousDetails }
     * 
     */
    public MiscellaneousDetails createMiscellaneousDetails() {
        return new MiscellaneousDetails();
    }

    /**
     * Create an instance of {@link OrderProductRequestDetail }
     * 
     */
    public OrderProductRequestDetail createOrderProductRequestDetail() {
        return new OrderProductRequestDetail();
    }

    /**
     * Create an instance of {@link LineOfBusinessDetailsType }
     * 
     */
    public LineOfBusinessDetailsType createLineOfBusinessDetailsType() {
        return new LineOfBusinessDetailsType();
    }

    /**
     * Create an instance of {@link SimpleAddress }
     * 
     */
    public SimpleAddress createSimpleAddress() {
        return new SimpleAddress();
    }

    /**
     * Create an instance of {@link BorrowerAnalyticsAccountSummary }
     * 
     */
    public BorrowerAnalyticsAccountSummary createBorrowerAnalyticsAccountSummary() {
        return new BorrowerAnalyticsAccountSummary();
    }

    /**
     * Create an instance of {@link IndustryCode }
     * 
     */
    public IndustryCode createIndustryCode() {
        return new IndustryCode();
    }

    /**
     * Create an instance of {@link ScoreReason }
     * 
     */
    public ScoreReason createScoreReason() {
        return new ScoreReason();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link BorrowerAnalyticsCycleSummary }
     * 
     */
    public BorrowerAnalyticsCycleSummary createBorrowerAnalyticsCycleSummary() {
        return new BorrowerAnalyticsCycleSummary();
    }

    /**
     * Create an instance of {@link ArchiveDetail }
     * 
     */
    public ArchiveDetail createArchiveDetail() {
        return new ArchiveDetail();
    }

    /**
     * Create an instance of {@link RetrieveProductResponseDetail }
     * 
     */
    public RetrieveProductResponseDetail createRetrieveProductResponseDetail() {
        return new RetrieveProductResponseDetail();
    }

    /**
     * Create an instance of {@link PastDuePercentageCycleSummary }
     * 
     */
    public PastDuePercentageCycleSummary createPastDuePercentageCycleSummary() {
        return new PastDuePercentageCycleSummary();
    }

    /**
     * Create an instance of {@link PrimaryIndustryCodeType }
     * 
     */
    public PrimaryIndustryCodeType createPrimaryIndustryCodeType() {
        return new PrimaryIndustryCodeType();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberType }
     * 
     */
    public OrganizationIdentificationNumberType createOrganizationIdentificationNumberType() {
        return new OrganizationIdentificationNumberType();
    }

    /**
     * Create an instance of {@link OrganizationName }
     * 
     */
    public OrganizationName createOrganizationName() {
        return new OrganizationName();
    }

    /**
     * Create an instance of {@link Ownership }
     * 
     */
    public Ownership createOwnership() {
        return new Ownership();
    }

    /**
     * Create an instance of {@link TelecommunicationNumberType }
     * 
     */
    public TelecommunicationNumberType createTelecommunicationNumberType() {
        return new TelecommunicationNumberType();
    }

    /**
     * Create an instance of {@link Assessment }
     * 
     */
    public Assessment createAssessment() {
        return new Assessment();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberSimpleType }
     * 
     */
    public OrganizationIdentificationNumberSimpleType createOrganizationIdentificationNumberSimpleType() {
        return new OrganizationIdentificationNumberSimpleType();
    }

    /**
     * Create an instance of {@link AccountDetail }
     * 
     */
    public AccountDetail createAccountDetail() {
        return new AccountDetail();
    }

    /**
     * Create an instance of {@link FinancialRelationship }
     * 
     */
    public FinancialRelationship createFinancialRelationship() {
        return new FinancialRelationship();
    }

    /**
     * Create an instance of {@link RequestTransactionDetail }
     * 
     */
    public RequestTransactionDetail createRequestTransactionDetail() {
        return new RequestTransactionDetail();
    }

    /**
     * Create an instance of {@link RetrieveProductArchiveDetail }
     * 
     */
    public RetrieveProductArchiveDetail createRetrieveProductArchiveDetail() {
        return new RetrieveProductArchiveDetail();
    }

    /**
     * Create an instance of {@link ParentAssociation }
     * 
     */
    public ParentAssociation createParentAssociation() {
        return new ParentAssociation();
    }

    /**
     * Create an instance of {@link PaymentHistory }
     * 
     */
    public PaymentHistory createPaymentHistory() {
        return new PaymentHistory();
    }

    /**
     * Create an instance of {@link Shareholder }
     * 
     */
    public Shareholder createShareholder() {
        return new Shareholder();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Telecommunication }
     * 
     */
    public Telecommunication createTelecommunication() {
        return new Telecommunication();
    }

    /**
     * Create an instance of {@link GuarantorDetails }
     * 
     */
    public GuarantorDetails createGuarantorDetails() {
        return new GuarantorDetails();
    }

    /**
     * Create an instance of {@link TotalPaymentsCountCycleSummary }
     * 
     */
    public TotalPaymentsCountCycleSummary createTotalPaymentsCountCycleSummary() {
        return new TotalPaymentsCountCycleSummary();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link ProductSpecification }
     * 
     */
    public ProductSpecification createProductSpecification() {
        return new ProductSpecification();
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
     * Create an instance of {@link TotalPastDueCycleSummary }
     * 
     */
    public TotalPastDueCycleSummary createTotalPastDueCycleSummary() {
        return new TotalPastDueCycleSummary();
    }

    /**
     * Create an instance of {@link CurrentPayment }
     * 
     */
    public CurrentPayment createCurrentPayment() {
        return new CurrentPayment();
    }

    /**
     * Create an instance of {@link InquiryDetail }
     * 
     */
    public InquiryDetail createInquiryDetail() {
        return new InquiryDetail();
    }

    /**
     * Create an instance of {@link InquirySummary }
     * 
     */
    public InquirySummary createInquirySummary() {
        return new InquirySummary();
    }

    /**
     * Create an instance of {@link MailAddressType }
     * 
     */
    public MailAddressType createMailAddressType() {
        return new MailAddressType();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/SBRIProductServiceV2.0", name = "OrderProductResponse")
    public JAXBElement<OrderProductResponse> createOrderProductResponse(OrderProductResponse value) {
        return new JAXBElement<OrderProductResponse>(_OrderProductResponse_QNAME, OrderProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/SBRIProductServiceV2.0", name = "OrderProductRequest")
    public JAXBElement<OrderProductRequest> createOrderProductRequest(OrderProductRequest value) {
        return new JAXBElement<OrderProductRequest>(_OrderProductRequest_QNAME, OrderProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/SBRIProductServiceV2.0", name = "RetrieveProductResponse")
    public JAXBElement<RetrieveProductResponse> createRetrieveProductResponse(RetrieveProductResponse value) {
        return new JAXBElement<RetrieveProductResponse>(_RetrieveProductResponse_QNAME, RetrieveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/SBRIProductServiceV2.0", name = "RetrieveProductRequest")
    public JAXBElement<RetrieveProductRequest> createRetrieveProductRequest(RetrieveProductRequest value) {
        return new JAXBElement<RetrieveProductRequest>(_RetrieveProductRequest_QNAME, RetrieveProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GovernmentGuaranteedProgramTypeText", scope = GuarantorDetails.class)
    public JAXBElement<DNBDecodedStringType> createGuarantorDetailsGovernmentGuaranteedProgramTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_GuarantorDetailsGovernmentGuaranteedProgramTypeText_QNAME, DNBDecodedStringType.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OwnershipPercentage", scope = GuarantorDetails.class)
    public JAXBElement<BigDecimal> createGuarantorDetailsOwnershipPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GuarantorDetailsOwnershipPercentage_QNAME, BigDecimal.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuarantorTypeText", scope = GuarantorDetails.class)
    public JAXBElement<DNBDecodedStringType> createGuarantorDetailsGuarantorTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_GuarantorDetailsGuarantorTypeText_QNAME, DNBDecodedStringType.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuaranteePercentage", scope = GuarantorDetails.class)
    public JAXBElement<BigDecimal> createGuarantorDetailsGuaranteePercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GuarantorDetailsGuaranteePercentage_QNAME, BigDecimal.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuarantorName", scope = GuarantorDetails.class)
    public JAXBElement<String> createGuarantorDetailsGuarantorName(String value) {
        return new JAXBElement<String>(_GuarantorDetailsGuarantorName_QNAME, String.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastDueAmount", scope = PastDueCycleSummary.class)
    public JAXBElement<AmountType> createPastDueCycleSummaryPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PastDueCycleSummaryPastDueAmount_QNAME, AmountType.class, PastDueCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HighBalanceAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailHighBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailHighBalanceAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = AccountDetail.class)
    public JAXBElement<Integer> createAccountDetailLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AvailableCreditAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailAvailableCreditAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailAvailableCreditAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastPaymentDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailLastPaymentDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailLastPaymentDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaturityDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailMaturityDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailMaturityDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OriginalAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailOriginalAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailOriginalAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpenedDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailOpenedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailOpenedDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BalloonAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailBalloonAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailBalloonAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentTypeText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailPaymentTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailPaymentTypeText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AccountRelationshipText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailAccountRelationshipText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailAccountRelationshipText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VoluntarilyClosedIndicator", scope = AccountDetail.class)
    public JAXBElement<Boolean> createAccountDetailVoluntarilyClosedIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AccountDetailVoluntarilyClosedIndicator_QNAME, Boolean.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BalloonPaymentDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailBalloonPaymentDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailBalloonPaymentDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpenAccountIndicator", scope = AccountDetail.class)
    public JAXBElement<Boolean> createAccountDetailOpenAccountIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AccountDetailOpenAccountIndicator_QNAME, Boolean.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentCreditLineAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailCurrentCreditLineAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailCurrentCreditLineAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClosedDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailClosedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailClosedDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SecuredAccountIndicator", scope = AccountDetail.class)
    public JAXBElement<Boolean> createAccountDetailSecuredAccountIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AccountDetailSecuredAccountIndicator_QNAME, Boolean.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentBalanceAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailCurrentBalanceAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CollateralTypeText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailCollateralTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailCollateralTypeText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentFrequencyText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailPaymentFrequencyText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailPaymentFrequencyText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastDuePaymentCount", scope = PaymentsCountCycleSummary.class)
    public JAXBElement<Integer> createPaymentsCountCycleSummaryPastDuePaymentCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentsCountCycleSummaryPastDuePaymentCount_QNAME, Integer.class, PaymentsCountCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastDuePercentage", scope = PastDuePercentageCycleSummary.class)
    public JAXBElement<BigDecimal> createPastDuePercentageCycleSummaryPastDuePercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastDuePercentageCycleSummaryPastDuePercentage_QNAME, BigDecimal.class, PastDuePercentageCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = CurrentPayment.class)
    public JAXBElement<Integer> createCurrentPaymentLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = CurrentPayment.class)
    public JAXBElement<String> createCurrentPaymentLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDueAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentTotalPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentTotalPastDueAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentBalanceAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailCurrentBalanceAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentDueAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentCurrentDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentCurrentDueAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = CurrentPayment.class)
    public JAXBElement<DNBDateType> createCurrentPaymentPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumPaymentAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentMinimumPaymentAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentMinimumPaymentAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalAvailableCreditAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalAvailableCreditAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalAvailableCreditAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentCreditLineAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalCurrentCreditLineAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalCurrentCreditLineAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentBalanceAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalCurrentBalanceAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalBalloonAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalBalloonAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalBalloonAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = GuaranteeDetails.class)
    public JAXBElement<Integer> createGuaranteeDetailsLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = GuaranteeDetails.class)
    public JAXBElement<String> createGuaranteeDetailsLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuaranteedPaymentIndicator", scope = GuaranteeDetails.class)
    public JAXBElement<Boolean> createGuaranteeDetailsGuaranteedPaymentIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GuaranteeDetailsGuaranteedPaymentIndicator_QNAME, Boolean.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AccountTypeText", scope = GuaranteeDetails.class)
    public JAXBElement<DNBDecodedStringType> createGuaranteeDetailsAccountTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_GuaranteeDetailsAccountTypeText_QNAME, DNBDecodedStringType.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuarantorsCount", scope = GuaranteeDetails.class)
    public JAXBElement<Integer> createGuaranteeDetailsGuarantorsCount(Integer value) {
        return new JAXBElement<Integer>(_GuaranteeDetailsGuarantorsCount_QNAME, Integer.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = GuaranteeDetails.class)
    public JAXBElement<DNBDateType> createGuaranteeDetailsPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalNumberOfPaymentsPeriod", scope = PaymentHistorySummary.class)
    public JAXBElement<Duration> createPaymentHistorySummaryTotalNumberOfPaymentsPeriod(Duration value) {
        return new JAXBElement<Duration>(_PaymentHistorySummaryTotalNumberOfPaymentsPeriod_QNAME, Duration.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExperiencesTotalCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryExperiencesTotalCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryExperiencesTotalCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPaymentsCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryTotalPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalPaymentsCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentPeriod", scope = PaymentHistorySummary.class)
    public JAXBElement<Duration> createPaymentHistorySummaryPaymentPeriod(Duration value) {
        return new JAXBElement<Duration>(_PaymentHistorySummaryPaymentPeriod_QNAME, Duration.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalOnTimePaymentsCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryTotalOnTimePaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalOnTimePaymentsCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentWithinTermsCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryPaymentWithinTermsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryPaymentWithinTermsCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffAmount", scope = PaymentHistorySummary.class)
    public JAXBElement<AmountType> createPaymentHistorySummaryTotalChargeOffAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistorySummaryTotalChargeOffAmount_QNAME, AmountType.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffRecoveredAmount", scope = PaymentHistorySummary.class)
    public JAXBElement<AmountType> createPaymentHistorySummaryTotalChargeOffRecoveredAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistorySummaryTotalChargeOffRecoveredAmount_QNAME, AmountType.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDuePaymentCount", scope = TotalPaymentsCountCycleSummary.class)
    public JAXBElement<Integer> createTotalPaymentsCountCycleSummaryTotalPastDuePaymentCount(Integer value) {
        return new JAXBElement<Integer>(_TotalPaymentsCountCycleSummaryTotalPastDuePaymentCount_QNAME, Integer.class, TotalPaymentsCountCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = MiscellaneousDetails.class)
    public JAXBElement<Integer> createMiscellaneousDetailsLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = MiscellaneousDetails.class)
    public JAXBElement<String> createMiscellaneousDetailsLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CommentText", scope = MiscellaneousDetails.class)
    public JAXBElement<String> createMiscellaneousDetailsCommentText(String value) {
        return new JAXBElement<String>(_MiscellaneousDetailsCommentText_QNAME, String.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = MiscellaneousDetails.class)
    public JAXBElement<DNBDateType> createMiscellaneousDetailsPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDueAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentTotalPastDueAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalMinimumPaymentAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalMinimumPaymentAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalMinimumPaymentAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentDueAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalCurrentDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalCurrentDueAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentBalanceAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalCurrentBalanceAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDueAmount", scope = TotalPastDueCycleSummary.class)
    public JAXBElement<AmountType> createTotalPastDueCycleSummaryTotalPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentTotalPastDueAmount_QNAME, AmountType.class, TotalPastDueCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChargeOffDate", scope = PaymentHistory.class)
    public JAXBElement<DNBDateType> createPaymentHistoryChargeOffDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_PaymentHistoryChargeOffDate_QNAME, DNBDateType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentHistoryPattern", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryPaymentHistoryPattern(String value) {
        return new JAXBElement<String>(_PaymentHistoryPaymentHistoryPattern_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = PaymentHistory.class)
    public JAXBElement<Integer> createPaymentHistoryLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OnTimePaymentsCount", scope = PaymentHistory.class)
    public JAXBElement<Integer> createPaymentHistoryOnTimePaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistoryOnTimePaymentsCount_QNAME, Integer.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChargeOffAmount", scope = PaymentHistory.class)
    public JAXBElement<AmountType> createPaymentHistoryChargeOffAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistoryChargeOffAmount_QNAME, AmountType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPaymentsPeriod", scope = PaymentHistory.class)
    public JAXBElement<Duration> createPaymentHistoryNumberOfPaymentsPeriod(Duration value) {
        return new JAXBElement<Duration>(_PaymentHistoryNumberOfPaymentsPeriod_QNAME, Duration.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPaymentsCount", scope = PaymentHistory.class)
    public JAXBElement<Integer> createPaymentHistoryTotalPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalPaymentsCount_QNAME, Integer.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChargeOffRecoveredAmount", scope = PaymentHistory.class)
    public JAXBElement<AmountType> createPaymentHistoryChargeOffRecoveredAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistoryChargeOffRecoveredAmount_QNAME, AmountType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = PaymentHistory.class)
    public JAXBElement<DNBDateType> createPaymentHistoryPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OnTimePaymentsPercentage", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<BigDecimal> createOverallPaymentHistorySummaryOnTimePaymentsPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OverallPaymentHistorySummaryOnTimePaymentsPercentage_QNAME, BigDecimal.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffPaymentsCount", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<Integer> createOverallPaymentHistorySummaryTotalChargeOffPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_OverallPaymentHistorySummaryTotalChargeOffPaymentsCount_QNAME, Integer.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPaymentsCount", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<Integer> createOverallPaymentHistorySummaryTotalPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalPaymentsCount_QNAME, Integer.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffAmount", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<AmountType> createOverallPaymentHistorySummaryTotalChargeOffAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistorySummaryTotalChargeOffAmount_QNAME, AmountType.class, OverallPaymentHistorySummary.class, value);
    }

}
