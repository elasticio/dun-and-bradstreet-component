
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the stock trading informations of the subject
 *          
 * 
 * <p>Java class for StockTradingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockTradingInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockTradingDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}StockTradingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StockPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}StockPeriodSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StockExchangeTradingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTradingInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "stockTradingDetail",
    "stockPeriodSummary",
    "stockExchangeTradingStatusText"
})
public class StockTradingInformation {

    @XmlElement(name = "StockTradingDetail")
    protected List<StockTradingDetail> stockTradingDetail;
    @XmlElement(name = "StockPeriodSummary")
    protected List<StockPeriodSummary> stockPeriodSummary;
    @XmlElement(name = "StockExchangeTradingStatusText")
    protected DNBDecodedStringNewType stockExchangeTradingStatusText;

    /**
     * Gets the value of the stockTradingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockTradingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockTradingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockTradingDetail }
     * 
     * 
     */
    public List<StockTradingDetail> getStockTradingDetail() {
        if (stockTradingDetail == null) {
            stockTradingDetail = new ArrayList<StockTradingDetail>();
        }
        return this.stockTradingDetail;
    }

    /**
     * Gets the value of the stockPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockPeriodSummary }
     * 
     * 
     */
    public List<StockPeriodSummary> getStockPeriodSummary() {
        if (stockPeriodSummary == null) {
            stockPeriodSummary = new ArrayList<StockPeriodSummary>();
        }
        return this.stockPeriodSummary;
    }

    /**
     * Gets the value of the stockExchangeTradingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getStockExchangeTradingStatusText() {
        return stockExchangeTradingStatusText;
    }

    /**
     * Sets the value of the stockExchangeTradingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setStockExchangeTradingStatusText(DNBDecodedStringNewType value) {
        this.stockExchangeTradingStatusText = value;
    }

}
