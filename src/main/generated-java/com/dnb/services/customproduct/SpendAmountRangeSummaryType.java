
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple timesto record aggregated views of the purchases behavioural was made by the business that has been summarized by the amount
 *          
 * 
 * <p>Java class for SpendAmountRangeSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpendAmountRangeSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowestSpendRangeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighestSpendRangeAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpendAmountRangeSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "lowestSpendRangeAmount",
    "highestSpendRangeAmount",
    "purchaseOrderCount"
})
public class SpendAmountRangeSummaryType {

    @XmlElement(name = "LowestSpendRangeAmount")
    protected AmountType lowestSpendRangeAmount;
    @XmlElement(name = "HighestSpendRangeAmount")
    protected AmountType highestSpendRangeAmount;
    @XmlElement(name = "PurchaseOrderCount")
    protected Integer purchaseOrderCount;

    /**
     * Gets the value of the lowestSpendRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLowestSpendRangeAmount() {
        return lowestSpendRangeAmount;
    }

    /**
     * Sets the value of the lowestSpendRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLowestSpendRangeAmount(AmountType value) {
        this.lowestSpendRangeAmount = value;
    }

    /**
     * Gets the value of the highestSpendRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighestSpendRangeAmount() {
        return highestSpendRangeAmount;
    }

    /**
     * Sets the value of the highestSpendRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighestSpendRangeAmount(AmountType value) {
        this.highestSpendRangeAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseOrderCount() {
        return purchaseOrderCount;
    }

    /**
     * Sets the value of the purchaseOrderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseOrderCount(Integer value) {
        this.purchaseOrderCount = value;
    }

}
