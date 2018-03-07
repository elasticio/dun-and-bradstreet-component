
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RolePlayerDetailsBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePlayerDetailsBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="RolePlayerName" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePlayerName" minOccurs="0"/>
 *         &lt;element name="RolePlayerAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddressType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="RolePlayerFunctionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePlayerDetailsBaseType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsNumber",
    "rolePlayerName",
    "rolePlayerAddress",
    "telephoneNumber",
    "rolePlayerFunctionText",
    "operatingStatusText"
})
@XmlSeeAlso({
    RolePlayerDetailsType.class
})
public class RolePlayerDetailsBaseType {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "RolePlayerName")
    protected RolePlayerName rolePlayerName;
    @XmlElement(name = "RolePlayerAddress")
    protected SubjectAddressType rolePlayerAddress;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberType telephoneNumber;
    @XmlElement(name = "RolePlayerFunctionText")
    protected DNBDecodedStringType rolePlayerFunctionText;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the rolePlayerName property.
     * 
     * @return
     *     possible object is
     *     {@link RolePlayerName }
     *     
     */
    public RolePlayerName getRolePlayerName() {
        return rolePlayerName;
    }

    /**
     * Sets the value of the rolePlayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolePlayerName }
     *     
     */
    public void setRolePlayerName(RolePlayerName value) {
        this.rolePlayerName = value;
    }

    /**
     * Gets the value of the rolePlayerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressType }
     *     
     */
    public SubjectAddressType getRolePlayerAddress() {
        return rolePlayerAddress;
    }

    /**
     * Sets the value of the rolePlayerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressType }
     *     
     */
    public void setRolePlayerAddress(SubjectAddressType value) {
        this.rolePlayerAddress = value;
    }

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
     * Gets the value of the rolePlayerFunctionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerFunctionText() {
        return rolePlayerFunctionText;
    }

    /**
     * Sets the value of the rolePlayerFunctionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerFunctionText(DNBDecodedStringType value) {
        this.rolePlayerFunctionText = value;
    }

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
    }

}
