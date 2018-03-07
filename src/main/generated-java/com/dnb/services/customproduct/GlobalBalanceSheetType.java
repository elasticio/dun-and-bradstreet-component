
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalBalanceSheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalBalanceSheetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assets" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalAssets" minOccurs="0"/>
 *         &lt;element name="TotalAssetsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="Liabilities" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalLiabilities" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalBalanceSheetType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assets",
    "totalAssetsAmount",
    "liabilities",
    "totalLiabilitiesAmount"
})
public class GlobalBalanceSheetType {

    @XmlElement(name = "Assets")
    protected GlobalAssets assets;
    @XmlElement(name = "TotalAssetsAmount")
    protected FinancialAmountType totalAssetsAmount;
    @XmlElement(name = "Liabilities")
    protected GlobalLiabilities liabilities;
    @XmlElement(name = "TotalLiabilitiesAmount")
    protected FinancialAmountType totalLiabilitiesAmount;

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalAssets }
     *     
     */
    public GlobalAssets getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalAssets }
     *     
     */
    public void setAssets(GlobalAssets value) {
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
     *     {@link GlobalLiabilities }
     *     
     */
    public GlobalLiabilities getLiabilities() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalLiabilities }
     *     
     */
    public void setLiabilities(GlobalLiabilities value) {
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

}
