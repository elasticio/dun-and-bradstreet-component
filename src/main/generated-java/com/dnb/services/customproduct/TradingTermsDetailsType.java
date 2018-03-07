
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the conditions of sale by which a subject offers goods to its customers or purchases goods from its suppliers on an international and domestic basis.
 *          
 * 
 * <p>Java class for TradingTermsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingTermsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradingTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="TradingTermsTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TradingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountLowPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountDaysLowQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountHighPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscountDaysHighQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetDueDaysQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetDueDayText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingTermsDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "tradingTypeText",
    "tradingTermsTypeText",
    "tradingPercentage",
    "discountLowPercentage",
    "discountDaysLowQuantity",
    "discountHighPercentage",
    "discountDaysHighQuantity",
    "netDueDaysQuantity",
    "netDueDayText"
})
public class TradingTermsDetailsType {

    @XmlElement(name = "TradingTypeText", required = true)
    protected DNBDecodedStringType tradingTypeText;
    @XmlElement(name = "TradingTermsTypeText")
    protected DNBDecodedStringType tradingTermsTypeText;
    @XmlElement(name = "TradingPercentage")
    protected BigDecimal tradingPercentage;
    @XmlElement(name = "DiscountLowPercentage")
    protected BigDecimal discountLowPercentage;
    @XmlElement(name = "DiscountDaysLowQuantity")
    protected Integer discountDaysLowQuantity;
    @XmlElement(name = "DiscountHighPercentage")
    protected BigDecimal discountHighPercentage;
    @XmlElement(name = "DiscountDaysHighQuantity")
    protected Integer discountDaysHighQuantity;
    @XmlElement(name = "NetDueDaysQuantity")
    protected Integer netDueDaysQuantity;
    @XmlElement(name = "NetDueDayText")
    protected DNBDecodedStringType netDueDayText;

    /**
     * Gets the value of the tradingTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTradingTypeText() {
        return tradingTypeText;
    }

    /**
     * Sets the value of the tradingTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTradingTypeText(DNBDecodedStringType value) {
        this.tradingTypeText = value;
    }

    /**
     * Gets the value of the tradingTermsTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTradingTermsTypeText() {
        return tradingTermsTypeText;
    }

    /**
     * Sets the value of the tradingTermsTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTradingTermsTypeText(DNBDecodedStringType value) {
        this.tradingTermsTypeText = value;
    }

    /**
     * Gets the value of the tradingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradingPercentage() {
        return tradingPercentage;
    }

    /**
     * Sets the value of the tradingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradingPercentage(BigDecimal value) {
        this.tradingPercentage = value;
    }

    /**
     * Gets the value of the discountLowPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountLowPercentage() {
        return discountLowPercentage;
    }

    /**
     * Sets the value of the discountLowPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountLowPercentage(BigDecimal value) {
        this.discountLowPercentage = value;
    }

    /**
     * Gets the value of the discountDaysLowQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDaysLowQuantity() {
        return discountDaysLowQuantity;
    }

    /**
     * Sets the value of the discountDaysLowQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDaysLowQuantity(Integer value) {
        this.discountDaysLowQuantity = value;
    }

    /**
     * Gets the value of the discountHighPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountHighPercentage() {
        return discountHighPercentage;
    }

    /**
     * Sets the value of the discountHighPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountHighPercentage(BigDecimal value) {
        this.discountHighPercentage = value;
    }

    /**
     * Gets the value of the discountDaysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDaysHighQuantity() {
        return discountDaysHighQuantity;
    }

    /**
     * Sets the value of the discountDaysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDaysHighQuantity(Integer value) {
        this.discountDaysHighQuantity = value;
    }

    /**
     * Gets the value of the netDueDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetDueDaysQuantity() {
        return netDueDaysQuantity;
    }

    /**
     * Sets the value of the netDueDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetDueDaysQuantity(Integer value) {
        this.netDueDaysQuantity = value;
    }

    /**
     * Gets the value of the netDueDayText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNetDueDayText() {
        return netDueDayText;
    }

    /**
     * Sets the value of the netDueDayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNetDueDayText(DNBDecodedStringType value) {
        this.netDueDayText = value;
    }

}
