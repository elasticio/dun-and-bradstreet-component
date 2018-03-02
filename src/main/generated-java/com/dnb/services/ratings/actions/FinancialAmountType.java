
package com.dnb.services.ratings.actions;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FinancialAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/AssessmentProductServiceV2.0}CurrencyISOAlpha3Code" />
 *       &lt;attribute name="ReliabilityText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StringBaseType256" />
 *       &lt;attribute name="UnitOfSize" type="{http://services.dnb.com/AssessmentProductServiceV2.0}UnitOfSizeEnumeration" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ExternalCodingSchemeTypeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalCodingSchemeValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAmountType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "value"
})
public class FinancialAmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlAttribute(name = "ReliabilityText")
    protected String reliabilityText;
    @XmlAttribute(name = "UnitOfSize")
    protected UnitOfSizeEnumeration unitOfSize;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "ExternalCodingSchemeTypeText")
    protected String externalCodingSchemeTypeText;
    @XmlAttribute(name = "ExternalCodingSchemeValue")
    protected String externalCodingSchemeValue;

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
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDNBCodeTableNumber(Integer value) {
        this.dnbCodeTableNumber = value;
    }

    /**
     * Gets the value of the externalCodingSchemeTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodingSchemeTypeText() {
        return externalCodingSchemeTypeText;
    }

    /**
     * Sets the value of the externalCodingSchemeTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodingSchemeTypeText(String value) {
        this.externalCodingSchemeTypeText = value;
    }

    /**
     * Gets the value of the externalCodingSchemeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodingSchemeValue() {
        return externalCodingSchemeValue;
    }

    /**
     * Sets the value of the externalCodingSchemeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodingSchemeValue(String value) {
        this.externalCodingSchemeValue = value;
    }

}
