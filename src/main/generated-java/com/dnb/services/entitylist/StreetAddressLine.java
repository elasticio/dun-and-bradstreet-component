
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetAddressLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreetAddressLine">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetAddressLine", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "lineText"
})
public class StreetAddressLine {

    @XmlElement(name = "LineText", required = true)
    protected String lineText;

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

}
