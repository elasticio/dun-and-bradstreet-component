
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBaseAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBaseAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddressLine" type="{http://services.dnb.com/EntityListServiceV2.0}StreetAddressLine" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="PrimaryTownName" type="{http://services.dnb.com/EntityListServiceV2.0}PrimaryTownNameType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="MetropolitanStatisticalAreaUSCensusCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyGEOREFID" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryName" type="{http://services.dnb.com/EntityListServiceV2.0}TerritoryNameType" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="PostalCode" maxOccurs="100" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalCodeRange" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PostalCodeLowRangeValue" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PostalCodeHighRangeValue" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/EntityListServiceV2.0}CountryISOAlpha2Type" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="CountryGroupGEOREFID" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
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
@XmlType(name = "SearchBaseAddressType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "streetAddressLine",
    "primaryTownName",
    "metropolitanStatisticalAreaUSCensusCode",
    "countyGEOREFID",
    "territoryName",
    "postalCode",
    "postalCodeRange",
    "countryISOAlpha2Code",
    "countryGroupGEOREFID"
})
public class SearchBaseAddressType {

    @XmlElement(name = "StreetAddressLine")
    protected List<StreetAddressLine> streetAddressLine;
    @XmlElement(name = "PrimaryTownName")
    protected List<String> primaryTownName;
    @XmlElement(name = "MetropolitanStatisticalAreaUSCensusCode")
    protected List<String> metropolitanStatisticalAreaUSCensusCode;
    @XmlElement(name = "CountyGEOREFID")
    protected List<String> countyGEOREFID;
    @XmlElement(name = "TerritoryName")
    protected List<String> territoryName;
    @XmlElement(name = "PostalCode")
    protected List<String> postalCode;
    @XmlElement(name = "PostalCodeRange")
    protected List<SearchBaseAddressType.PostalCodeRange> postalCodeRange;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected List<String> countryISOAlpha2Code;
    @XmlElement(name = "CountryGroupGEOREFID")
    protected List<String> countryGroupGEOREFID;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryTownName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryTownName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrimaryTownName() {
        if (primaryTownName == null) {
            primaryTownName = new ArrayList<String>();
        }
        return this.primaryTownName;
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
     * Gets the value of the countyGEOREFID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyGEOREFID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyGEOREFID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountyGEOREFID() {
        if (countyGEOREFID == null) {
            countyGEOREFID = new ArrayList<String>();
        }
        return this.countyGEOREFID;
    }

    /**
     * Gets the value of the territoryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territoryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritoryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerritoryName() {
        if (territoryName == null) {
            territoryName = new ArrayList<String>();
        }
        return this.territoryName;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPostalCode() {
        if (postalCode == null) {
            postalCode = new ArrayList<String>();
        }
        return this.postalCode;
    }

    /**
     * Gets the value of the postalCodeRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalCodeRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalCodeRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchBaseAddressType.PostalCodeRange }
     * 
     * 
     */
    public List<SearchBaseAddressType.PostalCodeRange> getPostalCodeRange() {
        if (postalCodeRange == null) {
            postalCodeRange = new ArrayList<SearchBaseAddressType.PostalCodeRange>();
        }
        return this.postalCodeRange;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryISOAlpha2Code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryISOAlpha2Code().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryISOAlpha2Code() {
        if (countryISOAlpha2Code == null) {
            countryISOAlpha2Code = new ArrayList<String>();
        }
        return this.countryISOAlpha2Code;
    }

    /**
     * Gets the value of the countryGroupGEOREFID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryGroupGEOREFID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryGroupGEOREFID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryGroupGEOREFID() {
        if (countryGroupGEOREFID == null) {
            countryGroupGEOREFID = new ArrayList<String>();
        }
        return this.countryGroupGEOREFID;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PostalCodeLowRangeValue" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PostalCodeHighRangeValue" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
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
    @XmlType(name = "", propOrder = {
        "postalCodeLowRangeValue",
        "postalCodeHighRangeValue"
    })
    public static class PostalCodeRange {

        @XmlElement(name = "PostalCodeLowRangeValue")
        protected String postalCodeLowRangeValue;
        @XmlElement(name = "PostalCodeHighRangeValue")
        protected String postalCodeHighRangeValue;

        /**
         * Gets the value of the postalCodeLowRangeValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCodeLowRangeValue() {
            return postalCodeLowRangeValue;
        }

        /**
         * Sets the value of the postalCodeLowRangeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCodeLowRangeValue(String value) {
            this.postalCodeLowRangeValue = value;
        }

        /**
         * Gets the value of the postalCodeHighRangeValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCodeHighRangeValue() {
            return postalCodeHighRangeValue;
        }

        /**
         * Sets the value of the postalCodeHighRangeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCodeHighRangeValue(String value) {
            this.postalCodeHighRangeValue = value;
        }

    }

}
