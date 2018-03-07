
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DUNSAuditTrail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DUNSAuditTrail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormerDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="SuccessorDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DeleteReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DUNSAuditTrail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "formerDUNSNumber",
    "successorDUNSNumber",
    "effectiveDate",
    "deleteReasonText"
})
public class DUNSAuditTrail {

    @XmlElement(name = "FormerDUNSNumber", required = true)
    protected String formerDUNSNumber;
    @XmlElement(name = "SuccessorDUNSNumber")
    protected String successorDUNSNumber;
    @XmlElement(name = "EffectiveDate")
    protected DNBDateType effectiveDate;
    @XmlElement(name = "DeleteReasonText")
    protected DNBDecodedStringType deleteReasonText;

    /**
     * Gets the value of the formerDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormerDUNSNumber() {
        return formerDUNSNumber;
    }

    /**
     * Sets the value of the formerDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormerDUNSNumber(String value) {
        this.formerDUNSNumber = value;
    }

    /**
     * Gets the value of the successorDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessorDUNSNumber() {
        return successorDUNSNumber;
    }

    /**
     * Sets the value of the successorDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessorDUNSNumber(String value) {
        this.successorDUNSNumber = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEffectiveDate(DNBDateType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the deleteReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDeleteReasonText() {
        return deleteReasonText;
    }

    /**
     * Sets the value of the deleteReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDeleteReasonText(DNBDecodedStringType value) {
        this.deleteReasonText = value;
    }

}
