
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportCountryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportCountryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportCountryOfficialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportCountryDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "importCountryOfficialName"
})
public class ImportCountryDetails {

    @XmlElement(name = "ImportCountryOfficialName")
    protected String importCountryOfficialName;

    /**
     * Gets the value of the importCountryOfficialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportCountryOfficialName() {
        return importCountryOfficialName;
    }

    /**
     * Sets the value of the importCountryOfficialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportCountryOfficialName(String value) {
        this.importCountryOfficialName = value;
    }

}
