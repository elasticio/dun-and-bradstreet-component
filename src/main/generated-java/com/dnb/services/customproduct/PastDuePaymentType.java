
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PastDuePaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PastDuePaymentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}PastDuePaymentCycleSummaryType">
 *       &lt;sequence>
 *         &lt;element name="PastDueBalancePercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaximumPastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PastDuePaymentType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "pastDueBalancePercentage",
    "maximumPastDueAmount"
})
public class PastDuePaymentType
    extends PastDuePaymentCycleSummaryType
{

    @XmlElement(name = "PastDueBalancePercentage")
    protected BigDecimal pastDueBalancePercentage;
    @XmlElement(name = "MaximumPastDueAmount")
    protected BigDecimal maximumPastDueAmount;

    /**
     * Gets the value of the pastDueBalancePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDueBalancePercentage() {
        return pastDueBalancePercentage;
    }

    /**
     * Sets the value of the pastDueBalancePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDueBalancePercentage(BigDecimal value) {
        this.pastDueBalancePercentage = value;
    }

    /**
     * Gets the value of the maximumPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPastDueAmount() {
        return maximumPastDueAmount;
    }

    /**
     * Sets the value of the maximumPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPastDueAmount(BigDecimal value) {
        this.maximumPastDueAmount = value;
    }

}
