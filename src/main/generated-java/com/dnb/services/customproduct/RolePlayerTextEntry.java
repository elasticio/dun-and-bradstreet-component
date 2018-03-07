
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RolePlayerTextEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePlayerTextEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerDetailTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayerDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePlayerTextEntry", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rolePlayerDetailTypeText",
    "rolePlayerDetailText"
})
public class RolePlayerTextEntry {

    @XmlElement(name = "RolePlayerDetailTypeText")
    protected DNBDecodedStringType rolePlayerDetailTypeText;
    @XmlElement(name = "RolePlayerDetailText")
    protected String rolePlayerDetailText;

    /**
     * Gets the value of the rolePlayerDetailTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerDetailTypeText() {
        return rolePlayerDetailTypeText;
    }

    /**
     * Sets the value of the rolePlayerDetailTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerDetailTypeText(DNBDecodedStringType value) {
        this.rolePlayerDetailTypeText = value;
    }

    /**
     * Gets the value of the rolePlayerDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerDetailText() {
        return rolePlayerDetailText;
    }

    /**
     * Sets the value of the rolePlayerDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerDetailText(String value) {
        this.rolePlayerDetailText = value;
    }

}
