
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayerLegalJurisdictionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayerLegalJurisdictionDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayerDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="RolePlayerSubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RolePlayerName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RolePlayerEmployerName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RolePlayerPosition" type="{http://services.dnb.com/CustomProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayerLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}BaseAddressType" minOccurs="0"/>
 *         &lt;element name="RolePlayerAssignedReferenceText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NonPaymentAmountComparisonOperatorText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RolePlayerEventResult" type="{http://services.dnb.com/CustomProductServiceV2.0}EventResult" minOccurs="0"/>
 *         &lt;element name="CreditorCategorizationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditorCategorizationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemedyDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RolePlayerFunctionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberType" minOccurs="0"/>
 *         &lt;element name="HistoryRatingText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AdditionalDetailText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplayGroupSequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RolePlayerJobTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingEmployerIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberSimpleType" minOccurs="0"/>
 *         &lt;element name="RemedyFiled" type="{http://services.dnb.com/CustomProductServiceV2.0}RemedyFiled" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayerTextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePlayerTextEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayerLinkage" type="{http://services.dnb.com/CustomProductServiceV2.0}Linkage" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingPartyType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rolePlayerTypeText",
    "rolePlayerLegalJurisdictionText",
    "rolePlayerLegalJurisdictionDescription",
    "rolePlayerDUNSNumber",
    "rolePlayerSubjectID",
    "rolePlayerName",
    "rolePlayerEmployerName",
    "rolePlayerPosition",
    "rolePlayerLocation",
    "rolePlayerAssignedReferenceText",
    "nonPaymentAmount",
    "nonPaymentAmountComparisonOperatorText",
    "rolePlayerEventResult",
    "creditorCategorizationDetail",
    "remedyDescription",
    "rolePlayerFunctionText",
    "operatingStatusText",
    "telephoneNumber",
    "historyRatingText",
    "additionalDetailText",
    "displayGroupSequence",
    "displaySequence",
    "rolePlayerJobTitle",
    "filingEmployerIdentificationNumberDetail",
    "remedyFiled",
    "rolePlayerTextEntry",
    "rolePlayerLinkage",
    "dunsNumber"
})
public class FilingPartyType {

