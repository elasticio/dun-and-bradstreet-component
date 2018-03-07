
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasePositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasePositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AppointmentStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AppointmentExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePositionType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "positionText",
    "appointmentStartDate",
    "appointmentExpirationDate"
})
public class BasePositionType {

    @XmlElement(name = "PositionText")
    protected DNBDecodedStringType positionText;
    @XmlElement(name = "AppointmentStartDate")
    protected DNBDateType appointmentStartDate;
    @XmlElement(name = "AppointmentExpirationDate")
    protected DNBDateType appointmentExpirationDate;

    /**
     * Gets the value of the positionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPositionText() {
        return positionText;
    }

    /**
     * Sets the value of the positionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPositionText(DNBDecodedStringType value) {
        this.positionText = value;
    }

    /**
     * Gets the value of the appointmentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAppointmentStartDate() {
        return appointmentStartDate;
    }

    /**
     * Sets the value of the appointmentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAppointmentStartDate(DNBDateType value) {
        this.appointmentStartDate = value;
    }

    /**
     * Gets the value of the appointmentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAppointmentExpirationDate() {
        return appointmentExpirationDate;
    }

    /**
     * Sets the value of the appointmentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAppointmentExpirationDate(DNBDateType value) {
        this.appointmentExpirationDate = value;
    }

}
