
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ownership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ownership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}OrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PrimaryAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ownership", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "countryISOAlpha2Code",
    "dunsNumber",
    "organizationPrimaryName",
    "primaryAddress"
})
@XmlSeeAlso({
    Shareholder.class
})
public class Ownership
    extends Association
{

    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "OrganizationPrimaryName")
    protected List<OrganizationPrimaryNameType> organizationPrimaryName;
    @XmlElement(name = "PrimaryAddress")
    protected List<PrimaryAddressType> primaryAddress;

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

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
     * Gets the value of the organizationPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationPrimaryNameType }
     * 
     * 
     */
    public List<OrganizationPrimaryNameType> getOrganizationPrimaryName() {
        if (organizationPrimaryName == null) {
            organizationPrimaryName = new ArrayList<OrganizationPrimaryNameType>();
        }
        return this.organizationPrimaryName;
    }

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

}
