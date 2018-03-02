
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectHeader" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SubjectHeader"/>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="Financial" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Financial" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Events" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "subjectHeader",
    "telecommunication",
    "location",
    "financial",
    "events"
})
@XmlSeeAlso({
    Organization.class
})
public class Subject {

    @XmlElement(name = "SubjectHeader", required = true)
    protected SubjectHeader subjectHeader;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Financial")
    protected Financial financial;
    @XmlElement(name = "Events")
    protected Events events;

    /**
     * Gets the value of the subjectHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHeader }
     *     
     */
    public SubjectHeader getSubjectHeader() {
        return subjectHeader;
    }

    /**
     * Sets the value of the subjectHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHeader }
     *     
     */
    public void setSubjectHeader(SubjectHeader value) {
        this.subjectHeader = value;
    }

    /**
     * Gets the value of the telecommunication property.
     * 
     * @return
     *     possible object is
     *     {@link Telecommunication }
     *     
     */
    public Telecommunication getTelecommunication() {
        return telecommunication;
    }

    /**
     * Sets the value of the telecommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telecommunication }
     *     
     */
    public void setTelecommunication(Telecommunication value) {
        this.telecommunication = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the financial property.
     * 
     * @return
     *     possible object is
     *     {@link Financial }
     *     
     */
    public Financial getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financial }
     *     
     */
    public void setFinancial(Financial value) {
        this.financial = value;
    }

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
