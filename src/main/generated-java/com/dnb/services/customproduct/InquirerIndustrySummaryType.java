
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquirerIndustrySummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquirerIndustrySummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeSummaryType"/>
 *         &lt;element name="IndustryCodeDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquirerIndustrySummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryCount",
    "industryCode",
    "industryCodeDescription"
})
public class InquirerIndustrySummaryType {

    @XmlElement(name = "InquiryCount")
    protected int inquiryCount;
    @XmlElement(name = "IndustryCode", required = true)
    protected IndustryCodeSummaryType industryCode;
    @XmlElement(name = "IndustryCodeDescription")
    protected IndustryCodeDescriptionType industryCodeDescription;

    /**
     * Gets the value of the inquiryCount property.
     * 
     */
    public int getInquiryCount() {
        return inquiryCount;
    }

    /**
     * Sets the value of the inquiryCount property.
     * 
     */
    public void setInquiryCount(int value) {
        this.inquiryCount = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryCodeSummaryType }
     *     
     */
    public IndustryCodeSummaryType getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryCodeSummaryType }
     *     
     */
    public void setIndustryCode(IndustryCodeSummaryType value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the industryCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryCodeDescriptionType }
     *     
     */
    public IndustryCodeDescriptionType getIndustryCodeDescription() {
        return industryCodeDescription;
    }

    /**
     * Sets the value of the industryCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryCodeDescriptionType }
     *     
     */
    public void setIndustryCodeDescription(IndustryCodeDescriptionType value) {
        this.industryCodeDescription = value;
    }

}
