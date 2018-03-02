
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierEvaluationRiskScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierEvaluationRiskScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiskScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreCommentary" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreCommentary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierEvaluationRiskScore", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "riskScore",
    "scoreCommentary"
})
public class SupplierEvaluationRiskScore {

    @XmlElement(name = "RiskScore")
    protected String riskScore;
    @XmlElement(name = "ScoreCommentary")
    protected List<ScoreCommentary> scoreCommentary;

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
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
