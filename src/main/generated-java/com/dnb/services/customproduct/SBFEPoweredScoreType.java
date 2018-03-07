
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBFEPoweredScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBFEPoweredScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PowerScore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ScoreReason1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScoreReason2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScoreReason3Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBFEPoweredScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "scoreCardID",
    "powerScore",
    "scoreReason1Code",
    "scoreReason2Code",
    "scoreReason3Code"
})
public class SBFEPoweredScoreType {

    @XmlElement(name = "ScoreCardID")
    protected String scoreCardID;
    @XmlElement(name = "PowerScore")
    protected Long powerScore;
    @XmlElement(name = "ScoreReason1Code")
    protected String scoreReason1Code;
    @XmlElement(name = "ScoreReason2Code")
    protected String scoreReason2Code;
    @XmlElement(name = "ScoreReason3Code")
    protected String scoreReason3Code;

    /**
     * Gets the value of the scoreCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreCardID() {
        return scoreCardID;
    }

    /**
     * Sets the value of the scoreCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreCardID(String value) {
        this.scoreCardID = value;
    }

    /**
     * Gets the value of the powerScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPowerScore() {
        return powerScore;
    }

    /**
     * Sets the value of the powerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPowerScore(Long value) {
        this.powerScore = value;
    }

    /**
     * Gets the value of the scoreReason1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreReason1Code() {
        return scoreReason1Code;
    }

    /**
     * Sets the value of the scoreReason1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreReason1Code(String value) {
        this.scoreReason1Code = value;
    }

    /**
     * Gets the value of the scoreReason2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreReason2Code() {
        return scoreReason2Code;
    }

    /**
     * Sets the value of the scoreReason2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreReason2Code(String value) {
        this.scoreReason2Code = value;
    }

    /**
     * Gets the value of the scoreReason3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreReason3Code() {
        return scoreReason3Code;
    }

    /**
     * Sets the value of the scoreReason3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreReason3Code(String value) {
        this.scoreReason3Code = value;
    }

}
