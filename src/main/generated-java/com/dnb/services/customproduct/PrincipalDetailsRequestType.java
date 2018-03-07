
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="AlsoKnownByName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="PrincipalAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RequestAddress" minOccurs="0"/>
 *         &lt;element name="PrincipalPreviousAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RequestAddress" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}TelecommunicationNumberSimpleType" minOccurs="0"/>
 *         &lt;element name="PrincipalImportanceLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
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
@XmlType(name = "PrincipalDetailsRequestType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "principalName",
    "alsoKnownByName",
    "principalAddress",
    "principalPreviousAddress",
    "birthDate",
    "principalIdentificationNumberDetail",
    "telephoneNumber",
    "principalImportanceLevel"
})
public class PrincipalDetailsRequestType {

    @XmlElement(name = "PrincipalName")
    protected IndividualNameType principalName;
    @XmlElement(name = "AlsoKnownByName")
    protected IndividualNameType alsoKnownByName;
    @XmlElement(name = "PrincipalAddress")
    protected RequestAddress principalAddress;
    @XmlElement(name = "PrincipalPreviousAddress")
    protected RequestAddress principalPreviousAddress;
    @XmlElement(name = "BirthDate")
    protected DNBDateType birthDate;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected List<PrincipalIdentificationNumberType> principalIdentificationNumberDetail;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberSimpleType telephoneNumber;
    @XmlElement(name = "PrincipalImportanceLevel")
    protected Integer principalImportanceLevel;

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setPrincipalName(IndividualNameType value) {
        this.principalName = value;
    }

    /**
     * Gets the value of the alsoKnownByName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getAlsoKnownByName() {
        return alsoKnownByName;
    }

    /**
     * Sets the value of the alsoKnownByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setAlsoKnownByName(IndividualNameType value) {
        this.alsoKnownByName = value;
    }

    /**
     * Gets the value of the principalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAddress }
     *     
     */
    public RequestAddress getPrincipalAddress() {
        return principalAddress;
    }

    /**
     * Sets the value of the principalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAddress }
     *     
     */
    public void setPrincipalAddress(RequestAddress value) {
        this.principalAddress = value;
    }

    /**
     * Gets the value of the principalPreviousAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAddress }
     *     
     */
    public RequestAddress getPrincipalPreviousAddress() {
        return principalPreviousAddress;
    }

    /**
     * Sets the value of the principalPreviousAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAddress }
     *     
     */
    public void setPrincipalPreviousAddress(RequestAddress value) {
        this.principalPreviousAddress = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setBirthDate(DNBDateType value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the principalIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalIdentificationNumberType }
     * 
     * 
     */
    public List<PrincipalIdentificationNumberType> getPrincipalIdentificationNumberDetail() {
        if (principalIdentificationNumberDetail == null) {
            principalIdentificationNumberDetail = new ArrayList<PrincipalIdentificationNumberType>();
        }
        return this.principalIdentificationNumberDetail;
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
     * Gets the value of the principalImportanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrincipalImportanceLevel() {
        return principalImportanceLevel;
    }

    /**
     * Sets the value of the principalImportanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrincipalImportanceLevel(Integer value) {
        this.principalImportanceLevel = value;
    }

}
