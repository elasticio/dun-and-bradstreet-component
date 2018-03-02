
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the information about events such as natural disasters (e.g., floods, hurricane), accidents (e.g., chemical spillage), major events at the organization (e.g., change of control, business interruption, awarded contract), societal events (e.g., war, civil disturbance) that may have affected the subject.
 *          
 * 
 * <p>Java class for SignificantEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignificantEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialEvent" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SpecialEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignificantEvents", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "specialEvent"
})
public class SignificantEvents {

    @XmlElement(name = "SpecialEvent")
    protected List<SpecialEventType> specialEvent;

    /**
     * Gets the value of the specialEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEventType }
     * 
     * 
     */
    public List<SpecialEventType> getSpecialEvent() {
        if (specialEvent == null) {
            specialEvent = new ArrayList<SpecialEventType>();
        }
        return this.specialEvent;
    }

}
