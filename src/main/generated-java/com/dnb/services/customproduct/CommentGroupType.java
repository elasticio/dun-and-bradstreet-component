
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CommentTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentGroupType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "commentSourceName",
    "commentDate",
    "commentTitle",
    "commentText"
})
public class CommentGroupType {

    @XmlElement(name = "CommentSourceName")
    protected String commentSourceName;
    @XmlElement(name = "CommentDate")
    protected DNBDateType commentDate;
    @XmlElement(name = "CommentTitle")
    protected List<TextEntryType> commentTitle;
    @XmlElement(name = "CommentText")
    protected String commentText;

    /**
     * Gets the value of the commentSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentSourceName() {
        return commentSourceName;
    }

    /**
     * Sets the value of the commentSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentSourceName(String value) {
        this.commentSourceName = value;
    }

    /**
     * Gets the value of the commentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCommentDate() {
        return commentDate;
    }

    /**
     * Sets the value of the commentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCommentDate(DNBDateType value) {
        this.commentDate = value;
    }

    /**
     * Gets the value of the commentTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getCommentTitle() {
        if (commentTitle == null) {
            commentTitle = new ArrayList<TextEntryType>();
        }
        return this.commentTitle;
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

}
