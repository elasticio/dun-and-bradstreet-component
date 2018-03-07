
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherThirdPartyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherThirdPartyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InformationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InformationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherThirdPartyInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "informationDescription",
    "informationValue"
})
public class OtherThirdPartyInformation {

    @XmlElement(name = "InformationDescription")
    protected String informationDescription;
    @XmlElement(name = "InformationValue")
    protected String informationValue;

    /**
     * Gets the value of the informationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationDescription() {
        return informationDescription;
    }

    /**
     * Sets the value of the informationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationDescription(String value) {
        this.informationDescription = value;
    }

    /**
     * Gets the value of the informationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationValue() {
        return informationValue;
    }

    /**
     * Sets the value of the informationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationValue(String value) {
        this.informationValue = value;
    }

}
