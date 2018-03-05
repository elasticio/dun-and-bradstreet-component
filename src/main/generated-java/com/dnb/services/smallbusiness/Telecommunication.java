
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Telecommunication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telecommunication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/SBRIProductServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="FacsimileNumber" type="{http://services.dnb.com/SBRIProductServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="WebPageAddress" type="{http://services.dnb.com/SBRIProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telecommunication", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "telephoneNumber",
    "facsimileNumber",
    "webPageAddress"
})
public class Telecommunication {

    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberType telephoneNumber;
    @XmlElement(name = "FacsimileNumber")
    protected TelecommunicationNumberType facsimileNumber;
    @XmlElement(name = "WebPageAddress")
    protected WebPageAddressType webPageAddress;

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public TelecommunicationNumberType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberType value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the facsimileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public TelecommunicationNumberType getFacsimileNumber() {
        return facsimileNumber;
    }

    /**
     * Sets the value of the facsimileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public void setFacsimileNumber(TelecommunicationNumberType value) {
        this.facsimileNumber = value;
    }

    /**
     * Gets the value of the webPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getWebPageAddress() {
        return webPageAddress;
    }

    /**
     * Sets the value of the webPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setWebPageAddress(WebPageAddressType value) {
        this.webPageAddress = value;
    }

}
