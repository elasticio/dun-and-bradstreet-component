
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindContactRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindContactRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/EntityListServiceV2.0}SearchContactInquiryDetail"/>
 *         &lt;element name="FindSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}SearchContactSpecification" minOccurs="0"/>
 *         &lt;element name="NavigatorSpecification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReturnJobTitleNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ReturnManagementResponsibilityCodeNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ReturnLocationNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="LocationNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorSpecificationType" minOccurs="0"/>
 *                   &lt;element name="ReturnIndustryNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="IndustryNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryNavigatorSpecificationType" minOccurs="0"/>
 *                   &lt;element name="ReturnContactDataNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "FindContactRequestDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inquiryDetail",
    "findSpecification",
    "navigatorSpecification",
    "inquiryReferenceDetail"
})
public class FindContactRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected SearchContactInquiryDetail inquiryDetail;
    @XmlElement(name = "FindSpecification")
    protected SearchContactSpecification findSpecification;
    @XmlElement(name = "NavigatorSpecification")
    protected FindContactRequestDetail.NavigatorSpecification navigatorSpecification;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchContactInquiryDetail }
     *     
     */
    public SearchContactInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchContactInquiryDetail }
     *     
     */
    public void setInquiryDetail(SearchContactInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the findSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link SearchContactSpecification }
     *     
     */
    public SearchContactSpecification getFindSpecification() {
        return findSpecification;
    }

    /**
     * Sets the value of the findSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchContactSpecification }
     *     
     */
    public void setFindSpecification(SearchContactSpecification value) {
        this.findSpecification = value;
    }

    /**
     * Gets the value of the navigatorSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FindContactRequestDetail.NavigatorSpecification }
     *     
     */
    public FindContactRequestDetail.NavigatorSpecification getNavigatorSpecification() {
        return navigatorSpecification;
    }

    /**
     * Sets the value of the navigatorSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindContactRequestDetail.NavigatorSpecification }
     *     
     */
    public void setNavigatorSpecification(FindContactRequestDetail.NavigatorSpecification value) {
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
     *         &lt;element name="ReturnJobTitleNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ReturnManagementResponsibilityCodeNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ReturnLocationNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="LocationNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorSpecificationType" minOccurs="0"/>
     *         &lt;element name="ReturnIndustryNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="IndustryNavigatorSpecification" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryNavigatorSpecificationType" minOccurs="0"/>
     *         &lt;element name="ReturnContactDataNavigatorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "returnJobTitleNavigatorIndicator",
        "returnManagementResponsibilityCodeNavigatorIndicator",
        "returnLocationNavigatorIndicator",
        "locationNavigatorSpecification",
        "returnIndustryNavigatorIndicator",
        "industryNavigatorSpecification",
        "returnContactDataNavigatorIndicator"
    })
    public static class NavigatorSpecification {

        @XmlElement(name = "ReturnJobTitleNavigatorIndicator")
        protected Boolean returnJobTitleNavigatorIndicator;
        @XmlElement(name = "ReturnManagementResponsibilityCodeNavigatorIndicator")
        protected Boolean returnManagementResponsibilityCodeNavigatorIndicator;
        @XmlElement(name = "ReturnLocationNavigatorIndicator")
        protected Boolean returnLocationNavigatorIndicator;
        @XmlElement(name = "LocationNavigatorSpecification")
        protected LocationNavigatorSpecificationType locationNavigatorSpecification;
        @XmlElement(name = "ReturnIndustryNavigatorIndicator")
        protected Boolean returnIndustryNavigatorIndicator;
        @XmlElement(name = "IndustryNavigatorSpecification")
        protected IndustryNavigatorSpecificationType industryNavigatorSpecification;
        @XmlElement(name = "ReturnContactDataNavigatorIndicator")
        protected Boolean returnContactDataNavigatorIndicator;

        /**
         * Gets the value of the returnJobTitleNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnJobTitleNavigatorIndicator() {
            return returnJobTitleNavigatorIndicator;
        }

        /**
         * Sets the value of the returnJobTitleNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnJobTitleNavigatorIndicator(Boolean value) {
            this.returnJobTitleNavigatorIndicator = value;
        }

        /**
         * Gets the value of the returnManagementResponsibilityCodeNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnManagementResponsibilityCodeNavigatorIndicator() {
            return returnManagementResponsibilityCodeNavigatorIndicator;
        }

        /**
         * Sets the value of the returnManagementResponsibilityCodeNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnManagementResponsibilityCodeNavigatorIndicator(Boolean value) {
            this.returnManagementResponsibilityCodeNavigatorIndicator = value;
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
         * Gets the value of the returnContactDataNavigatorIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnContactDataNavigatorIndicator() {
            return returnContactDataNavigatorIndicator;
        }

        /**
         * Sets the value of the returnContactDataNavigatorIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnContactDataNavigatorIndicator(Boolean value) {
            this.returnContactDataNavigatorIndicator = value;
        }

    }

}
