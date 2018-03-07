
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}BaseEventType">
 *       &lt;sequence>
 *         &lt;element name="EventTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="EventSubTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="EventClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OriginalFilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ContactEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImpactAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceClaimSettlementAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ImpactDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ImpactDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImpactedChildOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ImpactedChildOrganizationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImpactAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="UnabletoLocateSubjectIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DamagedAssetsDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DamagedAssetsDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImpactedPremisesDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ImpactedPremisesDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialEventType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "eventTypeText",
    "eventSubTypeText",
    "eventClassText",
    "publishedDate",
    "filingDate",
    "originalFilingDate",
    "contactEvent",
    "rolePlayer",
    "impactAmount",
    "insuranceClaimSettlementAmount",
    "impactDetail",
    "impactedChildOrganization",
    "impactAddress",
    "dataProviderName",
    "textEntry",
    "endedByDate",
    "unabletoLocateSubjectIndicator",
    "damagedAssetsDetail",
    "impactedPremisesDetail"
})
public class SpecialEventType
    extends BaseEventType
{

    @XmlElement(name = "EventTypeText", required = true)
    protected DNBDecodedStringType eventTypeText;
    @XmlElement(name = "EventSubTypeText")
    protected DNBDecodedStringType eventSubTypeText;
    @XmlElement(name = "EventClassText")
    protected DNBDecodedStringType eventClassText;
    @XmlElement(name = "PublishedDate")
    protected DNBDateType publishedDate;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "OriginalFilingDate")
    protected DNBDateType originalFilingDate;
    @XmlElement(name = "ContactEvent")
    protected List<ContactEvent> contactEvent;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "ImpactAmount")
    protected AmountType impactAmount;
    @XmlElement(name = "InsuranceClaimSettlementAmount")
    protected AmountType insuranceClaimSettlementAmount;
    @XmlElement(name = "ImpactDetail")
    protected List<ImpactDetailType> impactDetail;
    @XmlElement(name = "ImpactedChildOrganization")
    protected List<ImpactedChildOrganizationType> impactedChildOrganization;
    @XmlElement(name = "ImpactAddress")
    protected String impactAddress;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "UnabletoLocateSubjectIndicator")
    protected Boolean unabletoLocateSubjectIndicator;
    @XmlElement(name = "DamagedAssetsDetail")
    protected List<DamagedAssetsDetailType> damagedAssetsDetail;
    @XmlElement(name = "ImpactedPremisesDetail")
    protected List<ImpactedPremisesDetailType> impactedPremisesDetail;

    /**
     * Gets the value of the eventTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEventTypeText() {
        return eventTypeText;
    }

    /**
     * Sets the value of the eventTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEventTypeText(DNBDecodedStringType value) {
        this.eventTypeText = value;
    }

    /**
     * Gets the value of the eventSubTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEventSubTypeText() {
        return eventSubTypeText;
    }

    /**
     * Sets the value of the eventSubTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEventSubTypeText(DNBDecodedStringType value) {
        this.eventSubTypeText = value;
    }

    /**
     * Gets the value of the eventClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEventClassText() {
        return eventClassText;
    }

    /**
     * Sets the value of the eventClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEventClassText(DNBDecodedStringType value) {
        this.eventClassText = value;
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
     * Gets the value of the impactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImpactAmount() {
        return impactAmount;
    }

    /**
     * Sets the value of the impactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImpactAmount(AmountType value) {
        this.impactAmount = value;
    }

    /**
     * Gets the value of the insuranceClaimSettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceClaimSettlementAmount() {
        return insuranceClaimSettlementAmount;
    }

    /**
     * Sets the value of the insuranceClaimSettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceClaimSettlementAmount(AmountType value) {
        this.insuranceClaimSettlementAmount = value;
    }

    /**
     * Gets the value of the impactDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impactDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpactDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpactDetailType }
     * 
     * 
     */
    public List<ImpactDetailType> getImpactDetail() {
        if (impactDetail == null) {
            impactDetail = new ArrayList<ImpactDetailType>();
        }
        return this.impactDetail;
    }

    /**
     * Gets the value of the impactedChildOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impactedChildOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpactedChildOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpactedChildOrganizationType }
     * 
     * 
     */
    public List<ImpactedChildOrganizationType> getImpactedChildOrganization() {
        if (impactedChildOrganization == null) {
            impactedChildOrganization = new ArrayList<ImpactedChildOrganizationType>();
        }
        return this.impactedChildOrganization;
    }

    /**
     * Gets the value of the impactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactAddress() {
        return impactAddress;
    }

    /**
     * Sets the value of the impactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactAddress(String value) {
        this.impactAddress = value;
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
     * Gets the value of the unabletoLocateSubjectIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnabletoLocateSubjectIndicator() {
        return unabletoLocateSubjectIndicator;
    }

    /**
     * Sets the value of the unabletoLocateSubjectIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnabletoLocateSubjectIndicator(Boolean value) {
        this.unabletoLocateSubjectIndicator = value;
    }

    /**
     * Gets the value of the damagedAssetsDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damagedAssetsDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamagedAssetsDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DamagedAssetsDetailType }
     * 
     * 
     */
    public List<DamagedAssetsDetailType> getDamagedAssetsDetail() {
        if (damagedAssetsDetail == null) {
            damagedAssetsDetail = new ArrayList<DamagedAssetsDetailType>();
        }
        return this.damagedAssetsDetail;
    }

    /**
     * Gets the value of the impactedPremisesDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impactedPremisesDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpactedPremisesDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpactedPremisesDetailType }
     * 
     * 
     */
    public List<ImpactedPremisesDetailType> getImpactedPremisesDetail() {
        if (impactedPremisesDetail == null) {
            impactedPremisesDetail = new ArrayList<ImpactedPremisesDetailType>();
        }
        return this.impactedPremisesDetail;
    }

}
