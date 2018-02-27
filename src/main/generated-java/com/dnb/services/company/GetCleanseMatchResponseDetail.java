
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCleanseMatchResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCleanseMatchResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}InquiryDetail"/>
 *         &lt;element name="MatchResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}MatchResultDetail" minOccurs="0"/>
 *         &lt;element name="CleanseAndStandardizeResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CleanseAndStandardizeResult" minOccurs="0"/>
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
@XmlType(name = "GetCleanseMatchResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "matchResponseDetail",
    "cleanseAndStandardizeResponseDetail",
    "inquiryReferenceDetail"
})
public class GetCleanseMatchResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected InquiryDetail inquiryDetail;
    @XmlElement(name = "MatchResponseDetail")
    protected MatchResultDetail matchResponseDetail;
    @XmlElement(name = "CleanseAndStandardizeResponseDetail")
    protected CleanseAndStandardizeResult cleanseAndStandardizeResponseDetail;
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
     * Gets the value of the cleanseAndStandardizeResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CleanseAndStandardizeResult }
     *     
     */
    public CleanseAndStandardizeResult getCleanseAndStandardizeResponseDetail() {
        return cleanseAndStandardizeResponseDetail;
    }

    /**
     * Sets the value of the cleanseAndStandardizeResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanseAndStandardizeResult }
     *     
     */
    public void setCleanseAndStandardizeResponseDetail(CleanseAndStandardizeResult value) {
        this.cleanseAndStandardizeResponseDetail = value;
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
