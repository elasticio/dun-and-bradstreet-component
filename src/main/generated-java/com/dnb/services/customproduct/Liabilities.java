
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Liabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Liabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentLiabilities" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrentLiabilities" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="LongTermLiabilities" type="{http://services.dnb.com/CustomProductServiceV2.0}LongTermLiabilities" minOccurs="0"/>
 *         &lt;element name="TotalLongTermLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="Equity" type="{http://services.dnb.com/CustomProductServiceV2.0}Equity" minOccurs="0"/>
 *         &lt;element name="TotalEquityAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
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
@XmlType(name = "Liabilities", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currentLiabilities",
    "totalCurrentLiabilitiesAmount",
    "longTermLiabilities",
    "totalLongTermLiabilitiesAmount",
    "equity",
    "totalEquityAmount",
    "statementItem",
    "freeFormStatementItem"
})
public class Liabilities {

    @XmlElement(name = "CurrentLiabilities")
    protected CurrentLiabilities currentLiabilities;
    @XmlElement(name = "TotalCurrentLiabilitiesAmount")
    protected FinancialAmountType totalCurrentLiabilitiesAmount;
    @XmlElement(name = "LongTermLiabilities")
    protected LongTermLiabilities longTermLiabilities;
    @XmlElement(name = "TotalLongTermLiabilitiesAmount")
    protected FinancialAmountType totalLongTermLiabilitiesAmount;
    @XmlElement(name = "Equity")
    protected Equity equity;
    @XmlElement(name = "TotalEquityAmount")
    protected FinancialAmountType totalEquityAmount;
    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;
    @XmlElement(name = "FreeFormStatementItem")
    protected List<FreeFormStatementItem> freeFormStatementItem;

    /**
     * Gets the value of the currentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentLiabilities }
     *     
     */
    public CurrentLiabilities getCurrentLiabilities() {
        return currentLiabilities;
    }

    /**
     * Sets the value of the currentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentLiabilities }
     *     
     */
    public void setCurrentLiabilities(CurrentLiabilities value) {
        this.currentLiabilities = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalCurrentLiabilitiesAmount() {
        return totalCurrentLiabilitiesAmount;
    }

    /**
     * Sets the value of the totalCurrentLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalCurrentLiabilitiesAmount(FinancialAmountType value) {
        this.totalCurrentLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the longTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermLiabilities }
     *     
     */
    public LongTermLiabilities getLongTermLiabilities() {
        return longTermLiabilities;
    }

    /**
     * Sets the value of the longTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermLiabilities }
     *     
     */
    public void setLongTermLiabilities(LongTermLiabilities value) {
        this.longTermLiabilities = value;
    }

    /**
     * Gets the value of the totalLongTermLiabilitiesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalLongTermLiabilitiesAmount() {
        return totalLongTermLiabilitiesAmount;
    }

    /**
     * Sets the value of the totalLongTermLiabilitiesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalLongTermLiabilitiesAmount(FinancialAmountType value) {
        this.totalLongTermLiabilitiesAmount = value;
    }

    /**
     * Gets the value of the equity property.
     * 
     * @return
     *     possible object is
     *     {@link Equity }
     *     
     */
    public Equity getEquity() {
        return equity;
    }

    /**
     * Sets the value of the equity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equity }
     *     
     */
    public void setEquity(Equity value) {
        this.equity = value;
    }

    /**
     * Gets the value of the totalEquityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalEquityAmount() {
        return totalEquityAmount;
    }

    /**
     * Sets the value of the totalEquityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalEquityAmount(FinancialAmountType value) {
        this.totalEquityAmount = value;
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
