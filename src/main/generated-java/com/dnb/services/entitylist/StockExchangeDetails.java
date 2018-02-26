
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of any Stock Exchanges on which the subject's shares are traded.
 *          
 * 
 * <p>Java class for StockExchangeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockExchangeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockExchangeName" type="{http://services.dnb.com/EntityListServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="StockExchangeTickerName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
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
@XmlType(name = "StockExchangeDetails", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "stockExchangeName",
    "stockExchangeTickerName"
})
public class StockExchangeDetails {

    @XmlElement(name = "StockExchangeName")
    protected DNBDecodedStringType stockExchangeName;
    @XmlElement(name = "StockExchangeTickerName")
    protected String stockExchangeTickerName;

    /**
     * Gets the value of the stockExchangeName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getStockExchangeName() {
        return stockExchangeName;
    }

    /**
     * Sets the value of the stockExchangeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setStockExchangeName(DNBDecodedStringType value) {
        this.stockExchangeName = value;
    }

    /**
     * Gets the value of the stockExchangeTickerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchangeTickerName() {
        return stockExchangeTickerName;
    }

    /**
     * Sets the value of the stockExchangeTickerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchangeTickerName(String value) {
        this.stockExchangeTickerName = value;
    }

}
