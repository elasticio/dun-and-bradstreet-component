
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeFigures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeFigures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeadquartersLocationEmployeeDetails" type="{http://services.dnb.com/AssessmentProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetails" type="{http://services.dnb.com/AssessmentProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeFigures", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "headquartersLocationEmployeeDetails",
    "consolidatedEmployeeDetails"
})
public class EmployeeFigures {

    @XmlElement(name = "HeadquartersLocationEmployeeDetails")
    protected EmployeeDetailsType headquartersLocationEmployeeDetails;
    @XmlElement(name = "ConsolidatedEmployeeDetails")
    protected EmployeeDetailsType consolidatedEmployeeDetails;

    /**
     * Gets the value of the headquartersLocationEmployeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public EmployeeDetailsType getHeadquartersLocationEmployeeDetails() {
        return headquartersLocationEmployeeDetails;
    }

    /**
     * Sets the value of the headquartersLocationEmployeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public void setHeadquartersLocationEmployeeDetails(EmployeeDetailsType value) {
        this.headquartersLocationEmployeeDetails = value;
    }

    /**
     * Gets the value of the consolidatedEmployeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public EmployeeDetailsType getConsolidatedEmployeeDetails() {
        return consolidatedEmployeeDetails;
    }

    /**
     * Sets the value of the consolidatedEmployeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public void setConsolidatedEmployeeDetails(EmployeeDetailsType value) {
        this.consolidatedEmployeeDetails = value;
    }

}
