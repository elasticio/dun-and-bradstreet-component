
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountrySanctionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySanctionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SanctionListName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SanctionListWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="SanctionsAuthorityWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
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
@XmlType(name = "CountrySanctionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "sanctionListName",
    "sanctionListWebPageAddress",
    "sanctionsAuthorityWebPageAddress",
    "matchedIndicator"
})
public class CountrySanctionDetail {

    @XmlElement(name = "SanctionListName")
    protected String sanctionListName;
    @XmlElement(name = "SanctionListWebPageAddress")
    protected WebPageAddressType sanctionListWebPageAddress;
    @XmlElement(name = "SanctionsAuthorityWebPageAddress")
    protected WebPageAddressType sanctionsAuthorityWebPageAddress;
    @XmlElement(name = "MatchedIndicator")
    protected Boolean matchedIndicator;

    /**
     * Gets the value of the sanctionListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionListName() {
        return sanctionListName;
    }

    /**
     * Sets the value of the sanctionListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionListName(String value) {
        this.sanctionListName = value;
    }

    /**
     * Gets the value of the sanctionListWebPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getSanctionListWebPageAddress() {
        return sanctionListWebPageAddress;
    }

    /**
     * Sets the value of the sanctionListWebPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setSanctionListWebPageAddress(WebPageAddressType value) {
        this.sanctionListWebPageAddress = value;
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
