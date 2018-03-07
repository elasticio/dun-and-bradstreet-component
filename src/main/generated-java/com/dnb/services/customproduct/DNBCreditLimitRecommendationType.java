
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBCreditLimitRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBCreditLimitRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ConservativeLimitAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AggressiveLimitAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumRecommendedLimitAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CommentText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DNBRecommendedCreditDecisionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskCategoryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRecommendationCommentText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBCreditLimitRecommendationType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assessmentDate",
    "conservativeLimitAmount",
    "aggressiveLimitAmount",
    "maximumRecommendedLimitAmount",
    "commentText",
    "dnbRecommendedCreditDecisionText",
    "riskCategoryText",
    "creditRecommendationCommentText"
})
public class DNBCreditLimitRecommendationType {

    @XmlElement(name = "AssessmentDate")
    protected DNBDateType assessmentDate;
    @XmlElement(name = "ConservativeLimitAmount")
    protected AmountType conservativeLimitAmount;
    @XmlElement(name = "AggressiveLimitAmount")
    protected AmountType aggressiveLimitAmount;
    @XmlElement(name = "MaximumRecommendedLimitAmount")
    protected AmountType maximumRecommendedLimitAmount;
    @XmlElement(name = "CommentText")
    protected String commentText;
    @XmlElement(name = "DNBRecommendedCreditDecisionText")
    protected String dnbRecommendedCreditDecisionText;
    @XmlElement(name = "RiskCategoryText")
    protected String riskCategoryText;
    @XmlElement(name = "CreditRecommendationCommentText")
    protected DNBDecodedStringNewType creditRecommendationCommentText;

    /**
     * Gets the value of the assessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAssessmentDate() {
        return assessmentDate;
    }

    /**
     * Sets the value of the assessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAssessmentDate(DNBDateType value) {
        this.assessmentDate = value;
    }

    /**
     * Gets the value of the conservativeLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConservativeLimitAmount() {
        return conservativeLimitAmount;
    }

    /**
     * Sets the value of the conservativeLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConservativeLimitAmount(AmountType value) {
        this.conservativeLimitAmount = value;
    }

    /**
     * Gets the value of the aggressiveLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAggressiveLimitAmount() {
        return aggressiveLimitAmount;
    }

    /**
     * Sets the value of the aggressiveLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAggressiveLimitAmount(AmountType value) {
        this.aggressiveLimitAmount = value;
    }

    /**
     * Gets the value of the maximumRecommendedLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumRecommendedLimitAmount() {
        return maximumRecommendedLimitAmount;
    }

    /**
     * Sets the value of the maximumRecommendedLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumRecommendedLimitAmount(AmountType value) {
        this.maximumRecommendedLimitAmount = value;
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    /**
     * Gets the value of the dnbRecommendedCreditDecisionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBRecommendedCreditDecisionText() {
        return dnbRecommendedCreditDecisionText;
    }

    /**
     * Sets the value of the dnbRecommendedCreditDecisionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBRecommendedCreditDecisionText(String value) {
        this.dnbRecommendedCreditDecisionText = value;
    }

    /**
     * Gets the value of the riskCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCategoryText() {
        return riskCategoryText;
    }

    /**
     * Sets the value of the riskCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCategoryText(String value) {
        this.riskCategoryText = value;
    }

    /**
     * Gets the value of the creditRecommendationCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getCreditRecommendationCommentText() {
        return creditRecommendationCommentText;
    }

    /**
     * Sets the value of the creditRecommendationCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setCreditRecommendationCommentText(DNBDecodedStringNewType value) {
        this.creditRecommendationCommentText = value;
    }

}
