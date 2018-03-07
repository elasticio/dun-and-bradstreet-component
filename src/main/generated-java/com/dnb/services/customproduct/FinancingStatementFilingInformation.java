
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingStatementFilingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingStatementFilingInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialStatementFilingSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UCCFilingSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialStatementFiling" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingStatementFiling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType720" minOccurs="0"/>
 *         &lt;element name="AdditionalUCCFilingAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancingStatementFilingPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingStatementFilingPeriodSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancingStatementFilingSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UCCFilingSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancingStatementFiling" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingStatementFiling" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingStatementFilingInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialStatementFilingSummary",
    "financialStatementFiling",
    "disclaimerText",
    "additionalUCCFilingAvailabilityIndicator",
    "financingStatementFilingPeriodSummary",
    "financingStatementFilingSummary",
    "financingStatementFiling"
})
public class FinancingStatementFilingInformation {

    @XmlElement(name = "FinancialStatementFilingSummary")
    protected UCCFilingSummaryType financialStatementFilingSummary;
    @XmlElement(name = "FinancialStatementFiling")
    protected List<FinancingStatementFiling> financialStatementFiling;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;
    @XmlElement(name = "AdditionalUCCFilingAvailabilityIndicator")
    protected Boolean additionalUCCFilingAvailabilityIndicator;
    @XmlElement(name = "FinancingStatementFilingPeriodSummary")
    protected List<FinancingStatementFilingPeriodSummary> financingStatementFilingPeriodSummary;
    @XmlElement(name = "FinancingStatementFilingSummary")
    protected UCCFilingSummaryType financingStatementFilingSummary;
    @XmlElement(name = "FinancingStatementFiling")
    protected List<FinancingStatementFiling> financingStatementFiling;

    /**
     * Gets the value of the financialStatementFilingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UCCFilingSummaryType }
     *     
     */
    public UCCFilingSummaryType getFinancialStatementFilingSummary() {
        return financialStatementFilingSummary;
    }

    /**
     * Sets the value of the financialStatementFilingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCCFilingSummaryType }
     *     
     */
    public void setFinancialStatementFilingSummary(UCCFilingSummaryType value) {
        this.financialStatementFilingSummary = value;
    }

    /**
     * Gets the value of the financialStatementFiling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStatementFiling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStatementFiling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingStatementFiling }
     * 
     * 
     */
    public List<FinancingStatementFiling> getFinancialStatementFiling() {
        if (financialStatementFiling == null) {
            financialStatementFiling = new ArrayList<FinancingStatementFiling>();
        }
        return this.financialStatementFiling;
    }

    /**
     * Gets the value of the disclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerText() {
        return disclaimerText;
    }

    /**
     * Sets the value of the disclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerText(String value) {
        this.disclaimerText = value;
    }

    /**
     * Gets the value of the additionalUCCFilingAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalUCCFilingAvailabilityIndicator() {
        return additionalUCCFilingAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalUCCFilingAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalUCCFilingAvailabilityIndicator(Boolean value) {
        this.additionalUCCFilingAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the financingStatementFilingPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financingStatementFilingPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancingStatementFilingPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingStatementFilingPeriodSummary }
     * 
     * 
     */
    public List<FinancingStatementFilingPeriodSummary> getFinancingStatementFilingPeriodSummary() {
        if (financingStatementFilingPeriodSummary == null) {
            financingStatementFilingPeriodSummary = new ArrayList<FinancingStatementFilingPeriodSummary>();
        }
        return this.financingStatementFilingPeriodSummary;
    }

    /**
     * Gets the value of the financingStatementFilingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UCCFilingSummaryType }
     *     
     */
    public UCCFilingSummaryType getFinancingStatementFilingSummary() {
        return financingStatementFilingSummary;
    }

    /**
     * Sets the value of the financingStatementFilingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCCFilingSummaryType }
     *     
     */
    public void setFinancingStatementFilingSummary(UCCFilingSummaryType value) {
        this.financingStatementFilingSummary = value;
    }

    /**
     * Gets the value of the financingStatementFiling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financingStatementFiling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancingStatementFiling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingStatementFiling }
     * 
     * 
     */
    public List<FinancingStatementFiling> getFinancingStatementFiling() {
        if (financingStatementFiling == null) {
            financingStatementFiling = new ArrayList<FinancingStatementFiling>();
        }
        return this.financingStatementFiling;
    }

}
