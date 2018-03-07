
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingStatusComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingStatusComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatingStatusCommentText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OperatingStatusFreeFormComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingStatusComment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "operatingStatusCommentText",
    "operatingStatusFreeFormComment"
})
public class OperatingStatusComment {

    @XmlElement(name = "OperatingStatusCommentText")
    protected DNBDecodedStringType operatingStatusCommentText;
    @XmlElement(name = "OperatingStatusFreeFormComment")
    protected String operatingStatusFreeFormComment;

    /**
     * Gets the value of the operatingStatusCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusCommentText() {
        return operatingStatusCommentText;
    }

    /**
     * Sets the value of the operatingStatusCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusCommentText(DNBDecodedStringType value) {
        this.operatingStatusCommentText = value;
    }

    /**
     * Gets the value of the operatingStatusFreeFormComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingStatusFreeFormComment() {
        return operatingStatusFreeFormComment;
    }

    /**
     * Sets the value of the operatingStatusFreeFormComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingStatusFreeFormComment(String value) {
        this.operatingStatusFreeFormComment = value;
    }

}
