
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of data topics required within the product.
 *          
 * 
 * <p>Java class for DataTopicSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTopicSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataTopicName" type="{http://services.dnb.com/CustomProductServiceV2.0}DataTopicEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTopicSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dataTopicName"
})
public class DataTopicSpecification {

    @XmlElement(name = "DataTopicName")
    @XmlSchemaType(name = "string")
    protected DataTopicEnum dataTopicName;

    /**
     * Gets the value of the dataTopicName property.
     * 
     * @return
     *     possible object is
     *     {@link DataTopicEnum }
     *     
     */
    public DataTopicEnum getDataTopicName() {
        return dataTopicName;
    }

    /**
     * Sets the value of the dataTopicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTopicEnum }
     *     
     */
    public void setDataTopicName(DataTopicEnum value) {
        this.dataTopicName = value;
    }

}
