
package com.dnb.services.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmploymentBiography complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentBiography">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmploymentBiographyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonSpecificSourceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentBiography", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "employmentBiographyText",
    "nonSpecificSourceText"
})
public class EmploymentBiography {

    @XmlElement(name = "EmploymentBiographyText")
    protected String employmentBiographyText;
    @XmlElement(name = "NonSpecificSourceText")
    protected String nonSpecificSourceText;

    /**
     * Gets the value of the employmentBiographyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentBiographyText() {
        return employmentBiographyText;
    }

    /**
     * Sets the value of the employmentBiographyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentBiographyText(String value) {
        this.employmentBiographyText = value;
    }

    /**
     * Gets the value of the nonSpecificSourceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonSpecificSourceText() {
        return nonSpecificSourceText;
    }

    /**
     * Sets the value of the nonSpecificSourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonSpecificSourceText(String value) {
        this.nonSpecificSourceText = value;
    }

}
