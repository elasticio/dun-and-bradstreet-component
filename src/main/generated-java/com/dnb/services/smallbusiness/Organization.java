
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/SBRIProductServiceV2.0}Subject">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/SBRIProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="OrganizationDetail" type="{http://services.dnb.com/SBRIProductServiceV2.0}OrganizationDetail" minOccurs="0"/>
 *         &lt;element name="RegisteredDetail" type="{http://services.dnb.com/SBRIProductServiceV2.0}RegisteredDetail" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/SBRIProductServiceV2.0}IndustryCode" minOccurs="0"/>
 *         &lt;element name="ActivitiesAndOperations" type="{http://services.dnb.com/SBRIProductServiceV2.0}ActivitiesAndOperations" minOccurs="0"/>
 *         &lt;element name="Linkage" type="{http://services.dnb.com/SBRIProductServiceV2.0}Linkage" minOccurs="0"/>
 *         &lt;element name="Assessment" type="{http://services.dnb.com/SBRIProductServiceV2.0}Assessment" minOccurs="0"/>
 *         &lt;element name="FinancialRelationship" type="{http://services.dnb.com/SBRIProductServiceV2.0}FinancialRelationship" minOccurs="0"/>
 *         &lt;element name="BorrowerAnalytics" type="{http://services.dnb.com/SBRIProductServiceV2.0}BorrowerAnalytics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "organizationName",
    "organizationDetail",
    "registeredDetail",
    "industryCode",
    "activitiesAndOperations",
    "linkage",
    "assessment",
    "financialRelationship",
    "borrowerAnalytics"
})
public class Organization
    extends Subject
{

    @XmlElement(name = "OrganizationName")
    protected OrganizationName organizationName;
    @XmlElement(name = "OrganizationDetail")
    protected OrganizationDetail organizationDetail;
    @XmlElement(name = "RegisteredDetail")
    protected RegisteredDetail registeredDetail;
    @XmlElement(name = "IndustryCode")
    protected IndustryCode industryCode;
    @XmlElement(name = "ActivitiesAndOperations")
    protected ActivitiesAndOperations activitiesAndOperations;
    @XmlElement(name = "Linkage")
    protected Linkage linkage;
    @XmlElement(name = "Assessment")
    protected Assessment assessment;
    @XmlElement(name = "FinancialRelationship")
    protected FinancialRelationship financialRelationship;
    @XmlElement(name = "BorrowerAnalytics")
    protected BorrowerAnalytics borrowerAnalytics;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName }
     *     
     */
    public OrganizationName getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName }
     *     
     */
    public void setOrganizationName(OrganizationName value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetail }
     *     
     */
    public OrganizationDetail getOrganizationDetail() {
        return organizationDetail;
    }

    /**
     * Sets the value of the organizationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetail }
     *     
     */
    public void setOrganizationDetail(OrganizationDetail value) {
        this.organizationDetail = value;
    }

    /**
     * Gets the value of the registeredDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredDetail }
     *     
     */
    public RegisteredDetail getRegisteredDetail() {
        return registeredDetail;
    }

    /**
     * Sets the value of the registeredDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredDetail }
     *     
     */
    public void setRegisteredDetail(RegisteredDetail value) {
        this.registeredDetail = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryCode }
     *     
     */
    public IndustryCode getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryCode }
     *     
     */
    public void setIndustryCode(IndustryCode value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the activitiesAndOperations property.
     * 
     * @return
     *     possible object is
     *     {@link ActivitiesAndOperations }
     *     
     */
    public ActivitiesAndOperations getActivitiesAndOperations() {
        return activitiesAndOperations;
    }

    /**
     * Sets the value of the activitiesAndOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitiesAndOperations }
     *     
     */
    public void setActivitiesAndOperations(ActivitiesAndOperations value) {
        this.activitiesAndOperations = value;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * @return
     *     possible object is
     *     {@link Linkage }
     *     
     */
    public Linkage getLinkage() {
        return linkage;
    }

    /**
     * Sets the value of the linkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkage }
     *     
     */
    public void setLinkage(Linkage value) {
        this.linkage = value;
    }

    /**
     * Gets the value of the assessment property.
     * 
     * @return
     *     possible object is
     *     {@link Assessment }
     *     
     */
    public Assessment getAssessment() {
        return assessment;
    }

    /**
     * Sets the value of the assessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assessment }
     *     
     */
    public void setAssessment(Assessment value) {
        this.assessment = value;
    }

    /**
     * Gets the value of the financialRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRelationship }
     *     
     */
    public FinancialRelationship getFinancialRelationship() {
        return financialRelationship;
    }

    /**
     * Sets the value of the financialRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRelationship }
     *     
     */
    public void setFinancialRelationship(FinancialRelationship value) {
        this.financialRelationship = value;
    }

    /**
     * Gets the value of the borrowerAnalytics property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerAnalytics }
     *     
     */
    public BorrowerAnalytics getBorrowerAnalytics() {
        return borrowerAnalytics;
    }

    /**
     * Sets the value of the borrowerAnalytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerAnalytics }
     *     
     */
    public void setBorrowerAnalytics(BorrowerAnalytics value) {
        this.borrowerAnalytics = value;
    }

}
