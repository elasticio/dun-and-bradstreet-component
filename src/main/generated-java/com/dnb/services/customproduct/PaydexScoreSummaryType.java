
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaydexScoreSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TwentyFourMonthsHighestPaydexScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwentyFourMonthsHighestPaymentBehaviorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TwentyFourMonthsLowestPaydexScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwentyFourMonthsLowestPaymentBehaviorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaydexScoreSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "twentyFourMonthsHighestPaydexScore",
    "twentyFourMonthsHighestPaymentBehaviorText",
    "twentyFourMonthsLowestPaydexScore",
    "twentyFourMonthsLowestPaymentBehaviorText"
})
public class PaydexScoreSummaryType {

    @XmlElement(name = "TwentyFourMonthsHighestPaydexScore")
    protected Integer twentyFourMonthsHighestPaydexScore;
    @XmlElement(name = "TwentyFourMonthsHighestPaymentBehaviorText")
    protected String twentyFourMonthsHighestPaymentBehaviorText;
    @XmlElement(name = "TwentyFourMonthsLowestPaydexScore")
    protected Integer twentyFourMonthsLowestPaydexScore;
    @XmlElement(name = "TwentyFourMonthsLowestPaymentBehaviorText")
    protected String twentyFourMonthsLowestPaymentBehaviorText;

    /**
     * Gets the value of the twentyFourMonthsHighestPaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTwentyFourMonthsHighestPaydexScore() {
        return twentyFourMonthsHighestPaydexScore;
    }

    /**
     * Sets the value of the twentyFourMonthsHighestPaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTwentyFourMonthsHighestPaydexScore(Integer value) {
        this.twentyFourMonthsHighestPaydexScore = value;
    }

    /**
     * Gets the value of the twentyFourMonthsHighestPaymentBehaviorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwentyFourMonthsHighestPaymentBehaviorText() {
        return twentyFourMonthsHighestPaymentBehaviorText;
    }

    /**
     * Sets the value of the twentyFourMonthsHighestPaymentBehaviorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwentyFourMonthsHighestPaymentBehaviorText(String value) {
        this.twentyFourMonthsHighestPaymentBehaviorText = value;
    }

    /**
     * Gets the value of the twentyFourMonthsLowestPaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTwentyFourMonthsLowestPaydexScore() {
        return twentyFourMonthsLowestPaydexScore;
    }

    /**
     * Sets the value of the twentyFourMonthsLowestPaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTwentyFourMonthsLowestPaydexScore(Integer value) {
        this.twentyFourMonthsLowestPaydexScore = value;
    }

    /**
     * Gets the value of the twentyFourMonthsLowestPaymentBehaviorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwentyFourMonthsLowestPaymentBehaviorText() {
        return twentyFourMonthsLowestPaymentBehaviorText;
    }

    /**
     * Sets the value of the twentyFourMonthsLowestPaymentBehaviorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwentyFourMonthsLowestPaymentBehaviorText(String value) {
        this.twentyFourMonthsLowestPaymentBehaviorText = value;
    }

}
