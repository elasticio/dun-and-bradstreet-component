
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameSuffix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameSuffix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameSuffixText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
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
@XmlType(name = "NameSuffix", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "nameSuffixText"
})
public class NameSuffix {

    @XmlElement(name = "NameSuffixText")
    protected String nameSuffixText;

    /**
     * Gets the value of the nameSuffixText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffixText() {
        return nameSuffixText;
    }

    /**
     * Sets the value of the nameSuffixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffixText(String value) {
        this.nameSuffixText = value;
    }

}
