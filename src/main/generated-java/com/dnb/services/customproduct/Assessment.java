
package com.dnb.services.customproduct;

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
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStandardRatingType" minOccurs="0"/>
 *         &lt;element name="DNBViabilityRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBViabilityRatingType" minOccurs="0"/>
 *         &lt;element name="DNBStandardRatingHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStandardRatingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HistoryRatingText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScore" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCreditScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScoreHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScoreNorms" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreNormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStressScore" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStressScoreHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStressScoreNorms" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreNormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketingSegmentationClusterValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DNBCreditLimitRecommendation" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCreditLimitRecommendationType" minOccurs="0"/>
 *         &lt;element name="FinancialStressNorms" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreNormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmergingMarketMediationScore" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" minOccurs="0"/>
 *         &lt;element name="SupplierStabilityIndexScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierStabilityIndexScoreType" minOccurs="0"/>
 *         &lt;element name="SupplierEvaluationRiskScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierEvaluationRiskScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="USPatriotActComplianceRiskScore" type="{http://services.dnb.com/CustomProductServiceV2.0}USPatriotActComplianceRiskScore" minOccurs="0"/>
 *         &lt;element name="ProofOfRightCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DueDiligenceScore" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" minOccurs="0"/>
 *         &lt;element name="IndustryCommercialCreditScore" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCommercialCreditScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStressReferenceData" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreReferenceType" minOccurs="0"/>
 *         &lt;element name="FinancialConditionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OverallTrendText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="HighRiskIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScoreReferenceData" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreReferenceType" minOccurs="0"/>
 *         &lt;element name="OrganizationSizeCategoryText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SmallBusinessRiskAccountScore" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GlobalRiskScore" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalRiskScoreType" minOccurs="0"/>
 *         &lt;element name="AssessmentSummaryText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLossPredictorScore" type="{http://services.dnb.com/CustomProductServiceV2.0}TotalLossPredictorScoreType" minOccurs="0"/>
 *         &lt;element name="SupplierPerformanceScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierPerformanceScoreType" minOccurs="0"/>
 *         &lt;element name="CustomScore" type="{http://services.dnb.com/CustomProductServiceV2.0}CustomScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DetailedTradeRiskInsightScore" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreType" minOccurs="0"/>
 *         &lt;element name="SBRIOriginationCreditCardScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SBRIScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBRIOriginationLeaseScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SBRIScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBRIOriginationLoanScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SBRIScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomScoreNorms" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreNormType" minOccurs="0"/>
 *         &lt;element name="TriplePlayScore" type="{http://services.dnb.com/CustomProductServiceV2.0}TriplePlayScoreType" minOccurs="0"/>
 *         &lt;element name="DNBCreditLimitRecommendationHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCreditLimitRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBFEPoweredScore" type="{http://services.dnb.com/CustomProductServiceV2.0}SBFEPoweredScoreType" minOccurs="0"/>
 *         &lt;element name="FinancialStrengthNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}ScoreNormNewType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assessment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dnbStandardRating",
    "dnbViabilityRating",
    "dnbStandardRatingHistory",
    "historyRatingText",
    "commercialCreditScore",
    "commercialCreditScoreHistory",
    "commercialCreditScoreNorms",
    "financialStressScore",
    "financialStressScoreHistory",
    "financialStressScoreNorms",
    "marketingSegmentationClusterValue",
    "dnbCreditLimitRecommendation",
    "financialStressNorms",
    "emergingMarketMediationScore",
    "supplierStabilityIndexScore",
    "supplierEvaluationRiskScore",
    "usPatriotActComplianceRiskScore",
    "proofOfRightCount",
    "dueDiligenceScore",
    "industryCommercialCreditScore",
    "financialStressReferenceData",
    "financialConditionText",
    "overallTrendText",
    "highRiskIndicator",
    "commercialCreditScoreReferenceData",
    "organizationSizeCategoryText",
    "smallBusinessRiskAccountScore",
    "globalRiskScore",
    "assessmentSummaryText",
    "totalLossPredictorScore",
    "supplierPerformanceScore",
    "customScore",
    "detailedTradeRiskInsightScore",
    "sbriOriginationCreditCardScore",
    "sbriOriginationLeaseScore",
    "sbriOriginationLoanScore",
    "customScoreNorms",
    "triplePlayScore",
    "dnbCreditLimitRecommendationHistory",
    "sbfePoweredScore",
    "financialStrengthNorm"
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
    @XmlElement(name = "CommercialCreditScoreHistory")
    protected List<ScoreType> commercialCreditScoreHistory;
    @XmlElement(name = "CommercialCreditScoreNorms")
    protected List<ScoreNormType> commercialCreditScoreNorms;
    @XmlElement(name = "FinancialStressScore")
    protected List<ScoreType> financialStressScore;
    @XmlElement(name = "FinancialStressScoreHistory")
    protected List<ScoreType> financialStressScoreHistory;
    @XmlElement(name = "FinancialStressScoreNorms")
    protected List<ScoreNormType> financialStressScoreNorms;
    @XmlElement(name = "MarketingSegmentationClusterValue")
    protected Integer marketingSegmentationClusterValue;
    @XmlElement(name = "DNBCreditLimitRecommendation")
    protected DNBCreditLimitRecommendationType dnbCreditLimitRecommendation;
    @XmlElement(name = "FinancialStressNorms")
    protected List<ScoreNormType> financialStressNorms;
    @XmlElement(name = "EmergingMarketMediationScore")
    protected ScoreType emergingMarketMediationScore;
    @XmlElement(name = "SupplierStabilityIndexScore")
    protected SupplierStabilityIndexScoreType supplierStabilityIndexScore;
    @XmlElement(name = "SupplierEvaluationRiskScore")
    protected List<SupplierEvaluationRiskScore> supplierEvaluationRiskScore;
    @XmlElement(name = "USPatriotActComplianceRiskScore")
    protected USPatriotActComplianceRiskScore usPatriotActComplianceRiskScore;
    @XmlElement(name = "ProofOfRightCount")
    protected Integer proofOfRightCount;
    @XmlElement(name = "DueDiligenceScore")
    protected ScoreType dueDiligenceScore;
    @XmlElement(name = "IndustryCommercialCreditScore")
    protected List<IndustryCommercialCreditScoreType> industryCommercialCreditScore;
    @XmlElement(name = "FinancialStressReferenceData")
    protected ScoreReferenceType financialStressReferenceData;
    @XmlElement(name = "FinancialConditionText")
    protected DNBDecodedStringType financialConditionText;
    @XmlElement(name = "OverallTrendText")
    protected DNBDecodedStringType overallTrendText;
    @XmlElement(name = "HighRiskIndicator")
    protected Boolean highRiskIndicator;
    @XmlElement(name = "CommercialCreditScoreReferenceData")
    protected ScoreReferenceType commercialCreditScoreReferenceData;
    @XmlElement(name = "OrganizationSizeCategoryText")
    protected DNBDecodedStringType organizationSizeCategoryText;
    @XmlElement(name = "SmallBusinessRiskAccountScore")
    protected List<ScoreType> smallBusinessRiskAccountScore;
    @XmlElement(name = "GlobalRiskScore")
    protected GlobalRiskScoreType globalRiskScore;
    @XmlElement(name = "AssessmentSummaryText")
    protected List<String> assessmentSummaryText;
    @XmlElement(name = "TotalLossPredictorScore")
    protected TotalLossPredictorScoreType totalLossPredictorScore;
    @XmlElement(name = "SupplierPerformanceScore")
    protected SupplierPerformanceScoreType supplierPerformanceScore;
    @XmlElement(name = "CustomScore")
    protected List<CustomScore> customScore;
    @XmlElement(name = "DetailedTradeRiskInsightScore")
    protected ScoreType detailedTradeRiskInsightScore;
    @XmlElement(name = "SBRIOriginationCreditCardScore")
    protected List<SBRIScore> sbriOriginationCreditCardScore;
    @XmlElement(name = "SBRIOriginationLeaseScore")
    protected List<SBRIScore> sbriOriginationLeaseScore;
    @XmlElement(name = "SBRIOriginationLoanScore")
    protected List<SBRIScore> sbriOriginationLoanScore;
    @XmlElement(name = "CustomScoreNorms")
    protected ScoreNormType customScoreNorms;
    @XmlElement(name = "TriplePlayScore")
    protected TriplePlayScoreType triplePlayScore;
    @XmlElement(name = "DNBCreditLimitRecommendationHistory")
    protected List<DNBCreditLimitRecommendationType> dnbCreditLimitRecommendationHistory;
    @XmlElement(name = "SBFEPoweredScore")
    protected SBFEPoweredScoreType sbfePoweredScore;
    @XmlElement(name = "FinancialStrengthNorm")
    protected List<ScoreNormNewType> financialStrengthNorm;

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
     * Gets the value of the commercialCreditScoreHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialCreditScoreHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialCreditScoreHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreType }
     * 
     * 
     */
    public List<ScoreType> getCommercialCreditScoreHistory() {
        if (commercialCreditScoreHistory == null) {
            commercialCreditScoreHistory = new ArrayList<ScoreType>();
        }
        return this.commercialCreditScoreHistory;
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
     * Gets the value of the financialStressScoreHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStressScoreHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStressScoreHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreType }
     * 
     * 
     */
    public List<ScoreType> getFinancialStressScoreHistory() {
        if (financialStressScoreHistory == null) {
            financialStressScoreHistory = new ArrayList<ScoreType>();
        }
        return this.financialStressScoreHistory;
    }

    /**
     * Gets the value of the financialStressScoreNorms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStressScoreNorms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStressScoreNorms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreNormType }
     * 
     * 
     */
    public List<ScoreNormType> getFinancialStressScoreNorms() {
        if (financialStressScoreNorms == null) {
            financialStressScoreNorms = new ArrayList<ScoreNormType>();
        }
        return this.financialStressScoreNorms;
    }

    /**
     * Gets the value of the marketingSegmentationClusterValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketingSegmentationClusterValue() {
        return marketingSegmentationClusterValue;
    }

    /**
     * Sets the value of the marketingSegmentationClusterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketingSegmentationClusterValue(Integer value) {
        this.marketingSegmentationClusterValue = value;
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
     * Gets the value of the financialStressNorms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStressNorms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStressNorms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreNormType }
     * 
     * 
     */
    public List<ScoreNormType> getFinancialStressNorms() {
        if (financialStressNorms == null) {
            financialStressNorms = new ArrayList<ScoreNormType>();
        }
        return this.financialStressNorms;
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
     *     {@link SupplierStabilityIndexScoreType }
     *     
     */
    public SupplierStabilityIndexScoreType getSupplierStabilityIndexScore() {
        return supplierStabilityIndexScore;
    }

    /**
     * Sets the value of the supplierStabilityIndexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierStabilityIndexScoreType }
     *     
     */
    public void setSupplierStabilityIndexScore(SupplierStabilityIndexScoreType value) {
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
     * Gets the value of the usPatriotActComplianceRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link USPatriotActComplianceRiskScore }
     *     
     */
    public USPatriotActComplianceRiskScore getUSPatriotActComplianceRiskScore() {
        return usPatriotActComplianceRiskScore;
    }

    /**
     * Sets the value of the usPatriotActComplianceRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link USPatriotActComplianceRiskScore }
     *     
     */
    public void setUSPatriotActComplianceRiskScore(USPatriotActComplianceRiskScore value) {
        this.usPatriotActComplianceRiskScore = value;
    }

    /**
     * Gets the value of the proofOfRightCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProofOfRightCount() {
        return proofOfRightCount;
    }

    /**
     * Sets the value of the proofOfRightCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProofOfRightCount(Integer value) {
        this.proofOfRightCount = value;
    }

    /**
     * Gets the value of the dueDiligenceScore property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreType }
     *     
     */
    public ScoreType getDueDiligenceScore() {
        return dueDiligenceScore;
    }

    /**
     * Sets the value of the dueDiligenceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreType }
     *     
     */
    public void setDueDiligenceScore(ScoreType value) {
        this.dueDiligenceScore = value;
    }

    /**
     * Gets the value of the industryCommercialCreditScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCommercialCreditScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCommercialCreditScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryCommercialCreditScoreType }
     * 
     * 
     */
    public List<IndustryCommercialCreditScoreType> getIndustryCommercialCreditScore() {
        if (industryCommercialCreditScore == null) {
            industryCommercialCreditScore = new ArrayList<IndustryCommercialCreditScoreType>();
        }
        return this.industryCommercialCreditScore;
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
     * Gets the value of the highRiskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighRiskIndicator() {
        return highRiskIndicator;
    }

    /**
     * Sets the value of the highRiskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighRiskIndicator(Boolean value) {
        this.highRiskIndicator = value;
    }

    /**
     * Gets the value of the commercialCreditScoreReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreReferenceType }
     *     
     */
    public ScoreReferenceType getCommercialCreditScoreReferenceData() {
        return commercialCreditScoreReferenceData;
    }

    /**
     * Sets the value of the commercialCreditScoreReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreReferenceType }
     *     
     */
    public void setCommercialCreditScoreReferenceData(ScoreReferenceType value) {
        this.commercialCreditScoreReferenceData = value;
    }

    /**
     * Gets the value of the organizationSizeCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOrganizationSizeCategoryText() {
        return organizationSizeCategoryText;
    }

    /**
     * Sets the value of the organizationSizeCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOrganizationSizeCategoryText(DNBDecodedStringType value) {
        this.organizationSizeCategoryText = value;
    }

    /**
     * Gets the value of the smallBusinessRiskAccountScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smallBusinessRiskAccountScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmallBusinessRiskAccountScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreType }
     * 
     * 
     */
    public List<ScoreType> getSmallBusinessRiskAccountScore() {
        if (smallBusinessRiskAccountScore == null) {
            smallBusinessRiskAccountScore = new ArrayList<ScoreType>();
        }
        return this.smallBusinessRiskAccountScore;
    }

    /**
     * Gets the value of the globalRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalRiskScoreType }
     *     
     */
    public GlobalRiskScoreType getGlobalRiskScore() {
        return globalRiskScore;
    }

    /**
     * Sets the value of the globalRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalRiskScoreType }
     *     
     */
    public void setGlobalRiskScore(GlobalRiskScoreType value) {
        this.globalRiskScore = value;
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
     * Gets the value of the customScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomScore }
     * 
     * 
     */
    public List<CustomScore> getCustomScore() {
        if (customScore == null) {
            customScore = new ArrayList<CustomScore>();
        }
        return this.customScore;
    }

    /**
     * Gets the value of the detailedTradeRiskInsightScore property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreType }
     *     
     */
    public ScoreType getDetailedTradeRiskInsightScore() {
        return detailedTradeRiskInsightScore;
    }

    /**
     * Sets the value of the detailedTradeRiskInsightScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreType }
     *     
     */
    public void setDetailedTradeRiskInsightScore(ScoreType value) {
        this.detailedTradeRiskInsightScore = value;
    }

    /**
     * Gets the value of the sbriOriginationCreditCardScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbriOriginationCreditCardScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBRIOriginationCreditCardScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBRIScore }
     * 
     * 
     */
    public List<SBRIScore> getSBRIOriginationCreditCardScore() {
        if (sbriOriginationCreditCardScore == null) {
            sbriOriginationCreditCardScore = new ArrayList<SBRIScore>();
        }
        return this.sbriOriginationCreditCardScore;
    }

    /**
     * Gets the value of the sbriOriginationLeaseScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbriOriginationLeaseScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBRIOriginationLeaseScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBRIScore }
     * 
     * 
     */
    public List<SBRIScore> getSBRIOriginationLeaseScore() {
        if (sbriOriginationLeaseScore == null) {
            sbriOriginationLeaseScore = new ArrayList<SBRIScore>();
        }
        return this.sbriOriginationLeaseScore;
    }

    /**
     * Gets the value of the sbriOriginationLoanScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbriOriginationLoanScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBRIOriginationLoanScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBRIScore }
     * 
     * 
     */
    public List<SBRIScore> getSBRIOriginationLoanScore() {
        if (sbriOriginationLoanScore == null) {
            sbriOriginationLoanScore = new ArrayList<SBRIScore>();
        }
        return this.sbriOriginationLoanScore;
    }

    /**
     * Gets the value of the customScoreNorms property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreNormType }
     *     
     */
    public ScoreNormType getCustomScoreNorms() {
        return customScoreNorms;
    }

    /**
     * Sets the value of the customScoreNorms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreNormType }
     *     
     */
    public void setCustomScoreNorms(ScoreNormType value) {
        this.customScoreNorms = value;
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

    /**
     * Gets the value of the dnbCreditLimitRecommendationHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnbCreditLimitRecommendationHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNBCreditLimitRecommendationHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBCreditLimitRecommendationType }
     * 
     * 
     */
    public List<DNBCreditLimitRecommendationType> getDNBCreditLimitRecommendationHistory() {
        if (dnbCreditLimitRecommendationHistory == null) {
            dnbCreditLimitRecommendationHistory = new ArrayList<DNBCreditLimitRecommendationType>();
        }
        return this.dnbCreditLimitRecommendationHistory;
    }

    /**
     * Gets the value of the sbfePoweredScore property.
     * 
     * @return
     *     possible object is
     *     {@link SBFEPoweredScoreType }
     *     
     */
    public SBFEPoweredScoreType getSBFEPoweredScore() {
        return sbfePoweredScore;
    }

    /**
     * Sets the value of the sbfePoweredScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBFEPoweredScoreType }
     *     
     */
    public void setSBFEPoweredScore(SBFEPoweredScoreType value) {
        this.sbfePoweredScore = value;
    }

    /**
     * Gets the value of the financialStrengthNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStrengthNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStrengthNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreNormNewType }
     * 
     * 
     */
    public List<ScoreNormNewType> getFinancialStrengthNorm() {
        if (financialStrengthNorm == null) {
            financialStrengthNorm = new ArrayList<ScoreNormNewType>();
        }
        return this.financialStrengthNorm;
    }

}
