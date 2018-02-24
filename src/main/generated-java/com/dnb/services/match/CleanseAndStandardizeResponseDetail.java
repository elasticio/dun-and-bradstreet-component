
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleanseAndStandardizeResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleanseAndStandardizeResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CleanseAndStandardizeInquiryDetail"/>
 *         &lt;element name="StandardizedName" type="{http://services.dnb.com/CompanyServiceV2.0}StandardizedNameType" minOccurs="0"/>
 *         &lt;element name="StandardizedAddress" type="{http://services.dnb.com/CompanyServiceV2.0}StandardizedAddress"/>
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
@XmlType(name = "CleanseAndStandardizeResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "standardizedName",
    "standardizedAddress",
    "inquiryReferenceDetail"
})
public class CleanseAndStandardizeResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected CleanseAndStandardizeInquiryDetail inquiryDetail;
    @XmlElement(name = "StandardizedName")
    protected StandardizedNameType standardizedName;
    @XmlElement(name = "StandardizedAddress", required = true)
    protected StandardizedAddress standardizedAddress;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CleanseAndStandardizeInquiryDetail }
     *     
     */
    public CleanseAndStandardizeInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanseAndStandardizeInquiryDetail }
     *     
     */
    public void setInquiryDetail(CleanseAndStandardizeInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the standardizedName property.
     * 
     * @return
     *     possible object is
     *     {@link StandardizedNameType }
     *     
     */
    public StandardizedNameType getStandardizedName() {
        return standardizedName;
    }

    /**
     * Sets the value of the standardizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardizedNameType }
     *     
     */
    public void setStandardizedName(StandardizedNameType value) {
        this.standardizedName = value;
    }

    /**
     * Gets the value of the standardizedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StandardizedAddress }
     *     
     */
    public StandardizedAddress getStandardizedAddress() {
        return standardizedAddress;
    }

    /**
     * Sets the value of the standardizedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardizedAddress }
     *     
     */
    public void setStandardizedAddress(StandardizedAddress value) {
        this.standardizedAddress = value;
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
