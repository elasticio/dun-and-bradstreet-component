
package com.dnb.services.report;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationIdentificationNumberTypeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationIdentificationNumberTypeCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationIdentificationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrganizationIdentificationNumberTypeCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationIdentificationNumberTypeCodeType", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "organizationIdentificationNumber",
    "organizationIdentificationNumberTypeCode"
})
public class OrganizationIdentificationNumberTypeCodeType {

    @XmlElement(name = "OrganizationIdentificationNumber", required = true)
    protected String organizationIdentificationNumber;
    @XmlElement(name = "OrganizationIdentificationNumberTypeCode", required = true)
    protected BigInteger organizationIdentificationNumberTypeCode;

    /**
     * Gets the value of the organizationIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationIdentificationNumber() {
        return organizationIdentificationNumber;
    }

    /**
     * Sets the value of the organizationIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationIdentificationNumber(String value) {
        this.organizationIdentificationNumber = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrganizationIdentificationNumberTypeCode() {
        return organizationIdentificationNumberTypeCode;
    }

    /**
     * Sets the value of the organizationIdentificationNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrganizationIdentificationNumberTypeCode(BigInteger value) {
        this.organizationIdentificationNumberTypeCode = value;
    }

}
