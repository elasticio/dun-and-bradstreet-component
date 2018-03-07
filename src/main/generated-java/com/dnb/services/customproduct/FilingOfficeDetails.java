
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the details of the filing premises.
 *          
 * 
 * <p>Java class for FilingOfficeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingOfficeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingOfficeName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="FilingOfficeDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="FilingOfficeSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FilingOfficeAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingOfficeDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingOfficeName",
    "filingOfficeDUNSNumber",
    "filingOfficeSubjectID",
    "filingOfficeAddress"
})
public class FilingOfficeDetails {

    @XmlElement(name = "FilingOfficeName")
    protected String filingOfficeName;
    @XmlElement(name = "FilingOfficeDUNSNumber")
    protected String filingOfficeDUNSNumber;
    @XmlElement(name = "FilingOfficeSubjectID")
    protected Integer filingOfficeSubjectID;
    @XmlElement(name = "FilingOfficeAddress")
    protected PrimaryAddressType filingOfficeAddress;

    /**
     * Gets the value of the filingOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeName() {
        return filingOfficeName;
    }

    /**
     * Sets the value of the filingOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeName(String value) {
        this.filingOfficeName = value;
    }

    /**
     * Gets the value of the filingOfficeDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingOfficeDUNSNumber() {
        return filingOfficeDUNSNumber;
    }

    /**
     * Sets the value of the filingOfficeDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingOfficeDUNSNumber(String value) {
        this.filingOfficeDUNSNumber = value;
    }

    /**
     * Gets the value of the filingOfficeSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilingOfficeSubjectID() {
        return filingOfficeSubjectID;
    }

    /**
     * Sets the value of the filingOfficeSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilingOfficeSubjectID(Integer value) {
        this.filingOfficeSubjectID = value;
    }

    /**
     * Gets the value of the filingOfficeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getFilingOfficeAddress() {
        return filingOfficeAddress;
    }

    /**
     * Sets the value of the filingOfficeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setFilingOfficeAddress(PrimaryAddressType value) {
        this.filingOfficeAddress = value;
    }

}
