
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of notes detailing the basis under which the Financial Statement has been prepared or providing further information regarding the subject's finances.
 *          
 * 
 * <p>Java class for FinancialStatementCommentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialStatementCommentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialStatementCommentsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "commentDescription"
})
public class FinancialStatementCommentsType {

    @XmlElement(name = "CommentDescription", required = true)
    protected DNBDecodedStringType commentDescription;

    /**
     * Gets the value of the commentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCommentDescription() {
        return commentDescription;
    }

    /**
     * Sets the value of the commentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCommentDescription(DNBDecodedStringType value) {
        this.commentDescription = value;
    }

}
