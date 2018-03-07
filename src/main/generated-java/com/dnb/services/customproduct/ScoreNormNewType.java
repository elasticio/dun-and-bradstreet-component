
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreNormNewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreNormNewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreModelText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *         &lt;element name="IndustryNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryNormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreNormNewType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "scoreModelText",
    "industryNorm"
})
public class ScoreNormNewType {

    @XmlElement(name = "ScoreModelText")
    protected DNBDecodedStringNewType scoreModelText;
    @XmlElement(name = "IndustryNorm")
    protected IndustryNormType industryNorm;

    /**
     * Gets the value of the scoreModelText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getScoreModelText() {
        return scoreModelText;
    }

    /**
     * Sets the value of the scoreModelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setScoreModelText(DNBDecodedStringNewType value) {
        this.scoreModelText = value;
    }

    /**
     * Gets the value of the industryNorm property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryNormType }
     *     
     */
    public IndustryNormType getIndustryNorm() {
        return industryNorm;
    }

    /**
     * Sets the value of the industryNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryNormType }
     *     
     */
    public void setIndustryNorm(IndustryNormType value) {
        this.industryNorm = value;
    }

}
