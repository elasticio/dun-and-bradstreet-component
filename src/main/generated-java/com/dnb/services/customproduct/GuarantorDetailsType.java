
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuarantorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuarantorDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountRelationshipTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="BusinessTitleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessRelationshipTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" minOccurs="0"/>
 *         &lt;element name="LiabilityPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OwnershipPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuarantorDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "accountRelationshipTypeCode",
    "businessTitleDescription",
    "businessName",
    "businessRelationshipTypeCode",
    "liabilityPercentage",
    "ownershipPercentage"
})
public class GuarantorDetailsType {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "AccountRelationshipTypeCode")
    protected String accountRelationshipTypeCode;
    @XmlElement(name = "BusinessTitleDescription")
    protected String businessTitleDescription;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "BusinessRelationshipTypeCode")
    protected String businessRelationshipTypeCode;
    @XmlElement(name = "LiabilityPercentage")
    protected BigDecimal liabilityPercentage;
    @XmlElement(name = "OwnershipPercentage")
    protected BigDecimal ownershipPercentage;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the accountRelationshipTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRelationshipTypeCode() {
        return accountRelationshipTypeCode;
    }

    /**
     * Sets the value of the accountRelationshipTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRelationshipTypeCode(String value) {
        this.accountRelationshipTypeCode = value;
    }

    /**
     * Gets the value of the businessTitleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTitleDescription() {
        return businessTitleDescription;
    }

    /**
     * Sets the value of the businessTitleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTitleDescription(String value) {
        this.businessTitleDescription = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the businessRelationshipTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRelationshipTypeCode() {
        return businessRelationshipTypeCode;
    }

    /**
     * Sets the value of the businessRelationshipTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRelationshipTypeCode(String value) {
        this.businessRelationshipTypeCode = value;
    }

    /**
     * Gets the value of the liabilityPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiabilityPercentage() {
        return liabilityPercentage;
    }

    /**
     * Sets the value of the liabilityPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiabilityPercentage(BigDecimal value) {
        this.liabilityPercentage = value;
    }

    /**
     * Gets the value of the ownershipPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnershipPercentage() {
        return ownershipPercentage;
    }

    /**
     * Sets the value of the ownershipPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnershipPercentage(BigDecimal value) {
        this.ownershipPercentage = value;
    }

}
