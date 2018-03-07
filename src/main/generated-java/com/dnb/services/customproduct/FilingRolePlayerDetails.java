
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to record information about parties involved with the document that is filed for the Subject with the registry or a similar body; e.g., Registrar, Agent for Business Registration
 *          
 * 
 * <p>Java class for FilingRolePlayerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingRolePlayerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="RolePlayerName" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePlayerName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayerStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RolePlayerDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="RolePlayerActiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RolePlayerPosition" type="{http://services.dnb.com/CustomProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayerJobTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayerLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="RolePlayerSubjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingRolePlayerDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rolePlayerTypeText",
    "rolePlayerName",
    "rolePlayerStartDate",
    "rolePlayerDUNSNumber",
    "rolePlayerActiveIndicator",
    "rolePlayerPosition",
    "rolePlayerJobTitle",
    "rolePlayerLocation",
    "rolePlayerSubjectID"
})
public class FilingRolePlayerDetails {

    @XmlElement(name = "RolePlayerTypeText", required = true)
    protected DNBDecodedStringType rolePlayerTypeText;
    @XmlElement(name = "RolePlayerName")
    protected List<RolePlayerName> rolePlayerName;
    @XmlElement(name = "RolePlayerStartDate")
    protected DNBDateType rolePlayerStartDate;
    @XmlElement(name = "RolePlayerDUNSNumber")
    protected String rolePlayerDUNSNumber;
    @XmlElement(name = "RolePlayerActiveIndicator")
    protected Boolean rolePlayerActiveIndicator;
    @XmlElement(name = "RolePlayerPosition")
    protected List<Position> rolePlayerPosition;
    @XmlElement(name = "RolePlayerJobTitle")
    protected List<JobTitle> rolePlayerJobTitle;
    @XmlElement(name = "RolePlayerLocation")
    protected Location rolePlayerLocation;
    @XmlElement(name = "RolePlayerSubjectID")
    protected String rolePlayerSubjectID;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePlayerName }
     * 
     * 
     */
    public List<RolePlayerName> getRolePlayerName() {
        if (rolePlayerName == null) {
            rolePlayerName = new ArrayList<RolePlayerName>();
        }
        return this.rolePlayerName;
    }

    /**
     * Gets the value of the rolePlayerStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getRolePlayerStartDate() {
        return rolePlayerStartDate;
    }

    /**
     * Sets the value of the rolePlayerStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setRolePlayerStartDate(DNBDateType value) {
        this.rolePlayerStartDate = value;
    }

    /**
     * Gets the value of the rolePlayerDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerDUNSNumber() {
        return rolePlayerDUNSNumber;
    }

    /**
     * Sets the value of the rolePlayerDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerDUNSNumber(String value) {
        this.rolePlayerDUNSNumber = value;
    }

    /**
     * Gets the value of the rolePlayerActiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRolePlayerActiveIndicator() {
        return rolePlayerActiveIndicator;
    }

    /**
     * Sets the value of the rolePlayerActiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRolePlayerActiveIndicator(Boolean value) {
        this.rolePlayerActiveIndicator = value;
    }

    /**
     * Gets the value of the rolePlayerPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getRolePlayerPosition() {
        if (rolePlayerPosition == null) {
            rolePlayerPosition = new ArrayList<Position>();
        }
        return this.rolePlayerPosition;
    }

    /**
     * Gets the value of the rolePlayerJobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerJobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobTitle }
     * 
     * 
     */
    public List<JobTitle> getRolePlayerJobTitle() {
        if (rolePlayerJobTitle == null) {
            rolePlayerJobTitle = new ArrayList<JobTitle>();
        }
        return this.rolePlayerJobTitle;
    }

    /**
     * Gets the value of the rolePlayerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getRolePlayerLocation() {
        return rolePlayerLocation;
    }

    /**
     * Sets the value of the rolePlayerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setRolePlayerLocation(Location value) {
        this.rolePlayerLocation = value;
    }

    /**
     * Gets the value of the rolePlayerSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerSubjectID() {
        return rolePlayerSubjectID;
    }

    /**
     * Sets the value of the rolePlayerSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerSubjectID(String value) {
        this.rolePlayerSubjectID = value;
    }

}
