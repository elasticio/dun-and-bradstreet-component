
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop that repeats multiple times to allow the recording of changes to the D-U-N-S number over time. This section may include reasons for the change.
 *          
 * 
 * <p>Java class for TransferDUNSNumberRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferDUNSNumberRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferredToDUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="TransferDate" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TransferReasonText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferDUNSNumberRegistration", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "transferredToDUNSNumber",
    "transferDate",
    "transferReasonText"
})
public class TransferDUNSNumberRegistration {

    @XmlElement(name = "TransferredToDUNSNumber")
    protected String transferredToDUNSNumber;
    @XmlElement(name = "TransferDate")
    protected DNBDateType transferDate;
    @XmlElement(name = "TransferReasonText", required = true)
    protected DNBDecodedStringType transferReasonText;

    /**
     * Gets the value of the transferredToDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferredToDUNSNumber() {
        return transferredToDUNSNumber;
    }

    /**
     * Sets the value of the transferredToDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferredToDUNSNumber(String value) {
        this.transferredToDUNSNumber = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setTransferDate(DNBDateType value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the transferReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTransferReasonText() {
        return transferReasonText;
    }

    /**
     * Sets the value of the transferReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTransferReasonText(DNBDecodedStringType value) {
        this.transferReasonText = value;
    }

}
