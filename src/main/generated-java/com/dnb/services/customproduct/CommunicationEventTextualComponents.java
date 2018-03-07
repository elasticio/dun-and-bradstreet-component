
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationEventTextualComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationEventTextualComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactIndividualFullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
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
@XmlType(name = "CommunicationEventTextualComponents", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "contactIndividualFullName"
})
public class CommunicationEventTextualComponents {

    @XmlElement(name = "ContactIndividualFullName")
    protected String contactIndividualFullName;

    /**
     * Gets the value of the contactIndividualFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIndividualFullName() {
        return contactIndividualFullName;
    }

    /**
     * Sets the value of the contactIndividualFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIndividualFullName(String value) {
        this.contactIndividualFullName = value;
    }

}
