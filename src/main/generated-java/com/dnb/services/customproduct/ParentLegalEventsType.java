
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentLegalEventsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentLegalEventsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankruptcyInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}BankruptcyInformation" minOccurs="0"/>
 *         &lt;element name="BankruptcyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentLegalEventsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "bankruptcyInformation",
    "bankruptcyIndicator"
})
public class ParentLegalEventsType {

    @XmlElement(name = "BankruptcyInformation")
    protected BankruptcyInformation bankruptcyInformation;
    @XmlElement(name = "BankruptcyIndicator")
    protected Boolean bankruptcyIndicator;

    /**
     * Gets the value of the bankruptcyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BankruptcyInformation }
     *     
     */
    public BankruptcyInformation getBankruptcyInformation() {
        return bankruptcyInformation;
    }

    /**
     * Sets the value of the bankruptcyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankruptcyInformation }
     *     
     */
    public void setBankruptcyInformation(BankruptcyInformation value) {
        this.bankruptcyInformation = value;
    }

    /**
     * Gets the value of the bankruptcyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankruptcyIndicator() {
        return bankruptcyIndicator;
    }

    /**
     * Sets the value of the bankruptcyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankruptcyIndicator(Boolean value) {
        this.bankruptcyIndicator = value;
    }

}
