
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmallBusinessFinancialExchangeInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}SmallBusinessFinancialExchangeType" minOccurs="0"/>
 *         &lt;element name="SpendBehavior" type="{http://services.dnb.com/CustomProductServiceV2.0}SpendBehaviorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyDataType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "smallBusinessFinancialExchangeInformation",
    "spendBehavior"
})
public class ThirdPartyDataType {

    @XmlElement(name = "SmallBusinessFinancialExchangeInformation")
    protected SmallBusinessFinancialExchangeType smallBusinessFinancialExchangeInformation;
    @XmlElement(name = "SpendBehavior")
    protected SpendBehaviorType spendBehavior;

    /**
     * Gets the value of the smallBusinessFinancialExchangeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SmallBusinessFinancialExchangeType }
     *     
     */
    public SmallBusinessFinancialExchangeType getSmallBusinessFinancialExchangeInformation() {
        return smallBusinessFinancialExchangeInformation;
    }

    /**
     * Sets the value of the smallBusinessFinancialExchangeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallBusinessFinancialExchangeType }
     *     
     */
    public void setSmallBusinessFinancialExchangeInformation(SmallBusinessFinancialExchangeType value) {
        this.smallBusinessFinancialExchangeInformation = value;
    }

    /**
     * Gets the value of the spendBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link SpendBehaviorType }
     *     
     */
    public SpendBehaviorType getSpendBehavior() {
        return spendBehavior;
    }

    /**
     * Sets the value of the spendBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpendBehaviorType }
     *     
     */
    public void setSpendBehavior(SpendBehaviorType value) {
        this.spendBehavior = value;
    }

}
