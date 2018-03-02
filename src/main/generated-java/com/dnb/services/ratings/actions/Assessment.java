
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Assessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBStandardRatingType" minOccurs="0"/>
 *         &lt;element name="DNBViabilityRating" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBViabilityRatingType" minOccurs="0"/>
 *         &lt;element name="DNBStandardRatingHistory" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBStandardRatingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HistoryRatingText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}CommercialCreditScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScoreNorms" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreNormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStressScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DNBCreditLimitRecommendation" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBCreditLimitRecommendationType" minOccurs="0"/>
 *         &lt;element name="EmergingMarketMediationScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreType" minOccurs="0"/>
 *         &lt;element name="SupplierStabilityIndexScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreType" minOccurs="0"/>
 *         &lt;element name="SupplierEvaluationRiskScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SupplierEvaluationRiskScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStressReferenceData" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ScoreReferenceType" minOccurs="0"/>
 *         &lt;element name="FinancialConditionText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OverallTrendText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AssessmentSummaryText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLossPredictorScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}TotalLossPredictorScoreType" minOccurs="0"/>
 *         &lt;element name="SupplierPerformanceScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SupplierPerformanceScoreType" minOccurs="0"/>
 *         &lt;element name="TriplePlayScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}TriplePlayScoreType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assessment", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "dnbStandardRating",
    "dnbViabilityRating",
    "dnbStandardRatingHistory",
    "historyRatingText",
    "commercialCreditScore",
    "commercialCreditScoreNorms",
    "financialStressScore",
    "dnbCreditLimitRecommendation",
    "emergingMarketMediationScore",
    "supplierStabilityIndexScore",
    "supplierEvaluationRiskScore",
    "financialStressReferenceData",
    "financialConditionText",
    "overallTrendText",
    "assessmentSummaryText",
    "totalLossPredictorScore",
    "supplierPerformanceScore",
    "triplePlayScore"
})
public class Assessment {

    @XmlElement(name = "DNBStandardRating")
    protected DNBStandardRatingType dnbStandardRating;
    @XmlElement(name = "DNBViabilityRating")
    protected DNBViabilityRatingType dnbViabilityRating;
    @XmlElement(name = "DNBStandardRatingHistory")
    protected List<DNBStandardRatingType> dnbStandardRatingHistory;
    @XmlElement(name = "HistoryRatingText")
    protected DNBDecodedStringType historyRatingText;
    @XmlElement(name = "CommercialCreditScore")
    protected List<CommercialCreditScoreType> commercialCreditScore;
    @XmlElement(name = "CommercialCreditScoreNorms")
    protected List<ScoreNormType> commercialCreditScoreNorms;
    @XmlElement(name = "FinancialStressScore")
    protected List<ScoreType> financialStressScore;
    @XmlElement(name = "DNBCreditLimitRecommendation")
    protected DNBCreditLimitRecommendationType dnbCreditLimitRecommendation;
    @XmlElement(name = "EmergingMarketMediationScore")
    protected ScoreType emergingMarketMediationScore;
    @XmlElement(name = "SupplierStabilityIndexScore")
    protected ScoreType supplierStabilityIndexScore;
    @XmlElement(name = "SupplierEvaluationRiskScore")
    protected List<SupplierEvaluationRiskScore> supplierEvaluationRiskScore;
    @XmlElement(name = "FinancialStressReferenceData")
    protected ScoreReferenceType financialStressReferenceData;
    @XmlElement(name = "FinancialConditionText")
    protected DNBDecodedStringType financialConditionText;
    @XmlElement(name = "OverallTrendText")
    protected DNBDecodedStringType overallTrendText;
    @XmlElement(name = "AssessmentSummaryText")
    protected List<String> assessmentSummaryText;
    @XmlElement(name = "TotalLossPredictorScore")
    protected TotalLossPredictorScoreType totalLossPredictorScore;
    @XmlElement(name = "SupplierPerformanceScore")
    protected SupplierPerformanceScoreType supplierPerformanceScore;
    @XmlElement(name = "TriplePlayScore")
    protected TriplePlayScoreType triplePlayScore;

    /**
     * Gets the value of the dnbStandardRating property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStandardRatingType }
     *     
     */
    public DNBStandardRatingType getDNBStandardRating() {
        return dnbStandardRating;
    }

    /**
     * Sets the value of the dnbStandardRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStandardRatingType }
     *     
     */
    public void setDNBStandardRating(DNBStandardRatingType value) {
        this.dnbStandardRating = value;
    }

    /**
     * Gets the value of the dnbViabilityRating property.
     * 
     * @return
     *     possible object is
     *     {@link DNBViabilityRatingType }
     *     
     */
    public DNBViabilityRatingType getDNBViabilityRating() {
        return dnbViabilityRating;
    }

    /**
     * Sets the value of the dnbViabilityRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBViabilityRatingType }
     *     
     */
    public void setDNBViabilityRating(DNBViabilityRatingType value) {
        this.dnbViabilityRating = value;
    }

    /**
     * Gets the value of the dnbStandardRatingHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnbStandardRatingHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNBStandardRatingHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBStandardRatingType }
     * 
     * 
     */
    public List<DNBStandardRatingType> getDNBStandardRatingHistory() {
        if (dnbStandardRatingHistory == null) {
            dnbStandardRatingHistory = new ArrayList<DNBStandardRatingType>();
        }
        return this.dnbStandardRatingHistory;
    }

