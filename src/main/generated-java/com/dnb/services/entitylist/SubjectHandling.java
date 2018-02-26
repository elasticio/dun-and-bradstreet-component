
package com.dnb.services.entitylist;

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
 *         &lt;element name="SubjectHandlingText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectHandling", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "subjectHandlingText"
})
public class SubjectHandling {

    @XmlElement(name = "SubjectHandlingText", required = true)
    protected DNBDecodedStringType subjectHandlingText;

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

}
