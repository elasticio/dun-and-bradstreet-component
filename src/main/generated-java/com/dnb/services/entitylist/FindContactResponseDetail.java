
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindContactResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindContactResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMatchedQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CandidateReturnedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FindCandidate" type="{http://services.dnb.com/EntityListServiceV2.0}SearchContactResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NavigatorDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ManagementResponsibilityCodeNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ManagementResponsibilityCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ManagementResponsibilityCodeText">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>ManagementResponsibilityCodeTextType">
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CandidateMatchedQuantity">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="JobTitleNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}JobTitle">
 *                                     &lt;sequence>
 *                                       &lt;element name="CandidateMatchedQuantity">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
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
 *                   &lt;element name="ContactDataNavigatorDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactData" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ContactDataType" type="{http://services.dnb.com/EntityListServiceV2.0}ContactDataTypeEnum"/>
 *                                       &lt;element name="CandidateMatchedQuantity">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
@XmlType(name = "FindContactResponseDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "candidateMatchedQuantity",
    "candidateReturnedQuantity",
    "findCandidate",
    "navigatorDetail",
    "inquiryReferenceDetail"
})
public class FindContactResponseDetail {

    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "CandidateReturnedQuantity")
    protected Integer candidateReturnedQuantity;
    @XmlElement(name = "FindCandidate")
    protected List<SearchContactResult> findCandidate;
    @XmlElement(name = "NavigatorDetail")
    protected FindContactResponseDetail.NavigatorDetail navigatorDetail;
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
     * {@link SearchContactResult }
     * 
     * 
     */
    public List<SearchContactResult> getFindCandidate() {
        if (findCandidate == null) {
            findCandidate = new ArrayList<SearchContactResult>();
        }
        return this.findCandidate;
    }

    /**
     * Gets the value of the navigatorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindContactResponseDetail.NavigatorDetail }
     *     
     */
    public FindContactResponseDetail.NavigatorDetail getNavigatorDetail() {
        return navigatorDetail;
    }

    /**
     * Sets the value of the navigatorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindContactResponseDetail.NavigatorDetail }
     *     
     */
    public void setNavigatorDetail(FindContactResponseDetail.NavigatorDetail value) {
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
     *         &lt;element name="ManagementResponsibilityCodeNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ManagementResponsibilityCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ManagementResponsibilityCodeText">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>ManagementResponsibilityCodeTextType">
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CandidateMatchedQuantity">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *         &lt;element name="JobTitleNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}JobTitle">
     *                           &lt;sequence>
     *                             &lt;element name="CandidateMatchedQuantity">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/extension>
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
     *         &lt;element name="ContactDataNavigatorDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactData" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ContactDataType" type="{http://services.dnb.com/EntityListServiceV2.0}ContactDataTypeEnum"/>
     *                             &lt;element name="CandidateMatchedQuantity">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
        "managementResponsibilityCodeNavigatorDetail",
        "jobTitleNavigatorDetail",
        "locationNavigatorDetail",
        "industryNavigatorDetail",
        "contactDataNavigatorDetail"
    })
    public static class NavigatorDetail {

        @XmlElement(name = "ManagementResponsibilityCodeNavigatorDetail")
        protected FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail managementResponsibilityCodeNavigatorDetail;
        @XmlElement(name = "JobTitleNavigatorDetail")
        protected FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail jobTitleNavigatorDetail;
        @XmlElement(name = "LocationNavigatorDetail")
        protected LocationNavigatorDetailType locationNavigatorDetail;
        @XmlElement(name = "IndustryNavigatorDetail")
        protected IndustryNavigatorDetailType industryNavigatorDetail;
        @XmlElement(name = "ContactDataNavigatorDetail")
        protected FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail contactDataNavigatorDetail;

        /**
         * Gets the value of the managementResponsibilityCodeNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail }
         *     
         */
        public FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail getManagementResponsibilityCodeNavigatorDetail() {
            return managementResponsibilityCodeNavigatorDetail;
        }

        /**
         * Sets the value of the managementResponsibilityCodeNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail }
         *     
         */
        public void setManagementResponsibilityCodeNavigatorDetail(FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail value) {
            this.managementResponsibilityCodeNavigatorDetail = value;
        }

        /**
         * Gets the value of the jobTitleNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail }
         *     
         */
        public FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail getJobTitleNavigatorDetail() {
            return jobTitleNavigatorDetail;
        }

        /**
         * Sets the value of the jobTitleNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail }
         *     
         */
        public void setJobTitleNavigatorDetail(FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail value) {
            this.jobTitleNavigatorDetail = value;
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
         * Gets the value of the contactDataNavigatorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail }
         *     
         */
        public FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail getContactDataNavigatorDetail() {
            return contactDataNavigatorDetail;
        }

        /**
         * Sets the value of the contactDataNavigatorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail }
         *     
         */
        public void setContactDataNavigatorDetail(FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail value) {
            this.contactDataNavigatorDetail = value;
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
         *         &lt;element name="ContactData" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ContactDataType" type="{http://services.dnb.com/EntityListServiceV2.0}ContactDataTypeEnum"/>
         *                   &lt;element name="CandidateMatchedQuantity">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "contactData"
        })
        public static class ContactDataNavigatorDetail {

            @XmlElement(name = "ContactData")
            protected List<FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData> contactData;

            /**
             * Gets the value of the contactData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contactData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContactData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData }
             * 
             * 
             */
            public List<FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData> getContactData() {
                if (contactData == null) {
                    contactData = new ArrayList<FindContactResponseDetail.NavigatorDetail.ContactDataNavigatorDetail.ContactData>();
                }
                return this.contactData;
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
             *         &lt;element name="ContactDataType" type="{http://services.dnb.com/EntityListServiceV2.0}ContactDataTypeEnum"/>
             *         &lt;element name="CandidateMatchedQuantity">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "contactDataType",
                "candidateMatchedQuantity"
            })
            public static class ContactData {

                @XmlElement(name = "ContactDataType", required = true)
                @XmlSchemaType(name = "string")
                protected ContactDataTypeEnum contactDataType;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

                /**
                 * Gets the value of the contactDataType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ContactDataTypeEnum }
                 *     
                 */
                public ContactDataTypeEnum getContactDataType() {
                    return contactDataType;
                }

                /**
                 * Sets the value of the contactDataType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ContactDataTypeEnum }
                 *     
                 */
                public void setContactDataType(ContactDataTypeEnum value) {
                    this.contactDataType = value;
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
         *         &lt;element name="JobTitle" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}JobTitle">
         *                 &lt;sequence>
         *                   &lt;element name="CandidateMatchedQuantity">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "jobTitle"
        })
        public static class JobTitleNavigatorDetail {

            @XmlElement(name = "JobTitle")
            protected List<FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle> jobTitle;

            /**
             * Gets the value of the jobTitle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJobTitle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle }
             * 
             * 
             */
            public List<FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle> getJobTitle() {
                if (jobTitle == null) {
                    jobTitle = new ArrayList<FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle>();
                }
                return this.jobTitle;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}JobTitle">
             *       &lt;sequence>
             *         &lt;element name="CandidateMatchedQuantity">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/extension>
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
            public static class JobTitle
                extends com.dnb.services.entitylist.JobTitle
            {

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
         *         &lt;element name="ManagementResponsibilityCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ManagementResponsibilityCodeText">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>ManagementResponsibilityCodeTextType">
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CandidateMatchedQuantity">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "managementResponsibilityCode"
        })
        public static class ManagementResponsibilityCodeNavigatorDetail {

            @XmlElement(name = "ManagementResponsibilityCode")
            protected List<FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode> managementResponsibilityCode;

            /**
             * Gets the value of the managementResponsibilityCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the managementResponsibilityCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getManagementResponsibilityCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode }
             * 
             * 
             */
            public List<FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode> getManagementResponsibilityCode() {
                if (managementResponsibilityCode == null) {
                    managementResponsibilityCode = new ArrayList<FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode>();
                }
                return this.managementResponsibilityCode;
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
             *         &lt;element name="ManagementResponsibilityCodeText">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>ManagementResponsibilityCodeTextType">
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CandidateMatchedQuantity">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "managementResponsibilityCodeText",
                "candidateMatchedQuantity"
            })
            public static class ManagementResponsibilityCode {

                @XmlElement(name = "ManagementResponsibilityCodeText", required = true)
                protected FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText managementResponsibilityCodeText;
                @XmlElement(name = "CandidateMatchedQuantity")
                protected int candidateMatchedQuantity;

                /**
                 * Gets the value of the managementResponsibilityCodeText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText }
                 *     
                 */
                public FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText getManagementResponsibilityCodeText() {
                    return managementResponsibilityCodeText;
                }

                /**
                 * Sets the value of the managementResponsibilityCodeText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText }
                 *     
                 */
                public void setManagementResponsibilityCodeText(FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText value) {
                    this.managementResponsibilityCodeText = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>ManagementResponsibilityCodeTextType">
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ManagementResponsibilityCodeText
                    extends ManagementResponsibilityCodeTextType
                {


                }

            }

        }

    }

}
