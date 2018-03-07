
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalFailureRiskScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalFailureRiskScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClassScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreModelVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TargetIndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryIndustryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalFailureRiskScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rawScore",
    "classScore",
    "scoreModelVersionNumber",
    "targetIndustryCode"
})
public class GlobalFailureRiskScoreType {

    @XmlElement(name = "RawScore")
    protected String rawScore;
    @XmlElement(name = "ClassScore")
    protected String classScore;
    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "TargetIndustryCode")
    protected PrimaryIndustryCodeType targetIndustryCode;

    /**
     * Gets the value of the rawScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawScore() {
        return rawScore;
    }

    /**
     * Sets the value of the rawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawScore(String value) {
        this.rawScore = value;
    }

    /**
     * Gets the value of the classScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassScore() {
        return classScore;
    }

    /**
     * Sets the value of the classScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassScore(String value) {
        this.classScore = value;
    }

    /**
     * Gets the value of the scoreModelVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreModelVersionNumber() {
        return scoreModelVersionNumber;
    }

    /**
     * Sets the value of the scoreModelVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreModelVersionNumber(String value) {
        this.scoreModelVersionNumber = value;
    }

    /**
     * Gets the value of the targetIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryIndustryCodeType }
     *     
     */
    public PrimaryIndustryCodeType getTargetIndustryCode() {
        return targetIndustryCode;
    }

    /**
     * Sets the value of the targetIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryIndustryCodeType }
     *     
     */
    public void setTargetIndustryCode(PrimaryIndustryCodeType value) {
        this.targetIndustryCode = value;
    }

}
