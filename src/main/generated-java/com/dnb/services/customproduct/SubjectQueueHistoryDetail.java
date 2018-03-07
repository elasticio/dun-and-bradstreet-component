
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the movement, triggered by an event, of the supplier record over time  through various queues.
 *          
 * 
 * <p>Java class for SubjectQueueHistoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectQueueHistoryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}EventDetail" maxOccurs="unbounded"/>
 *         &lt;element name="SourceQueueName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TargetQueueName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
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
@XmlType(name = "SubjectQueueHistoryDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "eventDetail",
    "sourceQueueName",
    "targetQueueName"
})
public class SubjectQueueHistoryDetail {

    @XmlElement(name = "EventDetail", required = true)
    protected List<EventDetail> eventDetail;
    @XmlElement(name = "SourceQueueName", required = true)
    protected String sourceQueueName;
    @XmlElement(name = "TargetQueueName", required = true)
    protected String targetQueueName;

    /**
     * Gets the value of the eventDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDetail }
     * 
     * 
     */
    public List<EventDetail> getEventDetail() {
        if (eventDetail == null) {
            eventDetail = new ArrayList<EventDetail>();
        }
        return this.eventDetail;
    }

    /**
     * Gets the value of the sourceQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceQueueName() {
        return sourceQueueName;
    }

    /**
     * Sets the value of the sourceQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceQueueName(String value) {
        this.sourceQueueName = value;
    }

    /**
     * Gets the value of the targetQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetQueueName() {
        return targetQueueName;
    }

    /**
     * Sets the value of the targetQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetQueueName(String value) {
        this.targetQueueName = value;
    }

}
