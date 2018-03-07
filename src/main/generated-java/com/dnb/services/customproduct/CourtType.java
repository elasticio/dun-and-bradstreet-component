
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CourtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourtType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourtName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CourtAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "courtName",
    "courtAddress"
})
public class CourtType {

    @XmlElement(name = "CourtName")
    protected String courtName;
    @XmlElement(name = "CourtAddress")
    protected SubjectAddressType courtAddress;

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

    /**
     * Gets the value of the courtAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressType }
     *     
     */
    public SubjectAddressType getCourtAddress() {
        return courtAddress;
    }

    /**
     * Sets the value of the courtAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressType }
     *     
     */
    public void setCourtAddress(SubjectAddressType value) {
        this.courtAddress = value;
    }

}
