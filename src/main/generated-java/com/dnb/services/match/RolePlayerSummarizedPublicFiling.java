
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RolePlayerSummarizedPublicFiling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePlayerSummarizedPublicFiling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerTypeText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TotalOpenFilingsCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalClosedFilingsCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
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
@XmlType(name = "RolePlayerSummarizedPublicFiling", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "rolePlayerTypeText",
    "totalOpenFilingsCount",
    "totalClosedFilingsCount"
})
public class RolePlayerSummarizedPublicFiling {

    @XmlElement(name = "RolePlayerTypeText")
    protected DNBDecodedStringType rolePlayerTypeText;
    @XmlElement(name = "TotalOpenFilingsCount")
    protected Integer totalOpenFilingsCount;
    @XmlElement(name = "TotalClosedFilingsCount")
    protected Integer totalClosedFilingsCount;

    /**
     * Gets the value of the rolePlayerTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRolePlayerTypeText() {
        return rolePlayerTypeText;
    }

    /**
     * Sets the value of the rolePlayerTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRolePlayerTypeText(DNBDecodedStringType value) {
        this.rolePlayerTypeText = value;
    }

    /**
     * Gets the value of the totalOpenFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalOpenFilingsCount() {
        return totalOpenFilingsCount;
    }

    /**
     * Sets the value of the totalOpenFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalOpenFilingsCount(Integer value) {
        this.totalOpenFilingsCount = value;
    }

    /**
     * Gets the value of the totalClosedFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalClosedFilingsCount() {
        return totalClosedFilingsCount;
    }

    /**
     * Sets the value of the totalClosedFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalClosedFilingsCount(Integer value) {
        this.totalClosedFilingsCount = value;
    }

}
