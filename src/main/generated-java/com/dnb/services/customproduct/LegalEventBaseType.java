
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LegalEventBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEventBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OriginalFilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingStatusDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReceivedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReceivedDateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="ReportedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="VerifiedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="StopDistributionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CourtAssignedNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RevenueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LegalEventReason" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssetGroupDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AssetGroupDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EventResult" type="{http://services.dnb.com/CustomProductServiceV2.0}EventResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CourtDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CourtType" minOccurs="0"/>
 *         &lt;element name="AdditionalPartiesInvolvedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllAssetImpactedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditorCategorizationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditorCategorizationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DNBDataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingOfficeDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="FilingOfficeName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="FilingOfficeAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}BaseAddressType" minOccurs="0"/>
 *         &lt;element name="FilingMediumDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="FiledAgainstOrganizationName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingOfficeSubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="CommentGroup" type="{http://services.dnb.com/CustomProductServiceV2.0}CommentGroupType" minOccurs="0"/>
 *         &lt;element name="FilingClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEventBaseType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeText",
    "filingDate",
    "originalFilingDate",
    "filingStatusDate",
    "receivedDate",
    "receivedDateTime",
    "reportedDate",
    "verifiedDate",
    "publishedDate",
    "endDate",
    "endedByDate",
    "filingStatusText",
    "filingReferenceNumber",
    "stopDistributionIndicator",
    "courtAssignedNumber",
    "nonPaymentAmount",
    "revenueAmount",
    "rolePlayer",
    "legalEventReason",
    "assetGroupDetail",
    "eventResult",
    "contactEvent",
    "courtDetails",
    "additionalPartiesInvolvedIndicator",
    "allAssetImpactedIndicator",
    "creditorCategorizationDetail",
    "textEntry",
    "lastUpdateDate",
    "dnbDataProviderName",
    "filingOfficeDUNSNumber",
    "filingOfficeName",
    "filingOfficeAddress",
    "filingMediumDescription",
    "filedAgainstOrganizationName",
    "filingOfficeSubjectID",
    "lastUpdateTime",
    "commentGroup",
    "filingClassText"
})
@XmlSeeAlso({
    LienType.class,
    JudgmentType.class,
    SuitType.class
})
public class LegalEventBaseType {

