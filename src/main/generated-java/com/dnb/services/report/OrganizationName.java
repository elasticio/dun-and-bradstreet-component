
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}SubjectName">
 *       &lt;sequence>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/ReportProductServiceV2.0}OrganizationPrimaryNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationName", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "organizationPrimaryName"
})
public class OrganizationName
    extends SubjectName
{

    @XmlElement(name = "OrganizationPrimaryName")
    protected OrganizationPrimaryNameType organizationPrimaryName;

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public OrganizationPrimaryNameType getOrganizationPrimaryName() {
        return organizationPrimaryName;
    }

    /**
     * Sets the value of the organizationPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public void setOrganizationPrimaryName(OrganizationPrimaryNameType value) {
        this.organizationPrimaryName = value;
    }

}
