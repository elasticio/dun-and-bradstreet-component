
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Records the details of the status report generated.
 *          
 * 
 * <p>Java class for StatusReportDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusReportDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="ReportObjectAttachment" type="{http://services.dnb.com/CustomProductServiceV2.0}ObjectAttachmentForResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "creationTimestamp",
    "reportObjectAttachment"
})
public class StatusReportDetail {

    @XmlElement(name = "CreationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlElement(name = "ReportObjectAttachment")
    protected ObjectAttachmentForResponse reportObjectAttachment;

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the reportObjectAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectAttachmentForResponse }
     *     
     */
    public ObjectAttachmentForResponse getReportObjectAttachment() {
        return reportObjectAttachment;
    }

    /**
     * Sets the value of the reportObjectAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAttachmentForResponse }
     *     
     */
    public void setReportObjectAttachment(ObjectAttachmentForResponse value) {
        this.reportObjectAttachment = value;
    }

}
