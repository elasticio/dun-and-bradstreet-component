
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://services.dnb.com/AssessmentProductServiceV2.0}MailAddressType" minOccurs="0"/>
 *         &lt;element name="OfficeOrWorkAddress" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectAddressType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "primaryAddress",
    "mailingAddress",
    "officeOrWorkAddress"
})
public class SubjectAddressType {

    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddressType primaryAddress;
    @XmlElement(name = "MailingAddress")
    protected MailAddressType mailingAddress;
    @XmlElement(name = "OfficeOrWorkAddress")
    protected PrimaryAddressType officeOrWorkAddress;

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setPrimaryAddress(PrimaryAddressType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddressType }
     *     
     */
    public MailAddressType getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddressType }
     *     
     */
    public void setMailingAddress(MailAddressType value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the officeOrWorkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getOfficeOrWorkAddress() {
        return officeOrWorkAddress;
    }

    /**
     * Sets the value of the officeOrWorkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setOfficeOrWorkAddress(PrimaryAddressType value) {
        this.officeOrWorkAddress = value;
    }

}
