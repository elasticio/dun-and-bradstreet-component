
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PastDuePaymentCycleSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PastDuePaymentCycleSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PastDuePaymentCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PastDuePaymentCycleSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "pastDuePaymentCount",
    "pastDueAmount"
})
@XmlSeeAlso({
    PastDuePaymentType.class
})
public class PastDuePaymentCycleSummaryType {

    @XmlElement(name = "PastDuePaymentCount")
    protected BigInteger pastDuePaymentCount;
    @XmlElement(name = "PastDueAmount")
    protected BigDecimal pastDueAmount;

    /**
     * Gets the value of the pastDuePaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPastDuePaymentCount() {
        return pastDuePaymentCount;
    }

    /**
     * Sets the value of the pastDuePaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPastDuePaymentCount(BigInteger value) {
        this.pastDuePaymentCount = value;
    }

    /**
     * Gets the value of the pastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDueAmount() {
        return pastDueAmount;
    }

    /**
     * Sets the value of the pastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDueAmount(BigDecimal value) {
        this.pastDueAmount = value;
    }

}
