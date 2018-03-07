
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * The address details of the filing office provided by the Customer/User where the public filing was filed.
 *          
 * 
 * <p>Java class for SearchByFilingNameFilingLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameFilingLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerritoryName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNameFilingLocation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "territoryName",
    "countryISOAlpha2Code"
})
public class SearchByFilingNameFilingLocation {

    @XmlElement(name = "TerritoryName")
    protected List<String> territoryName;
    @XmlElement(name = "CountryISOAlpha2Code", required = true)
    protected String countryISOAlpha2Code;

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
