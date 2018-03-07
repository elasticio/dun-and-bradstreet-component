
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Records the details of the batch file with supplier records uploaded by the user for registration.
 *          
 * 
 * <p>Java class for SupplierBatchFileDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierBatchFileDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FileName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UploadTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="UploadStatusText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UploadStatusMessageText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectAttachment" type="{http://services.dnb.com/CustomProductServiceV2.0}ObjectAttachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierBatchFileDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "userID",
    "fileName",
    "uploadTimestamp",
    "uploadStatusText",
    "uploadStatusMessageText",
    "objectAttachment"
})
public class SupplierBatchFileDetail {

    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "UploadTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar uploadTimestamp;
    @XmlElement(name = "UploadStatusText")
    protected String uploadStatusText;
    @XmlElement(name = "UploadStatusMessageText")
    protected String uploadStatusMessageText;
    @XmlElement(name = "ObjectAttachment")
    protected ObjectAttachment objectAttachment;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the uploadTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUploadTimestamp() {
        return uploadTimestamp;
    }

    /**
     * Sets the value of the uploadTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUploadTimestamp(XMLGregorianCalendar value) {
        this.uploadTimestamp = value;
    }

    /**
     * Gets the value of the uploadStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadStatusText() {
        return uploadStatusText;
    }

    /**
     * Sets the value of the uploadStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadStatusText(String value) {
        this.uploadStatusText = value;
    }

    /**
     * Gets the value of the uploadStatusMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadStatusMessageText() {
        return uploadStatusMessageText;
    }

    /**
     * Sets the value of the uploadStatusMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadStatusMessageText(String value) {
        this.uploadStatusMessageText = value;
    }

    /**
     * Gets the value of the objectAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectAttachment }
     *     
     */
    public ObjectAttachment getObjectAttachment() {
        return objectAttachment;
    }

    /**
     * Sets the value of the objectAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAttachment }
     *     
     */
    public void setObjectAttachment(ObjectAttachment value) {
        this.objectAttachment = value;
    }

}
