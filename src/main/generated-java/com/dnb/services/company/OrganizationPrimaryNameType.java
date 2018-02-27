
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationPrimaryNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationPrimaryNameType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}OrganizationNameBaseType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="RegisteredNameIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationPrimaryNameType", namespace = "http://services.dnb.com/CompanyServiceV2.0")
public class OrganizationPrimaryNameType
    extends OrganizationNameBaseType
{

    @XmlAttribute(name = "RegisteredNameIndicator")
    protected Boolean registeredNameIndicator;

    /**
     * Gets the value of the registeredNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegisteredNameIndicator() {
        return registeredNameIndicator;
    }

    /**
     * Sets the value of the registeredNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegisteredNameIndicator(Boolean value) {
        this.registeredNameIndicator = value;
    }

}
