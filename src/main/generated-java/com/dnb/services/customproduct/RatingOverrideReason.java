
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingOverrideReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingOverrideReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingOverrideReasonClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingOverrideReason", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "ratingOverrideReasonClassText"
})
public class RatingOverrideReason {

    @XmlElement(name = "RatingOverrideReasonClassText")
    protected DNBDecodedStringType ratingOverrideReasonClassText;

    /**
     * Gets the value of the ratingOverrideReasonClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRatingOverrideReasonClassText() {
        return ratingOverrideReasonClassText;
    }

    /**
     * Sets the value of the ratingOverrideReasonClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRatingOverrideReasonClassText(DNBDecodedStringType value) {
        this.ratingOverrideReasonClassText = value;
    }

}
