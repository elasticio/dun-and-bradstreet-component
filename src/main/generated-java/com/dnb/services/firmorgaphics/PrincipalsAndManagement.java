
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="CurrentPrincipal" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostSeniorPrincipal" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Management" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalsAndManagement", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "currentPrincipal",
    "mostSeniorPrincipal"
})
public class PrincipalsAndManagement {

    @XmlElement(name = "CurrentPrincipal")
    protected List<Management> currentPrincipal;
    @XmlElement(name = "MostSeniorPrincipal")
    protected Management mostSeniorPrincipal;

    /**
     * Gets the value of the currentPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Management }
     * 
     * 
     */
    public List<Management> getCurrentPrincipal() {
        if (currentPrincipal == null) {
            currentPrincipal = new ArrayList<Management>();
        }
        return this.currentPrincipal;
    }

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
