
package com.dnb.services.customproduct;

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
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}SimpleAddress">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="BuildingName" minOccurs="0">
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
 *         &lt;element name="MinorTownName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RouteDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LocationDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
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
 *         &lt;element name="PremisesDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressUsageTenureDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddressUsageTenureDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RentAmountDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddressUsageFinancialItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesUsageDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesUsageDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectAddressUsageText" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="CountyOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyAbbreviatedName" minOccurs="0">
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
 *         &lt;element name="PostalCodeExtensionCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
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
 *         &lt;element name="GeographicalPrecisionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
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
 *         &lt;element name="PremisesAreaDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesAreaDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerritoryWorldBaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecondaryGeographicAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetropolitanStatisticalAreaUSCensusCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormattedFullPostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISONumeric3Code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryISOAlpha3Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="WritingScriptCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAddressType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "startDate",
    "buildingName",
    "streetNumberText",
    "streetName",
    "minorTownName",
    "countyName",
    "routeDescriptionText",
    "locationDescriptionText",
    "territoryName",
    "territoryAbbreviatedName",
    "postalCode",
    "premisesDetail",
    "addressUsageTenureDetail",
    "rentAmountDetail",
    "premisesUsageDetail",
    "subjectAddressUsageText",
    "streetNumberExtensionText",
    "streetToNumber",
    "streetToNumberExtensionText",
    "countyOfficialName",
    "countyAbbreviatedName",
    "territoryOfficialName",
    "postalCodeExtensionCode",
    "countryOfficialName",
    "countryGroupName",
    "latitudeMeasurement",
    "longitudeMeasurement",
    "geographicalPrecisionText",
    "undeliverableIndicator",
    "primaryTownWorldBaseCode",
    "countyWorldBaseCode",
    "premisesAreaDetail",
    "territoryWorldBaseCode",
    "secondaryGeographicAreaName",
    "metropolitanStatisticalAreaUSCensusCode",
    "formattedFullPostalCode",
    "countryISONumeric3Code",
    "countryISOAlpha3Code"
})
@XmlSeeAlso({
    PrimaryAddressType.class,
    MailAddressType.class
})
public class BaseAddressType
    extends SimpleAddress
{

    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "BuildingName")
    protected String buildingName;
    @XmlElement(name = "StreetNumberText")
    protected String streetNumberText;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "MinorTownName")
    protected String minorTownName;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "RouteDescriptionText")
    protected DNBDecodedStringType routeDescriptionText;
    @XmlElement(name = "LocationDescriptionText")
    protected DNBDecodedStringType locationDescriptionText;
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
    @XmlElement(name = "RentAmountDetail")
    protected List<SubjectAddressUsageFinancialItemType> rentAmountDetail;
    @XmlElement(name = "PremisesUsageDetail")
    protected List<PremisesUsageDetail> premisesUsageDetail;
    @XmlElement(name = "SubjectAddressUsageText")
    protected List<TextEntryType> subjectAddressUsageText;
    @XmlElement(name = "StreetNumberExtensionText")
    protected String streetNumberExtensionText;
    @XmlElement(name = "StreetToNumber")
    protected Integer streetToNumber;
    @XmlElement(name = "StreetToNumberExtensionText")
    protected String streetToNumberExtensionText;
    @XmlElement(name = "CountyOfficialName")
    protected String countyOfficialName;
    @XmlElement(name = "CountyAbbreviatedName")
    protected String countyAbbreviatedName;
    @XmlElement(name = "TerritoryOfficialName")
    protected String territoryOfficialName;
    @XmlElement(name = "PostalCodeExtensionCode")
    protected String postalCodeExtensionCode;
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
    @XmlElement(name = "PremisesAreaDetail")
    protected List<PremisesAreaDetail> premisesAreaDetail;
    @XmlElement(name = "TerritoryWorldBaseCode")
    protected Integer territoryWorldBaseCode;
    @XmlElement(name = "SecondaryGeographicAreaName")
    protected String secondaryGeographicAreaName;
    @XmlElement(name = "MetropolitanStatisticalAreaUSCensusCode")
    protected List<String> metropolitanStatisticalAreaUSCensusCode;
    @XmlElement(name = "FormattedFullPostalCode")
    protected String formattedFullPostalCode;
    @XmlElement(name = "CountryISONumeric3Code")
    protected Integer countryISONumeric3Code;
    @XmlElement(name = "CountryISOAlpha3Code")
    protected String countryISOAlpha3Code;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptCode")
    protected BigInteger writingScriptCode;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
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
     * Gets the value of the routeDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRouteDescriptionText() {
        return routeDescriptionText;
    }

    /**
     * Sets the value of the routeDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRouteDescriptionText(DNBDecodedStringType value) {
        this.routeDescriptionText = value;
    }

    /**
     * Gets the value of the locationDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLocationDescriptionText() {
        return locationDescriptionText;
    }

    /**
     * Sets the value of the locationDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLocationDescriptionText(DNBDecodedStringType value) {
        this.locationDescriptionText = value;
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
     * Gets the value of the rentAmountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentAmountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentAmountDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectAddressUsageFinancialItemType }
     * 
     * 
     */
    public List<SubjectAddressUsageFinancialItemType> getRentAmountDetail() {
        if (rentAmountDetail == null) {
            rentAmountDetail = new ArrayList<SubjectAddressUsageFinancialItemType>();
        }
        return this.rentAmountDetail;
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
     * Gets the value of the subjectAddressUsageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectAddressUsageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectAddressUsageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getSubjectAddressUsageText() {
        if (subjectAddressUsageText == null) {
            subjectAddressUsageText = new ArrayList<TextEntryType>();
        }
        return this.subjectAddressUsageText;
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
     * Gets the value of the countyAbbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyAbbreviatedName() {
        return countyAbbreviatedName;
    }

    /**
     * Sets the value of the countyAbbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyAbbreviatedName(String value) {
        this.countyAbbreviatedName = value;
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
     * Gets the value of the premisesAreaDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesAreaDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesAreaDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesAreaDetail }
     * 
     * 
     */
    public List<PremisesAreaDetail> getPremisesAreaDetail() {
        if (premisesAreaDetail == null) {
            premisesAreaDetail = new ArrayList<PremisesAreaDetail>();
        }
        return this.premisesAreaDetail;
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
     * Gets the value of the secondaryGeographicAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGeographicAreaName() {
        return secondaryGeographicAreaName;
    }

    /**
     * Sets the value of the secondaryGeographicAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGeographicAreaName(String value) {
        this.secondaryGeographicAreaName = value;
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
     * Gets the value of the formattedFullPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedFullPostalCode() {
        return formattedFullPostalCode;
    }

    /**
     * Sets the value of the formattedFullPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedFullPostalCode(String value) {
        this.formattedFullPostalCode = value;
    }

    /**
     * Gets the value of the countryISONumeric3Code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryISONumeric3Code() {
        return countryISONumeric3Code;
    }

    /**
     * Sets the value of the countryISONumeric3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryISONumeric3Code(Integer value) {
        this.countryISONumeric3Code = value;
    }

    /**
     * Gets the value of the countryISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha3Code() {
        return countryISOAlpha3Code;
    }

    /**
     * Sets the value of the countryISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha3Code(String value) {
        this.countryISOAlpha3Code = value;
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
