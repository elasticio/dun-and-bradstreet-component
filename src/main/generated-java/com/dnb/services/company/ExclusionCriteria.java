
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExclusionCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExclusionDataDescription" type="{http://services.dnb.com/CompanyServiceV2.0}ExclusionDataEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionCriteria", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "exclusionDataDescription"
})
public class ExclusionCriteria {

    @XmlElement(name = "ExclusionDataDescription", required = true)
    @XmlSchemaType(name = "string")
    protected ExclusionDataEnum exclusionDataDescription;

    /**
     * Gets the value of the exclusionDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionDataEnum }
     *     
     */
    public ExclusionDataEnum getExclusionDataDescription() {
        return exclusionDataDescription;
    }

    /**
     * Sets the value of the exclusionDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionDataEnum }
     *     
     */
    public void setExclusionDataDescription(ExclusionDataEnum value) {
        this.exclusionDataDescription = value;
    }

}
