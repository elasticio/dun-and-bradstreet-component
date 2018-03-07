
package com.dnb.services.customproduct;

import java.math.BigDecimal;
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
 *         &lt;element name="IndividualEntityEmployeeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="IndividualEntityEmployeeDetailsHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HeadquartersLocationEmployeeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="HeadquartersLocationEmployeeDetailsHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="ConsolidatedEmployeeDetailsHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupEmployeeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeDetailsType" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantityGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeFigures", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "individualEntityEmployeeDetails",
    "individualEntityEmployeeDetailsHistory",
    "headquartersLocationEmployeeDetails",
    "headquartersLocationEmployeeDetailsHistory",
    "consolidatedEmployeeDetails",
    "consolidatedEmployeeDetailsHistory",
    "groupEmployeeDetails",
    "employeeQuantityGrowthRate"
})
public class EmployeeFigures {

    @XmlElement(name = "IndividualEntityEmployeeDetails")
    protected EmployeeDetailsType individualEntityEmployeeDetails;
    @XmlElement(name = "IndividualEntityEmployeeDetailsHistory")
    protected List<EmployeeDetailsType> individualEntityEmployeeDetailsHistory;
    @XmlElement(name = "HeadquartersLocationEmployeeDetails")
    protected EmployeeDetailsType headquartersLocationEmployeeDetails;
    @XmlElement(name = "HeadquartersLocationEmployeeDetailsHistory")
    protected List<EmployeeDetailsType> headquartersLocationEmployeeDetailsHistory;
    @XmlElement(name = "ConsolidatedEmployeeDetails")
    protected EmployeeDetailsType consolidatedEmployeeDetails;
    @XmlElement(name = "ConsolidatedEmployeeDetailsHistory")
    protected List<EmployeeDetailsType> consolidatedEmployeeDetailsHistory;
    @XmlElement(name = "GroupEmployeeDetails")
    protected EmployeeDetailsType groupEmployeeDetails;
    @XmlElement(name = "EmployeeQuantityGrowthRate")
    protected BigDecimal employeeQuantityGrowthRate;

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
     * Gets the value of the headquartersLocationEmployeeDetailsHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headquartersLocationEmployeeDetailsHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadquartersLocationEmployeeDetailsHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDetailsType }
     * 
     * 
     */
    public List<EmployeeDetailsType> getHeadquartersLocationEmployeeDetailsHistory() {
        if (headquartersLocationEmployeeDetailsHistory == null) {
            headquartersLocationEmployeeDetailsHistory = new ArrayList<EmployeeDetailsType>();
        }
        return this.headquartersLocationEmployeeDetailsHistory;
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

    /**
     * Gets the value of the employeeQuantityGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeQuantityGrowthRate() {
        return employeeQuantityGrowthRate;
    }

    /**
     * Sets the value of the employeeQuantityGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeQuantityGrowthRate(BigDecimal value) {
        this.employeeQuantityGrowthRate = value;
    }

}
