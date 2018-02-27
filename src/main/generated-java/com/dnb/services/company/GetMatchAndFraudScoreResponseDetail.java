
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMatchAndFraudScoreResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMatchAndFraudScoreResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreInquiryDetail"/>
 *         &lt;element name="MatchResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}MatchResultDetail" minOccurs="0"/>
 *         &lt;element name="GetFraudScoreResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}FraudScoreResult" minOccurs="0"/>
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
@XmlType(name = "GetMatchAndFraudScoreResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "matchResponseDetail",
    "getFraudScoreResponseDetail",
    "inquiryReferenceDetail"
})
public class GetMatchAndFraudScoreResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected GetFraudScoreInquiryDetail inquiryDetail;
    @XmlElement(name = "MatchResponseDetail")
    protected MatchResultDetail matchResponseDetail;
    @XmlElement(name = "GetFraudScoreResponseDetail")
    protected FraudScoreResult getFraudScoreResponseDetail;
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
     * Gets the value of the matchResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResultDetail }
     *     
     */
    public MatchResultDetail getMatchResponseDetail() {
        return matchResponseDetail;
    }

    /**
     * Sets the value of the matchResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResultDetail }
     *     
     */
    public void setMatchResponseDetail(MatchResultDetail value) {
        this.matchResponseDetail = value;
    }

    /**
     * Gets the value of the getFraudScoreResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScoreResult }
     *     
     */
    public FraudScoreResult getGetFraudScoreResponseDetail() {
        return getFraudScoreResponseDetail;
    }

    /**
     * Sets the value of the getFraudScoreResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScoreResult }
     *     
     */
    public void setGetFraudScoreResponseDetail(FraudScoreResult value) {
        this.getFraudScoreResponseDetail = value;
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
