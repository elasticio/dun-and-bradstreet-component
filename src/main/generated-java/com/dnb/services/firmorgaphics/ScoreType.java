
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Contains all the sub-sections and elements belonging to the Scores Adv Data bucket.
 *          
 * 
 * <p>Java class for ScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketingRiskClassText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "marketingRiskClassText"
})
@XmlSeeAlso({
    CommercialCreditScoreType.class
})
public class ScoreType {

    @XmlElement(name = "MarketingRiskClassText")
    protected DNBDecodedStringType marketingRiskClassText;

    /**
     * Gets the value of the marketingRiskClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getMarketingRiskClassText() {
        return marketingRiskClassText;
    }

    /**
     * Sets the value of the marketingRiskClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setMarketingRiskClassText(DNBDecodedStringType value) {
        this.marketingRiskClassText = value;
    }

}
