
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectHandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectHandling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectHandlingText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="SubjectHandlingEffectiveDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SubjectHandlingExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectHandling", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectHandlingText",
    "subjectHandlingEffectiveDate",
    "subjectHandlingExpirationDate"
})
public class SubjectHandling {

    @XmlElement(name = "SubjectHandlingText", required = true)
    protected DNBDecodedStringType subjectHandlingText;
    @XmlElement(name = "SubjectHandlingEffectiveDate")
    protected DNBDateType subjectHandlingEffectiveDate;
    @XmlElement(name = "SubjectHandlingExpirationDate")
    protected DNBDateType subjectHandlingExpirationDate;

    /**
     * Gets the value of the subjectHandlingText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSubjectHandlingText() {
        return subjectHandlingText;
    }

    /**
     * Sets the value of the subjectHandlingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSubjectHandlingText(DNBDecodedStringType value) {
        this.subjectHandlingText = value;
    }

    /**
     * Gets the value of the subjectHandlingEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSubjectHandlingEffectiveDate() {
        return subjectHandlingEffectiveDate;
    }

    /**
     * Sets the value of the subjectHandlingEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSubjectHandlingEffectiveDate(DNBDateType value) {
        this.subjectHandlingEffectiveDate = value;
    }

    /**
     * Gets the value of the subjectHandlingExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSubjectHandlingExpirationDate() {
        return subjectHandlingExpirationDate;
    }

    /**
     * Sets the value of the subjectHandlingExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSubjectHandlingExpirationDate(DNBDateType value) {
        this.subjectHandlingExpirationDate = value;
    }

}
