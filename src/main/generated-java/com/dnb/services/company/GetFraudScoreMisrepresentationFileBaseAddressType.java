
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFraudScoreMisrepresentationFileBaseAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFraudScoreMisrepresentationFileBaseAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddressLine" type="{http://services.dnb.com/CompanyServiceV2.0}StreetAddressLine" minOccurs="0"/>
 *         &lt;element name="PrimaryTownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CompanyServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFraudScoreMisrepresentationFileBaseAddressType", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "streetAddressLine",
    "primaryTownName",
    "territoryAbbreviatedName",
    "postalCode",
    "countryISOAlpha2Code"
})
public class GetFraudScoreMisrepresentationFileBaseAddressType {

    @XmlElement(name = "StreetAddressLine")
    protected StreetAddressLine streetAddressLine;
    @XmlElement(name = "PrimaryTownName")
    protected String primaryTownName;
    @XmlElement(name = "TerritoryAbbreviatedName")
    protected String territoryAbbreviatedName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;

    /**
     * Gets the value of the streetAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddressLine }
     *     
     */
    public StreetAddressLine getStreetAddressLine() {
        return streetAddressLine;
    }

    /**
     * Sets the value of the streetAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddressLine }
     *     
     */
    public void setStreetAddressLine(StreetAddressLine value) {
        this.streetAddressLine = value;
    }

    /**
     * Gets the value of the primaryTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTownName() {
        return primaryTownName;
    }

    /**
     * Sets the value of the primaryTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTownName(String value) {
        this.primaryTownName = value;
    }

    /**
     * Gets the value of the territoryAbbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryAbbreviatedName() {
        return territoryAbbreviatedName;
    }

    /**
     * Sets the value of the territoryAbbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryAbbreviatedName(String value) {
        this.territoryAbbreviatedName = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
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

}
