
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProvisionsAndDeferredTaxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProvisionsAndDeferredTaxes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeferredTaxesAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvisionsAndDeferredTaxes", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "deferredTaxesAmount"
})
public class ProvisionsAndDeferredTaxes {

    @XmlElement(name = "DeferredTaxesAmount")
    protected FinancialAmountType deferredTaxesAmount;

    /**
     * Gets the value of the deferredTaxesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getDeferredTaxesAmount() {
        return deferredTaxesAmount;
    }

    /**
     * Sets the value of the deferredTaxesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setDeferredTaxesAmount(FinancialAmountType value) {
        this.deferredTaxesAmount = value;
    }

}
