
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of details regarding the composition of each type of stock equity a business employs, as recorded in the document filed with the registry or a similar body.
 *          
 * 
 * <p>Java class for CapitalStockDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapitalStockDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapitalStockParValueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalStockSubTypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapitalStockQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VotingRightsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapitalStockAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="StockTypeConvertibleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapitalStockParValueIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayGroupSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareHoldingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndirectShareHoldingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShareHoldingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ConfirmedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapitalStockDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "capitalStockParValueAmount",
    "capitalStockSubTypeText",
    "capitalStockQuantity",
    "votingRightsIndicator",
    "capitalStockAmount",
    "stockTypeConvertibleIndicator",
    "capitalStockParValueIndicator",
    "displayGroupSequence",
    "shareHoldingPercentage",
    "indirectShareHoldingPercentage",
    "shareHoldingAmount",
    "confirmedDate"
})
public class CapitalStockDetails {

    @XmlElement(name = "CapitalStockParValueAmount")
    protected AmountType capitalStockParValueAmount;
    @XmlElement(name = "CapitalStockSubTypeText")
    protected String capitalStockSubTypeText;
    @XmlElement(name = "CapitalStockQuantity")
    protected Long capitalStockQuantity;
    @XmlElement(name = "VotingRightsIndicator")
    protected Boolean votingRightsIndicator;
    @XmlElement(name = "CapitalStockAmount")
    protected AmountType capitalStockAmount;
    @XmlElement(name = "StockTypeConvertibleIndicator")
    protected Boolean stockTypeConvertibleIndicator;
    @XmlElement(name = "CapitalStockParValueIndicator")
    protected Boolean capitalStockParValueIndicator;
    @XmlElement(name = "DisplayGroupSequence")
    protected String displayGroupSequence;
    @XmlElement(name = "ShareHoldingPercentage")
    protected BigDecimal shareHoldingPercentage;
    @XmlElement(name = "IndirectShareHoldingPercentage")
    protected BigDecimal indirectShareHoldingPercentage;
    @XmlElement(name = "ShareHoldingAmount")
    protected AmountType shareHoldingAmount;
    @XmlElement(name = "ConfirmedDate")
    protected DNBDateType confirmedDate;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected BigInteger dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "TypeText")
    protected String typeText;

    /**
     * Gets the value of the capitalStockParValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalStockParValueAmount() {
        return capitalStockParValueAmount;
    }

    /**
     * Sets the value of the capitalStockParValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalStockParValueAmount(AmountType value) {
        this.capitalStockParValueAmount = value;
    }

    /**
     * Gets the value of the capitalStockSubTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalStockSubTypeText() {
        return capitalStockSubTypeText;
    }

    /**
     * Sets the value of the capitalStockSubTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalStockSubTypeText(String value) {
        this.capitalStockSubTypeText = value;
    }

    /**
     * Gets the value of the capitalStockQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapitalStockQuantity() {
        return capitalStockQuantity;
    }

    /**
     * Sets the value of the capitalStockQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapitalStockQuantity(Long value) {
        this.capitalStockQuantity = value;
    }

    /**
     * Gets the value of the votingRightsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVotingRightsIndicator() {
        return votingRightsIndicator;
    }

    /**
     * Sets the value of the votingRightsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVotingRightsIndicator(Boolean value) {
        this.votingRightsIndicator = value;
    }

    /**
     * Gets the value of the capitalStockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalStockAmount() {
        return capitalStockAmount;
    }

    /**
     * Sets the value of the capitalStockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalStockAmount(AmountType value) {
        this.capitalStockAmount = value;
    }

    /**
     * Gets the value of the stockTypeConvertibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockTypeConvertibleIndicator() {
        return stockTypeConvertibleIndicator;
    }

    /**
     * Sets the value of the stockTypeConvertibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStockTypeConvertibleIndicator(Boolean value) {
        this.stockTypeConvertibleIndicator = value;
    }

    /**
     * Gets the value of the capitalStockParValueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapitalStockParValueIndicator() {
        return capitalStockParValueIndicator;
    }

    /**
     * Sets the value of the capitalStockParValueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapitalStockParValueIndicator(Boolean value) {
        this.capitalStockParValueIndicator = value;
    }

    /**
     * Gets the value of the displayGroupSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayGroupSequence() {
        return displayGroupSequence;
    }

    /**
     * Sets the value of the displayGroupSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayGroupSequence(String value) {
        this.displayGroupSequence = value;
    }

    /**
     * Gets the value of the shareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShareHoldingPercentage() {
        return shareHoldingPercentage;
    }

    /**
     * Sets the value of the shareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShareHoldingPercentage(BigDecimal value) {
        this.shareHoldingPercentage = value;
    }

    /**
     * Gets the value of the indirectShareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectShareHoldingPercentage() {
        return indirectShareHoldingPercentage;
    }

    /**
     * Sets the value of the indirectShareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectShareHoldingPercentage(BigDecimal value) {
        this.indirectShareHoldingPercentage = value;
    }

    /**
     * Gets the value of the shareHoldingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShareHoldingAmount() {
        return shareHoldingAmount;
    }

    /**
     * Sets the value of the shareHoldingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShareHoldingAmount(AmountType value) {
        this.shareHoldingAmount = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setConfirmedDate(DNBDateType value) {
        this.confirmedDate = value;
    }

    /**
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeTableNumber(BigInteger value) {
        this.dnbCodeTableNumber = value;
    }

    /**
     * Gets the value of the dnbCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeValue() {
        return dnbCodeValue;
    }

    /**
     * Sets the value of the dnbCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeValue(BigInteger value) {
        this.dnbCodeValue = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

}
