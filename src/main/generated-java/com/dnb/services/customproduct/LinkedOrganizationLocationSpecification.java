
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the user filtering requirement to return the linkage organizations of a subject based on location parameters. This aggregate should be present only when atleast one of the location parameters is present.
 *          
 * 
 * <p>Java class for LinkedOrganizationLocationSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedOrganizationLocationSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerritoryName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryTownName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
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
@XmlType(name = "LinkedOrganizationLocationSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "countryISOAlpha2Code",
    "territoryName",
    "primaryTownName"
})
public class LinkedOrganizationLocationSpecification {

    @XmlElement(name = "CountryISOAlpha2Code")
    protected List<String> countryISOAlpha2Code;
    @XmlElement(name = "TerritoryName")
    protected List<String> territoryName;
    @XmlElement(name = "PrimaryTownName")
    protected List<String> primaryTownName;

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

}
