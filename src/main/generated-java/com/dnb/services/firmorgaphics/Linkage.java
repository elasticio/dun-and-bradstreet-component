
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linkage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkageSummary" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}LinkageSummary" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateOrganization" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateOrganization" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="HeadquartersOrganization" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="ParentOrganization" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Shareholder" minOccurs="0"/>
 *         &lt;element name="FamilyTreeHierarchyLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LinkageUpdateDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkage", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "linkageSummary",
    "globalUltimateOrganization",
    "domesticUltimateOrganization",
    "headquartersOrganization",
    "parentOrganization",
    "familyTreeHierarchyLevel",
    "linkageUpdateDate"
})
public class Linkage {

    @XmlElement(name = "LinkageSummary")
    protected LinkageSummary linkageSummary;
    @XmlElement(name = "GlobalUltimateOrganization")
    protected ParentAssociation globalUltimateOrganization;
    @XmlElement(name = "DomesticUltimateOrganization")
    protected ParentAssociation domesticUltimateOrganization;
    @XmlElement(name = "HeadquartersOrganization")
    protected ParentAssociation headquartersOrganization;
    @XmlElement(name = "ParentOrganization")
    protected Shareholder parentOrganization;
    @XmlElement(name = "FamilyTreeHierarchyLevel")
    protected Integer familyTreeHierarchyLevel;
    @XmlElement(name = "LinkageUpdateDate")
    protected DNBDateType linkageUpdateDate;

    /**
     * Gets the value of the linkageSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageSummary }
     *     
     */
    public LinkageSummary getLinkageSummary() {
        return linkageSummary;
    }

    /**
     * Sets the value of the linkageSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageSummary }
     *     
     */
    public void setLinkageSummary(LinkageSummary value) {
        this.linkageSummary = value;
    }

    /**
     * Gets the value of the globalUltimateOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ParentAssociation }
     *     
     */
    public ParentAssociation getGlobalUltimateOrganization() {
        return globalUltimateOrganization;
    }

    /**
     * Sets the value of the globalUltimateOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentAssociation }
     *     
     */
    public void setGlobalUltimateOrganization(ParentAssociation value) {
        this.globalUltimateOrganization = value;
    }

    /**
     * Gets the value of the domesticUltimateOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ParentAssociation }
     *     
     */
    public ParentAssociation getDomesticUltimateOrganization() {
        return domesticUltimateOrganization;
    }

    /**
     * Sets the value of the domesticUltimateOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentAssociation }
     *     
     */
    public void setDomesticUltimateOrganization(ParentAssociation value) {
        this.domesticUltimateOrganization = value;
    }

    /**
     * Gets the value of the headquartersOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ParentAssociation }
     *     
     */
    public ParentAssociation getHeadquartersOrganization() {
        return headquartersOrganization;
    }

    /**
     * Sets the value of the headquartersOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentAssociation }
     *     
     */
    public void setHeadquartersOrganization(ParentAssociation value) {
        this.headquartersOrganization = value;
    }

    /**
     * Gets the value of the parentOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Shareholder }
     *     
     */
    public Shareholder getParentOrganization() {
        return parentOrganization;
    }

    /**
     * Sets the value of the parentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shareholder }
     *     
     */
    public void setParentOrganization(Shareholder value) {
        this.parentOrganization = value;
    }

    /**
     * Gets the value of the familyTreeHierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilyTreeHierarchyLevel() {
        return familyTreeHierarchyLevel;
    }

    /**
     * Sets the value of the familyTreeHierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamilyTreeHierarchyLevel(Integer value) {
        this.familyTreeHierarchyLevel = value;
    }

    /**
     * Gets the value of the linkageUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLinkageUpdateDate() {
        return linkageUpdateDate;
    }

    /**
     * Sets the value of the linkageUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLinkageUpdateDate(DNBDateType value) {
        this.linkageUpdateDate = value;
    }

}
