
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderCountryReportResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCountryReportResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}CountryReportInquiryDetail"/>
 *         &lt;element name="Product" type="{http://services.dnb.com/ReportProductServiceV2.0}CountryReportProduct"/>
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
@XmlType(name = "OrderCountryReportResponseDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "product",
    "inquiryReferenceDetail"
})
public class OrderCountryReportResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected CountryReportInquiryDetail inquiryDetail;
    @XmlElement(name = "Product", required = true)
    protected CountryReportProduct product;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link CountryReportProduct }
     *     
     */
    public CountryReportProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryReportProduct }
     *     
     */
    public void setProduct(CountryReportProduct value) {
        this.product = value;
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
