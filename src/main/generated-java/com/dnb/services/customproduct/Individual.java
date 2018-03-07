
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Subject">
 *       &lt;sequence>
 *         &lt;element name="BirthDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DeceasedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="MaritalStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="GenderText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="IndividualName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "birthDate",
    "deceasedDate",
    "maritalStatusText",
    "genderText",
    "individualName"
})
public class Individual
    extends Subject
{

    @XmlElement(name = "BirthDate")
    protected DNBDateType birthDate;
    @XmlElement(name = "DeceasedDate")
    protected DNBDateType deceasedDate;
    @XmlElement(name = "MaritalStatusText")
    protected DNBDecodedStringType maritalStatusText;
    @XmlElement(name = "GenderText")
    protected DNBDecodedStringType genderText;
    @XmlElement(name = "IndividualName")
    protected IndividualNameType individualName;

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
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDeceasedDate(DNBDateType value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the maritalStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getMaritalStatusText() {
        return maritalStatusText;
    }

    /**
     * Sets the value of the maritalStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setMaritalStatusText(DNBDecodedStringType value) {
        this.maritalStatusText = value;
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
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setIndividualName(IndividualNameType value) {
        this.individualName = value;
    }

}
