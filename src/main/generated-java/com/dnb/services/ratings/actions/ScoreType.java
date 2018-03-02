
package com.dnb.services.ratings.actions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="NationalPercentile" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
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
 *         &lt;element name="RiskIncidenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AverageNationalRiskIncidencePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AverageNationalRiskIncidenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AverageNationalRiskIncidenceCountSizeUnitText" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ScoreCommentary" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreCommentary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreModelVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreDate" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDateType" minOccurs="0"/>
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
@XmlType(name = "ScoreType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "rawScore",
    "classScore",
    "classScoreDescription",
    "nationalPercentile",
    "riskIncidencePercentage",
    "riskIncidenceCount",
    "averageNationalRiskIncidencePercentage",
    "averageNationalRiskIncidenceCount",
    "averageNationalRiskIncidenceCountSizeUnitText",
    "scoreCommentary",
    "scoreModelVersionNumber",
    "scoreDate",
    "scoreOverrideReason"
})
@XmlSeeAlso({
    CommercialCreditScoreType.class
})
public class ScoreType {

    @XmlElement(name = "RawScore")
    protected Long rawScore;
    @XmlElement(name = "ClassScore")
    protected String classScore;
    @XmlElement(name = "ClassScoreDescription")
    protected String classScoreDescription;
    @XmlElement(name = "NationalPercentile")
    protected BigDecimal nationalPercentile;
    @XmlElement(name = "RiskIncidencePercentage")
    protected BigDecimal riskIncidencePercentage;
    @XmlElement(name = "RiskIncidenceCount")
    protected Integer riskIncidenceCount;
    @XmlElement(name = "AverageNationalRiskIncidencePercentage")
    protected BigDecimal averageNationalRiskIncidencePercentage;
    @XmlElement(name = "AverageNationalRiskIncidenceCount")
    protected Integer averageNationalRiskIncidenceCount;
    @XmlElement(name = "AverageNationalRiskIncidenceCountSizeUnitText")
    protected Long averageNationalRiskIncidenceCountSizeUnitText;
    @XmlElement(name = "ScoreCommentary")
    protected List<ScoreCommentary> scoreCommentary;
    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "ScoreDate")
    protected DNBDateType scoreDate;
    @XmlElement(name = "ScoreOverrideReason")
    protected List<ScoreOverrideReason> scoreOverrideReason;

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
     * Gets the value of the nationalPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNationalPercentile() {
        return nationalPercentile;
    }

    /**
     * Sets the value of the nationalPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNationalPercentile(BigDecimal value) {
        this.nationalPercentile = value;
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
     * Gets the value of the riskIncidenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiskIncidenceCount() {
        return riskIncidenceCount;
    }

    /**
     * Sets the value of the riskIncidenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiskIncidenceCount(Integer value) {
        this.riskIncidenceCount = value;
    }

    /**
     * Gets the value of the averageNationalRiskIncidencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageNationalRiskIncidencePercentage() {
        return averageNationalRiskIncidencePercentage;
    }

    /**
     * Sets the value of the averageNationalRiskIncidencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageNationalRiskIncidencePercentage(BigDecimal value) {
        this.averageNationalRiskIncidencePercentage = value;
    }

    /**
     * Gets the value of the averageNationalRiskIncidenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageNationalRiskIncidenceCount() {
        return averageNationalRiskIncidenceCount;
    }

    /**
     * Sets the value of the averageNationalRiskIncidenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageNationalRiskIncidenceCount(Integer value) {
        this.averageNationalRiskIncidenceCount = value;
    }

    /**
     * Gets the value of the averageNationalRiskIncidenceCountSizeUnitText property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAverageNationalRiskIncidenceCountSizeUnitText() {
        return averageNationalRiskIncidenceCountSizeUnitText;
    }

    /**
     * Sets the value of the averageNationalRiskIncidenceCountSizeUnitText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAverageNationalRiskIncidenceCountSizeUnitText(Long value) {
        this.averageNationalRiskIncidenceCountSizeUnitText = value;
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
     * Gets the value of the scoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getScoreDate() {
        return scoreDate;
    }

    /**
     * Sets the value of the scoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setScoreDate(DNBDateType value) {
        this.scoreDate = value;
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
