
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}BaseAddressType">
 *       &lt;sequence>
 *         &lt;element name="PostalRouteTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PostalRouteBoxNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalRouteNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostOfficeBoxTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PostOfficeBoxNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
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
@XmlType(name = "MailAddressType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "postalRouteTypeText",
    "postalRouteBoxNumber",
    "postalRouteNumber",
    "postOfficeBoxTypeText",
    "postOfficeBoxNumber",
    "countryWorldBaseCode"
})
@XmlSeeAlso({
    RegisteredAddressType.class
})
public class MailAddressType
    extends BaseAddressType
{

    @XmlElement(name = "PostalRouteTypeText")
    protected DNBDecodedStringType postalRouteTypeText;
    @XmlElement(name = "PostalRouteBoxNumber")
    protected String postalRouteBoxNumber;
    @XmlElement(name = "PostalRouteNumber")
    protected String postalRouteNumber;
    @XmlElement(name = "PostOfficeBoxTypeText")
    protected DNBDecodedStringType postOfficeBoxTypeText;
    @XmlElement(name = "PostOfficeBoxNumber")
    protected String postOfficeBoxNumber;
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
     * Gets the value of the postalRouteBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalRouteBoxNumber() {
        return postalRouteBoxNumber;
    }

    /**
     * Sets the value of the postalRouteBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalRouteBoxNumber(String value) {
        this.postalRouteBoxNumber = value;
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
     * Gets the value of the postOfficeBoxTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPostOfficeBoxTypeText() {
        return postOfficeBoxTypeText;
    }

    /**
     * Sets the value of the postOfficeBoxTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPostOfficeBoxTypeText(DNBDecodedStringType value) {
        this.postOfficeBoxTypeText = value;
    }

    /**
     * Gets the value of the postOfficeBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    /**
     * Sets the value of the postOfficeBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBoxNumber(String value) {
        this.postOfficeBoxNumber = value;
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
