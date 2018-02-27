
package com.dnb.services.company;

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
 *         &lt;element name="EndIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubjectTypeText" type="{http://services.dnb.com/CompanyServiceV2.0}SubjectType" minOccurs="0"/>
 *         &lt;element name="SeniorPrincipalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatchBasisText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchBasis", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "endIndicator",
    "subjectTypeText",
    "seniorPrincipalIndicator",
    "matchBasisText"
})
public class MatchBasis {

    @XmlElement(name = "EndIndicator")
    protected Boolean endIndicator;
    @XmlElement(name = "SubjectTypeText")
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeText;
    @XmlElement(name = "SeniorPrincipalIndicator")
    protected Boolean seniorPrincipalIndicator;
    @XmlElement(name = "MatchBasisText")
    protected DNBDecodedStringType matchBasisText;

    /**
     * Gets the value of the endIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndIndicator() {
        return endIndicator;
    }

    /**
     * Sets the value of the endIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndIndicator(Boolean value) {
        this.endIndicator = value;
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

    /**
     * Gets the value of the seniorPrincipalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeniorPrincipalIndicator() {
        return seniorPrincipalIndicator;
    }

    /**
     * Sets the value of the seniorPrincipalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeniorPrincipalIndicator(Boolean value) {
        this.seniorPrincipalIndicator = value;
    }

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

}
