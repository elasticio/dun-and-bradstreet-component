
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records references or opinions  in terms of the timeliness of payment, the amounts of the transactions and the terms of sale applied to the transactions and  summarized views of this data that involves the subject either as a buyer or supplier of goods or services.
 *          
 * 
 * <p>Java class for BusinessTrading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessTrading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purchaser" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Purchaser" minOccurs="0"/>
 *         &lt;element name="PaydexScoreNorms" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PaydexScoreNorms" minOccurs="0"/>
 *         &lt;element name="TradeDataUnavailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StringBaseType720" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessTrading", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "purchaser",
    "paydexScoreNorms",
    "tradeDataUnavailabilityIndicator",
    "disclaimerText"
})
public class BusinessTrading {

    @XmlElement(name = "Purchaser")
    protected Purchaser purchaser;
    @XmlElement(name = "PaydexScoreNorms")
    protected PaydexScoreNorms paydexScoreNorms;
    @XmlElement(name = "TradeDataUnavailabilityIndicator")
    protected Boolean tradeDataUnavailabilityIndicator;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;

    /**
     * Gets the value of the purchaser property.
     * 
     * @return
     *     possible object is
     *     {@link Purchaser }
     *     
     */
    public Purchaser getPurchaser() {
        return purchaser;
    }

    /**
     * Sets the value of the purchaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchaser }
     *     
     */
    public void setPurchaser(Purchaser value) {
        this.purchaser = value;
    }

    /**
     * Gets the value of the paydexScoreNorms property.
     * 
     * @return
     *     possible object is
     *     {@link PaydexScoreNorms }
     *     
     */
    public PaydexScoreNorms getPaydexScoreNorms() {
        return paydexScoreNorms;
    }

    /**
     * Sets the value of the paydexScoreNorms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaydexScoreNorms }
     *     
     */
    public void setPaydexScoreNorms(PaydexScoreNorms value) {
        this.paydexScoreNorms = value;
    }

    /**
     * Gets the value of the tradeDataUnavailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradeDataUnavailabilityIndicator() {
        return tradeDataUnavailabilityIndicator;
    }

    /**
     * Sets the value of the tradeDataUnavailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradeDataUnavailabilityIndicator(Boolean value) {
        this.tradeDataUnavailabilityIndicator = value;
    }

    /**
     * Gets the value of the disclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerText() {
        return disclaimerText;
    }

    /**
     * Sets the value of the disclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerText(String value) {
        this.disclaimerText = value;
    }

}
