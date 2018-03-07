
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the different types of members who serve on the board, and for each type the method by which they can become a member of the board and the length of time they are eligible to serve on the board.
 *          
 * 
 * <p>Java class for BoardMemberService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardMemberService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardMemberTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="BoardMemberServiceMethodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="BoardMemberServiceTermPeriod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
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
@XmlType(name = "BoardMemberService", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "boardMemberTypeText",
    "boardMemberServiceMethodText",
    "boardMemberServiceTermPeriod"
})
public class BoardMemberService {

    @XmlElement(name = "BoardMemberTypeText", required = true)
    protected DNBDecodedStringType boardMemberTypeText;
    @XmlElement(name = "BoardMemberServiceMethodText")
    protected DNBDecodedStringType boardMemberServiceMethodText;
    @XmlElement(name = "BoardMemberServiceTermPeriod")
    protected Integer boardMemberServiceTermPeriod;

    /**
     * Gets the value of the boardMemberTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getBoardMemberTypeText() {
        return boardMemberTypeText;
    }

    /**
     * Sets the value of the boardMemberTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setBoardMemberTypeText(DNBDecodedStringType value) {
        this.boardMemberTypeText = value;
    }

    /**
     * Gets the value of the boardMemberServiceMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getBoardMemberServiceMethodText() {
        return boardMemberServiceMethodText;
    }

    /**
     * Sets the value of the boardMemberServiceMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setBoardMemberServiceMethodText(DNBDecodedStringType value) {
        this.boardMemberServiceMethodText = value;
    }

    /**
     * Gets the value of the boardMemberServiceTermPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoardMemberServiceTermPeriod() {
        return boardMemberServiceTermPeriod;
    }

    /**
     * Sets the value of the boardMemberServiceTermPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoardMemberServiceTermPeriod(Integer value) {
        this.boardMemberServiceTermPeriod = value;
    }

}
