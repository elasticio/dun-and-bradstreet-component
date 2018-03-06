
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}BaseAddressType">
 *       &lt;sequence>
 *         &lt;element name="PostalRouteTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PostalRouteNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryWorldBaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "MailAddressType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "postalRouteTypeText",
    "postalRouteNumber",
    "countryWorldBaseCode"
})
public class MailAddressType
    extends BaseAddressType
{

    @XmlElement(name = "PostalRouteTypeText")
    protected DNBDecodedStringType postalRouteTypeText;
    @XmlElement(name = "PostalRouteNumber")
    protected String postalRouteNumber;
    @XmlElement(name = "CountryWorldBaseCode")
    protected Integer countryWorldBaseCode;

    /**
     * Gets the value of the postalRouteTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPostalRouteTypeText() {
        return postalRouteTypeText;
    }

    /**
     * Sets the value of the postalRouteTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPostalRouteTypeText(DNBDecodedStringType value) {
        this.postalRouteTypeText = value;
    }

    /**
     * Gets the value of the postalRouteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalRouteNumber() {
        return postalRouteNumber;
    }

    /**
     * Sets the value of the postalRouteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalRouteNumber(String value) {
        this.postalRouteNumber = value;
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

}
