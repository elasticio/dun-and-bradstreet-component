
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFiguresDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountFiguresDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RangePositionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AccountAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RangeDigitQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
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
@XmlType(name = "AccountFiguresDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rangePositionText",
    "accountAmount",
    "rangeDigitQuantity"
})
public class AccountFiguresDetail {

    @XmlElement(name = "RangePositionText")
    protected DNBDecodedStringType rangePositionText;
    @XmlElement(name = "AccountAmount")
    protected AmountType accountAmount;
    @XmlElement(name = "RangeDigitQuantity")
    protected int rangeDigitQuantity;

    /**
     * Gets the value of the rangePositionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRangePositionText() {
        return rangePositionText;
    }

    /**
     * Sets the value of the rangePositionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRangePositionText(DNBDecodedStringType value) {
        this.rangePositionText = value;
    }

    /**
     * Gets the value of the accountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountAmount() {
        return accountAmount;
    }

    /**
     * Sets the value of the accountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountAmount(AmountType value) {
        this.accountAmount = value;
    }

    /**
     * Gets the value of the rangeDigitQuantity property.
     * 
     */
    public int getRangeDigitQuantity() {
        return rangeDigitQuantity;
    }

    /**
     * Sets the value of the rangeDigitQuantity property.
     * 
     */
    public void setRangeDigitQuantity(int value) {
        this.rangeDigitQuantity = value;
    }

}
