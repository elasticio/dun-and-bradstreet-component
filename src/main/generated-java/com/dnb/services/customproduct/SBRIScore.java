
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBRIScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBRIScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreUseCautionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ScoreReason" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScoreModelVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BorrowerScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBRIScore", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "scoreUseCautionText",
    "scoreReason",
    "scoreCardID",
    "scoreModelVersionNumber",
    "borrowerScore"
})
public class SBRIScore {

    @XmlElement(name = "ScoreUseCautionText")
    protected DNBDecodedStringType scoreUseCautionText;
    @XmlElement(name = "ScoreReason")
    protected List<ScoreReason> scoreReason;
    @XmlElement(name = "ScoreCardID")
    protected String scoreCardID;
    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "BorrowerScore")
    protected String borrowerScore;

    /**
     * Gets the value of the scoreUseCautionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getScoreUseCautionText() {
        return scoreUseCautionText;
    }

    /**
     * Sets the value of the scoreUseCautionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setScoreUseCautionText(DNBDecodedStringType value) {
        this.scoreUseCautionText = value;
    }

    /**
     * Gets the value of the scoreReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreReason }
     * 
     * 
     */
    public List<ScoreReason> getScoreReason() {
        if (scoreReason == null) {
            scoreReason = new ArrayList<ScoreReason>();
        }
        return this.scoreReason;
    }

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
     * Gets the value of the borrowerScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerScore() {
        return borrowerScore;
    }

    /**
     * Sets the value of the borrowerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerScore(String value) {
        this.borrowerScore = value;
    }

}
