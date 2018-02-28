
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderCompanyPublicDocumentRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCompanyPublicDocumentRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}InquiryDetail"/>
 *         &lt;element name="ProductSpecification" type="{http://services.dnb.com/ReportProductServiceV2.0}CompanyDocumentProductSpecification"/>
 *         &lt;element name="DocumentCoverPageDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCompanyPublicDocumentCoverPageDetail" minOccurs="0"/>
 *         &lt;element name="DeliveryDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}DeliveryDetail" minOccurs="0"/>
 *         &lt;element name="ArchiveDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}ArchiveDetail" minOccurs="0"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCompanyPublicDocumentRequestDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "productSpecification",
    "documentCoverPageDetail",
    "deliveryDetail",
    "archiveDetail",
    "inquiryReferenceDetail"
})
public class OrderCompanyPublicDocumentRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected InquiryDetail inquiryDetail;
    @XmlElement(name = "ProductSpecification", required = true)
    protected CompanyDocumentProductSpecification productSpecification;
    @XmlElement(name = "DocumentCoverPageDetail")
    protected OrderCompanyPublicDocumentCoverPageDetail documentCoverPageDetail;
    @XmlElement(name = "DeliveryDetail")
    protected DeliveryDetail deliveryDetail;
    @XmlElement(name = "ArchiveDetail")
    protected ArchiveDetail archiveDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryDetail }
     *     
     */
    public InquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryDetail }
     *     
     */
    public void setInquiryDetail(InquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDocumentProductSpecification }
     *     
     */
    public CompanyDocumentProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDocumentProductSpecification }
     *     
     */
    public void setProductSpecification(CompanyDocumentProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the documentCoverPageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCompanyPublicDocumentCoverPageDetail }
     *     
     */
    public OrderCompanyPublicDocumentCoverPageDetail getDocumentCoverPageDetail() {
        return documentCoverPageDetail;
    }

    /**
     * Sets the value of the documentCoverPageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCompanyPublicDocumentCoverPageDetail }
     *     
     */
    public void setDocumentCoverPageDetail(OrderCompanyPublicDocumentCoverPageDetail value) {
        this.documentCoverPageDetail = value;
    }

    /**
     * Gets the value of the deliveryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetail }
     *     
     */
    public DeliveryDetail getDeliveryDetail() {
        return deliveryDetail;
    }

    /**
     * Sets the value of the deliveryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetail }
     *     
     */
    public void setDeliveryDetail(DeliveryDetail value) {
        this.deliveryDetail = value;
    }

    /**
     * Gets the value of the archiveDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveDetail }
     *     
     */
    public ArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }

    /**
     * Sets the value of the archiveDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveDetail }
     *     
     */
    public void setArchiveDetail(ArchiveDetail value) {
        this.archiveDetail = value;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }

    /**
     * Sets the value of the inquiryReferenceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public void setInquiryReferenceDetail(InquiryReferenceDetail value) {
        this.inquiryReferenceDetail = value;
    }

}
