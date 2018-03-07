
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records summarized information regarding principal information associated with the subject (e.g., quantity of current and previous principals)
 *          
 * 
 * <p>Java class for PrincipalSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentPrincipalsCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currentPrincipalsCount"
})
public class PrincipalSummaryType {

    @XmlElement(name = "CurrentPrincipalsCount")
    protected Long currentPrincipalsCount;

    /**
     * Gets the value of the currentPrincipalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentPrincipalsCount() {
        return currentPrincipalsCount;
    }

    /**
     * Sets the value of the currentPrincipalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentPrincipalsCount(Long value) {
        this.currentPrincipalsCount = value;
    }

}
