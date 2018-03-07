
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data that allows the customer to specify identifying information about the subject being inquired.
 *          
 * 
 * <p>Java class for InquiryDetailForAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryDetailForAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimarySubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecondarySubjectID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubjectName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://services.dnb.com/CustomProductServiceV2.0}LocationDetailForAlert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryDetailForAlert", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "primarySubjectID",
    "secondarySubjectID",
    "subjectName",
    "location"
})
public class InquiryDetailForAlert {

    @XmlElement(name = "PrimarySubjectID")
    protected String primarySubjectID;
    @XmlElement(name = "SecondarySubjectID")
    protected String secondarySubjectID;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "Location")
    protected LocationDetailForAlert location;

    /**
     * Gets the value of the primarySubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySubjectID() {
        return primarySubjectID;
    }

    /**
     * Sets the value of the primarySubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySubjectID(String value) {
        this.primarySubjectID = value;
    }

    /**
     * Gets the value of the secondarySubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySubjectID() {
        return secondarySubjectID;
    }

    /**
     * Sets the value of the secondarySubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySubjectID(String value) {
        this.secondarySubjectID = value;
    }

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailForAlert }
     *     
     */
    public LocationDetailForAlert getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailForAlert }
     *     
     */
    public void setLocation(LocationDetailForAlert value) {
        this.location = value;
    }

}
