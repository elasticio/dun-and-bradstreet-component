
package com.dnb.services.entitylist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyTreeMemberRoleCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyTreeMemberRoleCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyTreeMemberRoleCode" type="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyTreeMemberRoleCodeType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "familyTreeMemberRoleCode"
})
public class FamilyTreeMemberRoleCodeType {

    @XmlElement(name = "FamilyTreeMemberRoleCode", required = true)
    protected BigInteger familyTreeMemberRoleCode;

    /**
     * Gets the value of the familyTreeMemberRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFamilyTreeMemberRoleCode() {
        return familyTreeMemberRoleCode;
    }

    /**
     * Sets the value of the familyTreeMemberRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFamilyTreeMemberRoleCode(BigInteger value) {
        this.familyTreeMemberRoleCode = value;
    }

}
