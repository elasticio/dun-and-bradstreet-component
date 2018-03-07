
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskIncidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskIncidence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidenceScoreableUniverseSubjectPercentage" minOccurs="0">
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
 *         &lt;element name="RiskIncidenceRelativeToOverallRiskIncidencePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="16"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidenceRelativeToOverallRiskIncidenceText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskIncidence", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "classScore",
    "riskIncidenceScoreableUniverseSubjectPercentage",
    "riskIncidencePercentage",
    "riskIncidenceRelativeToOverallRiskIncidencePercentage",
    "riskIncidenceRelativeToOverallRiskIncidenceText"
})
public class RiskIncidence {

    @XmlElement(name = "ClassScore")
    protected String classScore;
    @XmlElement(name = "RiskIncidenceScoreableUniverseSubjectPercentage")
    protected BigDecimal riskIncidenceScoreableUniverseSubjectPercentage;
    @XmlElement(name = "RiskIncidencePercentage")
    protected BigDecimal riskIncidencePercentage;
    @XmlElement(name = "RiskIncidenceRelativeToOverallRiskIncidencePercentage")
    protected BigDecimal riskIncidenceRelativeToOverallRiskIncidencePercentage;
    @XmlElement(name = "RiskIncidenceRelativeToOverallRiskIncidenceText")
    protected String riskIncidenceRelativeToOverallRiskIncidenceText;

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
     * Gets the value of the riskIncidenceScoreableUniverseSubjectPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskIncidenceScoreableUniverseSubjectPercentage() {
        return riskIncidenceScoreableUniverseSubjectPercentage;
    }

    /**
     * Sets the value of the riskIncidenceScoreableUniverseSubjectPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskIncidenceScoreableUniverseSubjectPercentage(BigDecimal value) {
        this.riskIncidenceScoreableUniverseSubjectPercentage = value;
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
     * Gets the value of the riskIncidenceRelativeToOverallRiskIncidencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskIncidenceRelativeToOverallRiskIncidencePercentage() {
        return riskIncidenceRelativeToOverallRiskIncidencePercentage;
    }

    /**
     * Sets the value of the riskIncidenceRelativeToOverallRiskIncidencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskIncidenceRelativeToOverallRiskIncidencePercentage(BigDecimal value) {
        this.riskIncidenceRelativeToOverallRiskIncidencePercentage = value;
    }

    /**
     * Gets the value of the riskIncidenceRelativeToOverallRiskIncidenceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskIncidenceRelativeToOverallRiskIncidenceText() {
        return riskIncidenceRelativeToOverallRiskIncidenceText;
    }

    /**
     * Sets the value of the riskIncidenceRelativeToOverallRiskIncidenceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskIncidenceRelativeToOverallRiskIncidenceText(String value) {
        this.riskIncidenceRelativeToOverallRiskIncidenceText = value;
    }

}
