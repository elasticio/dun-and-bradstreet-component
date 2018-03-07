
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to record information on the statistical distribution of collections of organizations defined by some common criteria, such as their industry or company size.
 *          
 * 
 * <p>Java class for FinancialRatioNorm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatioNorm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialRatioCategory" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRatioIndustryNormCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NormDimension" type="{http://services.dnb.com/CustomProductServiceV2.0}NormDimension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatioNorm", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialRatioCategory",
    "normDimension"
})
public class FinancialRatioNorm {

    @XmlElement(name = "FinancialRatioCategory")
    protected List<FinancialRatioIndustryNormCategory> financialRatioCategory;
    @XmlElement(name = "NormDimension")
    protected List<NormDimension> normDimension;

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

}
