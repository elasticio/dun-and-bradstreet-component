
package com.dnb.services.match;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleanseMatchSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleanseMatchSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMaximumQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConfidenceLowerLevelThresholdValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExclusionCriteria" type="{http://services.dnb.com/CompanyServiceV2.0}ExclusionCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderReasonCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://services.dnb.com/CompanyServiceV2.0}DNBCodeValueType">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncludeCleansedAndStandardizedInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanseMatchSpecification", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "candidateMaximumQuantity",
    "confidenceLowerLevelThresholdValue",
    "exclusionCriteria",
    "orderReasonCode",
    "includeCleansedAndStandardizedInformationIndicator"
})
public class CleanseMatchSpecification {

    @XmlElement(name = "CandidateMaximumQuantity")
    protected Integer candidateMaximumQuantity;
    @XmlElement(name = "ConfidenceLowerLevelThresholdValue")
    protected Integer confidenceLowerLevelThresholdValue;
    @XmlElement(name = "ExclusionCriteria")
    protected List<ExclusionCriteria> exclusionCriteria;
    @XmlElement(name = "OrderReasonCode")
    protected BigInteger orderReasonCode;
    @XmlElement(name = "IncludeCleansedAndStandardizedInformationIndicator")
    protected Boolean includeCleansedAndStandardizedInformationIndicator;

    /**
     * Gets the value of the candidateMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCandidateMaximumQuantity() {
        return candidateMaximumQuantity;
    }

    /**
     * Sets the value of the candidateMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateMaximumQuantity(Integer value) {
        this.candidateMaximumQuantity = value;
    }

    /**
     * Gets the value of the confidenceLowerLevelThresholdValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceLowerLevelThresholdValue() {
        return confidenceLowerLevelThresholdValue;
    }

    /**
     * Sets the value of the confidenceLowerLevelThresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceLowerLevelThresholdValue(Integer value) {
        this.confidenceLowerLevelThresholdValue = value;
    }

    /**
     * Gets the value of the exclusionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionCriteria }
     * 
     * 
     */
    public List<ExclusionCriteria> getExclusionCriteria() {
        if (exclusionCriteria == null) {
            exclusionCriteria = new ArrayList<ExclusionCriteria>();
        }
        return this.exclusionCriteria;
    }

    /**
     * Gets the value of the orderReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Sets the value of the orderReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderReasonCode(BigInteger value) {
        this.orderReasonCode = value;
    }

    /**
     * Gets the value of the includeCleansedAndStandardizedInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCleansedAndStandardizedInformationIndicator() {
        return includeCleansedAndStandardizedInformationIndicator;
    }

    /**
     * Sets the value of the includeCleansedAndStandardizedInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCleansedAndStandardizedInformationIndicator(Boolean value) {
        this.includeCleansedAndStandardizedInformationIndicator = value;
    }

}
