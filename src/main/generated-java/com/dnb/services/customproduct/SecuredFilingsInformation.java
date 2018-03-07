
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuredFilingsInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuredFilingsInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecuredFilingsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuredFilingsInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "securedFilingsSummary"
})
public class SecuredFilingsInformation {

    @XmlElement(name = "SecuredFilingsSummary")
    protected LegalEventSummaryType securedFilingsSummary;

    /**
     * Gets the value of the securedFilingsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public LegalEventSummaryType getSecuredFilingsSummary() {
        return securedFilingsSummary;
    }

    /**
     * Sets the value of the securedFilingsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public void setSecuredFilingsSummary(LegalEventSummaryType value) {
        this.securedFilingsSummary = value;
    }

}
