
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpwardAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpwardAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociationTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="LinkedOrganizationDUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpwardAssociation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "associationTypeText",
    "linkedOrganizationDUNSNumber"
})
public class UpwardAssociation {

    @XmlElement(name = "AssociationTypeText", required = true)
    protected DNBDecodedStringType associationTypeText;
    @XmlElement(name = "LinkedOrganizationDUNSNumber", required = true)
    protected String linkedOrganizationDUNSNumber;

    /**
     * Gets the value of the associationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAssociationTypeText() {
        return associationTypeText;
    }

    /**
     * Sets the value of the associationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAssociationTypeText(DNBDecodedStringType value) {
        this.associationTypeText = value;
    }

    /**
     * Gets the value of the linkedOrganizationDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedOrganizationDUNSNumber() {
        return linkedOrganizationDUNSNumber;
    }

    /**
     * Sets the value of the linkedOrganizationDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedOrganizationDUNSNumber(String value) {
        this.linkedOrganizationDUNSNumber = value;
    }

}
