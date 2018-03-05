
package com.dnb.services.smallbusiness;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuarantorDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuarantorDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuarantorTypeText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="GuarantorName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="90"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GuarantorAddress" type="{http://services.dnb.com/SBRIProductServiceV2.0}GuarantorAddress" minOccurs="0"/>
 *         &lt;element name="GovernmentGuaranteedProgramTypeText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="GuaranteePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OwnershipPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/SBRIProductServiceV2.0}OrganizationIdentificationNumberSimpleType" minOccurs="0"/>
 *         &lt;element name="PrincipallIdentificationNumberDetail" type="{http://services.dnb.com/SBRIProductServiceV2.0}PrincipalIdentificationNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuarantorDetails", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "guarantorTypeText",
    "guarantorName",
    "guarantorAddress",
    "governmentGuaranteedProgramTypeText",
    "guaranteePercentage",
    "ownershipPercentage",
    "organizationIdentificationNumberDetail",
    "principallIdentificationNumberDetail"
})
public class GuarantorDetails {

    @XmlElementRef(name = "GuarantorTypeText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> guarantorTypeText;
    @XmlElementRef(name = "GuarantorName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guarantorName;
    @XmlElement(name = "GuarantorAddress")
    protected GuarantorAddress guarantorAddress;
    @XmlElementRef(name = "GovernmentGuaranteedProgramTypeText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> governmentGuaranteedProgramTypeText;
    @XmlElementRef(name = "GuaranteePercentage", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> guaranteePercentage;
    @XmlElementRef(name = "OwnershipPercentage", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ownershipPercentage;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected OrganizationIdentificationNumberSimpleType organizationIdentificationNumberDetail;
    @XmlElement(name = "PrincipallIdentificationNumberDetail")
    protected PrincipalIdentificationNumberType principallIdentificationNumberDetail;

    /**
     * Gets the value of the guarantorTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getGuarantorTypeText() {
        return guarantorTypeText;
    }

    /**
     * Sets the value of the guarantorTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setGuarantorTypeText(JAXBElement<DNBDecodedStringType> value) {
        this.guarantorTypeText = value;
    }

    /**
     * Gets the value of the guarantorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuarantorName() {
        return guarantorName;
    }

    /**
     * Sets the value of the guarantorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuarantorName(JAXBElement<String> value) {
        this.guarantorName = value;
    }

    /**
     * Gets the value of the guarantorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GuarantorAddress }
     *     
     */
    public GuarantorAddress getGuarantorAddress() {
        return guarantorAddress;
    }

    /**
     * Sets the value of the guarantorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarantorAddress }
     *     
     */
    public void setGuarantorAddress(GuarantorAddress value) {
        this.guarantorAddress = value;
    }

    /**
     * Gets the value of the governmentGuaranteedProgramTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getGovernmentGuaranteedProgramTypeText() {
        return governmentGuaranteedProgramTypeText;
    }

    /**
     * Sets the value of the governmentGuaranteedProgramTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setGovernmentGuaranteedProgramTypeText(JAXBElement<DNBDecodedStringType> value) {
        this.governmentGuaranteedProgramTypeText = value;
    }

    /**
     * Gets the value of the guaranteePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGuaranteePercentage() {
        return guaranteePercentage;
    }

    /**
     * Sets the value of the guaranteePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGuaranteePercentage(JAXBElement<BigDecimal> value) {
        this.guaranteePercentage = value;
    }

    /**
     * Gets the value of the ownershipPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOwnershipPercentage() {
        return ownershipPercentage;
    }

    /**
     * Sets the value of the ownershipPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOwnershipPercentage(JAXBElement<BigDecimal> value) {
        this.ownershipPercentage = value;
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

    /**
     * Gets the value of the principallIdentificationNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalIdentificationNumberType }
     *     
     */
    public PrincipalIdentificationNumberType getPrincipallIdentificationNumberDetail() {
        return principallIdentificationNumberDetail;
    }

    /**
     * Sets the value of the principallIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalIdentificationNumberType }
     *     
     */
    public void setPrincipallIdentificationNumberDetail(PrincipalIdentificationNumberType value) {
        this.principallIdentificationNumberDetail = value;
    }

}
