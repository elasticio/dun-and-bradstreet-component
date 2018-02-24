
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://services.dnb.com/CompanyServiceV2.0}RequestAddress" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CompanyServiceV2.0}TelecommunicationNumberSimpleType" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CompanyServiceV2.0}OrganizationIdentificationNumberSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "dunsNumber",
    "subjectName",
    "address",
    "telephoneNumber",
    "organizationIdentificationNumberDetail"
})
public class InquiryDetail {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "Address")
    protected RequestAddress address;
    @XmlElement(name = "TelephoneNumber")
    protected TelecommunicationNumberSimpleType telephoneNumber;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected OrganizationIdentificationNumberSimpleType organizationIdentificationNumberDetail;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAddress }
     *     
     */
    public RequestAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAddress }
     *     
     */
    public void setAddress(RequestAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public TelecommunicationNumberSimpleType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberSimpleType value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationNumberSimpleType }
     *     
     */
    public OrganizationIdentificationNumberSimpleType getOrganizationIdentificationNumberDetail() {
        return organizationIdentificationNumberDetail;
    }

    /**
     * Sets the value of the organizationIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationNumberSimpleType }
     *     
     */
    public void setOrganizationIdentificationNumberDetail(OrganizationIdentificationNumberSimpleType value) {
        this.organizationIdentificationNumberDetail = value;
    }

}
