
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the several legal proceedings under which a plaintiff attempts to recover satisfaction or remedy from the defendant for damages.
 *          
 * 
 * <p>Java class for LawSuitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LawSuitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="RolePlayerDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}LitigationRolePlayerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CourtDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}LitigationCourtDetail" minOccurs="0"/>
 *         &lt;element name="EventText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EventDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SubjectTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LawSuitType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeText",
    "filingDate",
    "filingReferenceNumber",
    "rolePlayerDetail",
    "courtDetail",
    "eventText",
    "eventDate",
    "subjectTypeText"
})
public class LawSuitType {

    @XmlElement(name = "FilingTypeText")
    protected String filingTypeText;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "RolePlayerDetail")
    protected List<LitigationRolePlayerType> rolePlayerDetail;
    @XmlElement(name = "CourtDetail")
    protected LitigationCourtDetail courtDetail;
    @XmlElement(name = "EventText")
    protected List<String> eventText;
    @XmlElement(name = "EventDate")
    protected DNBDateType eventDate;
    @XmlElement(name = "SubjectTypeText")
    protected DNBDecodedStringType subjectTypeText;

    /**
     * Gets the value of the filingTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTypeText() {
        return filingTypeText;
    }

    /**
     * Sets the value of the filingTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTypeText(String value) {
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
     * Gets the value of the rolePlayerDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LitigationRolePlayerType }
     * 
     * 
     */
    public List<LitigationRolePlayerType> getRolePlayerDetail() {
        if (rolePlayerDetail == null) {
            rolePlayerDetail = new ArrayList<LitigationRolePlayerType>();
        }
        return this.rolePlayerDetail;
    }

    /**
     * Gets the value of the courtDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LitigationCourtDetail }
     *     
     */
    public LitigationCourtDetail getCourtDetail() {
        return courtDetail;
    }

    /**
     * Sets the value of the courtDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LitigationCourtDetail }
     *     
     */
    public void setCourtDetail(LitigationCourtDetail value) {
        this.courtDetail = value;
    }

    /**
     * Gets the value of the eventText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEventText() {
        if (eventText == null) {
            eventText = new ArrayList<String>();
        }
        return this.eventText;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEventDate(DNBDateType value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the subjectTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSubjectTypeText() {
        return subjectTypeText;
    }

    /**
     * Sets the value of the subjectTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSubjectTypeText(DNBDecodedStringType value) {
        this.subjectTypeText = value;
    }

}
