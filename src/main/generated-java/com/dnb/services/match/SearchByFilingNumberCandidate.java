
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNumberCandidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNumberCandidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingOfficeDUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="FilingOfficeName" type="{http://services.dnb.com/CompanyServiceV2.0}StringBaseType256"/>
 *         &lt;element name="FilingTerritoryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicFilingSummary" type="{http://services.dnb.com/CompanyServiceV2.0}BasePublicFilingSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNumberCandidate", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "filingNumber",
    "filingOfficeDUNSNumber",
    "filingOfficeName",
    "filingTerritoryName",
    "publicFilingSummary"
})
public class SearchByFilingNumberCandidate {

    @XmlElement(name = "FilingNumber")
    protected String filingNumber;
    @XmlElement(name = "FilingOfficeDUNSNumber")
    protected String filingOfficeDUNSNumber;
    @XmlElement(name = "FilingOfficeName", required = true)
    protected String filingOfficeName;
    @XmlElement(name = "FilingTerritoryName")
    protected String filingTerritoryName;
    @XmlElement(name = "PublicFilingSummary")
    protected BasePublicFilingSummary publicFilingSummary;

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
     * Gets the value of the filingOfficeDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeDUNSNumber() {
        return filingOfficeDUNSNumber;
    }

    /**
     * Sets the value of the filingOfficeDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeDUNSNumber(String value) {
        this.filingOfficeDUNSNumber = value;
    }

    /**
     * Gets the value of the filingOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeName() {
        return filingOfficeName;
    }

    /**
     * Sets the value of the filingOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeName(String value) {
        this.filingOfficeName = value;
    }

    /**
     * Gets the value of the filingTerritoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTerritoryName() {
        return filingTerritoryName;
    }

    /**
     * Sets the value of the filingTerritoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTerritoryName(String value) {
        this.filingTerritoryName = value;
    }

    /**
     * Gets the value of the publicFilingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BasePublicFilingSummary }
     *     
     */
    public BasePublicFilingSummary getPublicFilingSummary() {
        return publicFilingSummary;
    }

    /**
     * Sets the value of the publicFilingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePublicFilingSummary }
     *     
     */
    public void setPublicFilingSummary(BasePublicFilingSummary value) {
        this.publicFilingSummary = value;
    }

}
