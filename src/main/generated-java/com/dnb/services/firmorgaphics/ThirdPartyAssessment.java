
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the assessment information pertaining to this principal as assigned by sources other than the D&B Worldwide Network (WWN).
 *          
 * 
 * <p>Java class for ThirdPartyAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssessmentTypeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyAssessment", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "assessmentValue",
    "assessmentTypeValue"
})
public class ThirdPartyAssessment {

    @XmlElement(name = "AssessmentValue")
    protected String assessmentValue;
    @XmlElement(name = "AssessmentTypeValue")
    protected String assessmentTypeValue;

    /**
     * Gets the value of the assessmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentValue() {
        return assessmentValue;
    }

    /**
     * Sets the value of the assessmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentValue(String value) {
        this.assessmentValue = value;
    }

    /**
     * Gets the value of the assessmentTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeValue() {
        return assessmentTypeValue;
    }

    /**
     * Sets the value of the assessmentTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeValue(String value) {
        this.assessmentTypeValue = value;
    }

}
