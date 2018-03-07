
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedOrganizationChildLinkageSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedOrganizationChildLinkageSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyTreeMemberRoleCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="GeographicalScopeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="LinkageMaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedOrganizationChildLinkageSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "familyTreeMemberRoleCode",
    "geographicalScopeCode",
    "linkageMaximumQuantity"
})
public class RequestedOrganizationChildLinkageSpecification {

    @XmlElement(name = "FamilyTreeMemberRoleCode")
    protected BigInteger familyTreeMemberRoleCode;
    @XmlElement(name = "GeographicalScopeCode")
    protected BigInteger geographicalScopeCode;
    @XmlElement(name = "LinkageMaximumQuantity")
    protected Integer linkageMaximumQuantity;

    /**
     * Gets the value of the familyTreeMemberRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFamilyTreeMemberRoleCode() {
        return familyTreeMemberRoleCode;
    }

    /**
     * Sets the value of the familyTreeMemberRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFamilyTreeMemberRoleCode(BigInteger value) {
        this.familyTreeMemberRoleCode = value;
    }

    /**
     * Gets the value of the geographicalScopeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeographicalScopeCode() {
        return geographicalScopeCode;
    }

    /**
     * Sets the value of the geographicalScopeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeographicalScopeCode(BigInteger value) {
        this.geographicalScopeCode = value;
    }

    /**
     * Gets the value of the linkageMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinkageMaximumQuantity() {
        return linkageMaximumQuantity;
    }

    /**
     * Sets the value of the linkageMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinkageMaximumQuantity(Integer value) {
        this.linkageMaximumQuantity = value;
    }

}
