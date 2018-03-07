
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the address details for a subject. An address is the designation of a place where a subject can be located or may be communicated with, e.g., primary address, registered address, mailing address.
 *          
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegisteredAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}MailAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerPrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}FormerPrimaryAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressTypeUnknownAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerRegisteredAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}FormerRegisteredAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "primaryAddress",
    "registeredAddress",
    "mailingAddress",
    "formerPrimaryAddress",
    "addressTypeUnknownAddress",
    "formerRegisteredAddress"
})
public class Location {

    @XmlElement(name = "PrimaryAddress")
    protected List<PrimaryAddressType> primaryAddress;
    @XmlElement(name = "RegisteredAddress")
    protected List<RegisteredAddressType> registeredAddress;
    @XmlElement(name = "MailingAddress")
    protected List<MailAddressType> mailingAddress;
    @XmlElement(name = "FormerPrimaryAddress")
    protected List<FormerPrimaryAddress> formerPrimaryAddress;
    @XmlElement(name = "AddressTypeUnknownAddress")
    protected List<RegisteredAddressType> addressTypeUnknownAddress;
    @XmlElement(name = "FormerRegisteredAddress")
    protected List<FormerRegisteredAddress> formerRegisteredAddress;

    /**
     * Gets the value of the primaryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryAddressType }
     * 
     * 
     */
    public List<PrimaryAddressType> getPrimaryAddress() {
        if (primaryAddress == null) {
            primaryAddress = new ArrayList<PrimaryAddressType>();
        }
        return this.primaryAddress;
    }

    /**
     * Gets the value of the registeredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredAddressType }
     * 
     * 
     */
    public List<RegisteredAddressType> getRegisteredAddress() {
        if (registeredAddress == null) {
            registeredAddress = new ArrayList<RegisteredAddressType>();
        }
        return this.registeredAddress;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailingAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailingAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailAddressType }
     * 
     * 
     */
    public List<MailAddressType> getMailingAddress() {
        if (mailingAddress == null) {
            mailingAddress = new ArrayList<MailAddressType>();
        }
        return this.mailingAddress;
    }

    /**
     * Gets the value of the formerPrimaryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerPrimaryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerPrimaryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerPrimaryAddress }
     * 
     * 
     */
    public List<FormerPrimaryAddress> getFormerPrimaryAddress() {
        if (formerPrimaryAddress == null) {
            formerPrimaryAddress = new ArrayList<FormerPrimaryAddress>();
        }
        return this.formerPrimaryAddress;
    }

    /**
     * Gets the value of the addressTypeUnknownAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressTypeUnknownAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressTypeUnknownAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredAddressType }
     * 
     * 
     */
    public List<RegisteredAddressType> getAddressTypeUnknownAddress() {
        if (addressTypeUnknownAddress == null) {
            addressTypeUnknownAddress = new ArrayList<RegisteredAddressType>();
        }
        return this.addressTypeUnknownAddress;
    }

    /**
     * Gets the value of the formerRegisteredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerRegisteredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerRegisteredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerRegisteredAddress }
     * 
     * 
     */
    public List<FormerRegisteredAddress> getFormerRegisteredAddress() {
        if (formerRegisteredAddress == null) {
            formerRegisteredAddress = new ArrayList<FormerRegisteredAddress>();
        }
        return this.formerRegisteredAddress;
    }

}
