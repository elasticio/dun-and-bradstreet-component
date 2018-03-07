
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ContentReferenceIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContentObject" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="ObjectFormatTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectAttachmentForResponse", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "contentReferenceIdentifier",
    "contentObject",
    "objectFormatTypeText"
})
public class ObjectAttachmentForResponse {

    @XmlElement(name = "ContentReferenceIdentifier")
    protected String contentReferenceIdentifier;
    @XmlElement(name = "ContentObject", required = true)
    protected Object contentObject;
    @XmlElement(name = "ObjectFormatTypeText", required = true)
    protected DNBDecodedStringType objectFormatTypeText;

    /**
     * Gets the value of the contentReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentReferenceIdentifier() {
        return contentReferenceIdentifier;
    }

    /**
     * Sets the value of the contentReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentReferenceIdentifier(String value) {
        this.contentReferenceIdentifier = value;
    }

    /**
     * Gets the value of the contentObject property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContentObject() {
        return contentObject;
    }

    /**
     * Sets the value of the contentObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContentObject(Object value) {
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
