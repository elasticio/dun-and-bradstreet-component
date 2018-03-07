
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the current legal form of a subject.
 *          
 * 
 * <p>Java class for LegalFormDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFormDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalFormText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="LegalFormClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="BusinessLegalStructureExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegistrationNotRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RolePlayerDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingRolePlayerDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegistrationLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="RegistrationStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFormDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "legalFormText",
    "legalFormClassText",
    "startDate",
    "expirationDate",
    "businessLegalStructureExistsIndicator",
    "registrationNotRequiredIndicator",
    "rolePlayerDetails",
    "registrationLocation",
    "registrationStatusText"
})
@XmlSeeAlso({
    LegalFormDetailsHistory.class
})
public class LegalFormDetailsType {

    @XmlElement(name = "LegalFormText", required = true)
    protected DNBDecodedStringType legalFormText;
    @XmlElement(name = "LegalFormClassText")
    protected DNBDecodedStringType legalFormClassText;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "ExpirationDate")
    protected DNBDateType expirationDate;
    @XmlElement(name = "BusinessLegalStructureExistsIndicator")
    protected Boolean businessLegalStructureExistsIndicator;
    @XmlElement(name = "RegistrationNotRequiredIndicator")
    protected Boolean registrationNotRequiredIndicator;
    @XmlElement(name = "RolePlayerDetails")
    protected List<FilingRolePlayerDetails> rolePlayerDetails;
    @XmlElement(name = "RegistrationLocation")
    protected Location registrationLocation;
    @XmlElement(name = "RegistrationStatusText")
    protected DNBDecodedStringType registrationStatusText;

    /**
     * Gets the value of the legalFormText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalFormText() {
        return legalFormText;
    }

    /**
     * Sets the value of the legalFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalFormText(DNBDecodedStringType value) {
        this.legalFormText = value;
    }

    /**
     * Gets the value of the legalFormClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalFormClassText() {
        return legalFormClassText;
    }

    /**
     * Sets the value of the legalFormClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalFormClassText(DNBDecodedStringType value) {
        this.legalFormClassText = value;
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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setExpirationDate(DNBDateType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the businessLegalStructureExistsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessLegalStructureExistsIndicator() {
        return businessLegalStructureExistsIndicator;
    }

    /**
     * Sets the value of the businessLegalStructureExistsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessLegalStructureExistsIndicator(Boolean value) {
        this.businessLegalStructureExistsIndicator = value;
    }

    /**
     * Gets the value of the registrationNotRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistrationNotRequiredIndicator() {
        return registrationNotRequiredIndicator;
    }

    /**
     * Sets the value of the registrationNotRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistrationNotRequiredIndicator(Boolean value) {
        this.registrationNotRequiredIndicator = value;
    }

    /**
     * Gets the value of the rolePlayerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingRolePlayerDetails }
     * 
     * 
     */
    public List<FilingRolePlayerDetails> getRolePlayerDetails() {
        if (rolePlayerDetails == null) {
            rolePlayerDetails = new ArrayList<FilingRolePlayerDetails>();
        }
        return this.rolePlayerDetails;
    }

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
     * Gets the value of the registrationStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRegistrationStatusText() {
        return registrationStatusText;
    }

    /**
     * Sets the value of the registrationStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRegistrationStatusText(DNBDecodedStringType value) {
        this.registrationStatusText = value;
    }

}
