
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records high level information about the subject such as the D-U-N-S Number assigned to the subject, the primary language of the subject and the primary currency in which this subject trades. When the subject is an organizantion, this will also include country details where the organization is registered.
 *          
 * 
 * <p>Java class for SubjectHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="OrganizationSummaryText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TotalInquiriesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubjectHandling" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SubjectHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransferDUNSNumberRegistration" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}TransferDUNSNumberRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NonMarketableReasonText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FullReportDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateSimpleType" minOccurs="0"/>
 *         &lt;element name="TotalContinuousInquiriesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DUNSSelfRequestIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DUNSSelfRequestDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectHeader", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationSummaryText",
    "lastUpdateDate",
    "totalInquiriesCount",
    "subjectHandling",
    "transferDUNSNumberRegistration",
    "marketabilityIndicator",
    "nonMarketableReasonText",
    "fullReportDate",
    "totalContinuousInquiriesCount",
    "dunsSelfRequestIndicator",
    "dunsSelfRequestDate"
})
public class SubjectHeader {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "OrganizationSummaryText")
    protected String organizationSummaryText;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "TotalInquiriesCount")
    protected Integer totalInquiriesCount;
    @XmlElement(name = "SubjectHandling")
    protected List<SubjectHandling> subjectHandling;
    @XmlElement(name = "TransferDUNSNumberRegistration")
    protected List<TransferDUNSNumberRegistration> transferDUNSNumberRegistration;
    @XmlElement(name = "MarketabilityIndicator")
    protected Boolean marketabilityIndicator;
    @XmlElement(name = "NonMarketableReasonText")
    protected List<DNBDecodedStringType> nonMarketableReasonText;
    @XmlElement(name = "FullReportDate")
    protected String fullReportDate;
    @XmlElement(name = "TotalContinuousInquiriesCount")
    protected Integer totalContinuousInquiriesCount;
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
     * Gets the value of the organizationSummaryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationSummaryText() {
        return organizationSummaryText;
    }

    /**
     * Sets the value of the organizationSummaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationSummaryText(String value) {
        this.organizationSummaryText = value;
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
     * Gets the value of the totalInquiriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalInquiriesCount() {
        return totalInquiriesCount;
    }

    /**
     * Sets the value of the totalInquiriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalInquiriesCount(Integer value) {
        this.totalInquiriesCount = value;
    }

    /**
     * Gets the value of the subjectHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectHandling }
     * 
     * 
     */
    public List<SubjectHandling> getSubjectHandling() {
        if (subjectHandling == null) {
            subjectHandling = new ArrayList<SubjectHandling>();
        }
        return this.subjectHandling;
    }

    /**
     * Gets the value of the transferDUNSNumberRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferDUNSNumberRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferDUNSNumberRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferDUNSNumberRegistration }
     * 
     * 
     */
    public List<TransferDUNSNumberRegistration> getTransferDUNSNumberRegistration() {
        if (transferDUNSNumberRegistration == null) {
            transferDUNSNumberRegistration = new ArrayList<TransferDUNSNumberRegistration>();
        }
        return this.transferDUNSNumberRegistration;
    }

    /**
     * Gets the value of the marketabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketabilityIndicator() {
        return marketabilityIndicator;
    }

    /**
     * Sets the value of the marketabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketabilityIndicator(Boolean value) {
        this.marketabilityIndicator = value;
    }

    /**
     * Gets the value of the nonMarketableReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonMarketableReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonMarketableReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getNonMarketableReasonText() {
        if (nonMarketableReasonText == null) {
            nonMarketableReasonText = new ArrayList<DNBDecodedStringType>();
        }
        return this.nonMarketableReasonText;
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
     * Gets the value of the totalContinuousInquiriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalContinuousInquiriesCount() {
        return totalContinuousInquiriesCount;
    }

    /**
     * Sets the value of the totalContinuousInquiriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalContinuousInquiriesCount(Integer value) {
        this.totalContinuousInquiriesCount = value;
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
