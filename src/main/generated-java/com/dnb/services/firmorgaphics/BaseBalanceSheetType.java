
package com.dnb.services.firmorgaphics;

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
 *         &lt;element name="TotalAssetsAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *         &lt;element name="Liabilities" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Liabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBalanceSheetType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "totalAssetsAmount",
    "liabilities"
})
public class BaseBalanceSheetType {

    @XmlElement(name = "TotalAssetsAmount")
    protected FinancialAmountType totalAssetsAmount;
    @XmlElement(name = "Liabilities")
    protected Liabilities liabilities;

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

}
