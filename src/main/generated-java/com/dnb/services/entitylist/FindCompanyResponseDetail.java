
package com.dnb.services.entitylist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindCompanyResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompanyResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CandidateReturnedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FindCandidate" type="{http://services.dnb.com/EntityListServiceV2.0}SearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NavigatorDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SalesNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SalesNavigatorRange" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SalesNavigatorLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *                                       &lt;element name="SalesNavigatorHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *                                       &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ConsolidatedEmployeeQuantityNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ConsolidatedEmployeeQuantityRange" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ConsolidatedEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="ConsolidatedEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IndividualEmployeeQuantityNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IndividualEmployeeQuantityRange" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IndividualEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="IndividualEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LocationNavigatorDetail" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorDetailType" minOccurs="0"/>
 *                   &lt;element name="IndustryNavigatorDetail" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryNavigatorDetailType" minOccurs="0"/>
 *                   &lt;element name="FamilyTreeMemberRoleNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/EntityListServiceV2.0}FamilyTreeMemberRole"/>
 *                                       &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StandaloneOrganizationNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ControlOwnershipTypeNavigatorSpecification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ControlOwnershipType" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ControlOwnershipTypeText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *                                       &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PubliclyTradedCompanyNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/EntityListServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompanyResponseDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "candidateMatchedQuantity",
    "candidateReturnedQuantity",
    "findCandidate",
    "navigatorDetail",
    "inquiryReferenceDetail"
})
public class FindCompanyResponseDetail {

    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "CandidateReturnedQuantity")
    protected Integer candidateReturnedQuantity;
    @XmlElement(name = "FindCandidate")
    protected List<SearchResult> findCandidate;
    @XmlElement(name = "NavigatorDetail")
    protected FindCompanyResponseDetail.NavigatorDetail navigatorDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the candidateMatchedQuantity property.
     * 
     */
    public int getCandidateMatchedQuantity() {
        return candidateMatchedQuantity;
    }

    /**
     * Sets the value of the candidateMatchedQuantity property.
     * 
     */
    public void setCandidateMatchedQuantity(int value) {
        this.candidateMatchedQuantity = value;
    }

    /**
     * Gets the value of the candidateReturnedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCandidateReturnedQuantity() {
        return candidateReturnedQuantity;
    }

    /**
     * Sets the value of the candidateReturnedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateReturnedQuantity(Integer value) {
        this.candidateReturnedQuantity = value;
    }

    /**
     * Gets the value of the findCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the findCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFindCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResult }
     * 
     * 
     */
    public List<SearchResult> getFindCandidate() {
        if (findCandidate == null) {
            findCandidate = new ArrayList<SearchResult>();
        }
        return this.findCandidate;
    }

    /**
     * Gets the value of the navigatorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompanyResponseDetail.NavigatorDetail }
     *     
     */
    public FindCompanyResponseDetail.NavigatorDetail getNavigatorDetail() {
        return navigatorDetail;
    }

    /**
     * Sets the value of the navigatorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompanyResponseDetail.NavigatorDetail }
     *     
     */
    public void setNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail value) {
        this.navigatorDetail = value;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }

    /**
     * Sets the value of the inquiryReferenceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public void setInquiryReferenceDetail(InquiryReferenceDetail value) {
        this.inquiryReferenceDetail = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SalesNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SalesNavigatorRange" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SalesNavigatorLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
     *                             &lt;element name="SalesNavigatorHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
     *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ConsolidatedEmployeeQuantityNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ConsolidatedEmployeeQuantityRange" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ConsolidatedEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="ConsolidatedEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IndividualEmployeeQuantityNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IndividualEmployeeQuantityRange" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IndividualEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="IndividualEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocationNavigatorDetail" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorDetailType" minOccurs="0"/>
     *         &lt;element name="IndustryNavigatorDetail" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryNavigatorDetailType" minOccurs="0"/>
     *         &lt;element name="FamilyTreeMemberRoleNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/EntityListServiceV2.0}FamilyTreeMemberRole"/>
     *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StandaloneOrganizationNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ControlOwnershipTypeNavigatorSpecification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ControlOwnershipType" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ControlOwnershipTypeText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
     *                             &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PubliclyTradedCompanyNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "salesNavigatorDetail",
        "consolidatedEmployeeQuantityNavigatorDetail",
        "individualEmployeeQuantityNavigatorDetail",
        "locationNavigatorDetail",
        "industryNavigatorDetail",
        "familyTreeMemberRoleNavigatorDetail",
        "standaloneOrganizationNavigatorDetail",
        "controlOwnershipTypeNavigatorSpecification",
        "upwardFamilyMemberPubliclyTradedCompanyNavigatorDetail",
        "publiclyTradedCompanyNavigatorDetail"
    })
    public static class NavigatorDetail {

        @XmlElement(name = "SalesNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail salesNavigatorDetail;
        @XmlElement(name = "ConsolidatedEmployeeQuantityNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail consolidatedEmployeeQuantityNavigatorDetail;
        @XmlElement(name = "IndividualEmployeeQuantityNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail individualEmployeeQuantityNavigatorDetail;
        @XmlElement(name = "LocationNavigatorDetail")
        protected LocationNavigatorDetailType locationNavigatorDetail;
        @XmlElement(name = "IndustryNavigatorDetail")
        protected IndustryNavigatorDetailType industryNavigatorDetail;
        @XmlElement(name = "FamilyTreeMemberRoleNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail familyTreeMemberRoleNavigatorDetail;
        @XmlElement(name = "StandaloneOrganizationNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail standaloneOrganizationNavigatorDetail;
        @XmlElement(name = "ControlOwnershipTypeNavigatorSpecification")
        protected FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification controlOwnershipTypeNavigatorSpecification;
        @XmlElement(name = "UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail upwardFamilyMemberPubliclyTradedCompanyNavigatorDetail;
        @XmlElement(name = "PubliclyTradedCompanyNavigatorDetail")
        protected FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail publiclyTradedCompanyNavigatorDetail;

        /**
         * Gets the value of the salesNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail getSalesNavigatorDetail() {
            return salesNavigatorDetail;
        }

        /**
         * Sets the value of the salesNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail }
         *     
         */
        public void setSalesNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail value) {
            this.salesNavigatorDetail = value;
        }

        /**
         * Gets the value of the consolidatedEmployeeQuantityNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail getConsolidatedEmployeeQuantityNavigatorDetail() {
            return consolidatedEmployeeQuantityNavigatorDetail;
        }

        /**
         * Sets the value of the consolidatedEmployeeQuantityNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail }
         *     
         */
        public void setConsolidatedEmployeeQuantityNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail value) {
            this.consolidatedEmployeeQuantityNavigatorDetail = value;
        }

        /**
         * Gets the value of the individualEmployeeQuantityNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail getIndividualEmployeeQuantityNavigatorDetail() {
            return individualEmployeeQuantityNavigatorDetail;
        }

        /**
         * Sets the value of the individualEmployeeQuantityNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail }
         *     
         */
        public void setIndividualEmployeeQuantityNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail value) {
            this.individualEmployeeQuantityNavigatorDetail = value;
        }

        /**
         * Gets the value of the locationNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link LocationNavigatorDetailType }
         *     
         */
        public LocationNavigatorDetailType getLocationNavigatorDetail() {
            return locationNavigatorDetail;
        }

        /**
         * Sets the value of the locationNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationNavigatorDetailType }
         *     
         */
        public void setLocationNavigatorDetail(LocationNavigatorDetailType value) {
            this.locationNavigatorDetail = value;
        }

        /**
         * Gets the value of the industryNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link IndustryNavigatorDetailType }
         *     
         */
        public IndustryNavigatorDetailType getIndustryNavigatorDetail() {
            return industryNavigatorDetail;
        }

        /**
         * Sets the value of the industryNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndustryNavigatorDetailType }
         *     
         */
        public void setIndustryNavigatorDetail(IndustryNavigatorDetailType value) {
            this.industryNavigatorDetail = value;
        }

        /**
         * Gets the value of the familyTreeMemberRoleNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail getFamilyTreeMemberRoleNavigatorDetail() {
            return familyTreeMemberRoleNavigatorDetail;
        }

        /**
         * Sets the value of the familyTreeMemberRoleNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail }
         *     
         */
        public void setFamilyTreeMemberRoleNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail value) {
            this.familyTreeMemberRoleNavigatorDetail = value;
        }

        /**
         * Gets the value of the standaloneOrganizationNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail getStandaloneOrganizationNavigatorDetail() {
            return standaloneOrganizationNavigatorDetail;
        }

        /**
         * Sets the value of the standaloneOrganizationNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail }
         *     
         */
        public void setStandaloneOrganizationNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.StandaloneOrganizationNavigatorDetail value) {
            this.standaloneOrganizationNavigatorDetail = value;
        }

        /**
         * Gets the value of the controlOwnershipTypeNavigatorSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification getControlOwnershipTypeNavigatorSpecification() {
            return controlOwnershipTypeNavigatorSpecification;
        }

        /**
         * Sets the value of the controlOwnershipTypeNavigatorSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification }
         *     
         */
        public void setControlOwnershipTypeNavigatorSpecification(FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification value) {
            this.controlOwnershipTypeNavigatorSpecification = value;
        }

        /**
         * Gets the value of the upwardFamilyMemberPubliclyTradedCompanyNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail getUpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail() {
            return upwardFamilyMemberPubliclyTradedCompanyNavigatorDetail;
        }

        /**
         * Sets the value of the upwardFamilyMemberPubliclyTradedCompanyNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail }
         *     
         */
        public void setUpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail value) {
            this.upwardFamilyMemberPubliclyTradedCompanyNavigatorDetail = value;
        }

        /**
         * Gets the value of the publiclyTradedCompanyNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail }
         *     
         */
        public FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail getPubliclyTradedCompanyNavigatorDetail() {
            return publiclyTradedCompanyNavigatorDetail;
        }

        /**
         * Sets the value of the publiclyTradedCompanyNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail }
         *     
         */
        public void setPubliclyTradedCompanyNavigatorDetail(FindCompanyResponseDetail.NavigatorDetail.PubliclyTradedCompanyNavigatorDetail value) {
            this.publiclyTradedCompanyNavigatorDetail = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ConsolidatedEmployeeQuantityRange" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ConsolidatedEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="ConsolidatedEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "consolidatedEmployeeQuantityRange"
        })
        public static class ConsolidatedEmployeeQuantityNavigatorDetail {

            @XmlElement(name = "ConsolidatedEmployeeQuantityRange")
            protected List<FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange> consolidatedEmployeeQuantityRange;

            /**
             * Gets the value of the consolidatedEmployeeQuantityRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the consolidatedEmployeeQuantityRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConsolidatedEmployeeQuantityRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange }
             * 
             * 
             */
            public List<FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange> getConsolidatedEmployeeQuantityRange() {
                if (consolidatedEmployeeQuantityRange == null) {
                    consolidatedEmployeeQuantityRange = new ArrayList<FindCompanyResponseDetail.NavigatorDetail.ConsolidatedEmployeeQuantityNavigatorDetail.ConsolidatedEmployeeQuantityRange>();
                }
                return this.consolidatedEmployeeQuantityRange;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ConsolidatedEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="ConsolidatedEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "consolidatedEmployeeLowRangeQuantity",
                "consolidatedEmployeeHighRangeQuantity",
                "candidateMatchedQuantity"
            })
            public static class ConsolidatedEmployeeQuantityRange {

                @XmlElement(name = "ConsolidatedEmployeeLowRangeQuantity")
                protected BigInteger consolidatedEmployeeLowRangeQuantity;
                @XmlElement(name = "ConsolidatedEmployeeHighRangeQuantity")
                protected BigInteger consolidatedEmployeeHighRangeQuantity;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

                /**
                 * Gets the value of the consolidatedEmployeeLowRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getConsolidatedEmployeeLowRangeQuantity() {
                    return consolidatedEmployeeLowRangeQuantity;
                }

                /**
                 * Sets the value of the consolidatedEmployeeLowRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setConsolidatedEmployeeLowRangeQuantity(BigInteger value) {
                    this.consolidatedEmployeeLowRangeQuantity = value;
                }

                /**
                 * Gets the value of the consolidatedEmployeeHighRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getConsolidatedEmployeeHighRangeQuantity() {
                    return consolidatedEmployeeHighRangeQuantity;
                }

                /**
                 * Sets the value of the consolidatedEmployeeHighRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setConsolidatedEmployeeHighRangeQuantity(BigInteger value) {
                    this.consolidatedEmployeeHighRangeQuantity = value;
                }

                /**
                 * Gets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public int getCandidateMatchedQuantity() {
                    return candidateMatchedQuantity;
                }

                /**
                 * Sets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public void setCandidateMatchedQuantity(int value) {
                    this.candidateMatchedQuantity = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ControlOwnershipType" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ControlOwnershipTypeText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
         *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "controlOwnershipType"
        })
        public static class ControlOwnershipTypeNavigatorSpecification {

            @XmlElement(name = "ControlOwnershipType")
            protected List<FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType> controlOwnershipType;

            /**
             * Gets the value of the controlOwnershipType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the controlOwnershipType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getControlOwnershipType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType }
             * 
             * 
             */
            public List<FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType> getControlOwnershipType() {
                if (controlOwnershipType == null) {
                    controlOwnershipType = new ArrayList<FindCompanyResponseDetail.NavigatorDetail.ControlOwnershipTypeNavigatorSpecification.ControlOwnershipType>();
                }
                return this.controlOwnershipType;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ControlOwnershipTypeText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
             *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "controlOwnershipTypeText",
                "candidateMatchedQuantity"
            })
            public static class ControlOwnershipType {

                @XmlElement(name = "ControlOwnershipTypeText")
                protected DNBDecodedStringType controlOwnershipTypeText;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

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
                 * Gets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public int getCandidateMatchedQuantity() {
                    return candidateMatchedQuantity;
                }

                /**
                 * Sets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public void setCandidateMatchedQuantity(int value) {
                    this.candidateMatchedQuantity = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FamilyTreeMemberRole" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/EntityListServiceV2.0}FamilyTreeMemberRole"/>
         *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "familyTreeMemberRole"
        })
        public static class FamilyTreeMemberRoleNavigatorDetail {

            @XmlElement(name = "FamilyTreeMemberRole")
            protected List<FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole> familyTreeMemberRole;

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
             * {@link FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole }
             * 
             * 
             */
            public List<FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole> getFamilyTreeMemberRole() {
                if (familyTreeMemberRole == null) {
                    familyTreeMemberRole = new ArrayList<FindCompanyResponseDetail.NavigatorDetail.FamilyTreeMemberRoleNavigatorDetail.FamilyTreeMemberRole>();
                }
                return this.familyTreeMemberRole;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="FamilyTreeMemberRole" type="{http://services.dnb.com/EntityListServiceV2.0}FamilyTreeMemberRole"/>
             *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "familyTreeMemberRole",
                "candidateMatchedQuantity"
            })
            public static class FamilyTreeMemberRole {

                @XmlElement(name = "FamilyTreeMemberRole", required = true)
                protected com.dnb.services.entitylist.FamilyTreeMemberRole familyTreeMemberRole;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

                /**
                 * Gets the value of the familyTreeMemberRole property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link com.dnb.services.entitylist.FamilyTreeMemberRole }
                 *     
                 */
                public com.dnb.services.entitylist.FamilyTreeMemberRole getFamilyTreeMemberRole() {
                    return familyTreeMemberRole;
                }

                /**
                 * Sets the value of the familyTreeMemberRole property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link com.dnb.services.entitylist.FamilyTreeMemberRole }
                 *     
                 */
                public void setFamilyTreeMemberRole(com.dnb.services.entitylist.FamilyTreeMemberRole value) {
                    this.familyTreeMemberRole = value;
                }

                /**
                 * Gets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public int getCandidateMatchedQuantity() {
                    return candidateMatchedQuantity;
                }

                /**
                 * Sets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public void setCandidateMatchedQuantity(int value) {
                    this.candidateMatchedQuantity = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="IndividualEmployeeQuantityRange" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IndividualEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="IndividualEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "individualEmployeeQuantityRange"
        })
        public static class IndividualEmployeeQuantityNavigatorDetail {

            @XmlElement(name = "IndividualEmployeeQuantityRange")
            protected List<FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange> individualEmployeeQuantityRange;

            /**
             * Gets the value of the individualEmployeeQuantityRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the individualEmployeeQuantityRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndividualEmployeeQuantityRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange }
             * 
             * 
             */
            public List<FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange> getIndividualEmployeeQuantityRange() {
                if (individualEmployeeQuantityRange == null) {
                    individualEmployeeQuantityRange = new ArrayList<FindCompanyResponseDetail.NavigatorDetail.IndividualEmployeeQuantityNavigatorDetail.IndividualEmployeeQuantityRange>();
                }
                return this.individualEmployeeQuantityRange;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="IndividualEmployeeLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="IndividualEmployeeHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "individualEmployeeLowRangeQuantity",
                "individualEmployeeHighRangeQuantity",
                "candidateMatchedQuantity"
            })
            public static class IndividualEmployeeQuantityRange {

                @XmlElement(name = "IndividualEmployeeLowRangeQuantity")
                protected BigInteger individualEmployeeLowRangeQuantity;
                @XmlElement(name = "IndividualEmployeeHighRangeQuantity")
                protected BigInteger individualEmployeeHighRangeQuantity;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

                /**
                 * Gets the value of the individualEmployeeLowRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIndividualEmployeeLowRangeQuantity() {
                    return individualEmployeeLowRangeQuantity;
                }

                /**
                 * Sets the value of the individualEmployeeLowRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIndividualEmployeeLowRangeQuantity(BigInteger value) {
                    this.individualEmployeeLowRangeQuantity = value;
                }

                /**
                 * Gets the value of the individualEmployeeHighRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIndividualEmployeeHighRangeQuantity() {
                    return individualEmployeeHighRangeQuantity;
                }

                /**
                 * Sets the value of the individualEmployeeHighRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIndividualEmployeeHighRangeQuantity(BigInteger value) {
                    this.individualEmployeeHighRangeQuantity = value;
                }

                /**
                 * Gets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public int getCandidateMatchedQuantity() {
                    return candidateMatchedQuantity;
                }

                /**
                 * Sets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public void setCandidateMatchedQuantity(int value) {
                    this.candidateMatchedQuantity = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "candidateMatchedQuantity"
        })
        public static class PubliclyTradedCompanyNavigatorDetail {

            @XmlElement(name = "CandidateMatchedQuantity")
            protected int candidateMatchedQuantity;

            /**
             * Gets the value of the candidateMatchedQuantity property.
             * 
             */
            public int getCandidateMatchedQuantity() {
                return candidateMatchedQuantity;
            }

            /**
             * Sets the value of the candidateMatchedQuantity property.
             * 
             */
            public void setCandidateMatchedQuantity(int value) {
                this.candidateMatchedQuantity = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SalesNavigatorRange" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SalesNavigatorLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
         *                   &lt;element name="SalesNavigatorHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
         *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "salesNavigatorRange"
        })
        public static class SalesNavigatorDetail {

            @XmlElement(name = "SalesNavigatorRange")
            protected List<FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange> salesNavigatorRange;

            /**
             * Gets the value of the salesNavigatorRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the salesNavigatorRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSalesNavigatorRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange }
             * 
             * 
             */
            public List<FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange> getSalesNavigatorRange() {
                if (salesNavigatorRange == null) {
                    salesNavigatorRange = new ArrayList<FindCompanyResponseDetail.NavigatorDetail.SalesNavigatorDetail.SalesNavigatorRange>();
                }
                return this.salesNavigatorRange;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SalesNavigatorLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
             *         &lt;element name="SalesNavigatorHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
             *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "salesNavigatorLowRangeAmount",
                "salesNavigatorHighRangeAmount",
                "candidateMatchedQuantity"
            })
            public static class SalesNavigatorRange {

                @XmlElement(name = "SalesNavigatorLowRangeAmount")
                protected AmountType salesNavigatorLowRangeAmount;
                @XmlElement(name = "SalesNavigatorHighRangeAmount")
                protected AmountType salesNavigatorHighRangeAmount;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

                /**
                 * Gets the value of the salesNavigatorLowRangeAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getSalesNavigatorLowRangeAmount() {
                    return salesNavigatorLowRangeAmount;
                }

                /**
                 * Sets the value of the salesNavigatorLowRangeAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setSalesNavigatorLowRangeAmount(AmountType value) {
                    this.salesNavigatorLowRangeAmount = value;
                }

                /**
                 * Gets the value of the salesNavigatorHighRangeAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getSalesNavigatorHighRangeAmount() {
                    return salesNavigatorHighRangeAmount;
                }

                /**
                 * Sets the value of the salesNavigatorHighRangeAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setSalesNavigatorHighRangeAmount(AmountType value) {
                    this.salesNavigatorHighRangeAmount = value;
                }

                /**
                 * Gets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public int getCandidateMatchedQuantity() {
                    return candidateMatchedQuantity;
                }

                /**
                 * Sets the value of the candidateMatchedQuantity property.
                 * 
                 */
                public void setCandidateMatchedQuantity(int value) {
                    this.candidateMatchedQuantity = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "candidateMatchedQuantity"
        })
        public static class StandaloneOrganizationNavigatorDetail {

            @XmlElement(name = "CandidateMatchedQuantity")
            protected int candidateMatchedQuantity;

            /**
             * Gets the value of the candidateMatchedQuantity property.
             * 
             */
            public int getCandidateMatchedQuantity() {
                return candidateMatchedQuantity;
            }

            /**
             * Sets the value of the candidateMatchedQuantity property.
             * 
             */
            public void setCandidateMatchedQuantity(int value) {
                this.candidateMatchedQuantity = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "candidateMatchedQuantity"
        })
        public static class UpwardFamilyMemberPubliclyTradedCompanyNavigatorDetail {

            @XmlElement(name = "CandidateMatchedQuantity")
            protected int candidateMatchedQuantity;

            /**
             * Gets the value of the candidateMatchedQuantity property.
             * 
             */
            public int getCandidateMatchedQuantity() {
                return candidateMatchedQuantity;
            }

            /**
             * Sets the value of the candidateMatchedQuantity property.
             * 
             */
            public void setCandidateMatchedQuantity(int value) {
                this.candidateMatchedQuantity = value;
            }

        }

    }

}
