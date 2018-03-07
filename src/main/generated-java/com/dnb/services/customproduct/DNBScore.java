
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="ScoreValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="20"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreModelText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ScoreCardText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBScore", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "scoreTypeText",
    "scoreValue",
    "scoreModelText",
    "scoreCardText"
})
public class DNBScore {

    @XmlElement(name = "ScoreTypeText", required = true)
    protected DNBDecodedStringType scoreTypeText;
    @XmlElement(name = "ScoreValue", required = true)
    protected BigDecimal scoreValue;
    @XmlElement(name = "ScoreModelText")
    protected DNBDecodedStringType scoreModelText;
    @XmlElement(name = "ScoreCardText")
    protected DNBDecodedStringType scoreCardText;

    /**
     * Gets the value of the scoreTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getScoreTypeText() {
        return scoreTypeText;
    }

    /**
     * Sets the value of the scoreTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setScoreTypeText(DNBDecodedStringType value) {
        this.scoreTypeText = value;
    }

    /**
     * Gets the value of the scoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScoreValue() {
        return scoreValue;
    }

    /**
     * Sets the value of the scoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScoreValue(BigDecimal value) {
        this.scoreValue = value;
    }

    /**
     * Gets the value of the scoreModelText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getScoreModelText() {
        return scoreModelText;
    }

    /**
     * Sets the value of the scoreModelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setScoreModelText(DNBDecodedStringType value) {
        this.scoreModelText = value;
    }

    /**
     * Gets the value of the scoreCardText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getScoreCardText() {
        return scoreCardText;
    }

    /**
     * Sets the value of the scoreCardText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setScoreCardText(DNBDecodedStringType value) {
        this.scoreCardText = value;
    }

}
