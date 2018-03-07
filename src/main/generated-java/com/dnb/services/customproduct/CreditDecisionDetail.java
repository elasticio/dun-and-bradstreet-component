
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDecisionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDecisionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DecisionID" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="DecisionDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DNBRecommendedCreditDecisionValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DNBRecommendedCreditLimitAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RiskBandValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TargetIndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryIndustryCodeType" minOccurs="0"/>
 *         &lt;element name="ActionMessageText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="KeyDecisionFields" type="{http://services.dnb.com/CustomProductServiceV2.0}DecisionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UpdatedDecisionFields" type="{http://services.dnb.com/CustomProductServiceV2.0}DecisionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DecisionDateforEmulator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDecisionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "decisionID",
    "decisionDate",
    "dnbRecommendedCreditDecisionValue",
    "dnbRecommendedCreditLimitAmount",
    "riskBandValue",
    "targetIndustryCode",
    "actionMessageText",
    "keyDecisionFields",
    "updatedDecisionFields",
    "billableIndicator",
    "decisionDateforEmulator"
})
public class CreditDecisionDetail {

    @XmlElement(name = "DecisionID")
    protected String decisionID;
    @XmlElement(name = "DecisionDate")
    protected DNBDateType decisionDate;
    @XmlElement(name = "DNBRecommendedCreditDecisionValue")
    protected String dnbRecommendedCreditDecisionValue;
    @XmlElement(name = "DNBRecommendedCreditLimitAmount")
    protected AmountType dnbRecommendedCreditLimitAmount;
    @XmlElement(name = "RiskBandValue")
    protected String riskBandValue;
    @XmlElement(name = "TargetIndustryCode")
    protected PrimaryIndustryCodeType targetIndustryCode;
    @XmlElement(name = "ActionMessageText")
    protected String actionMessageText;
    @XmlElement(name = "KeyDecisionFields")
    protected List<DecisionParameter> keyDecisionFields;
    @XmlElement(name = "UpdatedDecisionFields")
    protected List<DecisionParameter> updatedDecisionFields;
    @XmlElement(name = "BillableIndicator")
    protected Boolean billableIndicator;
    @XmlElement(name = "DecisionDateforEmulator")
    protected String decisionDateforEmulator;

    /**
     * Gets the value of the decisionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionID() {
        return decisionID;
    }

    /**
     * Sets the value of the decisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionID(String value) {
        this.decisionID = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setDecisionDate(DNBDateType value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the dnbRecommendedCreditDecisionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBRecommendedCreditDecisionValue() {
        return dnbRecommendedCreditDecisionValue;
    }

    /**
     * Sets the value of the dnbRecommendedCreditDecisionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBRecommendedCreditDecisionValue(String value) {
        this.dnbRecommendedCreditDecisionValue = value;
    }

    /**
     * Gets the value of the dnbRecommendedCreditLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDNBRecommendedCreditLimitAmount() {
        return dnbRecommendedCreditLimitAmount;
    }

    /**
     * Sets the value of the dnbRecommendedCreditLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDNBRecommendedCreditLimitAmount(AmountType value) {
        this.dnbRecommendedCreditLimitAmount = value;
    }

    /**
     * Gets the value of the riskBandValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskBandValue() {
        return riskBandValue;
    }

    /**
     * Sets the value of the riskBandValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskBandValue(String value) {
        this.riskBandValue = value;
    }

    /**
     * Gets the value of the targetIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryIndustryCodeType }
     *     
     */
    public PrimaryIndustryCodeType getTargetIndustryCode() {
        return targetIndustryCode;
    }

    /**
     * Sets the value of the targetIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryIndustryCodeType }
     *     
     */
    public void setTargetIndustryCode(PrimaryIndustryCodeType value) {
        this.targetIndustryCode = value;
    }

    /**
     * Gets the value of the actionMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionMessageText() {
        return actionMessageText;
    }

    /**
     * Sets the value of the actionMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionMessageText(String value) {
        this.actionMessageText = value;
    }

    /**
     * Gets the value of the keyDecisionFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyDecisionFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyDecisionFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionParameter }
     * 
     * 
     */
    public List<DecisionParameter> getKeyDecisionFields() {
        if (keyDecisionFields == null) {
            keyDecisionFields = new ArrayList<DecisionParameter>();
        }
        return this.keyDecisionFields;
    }

    /**
     * Gets the value of the updatedDecisionFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedDecisionFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedDecisionFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionParameter }
     * 
     * 
     */
    public List<DecisionParameter> getUpdatedDecisionFields() {
        if (updatedDecisionFields == null) {
            updatedDecisionFields = new ArrayList<DecisionParameter>();
        }
        return this.updatedDecisionFields;
    }

    /**
     * Gets the value of the billableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillableIndicator() {
        return billableIndicator;
    }

    /**
     * Sets the value of the billableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableIndicator(Boolean value) {
        this.billableIndicator = value;
    }

    /**
     * Gets the value of the decisionDateforEmulator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionDateforEmulator() {
        return decisionDateforEmulator;
    }

    /**
     * Sets the value of the decisionDateforEmulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionDateforEmulator(String value) {
        this.decisionDateforEmulator = value;
    }

}
