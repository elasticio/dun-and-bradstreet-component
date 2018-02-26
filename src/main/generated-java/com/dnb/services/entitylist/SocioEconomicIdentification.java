
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records information about subjects' categorization into Socio Economic or Statistical groups.
 *          
 * 
 * <p>Java class for SocioEconomicIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocioEconomicIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinorityOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OwnershipEthnicity" type="{http://services.dnb.com/EntityListServiceV2.0}OwnershipEthnicityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FemaleOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocioEconomicIdentification", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "minorityOwnedIndicator",
    "ownershipEthnicity",
    "femaleOwnedIndicator"
})
public class SocioEconomicIdentification {

    @XmlElement(name = "MinorityOwnedIndicator")
    protected Boolean minorityOwnedIndicator;
    @XmlElement(name = "OwnershipEthnicity")
    protected List<OwnershipEthnicityType> ownershipEthnicity;
    @XmlElement(name = "FemaleOwnedIndicator")
    protected Boolean femaleOwnedIndicator;

    /**
     * Gets the value of the minorityOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    /**
     * Sets the value of the minorityOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityOwnedIndicator(Boolean value) {
        this.minorityOwnedIndicator = value;
    }

    /**
     * Gets the value of the ownershipEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnershipEthnicityType }
     * 
     * 
     */
    public List<OwnershipEthnicityType> getOwnershipEthnicity() {
        if (ownershipEthnicity == null) {
            ownershipEthnicity = new ArrayList<OwnershipEthnicityType>();
        }
        return this.ownershipEthnicity;
    }

    /**
     * Gets the value of the femaleOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFemaleOwnedIndicator() {
        return femaleOwnedIndicator;
    }

    /**
     * Sets the value of the femaleOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFemaleOwnedIndicator(Boolean value) {
        this.femaleOwnedIndicator = value;
    }

}
