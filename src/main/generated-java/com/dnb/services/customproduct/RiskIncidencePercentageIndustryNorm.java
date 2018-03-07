
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskIncidencePercentageIndustryNorm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskIncidencePercentageIndustryNorm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}NormType">
 *       &lt;sequence>
 *         &lt;element name="IndustryDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="RiskIncidenceMaximumRangeRawScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidenceMinimumRangeRawScore" minOccurs="0">
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
@XmlType(name = "RiskIncidencePercentageIndustryNorm", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryDescriptionText",
    "riskIncidenceMaximumRangeRawScore",
    "riskIncidenceMinimumRangeRawScore"
})
public class RiskIncidencePercentageIndustryNorm
    extends NormType
{

    @XmlElement(name = "IndustryDescriptionText")
    protected String industryDescriptionText;
    @XmlElement(name = "RiskIncidenceMaximumRangeRawScore")
    protected String riskIncidenceMaximumRangeRawScore;
    @XmlElement(name = "RiskIncidenceMinimumRangeRawScore")
    protected String riskIncidenceMinimumRangeRawScore;

    /**
     * Gets the value of the industryDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryDescriptionText() {
        return industryDescriptionText;
    }

    /**
     * Sets the value of the industryDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryDescriptionText(String value) {
        this.industryDescriptionText = value;
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

}
