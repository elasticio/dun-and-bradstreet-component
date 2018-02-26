
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectMailDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectMailDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameInformationSourceName" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="EmailInformationSourceName" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TelephoneInformationSourceName" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TitleInformationSourceName" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectMailDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "nameInformationSourceName",
    "emailInformationSourceName",
    "telephoneInformationSourceName",
    "titleInformationSourceName"
})
public class ConnectMailDetail {

    @XmlElement(name = "NameInformationSourceName")
    protected DNBDecodedStringType nameInformationSourceName;
    @XmlElement(name = "EmailInformationSourceName")
    protected DNBDecodedStringType emailInformationSourceName;
    @XmlElement(name = "TelephoneInformationSourceName")
    protected DNBDecodedStringType telephoneInformationSourceName;
    @XmlElement(name = "TitleInformationSourceName")
    protected DNBDecodedStringType titleInformationSourceName;

    /**
     * Gets the value of the nameInformationSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNameInformationSourceName() {
        return nameInformationSourceName;
    }

    /**
     * Sets the value of the nameInformationSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNameInformationSourceName(DNBDecodedStringType value) {
        this.nameInformationSourceName = value;
    }

    /**
     * Gets the value of the emailInformationSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEmailInformationSourceName() {
        return emailInformationSourceName;
    }

    /**
     * Sets the value of the emailInformationSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEmailInformationSourceName(DNBDecodedStringType value) {
        this.emailInformationSourceName = value;
    }

    /**
     * Gets the value of the telephoneInformationSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTelephoneInformationSourceName() {
        return telephoneInformationSourceName;
    }

    /**
     * Sets the value of the telephoneInformationSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTelephoneInformationSourceName(DNBDecodedStringType value) {
        this.telephoneInformationSourceName = value;
    }

    /**
     * Gets the value of the titleInformationSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTitleInformationSourceName() {
        return titleInformationSourceName;
    }

    /**
     * Sets the value of the titleInformationSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTitleInformationSourceName(DNBDecodedStringType value) {
        this.titleInformationSourceName = value;
    }

}
