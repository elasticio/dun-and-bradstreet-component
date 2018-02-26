
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of filtering requirements that a service should apply to include subjects from being returned in a search response. For example: include subjects to the candidate list that are out of business.
 *          
 * 
 * <p>Java class for InclusionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InclusionCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InclusionDataDescription" type="{http://services.dnb.com/EntityListServiceV2.0}InclusionDataEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionCriteria", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inclusionDataDescription"
})
public class InclusionCriteria {

    @XmlElement(name = "InclusionDataDescription")
    @XmlSchemaType(name = "string")
    protected InclusionDataEnum inclusionDataDescription;

    /**
     * Gets the value of the inclusionDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link InclusionDataEnum }
     *     
     */
    public InclusionDataEnum getInclusionDataDescription() {
        return inclusionDataDescription;
    }

    /**
     * Sets the value of the inclusionDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusionDataEnum }
     *     
     */
    public void setInclusionDataDescription(InclusionDataEnum value) {
        this.inclusionDataDescription = value;
    }

}
