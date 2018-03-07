
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseBalanceSheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseBalanceSheetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assets" type="{http://services.dnb.com/CustomProductServiceV2.0}Assets" minOccurs="0"/>
 *         &lt;element name="TotalAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="Liabilities" type="{http://services.dnb.com/CustomProductServiceV2.0}Liabilities" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="StatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBalanceSheetType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assets",
    "totalAssetsAmount",
    "liabilities",
    "totalLiabilitiesAmount",
    "statementItem"
})
public class BaseBalanceSheetType {

    @XmlElement(name = "Assets")
    protected Assets assets;
    @XmlElement(name = "TotalAssetsAmount")
    protected FinancialAmountType totalAssetsAmount;
    @XmlElement(name = "Liabilities")
    protected Liabilities liabilities;
    @XmlElement(name = "TotalLiabilitiesAmount")
    protected FinancialAmountType totalLiabilitiesAmount;
    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link Assets }
     *     
     */
    public Assets getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assets }
     *     
     */
    public void setAssets(Assets value) {
        this.assets = value;
    }

    /**
     * Gets the value of the totalAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalAssetsAmount() {
        return totalAssetsAmount;
    }

    /**
     * Sets the value of the totalAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalAssetsAmount(FinancialAmountType value) {
        this.totalAssetsAmount = value;
    }

    /**
     * Gets the value of the liabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Liabilities }
     *     
     */
    public Liabilities getLiabilities() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liabilities }
     *     
     */
    public void setLiabilities(Liabilities value) {
        this.liabilities = value;
    }

    /**
     * Gets the value of the totalLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalLiabilitiesAmount() {
        return totalLiabilitiesAmount;
    }

    /**
     * Sets the value of the totalLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalLiabilitiesAmount(FinancialAmountType value) {
        this.totalLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the statementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementItem }
     * 
     * 
     */
    public List<StatementItem> getStatementItem() {
        if (statementItem == null) {
            statementItem = new ArrayList<StatementItem>();
        }
        return this.statementItem;
    }

}
