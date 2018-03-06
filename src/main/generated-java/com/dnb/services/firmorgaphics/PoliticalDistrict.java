
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticalDistrict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoliticalDistrict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PoliticalDistrictText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StringBaseType256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliticalDistrict", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "politicalDistrictText"
})
public class PoliticalDistrict {

    @XmlElement(name = "PoliticalDistrictText", required = true)
    protected String politicalDistrictText;

    /**
     * Gets the value of the politicalDistrictText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalDistrictText() {
        return politicalDistrictText;
    }

    /**
     * Sets the value of the politicalDistrictText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalDistrictText(String value) {
        this.politicalDistrictText = value;
    }

}
