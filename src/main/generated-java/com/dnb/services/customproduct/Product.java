
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID" type="{http://services.dnb.com/CustomProductServiceV2.0}ProductCode" minOccurs="0"/>
 *         &lt;element name="InDateStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SubjectScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://services.dnb.com/CustomProductServiceV2.0}Organization"/>
 *         &lt;element name="CountryRiskDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryRiskDetails" minOccurs="0"/>
 *         &lt;element name="ShareholdersMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ArchiveDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponseArchiveDetail" minOccurs="0"/>
 *         &lt;element name="CopyrightNoticeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="CreditDecisionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditDecisionDetail" minOccurs="0"/>
 *         &lt;element name="IndustryProfile" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryProfile" minOccurs="0"/>
 *         &lt;element name="LocationProfile" type="{http://services.dnb.com/CustomProductServiceV2.0}LocationProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dnbProductID",
    "inDateStatusText",
    "subjectScopeText",
    "languageCode",
    "organization",
    "countryRiskDetails",
    "shareholdersMatchedQuantity",
    "archiveDetail",
    "copyrightNoticeText",
    "creditDecisionDetail",
    "industryProfile",
    "locationProfile"
})
public class Product {

    @XmlElement(name = "DNBProductID")
    protected String dnbProductID;
    @XmlElement(name = "InDateStatusText")
    protected DNBDecodedStringType inDateStatusText;
    @XmlElement(name = "SubjectScopeText")
    protected DNBDecodedStringType subjectScopeText;
    @XmlElement(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlElement(name = "Organization", required = true)
    protected Organization organization;
    @XmlElement(name = "CountryRiskDetails")
    protected CountryRiskDetails countryRiskDetails;
    @XmlElement(name = "ShareholdersMatchedQuantity")
    protected Integer shareholdersMatchedQuantity;
    @XmlElement(name = "ArchiveDetail")
    protected ResponseArchiveDetail archiveDetail;
    @XmlElement(name = "CopyrightNoticeText")
    protected String copyrightNoticeText;
    @XmlElement(name = "CreditDecisionDetail")
    protected CreditDecisionDetail creditDecisionDetail;
    @XmlElement(name = "IndustryProfile")
    protected IndustryProfile industryProfile;
    @XmlElement(name = "LocationProfile")
    protected LocationProfile locationProfile;

    /**
     * Gets the value of the dnbProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBProductID() {
        return dnbProductID;
    }

    /**
     * Sets the value of the dnbProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBProductID(String value) {
        this.dnbProductID = value;
    }

    /**
     * Gets the value of the inDateStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getInDateStatusText() {
        return inDateStatusText;
    }

    /**
     * Sets the value of the inDateStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setInDateStatusText(DNBDecodedStringType value) {
        this.inDateStatusText = value;
    }

    /**
     * Gets the value of the subjectScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSubjectScopeText() {
        return subjectScopeText;
    }

    /**
     * Sets the value of the subjectScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSubjectScopeText(DNBDecodedStringType value) {
        this.subjectScopeText = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguageCode(BigInteger value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the countryRiskDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRiskDetails }
     *     
     */
    public CountryRiskDetails getCountryRiskDetails() {
        return countryRiskDetails;
    }

    /**
     * Sets the value of the countryRiskDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRiskDetails }
     *     
     */
    public void setCountryRiskDetails(CountryRiskDetails value) {
        this.countryRiskDetails = value;
    }

    /**
     * Gets the value of the shareholdersMatchedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShareholdersMatchedQuantity() {
        return shareholdersMatchedQuantity;
    }

    /**
     * Sets the value of the shareholdersMatchedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShareholdersMatchedQuantity(Integer value) {
        this.shareholdersMatchedQuantity = value;
    }

    /**
     * Gets the value of the archiveDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseArchiveDetail }
     *     
     */
    public ResponseArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }

    /**
     * Sets the value of the archiveDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseArchiveDetail }
     *     
     */
    public void setArchiveDetail(ResponseArchiveDetail value) {
        this.archiveDetail = value;
    }

    /**
     * Gets the value of the copyrightNoticeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightNoticeText() {
        return copyrightNoticeText;
    }

    /**
     * Sets the value of the copyrightNoticeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightNoticeText(String value) {
        this.copyrightNoticeText = value;
    }

    /**
     * Gets the value of the creditDecisionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDecisionDetail }
     *     
     */
    public CreditDecisionDetail getCreditDecisionDetail() {
        return creditDecisionDetail;
    }

    /**
     * Sets the value of the creditDecisionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDecisionDetail }
     *     
     */
    public void setCreditDecisionDetail(CreditDecisionDetail value) {
        this.creditDecisionDetail = value;
    }

    /**
     * Gets the value of the industryProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryProfile }
     *     
     */
    public IndustryProfile getIndustryProfile() {
        return industryProfile;
    }

    /**
     * Sets the value of the industryProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryProfile }
     *     
     */
    public void setIndustryProfile(IndustryProfile value) {
        this.industryProfile = value;
    }

    /**
     * Gets the value of the locationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LocationProfile }
     *     
     */
    public LocationProfile getLocationProfile() {
        return locationProfile;
    }

    /**
     * Sets the value of the locationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationProfile }
     *     
     */
    public void setLocationProfile(LocationProfile value) {
        this.locationProfile = value;
    }

}
