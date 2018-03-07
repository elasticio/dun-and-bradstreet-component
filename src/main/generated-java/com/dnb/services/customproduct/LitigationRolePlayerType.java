
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of various role players involved in a Legal Event as recorded in court papers and identifies the part each one plays, e.g., the creditor, debtor, plaintiff, defendant, solicitor, liquidator, trustee.
 *          
 * 
 * <p>Java class for LitigationRolePlayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LitigationRolePlayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleplayerName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="RolePlayerTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LitigationRolePlayerType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "roleplayerName",
    "rolePlayerTypeText"
})
public class LitigationRolePlayerType {

    @XmlElement(name = "RoleplayerName")
    protected String roleplayerName;
    @XmlElement(name = "RolePlayerTypeText")
    protected String rolePlayerTypeText;

    /**
     * Gets the value of the roleplayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleplayerName() {
        return roleplayerName;
    }

    /**
     * Sets the value of the roleplayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleplayerName(String value) {
        this.roleplayerName = value;
    }

    /**
     * Gets the value of the rolePlayerTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerTypeText() {
        return rolePlayerTypeText;
    }

    /**
     * Sets the value of the rolePlayerTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerTypeText(String value) {
        this.rolePlayerTypeText = value;
    }

}
