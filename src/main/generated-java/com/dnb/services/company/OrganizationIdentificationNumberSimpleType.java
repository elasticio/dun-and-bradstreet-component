
package com.dnb.services.company;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationIdentificationNumberSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationIdentificationNumberSimpleType">
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
 *       &lt;/sequence>
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/CompanyServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/CompanyServiceV2.0}StringBaseType256" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationIdentificationNumberSimpleType", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "organizationIdentificationNumber"
})
@XmlSeeAlso({
    OrganizationIdentificationNumberType.class
})
public class OrganizationIdentificationNumberSimpleType {

    @XmlElement(name = "OrganizationIdentificationNumber", required = true)
    protected String organizationIdentificationNumber;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "TypeText")
    protected String typeText;

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
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDNBCodeTableNumber(Integer value) {
        this.dnbCodeTableNumber = value;
    }

    /**
     * Gets the value of the dnbCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeValue() {
        return dnbCodeValue;
    }

    /**
     * Sets the value of the dnbCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeValue(BigInteger value) {
        this.dnbCodeValue = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

}
