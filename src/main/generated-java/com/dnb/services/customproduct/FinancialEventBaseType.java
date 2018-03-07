
package com.dnb.services.customproduct;

import java.math.BigInteger;
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
 * 
 * This section provides details on UCC (Uniform Commercial Code) Filing, i.e., a legal document creditors use to secure their rights to collateral specified in a secured financing agreement.
 *          
 * 
 * <p>Java class for FinancialEventBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialEventBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="OriginalFilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReceivedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReceivedDateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="VerifiedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OriginalFilingNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingPageQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WholeBusinessAsSecurityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SecuredOnAllAssetsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CollateralDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CollateralDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalCollateralDetailsAvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContractTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AdditionalDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="DisplayGroupSequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
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
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="FilingOfficeName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="DocumentTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
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
@XmlType(name = "FinancialEventBaseType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeText",
    "filingDate",
    "filingTime",
    "originalFilingDate",
    "receivedDate",
    "receivedDateTime",
    "verifiedDate",
    "publishedDate",
    "filingExpirationDate",
    "endedByDate",
    "filingReferenceNumber",
    "originalFilingNumber",
    "filingPageQuantity",
    "wholeBusinessAsSecurityIndicator",
    "securedOnAllAssetsIndicator",
    "collateralDetail",
    "additionalCollateralDetailsAvailableIndicator",
    "contactEvent",
    "contractTypeText",
    "rolePlayer",
    "financingAmount",
    "additionalDetailText",
    "displayGroupSequence",
    "filingOfficeSubjectID",
    "lastUpdateDate",
    "lastUpdateTime",
    "filingOfficeName",
    "documentTypeText",
    "commentGroup",
    "filingClassText"
})
@XmlSeeAlso({
    OtherFinancingEvent.class,
    FinancingStatementFiling.class
})
public class FinancialEventBaseType {

    @XmlElement(name = "FilingTypeText")
    protected DNBDecodedStringType filingTypeText;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "FilingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar filingTime;
    @XmlElement(name = "OriginalFilingDate")
    protected DNBDateType originalFilingDate;
    @XmlElement(name = "ReceivedDate")
    protected DNBDateType receivedDate;
    @XmlElement(name = "ReceivedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateTime;
    @XmlElement(name = "VerifiedDate")
    protected DNBDateType verifiedDate;
    @XmlElement(name = "PublishedDate")
    protected DNBDateType publishedDate;
    @XmlElement(name = "FilingExpirationDate")
    protected DNBDateType filingExpirationDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "OriginalFilingNumber")
    protected String originalFilingNumber;
    @XmlElement(name = "FilingPageQuantity")
    protected Integer filingPageQuantity;
    @XmlElement(name = "WholeBusinessAsSecurityIndicator")
    protected Boolean wholeBusinessAsSecurityIndicator;
    @XmlElement(name = "SecuredOnAllAssetsIndicator")
    protected Boolean securedOnAllAssetsIndicator;
    @XmlElement(name = "CollateralDetail")
    protected List<CollateralDetailType> collateralDetail;
    @XmlElement(name = "AdditionalCollateralDetailsAvailableIndicator")
    protected Boolean additionalCollateralDetailsAvailableIndicator;
    @XmlElement(name = "ContactEvent")
    protected List<ContactEvent> contactEvent;
    @XmlElement(name = "ContractTypeText")
    protected DNBDecodedStringType contractTypeText;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "FinancingAmount")
    protected AmountType financingAmount;
    @XmlElement(name = "AdditionalDetailText")
    protected String additionalDetailText;
    @XmlElement(name = "DisplayGroupSequence")
    protected BigInteger displayGroupSequence;
    @XmlElement(name = "FilingOfficeSubjectID")
    protected String filingOfficeSubjectID;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "LastUpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElement(name = "FilingOfficeName")
    protected String filingOfficeName;
    @XmlElement(name = "DocumentTypeText")
    protected DNBDecodedStringType documentTypeText;
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
     * Gets the value of the filingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilingTime() {
        return filingTime;
    }

    /**
     * Sets the value of the filingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilingTime(XMLGregorianCalendar value) {
        this.filingTime = value;
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
     * Gets the value of the filingExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingExpirationDate() {
        return filingExpirationDate;
    }

    /**
     * Sets the value of the filingExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingExpirationDate(DNBDateType value) {
        this.filingExpirationDate = value;
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
     * Gets the value of the originalFilingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFilingNumber() {
        return originalFilingNumber;
    }

    /**
     * Sets the value of the originalFilingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFilingNumber(String value) {
        this.originalFilingNumber = value;
    }

    /**
     * Gets the value of the filingPageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilingPageQuantity() {
        return filingPageQuantity;
    }

    /**
     * Sets the value of the filingPageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilingPageQuantity(Integer value) {
        this.filingPageQuantity = value;
    }

    /**
     * Gets the value of the wholeBusinessAsSecurityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWholeBusinessAsSecurityIndicator() {
        return wholeBusinessAsSecurityIndicator;
    }

    /**
     * Sets the value of the wholeBusinessAsSecurityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWholeBusinessAsSecurityIndicator(Boolean value) {
        this.wholeBusinessAsSecurityIndicator = value;
    }

    /**
     * Gets the value of the securedOnAllAssetsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuredOnAllAssetsIndicator() {
        return securedOnAllAssetsIndicator;
    }

    /**
     * Sets the value of the securedOnAllAssetsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuredOnAllAssetsIndicator(Boolean value) {
        this.securedOnAllAssetsIndicator = value;
    }

    /**
     * Gets the value of the collateralDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralDetailType }
     * 
     * 
     */
    public List<CollateralDetailType> getCollateralDetail() {
        if (collateralDetail == null) {
            collateralDetail = new ArrayList<CollateralDetailType>();
        }
        return this.collateralDetail;
    }

    /**
     * Gets the value of the additionalCollateralDetailsAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalCollateralDetailsAvailableIndicator() {
        return additionalCollateralDetailsAvailableIndicator;
    }

    /**
     * Sets the value of the additionalCollateralDetailsAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalCollateralDetailsAvailableIndicator(Boolean value) {
        this.additionalCollateralDetailsAvailableIndicator = value;
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
     * Gets the value of the contractTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getContractTypeText() {
        return contractTypeText;
    }

    /**
     * Sets the value of the contractTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setContractTypeText(DNBDecodedStringType value) {
        this.contractTypeText = value;
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
     * Gets the value of the financingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancingAmount() {
        return financingAmount;
    }

    /**
     * Sets the value of the financingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancingAmount(AmountType value) {
        this.financingAmount = value;
    }

    /**
     * Gets the value of the additionalDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDetailText() {
        return additionalDetailText;
    }

    /**
     * Sets the value of the additionalDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDetailText(String value) {
        this.additionalDetailText = value;
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
     * Gets the value of the documentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDocumentTypeText() {
        return documentTypeText;
    }

    /**
     * Sets the value of the documentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDocumentTypeText(DNBDecodedStringType value) {
        this.documentTypeText = value;
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
