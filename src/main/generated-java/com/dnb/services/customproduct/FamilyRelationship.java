
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpouseName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyRelationship", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "spouseName"
})
public class FamilyRelationship {

    @XmlElement(name = "SpouseName")
    protected IndividualNameType spouseName;

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setSpouseName(IndividualNameType value) {
        this.spouseName = value;
    }

}
