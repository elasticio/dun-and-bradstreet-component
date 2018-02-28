
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductResponseInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductResponseInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/ReportProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/ReportProductServiceV2.0}CountryISOAlpha2Type"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrganizationIdentificationNumberTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductResponseInquiryDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "dunsNumber",
    "countryISOAlpha2Code",
    "organizationIdentificationNumberDetail"
})
public class ProductResponseInquiryDetail {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "CountryISOAlpha2Code", required = true)
    protected String countryISOAlpha2Code;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected OrganizationIdentificationNumberTypeCodeType organizationIdentificationNumberDetail;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberTypeCodeType }
     *     
     */
    public OrganizationIdentificationNumberTypeCodeType getOrganizationIdentificationNumberDetail() {
        return organizationIdentificationNumberDetail;
    }

    /**
     * Sets the value of the organizationIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberTypeCodeType }
     *     
     */
    public void setOrganizationIdentificationNumberDetail(OrganizationIdentificationNumberTypeCodeType value) {
        this.organizationIdentificationNumberDetail = value;
    }

}
