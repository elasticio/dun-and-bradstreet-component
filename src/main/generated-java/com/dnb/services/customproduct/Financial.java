
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Financial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Financial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyFinancialFiguresOverview" type="{http://services.dnb.com/CustomProductServiceV2.0}KeyFinancialFiguresOverview" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStatement" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialStatement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialRatiosIndustryNorms" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRatiosIndustryNorms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialRatioNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRatioNorm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrowthRates" type="{http://services.dnb.com/CustomProductServiceV2.0}GrowthRates" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrowthRateNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}GrowthRateNorm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfitableTrendIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagementFinancialTrendData" type="{http://services.dnb.com/CustomProductServiceV2.0}ManagementFinancialTrendData" minOccurs="0"/>
 *         &lt;element name="LatestStatementDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="UndisclosedReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Financial", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "keyFinancialFiguresOverview",
    "financialStatement",
    "financialRatiosIndustryNorms",
    "financialRatioNorm",
    "growthRates",
    "growthRateNorm",
    "profitableTrendIndicator",
    "managementFinancialTrendData",
    "latestStatementDate",
    "undisclosedReasonText"
})
public class Financial {

    @XmlElement(name = "KeyFinancialFiguresOverview")
    protected List<KeyFinancialFiguresOverview> keyFinancialFiguresOverview;
    @XmlElement(name = "FinancialStatement")
    protected List<FinancialStatement> financialStatement;
    @XmlElement(name = "FinancialRatiosIndustryNorms")
    protected List<FinancialRatiosIndustryNorms> financialRatiosIndustryNorms;
    @XmlElement(name = "FinancialRatioNorm")
    protected List<FinancialRatioNorm> financialRatioNorm;
    @XmlElement(name = "GrowthRates")
    protected List<GrowthRates> growthRates;
    @XmlElement(name = "GrowthRateNorm")
    protected List<GrowthRateNorm> growthRateNorm;
    @XmlElement(name = "ProfitableTrendIndicator")
    protected Boolean profitableTrendIndicator;
    @XmlElement(name = "ManagementFinancialTrendData")
    protected ManagementFinancialTrendData managementFinancialTrendData;
    @XmlElement(name = "LatestStatementDate")
    protected DNBDateType latestStatementDate;
    @XmlElement(name = "UndisclosedReasonText")
    protected DNBDecodedStringNewType undisclosedReasonText;

    /**
     * Gets the value of the keyFinancialFiguresOverview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFinancialFiguresOverview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFinancialFiguresOverview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyFinancialFiguresOverview }
     * 
     * 
     */
    public List<KeyFinancialFiguresOverview> getKeyFinancialFiguresOverview() {
        if (keyFinancialFiguresOverview == null) {
            keyFinancialFiguresOverview = new ArrayList<KeyFinancialFiguresOverview>();
        }
        return this.keyFinancialFiguresOverview;
    }

    /**
     * Gets the value of the financialStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialStatement }
     * 
     * 
     */
    public List<FinancialStatement> getFinancialStatement() {
        if (financialStatement == null) {
            financialStatement = new ArrayList<FinancialStatement>();
        }
        return this.financialStatement;
    }

    /**
     * Gets the value of the financialRatiosIndustryNorms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialRatiosIndustryNorms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialRatiosIndustryNorms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialRatiosIndustryNorms }
     * 
     * 
     */
    public List<FinancialRatiosIndustryNorms> getFinancialRatiosIndustryNorms() {
        if (financialRatiosIndustryNorms == null) {
            financialRatiosIndustryNorms = new ArrayList<FinancialRatiosIndustryNorms>();
        }
        return this.financialRatiosIndustryNorms;
    }

    /**
     * Gets the value of the financialRatioNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialRatioNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialRatioNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialRatioNorm }
     * 
     * 
     */
    public List<FinancialRatioNorm> getFinancialRatioNorm() {
        if (financialRatioNorm == null) {
            financialRatioNorm = new ArrayList<FinancialRatioNorm>();
        }
        return this.financialRatioNorm;
    }

    /**
     * Gets the value of the growthRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growthRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowthRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowthRates }
     * 
     * 
     */
    public List<GrowthRates> getGrowthRates() {
        if (growthRates == null) {
            growthRates = new ArrayList<GrowthRates>();
        }
        return this.growthRates;
    }

    /**
     * Gets the value of the growthRateNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growthRateNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowthRateNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowthRateNorm }
     * 
     * 
     */
    public List<GrowthRateNorm> getGrowthRateNorm() {
        if (growthRateNorm == null) {
            growthRateNorm = new ArrayList<GrowthRateNorm>();
        }
        return this.growthRateNorm;
    }

    /**
     * Gets the value of the profitableTrendIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfitableTrendIndicator() {
        return profitableTrendIndicator;
    }

    /**
     * Sets the value of the profitableTrendIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfitableTrendIndicator(Boolean value) {
        this.profitableTrendIndicator = value;
    }

    /**
     * Gets the value of the managementFinancialTrendData property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementFinancialTrendData }
     *     
     */
    public ManagementFinancialTrendData getManagementFinancialTrendData() {
        return managementFinancialTrendData;
    }

    /**
     * Sets the value of the managementFinancialTrendData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementFinancialTrendData }
     *     
     */
    public void setManagementFinancialTrendData(ManagementFinancialTrendData value) {
        this.managementFinancialTrendData = value;
    }

    /**
     * Gets the value of the latestStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLatestStatementDate() {
        return latestStatementDate;
    }

    /**
     * Sets the value of the latestStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLatestStatementDate(DNBDateType value) {
        this.latestStatementDate = value;
    }

    /**
     * Gets the value of the undisclosedReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getUndisclosedReasonText() {
        return undisclosedReasonText;
    }

    /**
     * Sets the value of the undisclosedReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setUndisclosedReasonText(DNBDecodedStringNewType value) {
        this.undisclosedReasonText = value;
    }

}
