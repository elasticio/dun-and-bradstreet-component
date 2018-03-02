
package com.dnb.services.ratings.actions;

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
 *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/AssessmentProductServiceV2.0}FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StandaloneOrganizationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ControlOwnershipDate" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OrganizationStartYear" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDetail", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "familyTreeMemberRole",
    "standaloneOrganizationIndicator",
    "controlOwnershipDate",
    "operatingStatusText",
    "organizationStartYear"
})
public class OrganizationDetail {

    @XmlElement(name = "FamilyTreeMemberRole")
    protected List<FamilyTreeMemberRole> familyTreeMemberRole;
    @XmlElement(name = "StandaloneOrganizationIndicator")
    protected Boolean standaloneOrganizationIndicator;
    @XmlElement(name = "ControlOwnershipDate")
    protected DNBDateType controlOwnershipDate;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "OrganizationStartYear")
    protected String organizationStartYear;

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

}
