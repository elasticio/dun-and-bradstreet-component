
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRatiosIndustryNorms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatiosIndustryNorms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NormCalculationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FinancialRatioCategory" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRatioIndustryNormCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}NormsIndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NormRegionText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatiosIndustryNorms", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectCount",
    "normCalculationDate",
    "financialRatioCategory",
    "industryCode",
    "normRegionText"
})
public class FinancialRatiosIndustryNorms {

    @XmlElement(name = "SubjectCount")
    protected BigInteger subjectCount;
    @XmlElement(name = "NormCalculationDate")
    protected DNBDateType normCalculationDate;
    @XmlElement(name = "FinancialRatioCategory")
    protected List<FinancialRatioIndustryNormCategory> financialRatioCategory;
    @XmlElement(name = "IndustryCode")
    protected List<NormsIndustryCodeType> industryCode;
    @XmlElement(name = "NormRegionText")
    protected String normRegionText;

    /**
     * Gets the value of the subjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubjectCount() {
        return subjectCount;
    }

    /**
     * Sets the value of the subjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubjectCount(BigInteger value) {
        this.subjectCount = value;
    }

    /**
     * Gets the value of the normCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getNormCalculationDate() {
        return normCalculationDate;
    }

    /**
     * Sets the value of the normCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setNormCalculationDate(DNBDateType value) {
        this.normCalculationDate = value;
    }

    /**
     * Gets the value of the financialRatioCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialRatioCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialRatioCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialRatioIndustryNormCategory }
     * 
     * 
     */
    public List<FinancialRatioIndustryNormCategory> getFinancialRatioCategory() {
        if (financialRatioCategory == null) {
            financialRatioCategory = new ArrayList<FinancialRatioIndustryNormCategory>();
        }
        return this.financialRatioCategory;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormsIndustryCodeType }
     * 
     * 
     */
    public List<NormsIndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<NormsIndustryCodeType>();
        }
        return this.industryCode;
    }

    /**
     * Gets the value of the normRegionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormRegionText() {
        return normRegionText;
    }

    /**
     * Sets the value of the normRegionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormRegionText(String value) {
        this.normRegionText = value;
    }

}
