
package com.dnb.services.firmorgaphics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}SimpleAddress">
 *       &lt;sequence>
 *         &lt;element name="MinorTownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
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
 *         &lt;element name="PremisesDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PremisesDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressUsageTenureDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SubjectAddressUsageTenureDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesUsageDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PremisesUsageDetail" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="CountryGroupName" minOccurs="0">
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
 *         &lt;element name="GeographicalPrecisionText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="UndeliverableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryTownWorldBaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyWorldBaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryWorldBaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MetropolitanStatisticalAreaUSCensusCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="WritingScriptCode" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAddressType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "minorTownName",
    "territoryName",
    "territoryAbbreviatedName",
    "postalCode",
    "premisesDetail",
    "addressUsageTenureDetail",
    "premisesUsageDetail",
    "countyOfficialName",
    "territoryOfficialName",
    "countryOfficialName",
    "countryGroupName",
    "latitudeMeasurement",
    "longitudeMeasurement",
    "geographicalPrecisionText",
    "undeliverableIndicator",
    "primaryTownWorldBaseCode",
    "countyWorldBaseCode",
    "territoryWorldBaseCode",
    "metropolitanStatisticalAreaUSCensusCode"
})
@XmlSeeAlso({
    PrimaryAddressType.class,
    MailAddressType.class
})
public class BaseAddressType
    extends SimpleAddress
{

    @XmlElement(name = "MinorTownName")
    protected String minorTownName;
    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElement(name = "TerritoryAbbreviatedName")
    protected String territoryAbbreviatedName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PremisesDetail")
    protected List<PremisesDetail> premisesDetail;
    @XmlElement(name = "AddressUsageTenureDetail")
    protected List<SubjectAddressUsageTenureDetail> addressUsageTenureDetail;
    @XmlElement(name = "PremisesUsageDetail")
    protected List<PremisesUsageDetail> premisesUsageDetail;
    @XmlElement(name = "CountyOfficialName")
    protected String countyOfficialName;
    @XmlElement(name = "TerritoryOfficialName")
    protected String territoryOfficialName;
    @XmlElement(name = "CountryOfficialName")
    protected String countryOfficialName;
    @XmlElement(name = "CountryGroupName")
    protected String countryGroupName;
    @XmlElement(name = "LatitudeMeasurement")
    protected BigDecimal latitudeMeasurement;
    @XmlElement(name = "LongitudeMeasurement")
    protected BigDecimal longitudeMeasurement;
    @XmlElement(name = "GeographicalPrecisionText")
    protected DNBDecodedStringType geographicalPrecisionText;
    @XmlElement(name = "UndeliverableIndicator")
    protected Boolean undeliverableIndicator;
    @XmlElement(name = "PrimaryTownWorldBaseCode")
    protected Integer primaryTownWorldBaseCode;
    @XmlElement(name = "CountyWorldBaseCode")
    protected Integer countyWorldBaseCode;
    @XmlElement(name = "TerritoryWorldBaseCode")
    protected Integer territoryWorldBaseCode;
    @XmlElement(name = "MetropolitanStatisticalAreaUSCensusCode")
    protected List<String> metropolitanStatisticalAreaUSCensusCode;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptCode")
    protected BigInteger writingScriptCode;

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
     * Gets the value of the premisesDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesDetail }
     * 
     * 
     */
    public List<PremisesDetail> getPremisesDetail() {
        if (premisesDetail == null) {
            premisesDetail = new ArrayList<PremisesDetail>();
        }
        return this.premisesDetail;
    }

    /**
     * Gets the value of the addressUsageTenureDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressUsageTenureDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressUsageTenureDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectAddressUsageTenureDetail }
     * 
     * 
     */
    public List<SubjectAddressUsageTenureDetail> getAddressUsageTenureDetail() {
        if (addressUsageTenureDetail == null) {
            addressUsageTenureDetail = new ArrayList<SubjectAddressUsageTenureDetail>();
        }
        return this.addressUsageTenureDetail;
    }

    /**
     * Gets the value of the premisesUsageDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesUsageDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesUsageDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesUsageDetail }
     * 
     * 
     */
    public List<PremisesUsageDetail> getPremisesUsageDetail() {
        if (premisesUsageDetail == null) {
            premisesUsageDetail = new ArrayList<PremisesUsageDetail>();
        }
        return this.premisesUsageDetail;
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
     * Gets the value of the countryGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryGroupName() {
        return countryGroupName;
    }

    /**
     * Sets the value of the countryGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryGroupName(String value) {
        this.countryGroupName = value;
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
     * Gets the value of the primaryTownWorldBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryTownWorldBaseCode() {
        return primaryTownWorldBaseCode;
    }

    /**
     * Sets the value of the primaryTownWorldBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryTownWorldBaseCode(Integer value) {
        this.primaryTownWorldBaseCode = value;
    }

    /**
     * Gets the value of the countyWorldBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountyWorldBaseCode() {
        return countyWorldBaseCode;
    }

    /**
     * Sets the value of the countyWorldBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountyWorldBaseCode(Integer value) {
        this.countyWorldBaseCode = value;
    }

    /**
     * Gets the value of the territoryWorldBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerritoryWorldBaseCode() {
        return territoryWorldBaseCode;
    }

    /**
     * Sets the value of the territoryWorldBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerritoryWorldBaseCode(Integer value) {
        this.territoryWorldBaseCode = value;
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
