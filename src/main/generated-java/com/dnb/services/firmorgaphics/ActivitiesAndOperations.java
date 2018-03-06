
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the description of operations continued by a business including market information such as the number of customers, agency details and import/export details.
 *          
 * 
 * <p>Java class for ActivitiesAndOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitiesAndOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusinessDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}LineOfBusinessDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImportDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ImportDetailsType" minOccurs="0"/>
 *         &lt;element name="ExportDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ExportDetailsType" minOccurs="0"/>
 *         &lt;element name="SubjectIsAgentDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SubjectIsAgentDetailsType" minOccurs="0"/>
 *         &lt;element name="PrimarySICCategoryValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationsText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitiesAndOperations", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "lineOfBusinessDetails",
    "importDetails",
    "exportDetails",
    "subjectIsAgentDetails",
    "primarySICCategoryValue",
    "operationsText"
})
public class ActivitiesAndOperations {

    @XmlElement(name = "LineOfBusinessDetails")
    protected List<LineOfBusinessDetailsType> lineOfBusinessDetails;
    @XmlElement(name = "ImportDetails")
    protected ImportDetailsType importDetails;
    @XmlElement(name = "ExportDetails")
    protected ExportDetailsType exportDetails;
    @XmlElement(name = "SubjectIsAgentDetails")
    protected SubjectIsAgentDetailsType subjectIsAgentDetails;
    @XmlElement(name = "PrimarySICCategoryValue")
    protected String primarySICCategoryValue;
    @XmlElement(name = "OperationsText")
    protected List<String> operationsText;

    /**
     * Gets the value of the lineOfBusinessDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOfBusinessDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOfBusinessDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusinessDetailsType }
     * 
     * 
     */
    public List<LineOfBusinessDetailsType> getLineOfBusinessDetails() {
        if (lineOfBusinessDetails == null) {
            lineOfBusinessDetails = new ArrayList<LineOfBusinessDetailsType>();
        }
        return this.lineOfBusinessDetails;
    }

    /**
     * Gets the value of the importDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDetailsType }
     *     
     */
    public ImportDetailsType getImportDetails() {
        return importDetails;
    }

    /**
     * Sets the value of the importDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDetailsType }
     *     
     */
    public void setImportDetails(ImportDetailsType value) {
        this.importDetails = value;
    }

    /**
     * Gets the value of the exportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDetailsType }
     *     
     */
    public ExportDetailsType getExportDetails() {
        return exportDetails;
    }

    /**
     * Sets the value of the exportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDetailsType }
     *     
     */
    public void setExportDetails(ExportDetailsType value) {
        this.exportDetails = value;
    }

    /**
     * Gets the value of the subjectIsAgentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectIsAgentDetailsType }
     *     
     */
    public SubjectIsAgentDetailsType getSubjectIsAgentDetails() {
        return subjectIsAgentDetails;
    }

    /**
     * Sets the value of the subjectIsAgentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectIsAgentDetailsType }
     *     
     */
    public void setSubjectIsAgentDetails(SubjectIsAgentDetailsType value) {
        this.subjectIsAgentDetails = value;
    }

    /**
     * Gets the value of the primarySICCategoryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySICCategoryValue() {
        return primarySICCategoryValue;
    }

    /**
     * Sets the value of the primarySICCategoryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySICCategoryValue(String value) {
        this.primarySICCategoryValue = value;
    }

    /**
     * Gets the value of the operationsText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationsText() {
        if (operationsText == null) {
            operationsText = new ArrayList<String>();
        }
        return this.operationsText;
    }

}
