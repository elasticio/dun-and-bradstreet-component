
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBStandardRatingTypeForPrincipal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBStandardRatingTypeForPrincipal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FinancialStrengthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialConditionOrRiskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBStandardRatingTypeForPrincipal", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assessmentDate",
    "financialStrengthCode",
    "financialConditionOrRiskCode"
})
public class DNBStandardRatingTypeForPrincipal {

    @XmlElement(name = "AssessmentDate")
    protected DNBDateType assessmentDate;
    @XmlElement(name = "FinancialStrengthCode")
    protected String financialStrengthCode;
    @XmlElement(name = "FinancialConditionOrRiskCode")
    protected String financialConditionOrRiskCode;

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
     * Gets the value of the financialStrengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialStrengthCode() {
        return financialStrengthCode;
    }

    /**
     * Sets the value of the financialStrengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialStrengthCode(String value) {
        this.financialStrengthCode = value;
    }

    /**
     * Gets the value of the financialConditionOrRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialConditionOrRiskCode() {
        return financialConditionOrRiskCode;
    }

    /**
     * Sets the value of the financialConditionOrRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialConditionOrRiskCode(String value) {
        this.financialConditionOrRiskCode = value;
    }

}
