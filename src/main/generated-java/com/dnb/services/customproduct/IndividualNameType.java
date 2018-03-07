
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * A code that defines a language in which the specified product is available.
 *          
 * 
 * <p>Java class for IndividualNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualNameType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}SubjectName">
 *       &lt;sequence>
 *         &lt;element name="NamePrefix" type="{http://services.dnb.com/CustomProductServiceV2.0}NamePrefix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastNameFatherName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastNameMotherName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullName" type="{http://services.dnb.com/CustomProductServiceV2.0}FullName" minOccurs="0"/>
 *         &lt;element name="NameSuffix" type="{http://services.dnb.com/CustomProductServiceV2.0}NameSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecondMiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="WritingScriptISOAlpha4Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualNameType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "namePrefix",
    "firstName",
    "middleName",
    "lastName",
    "lastNameFatherName",
    "lastNameMotherName",
    "fullName",
    "nameSuffix",
    "secondMiddleName"
})
public class IndividualNameType
    extends SubjectName
{

    @XmlElement(name = "NamePrefix")
    protected List<NamePrefix> namePrefix;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LastNameFatherName")
    protected String lastNameFatherName;
    @XmlElement(name = "LastNameMotherName")
    protected String lastNameMotherName;
    @XmlElement(name = "FullName")
    protected FullName fullName;
    @XmlElement(name = "NameSuffix")
    protected List<NameSuffix> nameSuffix;
    @XmlElement(name = "SecondMiddleName")
    protected String secondMiddleName;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptISOAlpha4Code")
    protected String writingScriptISOAlpha4Code;

    /**
     * Gets the value of the namePrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamePrefix }
     * 
     * 
     */
    public List<NamePrefix> getNamePrefix() {
        if (namePrefix == null) {
            namePrefix = new ArrayList<NamePrefix>();
        }
        return this.namePrefix;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNameFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameFatherName() {
        return lastNameFatherName;
    }

    /**
     * Sets the value of the lastNameFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameFatherName(String value) {
        this.lastNameFatherName = value;
    }

    /**
     * Gets the value of the lastNameMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameMotherName() {
        return lastNameMotherName;
    }

    /**
     * Sets the value of the lastNameMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameMotherName(String value) {
        this.lastNameMotherName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName }
     *     
     */
    public FullName getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName }
     *     
     */
    public void setFullName(FullName value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameSuffix }
     * 
     * 
     */
    public List<NameSuffix> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<NameSuffix>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the secondMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondMiddleName() {
        return secondMiddleName;
    }

    /**
     * Sets the value of the secondMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondMiddleName(String value) {
        this.secondMiddleName = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguageCode(BigInteger value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the writingScriptISOAlpha4Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingScriptISOAlpha4Code() {
        return writingScriptISOAlpha4Code;
    }

    /**
     * Sets the value of the writingScriptISOAlpha4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingScriptISOAlpha4Code(String value) {
        this.writingScriptISOAlpha4Code = value;
    }

}
