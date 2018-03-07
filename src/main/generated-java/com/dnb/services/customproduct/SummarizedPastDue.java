
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizedPastDue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarizedPastDue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaysLowQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DaysHighQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DaysRangeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PastDuePercentage" minOccurs="0">
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
@XmlType(name = "SummarizedPastDue", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "daysLowQuantity",
    "daysHighQuantity",
    "daysRangeText",
    "pastDuePercentage"
})
public class SummarizedPastDue {

    @XmlElement(name = "DaysLowQuantity", required = true)
    protected BigInteger daysLowQuantity;
    @XmlElement(name = "DaysHighQuantity")
    protected BigInteger daysHighQuantity;
    @XmlElement(name = "DaysRangeText")
    protected String daysRangeText;
    @XmlElement(name = "PastDuePercentage")
    protected BigDecimal pastDuePercentage;

    /**
     * Gets the value of the daysLowQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysLowQuantity() {
        return daysLowQuantity;
    }

    /**
     * Sets the value of the daysLowQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysLowQuantity(BigInteger value) {
        this.daysLowQuantity = value;
    }

    /**
     * Gets the value of the daysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysHighQuantity() {
        return daysHighQuantity;
    }

    /**
     * Sets the value of the daysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysHighQuantity(BigInteger value) {
        this.daysHighQuantity = value;
    }

    /**
     * Gets the value of the daysRangeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysRangeText() {
        return daysRangeText;
    }

    /**
     * Sets the value of the daysRangeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysRangeText(String value) {
        this.daysRangeText = value;
    }

    /**
     * Gets the value of the pastDuePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDuePercentage() {
        return pastDuePercentage;
    }

    /**
     * Sets the value of the pastDuePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDuePercentage(BigDecimal value) {
        this.pastDuePercentage = value;
    }

}
