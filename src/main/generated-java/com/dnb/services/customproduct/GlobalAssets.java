
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAssets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalCurrentAssets" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="FixedAssets" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalLongTermAssets" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAssets", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currentAssets",
    "totalCurrentAssetsAmount",
    "fixedAssets",
    "totalFixedAssetsAmount",
    "otherAssetsAmount"
})
public class GlobalAssets {

    @XmlElement(name = "CurrentAssets")
    protected GlobalCurrentAssets currentAssets;
    @XmlElement(name = "TotalCurrentAssetsAmount")
    protected FinancialAmountType totalCurrentAssetsAmount;
    @XmlElement(name = "FixedAssets")
    protected GlobalLongTermAssets fixedAssets;
    @XmlElement(name = "TotalFixedAssetsAmount")
    protected FinancialAmountType totalFixedAssetsAmount;
    @XmlElement(name = "OtherAssetsAmount")
    protected FinancialAmountType otherAssetsAmount;

    /**
     * Gets the value of the currentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCurrentAssets }
     *     
     */
    public GlobalCurrentAssets getCurrentAssets() {
        return currentAssets;
    }

    /**
     * Sets the value of the currentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCurrentAssets }
     *     
     */
    public void setCurrentAssets(GlobalCurrentAssets value) {
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
     * Gets the value of the fixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalLongTermAssets }
     *     
     */
    public GlobalLongTermAssets getFixedAssets() {
        return fixedAssets;
    }

    /**
     * Sets the value of the fixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalLongTermAssets }
     *     
     */
    public void setFixedAssets(GlobalLongTermAssets value) {
        this.fixedAssets = value;
    }

    /**
     * Gets the value of the totalFixedAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalFixedAssetsAmount() {
        return totalFixedAssetsAmount;
    }

    /**
     * Sets the value of the totalFixedAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalFixedAssetsAmount(FinancialAmountType value) {
        this.totalFixedAssetsAmount = value;
    }

    /**
     * Gets the value of the otherAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getOtherAssetsAmount() {
        return otherAssetsAmount;
    }

    /**
     * Sets the value of the otherAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setOtherAssetsAmount(FinancialAmountType value) {
        this.otherAssetsAmount = value;
    }

}
