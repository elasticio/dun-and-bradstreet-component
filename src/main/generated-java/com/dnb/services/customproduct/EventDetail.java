
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of the system or user which intitated the event.
 *          
 * 
 * <p>Java class for EventDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *         &lt;element name="EventText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "userName",
    "eventDate",
    "eventText"
})
public class EventDetail {

    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "EventDate", required = true)
    protected DNBDateType eventDate;
    @XmlElement(name = "EventText", required = true)
    protected String eventText;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEventDate(DNBDateType value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventText() {
        return eventText;
    }

    /**
     * Sets the value of the eventText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventText(String value) {
        this.eventText = value;
    }

}
