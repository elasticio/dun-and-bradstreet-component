
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationNavigatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationNavigatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationType" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorTypeEnum"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationNavigator" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationNavigatorType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "locationType",
    "locationCode",
    "locationName",
    "candidateMatchedQuantity",
    "locationNavigator"
})
public class LocationNavigatorType {

    @XmlElement(name = "LocationType", required = true)
    @XmlSchemaType(name = "string")
    protected LocationNavigatorTypeEnum locationType;
    @XmlElement(name = "LocationCode")
    protected String locationCode;
    @XmlElement(name = "LocationName", required = true)
    protected String locationName;
    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "LocationNavigator")
    protected List<LocationNavigatorType> locationNavigator;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationNavigatorTypeEnum }
     *     
     */
    public LocationNavigatorTypeEnum getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationNavigatorTypeEnum }
     *     
     */
    public void setLocationType(LocationNavigatorTypeEnum value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the candidateMatchedQuantity property.
     * 
     */
    public int getCandidateMatchedQuantity() {
        return candidateMatchedQuantity;
    }

    /**
     * Sets the value of the candidateMatchedQuantity property.
     * 
     */
    public void setCandidateMatchedQuantity(int value) {
        this.candidateMatchedQuantity = value;
    }

    /**
     * Gets the value of the locationNavigator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationNavigator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNavigator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationNavigatorType }
     * 
     * 
     */
    public List<LocationNavigatorType> getLocationNavigator() {
        if (locationNavigator == null) {
            locationNavigator = new ArrayList<LocationNavigatorType>();
        }
        return this.locationNavigator;
    }

}
