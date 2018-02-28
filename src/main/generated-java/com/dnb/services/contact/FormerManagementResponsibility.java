
package com.dnb.services.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the code values identifying the former business function of the principal represented as a standard Management Responsibility Code (MRC).
 *          
 * 
 * <p>Java class for FormerManagementResponsibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormerManagementResponsibility">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ContactProductServiceV2.0}CurrentManagementResponsibility">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormerManagementResponsibility", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "endDate",
    "endedByDate"
})
public class FormerManagementResponsibility
    extends CurrentManagementResponsibility
{

    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndDate(DNBDateType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndedByDate() {
        return endedByDate;
    }

    /**
     * Sets the value of the endedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndedByDate(DNBDateType value) {
        this.endedByDate = value;
    }

}
