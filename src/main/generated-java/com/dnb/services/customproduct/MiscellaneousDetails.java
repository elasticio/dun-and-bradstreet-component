
package com.dnb.services.customproduct;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiscellaneousDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="LenderName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReportedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CommentText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "accountTypeText",
    "lenderName",
    "lenderID",
    "paymentReportedDate",
    "commentText",
    "displaySequence"
})
public class MiscellaneousDetails {

    @XmlElement(name = "AccountTypeText", required = true, nillable = true)
    protected DNBDecodedStringType accountTypeText;
    @XmlElementRef(name = "LenderName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lenderName;
    @XmlElementRef(name = "LenderID", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lenderID;
    @XmlElementRef(name = "PaymentReportedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> paymentReportedDate;
    @XmlElementRef(name = "CommentText", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commentText;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the accountTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAccountTypeText() {
        return accountTypeText;
    }

    /**
     * Sets the value of the accountTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAccountTypeText(DNBDecodedStringType value) {
        this.accountTypeText = value;
    }

    /**
     * Gets the value of the lenderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLenderName() {
        return lenderName;
    }

    /**
     * Sets the value of the lenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLenderName(JAXBElement<String> value) {
        this.lenderName = value;
    }

    /**
     * Gets the value of the lenderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLenderID() {
        return lenderID;
    }

    /**
     * Sets the value of the lenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLenderID(JAXBElement<Integer> value) {
        this.lenderID = value;
    }

    /**
     * Gets the value of the paymentReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getPaymentReportedDate() {
        return paymentReportedDate;
    }

    /**
     * Sets the value of the paymentReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setPaymentReportedDate(JAXBElement<DNBDateType> value) {
        this.paymentReportedDate = value;
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentText(JAXBElement<String> value) {
        this.commentText = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
