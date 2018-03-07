
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Records the details of all related notes.
 *          
 * 
 * <p>Java class for NoteDetailForResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteDetailForResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreatedTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp"/>
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
 *         &lt;element name="ReplyNoteDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}NoteDetailForResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteDetailForResponse", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "noteID",
    "createdTimestamp",
    "userName",
    "contentText",
    "replyNoteDetail"
})
public class NoteDetailForResponse {

    @XmlElement(name = "NoteID", required = true)
    protected String noteID;
    @XmlElement(name = "CreatedTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTimestamp;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "ContentText", required = true)
    protected String contentText;
    @XmlElement(name = "ReplyNoteDetail")
    protected List<NoteDetailForResponse> replyNoteDetail;

    /**
     * Gets the value of the noteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteID() {
        return noteID;
    }

    /**
     * Sets the value of the noteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteID(String value) {
        this.noteID = value;
    }

    /**
     * Gets the value of the createdTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * Sets the value of the createdTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTimestamp(XMLGregorianCalendar value) {
        this.createdTimestamp = value;
    }

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
     * Gets the value of the replyNoteDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replyNoteDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplyNoteDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteDetailForResponse }
     * 
     * 
     */
    public List<NoteDetailForResponse> getReplyNoteDetail() {
        if (replyNoteDetail == null) {
            replyNoteDetail = new ArrayList<NoteDetailForResponse>();
        }
        return this.replyNoteDetail;
    }

}
