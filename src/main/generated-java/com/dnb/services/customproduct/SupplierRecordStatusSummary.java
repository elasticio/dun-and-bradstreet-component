
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records summarized information on the status of the supplier records after validation.
 *          
 * 
 * <p>Java class for SupplierRecordStatusSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierRecordStatusSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalRecordQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidRecordQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvalidRecordQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierRecordStatusSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalRecordQuantity",
    "validRecordQuantity",
    "invalidRecordQuantity"
})
public class SupplierRecordStatusSummary {

    @XmlElement(name = "TotalRecordQuantity")
    protected Integer totalRecordQuantity;
    @XmlElement(name = "ValidRecordQuantity")
    protected Integer validRecordQuantity;
    @XmlElement(name = "InvalidRecordQuantity")
    protected Integer invalidRecordQuantity;

    /**
     * Gets the value of the totalRecordQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecordQuantity() {
        return totalRecordQuantity;
    }

    /**
     * Sets the value of the totalRecordQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecordQuantity(Integer value) {
        this.totalRecordQuantity = value;
    }

    /**
     * Gets the value of the validRecordQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidRecordQuantity() {
        return validRecordQuantity;
    }

    /**
     * Sets the value of the validRecordQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidRecordQuantity(Integer value) {
        this.validRecordQuantity = value;
    }

    /**
     * Gets the value of the invalidRecordQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvalidRecordQuantity() {
        return invalidRecordQuantity;
    }

    /**
     * Sets the value of the invalidRecordQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvalidRecordQuantity(Integer value) {
        this.invalidRecordQuantity = value;
    }

}
