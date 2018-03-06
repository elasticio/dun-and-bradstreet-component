
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferDUNSNumberRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferDUNSNumberRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TransferredFromDUNSNumber" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="TransferredToDUNSNumber" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="TransferReasonText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferDUNSNumberRegistration", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "transferDate",
    "transferredFromDUNSNumber",
    "transferredToDUNSNumber",
    "transferReasonText"
})
public class TransferDUNSNumberRegistration {

    @XmlElement(name = "TransferDate")
    protected DNBDateType transferDate;
    @XmlElement(name = "TransferredFromDUNSNumber")
    protected String transferredFromDUNSNumber;
    @XmlElement(name = "TransferredToDUNSNumber")
    protected String transferredToDUNSNumber;
    @XmlElement(name = "TransferReasonText")
    protected List<DNBDecodedStringType> transferReasonText;

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
     * Gets the value of the transferredFromDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferredFromDUNSNumber() {
        return transferredFromDUNSNumber;
    }

    /**
     * Sets the value of the transferredFromDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferredFromDUNSNumber(String value) {
        this.transferredFromDUNSNumber = value;
    }

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
     * Gets the value of the transferReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getTransferReasonText() {
        if (transferReasonText == null) {
            transferReasonText = new ArrayList<DNBDecodedStringType>();
        }
        return this.transferReasonText;
    }

}
