
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SearchCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="DaysLowQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DaysHighQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCountType", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "value"
})
public class SearchCountType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DaysLowQuantity")
    protected Integer daysLowQuantity;
    @XmlAttribute(name = "DaysHighQuantity")
    protected Integer daysHighQuantity;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the daysLowQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysLowQuantity() {
        return daysLowQuantity;
    }

    /**
     * Sets the value of the daysLowQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysLowQuantity(Integer value) {
        this.daysLowQuantity = value;
    }

    /**
     * Gets the value of the daysHighQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysHighQuantity() {
        return daysHighQuantity;
    }

    /**
     * Sets the value of the daysHighQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysHighQuantity(Integer value) {
        this.daysHighQuantity = value;
    }

}
