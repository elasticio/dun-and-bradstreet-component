
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * An entry loop which can repeat multiple times to record the stock values by time period.
 *          
 * 
 * <p>Java class for StockPeriodSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockPeriodSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="StockLowestValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockHighestValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockPeriodSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "stockPeriod",
    "stockLowestValue",
    "stockHighestValue"
})
public class StockPeriodSummary {

    @XmlElement(name = "StockPeriod")
    protected Duration stockPeriod;
    @XmlElement(name = "StockLowestValue")
    protected BigDecimal stockLowestValue;
    @XmlElement(name = "StockHighestValue")
    protected BigDecimal stockHighestValue;

    /**
     * Gets the value of the stockPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStockPeriod() {
        return stockPeriod;
    }

    /**
     * Sets the value of the stockPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStockPeriod(Duration value) {
        this.stockPeriod = value;
    }

    /**
     * Gets the value of the stockLowestValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockLowestValue() {
        return stockLowestValue;
    }

    /**
     * Sets the value of the stockLowestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockLowestValue(BigDecimal value) {
        this.stockLowestValue = value;
    }

    /**
     * Gets the value of the stockHighestValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockHighestValue() {
        return stockHighestValue;
    }

    /**
     * Sets the value of the stockHighestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockHighestValue(BigDecimal value) {
        this.stockHighestValue = value;
    }

}
