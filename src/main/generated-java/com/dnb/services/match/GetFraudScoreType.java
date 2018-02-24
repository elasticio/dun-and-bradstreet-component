
package com.dnb.services.match;

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
 * <p>Java class for GetFraudScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFraudScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreModelVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RawScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClassScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClassScoreDescription">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreCommentary" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreCommentary" maxOccurs="unbounded"/>
 *         &lt;element name="RiskIncidenceScoreableUniverseSubjectPercentage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidencePercentage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MultipleLowRiskOrganizationQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressReliabilityText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressRiskLevelText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TelecommunicationRiskLevelText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TelecommunicationExchangeCarrierText" type="{http://services.dnb.com/CompanyServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="TelecommunicationAndAddressRiskLevelText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HistoricalSearchFraudRiskText" minOccurs="0">
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
@XmlType(name = "GetFraudScoreType", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "scoreModelVersionNumber",
    "rawScore",
    "classScore",
    "classScoreDescription",
    "scoreCommentary",
    "riskIncidenceScoreableUniverseSubjectPercentage",
    "riskIncidencePercentage",
    "multipleLowRiskOrganizationQuantity",
    "addressReliabilityText",
    "addressRiskLevelText",
    "telecommunicationRiskLevelText",
    "telecommunicationExchangeCarrierText",
    "telecommunicationAndAddressRiskLevelText",
    "historicalSearchFraudRiskText"
})
@XmlSeeAlso({
    FraudRiskScore.class
})
public class GetFraudScoreType {

    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "RawScore")
    protected long rawScore;
    @XmlElement(name = "ClassScore", required = true)
    protected String classScore;
    @XmlElement(name = "ClassScoreDescription", required = true)
    protected String classScoreDescription;
    @XmlElement(name = "ScoreCommentary", required = true)
    protected List<GetFraudScoreCommentary> scoreCommentary;
    @XmlElement(name = "RiskIncidenceScoreableUniverseSubjectPercentage", required = true)
    protected BigDecimal riskIncidenceScoreableUniverseSubjectPercentage;
    @XmlElement(name = "RiskIncidencePercentage", required = true)
    protected BigDecimal riskIncidencePercentage;
    @XmlElement(name = "MultipleLowRiskOrganizationQuantity")
    protected BigDecimal multipleLowRiskOrganizationQuantity;
    @XmlElement(name = "AddressReliabilityText")
    protected String addressReliabilityText;
    @XmlElement(name = "AddressRiskLevelText")
    protected String addressRiskLevelText;
    @XmlElement(name = "TelecommunicationRiskLevelText")
    protected String telecommunicationRiskLevelText;
    @XmlElement(name = "TelecommunicationExchangeCarrierText")
    protected String telecommunicationExchangeCarrierText;
    @XmlElement(name = "TelecommunicationAndAddressRiskLevelText")
    protected String telecommunicationAndAddressRiskLevelText;
    @XmlElement(name = "HistoricalSearchFraudRiskText")
    protected String historicalSearchFraudRiskText;

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
     * {@link GetFraudScoreCommentary }
     * 
     * 
     */
    public List<GetFraudScoreCommentary> getScoreCommentary() {
        if (scoreCommentary == null) {
            scoreCommentary = new ArrayList<GetFraudScoreCommentary>();
        }
        return this.scoreCommentary;
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
     * Gets the value of the multipleLowRiskOrganizationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultipleLowRiskOrganizationQuantity() {
        return multipleLowRiskOrganizationQuantity;
    }

    /**
     * Sets the value of the multipleLowRiskOrganizationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultipleLowRiskOrganizationQuantity(BigDecimal value) {
        this.multipleLowRiskOrganizationQuantity = value;
    }

    /**
     * Gets the value of the addressReliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressReliabilityText() {
        return addressReliabilityText;
    }

    /**
     * Sets the value of the addressReliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressReliabilityText(String value) {
        this.addressReliabilityText = value;
    }

    /**
     * Gets the value of the addressRiskLevelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRiskLevelText() {
        return addressRiskLevelText;
    }

    /**
     * Sets the value of the addressRiskLevelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRiskLevelText(String value) {
        this.addressRiskLevelText = value;
    }

    /**
     * Gets the value of the telecommunicationRiskLevelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelecommunicationRiskLevelText() {
        return telecommunicationRiskLevelText;
    }

    /**
     * Sets the value of the telecommunicationRiskLevelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelecommunicationRiskLevelText(String value) {
        this.telecommunicationRiskLevelText = value;
    }

    /**
     * Gets the value of the telecommunicationExchangeCarrierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelecommunicationExchangeCarrierText() {
        return telecommunicationExchangeCarrierText;
    }

    /**
     * Sets the value of the telecommunicationExchangeCarrierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelecommunicationExchangeCarrierText(String value) {
        this.telecommunicationExchangeCarrierText = value;
    }

    /**
     * Gets the value of the telecommunicationAndAddressRiskLevelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelecommunicationAndAddressRiskLevelText() {
        return telecommunicationAndAddressRiskLevelText;
    }

    /**
     * Sets the value of the telecommunicationAndAddressRiskLevelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelecommunicationAndAddressRiskLevelText(String value) {
        this.telecommunicationAndAddressRiskLevelText = value;
    }

    /**
     * Gets the value of the historicalSearchFraudRiskText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalSearchFraudRiskText() {
        return historicalSearchFraudRiskText;
    }

    /**
     * Sets the value of the historicalSearchFraudRiskText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalSearchFraudRiskText(String value) {
        this.historicalSearchFraudRiskText = value;
    }

}
