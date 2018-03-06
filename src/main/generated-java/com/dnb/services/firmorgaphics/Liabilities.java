
package com.dnb.services.firmorgaphics;

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
 *         &lt;element name="TotalEquityAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liabilities", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "totalEquityAmount"
})
public class Liabilities {

    @XmlElement(name = "TotalEquityAmount")
    protected FinancialAmountType totalEquityAmount;

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

}
