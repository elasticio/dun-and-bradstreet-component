
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherFinancialEventInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherFinancialEventInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherFinancingEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}OtherFinancingEvent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherFinancialEventInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "otherFinancingEvent"
})
public class OtherFinancialEventInformation {

    @XmlElement(name = "OtherFinancingEvent", required = true)
    protected List<OtherFinancingEvent> otherFinancingEvent;

    /**
     * Gets the value of the otherFinancingEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFinancingEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFinancingEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherFinancingEvent }
     * 
     * 
     */
    public List<OtherFinancingEvent> getOtherFinancingEvent() {
        if (otherFinancingEvent == null) {
            otherFinancingEvent = new ArrayList<OtherFinancingEvent>();
        }
        return this.otherFinancingEvent;
    }

}
