
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="IndividualEntityEmployeeDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="IndividualEntityEmployeeDetailsHistory" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}EmployeeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetailsHistory" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}EmployeeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupEmployeeDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeFigures", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "individualEntityEmployeeDetails",
    "individualEntityEmployeeDetailsHistory",
    "consolidatedEmployeeDetails",
    "consolidatedEmployeeDetailsHistory",
    "groupEmployeeDetails"
})
public class EmployeeFigures {

    @XmlElement(name = "IndividualEntityEmployeeDetails")
    protected EmployeeDetailsType individualEntityEmployeeDetails;
    @XmlElement(name = "IndividualEntityEmployeeDetailsHistory")
    protected List<EmployeeDetailsType> individualEntityEmployeeDetailsHistory;
    @XmlElement(name = "ConsolidatedEmployeeDetails")
    protected EmployeeDetailsType consolidatedEmployeeDetails;
    @XmlElement(name = "ConsolidatedEmployeeDetailsHistory")
    protected List<EmployeeDetailsType> consolidatedEmployeeDetailsHistory;
    @XmlElement(name = "GroupEmployeeDetails")
    protected EmployeeDetailsType groupEmployeeDetails;

    /**
     * Gets the value of the individualEntityEmployeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public EmployeeDetailsType getIndividualEntityEmployeeDetails() {
        return individualEntityEmployeeDetails;
    }

    /**
     * Sets the value of the individualEntityEmployeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public void setIndividualEntityEmployeeDetails(EmployeeDetailsType value) {
        this.individualEntityEmployeeDetails = value;
    }

    /**
     * Gets the value of the individualEntityEmployeeDetailsHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualEntityEmployeeDetailsHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualEntityEmployeeDetailsHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDetailsType }
     * 
     * 
     */
    public List<EmployeeDetailsType> getIndividualEntityEmployeeDetailsHistory() {
        if (individualEntityEmployeeDetailsHistory == null) {
            individualEntityEmployeeDetailsHistory = new ArrayList<EmployeeDetailsType>();
        }
        return this.individualEntityEmployeeDetailsHistory;
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

    /**
     * Gets the value of the consolidatedEmployeeDetailsHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedEmployeeDetailsHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedEmployeeDetailsHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDetailsType }
     * 
     * 
     */
    public List<EmployeeDetailsType> getConsolidatedEmployeeDetailsHistory() {
        if (consolidatedEmployeeDetailsHistory == null) {
            consolidatedEmployeeDetailsHistory = new ArrayList<EmployeeDetailsType>();
        }
        return this.consolidatedEmployeeDetailsHistory;
    }

    /**
     * Gets the value of the groupEmployeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public EmployeeDetailsType getGroupEmployeeDetails() {
        return groupEmployeeDetails;
    }

    /**
     * Sets the value of the groupEmployeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDetailsType }
     *     
     */
    public void setGroupEmployeeDetails(EmployeeDetailsType value) {
        this.groupEmployeeDetails = value;
    }

}
