
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreOverrideReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreOverrideReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreOverrideReasonText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreOverrideReason", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "scoreOverrideReasonText"
})
public class ScoreOverrideReason {

    @XmlElement(name = "ScoreOverrideReasonText")
    protected DNBDecodedStringType scoreOverrideReasonText;

    /**
     * Gets the value of the scoreOverrideReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getScoreOverrideReasonText() {
        return scoreOverrideReasonText;
    }

    /**
     * Sets the value of the scoreOverrideReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setScoreOverrideReasonText(DNBDecodedStringType value) {
        this.scoreOverrideReasonText = value;
    }

}
