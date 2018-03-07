
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalLongTermAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalLongTermAssets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TangibleFixedAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalTangibleFixedAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="FormationExpensesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="IntangibleFixedAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalIntangibleFixedAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="TangibleFixedAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="FinancialFixedAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItemType" minOccurs="0"/>
 *         &lt;element name="TotalFinancialFixedAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalLongTermAssets", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "tangibleFixedAssets",
    "totalTangibleFixedAssetsAmount",
    "formationExpensesAmount",
    "intangibleFixedAssets",
    "totalIntangibleFixedAssetsAmount",
    "tangibleFixedAssetsAmount",
    "financialFixedAssets",
    "totalFinancialFixedAssetsAmount"
})
public class GlobalLongTermAssets {

    @XmlElement(name = "TangibleFixedAssets")
    protected StatementItemType tangibleFixedAssets;
    @XmlElement(name = "TotalTangibleFixedAssetsAmount")
    protected FinancialAmountType totalTangibleFixedAssetsAmount;
    @XmlElement(name = "FormationExpensesAmount")
    protected FinancialAmountType formationExpensesAmount;
    @XmlElement(name = "IntangibleFixedAssets")
    protected StatementItemType intangibleFixedAssets;
    @XmlElement(name = "TotalIntangibleFixedAssetsAmount")
    protected FinancialAmountType totalIntangibleFixedAssetsAmount;
    @XmlElement(name = "TangibleFixedAssetsAmount")
    protected FinancialAmountType tangibleFixedAssetsAmount;
    @XmlElement(name = "FinancialFixedAssets")
    protected StatementItemType financialFixedAssets;
    @XmlElement(name = "TotalFinancialFixedAssetsAmount")
    protected FinancialAmountType totalFinancialFixedAssetsAmount;

    /**
     * Gets the value of the tangibleFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getTangibleFixedAssets() {
        return tangibleFixedAssets;
    }

    /**
     * Sets the value of the tangibleFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setTangibleFixedAssets(StatementItemType value) {
        this.tangibleFixedAssets = value;
    }

    /**
     * Gets the value of the totalTangibleFixedAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalTangibleFixedAssetsAmount() {
        return totalTangibleFixedAssetsAmount;
    }

    /**
     * Sets the value of the totalTangibleFixedAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalTangibleFixedAssetsAmount(FinancialAmountType value) {
        this.totalTangibleFixedAssetsAmount = value;
    }

    /**
     * Gets the value of the formationExpensesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFormationExpensesAmount() {
        return formationExpensesAmount;
    }

    /**
     * Sets the value of the formationExpensesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFormationExpensesAmount(FinancialAmountType value) {
        this.formationExpensesAmount = value;
    }

    /**
     * Gets the value of the intangibleFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getIntangibleFixedAssets() {
        return intangibleFixedAssets;
    }

    /**
     * Sets the value of the intangibleFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setIntangibleFixedAssets(StatementItemType value) {
        this.intangibleFixedAssets = value;
    }

    /**
     * Gets the value of the totalIntangibleFixedAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalIntangibleFixedAssetsAmount() {
        return totalIntangibleFixedAssetsAmount;
    }

    /**
     * Sets the value of the totalIntangibleFixedAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalIntangibleFixedAssetsAmount(FinancialAmountType value) {
        this.totalIntangibleFixedAssetsAmount = value;
    }

    /**
     * Gets the value of the tangibleFixedAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTangibleFixedAssetsAmount() {
        return tangibleFixedAssetsAmount;
    }

    /**
     * Sets the value of the tangibleFixedAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTangibleFixedAssetsAmount(FinancialAmountType value) {
        this.tangibleFixedAssetsAmount = value;
    }

    /**
     * Gets the value of the financialFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link StatementItemType }
     *     
     */
    public StatementItemType getFinancialFixedAssets() {
        return financialFixedAssets;
    }

    /**
     * Sets the value of the financialFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementItemType }
     *     
     */
    public void setFinancialFixedAssets(StatementItemType value) {
        this.financialFixedAssets = value;
    }

    /**
     * Gets the value of the totalFinancialFixedAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalFinancialFixedAssetsAmount() {
        return totalFinancialFixedAssetsAmount;
    }

    /**
     * Sets the value of the totalFinancialFixedAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalFinancialFixedAssetsAmount(FinancialAmountType value) {
        this.totalFinancialFixedAssetsAmount = value;
    }

}
