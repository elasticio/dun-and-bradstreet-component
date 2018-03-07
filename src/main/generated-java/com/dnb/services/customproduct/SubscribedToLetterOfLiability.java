
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscribedToLetterOfLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribedToLetterOfLiability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuerInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}IssuerInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribedToLetterOfLiability", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "issuerInformation"
})
public class SubscribedToLetterOfLiability {

    @XmlElement(name = "IssuerInformation")
    protected IssuerInformation issuerInformation;

    /**
     * Gets the value of the issuerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInformation }
     *     
     */
    public IssuerInformation getIssuerInformation() {
        return issuerInformation;
    }

    /**
     * Sets the value of the issuerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInformation }
     *     
     */
    public void setIssuerInformation(IssuerInformation value) {
        this.issuerInformation = value;
    }

}