    @XmlElement(name = "FilingTypeText")
    protected DNBDecodedStringType filingTypeText;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "OriginalFilingDate")
    protected DNBDateType originalFilingDate;
    @XmlElement(name = "FilingStatusDate")
    protected DNBDateType filingStatusDate;
    @XmlElement(name = "ReceivedDate")
    protected DNBDateType receivedDate;
    @XmlElement(name = "ReceivedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateTime;
    @XmlElement(name = "ReportedDate")
    protected DNBDateType reportedDate;
    @XmlElement(name = "VerifiedDate")
    protected DNBDateType verifiedDate;
    @XmlElement(name = "PublishedDate")
    protected DNBDateType publishedDate;
    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "FilingStatusText")
    protected DNBDecodedStringType filingStatusText;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "StopDistributionIndicator")
    protected Boolean stopDistributionIndicator;
    @XmlElement(name = "CourtAssignedNumber")
    protected String courtAssignedNumber;
    @XmlElement(name = "NonPaymentAmount")
    protected AmountType nonPaymentAmount;
    @XmlElement(name = "RevenueAmount")
    protected AmountType revenueAmount;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "LegalEventReason")
    protected List<LegalEventReason> legalEventReason;
    @XmlElement(name = "AssetGroupDetail")
    protected List<AssetGroupDetailType> assetGroupDetail;
    @XmlElement(name = "EventResult")
    protected List<EventResult> eventResult;
    @XmlElement(name = "ContactEvent")
    protected List<ContactEvent> contactEvent;
    @XmlElement(name = "CourtDetails")
    protected CourtType courtDetails;
    @XmlElement(name = "AdditionalPartiesInvolvedIndicator")
    protected Boolean additionalPartiesInvolvedIndicator;
    @XmlElement(name = "AllAssetImpactedIndicator")
    protected Boolean allAssetImpactedIndicator;
    @XmlElement(name = "CreditorCategorizationDetail")
    protected List<CreditorCategorizationDetail> creditorCategorizationDetail;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "DNBDataProviderName")
    protected DNBDecodedStringType dnbDataProviderName;
    @XmlElement(name = "FilingOfficeDUNSNumber")
    protected String filingOfficeDUNSNumber;
    @XmlElement(name = "FilingOfficeName")
    protected String filingOfficeName;
    @XmlElement(name = "FilingOfficeAddress")
    protected BaseAddressType filingOfficeAddress;
    @XmlElement(name = "FilingMediumDescription")
    protected String filingMediumDescription;
    @XmlElement(name = "FiledAgainstOrganizationName")
    protected String filedAgainstOrganizationName;
    @XmlElement(name = "FilingOfficeSubjectID")
    protected String filingOfficeSubjectID;
    @XmlElement(name = "LastUpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElement(name = "CommentGroup")
    protected CommentGroupType commentGroup;
    @XmlElement(name = "FilingClassText")
    protected DNBDecodedStringType filingClassText;

    /**
     * Gets the value of the filingTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingTypeText() {
        return filingTypeText;
    }

    /**
     * Sets the value of the filingTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingTypeText(DNBDecodedStringType value) {
        this.filingTypeText = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingDate(DNBDateType value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the originalFilingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getOriginalFilingDate() {
        return originalFilingDate;
    }

    /**
     * Sets the value of the originalFilingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setOriginalFilingDate(DNBDateType value) {
        this.originalFilingDate = value;
    }

    /**
     * Gets the value of the filingStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingStatusDate() {
        return filingStatusDate;
    }

    /**
     * Sets the value of the filingStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingStatusDate(DNBDateType value) {
        this.filingStatusDate = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setReceivedDate(DNBDateType value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the receivedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDateTime() {
        return receivedDateTime;
    }

    /**
     * Sets the value of the receivedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDateTime(XMLGregorianCalendar value) {
        this.receivedDateTime = value;
    }

    /**
     * Gets the value of the reportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getReportedDate() {
        return reportedDate;
    }

    /**
     * Sets the value of the reportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setReportedDate(DNBDateType value) {
        this.reportedDate = value;
    }

    /**
     * Gets the value of the verifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getVerifiedDate() {
        return verifiedDate;
    }

    /**
     * Sets the value of the verifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setVerifiedDate(DNBDateType value) {
        this.verifiedDate = value;
    }

    /**
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setPublishedDate(DNBDateType value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndDate(DNBDateType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndedByDate() {
        return endedByDate;
    }

    /**
     * Sets the value of the endedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndedByDate(DNBDateType value) {
        this.endedByDate = value;
    }

    /**
     * Gets the value of the filingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingStatusText() {
        return filingStatusText;
    }

    /**
     * Sets the value of the filingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingStatusText(DNBDecodedStringType value) {
        this.filingStatusText = value;
    }

    /**
     * Gets the value of the filingReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingReferenceNumber() {
        return filingReferenceNumber;
    }

    /**
     * Sets the value of the filingReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingReferenceNumber(String value) {
        this.filingReferenceNumber = value;
    }

    /**
     * Gets the value of the stopDistributionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopDistributionIndicator() {
        return stopDistributionIndicator;
    }

    /**
     * Sets the value of the stopDistributionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopDistributionIndicator(Boolean value) {
        this.stopDistributionIndicator = value;
    }

    /**
     * Gets the value of the courtAssignedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtAssignedNumber() {
        return courtAssignedNumber;
    }

    /**
     * Sets the value of the courtAssignedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtAssignedNumber(String value) {
        this.courtAssignedNumber = value;
    }

    /**
     * Gets the value of the nonPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonPaymentAmount() {
        return nonPaymentAmount;
    }

    /**
     * Sets the value of the nonPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonPaymentAmount(AmountType value) {
        this.nonPaymentAmount = value;
    }

    /**
     * Gets the value of the revenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRevenueAmount() {
        return revenueAmount;
    }

    /**
     * Sets the value of the revenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRevenueAmount(AmountType value) {
        this.revenueAmount = value;
    }

    /**
     * Gets the value of the rolePlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingPartyType }
     * 
     * 
     */
    public List<FilingPartyType> getRolePlayer() {
        if (rolePlayer == null) {
            rolePlayer = new ArrayList<FilingPartyType>();
        }
        return this.rolePlayer;
    }

    /**
     * Gets the value of the legalEventReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalEventReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalEventReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventReason }
     * 
     * 
     */
    public List<LegalEventReason> getLegalEventReason() {
        if (legalEventReason == null) {
            legalEventReason = new ArrayList<LegalEventReason>();
        }
        return this.legalEventReason;
    }

    /**
     * Gets the value of the assetGroupDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetGroupDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupDetailType }
     * 
     * 
     */
    public List<AssetGroupDetailType> getAssetGroupDetail() {
        if (assetGroupDetail == null) {
            assetGroupDetail = new ArrayList<AssetGroupDetailType>();
        }
        return this.assetGroupDetail;
    }

    /**
     * Gets the value of the eventResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventResult }
     * 
     * 
     */
    public List<EventResult> getEventResult() {
        if (eventResult == null) {
            eventResult = new ArrayList<EventResult>();
        }
        return this.eventResult;
    }

    /**
     * Gets the value of the contactEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactEvent }
     * 
     * 
     */
    public List<ContactEvent> getContactEvent() {
        if (contactEvent == null) {
            contactEvent = new ArrayList<ContactEvent>();
        }
        return this.contactEvent;
    }

    /**
     * Gets the value of the courtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CourtType }
     *     
     */
    public CourtType getCourtDetails() {
        return courtDetails;
    }

    /**
     * Sets the value of the courtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtType }
     *     
     */
    public void setCourtDetails(CourtType value) {
        this.courtDetails = value;
    }

    /**
     * Gets the value of the additionalPartiesInvolvedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalPartiesInvolvedIndicator() {
        return additionalPartiesInvolvedIndicator;
    }

    /**
     * Sets the value of the additionalPartiesInvolvedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalPartiesInvolvedIndicator(Boolean value) {
        this.additionalPartiesInvolvedIndicator = value;
    }

    /**
     * Gets the value of the allAssetImpactedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllAssetImpactedIndicator() {
        return allAssetImpactedIndicator;
    }

    /**
     * Sets the value of the allAssetImpactedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllAssetImpactedIndicator(Boolean value) {
        this.allAssetImpactedIndicator = value;
    }

    /**
     * Gets the value of the creditorCategorizationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorCategorizationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorCategorizationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditorCategorizationDetail }
     * 
     * 
     */
    public List<CreditorCategorizationDetail> getCreditorCategorizationDetail() {
        if (creditorCategorizationDetail == null) {
            creditorCategorizationDetail = new ArrayList<CreditorCategorizationDetail>();
        }
        return this.creditorCategorizationDetail;
    }

    /**
     * Gets the value of the textEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getTextEntry() {
        if (textEntry == null) {
            textEntry = new ArrayList<TextEntryType>();
        }
        return this.textEntry;
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
     * Gets the value of the dnbDataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDNBDataProviderName() {
        return dnbDataProviderName;
    }

    /**
     * Sets the value of the dnbDataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDNBDataProviderName(DNBDecodedStringType value) {
        this.dnbDataProviderName = value;
    }

    /**
     * Gets the value of the filingOfficeDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeDUNSNumber() {
        return filingOfficeDUNSNumber;
    }

    /**
     * Sets the value of the filingOfficeDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeDUNSNumber(String value) {
        this.filingOfficeDUNSNumber = value;
    }

    /**
     * Gets the value of the filingOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeName() {
        return filingOfficeName;
    }

    /**
     * Sets the value of the filingOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeName(String value) {
        this.filingOfficeName = value;
    }

    /**
     * Gets the value of the filingOfficeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAddressType }
     *     
     */
    public BaseAddressType getFilingOfficeAddress() {
        return filingOfficeAddress;
    }

    /**
     * Sets the value of the filingOfficeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAddressType }
     *     
     */
    public void setFilingOfficeAddress(BaseAddressType value) {
        this.filingOfficeAddress = value;
    }

    /**
     * Gets the value of the filingMediumDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingMediumDescription() {
        return filingMediumDescription;
    }

    /**
     * Sets the value of the filingMediumDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingMediumDescription(String value) {
        this.filingMediumDescription = value;
    }

    /**
     * Gets the value of the filedAgainstOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledAgainstOrganizationName() {
        return filedAgainstOrganizationName;
    }

    /**
     * Sets the value of the filedAgainstOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledAgainstOrganizationName(String value) {
        this.filedAgainstOrganizationName = value;
    }

    /**
     * Gets the value of the filingOfficeSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeSubjectID() {
        return filingOfficeSubjectID;
    }

    /**
     * Sets the value of the filingOfficeSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeSubjectID(String value) {
        this.filingOfficeSubjectID = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the commentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CommentGroupType }
     *     
     */
    public CommentGroupType getCommentGroup() {
        return commentGroup;
    }

    /**
     * Sets the value of the commentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentGroupType }
     *     
     */
    public void setCommentGroup(CommentGroupType value) {
        this.commentGroup = value;
    }

    /**
     * Gets the value of the filingClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingClassText() {
        return filingClassText;
    }

    /**
     * Sets the value of the filingClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingClassText(DNBDecodedStringType value) {
        this.filingClassText = value;
    }

}
