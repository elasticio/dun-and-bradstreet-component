
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimaryAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/SBRIProductServiceV2.0}BaseAddressType">
 *       &lt;sequence>
 *         &lt;element name="ResidentialAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryAddressType", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "residentialAddressIndicator"
})
public class PrimaryAddressType
    extends BaseAddressType
{

    @XmlElement(name = "ResidentialAddressIndicator")
    protected Boolean residentialAddressIndicator;

    /**
     * Gets the value of the residentialAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidentialAddressIndicator() {
        return residentialAddressIndicator;
    }

    /**
     * Sets the value of the residentialAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidentialAddressIndicator(Boolean value) {
        this.residentialAddressIndicator = value;
    }

}
