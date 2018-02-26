
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalEmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDetailsType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "totalEmployeeQuantity"
})
public class EmployeeDetailsType {

    @XmlElement(name = "TotalEmployeeQuantity")
    protected Long totalEmployeeQuantity;

    /**
     * Gets the value of the totalEmployeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalEmployeeQuantity() {
        return totalEmployeeQuantity;
    }

    /**
     * Sets the value of the totalEmployeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalEmployeeQuantity(Long value) {
        this.totalEmployeeQuantity = value;
    }

}
