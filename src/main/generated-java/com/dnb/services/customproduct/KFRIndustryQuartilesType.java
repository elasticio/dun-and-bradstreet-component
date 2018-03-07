
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KFRIndustryQuartilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KFRIndustryQuartilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LowerQuartileValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MedianValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HigherQuartileValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="4"/>
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
@XmlType(name = "KFRIndustryQuartilesType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "lowerQuartileValue",
    "medianValue",
    "higherQuartileValue"
})
public class KFRIndustryQuartilesType {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBDecodedStringType itemDescriptionText;
    @XmlElement(name = "LowerQuartileValue")
    protected BigDecimal lowerQuartileValue;
    @XmlElement(name = "MedianValue")
    protected BigDecimal medianValue;
    @XmlElement(name = "HigherQuartileValue")
    protected BigDecimal higherQuartileValue;

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
     * Gets the value of the lowerQuartileValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerQuartileValue() {
        return lowerQuartileValue;
    }

    /**
     * Sets the value of the lowerQuartileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerQuartileValue(BigDecimal value) {
        this.lowerQuartileValue = value;
    }

    /**
     * Gets the value of the medianValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianValue() {
        return medianValue;
    }

    /**
     * Sets the value of the medianValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianValue(BigDecimal value) {
        this.medianValue = value;
    }

    /**
     * Gets the value of the higherQuartileValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHigherQuartileValue() {
        return higherQuartileValue;
    }

    /**
     * Sets the value of the higherQuartileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHigherQuartileValue(BigDecimal value) {
        this.higherQuartileValue = value;
    }

}
