
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizedAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardizedAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddressLine" type="{http://services.dnb.com/CompanyServiceV2.0}StreetAddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryTownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyName" minOccurs="0">
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
 *         &lt;element name="TerritoryName" minOccurs="0">
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
 *         &lt;element name="PostalCodeExtensionCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CompanyServiceV2.0}CountryISOAlpha2Type"/>
 *         &lt;element name="CountryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeliveryPointValidationDetail" type="{http://services.dnb.com/CompanyServiceV2.0}DeliveryPointValidationDetail" minOccurs="0"/>
 *         &lt;element name="AddressTypeValue" type="{http://services.dnb.com/CompanyServiceV2.0}StandardizedAddressTypeEnum" minOccurs="0"/>
 *         &lt;element name="InexactAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizedAddress", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "streetAddressLine",
    "primaryTownName",
    "countyName",
    "territoryAbbreviatedName",
    "territoryName",
    "postalCode",
    "postalCodeExtensionCode",
    "countryISOAlpha2Code",
    "countryName",
    "deliveryPointValidationDetail",
    "addressTypeValue",
    "inexactAddressIndicator"
})
public class StandardizedAddress {

    @XmlElement(name = "StreetAddressLine")
    protected List<StreetAddressLine> streetAddressLine;
    @XmlElement(name = "PrimaryTownName")
    protected String primaryTownName;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "TerritoryAbbreviatedName")
    protected String territoryAbbreviatedName;
    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostalCodeExtensionCode")
    protected String postalCodeExtensionCode;
    @XmlElement(name = "CountryISOAlpha2Code", required = true)
    protected String countryISOAlpha2Code;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "DeliveryPointValidationDetail")
    protected DeliveryPointValidationDetail deliveryPointValidationDetail;
    @XmlElement(name = "AddressTypeValue")
    @XmlSchemaType(name = "string")
    protected StandardizedAddressTypeEnum addressTypeValue;
    @XmlElement(name = "InexactAddressIndicator")
    protected Boolean inexactAddressIndicator;

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
     * Gets the value of the postalCodeExtensionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeExtensionCode() {
        return postalCodeExtensionCode;
    }

    /**
     * Sets the value of the postalCodeExtensionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeExtensionCode(String value) {
        this.postalCodeExtensionCode = value;
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
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the deliveryPointValidationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPointValidationDetail }
     *     
     */
    public DeliveryPointValidationDetail getDeliveryPointValidationDetail() {
        return deliveryPointValidationDetail;
    }

    /**
     * Sets the value of the deliveryPointValidationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPointValidationDetail }
     *     
     */
    public void setDeliveryPointValidationDetail(DeliveryPointValidationDetail value) {
        this.deliveryPointValidationDetail = value;
    }

    /**
     * Gets the value of the addressTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link StandardizedAddressTypeEnum }
     *     
     */
    public StandardizedAddressTypeEnum getAddressTypeValue() {
        return addressTypeValue;
    }

    /**
     * Sets the value of the addressTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardizedAddressTypeEnum }
     *     
     */
    public void setAddressTypeValue(StandardizedAddressTypeEnum value) {
        this.addressTypeValue = value;
    }

    /**
     * Gets the value of the inexactAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInexactAddressIndicator() {
        return inexactAddressIndicator;
    }

    /**
     * Sets the value of the inexactAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInexactAddressIndicator(Boolean value) {
        this.inexactAddressIndicator = value;
    }

}
