
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details of the Principals (e.g., President, Vice President, Directors) and Managers responsible for the business strategy, decision making and day to day running of the subjects operations. This includes names, addresses and identification numbers of the principals. Whilst a principal will usually be an individual in some countries it is legally acceptable for a registered business entity to act as a principal in another business.
 * This excludes shareholders and similar owners who are not responsible for the management of the organization but includes proprietors and partners who, whilst owners, are also generally the principals running the business.
 *          
 * 
 * <p>Java class for PrincipalsAndManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalsAndManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MostSeniorPrincipal" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Management" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalsAndManagement", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "mostSeniorPrincipal"
})
public class PrincipalsAndManagement {

    @XmlElement(name = "MostSeniorPrincipal")
    protected Management mostSeniorPrincipal;

    /**
     * Gets the value of the mostSeniorPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Management }
     *     
     */
    public Management getMostSeniorPrincipal() {
        return mostSeniorPrincipal;
    }

    /**
     * Sets the value of the mostSeniorPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Management }
     *     
     */
    public void setMostSeniorPrincipal(Management value) {
        this.mostSeniorPrincipal = value;
    }

}
