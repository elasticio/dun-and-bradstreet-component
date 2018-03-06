
package com.dnb.services.firmorgaphics;

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
 *         &lt;element name="KeyFinancialFiguresOverview" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}KeyFinancialFiguresOverview" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialStatement" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}FinancialStatement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrowthRates" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}GrowthRates" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Financial", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "keyFinancialFiguresOverview",
    "financialStatement",
    "growthRates"
})
public class Financial {

    @XmlElement(name = "KeyFinancialFiguresOverview")
    protected List<KeyFinancialFiguresOverview> keyFinancialFiguresOverview;
    @XmlElement(name = "FinancialStatement")
    protected List<FinancialStatement> financialStatement;
    @XmlElement(name = "GrowthRates")
    protected List<GrowthRates> growthRates;

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

}
