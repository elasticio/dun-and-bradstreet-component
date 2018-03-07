
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDecisionSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDecisionSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiskPolicyRuleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskPolicyRuleVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditAssessmentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="OutstandingBalanceAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AdditionalDecisionParameter" type="{http://services.dnb.com/CustomProductServiceV2.0}DecisionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDecisionSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "riskPolicyRuleName",
    "riskPolicyRuleVersionNumber",
    "creditAssessmentAmount",
    "outstandingBalanceAmount",
    "additionalDecisionParameter"
})
public class CreditDecisionSpecification {

    @XmlElement(name = "RiskPolicyRuleName")
    protected String riskPolicyRuleName;
    @XmlElement(name = "RiskPolicyRuleVersionNumber")
    protected String riskPolicyRuleVersionNumber;
    @XmlElement(name = "CreditAssessmentAmount")
    protected AmountType creditAssessmentAmount;
    @XmlElement(name = "OutstandingBalanceAmount")
    protected AmountType outstandingBalanceAmount;
    @XmlElement(name = "AdditionalDecisionParameter")
    protected List<DecisionParameter> additionalDecisionParameter;

    /**
     * Gets the value of the riskPolicyRuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPolicyRuleName() {
        return riskPolicyRuleName;
    }

    /**
     * Sets the value of the riskPolicyRuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPolicyRuleName(String value) {
        this.riskPolicyRuleName = value;
    }

    /**
     * Gets the value of the riskPolicyRuleVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPolicyRuleVersionNumber() {
        return riskPolicyRuleVersionNumber;
    }

    /**
     * Sets the value of the riskPolicyRuleVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPolicyRuleVersionNumber(String value) {
        this.riskPolicyRuleVersionNumber = value;
    }

    /**
     * Gets the value of the creditAssessmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditAssessmentAmount() {
        return creditAssessmentAmount;
    }

    /**
     * Sets the value of the creditAssessmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditAssessmentAmount(AmountType value) {
        this.creditAssessmentAmount = value;
    }

    /**
     * Gets the value of the outstandingBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOutstandingBalanceAmount() {
        return outstandingBalanceAmount;
    }

    /**
     * Sets the value of the outstandingBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOutstandingBalanceAmount(AmountType value) {
        this.outstandingBalanceAmount = value;
    }

    /**
     * Gets the value of the additionalDecisionParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDecisionParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDecisionParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionParameter }
     * 
     * 
     */
    public List<DecisionParameter> getAdditionalDecisionParameter() {
        if (additionalDecisionParameter == null) {
            additionalDecisionParameter = new ArrayList<DecisionParameter>();
        }
        return this.additionalDecisionParameter;
    }

}
