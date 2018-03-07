
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="ContactOrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenderText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ContactJobTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/CustomProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactMethodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ContactEventText" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactResult" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonSpecificContactText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CommunicationEventTextualComponents" type="{http://services.dnb.com/CustomProductServiceV2.0}CommunicationEventTextualComponents" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPositionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactEvent", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "contactDate",
    "contactName",
    "contactOrganizationName",
    "genderText",
    "contactJobTitle",
    "position",
    "contactMethodText",
    "contactEventText",
    "contactResult",
    "nonSpecificContactText",
    "communicationEventTextualComponents",
    "contactPositionText"
})
public class ContactEvent {

    @XmlElement(name = "ContactDate")
    protected DNBDateType contactDate;
    @XmlElement(name = "ContactName")
    protected IndividualNameType contactName;
    @XmlElement(name = "ContactOrganizationName")
    protected List<DNBStringType256> contactOrganizationName;
    @XmlElement(name = "GenderText")
    protected DNBDecodedStringType genderText;
    @XmlElement(name = "ContactJobTitle")
    protected List<String> contactJobTitle;
    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlElement(name = "ContactMethodText")
    protected DNBDecodedStringType contactMethodText;
    @XmlElement(name = "ContactEventText")
    protected List<TextEntryType> contactEventText;
    @XmlElement(name = "ContactResult")
    protected List<ContactResult> contactResult;
    @XmlElement(name = "NonSpecificContactText")
    protected DNBDecodedStringType nonSpecificContactText;
    @XmlElement(name = "CommunicationEventTextualComponents")
    protected List<CommunicationEventTextualComponents> communicationEventTextualComponents;
    @XmlElement(name = "ContactPositionText")
    protected List<DNBDecodedStringType> contactPositionText;

    /**
     * Gets the value of the contactDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getContactDate() {
        return contactDate;
    }

    /**
     * Sets the value of the contactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setContactDate(DNBDateType value) {
        this.contactDate = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setContactName(IndividualNameType value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactOrganizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactOrganizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBStringType256 }
     * 
     * 
     */
    public List<DNBStringType256> getContactOrganizationName() {
        if (contactOrganizationName == null) {
            contactOrganizationName = new ArrayList<DNBStringType256>();
        }
        return this.contactOrganizationName;
    }

    /**
     * Gets the value of the genderText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getGenderText() {
        return genderText;
    }

    /**
     * Sets the value of the genderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setGenderText(DNBDecodedStringType value) {
        this.genderText = value;
    }

    /**
     * Gets the value of the contactJobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactJobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactJobTitle() {
        if (contactJobTitle == null) {
            contactJobTitle = new ArrayList<String>();
        }
        return this.contactJobTitle;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

    /**
     * Gets the value of the contactMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getContactMethodText() {
        return contactMethodText;
    }

    /**
     * Sets the value of the contactMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setContactMethodText(DNBDecodedStringType value) {
        this.contactMethodText = value;
    }

    /**
     * Gets the value of the contactEventText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEventText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEventText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getContactEventText() {
        if (contactEventText == null) {
            contactEventText = new ArrayList<TextEntryType>();
        }
        return this.contactEventText;
    }

    /**
     * Gets the value of the contactResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactResult }
     * 
     * 
     */
    public List<ContactResult> getContactResult() {
        if (contactResult == null) {
            contactResult = new ArrayList<ContactResult>();
        }
        return this.contactResult;
    }

    /**
     * Gets the value of the nonSpecificContactText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNonSpecificContactText() {
        return nonSpecificContactText;
    }

    /**
     * Sets the value of the nonSpecificContactText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNonSpecificContactText(DNBDecodedStringType value) {
        this.nonSpecificContactText = value;
    }

    /**
     * Gets the value of the communicationEventTextualComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationEventTextualComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationEventTextualComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationEventTextualComponents }
     * 
     * 
     */
    public List<CommunicationEventTextualComponents> getCommunicationEventTextualComponents() {
        if (communicationEventTextualComponents == null) {
            communicationEventTextualComponents = new ArrayList<CommunicationEventTextualComponents>();
        }
        return this.communicationEventTextualComponents;
    }

    /**
     * Gets the value of the contactPositionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPositionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPositionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getContactPositionText() {
        if (contactPositionText == null) {
            contactPositionText = new ArrayList<DNBDecodedStringType>();
        }
        return this.contactPositionText;
    }

}
