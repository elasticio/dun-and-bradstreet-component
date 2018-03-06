
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop that can repeat multiple times to allow the recording of various parts that the Subject plays as a member of an ownership structured family tree.
 *          
 * 
 * <p>Java class for FamilyTreeMemberRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyTreeMemberRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}Role">
 *       &lt;sequence>
 *         &lt;element name="FamilyTreeMemberRoleText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyTreeMemberRole", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "familyTreeMemberRoleText"
})
public class FamilyTreeMemberRole
    extends Role
{

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
