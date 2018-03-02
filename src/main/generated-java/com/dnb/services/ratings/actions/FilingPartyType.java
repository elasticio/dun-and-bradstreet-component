
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerTypeText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayerName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingPartyType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "rolePlayerTypeText",
    "rolePlayerName"
})
public class FilingPartyType {

    @XmlElement(name = "RolePlayerTypeText")
    protected DNBDecodedStringType rolePlayerTypeText;
    @XmlElement(name = "RolePlayerName")
    protected String rolePlayerName;

    /**
     * Gets the value of the rolePlayerTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerTypeText() {
        return rolePlayerTypeText;
    }

    /**
     * Sets the value of the rolePlayerTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerTypeText(DNBDecodedStringType value) {
        this.rolePlayerTypeText = value;
    }

    /**
     * Gets the value of the rolePlayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerName() {
        return rolePlayerName;
    }

    /**
     * Sets the value of the rolePlayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerName(String value) {
        this.rolePlayerName = value;
    }

}
