
package com.dnb.services.contact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalsAndManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalsAndManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentPrincipal" type="{http://services.dnb.com/ContactProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerPrincipal" type="{http://services.dnb.com/ContactProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalsAndManagement", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "currentPrincipal",
    "formerPrincipal"
})
public class PrincipalsAndManagement {

    @XmlElement(name = "CurrentPrincipal")
    protected List<Management> currentPrincipal;
    @XmlElement(name = "FormerPrincipal")
    protected List<Management> formerPrincipal;

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
     * Gets the value of the formerPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Management }
     * 
     * 
     */
    public List<Management> getFormerPrincipal() {
        if (formerPrincipal == null) {
            formerPrincipal = new ArrayList<Management>();
        }
        return this.formerPrincipal;
    }

}
