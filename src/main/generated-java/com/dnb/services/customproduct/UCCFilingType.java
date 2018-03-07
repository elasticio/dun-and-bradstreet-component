
package com.dnb.services.customproduct;

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
 * This section provides details on UCC (Uniform Commercial Code) Filing, i.e., a legal document creditors use to secure their rights to collateral specified in a secured financing agreement.
 *          
 * 
 * <p>Java class for UCCFilingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UCCFilingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CollateralDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CollateralDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContractTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingOfficeDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="ReceivedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="VerifiedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingPageQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FilingTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="FilingOfficeSubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
@XmlType(name = "UCCFilingType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeText",
    "collateralDetail",
    "contactEvent",
    "contractTypeText",
    "filingExpirationDate",
    "filingDate",
    "filingReferenceNumber",
    "filingOfficeDetailText",
    "receivedDate",
    "verifiedDate",
    "rolePlayer",
    "filingPageQuantity",
    "filingTime",
    "filingOfficeSubjectID"
})
public class UCCFilingType {

    @XmlElement(name = "FilingTypeText")
    protected DNBDecodedStringType filingTypeText;
    @XmlElement(name = "CollateralDetail")
    protected List<CollateralDetailType> collateralDetail;
    @XmlElement(name = "ContactEvent")
    protected List<ContactEvent> contactEvent;
    @XmlElement(name = "ContractTypeText")
    protected DNBDecodedStringType contractTypeText;
    @XmlElement(name = "FilingExpirationDate")
    protected DNBDateType filingExpirationDate;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "FilingOfficeDetailText")
    protected String filingOfficeDetailText;
    @XmlElement(name = "ReceivedDate")
    protected DNBDateType receivedDate;
    @XmlElement(name = "VerifiedDate")
    protected DNBDateType verifiedDate;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "FilingPageQuantity")
    protected Integer filingPageQuantity;
    @XmlElement(name = "FilingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar filingTime;
    @XmlElement(name = "FilingOfficeSubjectID")
    protected String filingOfficeSubjectID;

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
     * Gets the value of the filingOfficeDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeDetailText() {
        return filingOfficeDetailText;
    }

    /**
     * Sets the value of the filingOfficeDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeDetailText(String value) {
        this.filingOfficeDetailText = value;
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

}
