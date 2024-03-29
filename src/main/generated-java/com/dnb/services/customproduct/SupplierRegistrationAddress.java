
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierRegistrationAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierRegistrationAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddressLine" type="{http://services.dnb.com/CustomProductServiceV2.0}StreetAddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerritoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierRegistrationAddress", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "streetAddressLine",
    "primaryTownName",
    "territoryName",
    "postalCode",
    "countryISOAlpha2Code"
})
public class SupplierRegistrationAddress {

    @XmlElement(name = "StreetAddressLine")
    protected List<StreetAddressLine> streetAddressLine;
    @XmlElement(name = "PrimaryTownName")
    protected String primaryTownName;
    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;

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
