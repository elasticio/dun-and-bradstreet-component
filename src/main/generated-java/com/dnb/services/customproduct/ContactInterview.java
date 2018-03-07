
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInterview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInterview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}ContactEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInterview", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "contactEvent"
})
public class ContactInterview {

    @XmlElement(name = "ContactEvent")
    protected List<ContactEvent> contactEvent;

    /**
     * Gets the value of the contactEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactEvent }
     * 
     * 
     */
    public List<ContactEvent> getContactEvent() {
        if (contactEvent == null) {
            contactEvent = new ArrayList<ContactEvent>();
        }
        return this.contactEvent;
    }

}
