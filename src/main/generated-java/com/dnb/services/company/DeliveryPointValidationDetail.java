
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryPointValidationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryPointValidationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusValue" type="{http://services.dnb.com/CompanyServiceV2.0}DeliveryPointValidationStatusEnum" minOccurs="0"/>
 *         &lt;element name="CMRAValue" type="{http://services.dnb.com/CompanyServiceV2.0}DeliveryPointValidationCMRAEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryPointValidationDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "statusValue",
    "cmraValue"
})
public class DeliveryPointValidationDetail {

    @XmlElement(name = "StatusValue")
    @XmlSchemaType(name = "string")
    protected DeliveryPointValidationStatusEnum statusValue;
    @XmlElement(name = "CMRAValue")
    @XmlSchemaType(name = "string")
    protected DeliveryPointValidationCMRAEnum cmraValue;

    /**
     * Gets the value of the statusValue property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPointValidationStatusEnum }
     *     
     */
    public DeliveryPointValidationStatusEnum getStatusValue() {
        return statusValue;
    }

    /**
     * Sets the value of the statusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPointValidationStatusEnum }
     *     
     */
    public void setStatusValue(DeliveryPointValidationStatusEnum value) {
        this.statusValue = value;
    }

    /**
     * Gets the value of the cmraValue property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPointValidationCMRAEnum }
     *     
     */
    public DeliveryPointValidationCMRAEnum getCMRAValue() {
        return cmraValue;
    }

    /**
     * Sets the value of the cmraValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPointValidationCMRAEnum }
     *     
     */
    public void setCMRAValue(DeliveryPointValidationCMRAEnum value) {
        this.cmraValue = value;
    }

}
