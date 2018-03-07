
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailsDisclaimerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsDisclaimerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDetailsDisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsDisclaimerInfo", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "paymentDetailsDisclaimerText"
})
public class PaymentDetailsDisclaimerInfo {

    @XmlElement(name = "PaymentDetailsDisclaimerText", required = true)
    protected String paymentDetailsDisclaimerText;

    /**
     * Gets the value of the paymentDetailsDisclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDetailsDisclaimerText() {
        return paymentDetailsDisclaimerText;
    }

    /**
     * Sets the value of the paymentDetailsDisclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDetailsDisclaimerText(String value) {
        this.paymentDetailsDisclaimerText = value;
    }

}
