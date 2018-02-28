
package com.dnb.services.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the code values identifying the current business function of the principal represented as a standard Management Responsibility Code (MRC).
 *          
 * 
 * <p>Java class for CurrentManagementResponsibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentManagementResponsibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManagementResponsibilityText" type="{http://services.dnb.com/ContactProductServiceV2.0}ManagementResponsibilityText"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentManagementResponsibility", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "managementResponsibilityText",
    "startDate",
    "displaySequence"
})
@XmlSeeAlso({
    FormerManagementResponsibility.class
})
public class CurrentManagementResponsibility {

    @XmlElement(name = "ManagementResponsibilityText", required = true)
    protected ManagementResponsibilityText managementResponsibilityText;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the managementResponsibilityText property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementResponsibilityText }
     *     
     */
    public ManagementResponsibilityText getManagementResponsibilityText() {
        return managementResponsibilityText;
    }

    /**
     * Sets the value of the managementResponsibilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementResponsibilityText }
     *     
     */
    public void setManagementResponsibilityText(ManagementResponsibilityText value) {
        this.managementResponsibilityText = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
