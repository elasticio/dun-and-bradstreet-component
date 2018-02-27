
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMatchAndFraudScoreRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMatchAndFraudScoreRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreInquiryDetail"/>
 *         &lt;element name="MatchSpecification" type="{http://services.dnb.com/CompanyServiceV2.0}MatchSpecification" minOccurs="0"/>
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
@XmlType(name = "GetMatchAndFraudScoreRequestDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "matchSpecification",
    "inquiryReferenceDetail"
})
public class GetMatchAndFraudScoreRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected GetFraudScoreInquiryDetail inquiryDetail;
    @XmlElement(name = "MatchSpecification")
    protected MatchSpecification matchSpecification;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetFraudScoreInquiryDetail }
     *     
     */
    public GetFraudScoreInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFraudScoreInquiryDetail }
     *     
     */
    public void setInquiryDetail(GetFraudScoreInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the matchSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSpecification }
     *     
     */
    public MatchSpecification getMatchSpecification() {
        return matchSpecification;
    }

    /**
     * Sets the value of the matchSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSpecification }
     *     
     */
    public void setMatchSpecification(MatchSpecification value) {
        this.matchSpecification = value;
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
