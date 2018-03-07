
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of the comments posted by the users on the suppliers.
 *          
 * 
 * <p>Java class for NoteDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContentText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyToNoteID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
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
@XmlType(name = "NoteDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "userName",
    "contentText",
    "replyToNoteID"
})
public class NoteDetail {

    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "ContentText", required = true)
    protected String contentText;
    @XmlElement(name = "ReplyToNoteID")
    protected String replyToNoteID;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the contentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * Sets the value of the contentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentText(String value) {
        this.contentText = value;
    }

    /**
     * Gets the value of the replyToNoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToNoteID() {
        return replyToNoteID;
    }

    /**
     * Sets the value of the replyToNoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToNoteID(String value) {
        this.replyToNoteID = value;
    }

}
