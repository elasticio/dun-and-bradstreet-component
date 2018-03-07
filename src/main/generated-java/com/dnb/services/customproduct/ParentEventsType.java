
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentEventsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentEventsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalEvents" type="{http://services.dnb.com/CustomProductServiceV2.0}ParentLegalEventsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentEventsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "legalEvents"
})
public class ParentEventsType {

    @XmlElement(name = "LegalEvents")
    protected ParentLegalEventsType legalEvents;

    /**
     * Gets the value of the legalEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ParentLegalEventsType }
     *     
     */
    public ParentLegalEventsType getLegalEvents() {
        return legalEvents;
    }

    /**
     * Sets the value of the legalEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentLegalEventsType }
     *     
     */
    public void setLegalEvents(ParentLegalEventsType value) {
        this.legalEvents = value;
    }

}
