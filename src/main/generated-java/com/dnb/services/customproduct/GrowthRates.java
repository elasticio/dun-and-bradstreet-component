
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowthRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowthRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialStatementHeader" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialStatementHeaderGrowthRate" minOccurs="0"/>
 *         &lt;element name="ComparedToFinancialStatementHeader" type="{http://services.dnb.com/CustomProductServiceV2.0}ComparedToFinancialStatementHeaderForGrowthRate" minOccurs="0"/>
 *         &lt;element name="GrowthRateItem" type="{http://services.dnb.com/CustomProductServiceV2.0}GrowthRateItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NormDimension" type="{http://services.dnb.com/CustomProductServiceV2.0}NormDimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ComparisonFromDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ComparisonToDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowthRates", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialStatementHeader",
    "comparedToFinancialStatementHeader",
    "growthRateItem",
    "normDimension",
    "comparisonFromDate",
    "comparisonToDate"
})
public class GrowthRates {

    @XmlElement(name = "FinancialStatementHeader")
    protected FinancialStatementHeaderGrowthRate financialStatementHeader;
    @XmlElement(name = "ComparedToFinancialStatementHeader")
    protected ComparedToFinancialStatementHeaderForGrowthRate comparedToFinancialStatementHeader;
    @XmlElement(name = "GrowthRateItem")
    protected List<GrowthRateItem> growthRateItem;
    @XmlElement(name = "NormDimension")
    protected List<NormDimension> normDimension;
    @XmlElement(name = "ComparisonFromDate")
    protected DNBDateType comparisonFromDate;
    @XmlElement(name = "ComparisonToDate")
    protected DNBDateType comparisonToDate;

    /**
     * Gets the value of the financialStatementHeader property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialStatementHeaderGrowthRate }
     *     
     */
    public FinancialStatementHeaderGrowthRate getFinancialStatementHeader() {
        return financialStatementHeader;
    }

    /**
     * Sets the value of the financialStatementHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialStatementHeaderGrowthRate }
     *     
     */
    public void setFinancialStatementHeader(FinancialStatementHeaderGrowthRate value) {
        this.financialStatementHeader = value;
    }

    /**
     * Gets the value of the comparedToFinancialStatementHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ComparedToFinancialStatementHeaderForGrowthRate }
     *     
     */
    public ComparedToFinancialStatementHeaderForGrowthRate getComparedToFinancialStatementHeader() {
        return comparedToFinancialStatementHeader;
    }

    /**
     * Sets the value of the comparedToFinancialStatementHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparedToFinancialStatementHeaderForGrowthRate }
     *     
     */
    public void setComparedToFinancialStatementHeader(ComparedToFinancialStatementHeaderForGrowthRate value) {
        this.comparedToFinancialStatementHeader = value;
    }

    /**
     * Gets the value of the growthRateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growthRateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowthRateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowthRateItem }
     * 
     * 
     */
    public List<GrowthRateItem> getGrowthRateItem() {
        if (growthRateItem == null) {
            growthRateItem = new ArrayList<GrowthRateItem>();
        }
        return this.growthRateItem;
    }

    /**
     * Gets the value of the normDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormDimension }
     * 
     * 
     */
    public List<NormDimension> getNormDimension() {
        if (normDimension == null) {
            normDimension = new ArrayList<NormDimension>();
        }
        return this.normDimension;
    }

    /**
     * Gets the value of the comparisonFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getComparisonFromDate() {
        return comparisonFromDate;
    }

    /**
     * Sets the value of the comparisonFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setComparisonFromDate(DNBDateType value) {
        this.comparisonFromDate = value;
    }

    /**
     * Gets the value of the comparisonToDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getComparisonToDate() {
        return comparisonToDate;
    }

    /**
     * Sets the value of the comparisonToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setComparisonToDate(DNBDateType value) {
        this.comparisonToDate = value;
    }

}
