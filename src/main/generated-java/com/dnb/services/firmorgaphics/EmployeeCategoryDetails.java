
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeCategoryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeCategoryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeBasisText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeCategoryDetails", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "employeeBasisText"
})
public class EmployeeCategoryDetails {

    @XmlElement(name = "EmployeeBasisText")
    protected DNBDecodedStringType employeeBasisText;

    /**
     * Gets the value of the employeeBasisText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEmployeeBasisText() {
        return employeeBasisText;
    }

    /**
     * Sets the value of the employeeBasisText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEmployeeBasisText(DNBDecodedStringType value) {
        this.employeeBasisText = value;
    }

}
