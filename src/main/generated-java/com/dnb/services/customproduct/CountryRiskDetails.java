
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryRiskDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryRiskDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="CountryISONumeric3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISONumeric3Type" minOccurs="0"/>
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
 *         &lt;element name="CountrySanctionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CountrySanctionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorldWatchHeadlineDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}WorldWatchHeadlineDetails" minOccurs="0"/>
 *         &lt;element name="DNBRatingDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBRatingDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryRiskDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "countryISOAlpha2Code",
    "countryISONumeric3Code",
    "countryOfficialName",
    "countryGroupName",
    "countrySanctionDetail",
    "worldWatchHeadlineDetails",
    "dnbRatingDetails"
})
public class CountryRiskDetails {

    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "CountryISONumeric3Code")
    protected String countryISONumeric3Code;
    @XmlElement(name = "CountryOfficialName")
    protected String countryOfficialName;
    @XmlElement(name = "CountryGroupName")
    protected String countryGroupName;
    @XmlElement(name = "CountrySanctionDetail")
    protected List<CountrySanctionDetail> countrySanctionDetail;
    @XmlElement(name = "WorldWatchHeadlineDetails")
    protected WorldWatchHeadlineDetails worldWatchHeadlineDetails;
    @XmlElement(name = "DNBRatingDetails")
    protected DNBRatingDetails dnbRatingDetails;

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

    /**
     * Gets the value of the countryISONumeric3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISONumeric3Code() {
        return countryISONumeric3Code;
    }

    /**
     * Sets the value of the countryISONumeric3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISONumeric3Code(String value) {
        this.countryISONumeric3Code = value;
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
     * Gets the value of the countrySanctionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySanctionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySanctionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySanctionDetail }
     * 
     * 
     */
    public List<CountrySanctionDetail> getCountrySanctionDetail() {
        if (countrySanctionDetail == null) {
            countrySanctionDetail = new ArrayList<CountrySanctionDetail>();
        }
        return this.countrySanctionDetail;
    }

    /**
     * Gets the value of the worldWatchHeadlineDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WorldWatchHeadlineDetails }
     *     
     */
    public WorldWatchHeadlineDetails getWorldWatchHeadlineDetails() {
        return worldWatchHeadlineDetails;
    }

    /**
     * Sets the value of the worldWatchHeadlineDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldWatchHeadlineDetails }
     *     
     */
    public void setWorldWatchHeadlineDetails(WorldWatchHeadlineDetails value) {
        this.worldWatchHeadlineDetails = value;
    }

    /**
     * Gets the value of the dnbRatingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DNBRatingDetails }
     *     
     */
    public DNBRatingDetails getDNBRatingDetails() {
        return dnbRatingDetails;
    }

    /**
     * Sets the value of the dnbRatingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBRatingDetails }
     *     
     */
    public void setDNBRatingDetails(DNBRatingDetails value) {
        this.dnbRatingDetails = value;
    }

}
