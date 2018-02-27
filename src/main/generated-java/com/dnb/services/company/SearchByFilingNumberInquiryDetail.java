
package com.dnb.services.company;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNumberInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNumberInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeCode" type="{http://services.dnb.com/CompanyServiceV2.0}DNBCodeValueType"/>
 *         &lt;element name="FilingNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingLocation" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNumberFilingLocation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNumberInquiryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "filingTypeCode",
    "filingNumber",
    "filingLocation"
})
public class SearchByFilingNumberInquiryDetail {

    @XmlElement(name = "FilingTypeCode", required = true)
    protected BigInteger filingTypeCode;
    @XmlElement(name = "FilingNumber", required = true)
    protected String filingNumber;
    @XmlElement(name = "FilingLocation", required = true)
    protected SearchByFilingNumberFilingLocation filingLocation;

    /**
     * Gets the value of the filingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilingTypeCode() {
        return filingTypeCode;
    }

    /**
     * Sets the value of the filingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilingTypeCode(BigInteger value) {
        this.filingTypeCode = value;
    }

    /**
     * Gets the value of the filingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingNumber() {
        return filingNumber;
    }

    /**
     * Sets the value of the filingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingNumber(String value) {
        this.filingNumber = value;
    }

    /**
     * Gets the value of the filingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNumberFilingLocation }
     *     
     */
    public SearchByFilingNumberFilingLocation getFilingLocation() {
        return filingLocation;
    }

    /**
     * Sets the value of the filingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNumberFilingLocation }
     *     
     */
    public void setFilingLocation(SearchByFilingNumberFilingLocation value) {
        this.filingLocation = value;
    }

}
