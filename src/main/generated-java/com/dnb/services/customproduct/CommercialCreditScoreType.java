
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialCreditScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialCreditScoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType">
 *       &lt;sequence>
 *         &lt;element name="RiskIncidenceMinimumRangeRawScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidenceMaximumRangeRawScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialCreditScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "riskIncidenceMinimumRangeRawScore",
    "riskIncidenceMaximumRangeRawScore"
})
@XmlSeeAlso({
    IndustryCommercialCreditScoreType.class
})
public class CommercialCreditScoreType
    extends ScoreType
{

    @XmlElement(name = "RiskIncidenceMinimumRangeRawScore")
    protected String riskIncidenceMinimumRangeRawScore;
    @XmlElement(name = "RiskIncidenceMaximumRangeRawScore")
    protected String riskIncidenceMaximumRangeRawScore;

    /**
     * Gets the value of the riskIncidenceMinimumRangeRawScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskIncidenceMinimumRangeRawScore() {
        return riskIncidenceMinimumRangeRawScore;
    }

    /**
     * Sets the value of the riskIncidenceMinimumRangeRawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskIncidenceMinimumRangeRawScore(String value) {
        this.riskIncidenceMinimumRangeRawScore = value;
    }

    /**
     * Gets the value of the riskIncidenceMaximumRangeRawScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskIncidenceMaximumRangeRawScore() {
        return riskIncidenceMaximumRangeRawScore;
    }

    /**
     * Sets the value of the riskIncidenceMaximumRangeRawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskIncidenceMaximumRangeRawScore(String value) {
        this.riskIncidenceMaximumRangeRawScore = value;
    }

}
