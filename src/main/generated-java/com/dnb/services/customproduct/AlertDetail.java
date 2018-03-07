
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
 * An entry loop which can repeat multiple times to allow the recording of the changes to the details of the supplier registered for monitoring.
 *          
 * 
 * <p>Java class for AlertDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryDetailForAlert" minOccurs="0"/>
 *         &lt;element name="RenderingApplicationID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AlertID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AlertEntityID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AlertDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AlertNoteText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntityTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}EntityTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="EntityReferenceWebPageURL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EntityMatchDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}EntityMatchDetail" minOccurs="0"/>
 *         &lt;element name="ReferenceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ReferenceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EventDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}FreeFormEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectNameDetail" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://services.dnb.com/CustomProductServiceV2.0}ComplianceAddressDetail" minOccurs="0"/>
 *         &lt;element name="PersonalDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectPersonalDetail" minOccurs="0"/>
 *         &lt;element name="Assessment" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierAssessment" minOccurs="0"/>
 *         &lt;element name="NonspecificParameterDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}NonspecificParameterDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "renderingApplicationID",
    "alertID",
    "alertEntityID",
    "alertDate",
    "alertNoteText",
    "displaySequence",
    "entityTypeText",
    "entityReferenceWebPageURL",
    "entityMatchDetail",
    "referenceDetail",
    "eventDetail",
    "name",
    "address",
    "personalDetail",
    "assessment",
    "nonspecificParameterDetail"
})
public class AlertDetail {

    @XmlElement(name = "InquiryDetail")
    protected InquiryDetailForAlert inquiryDetail;
    @XmlElement(name = "RenderingApplicationID")
    protected String renderingApplicationID;
    @XmlElement(name = "AlertID")
    protected String alertID;
    @XmlElement(name = "AlertEntityID")
    protected String alertEntityID;
    @XmlElement(name = "AlertDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar alertDate;
    @XmlElement(name = "AlertNoteText")
    protected String alertNoteText;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "EntityTypeText")
    @XmlSchemaType(name = "string")
    protected EntityTypeEnumeration entityTypeText;
    @XmlElement(name = "EntityReferenceWebPageURL")
    protected String entityReferenceWebPageURL;
    @XmlElement(name = "EntityMatchDetail")
    protected EntityMatchDetail entityMatchDetail;
    @XmlElement(name = "ReferenceDetail")
    protected List<ReferenceDetail> referenceDetail;
    @XmlElement(name = "EventDetail")
    protected List<FreeFormEvent> eventDetail;
    @XmlElement(name = "Name")
    protected SubjectNameDetail name;
    @XmlElement(name = "Address")
    protected ComplianceAddressDetail address;
    @XmlElement(name = "PersonalDetail")
    protected SubjectPersonalDetail personalDetail;
    @XmlElement(name = "Assessment")
    protected SupplierAssessment assessment;
    @XmlElement(name = "NonspecificParameterDetail")
    protected List<NonspecificParameterDetail> nonspecificParameterDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryDetailForAlert }
     *     
     */
    public InquiryDetailForAlert getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryDetailForAlert }
     *     
     */
    public void setInquiryDetail(InquiryDetailForAlert value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the renderingApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingApplicationID() {
        return renderingApplicationID;
    }

    /**
     * Sets the value of the renderingApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingApplicationID(String value) {
        this.renderingApplicationID = value;
    }

    /**
     * Gets the value of the alertID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertID() {
        return alertID;
    }

    /**
     * Sets the value of the alertID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertID(String value) {
        this.alertID = value;
    }

    /**
     * Gets the value of the alertEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertEntityID() {
        return alertEntityID;
    }

    /**
     * Sets the value of the alertEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertEntityID(String value) {
        this.alertEntityID = value;
    }

    /**
     * Gets the value of the alertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDate() {
        return alertDate;
    }

    /**
     * Sets the value of the alertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDate(XMLGregorianCalendar value) {
        this.alertDate = value;
    }

    /**
     * Gets the value of the alertNoteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertNoteText() {
        return alertNoteText;
    }

    /**
     * Sets the value of the alertNoteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertNoteText(String value) {
        this.alertNoteText = value;
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
     * Gets the value of the entityReferenceWebPageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityReferenceWebPageURL() {
        return entityReferenceWebPageURL;
    }

    /**
     * Sets the value of the entityReferenceWebPageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityReferenceWebPageURL(String value) {
        this.entityReferenceWebPageURL = value;
    }

    /**
     * Gets the value of the entityMatchDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EntityMatchDetail }
     *     
     */
    public EntityMatchDetail getEntityMatchDetail() {
        return entityMatchDetail;
    }

    /**
     * Sets the value of the entityMatchDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityMatchDetail }
     *     
     */
    public void setEntityMatchDetail(EntityMatchDetail value) {
        this.entityMatchDetail = value;
    }

    /**
     * Gets the value of the referenceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceDetail }
     * 
     * 
     */
    public List<ReferenceDetail> getReferenceDetail() {
        if (referenceDetail == null) {
            referenceDetail = new ArrayList<ReferenceDetail>();
        }
        return this.referenceDetail;
    }

    /**
     * Gets the value of the eventDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeFormEvent }
     * 
     * 
     */
    public List<FreeFormEvent> getEventDetail() {
        if (eventDetail == null) {
            eventDetail = new ArrayList<FreeFormEvent>();
        }
        return this.eventDetail;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectNameDetail }
     *     
     */
    public SubjectNameDetail getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectNameDetail }
     *     
     */
    public void setName(SubjectNameDetail value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddressDetail }
     *     
     */
    public ComplianceAddressDetail getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddressDetail }
     *     
     */
    public void setAddress(ComplianceAddressDetail value) {
        this.address = value;
    }

    /**
     * Gets the value of the personalDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPersonalDetail }
     *     
     */
    public SubjectPersonalDetail getPersonalDetail() {
        return personalDetail;
    }

    /**
     * Sets the value of the personalDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPersonalDetail }
     *     
     */
    public void setPersonalDetail(SubjectPersonalDetail value) {
        this.personalDetail = value;
    }

    /**
     * Gets the value of the assessment property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierAssessment }
     *     
     */
    public SupplierAssessment getAssessment() {
        return assessment;
    }

    /**
     * Sets the value of the assessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierAssessment }
     *     
     */
    public void setAssessment(SupplierAssessment value) {
        this.assessment = value;
    }

    /**
     * Gets the value of the nonspecificParameterDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonspecificParameterDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonspecificParameterDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonspecificParameterDetail }
     * 
     * 
     */
    public List<NonspecificParameterDetail> getNonspecificParameterDetail() {
        if (nonspecificParameterDetail == null) {
            nonspecificParameterDetail = new ArrayList<NonspecificParameterDetail>();
        }
        return this.nonspecificParameterDetail;
    }

}
