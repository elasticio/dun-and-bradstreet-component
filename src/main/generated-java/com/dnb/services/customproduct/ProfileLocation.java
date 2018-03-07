
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerritoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISOCountrySubDivisionCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImageURL" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileLocation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "territoryName",
    "isoCountrySubDivisionCode",
    "imageURL"
})
public class ProfileLocation {

    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElement(name = "ISOCountrySubDivisionCode")
    protected String isoCountrySubDivisionCode;
    @XmlElement(name = "ImageURL")
    protected String imageURL;

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
     * Gets the value of the isoCountrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountrySubDivisionCode() {
        return isoCountrySubDivisionCode;
    }

    /**
     * Sets the value of the isoCountrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountrySubDivisionCode(String value) {
        this.isoCountrySubDivisionCode = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

}
