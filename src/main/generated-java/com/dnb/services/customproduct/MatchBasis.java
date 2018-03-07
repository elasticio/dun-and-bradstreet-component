
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchBasis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchBasis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchBasisText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SubjectTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchBasis", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "matchBasisText",
    "subjectTypeText"
})
public class MatchBasis {

    @XmlElement(name = "MatchBasisText")
    protected DNBDecodedStringType matchBasisText;
    @XmlElement(name = "SubjectTypeText")
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeText;

    /**
     * Gets the value of the matchBasisText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getMatchBasisText() {
        return matchBasisText;
    }

    /**
     * Sets the value of the matchBasisText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setMatchBasisText(DNBDecodedStringType value) {
        this.matchBasisText = value;
    }

    /**
     * Gets the value of the subjectTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectType }
     *     
     */
    public SubjectType getSubjectTypeText() {
        return subjectTypeText;
    }

    /**
     * Sets the value of the subjectTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectType }
     *     
     */
    public void setSubjectTypeText(SubjectType value) {
        this.subjectTypeText = value;
    }

}
