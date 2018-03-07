
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="LinkageSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LinkageSummary" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="HeadquartersOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="ParentOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}Shareholder" minOccurs="0"/>
 *         &lt;element name="ParentOrHeadquartersOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ParentAssociation" minOccurs="0"/>
 *         &lt;element name="MinorityOwnerOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}Shareholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShareOwner" type="{http://services.dnb.com/CustomProductServiceV2.0}Shareholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FamilyTreeMemberOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ChildAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MinorityInterestOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}Shareholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FamilyTreeHierarchyLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIASNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AffliateText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionalDomesticAffiliatesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalDomesticBranchesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalDomesticDivisionsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalDomesticSubsidiariesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalInternationalAffiliatesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalInternationalBranchesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalInternationalDivisionsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalInternationalSubsidiariesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkageUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CorporateDirectorshipDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CorporateDirectorshipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkage", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "linkageSummary",
    "globalUltimateOrganization",
    "domesticUltimateOrganization",
    "headquartersOrganization",
    "parentOrganization",
    "parentOrHeadquartersOrganization",
    "minorityOwnerOrganization",
    "shareOwner",
    "familyTreeMemberOrganization",
    "minorityInterestOrganization",
    "familyTreeHierarchyLevel",
    "diasNumber",
    "affliateText",
    "additionalDomesticAffiliatesAvailabilityIndicator",
    "additionalDomesticBranchesAvailabilityIndicator",
    "additionalDomesticDivisionsAvailabilityIndicator",
    "additionalDomesticSubsidiariesAvailabilityIndicator",
    "additionalInternationalAffiliatesAvailabilityIndicator",
    "additionalInternationalBranchesAvailabilityIndicator",
    "additionalInternationalDivisionsAvailabilityIndicator",
    "additionalInternationalSubsidiariesAvailabilityIndicator",
    "linkageUpdateDate",
    "corporateDirectorshipDetails"
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
    @XmlElement(name = "ParentOrHeadquartersOrganization")
    protected ParentAssociation parentOrHeadquartersOrganization;
    @XmlElement(name = "MinorityOwnerOrganization")
    protected List<Shareholder> minorityOwnerOrganization;
    @XmlElement(name = "ShareOwner")
    protected List<Shareholder> shareOwner;
    @XmlElement(name = "FamilyTreeMemberOrganization")
    protected List<ChildAssociation> familyTreeMemberOrganization;
    @XmlElement(name = "MinorityInterestOrganization")
    protected List<Shareholder> minorityInterestOrganization;
    @XmlElement(name = "FamilyTreeHierarchyLevel")
    protected Integer familyTreeHierarchyLevel;
    @XmlElement(name = "DIASNumber")
    protected Integer diasNumber;
    @XmlElement(name = "AffliateText")
    protected List<String> affliateText;
    @XmlElement(name = "AdditionalDomesticAffiliatesAvailabilityIndicator")
    protected Boolean additionalDomesticAffiliatesAvailabilityIndicator;
    @XmlElement(name = "AdditionalDomesticBranchesAvailabilityIndicator")
    protected Boolean additionalDomesticBranchesAvailabilityIndicator;
    @XmlElement(name = "AdditionalDomesticDivisionsAvailabilityIndicator")
    protected Boolean additionalDomesticDivisionsAvailabilityIndicator;
    @XmlElement(name = "AdditionalDomesticSubsidiariesAvailabilityIndicator")
    protected Boolean additionalDomesticSubsidiariesAvailabilityIndicator;
    @XmlElement(name = "AdditionalInternationalAffiliatesAvailabilityIndicator")
    protected Boolean additionalInternationalAffiliatesAvailabilityIndicator;
    @XmlElement(name = "AdditionalInternationalBranchesAvailabilityIndicator")
    protected Boolean additionalInternationalBranchesAvailabilityIndicator;
    @XmlElement(name = "AdditionalInternationalDivisionsAvailabilityIndicator")
    protected Boolean additionalInternationalDivisionsAvailabilityIndicator;
    @XmlElement(name = "AdditionalInternationalSubsidiariesAvailabilityIndicator")
    protected Boolean additionalInternationalSubsidiariesAvailabilityIndicator;
    @XmlElement(name = "LinkageUpdateDate")
    protected DNBDateType linkageUpdateDate;
    @XmlElement(name = "CorporateDirectorshipDetails")
    protected List<CorporateDirectorshipType> corporateDirectorshipDetails;

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
     * Gets the value of the parentOrHeadquartersOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ParentAssociation }
     *     
     */
    public ParentAssociation getParentOrHeadquartersOrganization() {
        return parentOrHeadquartersOrganization;
    }

    /**
     * Sets the value of the parentOrHeadquartersOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentAssociation }
     *     
     */
    public void setParentOrHeadquartersOrganization(ParentAssociation value) {
        this.parentOrHeadquartersOrganization = value;
    }

    /**
     * Gets the value of the minorityOwnerOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minorityOwnerOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinorityOwnerOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shareholder }
     * 
     * 
     */
    public List<Shareholder> getMinorityOwnerOrganization() {
        if (minorityOwnerOrganization == null) {
            minorityOwnerOrganization = new ArrayList<Shareholder>();
        }
        return this.minorityOwnerOrganization;
    }

    /**
     * Gets the value of the shareOwner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareOwner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shareholder }
     * 
     * 
     */
    public List<Shareholder> getShareOwner() {
        if (shareOwner == null) {
            shareOwner = new ArrayList<Shareholder>();
        }
        return this.shareOwner;
    }

    /**
     * Gets the value of the familyTreeMemberOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyTreeMemberOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyTreeMemberOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildAssociation }
     * 
     * 
     */
    public List<ChildAssociation> getFamilyTreeMemberOrganization() {
        if (familyTreeMemberOrganization == null) {
            familyTreeMemberOrganization = new ArrayList<ChildAssociation>();
        }
        return this.familyTreeMemberOrganization;
    }

    /**
     * Gets the value of the minorityInterestOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minorityInterestOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinorityInterestOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shareholder }
     * 
     * 
     */
    public List<Shareholder> getMinorityInterestOrganization() {
        if (minorityInterestOrganization == null) {
            minorityInterestOrganization = new ArrayList<Shareholder>();
        }
        return this.minorityInterestOrganization;
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
     * Gets the value of the diasNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDIASNumber() {
        return diasNumber;
    }

    /**
     * Sets the value of the diasNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDIASNumber(Integer value) {
        this.diasNumber = value;
    }

    /**
     * Gets the value of the affliateText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affliateText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffliateText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAffliateText() {
        if (affliateText == null) {
            affliateText = new ArrayList<String>();
        }
        return this.affliateText;
    }

    /**
     * Gets the value of the additionalDomesticAffiliatesAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalDomesticAffiliatesAvailabilityIndicator() {
        return additionalDomesticAffiliatesAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalDomesticAffiliatesAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalDomesticAffiliatesAvailabilityIndicator(Boolean value) {
        this.additionalDomesticAffiliatesAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalDomesticBranchesAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalDomesticBranchesAvailabilityIndicator() {
        return additionalDomesticBranchesAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalDomesticBranchesAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalDomesticBranchesAvailabilityIndicator(Boolean value) {
        this.additionalDomesticBranchesAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalDomesticDivisionsAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalDomesticDivisionsAvailabilityIndicator() {
        return additionalDomesticDivisionsAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalDomesticDivisionsAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalDomesticDivisionsAvailabilityIndicator(Boolean value) {
        this.additionalDomesticDivisionsAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalDomesticSubsidiariesAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalDomesticSubsidiariesAvailabilityIndicator() {
        return additionalDomesticSubsidiariesAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalDomesticSubsidiariesAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalDomesticSubsidiariesAvailabilityIndicator(Boolean value) {
        this.additionalDomesticSubsidiariesAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalInternationalAffiliatesAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalInternationalAffiliatesAvailabilityIndicator() {
        return additionalInternationalAffiliatesAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalInternationalAffiliatesAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalInternationalAffiliatesAvailabilityIndicator(Boolean value) {
        this.additionalInternationalAffiliatesAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalInternationalBranchesAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalInternationalBranchesAvailabilityIndicator() {
        return additionalInternationalBranchesAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalInternationalBranchesAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalInternationalBranchesAvailabilityIndicator(Boolean value) {
        this.additionalInternationalBranchesAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalInternationalDivisionsAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalInternationalDivisionsAvailabilityIndicator() {
        return additionalInternationalDivisionsAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalInternationalDivisionsAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalInternationalDivisionsAvailabilityIndicator(Boolean value) {
        this.additionalInternationalDivisionsAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the additionalInternationalSubsidiariesAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalInternationalSubsidiariesAvailabilityIndicator() {
        return additionalInternationalSubsidiariesAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalInternationalSubsidiariesAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalInternationalSubsidiariesAvailabilityIndicator(Boolean value) {
        this.additionalInternationalSubsidiariesAvailabilityIndicator = value;
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

    /**
     * Gets the value of the corporateDirectorshipDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDirectorshipDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDirectorshipDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDirectorshipType }
     * 
     * 
     */
    public List<CorporateDirectorshipType> getCorporateDirectorshipDetails() {
        if (corporateDirectorshipDetails == null) {
            corporateDirectorshipDetails = new ArrayList<CorporateDirectorshipType>();
        }
        return this.corporateDirectorshipDetails;
    }

}
