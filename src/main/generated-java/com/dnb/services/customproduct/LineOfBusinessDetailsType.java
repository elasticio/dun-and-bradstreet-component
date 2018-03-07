
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineOfBusinessDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineOfBusinessDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusinessDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineOfBusinessDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "lineOfBusinessDescription",
    "displaySequence",
    "dataProviderName"
})
public class LineOfBusinessDetailsType {

    @XmlElement(name = "LineOfBusinessDescription")
    protected DNBStringType lineOfBusinessDescription;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;

    /**
     * Gets the value of the lineOfBusinessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getLineOfBusinessDescription() {
        return lineOfBusinessDescription;
    }

    /**
     * Sets the value of the lineOfBusinessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setLineOfBusinessDescription(DNBStringType value) {
        this.lineOfBusinessDescription = value;
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

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

}
