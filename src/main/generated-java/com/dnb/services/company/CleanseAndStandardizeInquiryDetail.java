
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleanseAndStandardizeInquiryDetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CleanseAndStandardizeInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://services.dnb.com/CompanyServiceV2.0}CleanseAndStandardizeRequestAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanseAndStandardizeInquiryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
        "organizationName",
        "address"
})
public class CleanseAndStandardizeInquiryDetail {

    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "Address", required = true)
    protected CleanseAndStandardizeRequestAddress address;

    /**
     * Gets the value of the organizationName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link CleanseAndStandardizeRequestAddress }
     *
     */
    public CleanseAndStandardizeRequestAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link CleanseAndStandardizeRequestAddress }
     *
     */
    public void setAddress(CleanseAndStandardizeRequestAddress value) {
        this.address = value;
    }

}
