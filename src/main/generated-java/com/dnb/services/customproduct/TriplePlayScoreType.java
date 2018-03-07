
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriplePlayScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriplePlayScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompositeRiskScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ViabilityRatingBandValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLossPredictorBandValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DelinquencyScoreBandValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClusterValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SegmentValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
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
@XmlType(name = "TriplePlayScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "compositeRiskScore",
    "viabilityRatingBandValue",
    "totalLossPredictorBandValue",
    "delinquencyScoreBandValue",
    "clusterValue",
    "segmentValue",
    "segmentDescription"
})
public class TriplePlayScoreType {

    @XmlElement(name = "CompositeRiskScore")
    protected Integer compositeRiskScore;
    @XmlElement(name = "ViabilityRatingBandValue")
    protected Integer viabilityRatingBandValue;
    @XmlElement(name = "TotalLossPredictorBandValue")
    protected Integer totalLossPredictorBandValue;
    @XmlElement(name = "DelinquencyScoreBandValue")
    protected Integer delinquencyScoreBandValue;
    @XmlElement(name = "ClusterValue")
    protected String clusterValue;
    @XmlElement(name = "SegmentValue")
    protected Integer segmentValue;
    @XmlElement(name = "SegmentDescription")
    protected String segmentDescription;

    /**
     * Gets the value of the compositeRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompositeRiskScore() {
        return compositeRiskScore;
    }

    /**
     * Sets the value of the compositeRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompositeRiskScore(Integer value) {
        this.compositeRiskScore = value;
    }

    /**
     * Gets the value of the viabilityRatingBandValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViabilityRatingBandValue() {
        return viabilityRatingBandValue;
    }

    /**
     * Sets the value of the viabilityRatingBandValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViabilityRatingBandValue(Integer value) {
        this.viabilityRatingBandValue = value;
    }

    /**
     * Gets the value of the totalLossPredictorBandValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLossPredictorBandValue() {
        return totalLossPredictorBandValue;
    }

    /**
     * Sets the value of the totalLossPredictorBandValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLossPredictorBandValue(Integer value) {
        this.totalLossPredictorBandValue = value;
    }

    /**
     * Gets the value of the delinquencyScoreBandValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelinquencyScoreBandValue() {
        return delinquencyScoreBandValue;
    }

    /**
     * Sets the value of the delinquencyScoreBandValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelinquencyScoreBandValue(Integer value) {
        this.delinquencyScoreBandValue = value;
    }

    /**
     * Gets the value of the clusterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterValue() {
        return clusterValue;
    }

    /**
     * Sets the value of the clusterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterValue(String value) {
        this.clusterValue = value;
    }

    /**
     * Gets the value of the segmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentValue() {
        return segmentValue;
    }

    /**
     * Sets the value of the segmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentValue(Integer value) {
        this.segmentValue = value;
    }

    /**
     * Gets the value of the segmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentDescription() {
        return segmentDescription;
    }

    /**
     * Sets the value of the segmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentDescription(String value) {
        this.segmentDescription = value;
    }

}
