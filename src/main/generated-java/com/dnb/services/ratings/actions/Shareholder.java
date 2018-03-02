
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shareholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shareholder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/AssessmentProductServiceV2.0}Ownership">
 *       &lt;sequence>
 *         &lt;element name="Events" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Events" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shareholder", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "events"
})
public class Shareholder
    extends Ownership
{

    @XmlElement(name = "Events")
    protected Events events;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link Events }
     *     
     */
    public Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link Events }
     *     
     */
    public void setEvents(Events value) {
        this.events = value;
    }

}
