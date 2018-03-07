
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocioEconomicCharacteristicDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocioEconomicCharacteristicDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetailTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="DetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocioEconomicCharacteristicDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "detailTypeText",
    "detailText"
})
public class SocioEconomicCharacteristicDetail {

    @XmlElement(name = "DetailTypeText")
    protected DNBDecodedStringType detailTypeText;
    @XmlElement(name = "DetailText")
    protected DNBDecodedStringType detailText;

    /**
     * Gets the value of the detailTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDetailTypeText() {
        return detailTypeText;
    }

    /**
     * Sets the value of the detailTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDetailTypeText(DNBDecodedStringType value) {
        this.detailTypeText = value;
    }

    /**
     * Gets the value of the detailText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDetailText() {
        return detailText;
    }

    /**
     * Sets the value of the detailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDetailText(DNBDecodedStringType value) {
        this.detailText = value;
    }

}
