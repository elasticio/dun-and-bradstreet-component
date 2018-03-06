
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataProviderDetailForAirportConcession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProviderDetailForAirportConcession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiversityDNBDataProviderName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataProviderTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}LocationDetailForAirportConcession" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProviderDetailForAirportConcession", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "diversityDNBDataProviderName",
    "dataProviderTypeText",
    "location"
})
public class DataProviderDetailForAirportConcession {

    @XmlElement(name = "DiversityDNBDataProviderName")
    protected String diversityDNBDataProviderName;
    @XmlElement(name = "DataProviderTypeText")
    protected DNBDecodedStringType dataProviderTypeText;
    @XmlElement(name = "Location")
    protected LocationDetailForAirportConcession location;

    /**
     * Gets the value of the diversityDNBDataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiversityDNBDataProviderName() {
        return diversityDNBDataProviderName;
    }

    /**
     * Sets the value of the diversityDNBDataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiversityDNBDataProviderName(String value) {
        this.diversityDNBDataProviderName = value;
    }

    /**
     * Gets the value of the dataProviderTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderTypeText() {
        return dataProviderTypeText;
    }

    /**
     * Sets the value of the dataProviderTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderTypeText(DNBDecodedStringType value) {
        this.dataProviderTypeText = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailForAirportConcession }
     *     
     */
    public LocationDetailForAirportConcession getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailForAirportConcession }
     *     
     */
    public void setLocation(LocationDetailForAirportConcession value) {
        this.location = value;
    }

}
