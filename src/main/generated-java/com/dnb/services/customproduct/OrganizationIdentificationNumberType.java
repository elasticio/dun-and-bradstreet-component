
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Registration Number Details
 *          
 * 
 * <p>Java class for OrganizationIdentificationNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationIdentificationNumberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberSimpleType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="RegistrationLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationIssuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RegistrationIssuerDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="AssignmentMethodText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FilingOrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="PreferredOrganizationIdentificationNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationIdentificationNumberType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "registrationLocation",
    "registrationLocationName",
    "registrationIssuerName",
    "startDate",
    "registrationIssuerDUNSNumber",
    "assignmentMethodText",
    "displaySequence",
    "filingOrganizationName",
    "preferredOrganizationIdentificationNumberIndicator"
})
@XmlSeeAlso({
    OrganizationIdentificationNumberDetailsHistory.class
})
public class OrganizationIdentificationNumberType
    extends OrganizationIdentificationNumberSimpleType
{

    @XmlElement(name = "RegistrationLocation")
    protected Location registrationLocation;
    @XmlElement(name = "RegistrationLocationName")
    protected String registrationLocationName;
    @XmlElement(name = "RegistrationIssuerName")
    protected String registrationIssuerName;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "RegistrationIssuerDUNSNumber")
    protected String registrationIssuerDUNSNumber;
    @XmlElement(name = "AssignmentMethodText")
    protected String assignmentMethodText;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "FilingOrganizationName")
    protected String filingOrganizationName;
    @XmlElement(name = "PreferredOrganizationIdentificationNumberIndicator")
    protected Boolean preferredOrganizationIdentificationNumberIndicator;

    /**
     * Gets the value of the registrationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getRegistrationLocation() {
        return registrationLocation;
    }

    /**
     * Sets the value of the registrationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setRegistrationLocation(Location value) {
        this.registrationLocation = value;
    }

    /**
     * Gets the value of the registrationLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationLocationName() {
        return registrationLocationName;
    }

    /**
     * Sets the value of the registrationLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationLocationName(String value) {
        this.registrationLocationName = value;
    }

    /**
     * Gets the value of the registrationIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationIssuerName() {
        return registrationIssuerName;
    }

    /**
     * Sets the value of the registrationIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationIssuerName(String value) {
        this.registrationIssuerName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the registrationIssuerDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationIssuerDUNSNumber() {
        return registrationIssuerDUNSNumber;
    }

    /**
     * Sets the value of the registrationIssuerDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationIssuerDUNSNumber(String value) {
        this.registrationIssuerDUNSNumber = value;
    }

    /**
     * Gets the value of the assignmentMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentMethodText() {
        return assignmentMethodText;
    }

    /**
     * Sets the value of the assignmentMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentMethodText(String value) {
        this.assignmentMethodText = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the filingOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOrganizationName() {
        return filingOrganizationName;
    }

    /**
     * Sets the value of the filingOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOrganizationName(String value) {
        this.filingOrganizationName = value;
    }

    /**
     * Gets the value of the preferredOrganizationIdentificationNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredOrganizationIdentificationNumberIndicator() {
        return preferredOrganizationIdentificationNumberIndicator;
    }

    /**
     * Sets the value of the preferredOrganizationIdentificationNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredOrganizationIdentificationNumberIndicator(Boolean value) {
        this.preferredOrganizationIdentificationNumberIndicator = value;
    }

}
