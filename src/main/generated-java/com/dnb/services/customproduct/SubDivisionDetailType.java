
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the customer created sub caregories under which the customer&apos;s suppliers are classified. For example, the division for Walmart is Retailmarket.
 *          
 * 
 * <p>Java class for SubDivisionDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubDivisionDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubDivisionID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubDivisionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
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
@XmlType(name = "SubDivisionDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subDivisionID",
    "subDivisionName"
})
public class SubDivisionDetailType {

    @XmlElement(name = "SubDivisionID")
    protected String subDivisionID;
    @XmlElement(name = "SubDivisionName")
    protected String subDivisionName;

    /**
     * Gets the value of the subDivisionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivisionID() {
        return subDivisionID;
    }

    /**
     * Sets the value of the subDivisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivisionID(String value) {
        this.subDivisionID = value;
    }

    /**
     * Gets the value of the subDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivisionName() {
        return subDivisionName;
    }

    /**
     * Sets the value of the subDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivisionName(String value) {
        this.subDivisionName = value;
    }

}
