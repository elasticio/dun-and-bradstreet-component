
package com.dnb.services.entitylist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindCompanyRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompanyRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/EntityListServiceV2.0}SearchInquiryDetail"/>
 *         &lt;element name="FindSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}SearchCompanySpecification" minOccurs="0"/>
 *         &lt;element name="NavigatorSpecification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReturnSalesNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="SalesNavigatorSpecification" minOccurs="0">
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
 *                   &lt;element name="ReturnConsolidatedEmployeeQuantityNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ConsolidatedEmployeeQuantityNavigatorSpecification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ConsolidatedEmployeeNavigatorQuantityRange" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ConsolidatedEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="ConsolidatedEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *                   &lt;element name="ReturnIndividualEmployeeQuantityNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="IndividualEmployeeQuantityNavigatorSpecification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IndividualEmployeeNavigatorRange" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IndividualEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="IndividualEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *                   &lt;element name="ReturnLocationNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="LocationNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorSpecificationType" minOccurs="0"/>
 *                   &lt;element name="ReturnIndustryNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="IndustryNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryNavigatorSpecificationType" minOccurs="0"/>
 *                   &lt;element name="ReturnFamilyTreeMemberRoleNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ReturnStandaloneOrganizationNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ReturnControlOwnershipTypeNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ReturnUpwardFamilyMemberPubliclyTradedCompanyNavigator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ReturnPubliclyTradedCompanyNavigator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "FindCompanyRequestDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inquiryDetail",
    "findSpecification",
    "navigatorSpecification",
    "inquiryReferenceDetail"
})
public class FindCompanyRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected SearchInquiryDetail inquiryDetail;
    @XmlElement(name = "FindSpecification")
    protected SearchCompanySpecification findSpecification;
    @XmlElement(name = "NavigatorSpecification")
    protected FindCompanyRequestDetail.NavigatorSpecification navigatorSpecification;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInquiryDetail }
     *     
     */
    public SearchInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInquiryDetail }
     *     
     */
    public void setInquiryDetail(SearchInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the findSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCompanySpecification }
     *     
     */
    public SearchCompanySpecification getFindSpecification() {
        return findSpecification;
    }

    /**
     * Sets the value of the findSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCompanySpecification }
     *     
     */
    public void setFindSpecification(SearchCompanySpecification value) {
        this.findSpecification = value;
    }

    /**
     * Gets the value of the navigatorSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompanyRequestDetail.NavigatorSpecification }
     *     
     */
    public FindCompanyRequestDetail.NavigatorSpecification getNavigatorSpecification() {
        return navigatorSpecification;
    }

    /**
     * Sets the value of the navigatorSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompanyRequestDetail.NavigatorSpecification }
     *     
     */
    public void setNavigatorSpecification(FindCompanyRequestDetail.NavigatorSpecification value) {
        this.navigatorSpecification = value;
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
     *         &lt;element name="ReturnSalesNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="SalesNavigatorSpecification" minOccurs="0">
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
     *         &lt;element name="ReturnConsolidatedEmployeeQuantityNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ConsolidatedEmployeeQuantityNavigatorSpecification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ConsolidatedEmployeeNavigatorQuantityRange" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ConsolidatedEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="ConsolidatedEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
     *         &lt;element name="ReturnIndividualEmployeeQuantityNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="IndividualEmployeeQuantityNavigatorSpecification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IndividualEmployeeNavigatorRange" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IndividualEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="IndividualEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
     *         &lt;element name="ReturnLocationNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="LocationNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorSpecificationType" minOccurs="0"/>
     *         &lt;element name="ReturnIndustryNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="IndustryNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryNavigatorSpecificationType" minOccurs="0"/>
     *         &lt;element name="ReturnFamilyTreeMemberRoleNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ReturnStandaloneOrganizationNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ReturnControlOwnershipTypeNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ReturnUpwardFamilyMemberPubliclyTradedCompanyNavigator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ReturnPubliclyTradedCompanyNavigator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "returnSalesNavigatorIndicator",
        "salesNavigatorSpecification",
        "returnConsolidatedEmployeeQuantityNavigatorIndicator",
        "consolidatedEmployeeQuantityNavigatorSpecification",
        "returnIndividualEmployeeQuantityNavigatorIndicator",
        "individualEmployeeQuantityNavigatorSpecification",
        "returnLocationNavigatorIndicator",
        "locationNavigatorSpecification",
        "returnIndustryNavigatorIndicator",
        "industryNavigatorSpecification",
        "returnFamilyTreeMemberRoleNavigatorIndicator",
        "returnStandaloneOrganizationNavigatorIndicator",
        "returnControlOwnershipTypeNavigatorIndicator",
        "returnUpwardFamilyMemberPubliclyTradedCompanyNavigator",
        "returnPubliclyTradedCompanyNavigator"
    })
    public static class NavigatorSpecification {

        @XmlElement(name = "ReturnSalesNavigatorIndicator")
        protected Boolean returnSalesNavigatorIndicator;
        @XmlElement(name = "SalesNavigatorSpecification")
        protected FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification salesNavigatorSpecification;
        @XmlElement(name = "ReturnConsolidatedEmployeeQuantityNavigatorIndicator")
        protected Boolean returnConsolidatedEmployeeQuantityNavigatorIndicator;
        @XmlElement(name = "ConsolidatedEmployeeQuantityNavigatorSpecification")
        protected FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification consolidatedEmployeeQuantityNavigatorSpecification;
        @XmlElement(name = "ReturnIndividualEmployeeQuantityNavigatorIndicator")
        protected Boolean returnIndividualEmployeeQuantityNavigatorIndicator;
        @XmlElement(name = "IndividualEmployeeQuantityNavigatorSpecification")
        protected FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification individualEmployeeQuantityNavigatorSpecification;
        @XmlElement(name = "ReturnLocationNavigatorIndicator")
        protected Boolean returnLocationNavigatorIndicator;
        @XmlElement(name = "LocationNavigatorSpecification")
        protected LocationNavigatorSpecificationType locationNavigatorSpecification;
        @XmlElement(name = "ReturnIndustryNavigatorIndicator")
        protected Boolean returnIndustryNavigatorIndicator;
        @XmlElement(name = "IndustryNavigatorSpecification")
        protected IndustryNavigatorSpecificationType industryNavigatorSpecification;
        @XmlElement(name = "ReturnFamilyTreeMemberRoleNavigatorIndicator")
        protected Boolean returnFamilyTreeMemberRoleNavigatorIndicator;
        @XmlElement(name = "ReturnStandaloneOrganizationNavigatorIndicator")
        protected Boolean returnStandaloneOrganizationNavigatorIndicator;
        @XmlElement(name = "ReturnControlOwnershipTypeNavigatorIndicator")
        protected Boolean returnControlOwnershipTypeNavigatorIndicator;
        @XmlElement(name = "ReturnUpwardFamilyMemberPubliclyTradedCompanyNavigator")
        protected Boolean returnUpwardFamilyMemberPubliclyTradedCompanyNavigator;
        @XmlElement(name = "ReturnPubliclyTradedCompanyNavigator")
        protected Boolean returnPubliclyTradedCompanyNavigator;

        /**
         * Gets the value of the returnSalesNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnSalesNavigatorIndicator() {
            return returnSalesNavigatorIndicator;
        }

        /**
         * Sets the value of the returnSalesNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnSalesNavigatorIndicator(Boolean value) {
            this.returnSalesNavigatorIndicator = value;
        }

        /**
         * Gets the value of the salesNavigatorSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification }
         *     
         */
        public FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification getSalesNavigatorSpecification() {
            return salesNavigatorSpecification;
        }

        /**
         * Sets the value of the salesNavigatorSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification }
         *     
         */
        public void setSalesNavigatorSpecification(FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification value) {
            this.salesNavigatorSpecification = value;
        }

        /**
         * Gets the value of the returnConsolidatedEmployeeQuantityNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnConsolidatedEmployeeQuantityNavigatorIndicator() {
            return returnConsolidatedEmployeeQuantityNavigatorIndicator;
        }

        /**
         * Sets the value of the returnConsolidatedEmployeeQuantityNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnConsolidatedEmployeeQuantityNavigatorIndicator(Boolean value) {
            this.returnConsolidatedEmployeeQuantityNavigatorIndicator = value;
        }

        /**
         * Gets the value of the consolidatedEmployeeQuantityNavigatorSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification }
         *     
         */
        public FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification getConsolidatedEmployeeQuantityNavigatorSpecification() {
            return consolidatedEmployeeQuantityNavigatorSpecification;
        }

        /**
         * Sets the value of the consolidatedEmployeeQuantityNavigatorSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification }
         *     
         */
        public void setConsolidatedEmployeeQuantityNavigatorSpecification(FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification value) {
            this.consolidatedEmployeeQuantityNavigatorSpecification = value;
        }

        /**
         * Gets the value of the returnIndividualEmployeeQuantityNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnIndividualEmployeeQuantityNavigatorIndicator() {
            return returnIndividualEmployeeQuantityNavigatorIndicator;
        }

        /**
         * Sets the value of the returnIndividualEmployeeQuantityNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnIndividualEmployeeQuantityNavigatorIndicator(Boolean value) {
            this.returnIndividualEmployeeQuantityNavigatorIndicator = value;
        }

        /**
         * Gets the value of the individualEmployeeQuantityNavigatorSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification }
         *     
         */
        public FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification getIndividualEmployeeQuantityNavigatorSpecification() {
            return individualEmployeeQuantityNavigatorSpecification;
        }

        /**
         * Sets the value of the individualEmployeeQuantityNavigatorSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification }
         *     
         */
        public void setIndividualEmployeeQuantityNavigatorSpecification(FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification value) {
            this.individualEmployeeQuantityNavigatorSpecification = value;
        }

        /**
         * Gets the value of the returnLocationNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnLocationNavigatorIndicator() {
            return returnLocationNavigatorIndicator;
        }

        /**
         * Sets the value of the returnLocationNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnLocationNavigatorIndicator(Boolean value) {
            this.returnLocationNavigatorIndicator = value;
        }

        /**
         * Gets the value of the locationNavigatorSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link LocationNavigatorSpecificationType }
         *     
         */
        public LocationNavigatorSpecificationType getLocationNavigatorSpecification() {
            return locationNavigatorSpecification;
        }

        /**
         * Sets the value of the locationNavigatorSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationNavigatorSpecificationType }
         *     
         */
        public void setLocationNavigatorSpecification(LocationNavigatorSpecificationType value) {
            this.locationNavigatorSpecification = value;
        }

        /**
         * Gets the value of the returnIndustryNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnIndustryNavigatorIndicator() {
            return returnIndustryNavigatorIndicator;
        }

        /**
         * Sets the value of the returnIndustryNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnIndustryNavigatorIndicator(Boolean value) {
            this.returnIndustryNavigatorIndicator = value;
        }

        /**
         * Gets the value of the industryNavigatorSpecification property.
         * 
         * @return
         *     possible object is
         *     {@link IndustryNavigatorSpecificationType }
         *     
         */
        public IndustryNavigatorSpecificationType getIndustryNavigatorSpecification() {
            return industryNavigatorSpecification;
        }

        /**
         * Sets the value of the industryNavigatorSpecification property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndustryNavigatorSpecificationType }
         *     
         */
        public void setIndustryNavigatorSpecification(IndustryNavigatorSpecificationType value) {
            this.industryNavigatorSpecification = value;
        }

        /**
         * Gets the value of the returnFamilyTreeMemberRoleNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnFamilyTreeMemberRoleNavigatorIndicator() {
            return returnFamilyTreeMemberRoleNavigatorIndicator;
        }

        /**
         * Sets the value of the returnFamilyTreeMemberRoleNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnFamilyTreeMemberRoleNavigatorIndicator(Boolean value) {
            this.returnFamilyTreeMemberRoleNavigatorIndicator = value;
        }

        /**
         * Gets the value of the returnStandaloneOrganizationNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnStandaloneOrganizationNavigatorIndicator() {
            return returnStandaloneOrganizationNavigatorIndicator;
        }

        /**
         * Sets the value of the returnStandaloneOrganizationNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnStandaloneOrganizationNavigatorIndicator(Boolean value) {
            this.returnStandaloneOrganizationNavigatorIndicator = value;
        }

        /**
         * Gets the value of the returnControlOwnershipTypeNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnControlOwnershipTypeNavigatorIndicator() {
            return returnControlOwnershipTypeNavigatorIndicator;
        }

        /**
         * Sets the value of the returnControlOwnershipTypeNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnControlOwnershipTypeNavigatorIndicator(Boolean value) {
            this.returnControlOwnershipTypeNavigatorIndicator = value;
        }

        /**
         * Gets the value of the returnUpwardFamilyMemberPubliclyTradedCompanyNavigator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnUpwardFamilyMemberPubliclyTradedCompanyNavigator() {
            return returnUpwardFamilyMemberPubliclyTradedCompanyNavigator;
        }

        /**
         * Sets the value of the returnUpwardFamilyMemberPubliclyTradedCompanyNavigator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnUpwardFamilyMemberPubliclyTradedCompanyNavigator(Boolean value) {
            this.returnUpwardFamilyMemberPubliclyTradedCompanyNavigator = value;
        }

        /**
         * Gets the value of the returnPubliclyTradedCompanyNavigator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnPubliclyTradedCompanyNavigator() {
            return returnPubliclyTradedCompanyNavigator;
        }

        /**
         * Sets the value of the returnPubliclyTradedCompanyNavigator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnPubliclyTradedCompanyNavigator(Boolean value) {
            this.returnPubliclyTradedCompanyNavigator = value;
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
         *         &lt;element name="ConsolidatedEmployeeNavigatorQuantityRange" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ConsolidatedEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="ConsolidatedEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "consolidatedEmployeeNavigatorQuantityRange"
        })
        public static class ConsolidatedEmployeeQuantityNavigatorSpecification {

            @XmlElement(name = "ConsolidatedEmployeeNavigatorQuantityRange")
            protected List<FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange> consolidatedEmployeeNavigatorQuantityRange;

            /**
             * Gets the value of the consolidatedEmployeeNavigatorQuantityRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the consolidatedEmployeeNavigatorQuantityRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConsolidatedEmployeeNavigatorQuantityRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange }
             * 
             * 
             */
            public List<FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange> getConsolidatedEmployeeNavigatorQuantityRange() {
                if (consolidatedEmployeeNavigatorQuantityRange == null) {
                    consolidatedEmployeeNavigatorQuantityRange = new ArrayList<FindCompanyRequestDetail.NavigatorSpecification.ConsolidatedEmployeeQuantityNavigatorSpecification.ConsolidatedEmployeeNavigatorQuantityRange>();
                }
                return this.consolidatedEmployeeNavigatorQuantityRange;
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
             *         &lt;element name="ConsolidatedEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="ConsolidatedEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
                "consolidatedEmployeeNavigatorLowRangeQuantity",
                "consolidatedEmployeeNavigatorHighRangeQuantity"
            })
            public static class ConsolidatedEmployeeNavigatorQuantityRange {

                @XmlElement(name = "ConsolidatedEmployeeNavigatorLowRangeQuantity")
                protected BigInteger consolidatedEmployeeNavigatorLowRangeQuantity;
                @XmlElement(name = "ConsolidatedEmployeeNavigatorHighRangeQuantity")
                protected BigInteger consolidatedEmployeeNavigatorHighRangeQuantity;

                /**
                 * Gets the value of the consolidatedEmployeeNavigatorLowRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getConsolidatedEmployeeNavigatorLowRangeQuantity() {
                    return consolidatedEmployeeNavigatorLowRangeQuantity;
                }

                /**
                 * Sets the value of the consolidatedEmployeeNavigatorLowRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setConsolidatedEmployeeNavigatorLowRangeQuantity(BigInteger value) {
                    this.consolidatedEmployeeNavigatorLowRangeQuantity = value;
                }

                /**
                 * Gets the value of the consolidatedEmployeeNavigatorHighRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getConsolidatedEmployeeNavigatorHighRangeQuantity() {
                    return consolidatedEmployeeNavigatorHighRangeQuantity;
                }

                /**
                 * Sets the value of the consolidatedEmployeeNavigatorHighRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setConsolidatedEmployeeNavigatorHighRangeQuantity(BigInteger value) {
                    this.consolidatedEmployeeNavigatorHighRangeQuantity = value;
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
         *         &lt;element name="IndividualEmployeeNavigatorRange" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IndividualEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="IndividualEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "individualEmployeeNavigatorRange"
        })
        public static class IndividualEmployeeQuantityNavigatorSpecification {

            @XmlElement(name = "IndividualEmployeeNavigatorRange")
            protected List<FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange> individualEmployeeNavigatorRange;

            /**
             * Gets the value of the individualEmployeeNavigatorRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the individualEmployeeNavigatorRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndividualEmployeeNavigatorRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange }
             * 
             * 
             */
            public List<FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange> getIndividualEmployeeNavigatorRange() {
                if (individualEmployeeNavigatorRange == null) {
                    individualEmployeeNavigatorRange = new ArrayList<FindCompanyRequestDetail.NavigatorSpecification.IndividualEmployeeQuantityNavigatorSpecification.IndividualEmployeeNavigatorRange>();
                }
                return this.individualEmployeeNavigatorRange;
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
             *         &lt;element name="IndividualEmployeeNavigatorLowRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="IndividualEmployeeNavigatorHighRangeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
                "individualEmployeeNavigatorLowRangeQuantity",
                "individualEmployeeNavigatorHighRangeQuantity"
            })
            public static class IndividualEmployeeNavigatorRange {

                @XmlElement(name = "IndividualEmployeeNavigatorLowRangeQuantity")
                protected BigInteger individualEmployeeNavigatorLowRangeQuantity;
                @XmlElement(name = "IndividualEmployeeNavigatorHighRangeQuantity")
                protected BigInteger individualEmployeeNavigatorHighRangeQuantity;

                /**
                 * Gets the value of the individualEmployeeNavigatorLowRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIndividualEmployeeNavigatorLowRangeQuantity() {
                    return individualEmployeeNavigatorLowRangeQuantity;
                }

                /**
                 * Sets the value of the individualEmployeeNavigatorLowRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIndividualEmployeeNavigatorLowRangeQuantity(BigInteger value) {
                    this.individualEmployeeNavigatorLowRangeQuantity = value;
                }

                /**
                 * Gets the value of the individualEmployeeNavigatorHighRangeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIndividualEmployeeNavigatorHighRangeQuantity() {
                    return individualEmployeeNavigatorHighRangeQuantity;
                }

                /**
                 * Sets the value of the individualEmployeeNavigatorHighRangeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIndividualEmployeeNavigatorHighRangeQuantity(BigInteger value) {
                    this.individualEmployeeNavigatorHighRangeQuantity = value;
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
         *         &lt;element name="SalesNavigatorRange" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SalesNavigatorLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
         *                   &lt;element name="SalesNavigatorHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
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
        public static class SalesNavigatorSpecification {

            @XmlElement(name = "SalesNavigatorRange")
            protected List<FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange> salesNavigatorRange;

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
             * {@link FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange }
             * 
             * 
             */
            public List<FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange> getSalesNavigatorRange() {
                if (salesNavigatorRange == null) {
                    salesNavigatorRange = new ArrayList<FindCompanyRequestDetail.NavigatorSpecification.SalesNavigatorSpecification.SalesNavigatorRange>();
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
                "salesNavigatorHighRangeAmount"
            })
            public static class SalesNavigatorRange {

                @XmlElement(name = "SalesNavigatorLowRangeAmount")
                protected AmountType salesNavigatorLowRangeAmount;
                @XmlElement(name = "SalesNavigatorHighRangeAmount")
                protected AmountType salesNavigatorHighRangeAmount;

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

            }

        }

    }

}
