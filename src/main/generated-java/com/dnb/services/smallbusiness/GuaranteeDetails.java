
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuaranteeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountTypeText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReportedDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="GuaranteedPaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuarantorsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuarantorDetails" type="{http://services.dnb.com/SBRIProductServiceV2.0}GuarantorDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeDetails", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "accountTypeText",
    "lenderName",
    "lenderID",
    "paymentReportedDate",
    "guaranteedPaymentIndicator",
    "guarantorsCount",
    "guarantorDetails"
})
public class GuaranteeDetails {

    @XmlElementRef(name = "AccountTypeText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> accountTypeText;
    @XmlElementRef(name = "LenderName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lenderName;
    @XmlElementRef(name = "LenderID", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lenderID;
    @XmlElementRef(name = "PaymentReportedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> paymentReportedDate;
    @XmlElementRef(name = "GuaranteedPaymentIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> guaranteedPaymentIndicator;
    @XmlElementRef(name = "GuarantorsCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> guarantorsCount;
    @XmlElement(name = "GuarantorDetails")
    protected List<GuarantorDetails> guarantorDetails;

    /**
     * Gets the value of the accountTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getAccountTypeText() {
        return accountTypeText;
    }

    /**
     * Sets the value of the accountTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setAccountTypeText(JAXBElement<DNBDecodedStringType> value) {
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
     * Gets the value of the guaranteedPaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGuaranteedPaymentIndicator() {
        return guaranteedPaymentIndicator;
    }

    /**
     * Sets the value of the guaranteedPaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGuaranteedPaymentIndicator(JAXBElement<Boolean> value) {
        this.guaranteedPaymentIndicator = value;
    }

    /**
     * Gets the value of the guarantorsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGuarantorsCount() {
        return guarantorsCount;
    }

    /**
     * Sets the value of the guarantorsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGuarantorsCount(JAXBElement<Integer> value) {
        this.guarantorsCount = value;
    }

    /**
     * Gets the value of the guarantorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuarantorDetails }
     * 
     * 
     */
    public List<GuarantorDetails> getGuarantorDetails() {
        if (guarantorDetails == null) {
            guarantorDetails = new ArrayList<GuarantorDetails>();
        }
        return this.guarantorDetails;
    }

}
