
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of filtering requirements that a service should apply to include subjects from being returned in a search response. For example include subjects to the candidate list that are out of business.
 * 
 * If multiple contact criteria are specified, subjects must meet all of the criteria to be included.  For example, specifying IncludeContactsOnlyWithDirectEmail and IncludeContactsOnlyWithDirectPhone will include only subjects that have both direct email and direct phone.
 *          
 * 
 * <p>Java class for ContactInclusionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInclusionCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InclusionDataDescription" type="{http://services.dnb.com/EntityListServiceV2.0}InclusionContactDataEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInclusionCriteria", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inclusionDataDescription"
})
public class ContactInclusionCriteria {

    @XmlElement(name = "InclusionDataDescription")
    @XmlSchemaType(name = "string")
    protected InclusionContactDataEnum inclusionDataDescription;

    /**
     * Gets the value of the inclusionDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link InclusionContactDataEnum }
     *     
     */
    public InclusionContactDataEnum getInclusionDataDescription() {
        return inclusionDataDescription;
    }

    /**
     * Sets the value of the inclusionDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusionContactDataEnum }
     *     
     */
    public void setInclusionDataDescription(InclusionContactDataEnum value) {
        this.inclusionDataDescription = value;
    }

}
