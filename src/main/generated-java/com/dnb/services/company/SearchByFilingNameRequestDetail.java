
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNameRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNameInquiryDetail"/>
 *         &lt;element name="PublicFilingSearchSpecification" type="{http://services.dnb.com/CompanyServiceV2.0}PublicFilingSearchSpecification" minOccurs="0"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/CompanyServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNameRequestDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "publicFilingSearchSpecification",
    "inquiryReferenceDetail"
})
public class SearchByFilingNameRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected SearchByFilingNameInquiryDetail inquiryDetail;
    @XmlElement(name = "PublicFilingSearchSpecification")
    protected PublicFilingSearchSpecification publicFilingSearchSpecification;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNameInquiryDetail }
     *     
     */
    public SearchByFilingNameInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNameInquiryDetail }
     *     
     */
    public void setInquiryDetail(SearchByFilingNameInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the publicFilingSearchSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilingSearchSpecification }
     *     
     */
    public PublicFilingSearchSpecification getPublicFilingSearchSpecification() {
        return publicFilingSearchSpecification;
    }

    /**
     * Sets the value of the publicFilingSearchSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilingSearchSpecification }
     *     
     */
    public void setPublicFilingSearchSpecification(PublicFilingSearchSpecification value) {
        this.publicFilingSearchSpecification = value;
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
