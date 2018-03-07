
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeFiguresDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TotalEmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaximumEmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinimumEmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmployeeCategoryDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}EmployeeCategoryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReliabilityText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="EmployeeFiguresDescriptionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "employeeFiguresDate",
    "totalEmployeeQuantity",
    "maximumEmployeeQuantity",
    "minimumEmployeeQuantity",
    "employeeCategoryDetails",
    "reliabilityText",
    "employeeFiguresDescriptionText",
    "dataProviderName"
})
public class EmployeeDetailsType {

    @XmlElement(name = "EmployeeFiguresDate")
    protected DNBDateType employeeFiguresDate;
    @XmlElement(name = "TotalEmployeeQuantity")
    protected Long totalEmployeeQuantity;
    @XmlElement(name = "MaximumEmployeeQuantity")
    protected Long maximumEmployeeQuantity;
    @XmlElement(name = "MinimumEmployeeQuantity")
    protected Long minimumEmployeeQuantity;
    @XmlElement(name = "EmployeeCategoryDetails")
    protected List<EmployeeCategoryDetails> employeeCategoryDetails;
    @XmlElement(name = "ReliabilityText")
    protected DNBDecodedStringType reliabilityText;
    @XmlElement(name = "EmployeeFiguresDescriptionText")
    protected String employeeFiguresDescriptionText;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;

    /**
     * Gets the value of the employeeFiguresDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEmployeeFiguresDate() {
        return employeeFiguresDate;
    }

    /**
     * Sets the value of the employeeFiguresDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEmployeeFiguresDate(DNBDateType value) {
        this.employeeFiguresDate = value;
    }

    /**
     * Gets the value of the totalEmployeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalEmployeeQuantity() {
        return totalEmployeeQuantity;
    }

    /**
     * Sets the value of the totalEmployeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalEmployeeQuantity(Long value) {
        this.totalEmployeeQuantity = value;
    }

    /**
     * Gets the value of the maximumEmployeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumEmployeeQuantity() {
        return maximumEmployeeQuantity;
    }

    /**
     * Sets the value of the maximumEmployeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumEmployeeQuantity(Long value) {
        this.maximumEmployeeQuantity = value;
    }

    /**
     * Gets the value of the minimumEmployeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimumEmployeeQuantity() {
        return minimumEmployeeQuantity;
    }

    /**
     * Sets the value of the minimumEmployeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimumEmployeeQuantity(Long value) {
        this.minimumEmployeeQuantity = value;
    }

    /**
     * Gets the value of the employeeCategoryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeCategoryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeCategoryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCategoryDetails }
     * 
     * 
     */
    public List<EmployeeCategoryDetails> getEmployeeCategoryDetails() {
        if (employeeCategoryDetails == null) {
            employeeCategoryDetails = new ArrayList<EmployeeCategoryDetails>();
        }
        return this.employeeCategoryDetails;
    }

    /**
     * Gets the value of the reliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getReliabilityText() {
        return reliabilityText;
    }

    /**
     * Sets the value of the reliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setReliabilityText(DNBDecodedStringType value) {
        this.reliabilityText = value;
    }

    /**
     * Gets the value of the employeeFiguresDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeFiguresDescriptionText() {
        return employeeFiguresDescriptionText;
    }

    /**
     * Sets the value of the employeeFiguresDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeFiguresDescriptionText(String value) {
        this.employeeFiguresDescriptionText = value;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

}
