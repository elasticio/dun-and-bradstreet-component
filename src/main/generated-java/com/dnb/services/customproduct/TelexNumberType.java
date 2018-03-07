
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelexNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelexNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelecommunicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AnsabackText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnreachableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "TelexNumberType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "telecommunicationNumber",
    "ansabackText",
    "unreachableIndicator",
    "displaySequence"
})
public class TelexNumberType {

    @XmlElement(name = "TelecommunicationNumber", required = true)
    protected String telecommunicationNumber;
    @XmlElement(name = "AnsabackText")
    protected String ansabackText;
    @XmlElement(name = "UnreachableIndicator")
    protected Boolean unreachableIndicator;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the telecommunicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelecommunicationNumber() {
        return telecommunicationNumber;
    }

    /**
     * Sets the value of the telecommunicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelecommunicationNumber(String value) {
        this.telecommunicationNumber = value;
    }

    /**
     * Gets the value of the ansabackText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsabackText() {
        return ansabackText;
    }

    /**
     * Sets the value of the ansabackText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsabackText(String value) {
        this.ansabackText = value;
    }

    /**
     * Gets the value of the unreachableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnreachableIndicator() {
        return unreachableIndicator;
    }

    /**
     * Sets the value of the unreachableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnreachableIndicator(Boolean value) {
        this.unreachableIndicator = value;
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
