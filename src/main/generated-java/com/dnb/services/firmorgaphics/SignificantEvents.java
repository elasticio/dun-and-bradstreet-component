
package com.dnb.services.firmorgaphics;

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
 *         &lt;element name="DisasterSpecialEventsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignificantEvents", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "disasterSpecialEventsIndicator"
})
public class SignificantEvents {

    @XmlElement(name = "DisasterSpecialEventsIndicator")
    protected Boolean disasterSpecialEventsIndicator;

    /**
     * Gets the value of the disasterSpecialEventsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisasterSpecialEventsIndicator() {
        return disasterSpecialEventsIndicator;
    }

    /**
     * Sets the value of the disasterSpecialEventsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisasterSpecialEventsIndicator(Boolean value) {
        this.disasterSpecialEventsIndicator = value;
    }

}
