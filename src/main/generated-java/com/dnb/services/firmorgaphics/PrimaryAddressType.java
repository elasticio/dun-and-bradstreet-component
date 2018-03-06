
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimaryAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}BaseAddressType">
 *       &lt;sequence>
 *         &lt;element name="RegisteredAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PoliticalDistrict" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PoliticalDistrict" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResidentialAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CountryWorldBaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EconomicAreaOfInfluenceCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyFIPSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryFIPSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryFIPSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MetropolitanStatisticalAreaFIPSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyPopulationRankNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryAddressType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "registeredAddressIndicator",
    "politicalDistrict",
    "residentialAddressIndicator",
    "countryWorldBaseCode",
    "economicAreaOfInfluenceCode",
    "countyFIPSCode",
    "territoryFIPSCode",
    "countryFIPSCode",
    "metropolitanStatisticalAreaFIPSCode",
    "countyPopulationRankNumber"
})
public class PrimaryAddressType
    extends BaseAddressType
{

    @XmlElement(name = "RegisteredAddressIndicator")
    protected Boolean registeredAddressIndicator;
    @XmlElement(name = "PoliticalDistrict")
    protected List<PoliticalDistrict> politicalDistrict;
    @XmlElement(name = "ResidentialAddressIndicator")
    protected Boolean residentialAddressIndicator;
    @XmlElement(name = "CountryWorldBaseCode")
    protected Integer countryWorldBaseCode;
    @XmlElement(name = "EconomicAreaOfInfluenceCode")
    protected Integer economicAreaOfInfluenceCode;
    @XmlElement(name = "CountyFIPSCode")
    protected Integer countyFIPSCode;
    @XmlElement(name = "TerritoryFIPSCode")
    protected Integer territoryFIPSCode;
    @XmlElement(name = "CountryFIPSCode")
    protected String countryFIPSCode;
    @XmlElement(name = "MetropolitanStatisticalAreaFIPSCode")
    protected String metropolitanStatisticalAreaFIPSCode;
    @XmlElement(name = "CountyPopulationRankNumber")
    protected Integer countyPopulationRankNumber;

    /**
     * Gets the value of the registeredAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegisteredAddressIndicator() {
        return registeredAddressIndicator;
    }

    /**
     * Sets the value of the registeredAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegisteredAddressIndicator(Boolean value) {
        this.registeredAddressIndicator = value;
    }

    /**
     * Gets the value of the politicalDistrict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the politicalDistrict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoliticalDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliticalDistrict }
     * 
     * 
     */
    public List<PoliticalDistrict> getPoliticalDistrict() {
        if (politicalDistrict == null) {
            politicalDistrict = new ArrayList<PoliticalDistrict>();
        }
        return this.politicalDistrict;
    }

    /**
     * Gets the value of the residentialAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidentialAddressIndicator() {
        return residentialAddressIndicator;
    }

    /**
     * Sets the value of the residentialAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidentialAddressIndicator(Boolean value) {
        this.residentialAddressIndicator = value;
    }

    /**
     * Gets the value of the countryWorldBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryWorldBaseCode() {
        return countryWorldBaseCode;
    }

    /**
     * Sets the value of the countryWorldBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryWorldBaseCode(Integer value) {
        this.countryWorldBaseCode = value;
    }

    /**
     * Gets the value of the economicAreaOfInfluenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEconomicAreaOfInfluenceCode() {
        return economicAreaOfInfluenceCode;
    }

    /**
     * Sets the value of the economicAreaOfInfluenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEconomicAreaOfInfluenceCode(Integer value) {
        this.economicAreaOfInfluenceCode = value;
    }

    /**
     * Gets the value of the countyFIPSCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountyFIPSCode() {
        return countyFIPSCode;
    }

    /**
     * Sets the value of the countyFIPSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountyFIPSCode(Integer value) {
        this.countyFIPSCode = value;
    }

    /**
     * Gets the value of the territoryFIPSCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerritoryFIPSCode() {
        return territoryFIPSCode;
    }

    /**
     * Sets the value of the territoryFIPSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerritoryFIPSCode(Integer value) {
        this.territoryFIPSCode = value;
    }

    /**
     * Gets the value of the countryFIPSCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryFIPSCode() {
        return countryFIPSCode;
    }

    /**
     * Sets the value of the countryFIPSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryFIPSCode(String value) {
        this.countryFIPSCode = value;
    }

    /**
     * Gets the value of the metropolitanStatisticalAreaFIPSCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetropolitanStatisticalAreaFIPSCode() {
        return metropolitanStatisticalAreaFIPSCode;
    }

    /**
     * Sets the value of the metropolitanStatisticalAreaFIPSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetropolitanStatisticalAreaFIPSCode(String value) {
        this.metropolitanStatisticalAreaFIPSCode = value;
    }

    /**
     * Gets the value of the countyPopulationRankNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountyPopulationRankNumber() {
        return countyPopulationRankNumber;
    }

    /**
     * Sets the value of the countyPopulationRankNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountyPopulationRankNumber(Integer value) {
        this.countyPopulationRankNumber = value;
    }

}
