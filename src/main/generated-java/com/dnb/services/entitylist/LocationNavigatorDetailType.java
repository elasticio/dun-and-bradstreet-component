
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationNavigatorDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationNavigatorDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationNavigator" type="{http://services.dnb.com/EntityListServiceV2.0}LocationNavigatorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationNavigatorDetailType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "locationNavigator"
})
public class LocationNavigatorDetailType {

    @XmlElement(name = "LocationNavigator", required = true)
    protected List<LocationNavigatorType> locationNavigator;

    /**
     * Gets the value of the locationNavigator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationNavigator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNavigator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationNavigatorType }
     * 
     * 
     */
    public List<LocationNavigatorType> getLocationNavigator() {
        if (locationNavigator == null) {
            locationNavigator = new ArrayList<LocationNavigatorType>();
        }
        return this.locationNavigator;
    }

}
