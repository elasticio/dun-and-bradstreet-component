
package com.dnb.services.ratings.actions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records D&B's proprietary analytics information on the probability that an organization will go out of business in the next 12 months in comparison to all organizations within the same geography.
 *          
 * 
 * <p>Java class for ViabilityScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViabilityScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskLevelDescription" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="BadRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClassScoreIncidencePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViabilityScoreType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "classScore",
    "riskLevelDescription",
    "badRate",
    "classScoreIncidencePercentage"
})
@XmlSeeAlso({
    OverallViabilityScoreType.class,
    PortfolioComparisonScoreType.class
})
public class ViabilityScoreType {

    @XmlElement(name = "ClassScore")
    protected int classScore;
    @XmlElement(name = "RiskLevelDescription")
    protected DNBDecodedStringType riskLevelDescription;
    @XmlElement(name = "BadRate")
    protected BigDecimal badRate;
    @XmlElement(name = "ClassScoreIncidencePercentage")
    protected BigDecimal classScoreIncidencePercentage;

    /**
     * Gets the value of the classScore property.
     * 
     */
    public int getClassScore() {
        return classScore;
    }

    /**
     * Sets the value of the classScore property.
     * 
     */
    public void setClassScore(int value) {
        this.classScore = value;
    }

    /**
     * Gets the value of the riskLevelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRiskLevelDescription() {
        return riskLevelDescription;
    }

    /**
     * Sets the value of the riskLevelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRiskLevelDescription(DNBDecodedStringType value) {
        this.riskLevelDescription = value;
    }

    /**
     * Gets the value of the badRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBadRate() {
        return badRate;
    }

    /**
     * Sets the value of the badRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBadRate(BigDecimal value) {
        this.badRate = value;
    }

    /**
     * Gets the value of the classScoreIncidencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClassScoreIncidencePercentage() {
        return classScoreIncidencePercentage;
    }

    /**
     * Sets the value of the classScoreIncidencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClassScoreIncidencePercentage(BigDecimal value) {
        this.classScoreIncidencePercentage = value;
    }

}
