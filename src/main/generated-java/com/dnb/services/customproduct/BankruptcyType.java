
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * This section provides details on the Bankruptcy that was filed by the company.
 *          
 * 
 * <p>Java class for BankruptcyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingStatusDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="VerifiedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReceivedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReceivedDateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingChapterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventResult" type="{http://services.dnb.com/CustomProductServiceV2.0}EventResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BankruptcyFinancialStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}BankruptcyFinancialStatement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CourtDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CourtType" minOccurs="0"/>
 *         &lt;element name="CreditorCategorizationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditorCategorizationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingSubTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingDetailTextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingDetailTextEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingOfficeSubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChapterConversionDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ChapterConversionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="HistoryEventIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayGroupSequence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FilingOfficeName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="MessageGroup" type="{http://services.dnb.com/CustomProductServiceV2.0}MessageGroup" minOccurs="0"/>
 *         &lt;element name="CommentGroup" type="{http://services.dnb.com/CustomProductServiceV2.0}CommentGroupType" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://services.dnb.com/CustomProductServiceV2.0}Activity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeText",
    "filingDate",
    "filingStatusDate",
    "publishedDate",
    "verifiedDate",
    "receivedDate",
    "receivedDateTime",
    "filingReferenceNumber",
    "filingChapterNumber",
    "eventResult",
    "rolePlayer",
    "bankruptcyFinancialStatement",
    "contactEvent",
    "courtDetails",
    "creditorCategorizationDetail",
    "nonPaymentAmount",
    "textEntry",
    "filingSubTypeText",
    "lastUpdateDate",
    "filingStatusText",
    "filingDetailTextEntry",
    "filingOfficeSubjectID",
    "chapterConversionDetails",
    "endDate",
    "endedByDate",
    "historyEventIndicator",
    "displayGroupSequence",
    "filingOfficeName",
    "messageGroup",
    "commentGroup",
    "activity"
})
public class BankruptcyType {

    @XmlElement(name = "FilingTypeText")
    protected DNBDecodedStringType filingTypeText;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "FilingStatusDate")
    protected DNBDateType filingStatusDate;
    @XmlElement(name = "PublishedDate")
    protected DNBDateType publishedDate;
    @XmlElement(name = "VerifiedDate")
    protected DNBDateType verifiedDate;
    @XmlElement(name = "ReceivedDate")
    protected DNBDateType receivedDate;
    @XmlElement(name = "ReceivedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateTime;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "FilingChapterNumber")
    protected String filingChapterNumber;
    @XmlElement(name = "EventResult")
    protected List<EventResult> eventResult;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "BankruptcyFinancialStatement")
    protected List<BankruptcyFinancialStatement> bankruptcyFinancialStatement;
    @XmlElement(name = "ContactEvent")
    protected List<ContactEvent> contactEvent;
    @XmlElement(name = "CourtDetails")
    protected CourtType courtDetails;
    @XmlElement(name = "CreditorCategorizationDetail")
    protected List<CreditorCategorizationDetail> creditorCategorizationDetail;
    @XmlElement(name = "NonPaymentAmount")
    protected AmountType nonPaymentAmount;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "FilingSubTypeText")
    protected DNBDecodedStringType filingSubTypeText;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "FilingStatusText")
    protected DNBDecodedStringType filingStatusText;
    @XmlElement(name = "FilingDetailTextEntry")
    protected List<FilingDetailTextEntry> filingDetailTextEntry;
    @XmlElement(name = "FilingOfficeSubjectID")
    protected String filingOfficeSubjectID;
    @XmlElement(name = "ChapterConversionDetails")
    protected List<ChapterConversionDetailsType> chapterConversionDetails;
    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "HistoryEventIndicator")
    protected Boolean historyEventIndicator;
    @XmlElement(name = "DisplayGroupSequence")
    protected BigInteger displayGroupSequence;
    @XmlElement(name = "FilingOfficeName")
    protected String filingOfficeName;
    @XmlElement(name = "MessageGroup")
    protected MessageGroup messageGroup;
    @XmlElement(name = "CommentGroup")
    protected CommentGroupType commentGroup;
    @XmlElement(name = "Activity")
    protected List<Activity> activity;

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
     * Gets the value of the filingChapterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingChapterNumber() {
        return filingChapterNumber;
    }

    /**
     * Sets the value of the filingChapterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingChapterNumber(String value) {
        this.filingChapterNumber = value;
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
     * Gets the value of the bankruptcyFinancialStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankruptcyFinancialStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankruptcyFinancialStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankruptcyFinancialStatement }
     * 
     * 
     */
    public List<BankruptcyFinancialStatement> getBankruptcyFinancialStatement() {
        if (bankruptcyFinancialStatement == null) {
            bankruptcyFinancialStatement = new ArrayList<BankruptcyFinancialStatement>();
        }
        return this.bankruptcyFinancialStatement;
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
     * Gets the value of the filingSubTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingSubTypeText() {
        return filingSubTypeText;
    }

    /**
     * Sets the value of the filingSubTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingSubTypeText(DNBDecodedStringType value) {
        this.filingSubTypeText = value;
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
     * Gets the value of the filingDetailTextEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingDetailTextEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingDetailTextEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingDetailTextEntry }
     * 
     * 
     */
    public List<FilingDetailTextEntry> getFilingDetailTextEntry() {
        if (filingDetailTextEntry == null) {
            filingDetailTextEntry = new ArrayList<FilingDetailTextEntry>();
        }
        return this.filingDetailTextEntry;
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
     * Gets the value of the chapterConversionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapterConversionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChapterConversionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChapterConversionDetailsType }
     * 
     * 
     */
    public List<ChapterConversionDetailsType> getChapterConversionDetails() {
        if (chapterConversionDetails == null) {
            chapterConversionDetails = new ArrayList<ChapterConversionDetailsType>();
        }
        return this.chapterConversionDetails;
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
     * Gets the value of the historyEventIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoryEventIndicator() {
        return historyEventIndicator;
    }

    /**
     * Sets the value of the historyEventIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoryEventIndicator(Boolean value) {
        this.historyEventIndicator = value;
    }

    /**
     * Gets the value of the displayGroupSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayGroupSequence() {
        return displayGroupSequence;
    }

    /**
     * Sets the value of the displayGroupSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayGroupSequence(BigInteger value) {
        this.displayGroupSequence = value;
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
     * Gets the value of the messageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link MessageGroup }
     *     
     */
    public MessageGroup getMessageGroup() {
        return messageGroup;
    }

    /**
     * Sets the value of the messageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageGroup }
     *     
     */
    public void setMessageGroup(MessageGroup value) {
        this.messageGroup = value;
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
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<Activity>();
        }
        return this.activity;
    }

}
