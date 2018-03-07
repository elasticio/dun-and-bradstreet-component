
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsibleAreaForCorporateDirectorship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsibleAreaForCorporateDirectorship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponsibilityAreaText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibleAreaForCorporateDirectorship", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "responsibilityAreaText"
})
public class ResponsibleAreaForCorporateDirectorship {

    @XmlElement(name = "ResponsibilityAreaText")
    protected DNBDecodedStringNewType responsibilityAreaText;

    /**
     * Gets the value of the responsibilityAreaText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getResponsibilityAreaText() {
        return responsibilityAreaText;
    }

    /**
     * Sets the value of the responsibilityAreaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setResponsibilityAreaText(DNBDecodedStringNewType value) {
        this.responsibilityAreaText = value;
    }

}
