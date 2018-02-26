
package com.dnb.services.entitylist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}SimpleAddress">
 *       &lt;sequence>
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
 *         &lt;element name="TerritoryOfficialName" minOccurs="0">
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
 *         &lt;element name="CountryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LatitudeMeasurement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LongitudeMeasurement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GeographicalPrecisionText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="UndeliverableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MetropolitanStatisticalAreaUSCensusCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAddressType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "postalCode",
    "postalCodeExtensionCode",
    "territoryOfficialName",
    "territoryAbbreviatedName",
    "countryOfficialName",
    "latitudeMeasurement",
    "longitudeMeasurement",
    "geographicalPrecisionText",
    "undeliverableIndicator",
    "metropolitanStatisticalAreaUSCensusCode"
})
@XmlSeeAlso({
    PrimaryAddressType.class
})
public class BaseAddressType
    extends SimpleAddress
{

    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostalCodeExtensionCode")
    protected String postalCodeExtensionCode;
    @XmlElement(name = "TerritoryOfficialName")
    protected String territoryOfficialName;
    @XmlElement(name = "TerritoryAbbreviatedName")
    protected String territoryAbbreviatedName;
    @XmlElement(name = "CountryOfficialName")
    protected String countryOfficialName;
    @XmlElement(name = "LatitudeMeasurement")
    protected BigDecimal latitudeMeasurement;
    @XmlElement(name = "LongitudeMeasurement")
    protected BigDecimal longitudeMeasurement;
    @XmlElement(name = "GeographicalPrecisionText")
    protected DNBDecodedStringType geographicalPrecisionText;
    @XmlElement(name = "UndeliverableIndicator")
    protected Boolean undeliverableIndicator;
    @XmlElement(name = "MetropolitanStatisticalAreaUSCensusCode")
    protected List<String> metropolitanStatisticalAreaUSCensusCode;

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
     * Gets the value of the latitudeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitudeMeasurement() {
        return latitudeMeasurement;
    }

    /**
     * Sets the value of the latitudeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitudeMeasurement(BigDecimal value) {
        this.latitudeMeasurement = value;
    }

    /**
     * Gets the value of the longitudeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitudeMeasurement() {
        return longitudeMeasurement;
    }

    /**
     * Sets the value of the longitudeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitudeMeasurement(BigDecimal value) {
        this.longitudeMeasurement = value;
    }

    /**
     * Gets the value of the geographicalPrecisionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getGeographicalPrecisionText() {
        return geographicalPrecisionText;
    }

    /**
     * Sets the value of the geographicalPrecisionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setGeographicalPrecisionText(DNBDecodedStringType value) {
        this.geographicalPrecisionText = value;
    }

    /**
     * Gets the value of the undeliverableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUndeliverableIndicator() {
        return undeliverableIndicator;
    }

    /**
     * Sets the value of the undeliverableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndeliverableIndicator(Boolean value) {
        this.undeliverableIndicator = value;
    }

    /**
     * Gets the value of the metropolitanStatisticalAreaUSCensusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metropolitanStatisticalAreaUSCensusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetropolitanStatisticalAreaUSCensusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetropolitanStatisticalAreaUSCensusCode() {
        if (metropolitanStatisticalAreaUSCensusCode == null) {
            metropolitanStatisticalAreaUSCensusCode = new ArrayList<String>();
        }
        return this.metropolitanStatisticalAreaUSCensusCode;
    }

}
