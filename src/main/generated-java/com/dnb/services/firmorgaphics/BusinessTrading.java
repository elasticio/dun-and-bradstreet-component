
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records references or opinions  in terms of the timeliness of payment, the amounts of the transactions and the terms of sale applied to the transactions and  summarized views of this data that involves the subject either as a buyer or supplier of goods or services.
 *          
 * 
 * <p>Java class for BusinessTrading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessTrading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purchaser" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Purchaser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessTrading", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "purchaser"
})
public class BusinessTrading {

    @XmlElement(name = "Purchaser")
    protected Purchaser purchaser;

    /**
     * Gets the value of the purchaser property.
     * 
     * @return
     *     possible object is
     *     {@link Purchaser }
     *     
     */
    public Purchaser getPurchaser() {
        return purchaser;
    }

    /**
     * Sets the value of the purchaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchaser }
     *     
     */
    public void setPurchaser(Purchaser value) {
        this.purchaser = value;
    }

}
