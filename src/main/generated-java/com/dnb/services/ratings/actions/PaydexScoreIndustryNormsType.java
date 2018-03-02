
package com.dnb.services.ratings.actions;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaydexScoreIndustryNormsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreIndustryNormsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaydexMedianQuartileScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentBehaviourText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviourDaysQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaydexScoreIndustryNormsType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "paydexMedianQuartileScore",
    "paymentBehaviourText",
    "paymentBehaviourDaysQuantity"
})
public class PaydexScoreIndustryNormsType {

    @XmlElement(name = "PaydexMedianQuartileScore")
    protected Integer paydexMedianQuartileScore;
    @XmlElement(name = "PaymentBehaviourText")
    protected String paymentBehaviourText;
    @XmlElement(name = "PaymentBehaviourDaysQuantity")
    protected BigInteger paymentBehaviourDaysQuantity;

    /**
     * Gets the value of the paydexMedianQuartileScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexMedianQuartileScore() {
        return paydexMedianQuartileScore;
    }

    /**
     * Sets the value of the paydexMedianQuartileScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexMedianQuartileScore(Integer value) {
        this.paydexMedianQuartileScore = value;
    }

    /**
     * Gets the value of the paymentBehaviourText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBehaviourText() {
        return paymentBehaviourText;
    }

    /**
     * Sets the value of the paymentBehaviourText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBehaviourText(String value) {
        this.paymentBehaviourText = value;
    }

    /**
     * Gets the value of the paymentBehaviourDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentBehaviourDaysQuantity() {
        return paymentBehaviourDaysQuantity;
    }

    /**
     * Sets the value of the paymentBehaviourDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentBehaviourDaysQuantity(BigInteger value) {
        this.paymentBehaviourDaysQuantity = value;
    }

}
