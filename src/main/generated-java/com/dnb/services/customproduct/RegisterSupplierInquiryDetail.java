
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data that allows the supplier to specify identifying information about the subject being inquired, e.g., the DUNS Number, SupplierName etc.
 *          
 * 
 * <p>Java class for RegisterSupplierInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterSupplierInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Principal" type="{http://services.dnb.com/CustomProductServiceV2.0}Principal" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="Shareholder" type="{http://services.dnb.com/CustomProductServiceV2.0}ShareholderForRegisterSupplier" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="DivisionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DivisionDetail" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierRegistrationAddress" minOccurs="0"/>
 *         &lt;element name="SalesRevenueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SubjectIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="EntityTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}EntityTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberSimpleType" minOccurs="0"/>
 *         &lt;element name="RelatedPartyDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RelatedPartyDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterSupplierInquiryDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectName",
    "dunsNumber",
    "subjectID",
    "principal",
    "shareholder",
    "divisionDetail",
    "primaryAddress",
    "salesRevenueAmount",
    "subjectIdentificationNumberDetail",
    "dataProviderName",
    "entityTypeText",
    "telephoneNumber",
    "relatedPartyDetail"
})
public class RegisterSupplierInquiryDetail {

    @XmlElement(name = "SubjectName", required = true)
    protected String subjectName;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectID")
    protected String subjectID;
    @XmlElement(name = "Principal")
    protected List<Principal> principal;
    @XmlElement(name = "Shareholder")
    protected List<ShareholderForRegisterSupplier> shareholder;
    @XmlElement(name = "DivisionDetail")
    protected DivisionDetail divisionDetail;
    @XmlElement(name = "PrimaryAddress")
    protected SupplierRegistrationAddress primaryAddress;
    @XmlElement(name = "SalesRevenueAmount")
    protected AmountType salesRevenueAmount;
    @XmlElement(name = "SubjectIdentificationNumberDetail")
    protected List<SubjectIdentificationNumberType> subjectIdentificationNumberDetail;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "EntityTypeText")
    @XmlSchemaType(name = "string")
    protected EntityTypeEnumeration entityTypeText;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberSimpleType telephoneNumber;
    @XmlElement(name = "RelatedPartyDetail")
    protected List<RelatedPartyDetail> relatedPartyDetail;

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
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
     * Gets the value of the principal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Principal }
     * 
     * 
     */
    public List<Principal> getPrincipal() {
        if (principal == null) {
            principal = new ArrayList<Principal>();
        }
        return this.principal;
    }

    /**
     * Gets the value of the shareholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholderForRegisterSupplier }
     * 
     * 
     */
    public List<ShareholderForRegisterSupplier> getShareholder() {
        if (shareholder == null) {
            shareholder = new ArrayList<ShareholderForRegisterSupplier>();
        }
        return this.shareholder;
    }

    /**
     * Gets the value of the divisionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionDetail }
     *     
     */
    public DivisionDetail getDivisionDetail() {
        return divisionDetail;
    }

    /**
     * Sets the value of the divisionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionDetail }
     *     
     */
    public void setDivisionDetail(DivisionDetail value) {
        this.divisionDetail = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierRegistrationAddress }
     *     
     */
    public SupplierRegistrationAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRegistrationAddress }
     *     
     */
    public void setPrimaryAddress(SupplierRegistrationAddress value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the salesRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesRevenueAmount() {
        return salesRevenueAmount;
    }

    /**
     * Sets the value of the salesRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesRevenueAmount(AmountType value) {
        this.salesRevenueAmount = value;
    }

    /**
     * Gets the value of the subjectIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectIdentificationNumberType }
     * 
     * 
     */
    public List<SubjectIdentificationNumberType> getSubjectIdentificationNumberDetail() {
        if (subjectIdentificationNumberDetail == null) {
            subjectIdentificationNumberDetail = new ArrayList<SubjectIdentificationNumberType>();
        }
        return this.subjectIdentificationNumberDetail;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

    /**
     * Gets the value of the entityTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEnumeration }
     *     
     */
    public EntityTypeEnumeration getEntityTypeText() {
        return entityTypeText;
    }

    /**
     * Sets the value of the entityTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEnumeration }
     *     
     */
    public void setEntityTypeText(EntityTypeEnumeration value) {
        this.entityTypeText = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public TelecommunicationNumberSimpleType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberSimpleType value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the relatedPartyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPartyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPartyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPartyDetail }
     * 
     * 
     */
    public List<RelatedPartyDetail> getRelatedPartyDetail() {
        if (relatedPartyDetail == null) {
            relatedPartyDetail = new ArrayList<RelatedPartyDetail>();
        }
        return this.relatedPartyDetail;
    }

}
