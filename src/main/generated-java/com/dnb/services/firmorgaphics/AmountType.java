
package com.dnb.services.firmorgaphics;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CurrencyISOAlpha3Code" />
 *       &lt;attribute name="UnitOfSize" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}UnitOfSizeEnumeration" />
 *       &lt;attribute name="ReliabilityText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StringBaseType256" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "value"
})
public class AmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlAttribute(name = "UnitOfSize")
    protected UnitOfSizeEnumeration unitOfSize;
    @XmlAttribute(name = "ReliabilityText")
    protected String reliabilityText;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISOAlpha3Code() {
        return currencyISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISOAlpha3Code(String value) {
        this.currencyISOAlpha3Code = value;
    }

    /**
     * Gets the value of the unitOfSize property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfSizeEnumeration }
     *     
     */
    public UnitOfSizeEnumeration getUnitOfSize() {
        return unitOfSize;
    }

    /**
     * Sets the value of the unitOfSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfSizeEnumeration }
     *     
     */
    public void setUnitOfSize(UnitOfSizeEnumeration value) {
        this.unitOfSize = value;
    }

    /**
     * Gets the value of the reliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReliabilityText() {
        return reliabilityText;
    }

    /**
     * Sets the value of the reliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReliabilityText(String value) {
        this.reliabilityText = value;
    }

}
