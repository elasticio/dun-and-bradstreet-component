
package com.dnb.services.firmorgaphics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyFinancialFiguresOverview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyFinancialFiguresOverview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementHeaderDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StatementHeaderDetails" minOccurs="0"/>
 *         &lt;element name="SalesRevenueAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesTurnoverGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantityGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantityReliabilityText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyFinancialFiguresOverview", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "statementHeaderDetails",
    "salesRevenueAmount",
    "profitOrLossAmount",
    "salesTurnoverGrowthRate",
    "profitOrLossGrowthRate",
    "employeeQuantityGrowthRate",
    "employeeQuantity",
    "employeeQuantityReliabilityText"
})
public class KeyFinancialFiguresOverview {

    @XmlElement(name = "StatementHeaderDetails")
    protected StatementHeaderDetails statementHeaderDetails;
    @XmlElement(name = "SalesRevenueAmount")
    protected List<AmountType> salesRevenueAmount;
    @XmlElement(name = "ProfitOrLossAmount")
    protected List<AmountType> profitOrLossAmount;
    @XmlElement(name = "SalesTurnoverGrowthRate")
    protected BigDecimal salesTurnoverGrowthRate;
    @XmlElement(name = "ProfitOrLossGrowthRate")
    protected BigDecimal profitOrLossGrowthRate;
    @XmlElement(name = "EmployeeQuantityGrowthRate")
    protected BigDecimal employeeQuantityGrowthRate;
    @XmlElement(name = "EmployeeQuantity")
    protected Integer employeeQuantity;
    @XmlElement(name = "EmployeeQuantityReliabilityText")
    protected DNBDecodedStringType employeeQuantityReliabilityText;

    /**
     * Gets the value of the statementHeaderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatementHeaderDetails }
     *     
     */
    public StatementHeaderDetails getStatementHeaderDetails() {
        return statementHeaderDetails;
    }

    /**
     * Sets the value of the statementHeaderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementHeaderDetails }
     *     
     */
    public void setStatementHeaderDetails(StatementHeaderDetails value) {
        this.statementHeaderDetails = value;
    }

    /**
     * Gets the value of the salesRevenueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRevenueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRevenueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSalesRevenueAmount() {
        if (salesRevenueAmount == null) {
            salesRevenueAmount = new ArrayList<AmountType>();
        }
        return this.salesRevenueAmount;
    }

    /**
     * Gets the value of the profitOrLossAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profitOrLossAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfitOrLossAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getProfitOrLossAmount() {
        if (profitOrLossAmount == null) {
            profitOrLossAmount = new ArrayList<AmountType>();
        }
        return this.profitOrLossAmount;
    }

    /**
     * Gets the value of the salesTurnoverGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTurnoverGrowthRate() {
        return salesTurnoverGrowthRate;
    }

    /**
     * Sets the value of the salesTurnoverGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTurnoverGrowthRate(BigDecimal value) {
        this.salesTurnoverGrowthRate = value;
    }

    /**
     * Gets the value of the profitOrLossGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitOrLossGrowthRate() {
        return profitOrLossGrowthRate;
    }

    /**
     * Sets the value of the profitOrLossGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitOrLossGrowthRate(BigDecimal value) {
        this.profitOrLossGrowthRate = value;
    }

    /**
     * Gets the value of the employeeQuantityGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeQuantityGrowthRate() {
        return employeeQuantityGrowthRate;
    }

    /**
     * Sets the value of the employeeQuantityGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeQuantityGrowthRate(BigDecimal value) {
        this.employeeQuantityGrowthRate = value;
    }

    /**
     * Gets the value of the employeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Sets the value of the employeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeQuantity(Integer value) {
        this.employeeQuantity = value;
    }

    /**
     * Gets the value of the employeeQuantityReliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEmployeeQuantityReliabilityText() {
        return employeeQuantityReliabilityText;
    }

    /**
     * Sets the value of the employeeQuantityReliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEmployeeQuantityReliabilityText(DNBDecodedStringType value) {
        this.employeeQuantityReliabilityText = value;
    }

}
