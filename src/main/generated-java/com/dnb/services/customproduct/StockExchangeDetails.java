
package com.dnb.services.customproduct;

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
 *         &lt;element name="StockExchangeName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="StockExchangeTickerName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryStockExchangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockExchangeWebPageAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}WebPageAddressType" minOccurs="0"/>
 *         &lt;element name="StockExchangeAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="CountryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StockTradingInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}StockTradingInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockExchangeDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "stockExchangeName",
    "stockExchangeTickerName",
    "primaryStockExchangeIndicator",
    "stockExchangeWebPageAddress",
    "stockExchangeAbbreviatedName",
    "countryISOAlpha2Code",
    "countryOfficialName",
    "stockTradingInformation"
})
public class StockExchangeDetails {

    @XmlElement(name = "StockExchangeName")
    protected DNBDecodedStringType stockExchangeName;
    @XmlElement(name = "StockExchangeTickerName")
    protected String stockExchangeTickerName;
    @XmlElement(name = "PrimaryStockExchangeIndicator")
    protected Boolean primaryStockExchangeIndicator;
    @XmlElement(name = "StockExchangeWebPageAddress")
    protected WebPageAddressType stockExchangeWebPageAddress;
    @XmlElement(name = "StockExchangeAbbreviatedName")
    protected String stockExchangeAbbreviatedName;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "CountryOfficialName")
    protected String countryOfficialName;
    @XmlElement(name = "StockTradingInformation")
    protected StockTradingInformation stockTradingInformation;

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

    /**
     * Gets the value of the primaryStockExchangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryStockExchangeIndicator() {
        return primaryStockExchangeIndicator;
    }

    /**
     * Sets the value of the primaryStockExchangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryStockExchangeIndicator(Boolean value) {
        this.primaryStockExchangeIndicator = value;
    }

    /**
     * Gets the value of the stockExchangeWebPageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageAddressType }
     *     
     */
    public WebPageAddressType getStockExchangeWebPageAddress() {
        return stockExchangeWebPageAddress;
    }

    /**
     * Sets the value of the stockExchangeWebPageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageAddressType }
     *     
     */
    public void setStockExchangeWebPageAddress(WebPageAddressType value) {
        this.stockExchangeWebPageAddress = value;
    }

    /**
     * Gets the value of the stockExchangeAbbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchangeAbbreviatedName() {
        return stockExchangeAbbreviatedName;
    }

    /**
     * Sets the value of the stockExchangeAbbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchangeAbbreviatedName(String value) {
        this.stockExchangeAbbreviatedName = value;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the countryOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfficialName() {
        return countryOfficialName;
    }

    /**
     * Sets the value of the countryOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfficialName(String value) {
        this.countryOfficialName = value;
    }

    /**
     * Gets the value of the stockTradingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StockTradingInformation }
     *     
     */
    public StockTradingInformation getStockTradingInformation() {
        return stockTradingInformation;
    }

    /**
     * Sets the value of the stockTradingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockTradingInformation }
     *     
     */
    public void setStockTradingInformation(StockTradingInformation value) {
        this.stockTradingInformation = value;
    }

}
