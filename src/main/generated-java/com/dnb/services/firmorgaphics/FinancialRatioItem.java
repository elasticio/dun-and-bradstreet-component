
package com.dnb.services.firmorgaphics;

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
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ItemRatio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="6"/>
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
@XmlType(name = "FinancialRatioItem", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "itemRatio"
})
public class FinancialRatioItem {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBDecodedStringType itemDescriptionText;
    @XmlElement(name = "ItemRatio")
    protected BigDecimal itemRatio;

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

}
