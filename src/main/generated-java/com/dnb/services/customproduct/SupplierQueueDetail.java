
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierQueueDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierQueueDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="StatusDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierStatusEnum"/>
 *         &lt;element name="StatusReasonText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssignedToUsername" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InitiatedUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
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
@XmlType(name = "SupplierQueueDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "startDate",
    "statusDescription",
    "statusReasonText",
    "assignedToUsername",
    "initiatedUserName"
})
public class SupplierQueueDetail {

    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StatusDescription", required = true)
    @XmlSchemaType(name = "string")
    protected SupplierStatusEnum statusDescription;
    @XmlElement(name = "StatusReasonText")
    protected String statusReasonText;
    @XmlElement(name = "AssignedToUsername")
    protected String assignedToUsername;
    @XmlElement(name = "InitiatedUserName")
    protected String initiatedUserName;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierStatusEnum }
     *     
     */
    public SupplierStatusEnum getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierStatusEnum }
     *     
     */
    public void setStatusDescription(SupplierStatusEnum value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the statusReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReasonText() {
        return statusReasonText;
    }

    /**
     * Sets the value of the statusReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReasonText(String value) {
        this.statusReasonText = value;
    }

    /**
     * Gets the value of the assignedToUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedToUsername() {
        return assignedToUsername;
    }

    /**
     * Sets the value of the assignedToUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedToUsername(String value) {
        this.assignedToUsername = value;
    }

    /**
     * Gets the value of the initiatedUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatedUserName() {
        return initiatedUserName;
    }

    /**
     * Sets the value of the initiatedUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatedUserName(String value) {
        this.initiatedUserName = value;
    }

}
