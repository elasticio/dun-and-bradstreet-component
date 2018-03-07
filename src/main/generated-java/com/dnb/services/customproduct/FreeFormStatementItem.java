
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeFormStatementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeFormStatementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *         &lt;element name="ItemAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
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
@XmlType(name = "FreeFormStatementItem", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "itemAmount",
    "displaySequence"
})
public class FreeFormStatementItem {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBStringType256 itemDescriptionText;
    @XmlElement(name = "ItemAmount")
    protected AmountType itemAmount;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the itemDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getItemDescriptionText() {
        return itemDescriptionText;
    }

    /**
     * Sets the value of the itemDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setItemDescriptionText(DNBStringType256 value) {
        this.itemDescriptionText = value;
    }

    /**
     * Gets the value of the itemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemAmount() {
        return itemAmount;
    }

    /**
     * Sets the value of the itemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemAmount(AmountType value) {
        this.itemAmount = value;
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
