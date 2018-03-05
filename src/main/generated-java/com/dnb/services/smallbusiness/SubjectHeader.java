
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/SBRIProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FullReportDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateSimpleType" minOccurs="0"/>
 *         &lt;element name="InquirySummary" type="{http://services.dnb.com/SBRIProductServiceV2.0}InquirySummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostRecentInquiryDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DUNSSelfRequestIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DUNSSelfRequestDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectHeader", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "dunsNumber",
    "subjectID",
    "lastUpdateDate",
    "fullReportDate",
    "inquirySummary",
    "mostRecentInquiryDate",
    "dunsSelfRequestIndicator",
    "dunsSelfRequestDate"
})
public class SubjectHeader {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectID")
    protected String subjectID;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "FullReportDate")
    protected String fullReportDate;
    @XmlElement(name = "InquirySummary")
    protected List<InquirySummary> inquirySummary;
    @XmlElement(name = "MostRecentInquiryDate")
    protected DNBDateType mostRecentInquiryDate;
    @XmlElement(name = "DUNSSelfRequestIndicator")
    protected Boolean dunsSelfRequestIndicator;
    @XmlElement(name = "DUNSSelfRequestDate")
    protected DNBDateType dunsSelfRequestDate;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectID(String value) {
        this.subjectID = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLastUpdateDate(DNBDateType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the fullReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullReportDate() {
        return fullReportDate;
    }

    /**
     * Sets the value of the fullReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullReportDate(String value) {
        this.fullReportDate = value;
    }

    /**
     * Gets the value of the inquirySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inquirySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInquirySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InquirySummary }
     * 
     * 
     */
    public List<InquirySummary> getInquirySummary() {
        if (inquirySummary == null) {
            inquirySummary = new ArrayList<InquirySummary>();
        }
        return this.inquirySummary;
    }

    /**
     * Gets the value of the mostRecentInquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentInquiryDate() {
        return mostRecentInquiryDate;
    }

    /**
     * Sets the value of the mostRecentInquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentInquiryDate(DNBDateType value) {
        this.mostRecentInquiryDate = value;
    }

    /**
     * Gets the value of the dunsSelfRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDUNSSelfRequestIndicator() {
        return dunsSelfRequestIndicator;
    }

    /**
     * Sets the value of the dunsSelfRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDUNSSelfRequestIndicator(Boolean value) {
        this.dunsSelfRequestIndicator = value;
    }

    /**
     * Gets the value of the dunsSelfRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDUNSSelfRequestDate() {
        return dunsSelfRequestDate;
    }

    /**
     * Sets the value of the dunsSelfRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDUNSSelfRequestDate(DNBDateType value) {
        this.dunsSelfRequestDate = value;
    }

}
