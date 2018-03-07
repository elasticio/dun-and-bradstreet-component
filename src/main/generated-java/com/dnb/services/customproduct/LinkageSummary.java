
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalUltimateFamilyTreeLinkageCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChildrenSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}ChildrenSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectFamilyTreeLinkageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubsidiaryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiblingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShareOwnerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GlobalFamilyTreeSubsidiariesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GlobalFamilyTreeHeadquartersCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GlobalFamilyTreeBranchesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GlobalFamilyTreeParentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BranchDivisionExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkageSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "globalUltimateFamilyTreeLinkageCount",
    "childrenSummary",
    "subjectFamilyTreeLinkageCount",
    "subsidiaryCount",
    "siblingCount",
    "shareOwnerCount",
    "globalFamilyTreeSubsidiariesCount",
    "globalFamilyTreeHeadquartersCount",
    "globalFamilyTreeBranchesCount",
    "globalFamilyTreeParentCount",
    "branchDivisionExistsIndicator"
})
public class LinkageSummary {

    @XmlElement(name = "GlobalUltimateFamilyTreeLinkageCount")
    protected Integer globalUltimateFamilyTreeLinkageCount;
    @XmlElement(name = "ChildrenSummary")
    protected List<ChildrenSummary> childrenSummary;
    @XmlElement(name = "SubjectFamilyTreeLinkageCount")
    protected Integer subjectFamilyTreeLinkageCount;
    @XmlElement(name = "SubsidiaryCount")
    protected Integer subsidiaryCount;
    @XmlElement(name = "SiblingCount")
    protected Integer siblingCount;
    @XmlElement(name = "ShareOwnerCount")
    protected Integer shareOwnerCount;
    @XmlElement(name = "GlobalFamilyTreeSubsidiariesCount")
    protected Integer globalFamilyTreeSubsidiariesCount;
    @XmlElement(name = "GlobalFamilyTreeHeadquartersCount")
    protected Integer globalFamilyTreeHeadquartersCount;
    @XmlElement(name = "GlobalFamilyTreeBranchesCount")
    protected Integer globalFamilyTreeBranchesCount;
    @XmlElement(name = "GlobalFamilyTreeParentCount")
    protected Integer globalFamilyTreeParentCount;
    @XmlElement(name = "BranchDivisionExistsIndicator")
    protected Boolean branchDivisionExistsIndicator;

    /**
     * Gets the value of the globalUltimateFamilyTreeLinkageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalUltimateFamilyTreeLinkageCount() {
        return globalUltimateFamilyTreeLinkageCount;
    }

    /**
     * Sets the value of the globalUltimateFamilyTreeLinkageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalUltimateFamilyTreeLinkageCount(Integer value) {
        this.globalUltimateFamilyTreeLinkageCount = value;
    }

    /**
     * Gets the value of the childrenSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildrenSummary }
     * 
     * 
     */
    public List<ChildrenSummary> getChildrenSummary() {
        if (childrenSummary == null) {
            childrenSummary = new ArrayList<ChildrenSummary>();
        }
        return this.childrenSummary;
    }

    /**
     * Gets the value of the subjectFamilyTreeLinkageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectFamilyTreeLinkageCount() {
        return subjectFamilyTreeLinkageCount;
    }

    /**
     * Sets the value of the subjectFamilyTreeLinkageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectFamilyTreeLinkageCount(Integer value) {
        this.subjectFamilyTreeLinkageCount = value;
    }

    /**
     * Gets the value of the subsidiaryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubsidiaryCount() {
        return subsidiaryCount;
    }

    /**
     * Sets the value of the subsidiaryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubsidiaryCount(Integer value) {
        this.subsidiaryCount = value;
    }

    /**
     * Gets the value of the siblingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiblingCount() {
        return siblingCount;
    }

    /**
     * Sets the value of the siblingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiblingCount(Integer value) {
        this.siblingCount = value;
    }

    /**
     * Gets the value of the shareOwnerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShareOwnerCount() {
        return shareOwnerCount;
    }

    /**
     * Sets the value of the shareOwnerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShareOwnerCount(Integer value) {
        this.shareOwnerCount = value;
    }

    /**
     * Gets the value of the globalFamilyTreeSubsidiariesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalFamilyTreeSubsidiariesCount() {
        return globalFamilyTreeSubsidiariesCount;
    }

    /**
     * Sets the value of the globalFamilyTreeSubsidiariesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalFamilyTreeSubsidiariesCount(Integer value) {
        this.globalFamilyTreeSubsidiariesCount = value;
    }

    /**
     * Gets the value of the globalFamilyTreeHeadquartersCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalFamilyTreeHeadquartersCount() {
        return globalFamilyTreeHeadquartersCount;
    }

    /**
     * Sets the value of the globalFamilyTreeHeadquartersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalFamilyTreeHeadquartersCount(Integer value) {
        this.globalFamilyTreeHeadquartersCount = value;
    }

    /**
     * Gets the value of the globalFamilyTreeBranchesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalFamilyTreeBranchesCount() {
        return globalFamilyTreeBranchesCount;
    }

    /**
     * Sets the value of the globalFamilyTreeBranchesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalFamilyTreeBranchesCount(Integer value) {
        this.globalFamilyTreeBranchesCount = value;
    }

    /**
     * Gets the value of the globalFamilyTreeParentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalFamilyTreeParentCount() {
        return globalFamilyTreeParentCount;
    }

    /**
     * Sets the value of the globalFamilyTreeParentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalFamilyTreeParentCount(Integer value) {
        this.globalFamilyTreeParentCount = value;
    }

    /**
     * Gets the value of the branchDivisionExistsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBranchDivisionExistsIndicator() {
        return branchDivisionExistsIndicator;
    }

    /**
     * Sets the value of the branchDivisionExistsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranchDivisionExistsIndicator(Boolean value) {
        this.branchDivisionExistsIndicator = value;
    }

}
