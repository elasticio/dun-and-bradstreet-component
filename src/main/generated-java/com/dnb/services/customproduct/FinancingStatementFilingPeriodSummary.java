
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for FinancingStatementFilingPeriodSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingStatementFilingPeriodSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimePeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="TotalFilingCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalFiledAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="MostRecentFilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingStatementFilingPeriodSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "timePeriod",
    "totalFilingCount",
    "totalFiledAmount",
    "mostRecentFilingDate"
})
public class FinancingStatementFilingPeriodSummary {

    @XmlElement(name = "TimePeriod")
    protected Duration timePeriod;
    @XmlElement(name = "TotalFilingCount")
    protected BigInteger totalFilingCount;
    @XmlElement(name = "TotalFiledAmount")
    protected AmountType totalFiledAmount;
    @XmlElement(name = "MostRecentFilingDate")
    protected DNBDateType mostRecentFilingDate;

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimePeriod(Duration value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the totalFilingCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFilingCount() {
        return totalFilingCount;
    }

    /**
     * Sets the value of the totalFilingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFilingCount(BigInteger value) {
        this.totalFilingCount = value;
    }

    /**
     * Gets the value of the totalFiledAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalFiledAmount() {
        return totalFiledAmount;
    }

    /**
     * Sets the value of the totalFiledAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalFiledAmount(AmountType value) {
        this.totalFiledAmount = value;
    }

    /**
     * Gets the value of the mostRecentFilingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentFilingDate() {
        return mostRecentFilingDate;
    }

    /**
     * Sets the value of the mostRecentFilingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentFilingDate(DNBDateType value) {
        this.mostRecentFilingDate = value;
    }

}
