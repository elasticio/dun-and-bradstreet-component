
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatorDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatorDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistryWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberType" minOccurs="0"/>
 *         &lt;element name="StockExchangeAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="WebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="RegionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
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
@XmlType(name = "RegulatorDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "registryWebPageAddress",
    "organizationIdentificationNumber",
    "stockExchangeAbbreviatedName",
    "location",
    "effectiveDate",
    "webPageAddress",
    "regionText"
})
public class RegulatorDetail {

    @XmlElement(name = "RegistryWebPageAddress")
    protected WebPageAddressType registryWebPageAddress;
    @XmlElement(name = "OrganizationIdentificationNumber")
    protected OrganizationIdentificationNumberType organizationIdentificationNumber;
    @XmlElement(name = "StockExchangeAbbreviatedName")
    protected String stockExchangeAbbreviatedName;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "EffectiveDate")
    protected DNBDateType effectiveDate;
    @XmlElement(name = "WebPageAddress")
    protected WebPageAddressType webPageAddress;
    @XmlElement(name = "RegionText")
    protected String regionText;

    /**
     * Gets the value of the registryWebPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getRegistryWebPageAddress() {
        return registryWebPageAddress;
    }

    /**
     * Sets the value of the registryWebPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setRegistryWebPageAddress(WebPageAddressType value) {
        this.registryWebPageAddress = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberType }
     *     
     */
    public OrganizationIdentificationNumberType getOrganizationIdentificationNumber() {
        return organizationIdentificationNumber;
    }

    /**
     * Sets the value of the organizationIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberType }
     *     
     */
    public void setOrganizationIdentificationNumber(OrganizationIdentificationNumberType value) {
        this.organizationIdentificationNumber = value;
    }

    /**
     * Gets the value of the stockExchangeAbbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchangeAbbreviatedName() {
        return stockExchangeAbbreviatedName;
    }

    /**
     * Sets the value of the stockExchangeAbbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchangeAbbreviatedName(String value) {
        this.stockExchangeAbbreviatedName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEffectiveDate(DNBDateType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the webPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getWebPageAddress() {
        return webPageAddress;
    }

    /**
     * Sets the value of the webPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setWebPageAddress(WebPageAddressType value) {
        this.webPageAddress = value;
    }

    /**
     * Gets the value of the regionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionText() {
        return regionText;
    }

    /**
     * Sets the value of the regionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionText(String value) {
        this.regionText = value;
    }

}
