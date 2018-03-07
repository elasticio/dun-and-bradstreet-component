
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Assets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrentAssets" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="LongTermAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}LongTermAssets" minOccurs="0"/>
 *         &lt;element name="TotalLongTermAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="StatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreeFormStatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}FreeFormStatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assets", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currentAssets",
    "totalCurrentAssetsAmount",
    "longTermAssets",
    "totalLongTermAssetsAmount",
    "statementItem",
    "freeFormStatementItem"
})
public class Assets {

    @XmlElement(name = "CurrentAssets")
    protected CurrentAssets currentAssets;
    @XmlElement(name = "TotalCurrentAssetsAmount")
    protected FinancialAmountType totalCurrentAssetsAmount;
    @XmlElement(name = "LongTermAssets")
    protected LongTermAssets longTermAssets;
    @XmlElement(name = "TotalLongTermAssetsAmount")
    protected FinancialAmountType totalLongTermAssetsAmount;
    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;
    @XmlElement(name = "FreeFormStatementItem")
    protected List<FreeFormStatementItem> freeFormStatementItem;

    /**
     * Gets the value of the currentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentAssets }
     *     
     */
    public CurrentAssets getCurrentAssets() {
        return currentAssets;
    }

    /**
     * Sets the value of the currentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentAssets }
     *     
     */
    public void setCurrentAssets(CurrentAssets value) {
        this.currentAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalCurrentAssetsAmount() {
        return totalCurrentAssetsAmount;
    }

    /**
     * Sets the value of the totalCurrentAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalCurrentAssetsAmount(FinancialAmountType value) {
        this.totalCurrentAssetsAmount = value;
    }

    /**
     * Gets the value of the longTermAssets property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermAssets }
     *     
     */
    public LongTermAssets getLongTermAssets() {
        return longTermAssets;
    }

    /**
     * Sets the value of the longTermAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermAssets }
     *     
     */
    public void setLongTermAssets(LongTermAssets value) {
        this.longTermAssets = value;
    }

    /**
     * Gets the value of the totalLongTermAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalLongTermAssetsAmount() {
        return totalLongTermAssetsAmount;
    }

    /**
     * Sets the value of the totalLongTermAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalLongTermAssetsAmount(FinancialAmountType value) {
        this.totalLongTermAssetsAmount = value;
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

    /**
     * Gets the value of the freeFormStatementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeFormStatementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeFormStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeFormStatementItem }
     * 
     * 
     */
    public List<FreeFormStatementItem> getFreeFormStatementItem() {
        if (freeFormStatementItem == null) {
            freeFormStatementItem = new ArrayList<FreeFormStatementItem>();
        }
        return this.freeFormStatementItem;
    }

}
