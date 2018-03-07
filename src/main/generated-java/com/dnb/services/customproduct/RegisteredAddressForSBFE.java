
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredAddressForSBFE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredAddressForSBFE">
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
 *         &lt;element name="TerritoryAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredAddressForSBFE", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "streetAddressLine",
    "primaryTownName",
    "territoryAbbreviatedName",
    "postalCode"
})
public class RegisteredAddressForSBFE {

    @XmlElement(name = "StreetAddressLine")
    protected List<StreetAddressLine> streetAddressLine;
    @XmlElement(name = "PrimaryTownName")
    protected String primaryTownName;
    @XmlElement(name = "TerritoryAbbreviatedName")
    protected String territoryAbbreviatedName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;

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

}
