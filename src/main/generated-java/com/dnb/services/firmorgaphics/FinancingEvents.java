
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details of events which have occurred which directly affect the subject's finances. For example the means by which moneys are obtained by the subject or financial securities which have been filed which affect the subject.
 *          
 * 
 * <p>Java class for FinancingEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecuredFilingsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingEvents", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "securedFilingsIndicator"
})
public class FinancingEvents {

    @XmlElement(name = "SecuredFilingsIndicator")
    protected Boolean securedFilingsIndicator;

    /**
     * Gets the value of the securedFilingsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuredFilingsIndicator() {
        return securedFilingsIndicator;
    }

    /**
     * Sets the value of the securedFilingsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuredFilingsIndicator(Boolean value) {
        this.securedFilingsIndicator = value;
    }

}
