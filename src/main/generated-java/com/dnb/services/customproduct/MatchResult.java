
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationPrimaryNameType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="MatchQualityInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}MatchQualityInformation" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MatchedSubjectName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchKeywordText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchEntityTypeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchResult", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationPrimaryName",
    "primaryAddress",
    "matchQualityInformation",
    "displaySequence",
    "matchedSubjectName",
    "matchKeywordText",
    "matchEntityTypeText"
})
public class MatchResult {

    @XmlElement(name = "OrganizationPrimaryName")
    protected OrganizationPrimaryNameType organizationPrimaryName;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddressType primaryAddress;
    @XmlElement(name = "MatchQualityInformation")
    protected MatchQualityInformation matchQualityInformation;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "MatchedSubjectName")
    protected String matchedSubjectName;
    @XmlElement(name = "MatchKeywordText")
    protected String matchKeywordText;
    @XmlElement(name = "MatchEntityTypeText")
    protected String matchEntityTypeText;

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public OrganizationPrimaryNameType getOrganizationPrimaryName() {
        return organizationPrimaryName;
    }

    /**
     * Sets the value of the organizationPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public void setOrganizationPrimaryName(OrganizationPrimaryNameType value) {
        this.organizationPrimaryName = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setPrimaryAddress(PrimaryAddressType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the matchQualityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MatchQualityInformation }
     *     
     */
    public MatchQualityInformation getMatchQualityInformation() {
        return matchQualityInformation;
    }

    /**
     * Sets the value of the matchQualityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchQualityInformation }
     *     
     */
    public void setMatchQualityInformation(MatchQualityInformation value) {
        this.matchQualityInformation = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the matchedSubjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchedSubjectName() {
        return matchedSubjectName;
    }

    /**
     * Sets the value of the matchedSubjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchedSubjectName(String value) {
        this.matchedSubjectName = value;
    }

    /**
     * Gets the value of the matchKeywordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchKeywordText() {
        return matchKeywordText;
    }

    /**
     * Sets the value of the matchKeywordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchKeywordText(String value) {
        this.matchKeywordText = value;
    }

    /**
     * Gets the value of the matchEntityTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchEntityTypeText() {
        return matchEntityTypeText;
    }

    /**
     * Sets the value of the matchEntityTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchEntityTypeText(String value) {
        this.matchEntityTypeText = value;
    }

}
