
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linkage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalUltimateOrganization" type="{http://services.dnb.com/SBRIProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="ParentOrganization" type="{http://services.dnb.com/SBRIProductServiceV2.0}Shareholder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkage", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "globalUltimateOrganization",
    "parentOrganization"
})
public class Linkage {

    @XmlElement(name = "GlobalUltimateOrganization")
    protected ParentAssociation globalUltimateOrganization;
    @XmlElement(name = "ParentOrganization")
    protected Shareholder parentOrganization;

    /**
     * Gets the value of the globalUltimateOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ParentAssociation }
     *     
     */
    public ParentAssociation getGlobalUltimateOrganization() {
        return globalUltimateOrganization;
    }

    /**
     * Sets the value of the globalUltimateOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentAssociation }
     *     
     */
    public void setGlobalUltimateOrganization(ParentAssociation value) {
        this.globalUltimateOrganization = value;
    }

    /**
     * Gets the value of the parentOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Shareholder }
     *     
     */
    public Shareholder getParentOrganization() {
        return parentOrganization;
    }

    /**
     * Sets the value of the parentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shareholder }
     *     
     */
    public void setParentOrganization(Shareholder value) {
        this.parentOrganization = value;
    }

}
