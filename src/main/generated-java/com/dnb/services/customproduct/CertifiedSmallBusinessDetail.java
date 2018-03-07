
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop that can repeat multiple times to record the information about the business usually certified by a federal, state or local  government agency or organization as having met all of the government standards that award eligibility.
 *          
 * 
 * <p>Java class for CertifiedSmallBusinessDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertifiedSmallBusinessDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificationStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CertificationExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CertificationReferenceIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataProviderDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DataProviderDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedSmallBusinessDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "certificationStartDate",
    "certificationExpirationDate",
    "certificationReferenceIdentifier",
    "dataProviderDetail"
})
public class CertifiedSmallBusinessDetail {

    @XmlElement(name = "CertificationStartDate")
    protected DNBDateType certificationStartDate;
    @XmlElement(name = "CertificationExpirationDate")
    protected DNBDateType certificationExpirationDate;
    @XmlElement(name = "CertificationReferenceIdentifier")
    protected String certificationReferenceIdentifier;
    @XmlElement(name = "DataProviderDetail")
    protected DataProviderDetail dataProviderDetail;

    /**
     * Gets the value of the certificationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCertificationStartDate() {
        return certificationStartDate;
    }

    /**
     * Sets the value of the certificationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCertificationStartDate(DNBDateType value) {
        this.certificationStartDate = value;
    }

    /**
     * Gets the value of the certificationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    /**
     * Sets the value of the certificationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCertificationExpirationDate(DNBDateType value) {
        this.certificationExpirationDate = value;
    }

    /**
     * Gets the value of the certificationReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationReferenceIdentifier() {
        return certificationReferenceIdentifier;
    }

    /**
     * Sets the value of the certificationReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationReferenceIdentifier(String value) {
        this.certificationReferenceIdentifier = value;
    }

    /**
     * Gets the value of the dataProviderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DataProviderDetail }
     *     
     */
    public DataProviderDetail getDataProviderDetail() {
        return dataProviderDetail;
    }

    /**
     * Sets the value of the dataProviderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProviderDetail }
     *     
     */
    public void setDataProviderDetail(DataProviderDetail value) {
        this.dataProviderDetail = value;
    }

}
