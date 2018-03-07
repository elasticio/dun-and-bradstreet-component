
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRatioItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatioItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ItemRatio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ItemRatioRelativeIndustryRank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatioItem", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "itemRatio",
    "itemRatioRelativeIndustryRank",
    "displaySequence"
})
public class FinancialRatioItem {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBDecodedStringType itemDescriptionText;
    @XmlElement(name = "ItemRatio")
    protected BigDecimal itemRatio;
    @XmlElement(name = "ItemRatioRelativeIndustryRank")
    protected String itemRatioRelativeIndustryRank;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the itemDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getItemDescriptionText() {
        return itemDescriptionText;
    }

    /**
     * Sets the value of the itemDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setItemDescriptionText(DNBDecodedStringType value) {
        this.itemDescriptionText = value;
    }

    /**
     * Gets the value of the itemRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemRatio() {
        return itemRatio;
    }

    /**
     * Sets the value of the itemRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemRatio(BigDecimal value) {
        this.itemRatio = value;
    }

    /**
     * Gets the value of the itemRatioRelativeIndustryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRatioRelativeIndustryRank() {
        return itemRatioRelativeIndustryRank;
    }

    /**
     * Sets the value of the itemRatioRelativeIndustryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRatioRelativeIndustryRank(String value) {
        this.itemRatioRelativeIndustryRank = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
