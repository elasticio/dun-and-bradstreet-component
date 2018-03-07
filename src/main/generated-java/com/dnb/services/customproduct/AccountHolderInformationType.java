
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountHolderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountHolderInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="RegisteredAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredAddressForSBFE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountHolderInformationType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectID",
    "organizationName",
    "registeredAddress"
})
public class AccountHolderInformationType {

    @XmlElement(name = "SubjectID")
    protected String subjectID;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "RegisteredAddress")
    protected RegisteredAddressForSBFE registeredAddress;

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectID(String value) {
        this.subjectID = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the registeredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredAddressForSBFE }
     *     
     */
    public RegisteredAddressForSBFE getRegisteredAddress() {
        return registeredAddress;
    }

    /**
     * Sets the value of the registeredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredAddressForSBFE }
     *     
     */
    public void setRegisteredAddress(RegisteredAddressForSBFE value) {
        this.registeredAddress = value;
    }

}
