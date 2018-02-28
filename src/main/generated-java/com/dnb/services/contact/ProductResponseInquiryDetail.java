
package com.dnb.services.contact;

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
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/ContactProductServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/ContactProductServiceV2.0}CountryISOAlpha2Type"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/ContactProductServiceV2.0}PrincipalIdentificationNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductResponseInquiryDetail", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "dunsNumber",
    "countryISOAlpha2Code",
    "principalIdentificationNumberDetail"
})
public class ProductResponseInquiryDetail {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "CountryISOAlpha2Code", required = true)
    protected String countryISOAlpha2Code;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected PrincipalIdentificationNumberType principalIdentificationNumberDetail;

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
     * Gets the value of the principalIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalIdentificationNumberType }
     *     
     */
    public PrincipalIdentificationNumberType getPrincipalIdentificationNumberDetail() {
        return principalIdentificationNumberDetail;
    }

    /**
     * Sets the value of the principalIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalIdentificationNumberType }
     *     
     */
    public void setPrincipalIdentificationNumberDetail(PrincipalIdentificationNumberType value) {
        this.principalIdentificationNumberDetail = value;
    }

}
