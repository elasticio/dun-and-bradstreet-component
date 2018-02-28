
package com.dnb.services.contact;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LanguagePreferenceCode" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="CharacterSetPreferenceCode" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="ProductFormatPreferenceCode" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="TradeUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyPreferenceISOAlpha3Code" type="{http://services.dnb.com/ContactProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="ReturnOnlyInDateDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderReasonCode" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="ReturnConnectMailDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "dnbProductID",
    "languagePreferenceCode",
    "characterSetPreferenceCode",
    "productFormatPreferenceCode",
    "tradeUpIndicator",
    "currencyPreferenceISOAlpha3Code",
    "returnOnlyInDateDataIndicator",
    "orderReasonCode",
    "returnConnectMailDataIndicator"
})
public class ProductSpecification {

    @XmlElement(name = "DNBProductID", required = true)
    protected String dnbProductID;
    @XmlElement(name = "LanguagePreferenceCode")
    protected BigInteger languagePreferenceCode;
    @XmlElement(name = "CharacterSetPreferenceCode")
    protected BigInteger characterSetPreferenceCode;
    @XmlElement(name = "ProductFormatPreferenceCode")
    protected BigInteger productFormatPreferenceCode;
    @XmlElement(name = "TradeUpIndicator")
    protected Boolean tradeUpIndicator;
    @XmlElement(name = "CurrencyPreferenceISOAlpha3Code")
    protected String currencyPreferenceISOAlpha3Code;
    @XmlElement(name = "ReturnOnlyInDateDataIndicator")
    protected Boolean returnOnlyInDateDataIndicator;
    @XmlElement(name = "OrderReasonCode")
    protected BigInteger orderReasonCode;
    @XmlElement(name = "ReturnConnectMailDataIndicator")
    protected Boolean returnConnectMailDataIndicator;

    /**
     * Gets the value of the dnbProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBProductID() {
        return dnbProductID;
    }

    /**
     * Sets the value of the dnbProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBProductID(String value) {
        this.dnbProductID = value;
    }

    /**
     * Gets the value of the languagePreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }

    /**
     * Sets the value of the languagePreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguagePreferenceCode(BigInteger value) {
        this.languagePreferenceCode = value;
    }

    /**
     * Gets the value of the characterSetPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharacterSetPreferenceCode() {
        return characterSetPreferenceCode;
    }

    /**
     * Sets the value of the characterSetPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharacterSetPreferenceCode(BigInteger value) {
        this.characterSetPreferenceCode = value;
    }

    /**
     * Gets the value of the productFormatPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductFormatPreferenceCode() {
        return productFormatPreferenceCode;
    }

    /**
     * Sets the value of the productFormatPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductFormatPreferenceCode(BigInteger value) {
        this.productFormatPreferenceCode = value;
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradeUpIndicator(Boolean value) {
        this.tradeUpIndicator = value;
    }

    /**
     * Gets the value of the currencyPreferenceISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyPreferenceISOAlpha3Code() {
        return currencyPreferenceISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyPreferenceISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyPreferenceISOAlpha3Code(String value) {
        this.currencyPreferenceISOAlpha3Code = value;
    }

    /**
     * Gets the value of the returnOnlyInDateDataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOnlyInDateDataIndicator() {
        return returnOnlyInDateDataIndicator;
    }

    /**
     * Sets the value of the returnOnlyInDateDataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnlyInDateDataIndicator(Boolean value) {
        this.returnOnlyInDateDataIndicator = value;
    }

    /**
     * Gets the value of the orderReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Sets the value of the orderReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderReasonCode(BigInteger value) {
        this.orderReasonCode = value;
    }

    /**
     * Gets the value of the returnConnectMailDataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnConnectMailDataIndicator() {
        return returnConnectMailDataIndicator;
    }

    /**
     * Sets the value of the returnConnectMailDataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnConnectMailDataIndicator(Boolean value) {
        this.returnConnectMailDataIndicator = value;
    }

}
