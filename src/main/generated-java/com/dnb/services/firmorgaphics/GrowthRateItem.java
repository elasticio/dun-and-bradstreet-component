
package com.dnb.services.firmorgaphics;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowthRateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowthRateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ItemRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowthRateItem", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "itemRate"
})
public class GrowthRateItem {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBDecodedStringType itemDescriptionText;
    @XmlElement(name = "ItemRate")
    protected BigDecimal itemRate;

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
     * Gets the value of the itemRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemRate() {
        return itemRate;
    }

    /**
     * Sets the value of the itemRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemRate(BigDecimal value) {
        this.itemRate = value;
    }

}
