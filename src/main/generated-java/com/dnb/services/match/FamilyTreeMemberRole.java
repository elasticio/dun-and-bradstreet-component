
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyTreeMemberRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyTreeMemberRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyTreeMemberRoleText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyTreeMemberRole", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "familyTreeMemberRoleText"
})
public class FamilyTreeMemberRole {

    @XmlElement(name = "FamilyTreeMemberRoleText")
    protected DNBDecodedStringType familyTreeMemberRoleText;

    /**
     * Gets the value of the familyTreeMemberRoleText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFamilyTreeMemberRoleText() {
        return familyTreeMemberRoleText;
    }

    /**
     * Sets the value of the familyTreeMemberRoleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFamilyTreeMemberRoleText(DNBDecodedStringType value) {
        this.familyTreeMemberRoleText = value;
    }

}
