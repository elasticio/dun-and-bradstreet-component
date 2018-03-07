
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherLegalEventInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherLegalEventInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherLegalEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherLegalEventSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventSummaryType" minOccurs="0"/>
 *         &lt;element name="OtherLegalEventPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherLegalEventInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "otherLegalEvent",
    "otherLegalEventSummary",
    "otherLegalEventPeriodSummary"
})
public class OtherLegalEventInformation {

    @XmlElement(name = "OtherLegalEvent")
    protected List<LegalEventBaseType> otherLegalEvent;
    @XmlElement(name = "OtherLegalEventSummary")
    protected LegalEventSummaryType otherLegalEventSummary;
    @XmlElement(name = "OtherLegalEventPeriodSummary")
    protected List<LegalEventPeriodSummaryType> otherLegalEventPeriodSummary;

    /**
     * Gets the value of the otherLegalEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLegalEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLegalEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventBaseType }
     * 
     * 
     */
    public List<LegalEventBaseType> getOtherLegalEvent() {
        if (otherLegalEvent == null) {
            otherLegalEvent = new ArrayList<LegalEventBaseType>();
        }
        return this.otherLegalEvent;
    }

    /**
     * Gets the value of the otherLegalEventSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public LegalEventSummaryType getOtherLegalEventSummary() {
        return otherLegalEventSummary;
    }

    /**
     * Sets the value of the otherLegalEventSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public void setOtherLegalEventSummary(LegalEventSummaryType value) {
        this.otherLegalEventSummary = value;
    }

    /**
     * Gets the value of the otherLegalEventPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLegalEventPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLegalEventPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventPeriodSummaryType }
     * 
     * 
     */
    public List<LegalEventPeriodSummaryType> getOtherLegalEventPeriodSummary() {
        if (otherLegalEventPeriodSummary == null) {
            otherLegalEventPeriodSummary = new ArrayList<LegalEventPeriodSummaryType>();
        }
        return this.otherLegalEventPeriodSummary;
    }

}
