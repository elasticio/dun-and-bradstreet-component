
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectAttachmentForResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectAttachmentForResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentObject" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="ObjectFormatTypeText" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectAttachmentForResponse", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "contentObject",
    "objectFormatTypeText"
})
@XmlSeeAlso({
    ObjectAttachmentForCompanyReport.class
})
public class ObjectAttachmentForResponse {

    @XmlElement(name = "ContentObject", required = true)
    protected byte[] contentObject;
    @XmlElement(name = "ObjectFormatTypeText", required = true)
    protected DNBDecodedStringType objectFormatTypeText;

    /**
     * Gets the value of the contentObject property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContentObject() {
        return contentObject;
    }

    /**
     * Sets the value of the contentObject property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContentObject(byte[] value) {
        this.contentObject = value;
    }

    /**
     * Gets the value of the objectFormatTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getObjectFormatTypeText() {
        return objectFormatTypeText;
    }

    /**
     * Sets the value of the objectFormatTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setObjectFormatTypeText(DNBDecodedStringType value) {
        this.objectFormatTypeText = value;
    }

}
