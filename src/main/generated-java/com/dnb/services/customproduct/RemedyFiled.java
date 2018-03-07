
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemedyFiled complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemedyFiled">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemedyTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RemedyAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RemedyDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ComparisonOperatorText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemedyFiled", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "remedyTypeText",
    "remedyAmount",
    "remedyDescription",
    "comparisonOperatorText"
})
public class RemedyFiled {

    @XmlElement(name = "RemedyTypeText")
    protected DNBDecodedStringType remedyTypeText;
    @XmlElement(name = "RemedyAmount")
    protected AmountType remedyAmount;
    @XmlElement(name = "RemedyDescription")
    protected DNBDecodedStringType remedyDescription;
    @XmlElement(name = "ComparisonOperatorText")
    protected DNBDecodedStringType comparisonOperatorText;

    /**
     * Gets the value of the remedyTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRemedyTypeText() {
        return remedyTypeText;
    }

    /**
     * Sets the value of the remedyTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRemedyTypeText(DNBDecodedStringType value) {
        this.remedyTypeText = value;
    }

    /**
     * Gets the value of the remedyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemedyAmount() {
        return remedyAmount;
    }

    /**
     * Sets the value of the remedyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemedyAmount(AmountType value) {
        this.remedyAmount = value;
    }

    /**
     * Gets the value of the remedyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRemedyDescription() {
        return remedyDescription;
    }

    /**
     * Sets the value of the remedyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRemedyDescription(DNBDecodedStringType value) {
        this.remedyDescription = value;
    }

    /**
     * Gets the value of the comparisonOperatorText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getComparisonOperatorText() {
        return comparisonOperatorText;
    }

    /**
     * Sets the value of the comparisonOperatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setComparisonOperatorText(DNBDecodedStringType value) {
        this.comparisonOperatorText = value;
    }

}
