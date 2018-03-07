
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentObject" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="ContentReferenceIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContentDescriptionText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3000"/>
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
@XmlType(name = "ObjectAttachment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "contentObject",
    "contentReferenceIdentifier",
    "contentDescriptionText"
})
public class ObjectAttachment {

    @XmlElement(name = "ContentObject", required = true)
    protected byte[] contentObject;
    @XmlElement(name = "ContentReferenceIdentifier")
    protected String contentReferenceIdentifier;
    @XmlElement(name = "ContentDescriptionText")
    protected String contentDescriptionText;

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
     * Gets the value of the contentDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDescriptionText() {
        return contentDescriptionText;
    }

    /**
     * Sets the value of the contentDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDescriptionText(String value) {
        this.contentDescriptionText = value;
    }

}
