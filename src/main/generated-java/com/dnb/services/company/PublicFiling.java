
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicFiling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicFiling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationMatchedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingLocation" type="{http://services.dnb.com/CompanyServiceV2.0}FilingLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicFiling", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "organizationMatchedName",
    "filingLocation"
})
@XmlSeeAlso({
    SearchByFilingNameCandidate.class
})
public class PublicFiling {

    @XmlElement(name = "OrganizationMatchedName")
    protected String organizationMatchedName;
    @XmlElement(name = "FilingLocation")
    protected FilingLocation filingLocation;

    /**
     * Gets the value of the organizationMatchedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationMatchedName() {
        return organizationMatchedName;
    }

    /**
     * Sets the value of the organizationMatchedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationMatchedName(String value) {
        this.organizationMatchedName = value;
    }

    /**
     * Gets the value of the filingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FilingLocation }
     *     
     */
    public FilingLocation getFilingLocation() {
        return filingLocation;
    }

    /**
     * Sets the value of the filingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingLocation }
     *     
     */
    public void setFilingLocation(FilingLocation value) {
        this.filingLocation = value;
    }

}
