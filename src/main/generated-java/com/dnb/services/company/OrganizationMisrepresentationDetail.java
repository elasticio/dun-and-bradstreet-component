
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrganizationMisrepresentationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationMisrepresentationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CompanyServiceV2.0}OrganizationPrimaryNameType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreMisrepresentationFileBaseAddressType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CompanyServiceV2.0}TelecommunicationNumberSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationMisrepresentationDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "confirmationDate",
    "organizationName",
    "address",
    "telephoneNumber"
})
public class OrganizationMisrepresentationDetail {

    @XmlElement(name = "ConfirmationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar confirmationDate;
    @XmlElement(name = "OrganizationName")
    protected OrganizationPrimaryNameType organizationName;
    @XmlElement(name = "Address")
    protected GetFraudScoreMisrepresentationFileBaseAddressType address;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberSimpleType telephoneNumber;

    /**
     * Gets the value of the confirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmationDate() {
        return confirmationDate;
    }

    /**
     * Sets the value of the confirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmationDate(XMLGregorianCalendar value) {
        this.confirmationDate = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public OrganizationPrimaryNameType getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public void setOrganizationName(OrganizationPrimaryNameType value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link GetFraudScoreMisrepresentationFileBaseAddressType }
     *     
     */
    public GetFraudScoreMisrepresentationFileBaseAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFraudScoreMisrepresentationFileBaseAddressType }
     *     
     */
    public void setAddress(GetFraudScoreMisrepresentationFileBaseAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public TelecommunicationNumberSimpleType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberSimpleType value) {
        this.telephoneNumber = value;
    }

}
