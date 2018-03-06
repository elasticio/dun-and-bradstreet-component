
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the fundamental information about a Subject which may vary over time.
 *          
 * 
 * <p>Java class for OrganizationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StandaloneOrganizationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ControlOwnershipDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ControlOwnershipTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OutofBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BoneyardOrganizationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusComment" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}OperatingStatusComment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationStartYear" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="FranchiseOperationTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "familyTreeMemberRole",
    "standaloneOrganizationIndicator",
    "controlOwnershipDate",
    "controlOwnershipTypeText",
    "outofBusinessIndicator",
    "boneyardOrganizationIndicator",
    "operatingStatusText",
    "operatingStatusComment",
    "organizationStartYear",
    "franchiseOperationTypeText"
})
public class OrganizationDetail {

    @XmlElement(name = "FamilyTreeMemberRole")
    protected List<FamilyTreeMemberRole> familyTreeMemberRole;
    @XmlElement(name = "StandaloneOrganizationIndicator")
    protected Boolean standaloneOrganizationIndicator;
    @XmlElement(name = "ControlOwnershipDate")
    protected DNBDateType controlOwnershipDate;
    @XmlElement(name = "ControlOwnershipTypeText")
    protected DNBDecodedStringType controlOwnershipTypeText;
    @XmlElement(name = "OutofBusinessIndicator")
    protected Boolean outofBusinessIndicator;
    @XmlElement(name = "BoneyardOrganizationIndicator")
    protected Boolean boneyardOrganizationIndicator;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "OperatingStatusComment")
    protected List<OperatingStatusComment> operatingStatusComment;
    @XmlElement(name = "OrganizationStartYear")
    protected String organizationStartYear;
    @XmlElement(name = "FranchiseOperationTypeText")
    protected DNBDecodedStringType franchiseOperationTypeText;

    /**
     * Gets the value of the familyTreeMemberRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyTreeMemberRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyTreeMemberRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyTreeMemberRole }
     * 
     * 
     */
    public List<FamilyTreeMemberRole> getFamilyTreeMemberRole() {
        if (familyTreeMemberRole == null) {
            familyTreeMemberRole = new ArrayList<FamilyTreeMemberRole>();
        }
        return this.familyTreeMemberRole;
    }

    /**
     * Gets the value of the standaloneOrganizationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandaloneOrganizationIndicator() {
        return standaloneOrganizationIndicator;
    }

    /**
     * Sets the value of the standaloneOrganizationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandaloneOrganizationIndicator(Boolean value) {
        this.standaloneOrganizationIndicator = value;
    }

    /**
     * Gets the value of the controlOwnershipDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getControlOwnershipDate() {
        return controlOwnershipDate;
    }

    /**
     * Sets the value of the controlOwnershipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setControlOwnershipDate(DNBDateType value) {
        this.controlOwnershipDate = value;
    }

    /**
     * Gets the value of the controlOwnershipTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getControlOwnershipTypeText() {
        return controlOwnershipTypeText;
    }

    /**
     * Sets the value of the controlOwnershipTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setControlOwnershipTypeText(DNBDecodedStringType value) {
        this.controlOwnershipTypeText = value;
    }

    /**
     * Gets the value of the outofBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutofBusinessIndicator() {
        return outofBusinessIndicator;
    }

    /**
     * Sets the value of the outofBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutofBusinessIndicator(Boolean value) {
        this.outofBusinessIndicator = value;
    }

    /**
     * Gets the value of the boneyardOrganizationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoneyardOrganizationIndicator() {
        return boneyardOrganizationIndicator;
    }

    /**
     * Sets the value of the boneyardOrganizationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoneyardOrganizationIndicator(Boolean value) {
        this.boneyardOrganizationIndicator = value;
    }

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
    }

    /**
     * Gets the value of the operatingStatusComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingStatusComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingStatusComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingStatusComment }
     * 
     * 
     */
    public List<OperatingStatusComment> getOperatingStatusComment() {
        if (operatingStatusComment == null) {
            operatingStatusComment = new ArrayList<OperatingStatusComment>();
        }
        return this.operatingStatusComment;
    }

    /**
     * Gets the value of the organizationStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationStartYear() {
        return organizationStartYear;
    }

    /**
     * Sets the value of the organizationStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationStartYear(String value) {
        this.organizationStartYear = value;
    }

    /**
     * Gets the value of the franchiseOperationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFranchiseOperationTypeText() {
        return franchiseOperationTypeText;
    }

    /**
     * Sets the value of the franchiseOperationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFranchiseOperationTypeText(DNBDecodedStringType value) {
        this.franchiseOperationTypeText = value;
    }

}
