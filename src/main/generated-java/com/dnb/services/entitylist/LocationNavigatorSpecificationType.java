
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationNavigatorSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationNavigatorSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationNavigatorType" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorTypeEnum" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationNavigatorSpecificationType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "locationNavigatorType"
})
public class LocationNavigatorSpecificationType {

    @XmlElement(name = "LocationNavigatorType", required = true)
    @XmlSchemaType(name = "string")
    protected List<LocationNavigatorTypeEnum> locationNavigatorType;

    /**
     * Gets the value of the locationNavigatorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationNavigatorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNavigatorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationNavigatorTypeEnum }
     * 
     * 
     */
    public List<LocationNavigatorTypeEnum> getLocationNavigatorType() {
        if (locationNavigatorType == null) {
            locationNavigatorType = new ArrayList<LocationNavigatorTypeEnum>();
        }
        return this.locationNavigatorType;
    }

}
