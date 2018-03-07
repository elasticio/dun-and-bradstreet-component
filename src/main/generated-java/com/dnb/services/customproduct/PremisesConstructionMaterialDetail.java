
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesConstructionMaterialDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesConstructionMaterialDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremisesConstructionMaterialText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesConstructionMaterialDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "premisesConstructionMaterialText"
})
public class PremisesConstructionMaterialDetail {

    @XmlElement(name = "PremisesConstructionMaterialText", required = true)
    protected DNBDecodedStringType premisesConstructionMaterialText;

    /**
     * Gets the value of the premisesConstructionMaterialText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesConstructionMaterialText() {
        return premisesConstructionMaterialText;
    }

    /**
     * Sets the value of the premisesConstructionMaterialText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesConstructionMaterialText(DNBDecodedStringType value) {
        this.premisesConstructionMaterialText = value;
    }

}
