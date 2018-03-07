
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredAddressNewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredAddressNewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddressLine" type="{http://services.dnb.com/CustomProductServiceV2.0}StreetAddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryTownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="CountyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
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
 *         &lt;element name="CountyOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetNumberText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetNumberExtensionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetToNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetToNumberExtensionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MinorTownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="7"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="WritingScriptCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="7"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredAddressNewType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "streetAddressLine",
    "primaryTownName",
    "countryISOAlpha2Code",
    "countyName",
    "territoryName",
    "postalCode",
    "countyOfficialName",
    "territoryOfficialName",
    "countryOfficialName",
    "streetNumberText",
    "streetName",
    "streetNumberExtensionText",
    "streetToNumber",
    "streetToNumberExtensionText",
    "minorTownName"
})
public class RegisteredAddressNewType {

    @XmlElement(name = "StreetAddressLine")
    protected List<StreetAddressLine> streetAddressLine;
    @XmlElement(name = "PrimaryTownName")
    protected String primaryTownName;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountyOfficialName")
    protected String countyOfficialName;
    @XmlElement(name = "TerritoryOfficialName")
    protected String territoryOfficialName;
    @XmlElement(name = "CountryOfficialName")
    protected String countryOfficialName;
    @XmlElement(name = "StreetNumberText")
    protected String streetNumberText;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetNumberExtensionText")
    protected String streetNumberExtensionText;
    @XmlElement(name = "StreetToNumber")
    protected Integer streetToNumber;
    @XmlElement(name = "StreetToNumberExtensionText")
    protected String streetToNumberExtensionText;
    @XmlElement(name = "MinorTownName")
    protected String minorTownName;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptCode")
    protected BigInteger writingScriptCode;

    /**
     * Gets the value of the streetAddressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetAddressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetAddressLine }
     * 
     * 
     */
    public List<StreetAddressLine> getStreetAddressLine() {
        if (streetAddressLine == null) {
            streetAddressLine = new ArrayList<StreetAddressLine>();
        }
        return this.streetAddressLine;
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
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the territoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryName() {
        return territoryName;
    }

    /**
     * Sets the value of the territoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryName(String value) {
        this.territoryName = value;
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
     * Gets the value of the countyOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyOfficialName() {
        return countyOfficialName;
    }

    /**
     * Sets the value of the countyOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyOfficialName(String value) {
        this.countyOfficialName = value;
    }

    /**
     * Gets the value of the territoryOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryOfficialName() {
        return territoryOfficialName;
    }

    /**
     * Sets the value of the territoryOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryOfficialName(String value) {
        this.territoryOfficialName = value;
    }

    /**
     * Gets the value of the countryOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfficialName() {
        return countryOfficialName;
    }

    /**
     * Sets the value of the countryOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfficialName(String value) {
        this.countryOfficialName = value;
    }

    /**
     * Gets the value of the streetNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberText() {
        return streetNumberText;
    }

    /**
     * Sets the value of the streetNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberText(String value) {
        this.streetNumberText = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNumberExtensionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberExtensionText() {
        return streetNumberExtensionText;
    }

    /**
     * Sets the value of the streetNumberExtensionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberExtensionText(String value) {
        this.streetNumberExtensionText = value;
    }

    /**
     * Gets the value of the streetToNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetToNumber() {
        return streetToNumber;
    }

    /**
     * Sets the value of the streetToNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetToNumber(Integer value) {
        this.streetToNumber = value;
    }

    /**
     * Gets the value of the streetToNumberExtensionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetToNumberExtensionText() {
        return streetToNumberExtensionText;
    }

    /**
     * Sets the value of the streetToNumberExtensionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetToNumberExtensionText(String value) {
        this.streetToNumberExtensionText = value;
    }

    /**
     * Gets the value of the minorTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorTownName() {
        return minorTownName;
    }

    /**
     * Sets the value of the minorTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorTownName(String value) {
        this.minorTownName = value;
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
     * Gets the value of the writingScriptCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWritingScriptCode() {
        return writingScriptCode;
    }

    /**
     * Sets the value of the writingScriptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWritingScriptCode(BigInteger value) {
        this.writingScriptCode = value;
    }

}
