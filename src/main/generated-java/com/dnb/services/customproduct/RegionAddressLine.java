
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionAddressLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionAddressLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplaySequence">
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
@XmlType(name = "RegionAddressLine", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "lineText",
    "displaySequence"
})
public class RegionAddressLine {

    @XmlElement(name = "LineText", required = true)
    protected String lineText;
    @XmlElement(name = "DisplaySequence")
    protected int displaySequence;

    /**
     * Gets the value of the lineText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineText() {
        return lineText;
    }

    /**
     * Sets the value of the lineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineText(String value) {
        this.lineText = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     */
    public int getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     */
    public void setDisplaySequence(int value) {
        this.displaySequence = value;
    }

}