    @XmlElement(name = "RolePlayerTypeText")
    protected DNBDecodedStringType rolePlayerTypeText;
    @XmlElement(name = "RolePlayerLegalJurisdictionText")
    protected DNBDecodedStringType rolePlayerLegalJurisdictionText;
    @XmlElement(name = "RolePlayerLegalJurisdictionDescription")
    protected DNBStringType rolePlayerLegalJurisdictionDescription;
    @XmlElement(name = "RolePlayerDUNSNumber")
    protected String rolePlayerDUNSNumber;
    @XmlElement(name = "RolePlayerSubjectID")
    protected String rolePlayerSubjectID;
    @XmlElement(name = "RolePlayerName")
    protected String rolePlayerName;
    @XmlElement(name = "RolePlayerEmployerName")
    protected String rolePlayerEmployerName;
    @XmlElement(name = "RolePlayerPosition")
    protected List<Position> rolePlayerPosition;
    @XmlElement(name = "RolePlayerLocation")
    protected BaseAddressType rolePlayerLocation;
    @XmlElement(name = "RolePlayerAssignedReferenceText")
    protected String rolePlayerAssignedReferenceText;
    @XmlElement(name = "NonPaymentAmount")
    protected AmountType nonPaymentAmount;
    @XmlElement(name = "NonPaymentAmountComparisonOperatorText")
    protected DNBDecodedStringType nonPaymentAmountComparisonOperatorText;
    @XmlElement(name = "RolePlayerEventResult")
    protected EventResult rolePlayerEventResult;
    @XmlElement(name = "CreditorCategorizationDetail")
    protected List<CreditorCategorizationDetail> creditorCategorizationDetail;
    @XmlElement(name = "RemedyDescription")
    protected String remedyDescription;
    @XmlElement(name = "RolePlayerFunctionText")
    protected DNBDecodedStringType rolePlayerFunctionText;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberType telephoneNumber;
    @XmlElement(name = "HistoryRatingText")
    protected DNBDecodedStringType historyRatingText;
    @XmlElement(name = "AdditionalDetailText")
    protected String additionalDetailText;
    @XmlElement(name = "DisplayGroupSequence")
    protected BigInteger displayGroupSequence;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "RolePlayerJobTitle")
    protected List<JobTitle> rolePlayerJobTitle;
    @XmlElement(name = "FilingEmployerIdentificationNumberDetail")
    protected OrganizationIdentificationNumberSimpleType filingEmployerIdentificationNumberDetail;
    @XmlElement(name = "RemedyFiled")
    protected List<RemedyFiled> remedyFiled;
    @XmlElement(name = "RolePlayerTextEntry")
    protected List<RolePlayerTextEntry> rolePlayerTextEntry;
    @XmlElement(name = "RolePlayerLinkage")
    protected Linkage rolePlayerLinkage;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;

    /**
     * Gets the value of the rolePlayerTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerTypeText() {
        return rolePlayerTypeText;
    }

    /**
     * Sets the value of the rolePlayerTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerTypeText(DNBDecodedStringType value) {
        this.rolePlayerTypeText = value;
    }

    /**
     * Gets the value of the rolePlayerLegalJurisdictionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerLegalJurisdictionText() {
        return rolePlayerLegalJurisdictionText;
    }

    /**
     * Sets the value of the rolePlayerLegalJurisdictionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerLegalJurisdictionText(DNBDecodedStringType value) {
        this.rolePlayerLegalJurisdictionText = value;
    }

    /**
     * Gets the value of the rolePlayerLegalJurisdictionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getRolePlayerLegalJurisdictionDescription() {
        return rolePlayerLegalJurisdictionDescription;
    }

    /**
     * Sets the value of the rolePlayerLegalJurisdictionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setRolePlayerLegalJurisdictionDescription(DNBStringType value) {
        this.rolePlayerLegalJurisdictionDescription = value;
    }

    /**
     * Gets the value of the rolePlayerDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerDUNSNumber() {
        return rolePlayerDUNSNumber;
    }

    /**
     * Sets the value of the rolePlayerDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerDUNSNumber(String value) {
        this.rolePlayerDUNSNumber = value;
    }

    /**
     * Gets the value of the rolePlayerSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerSubjectID() {
        return rolePlayerSubjectID;
    }

    /**
     * Sets the value of the rolePlayerSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerSubjectID(String value) {
        this.rolePlayerSubjectID = value;
    }

    /**
     * Gets the value of the rolePlayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerName() {
        return rolePlayerName;
    }

    /**
     * Sets the value of the rolePlayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerName(String value) {
        this.rolePlayerName = value;
    }

    /**
     * Gets the value of the rolePlayerEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerEmployerName() {
        return rolePlayerEmployerName;
    }

    /**
     * Sets the value of the rolePlayerEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerEmployerName(String value) {
        this.rolePlayerEmployerName = value;
    }

    /**
     * Gets the value of the rolePlayerPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getRolePlayerPosition() {
        if (rolePlayerPosition == null) {
            rolePlayerPosition = new ArrayList<Position>();
        }
        return this.rolePlayerPosition;
    }

    /**
     * Gets the value of the rolePlayerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAddressType }
     *     
     */
    public BaseAddressType getRolePlayerLocation() {
        return rolePlayerLocation;
    }

    /**
     * Sets the value of the rolePlayerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAddressType }
     *     
     */
    public void setRolePlayerLocation(BaseAddressType value) {
        this.rolePlayerLocation = value;
    }

    /**
     * Gets the value of the rolePlayerAssignedReferenceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePlayerAssignedReferenceText() {
        return rolePlayerAssignedReferenceText;
    }

    /**
     * Sets the value of the rolePlayerAssignedReferenceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePlayerAssignedReferenceText(String value) {
        this.rolePlayerAssignedReferenceText = value;
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
     * Gets the value of the nonPaymentAmountComparisonOperatorText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNonPaymentAmountComparisonOperatorText() {
        return nonPaymentAmountComparisonOperatorText;
    }

    /**
     * Sets the value of the nonPaymentAmountComparisonOperatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNonPaymentAmountComparisonOperatorText(DNBDecodedStringType value) {
        this.nonPaymentAmountComparisonOperatorText = value;
    }

    /**
     * Gets the value of the rolePlayerEventResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getRolePlayerEventResult() {
        return rolePlayerEventResult;
    }

    /**
     * Sets the value of the rolePlayerEventResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setRolePlayerEventResult(EventResult value) {
        this.rolePlayerEventResult = value;
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
     * Gets the value of the remedyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemedyDescription() {
        return remedyDescription;
    }

    /**
     * Sets the value of the remedyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemedyDescription(String value) {
        this.remedyDescription = value;
    }

    /**
     * Gets the value of the rolePlayerFunctionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerFunctionText() {
        return rolePlayerFunctionText;
    }

    /**
     * Sets the value of the rolePlayerFunctionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerFunctionText(DNBDecodedStringType value) {
        this.rolePlayerFunctionText = value;
    }

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public TelecommunicationNumberType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberType value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the historyRatingText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getHistoryRatingText() {
        return historyRatingText;
    }

    /**
     * Sets the value of the historyRatingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setHistoryRatingText(DNBDecodedStringType value) {
        this.historyRatingText = value;
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
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the rolePlayerJobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerJobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobTitle }
     * 
     * 
     */
    public List<JobTitle> getRolePlayerJobTitle() {
        if (rolePlayerJobTitle == null) {
            rolePlayerJobTitle = new ArrayList<JobTitle>();
        }
        return this.rolePlayerJobTitle;
    }

    /**
     * Gets the value of the filingEmployerIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberSimpleType }
     *     
     */
    public OrganizationIdentificationNumberSimpleType getFilingEmployerIdentificationNumberDetail() {
        return filingEmployerIdentificationNumberDetail;
    }

    /**
     * Sets the value of the filingEmployerIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberSimpleType }
     *     
     */
    public void setFilingEmployerIdentificationNumberDetail(OrganizationIdentificationNumberSimpleType value) {
        this.filingEmployerIdentificationNumberDetail = value;
    }

    /**
     * Gets the value of the remedyFiled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remedyFiled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemedyFiled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemedyFiled }
     * 
     * 
     */
    public List<RemedyFiled> getRemedyFiled() {
        if (remedyFiled == null) {
            remedyFiled = new ArrayList<RemedyFiled>();
        }
        return this.remedyFiled;
    }

    /**
     * Gets the value of the rolePlayerTextEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerTextEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerTextEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePlayerTextEntry }
     * 
     * 
     */
    public List<RolePlayerTextEntry> getRolePlayerTextEntry() {
        if (rolePlayerTextEntry == null) {
            rolePlayerTextEntry = new ArrayList<RolePlayerTextEntry>();
        }
        return this.rolePlayerTextEntry;
    }

    /**
     * Gets the value of the rolePlayerLinkage property.
     * 
     * @return
     *     possible object is
     *     {@link Linkage }
     *     
     */
    public Linkage getRolePlayerLinkage() {
        return rolePlayerLinkage;
    }

    /**
     * Sets the value of the rolePlayerLinkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkage }
     *     
     */
    public void setRolePlayerLinkage(Linkage value) {
        this.rolePlayerLinkage = value;
    }

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

}
