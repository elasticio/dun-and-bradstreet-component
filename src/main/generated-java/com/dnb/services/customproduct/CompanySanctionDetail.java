
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanySanctionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanySanctionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SanctionsTypeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SanctionsListName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SanctionsListWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="SanctionsAuthorityRegionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SanctionsAuthorityWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="SanctionsHomeWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="SanctionsStockExchangeAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActiveSanctionsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompanySanctionsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CountrySanctionsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatchCandidate" type="{http://services.dnb.com/CustomProductServiceV2.0}MatchResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MatchedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanySanctionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "sanctionsTypeText",
    "sanctionsListName",
    "sanctionsListWebPageAddress",
    "sanctionsAuthorityRegionText",
    "sanctionsAuthorityWebPageAddress",
    "sanctionsHomeWebPageAddress",
    "sanctionsStockExchangeAbbreviatedName",
    "activeSanctionsIndicator",
    "companySanctionsIndicator",
    "countrySanctionsIndicator",
    "matchCandidate",
    "matchedIndicator"
})
@XmlSeeAlso({
    PrincipalSanctionDetail.class
})
public class CompanySanctionDetail {

    @XmlElement(name = "SanctionsTypeText")
    protected String sanctionsTypeText;
    @XmlElement(name = "SanctionsListName")
    protected String sanctionsListName;
    @XmlElement(name = "SanctionsListWebPageAddress")
    protected WebPageAddressType sanctionsListWebPageAddress;
    @XmlElement(name = "SanctionsAuthorityRegionText")
    protected String sanctionsAuthorityRegionText;
    @XmlElement(name = "SanctionsAuthorityWebPageAddress")
    protected WebPageAddressType sanctionsAuthorityWebPageAddress;
    @XmlElement(name = "SanctionsHomeWebPageAddress")
    protected WebPageAddressType sanctionsHomeWebPageAddress;
    @XmlElement(name = "SanctionsStockExchangeAbbreviatedName")
    protected String sanctionsStockExchangeAbbreviatedName;
    @XmlElement(name = "ActiveSanctionsIndicator")
    protected Boolean activeSanctionsIndicator;
    @XmlElement(name = "CompanySanctionsIndicator")
    protected Boolean companySanctionsIndicator;
    @XmlElement(name = "CountrySanctionsIndicator")
    protected Boolean countrySanctionsIndicator;
    @XmlElement(name = "MatchCandidate")
    protected List<MatchResult> matchCandidate;
    @XmlElement(name = "MatchedIndicator")
    protected Boolean matchedIndicator;

    /**
     * Gets the value of the sanctionsTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsTypeText() {
        return sanctionsTypeText;
    }

    /**
     * Sets the value of the sanctionsTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsTypeText(String value) {
        this.sanctionsTypeText = value;
    }

    /**
     * Gets the value of the sanctionsListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsListName() {
        return sanctionsListName;
    }

    /**
     * Sets the value of the sanctionsListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsListName(String value) {
        this.sanctionsListName = value;
    }

    /**
     * Gets the value of the sanctionsListWebPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getSanctionsListWebPageAddress() {
        return sanctionsListWebPageAddress;
    }

    /**
     * Sets the value of the sanctionsListWebPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setSanctionsListWebPageAddress(WebPageAddressType value) {
        this.sanctionsListWebPageAddress = value;
    }

    /**
     * Gets the value of the sanctionsAuthorityRegionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsAuthorityRegionText() {
        return sanctionsAuthorityRegionText;
    }

    /**
     * Sets the value of the sanctionsAuthorityRegionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsAuthorityRegionText(String value) {
        this.sanctionsAuthorityRegionText = value;
    }

    /**
     * Gets the value of the sanctionsAuthorityWebPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getSanctionsAuthorityWebPageAddress() {
        return sanctionsAuthorityWebPageAddress;
    }

    /**
     * Sets the value of the sanctionsAuthorityWebPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setSanctionsAuthorityWebPageAddress(WebPageAddressType value) {
        this.sanctionsAuthorityWebPageAddress = value;
    }

    /**
     * Gets the value of the sanctionsHomeWebPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getSanctionsHomeWebPageAddress() {
        return sanctionsHomeWebPageAddress;
    }

    /**
     * Sets the value of the sanctionsHomeWebPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setSanctionsHomeWebPageAddress(WebPageAddressType value) {
        this.sanctionsHomeWebPageAddress = value;
    }

    /**
     * Gets the value of the sanctionsStockExchangeAbbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsStockExchangeAbbreviatedName() {
        return sanctionsStockExchangeAbbreviatedName;
    }

    /**
     * Sets the value of the sanctionsStockExchangeAbbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsStockExchangeAbbreviatedName(String value) {
        this.sanctionsStockExchangeAbbreviatedName = value;
    }

    /**
     * Gets the value of the activeSanctionsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveSanctionsIndicator() {
        return activeSanctionsIndicator;
    }

    /**
     * Sets the value of the activeSanctionsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveSanctionsIndicator(Boolean value) {
        this.activeSanctionsIndicator = value;
    }

    /**
     * Gets the value of the companySanctionsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompanySanctionsIndicator() {
        return companySanctionsIndicator;
    }

    /**
     * Sets the value of the companySanctionsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompanySanctionsIndicator(Boolean value) {
        this.companySanctionsIndicator = value;
    }

    /**
     * Gets the value of the countrySanctionsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCountrySanctionsIndicator() {
        return countrySanctionsIndicator;
    }

    /**
     * Sets the value of the countrySanctionsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountrySanctionsIndicator(Boolean value) {
        this.countrySanctionsIndicator = value;
    }

    /**
     * Gets the value of the matchCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchResult }
     * 
     * 
     */
    public List<MatchResult> getMatchCandidate() {
        if (matchCandidate == null) {
            matchCandidate = new ArrayList<MatchResult>();
        }
        return this.matchCandidate;
    }

    /**
     * Gets the value of the matchedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchedIndicator() {
        return matchedIndicator;
    }

    /**
     * Sets the value of the matchedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchedIndicator(Boolean value) {
        this.matchedIndicator = value;
    }

}
