
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of a job that is or was held by the principal or manager using D&B standardized codes.  For instance, whether the position has been described to D&B as Financial Director, Finance Director, or Director of Finance, it will be mapped to a single code described as Financial Director.
 *          
 * 
 * <p>Java class for Position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositionText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "positionText"
})
public class Position {

    @XmlElement(name = "PositionText", required = true)
    protected DNBDecodedStringType positionText;

    /**
     * Gets the value of the positionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPositionText() {
        return positionText;
    }

    /**
     * Sets the value of the positionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPositionText(DNBDecodedStringType value) {
        this.positionText = value;
    }

}
