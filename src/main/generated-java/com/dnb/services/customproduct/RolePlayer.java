
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to record information about the various parties involved in the preparation of the Financial Statement.e.g., Auditor, Solicitor
 *          
 * 
 * <p>Java class for RolePlayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePlayer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *         &lt;element name="RolePlayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RolePlayerLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePalyerAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePlayer", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rolePlayerTypeText",
    "rolePlayerName",
    "rolePlayerLocation"
})
public class RolePlayer {

    @XmlElement(name = "RolePlayerTypeText")
    protected DNBDecodedStringNewType rolePlayerTypeText;
    @XmlElement(name = "RolePlayerName")
    protected String rolePlayerName;
    @XmlElement(name = "RolePlayerLocation")
    protected RolePalyerAddressType rolePlayerLocation;

    /**
     * Gets the value of the rolePlayerTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getRolePlayerTypeText() {
        return rolePlayerTypeText;
    }

    /**
     * Sets the value of the rolePlayerTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setRolePlayerTypeText(DNBDecodedStringNewType value) {
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

    /**
     * Gets the value of the rolePlayerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RolePalyerAddressType }
     *     
     */
    public RolePalyerAddressType getRolePlayerLocation() {
        return rolePlayerLocation;
    }

    /**
     * Sets the value of the rolePlayerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolePalyerAddressType }
     *     
     */
    public void setRolePlayerLocation(RolePalyerAddressType value) {
        this.rolePlayerLocation = value;
    }

}
