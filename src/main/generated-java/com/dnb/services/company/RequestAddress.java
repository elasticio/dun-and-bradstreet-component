
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}SimpleAddress">
 *       &lt;sequence>
 *         &lt;element name="TerritoryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullPostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAddress", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "territoryName",
    "fullPostalCode"
})
public class RequestAddress
    extends SimpleAddress
{

    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElement(name = "FullPostalCode")
    protected String fullPostalCode;

    /**
     * Gets the value of the territoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryName() {
        return territoryName;
    }

    /**
     * Sets the value of the territoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryName(String value) {
        this.territoryName = value;
    }

    /**
     * Gets the value of the fullPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPostalCode() {
        return fullPostalCode;
    }

    /**
     * Sets the value of the fullPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPostalCode(String value) {
        this.fullPostalCode = value;
    }

}
