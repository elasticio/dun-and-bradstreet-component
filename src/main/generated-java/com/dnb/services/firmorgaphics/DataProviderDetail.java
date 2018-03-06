
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details of the source from which this data was originally obtained.
 *          
 * 
 * <p>Java class for DataProviderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProviderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertifyingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VerifyingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiversityDNBDataProviderName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataProviderTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProviderDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "certifyingIndicator",
    "verifyingIndicator",
    "diversityDNBDataProviderName",
    "dataProviderTypeText"
})
public class DataProviderDetail {

    @XmlElement(name = "CertifyingIndicator")
    protected Boolean certifyingIndicator;
    @XmlElement(name = "VerifyingIndicator")
    protected Boolean verifyingIndicator;
    @XmlElement(name = "DiversityDNBDataProviderName")
    protected String diversityDNBDataProviderName;
    @XmlElement(name = "DataProviderTypeText")
    protected DNBDecodedStringType dataProviderTypeText;

    /**
     * Gets the value of the certifyingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertifyingIndicator() {
        return certifyingIndicator;
    }

    /**
     * Sets the value of the certifyingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifyingIndicator(Boolean value) {
        this.certifyingIndicator = value;
    }

    /**
     * Gets the value of the verifyingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyingIndicator() {
        return verifyingIndicator;
    }

    /**
     * Sets the value of the verifyingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyingIndicator(Boolean value) {
        this.verifyingIndicator = value;
    }

    /**
     * Gets the value of the diversityDNBDataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiversityDNBDataProviderName() {
        return diversityDNBDataProviderName;
    }

    /**
     * Sets the value of the diversityDNBDataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiversityDNBDataProviderName(String value) {
        this.diversityDNBDataProviderName = value;
    }

    /**
     * Gets the value of the dataProviderTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderTypeText() {
        return dataProviderTypeText;
    }

    /**
     * Sets the value of the dataProviderTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderTypeText(DNBDecodedStringType value) {
        this.dataProviderTypeText = value;
    }

}
