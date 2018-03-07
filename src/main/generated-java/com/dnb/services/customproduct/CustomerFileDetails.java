
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of the customer file details such as file name, work flow queue.
 *          
 * 
 * <p>Java class for CustomerFileDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFileDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkflowQueueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFileDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inputFileName",
    "workflowQueueName"
})
public class CustomerFileDetails {

    @XmlElement(name = "InputFileName")
    protected String inputFileName;
    @XmlElement(name = "WorkflowQueueName")
    protected String workflowQueueName;

    /**
     * Gets the value of the inputFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFileName() {
        return inputFileName;
    }

    /**
     * Sets the value of the inputFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFileName(String value) {
        this.inputFileName = value;
    }

    /**
     * Gets the value of the workflowQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowQueueName() {
        return workflowQueueName;
    }

    /**
     * Sets the value of the workflowQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowQueueName(String value) {
        this.workflowQueueName = value;
    }

}
