
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the scores that are assigned to this organization using a scoring model that helps predict the likelihood of a risk based on the custom parameters specified by the customer.
 *          
 * 
 * <p>Java class for CustomScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreModelText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="ScoreTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="RawScore" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CustomScoreParameters" type="{http://services.dnb.com/CustomProductServiceV2.0}DecisionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreCommentary" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreCommentary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomScore", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "scoreModelText",
    "scoreTypeText",
    "rawScore",
    "customScoreParameters",
    "scoreCommentary"
})
public class CustomScore {

    @XmlElement(name = "ScoreModelText", required = true)
    protected DNBDecodedStringType scoreModelText;
    @XmlElement(name = "ScoreTypeText", required = true)
    protected DNBDecodedStringType scoreTypeText;
    @XmlElement(name = "RawScore")
    protected long rawScore;
    @XmlElement(name = "CustomScoreParameters")
    protected List<DecisionParameter> customScoreParameters;
    @XmlElement(name = "ScoreCommentary")
    protected List<ScoreCommentary> scoreCommentary;

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
     * Gets the value of the rawScore property.
     * 
     */
    public long getRawScore() {
        return rawScore;
    }

    /**
     * Sets the value of the rawScore property.
     * 
     */
    public void setRawScore(long value) {
        this.rawScore = value;
    }

    /**
     * Gets the value of the customScoreParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customScoreParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomScoreParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionParameter }
     * 
     * 
     */
    public List<DecisionParameter> getCustomScoreParameters() {
        if (customScoreParameters == null) {
            customScoreParameters = new ArrayList<DecisionParameter>();
        }
        return this.customScoreParameters;
    }

    /**
     * Gets the value of the scoreCommentary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreCommentary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreCommentary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreCommentary }
     * 
     * 
     */
    public List<ScoreCommentary> getScoreCommentary() {
        if (scoreCommentary == null) {
            scoreCommentary = new ArrayList<ScoreCommentary>();
        }
        return this.scoreCommentary;
    }

}