    /**
     * Gets the value of the historyRatingText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getHistoryRatingText() {
        return historyRatingText;
    }

    /**
     * Sets the value of the historyRatingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setHistoryRatingText(DNBDecodedStringType value) {
        this.historyRatingText = value;
    }

    /**
     * Gets the value of the commercialCreditScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialCreditScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialCreditScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialCreditScoreType }
     * 
     * 
     */
    public List<CommercialCreditScoreType> getCommercialCreditScore() {
        if (commercialCreditScore == null) {
            commercialCreditScore = new ArrayList<CommercialCreditScoreType>();
        }
        return this.commercialCreditScore;
    }

    /**
     * Gets the value of the commercialCreditScoreNorms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialCreditScoreNorms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialCreditScoreNorms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreNormType }
     * 
     * 
     */
    public List<ScoreNormType> getCommercialCreditScoreNorms() {
        if (commercialCreditScoreNorms == null) {
            commercialCreditScoreNorms = new ArrayList<ScoreNormType>();
        }
        return this.commercialCreditScoreNorms;
    }

    /**
     * Gets the value of the financialStressScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStressScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStressScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreType }
     * 
     * 
     */
    public List<ScoreType> getFinancialStressScore() {
        if (financialStressScore == null) {
            financialStressScore = new ArrayList<ScoreType>();
        }
        return this.financialStressScore;
    }

    /**
     * Gets the value of the dnbCreditLimitRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link DNBCreditLimitRecommendationType }
     *     
     */
    public DNBCreditLimitRecommendationType getDNBCreditLimitRecommendation() {
        return dnbCreditLimitRecommendation;
    }

    /**
     * Sets the value of the dnbCreditLimitRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBCreditLimitRecommendationType }
     *     
     */
    public void setDNBCreditLimitRecommendation(DNBCreditLimitRecommendationType value) {
        this.dnbCreditLimitRecommendation = value;
    }

    /**
     * Gets the value of the emergingMarketMediationScore property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreType }
     *     
     */
    public ScoreType getEmergingMarketMediationScore() {
        return emergingMarketMediationScore;
    }

    /**
     * Sets the value of the emergingMarketMediationScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreType }
     *     
     */
    public void setEmergingMarketMediationScore(ScoreType value) {
        this.emergingMarketMediationScore = value;
    }

    /**
     * Gets the value of the supplierStabilityIndexScore property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreType }
     *     
     */
    public ScoreType getSupplierStabilityIndexScore() {
        return supplierStabilityIndexScore;
    }

    /**
     * Sets the value of the supplierStabilityIndexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreType }
     *     
     */
    public void setSupplierStabilityIndexScore(ScoreType value) {
        this.supplierStabilityIndexScore = value;
    }

    /**
     * Gets the value of the supplierEvaluationRiskScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierEvaluationRiskScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierEvaluationRiskScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierEvaluationRiskScore }
     * 
     * 
     */
    public List<SupplierEvaluationRiskScore> getSupplierEvaluationRiskScore() {
        if (supplierEvaluationRiskScore == null) {
            supplierEvaluationRiskScore = new ArrayList<SupplierEvaluationRiskScore>();
        }
        return this.supplierEvaluationRiskScore;
    }

    /**
     * Gets the value of the financialStressReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreReferenceType }
     *     
     */
    public ScoreReferenceType getFinancialStressReferenceData() {
        return financialStressReferenceData;
    }

    /**
     * Sets the value of the financialStressReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreReferenceType }
     *     
     */
    public void setFinancialStressReferenceData(ScoreReferenceType value) {
        this.financialStressReferenceData = value;
    }

    /**
     * Gets the value of the financialConditionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFinancialConditionText() {
        return financialConditionText;
    }

    /**
     * Sets the value of the financialConditionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFinancialConditionText(DNBDecodedStringType value) {
        this.financialConditionText = value;
    }

    /**
     * Gets the value of the overallTrendText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOverallTrendText() {
        return overallTrendText;
    }

    /**
     * Sets the value of the overallTrendText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOverallTrendText(DNBDecodedStringType value) {
        this.overallTrendText = value;
    }

    /**
     * Gets the value of the assessmentSummaryText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentSummaryText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentSummaryText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentSummaryText() {
        if (assessmentSummaryText == null) {
            assessmentSummaryText = new ArrayList<String>();
        }
        return this.assessmentSummaryText;
    }

    /**
     * Gets the value of the totalLossPredictorScore property.
     * 
     * @return
     *     possible object is
     *     {@link TotalLossPredictorScoreType }
     *     
     */
    public TotalLossPredictorScoreType getTotalLossPredictorScore() {
        return totalLossPredictorScore;
    }

    /**
     * Sets the value of the totalLossPredictorScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalLossPredictorScoreType }
     *     
     */
    public void setTotalLossPredictorScore(TotalLossPredictorScoreType value) {
        this.totalLossPredictorScore = value;
    }

    /**
     * Gets the value of the supplierPerformanceScore property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPerformanceScoreType }
     *     
     */
    public SupplierPerformanceScoreType getSupplierPerformanceScore() {
        return supplierPerformanceScore;
    }

    /**
     * Sets the value of the supplierPerformanceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPerformanceScoreType }
     *     
     */
    public void setSupplierPerformanceScore(SupplierPerformanceScoreType value) {
        this.supplierPerformanceScore = value;
    }

    /**
     * Gets the value of the triplePlayScore property.
     * 
     * @return
     *     possible object is
     *     {@link TriplePlayScoreType }
     *     
     */
    public TriplePlayScoreType getTriplePlayScore() {
        return triplePlayScore;
    }

    /**
     * Sets the value of the triplePlayScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriplePlayScoreType }
     *     
     */
    public void setTriplePlayScore(TriplePlayScoreType value) {
        this.triplePlayScore = value;
    }

}
