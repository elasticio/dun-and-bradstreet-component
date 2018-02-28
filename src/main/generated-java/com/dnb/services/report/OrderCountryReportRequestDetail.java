
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderCountryReportRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCountryReportRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}CountryReportInquiryDetail"/>
 *         &lt;element name="ProductSpecification" type="{http://services.dnb.com/ReportProductServiceV2.0}CountryReportProductSpecification"/>
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
@XmlType(name = "OrderCountryReportRequestDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "productSpecification",
    "archiveDetail",
    "inquiryReferenceDetail"
})
public class OrderCountryReportRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected CountryReportInquiryDetail inquiryDetail;
    @XmlElement(name = "ProductSpecification", required = true)
    protected CountryReportProductSpecification productSpecification;
    @XmlElement(name = "ArchiveDetail")
    protected ArchiveDetail archiveDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CountryReportInquiryDetail }
     *     
     */
    public CountryReportInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryReportInquiryDetail }
     *     
     */
    public void setInquiryDetail(CountryReportInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CountryReportProductSpecification }
     *     
     */
    public CountryReportProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryReportProductSpecification }
     *     
     */
    public void setProductSpecification(CountryReportProductSpecification value) {
        this.productSpecification = value;
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
