
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiskIncidence" type="{http://services.dnb.com/CustomProductServiceV2.0}RiskIncidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreModelVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OverallRiskIncidencePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreReferenceType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "riskIncidence",
    "scoreModelVersionNumber",
    "overallRiskIncidencePercentage"
})
public class ScoreReferenceType {

    @XmlElement(name = "RiskIncidence")
    protected List<RiskIncidence> riskIncidence;
    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "OverallRiskIncidencePercentage")
    protected String overallRiskIncidencePercentage;

    /**
     * Gets the value of the riskIncidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskIncidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskIncidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskIncidence }
     * 
     * 
     */
    public List<RiskIncidence> getRiskIncidence() {
        if (riskIncidence == null) {
            riskIncidence = new ArrayList<RiskIncidence>();
        }
        return this.riskIncidence;
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
     * Gets the value of the overallRiskIncidencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallRiskIncidencePercentage() {
        return overallRiskIncidencePercentage;
    }

    /**
     * Sets the value of the overallRiskIncidencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallRiskIncidencePercentage(String value) {
        this.overallRiskIncidencePercentage = value;
    }

}
