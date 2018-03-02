
package com.dnb.services.ratings.actions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Records the most recent risk scores that are assigned to this organization on a given date/time using a scoring model that help predict the likelihood that the organization will not pay other commercial businesses, which affects financial institutions and other industries that extend trade credit.
 *          
 * 
 * <p>Java class for TotalLossPredictorScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalLossPredictorScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreTimestamp" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="RawScore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClassScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClassScoreDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidencePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreCommentary" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreCommentary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreOverrideReason" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreOverrideReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalLossPredictorScoreType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "scoreTimestamp",
    "rawScore",
    "classScore",
    "classScoreDescription",
    "riskIncidencePercentage",
    "scoreCommentary",
    "scoreOverrideReason"
})
public class TotalLossPredictorScoreType {

    @XmlElement(name = "ScoreTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scoreTimestamp;
    @XmlElement(name = "RawScore")
    protected Long rawScore;
    @XmlElement(name = "ClassScore")
    protected String classScore;
    @XmlElement(name = "ClassScoreDescription")
    protected String classScoreDescription;
    @XmlElement(name = "RiskIncidencePercentage")
    protected BigDecimal riskIncidencePercentage;
    @XmlElement(name = "ScoreCommentary")
    protected List<ScoreCommentary> scoreCommentary;
    @XmlElement(name = "ScoreOverrideReason")
    protected List<ScoreOverrideReason> scoreOverrideReason;

    /**
     * Gets the value of the scoreTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScoreTimestamp() {
        return scoreTimestamp;
    }

    /**
     * Sets the value of the scoreTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScoreTimestamp(XMLGregorianCalendar value) {
        this.scoreTimestamp = value;
    }

    /**
     * Gets the value of the rawScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRawScore() {
        return rawScore;
    }

    /**
     * Sets the value of the rawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRawScore(Long value) {
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
     * Gets the value of the classScoreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassScoreDescription() {
        return classScoreDescription;
    }

    /**
     * Sets the value of the classScoreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassScoreDescription(String value) {
        this.classScoreDescription = value;
    }

    /**
     * Gets the value of the riskIncidencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskIncidencePercentage() {
        return riskIncidencePercentage;
    }

    /**
     * Sets the value of the riskIncidencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskIncidencePercentage(BigDecimal value) {
        this.riskIncidencePercentage = value;
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

    /**
     * Gets the value of the scoreOverrideReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreOverrideReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreOverrideReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreOverrideReason }
     * 
     * 
     */
    public List<ScoreOverrideReason> getScoreOverrideReason() {
        if (scoreOverrideReason == null) {
            scoreOverrideReason = new ArrayList<ScoreOverrideReason>();
        }
        return this.scoreOverrideReason;
    }

}
