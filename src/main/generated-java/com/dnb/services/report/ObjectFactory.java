
package com.dnb.services.report;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dnb.services.report package. 
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

    private final static QName _OrderCompanyReportRequest_QNAME = new QName("http://services.dnb.com/ReportProductServiceV2.0", "OrderCompanyReportRequest");
    private final static QName _OrderCountryReportRequest_QNAME = new QName("http://services.dnb.com/ReportProductServiceV2.0", "OrderCountryReportRequest");
    private final static QName _OrderCompanyPublicDocumentRequest_QNAME = new QName("http://services.dnb.com/ReportProductServiceV2.0", "OrderCompanyPublicDocumentRequest");
    private final static QName _OrderCompanyPublicDocumentResponse_QNAME = new QName("http://services.dnb.com/ReportProductServiceV2.0", "OrderCompanyPublicDocumentResponse");
    private final static QName _OrderCompanyReportResponse_QNAME = new QName("http://services.dnb.com/ReportProductServiceV2.0", "OrderCompanyReportResponse");
    private final static QName _OrderCountryReportResponse_QNAME = new QName("http://services.dnb.com/ReportProductServiceV2.0", "OrderCountryReportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dnb.services.report
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderCompanyReportResponse }
     * 
     */
    public OrderCompanyReportResponse createOrderCompanyReportResponse() {
        return new OrderCompanyReportResponse();
    }

    /**
     * Create an instance of {@link OrderCountryReportResponse }
     * 
     */
    public OrderCountryReportResponse createOrderCountryReportResponse() {
        return new OrderCountryReportResponse();
    }

    /**
     * Create an instance of {@link OrderCompanyPublicDocumentRequest }
     * 
     */
    public OrderCompanyPublicDocumentRequest createOrderCompanyPublicDocumentRequest() {
        return new OrderCompanyPublicDocumentRequest();
    }

    /**
     * Create an instance of {@link OrderCompanyPublicDocumentResponse }
     * 
     */
    public OrderCompanyPublicDocumentResponse createOrderCompanyPublicDocumentResponse() {
        return new OrderCompanyPublicDocumentResponse();
    }

    /**
     * Create an instance of {@link OrderCountryReportRequest }
     * 
     */
    public OrderCountryReportRequest createOrderCountryReportRequest() {
        return new OrderCountryReportRequest();
    }

    /**
     * Create an instance of {@link OrderCompanyReportRequest }
     * 
     */
    public OrderCompanyReportRequest createOrderCompanyReportRequest() {
        return new OrderCompanyReportRequest();
    }

    /**
     * Create an instance of {@link CountryReportProduct }
     * 
     */
    public CountryReportProduct createCountryReportProduct() {
        return new CountryReportProduct();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberTypeCodeType }
     * 
     */
    public OrganizationIdentificationNumberTypeCodeType createOrganizationIdentificationNumberTypeCodeType() {
        return new OrganizationIdentificationNumberTypeCodeType();
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
     * Create an instance of {@link CompanyDocumentProductSpecification }
     * 
     */
    public CompanyDocumentProductSpecification createCompanyDocumentProductSpecification() {
        return new CompanyDocumentProductSpecification();
    }

    /**
     * Create an instance of {@link OrderCountryReportRequestDetail }
     * 
     */
    public OrderCountryReportRequestDetail createOrderCountryReportRequestDetail() {
        return new OrderCountryReportRequestDetail();
    }

    /**
     * Create an instance of {@link ResponseArchiveDetail }
     * 
     */
    public ResponseArchiveDetail createResponseArchiveDetail() {
        return new ResponseArchiveDetail();
    }

    /**
     * Create an instance of {@link OrderCompanyPublicDocumentCoverPageDetail }
     * 
     */
    public OrderCompanyPublicDocumentCoverPageDetail createOrderCompanyPublicDocumentCoverPageDetail() {
        return new OrderCompanyPublicDocumentCoverPageDetail();
    }

    /**
     * Create an instance of {@link SubjectHeader }
     * 
     */
    public SubjectHeader createSubjectHeader() {
        return new SubjectHeader();
    }

    /**
     * Create an instance of {@link OrderCompanyPublicDocumentResponseDetail }
     * 
     */
    public OrderCompanyPublicDocumentResponseDetail createOrderCompanyPublicDocumentResponseDetail() {
        return new OrderCompanyPublicDocumentResponseDetail();
    }

    /**
     * Create an instance of {@link SimpleAddress }
     * 
     */
    public SimpleAddress createSimpleAddress() {
        return new SimpleAddress();
    }

    /**
     * Create an instance of {@link ResponseDocumentTypeDetail }
     * 
     */
    public ResponseDocumentTypeDetail createResponseDocumentTypeDetail() {
        return new ResponseDocumentTypeDetail();
    }

    /**
     * Create an instance of {@link DeliveryDetail }
     * 
     */
    public DeliveryDetail createDeliveryDetail() {
        return new DeliveryDetail();
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
     * Create an instance of {@link OrderCompanyReportRequestDetail }
     * 
     */
    public OrderCompanyReportRequestDetail createOrderCompanyReportRequestDetail() {
        return new OrderCompanyReportRequestDetail();
    }

    /**
     * Create an instance of {@link RegisteredDetail }
     * 
     */
    public RegisteredDetail createRegisteredDetail() {
        return new RegisteredDetail();
    }

    /**
     * Create an instance of {@link DocumentDetails }
     * 
     */
    public DocumentDetails createDocumentDetails() {
        return new DocumentDetails();
    }

    /**
     * Create an instance of {@link CompanyDocumentDetails }
     * 
     */
    public CompanyDocumentDetails createCompanyDocumentDetails() {
        return new CompanyDocumentDetails();
    }

    /**
     * Create an instance of {@link OrderCompanyPublicDocumentRequestDetail }
     * 
     */
    public OrderCompanyPublicDocumentRequestDetail createOrderCompanyPublicDocumentRequestDetail() {
        return new OrderCompanyPublicDocumentRequestDetail();
    }

    /**
     * Create an instance of {@link OrderCompanyReportResponseDetail }
     * 
     */
    public OrderCompanyReportResponseDetail createOrderCompanyReportResponseDetail() {
        return new OrderCompanyReportResponseDetail();
    }

    /**
     * Create an instance of {@link ArchiveDetail }
     * 
     */
    public ArchiveDetail createArchiveDetail() {
        return new ArchiveDetail();
    }

    /**
     * Create an instance of {@link OrganizationNameBaseType }
     * 
     */
    public OrganizationNameBaseType createOrganizationNameBaseType() {
        return new OrganizationNameBaseType();
    }

    /**
     * Create an instance of {@link OrganizationPrimaryNameType }
     * 
     */
    public OrganizationPrimaryNameType createOrganizationPrimaryNameType() {
        return new OrganizationPrimaryNameType();
    }

    /**
     * Create an instance of {@link ObjectAttachmentForResponse }
     * 
     */
    public ObjectAttachmentForResponse createObjectAttachmentForResponse() {
        return new ObjectAttachmentForResponse();
    }

    /**
     * Create an instance of {@link OrganizationName }
     * 
     */
    public OrganizationName createOrganizationName() {
        return new OrganizationName();
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
     * Create an instance of {@link OrderCountryReportResponseDetail }
     * 
     */
    public OrderCountryReportResponseDetail createOrderCountryReportResponseDetail() {
        return new OrderCountryReportResponseDetail();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberSimpleType }
     * 
     */
    public OrganizationIdentificationNumberSimpleType createOrganizationIdentificationNumberSimpleType() {
        return new OrganizationIdentificationNumberSimpleType();
    }

    /**
     * Create an instance of {@link InquiryReferenceDetail }
     * 
     */
    public InquiryReferenceDetail createInquiryReferenceDetail() {
        return new InquiryReferenceDetail();
    }

    /**
     * Create an instance of {@link ObjectAttachmentForCompanyReport }
     * 
     */
    public ObjectAttachmentForCompanyReport createObjectAttachmentForCompanyReport() {
        return new ObjectAttachmentForCompanyReport();
    }

    /**
     * Create an instance of {@link RequestDocumentTypeDetail }
     * 
     */
    public RequestDocumentTypeDetail createRequestDocumentTypeDetail() {
        return new RequestDocumentTypeDetail();
    }

    /**
     * Create an instance of {@link RequestTransactionDetail }
     * 
     */
    public RequestTransactionDetail createRequestTransactionDetail() {
        return new RequestTransactionDetail();
    }

    /**
     * Create an instance of {@link CountryReportProductSpecification }
     * 
     */
    public CountryReportProductSpecification createCountryReportProductSpecification() {
        return new CountryReportProductSpecification();
    }

    /**
     * Create an instance of {@link ProductResponseInquiryDetail }
     * 
     */
    public ProductResponseInquiryDetail createProductResponseInquiryDetail() {
        return new ProductResponseInquiryDetail();
    }

    /**
     * Create an instance of {@link DNBStringType256 }
     * 
     */
    public DNBStringType256 createDNBStringType256() {
        return new DNBStringType256();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link ResultMessage }
     * 
     */
    public ResultMessage createResultMessage() {
        return new ResultMessage();
    }

    /**
     * Create an instance of {@link CompanyDocumentProduct }
     * 
     */
    public CompanyDocumentProduct createCompanyDocumentProduct() {
        return new CompanyDocumentProduct();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link CountryReportInquiryDetail }
     * 
     */
    public CountryReportInquiryDetail createCountryReportInquiryDetail() {
        return new CountryReportInquiryDetail();
    }

    /**
     * Create an instance of {@link ProductSpecification }
     * 
     */
    public ProductSpecification createProductSpecification() {
        return new ProductSpecification();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link DNBDecodedStringType }
     * 
     */
    public DNBDecodedStringType createDNBDecodedStringType() {
        return new DNBDecodedStringType();
    }

    /**
     * Create an instance of {@link InquiryDetail }
     * 
     */
    public InquiryDetail createInquiryDetail() {
        return new InquiryDetail();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCompanyReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/ReportProductServiceV2.0", name = "OrderCompanyReportRequest")
    public JAXBElement<OrderCompanyReportRequest> createOrderCompanyReportRequest(OrderCompanyReportRequest value) {
        return new JAXBElement<OrderCompanyReportRequest>(_OrderCompanyReportRequest_QNAME, OrderCompanyReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCountryReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/ReportProductServiceV2.0", name = "OrderCountryReportRequest")
    public JAXBElement<OrderCountryReportRequest> createOrderCountryReportRequest(OrderCountryReportRequest value) {
        return new JAXBElement<OrderCountryReportRequest>(_OrderCountryReportRequest_QNAME, OrderCountryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCompanyPublicDocumentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/ReportProductServiceV2.0", name = "OrderCompanyPublicDocumentRequest")
    public JAXBElement<OrderCompanyPublicDocumentRequest> createOrderCompanyPublicDocumentRequest(OrderCompanyPublicDocumentRequest value) {
        return new JAXBElement<OrderCompanyPublicDocumentRequest>(_OrderCompanyPublicDocumentRequest_QNAME, OrderCompanyPublicDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCompanyPublicDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/ReportProductServiceV2.0", name = "OrderCompanyPublicDocumentResponse")
    public JAXBElement<OrderCompanyPublicDocumentResponse> createOrderCompanyPublicDocumentResponse(OrderCompanyPublicDocumentResponse value) {
        return new JAXBElement<OrderCompanyPublicDocumentResponse>(_OrderCompanyPublicDocumentResponse_QNAME, OrderCompanyPublicDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCompanyReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/ReportProductServiceV2.0", name = "OrderCompanyReportResponse")
    public JAXBElement<OrderCompanyReportResponse> createOrderCompanyReportResponse(OrderCompanyReportResponse value) {
        return new JAXBElement<OrderCompanyReportResponse>(_OrderCompanyReportResponse_QNAME, OrderCompanyReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCountryReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/ReportProductServiceV2.0", name = "OrderCountryReportResponse")
    public JAXBElement<OrderCountryReportResponse> createOrderCountryReportResponse(OrderCountryReportResponse value) {
        return new JAXBElement<OrderCountryReportResponse>(_OrderCountryReportResponse_QNAME, OrderCountryReportResponse.class, null, value);
    }

}
