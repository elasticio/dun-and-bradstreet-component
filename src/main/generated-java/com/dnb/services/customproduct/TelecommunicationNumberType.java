
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecommunicationNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationNumberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberSimpleType">
 *       &lt;sequence>
 *         &lt;element name="DomesticDialingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MobileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnreachableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationNumberType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "domesticDialingCode",
    "mobileIndicator",
    "unreachableIndicator"
})
public class TelecommunicationNumberType
    extends TelecommunicationNumberSimpleType
{

    @XmlElement(name = "DomesticDialingCode")
    protected String domesticDialingCode;
    @XmlElement(name = "MobileIndicator")
    protected Boolean mobileIndicator;
    @XmlElement(name = "UnreachableIndicator")
    protected Boolean unreachableIndicator;

    /**
     * Gets the value of the domesticDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticDialingCode() {
        return domesticDialingCode;
    }

    /**
     * Sets the value of the domesticDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticDialingCode(String value) {
        this.domesticDialingCode = value;
    }

    /**
     * Gets the value of the mobileIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileIndicator() {
        return mobileIndicator;
    }

    /**
     * Sets the value of the mobileIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileIndicator(Boolean value) {
        this.mobileIndicator = value;
    }

    /**
     * Gets the value of the unreachableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnreachableIndicator() {
        return unreachableIndicator;
    }

    /**
     * Sets the value of the unreachableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnreachableIndicator(Boolean value) {
        this.unreachableIndicator = value;
    }

}
