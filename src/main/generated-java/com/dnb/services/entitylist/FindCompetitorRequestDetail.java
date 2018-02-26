
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindCompetitorRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompetitorRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindCompetitorInquiryDetail"/>
 *         &lt;element name="FindCompetitorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}FindCompetitorSpecification" minOccurs="0"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/EntityListServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompetitorRequestDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inquiryDetail",
    "findCompetitorSpecification",
    "inquiryReferenceDetail"
})
public class FindCompetitorRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected FindCompetitorInquiryDetail inquiryDetail;
    @XmlElement(name = "FindCompetitorSpecification")
    protected FindCompetitorSpecification findCompetitorSpecification;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompetitorInquiryDetail }
     *     
     */
    public FindCompetitorInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompetitorInquiryDetail }
     *     
     */
    public void setInquiryDetail(FindCompetitorInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the findCompetitorSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompetitorSpecification }
     *     
     */
    public FindCompetitorSpecification getFindCompetitorSpecification() {
        return findCompetitorSpecification;
    }

    /**
     * Sets the value of the findCompetitorSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompetitorSpecification }
     *     
     */
    public void setFindCompetitorSpecification(FindCompetitorSpecification value) {
        this.findCompetitorSpecification = value;
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
