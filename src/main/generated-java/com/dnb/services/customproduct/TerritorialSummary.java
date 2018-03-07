
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the number of children for the Subject based on the territorial scope; e.g., local, regional, national, international.
 *          
 * 
 * <p>Java class for TerritorialSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerritorialSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChildrenTerritoryText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="ChildrenQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerritorialSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "childrenTerritoryText",
    "childrenQuantity"
})
public class TerritorialSummary {

    @XmlElement(name = "ChildrenTerritoryText", required = true)
    protected DNBDecodedStringType childrenTerritoryText;
    @XmlElement(name = "ChildrenQuantity")
    protected Integer childrenQuantity;

    /**
     * Gets the value of the childrenTerritoryText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getChildrenTerritoryText() {
        return childrenTerritoryText;
    }

    /**
     * Sets the value of the childrenTerritoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setChildrenTerritoryText(DNBDecodedStringType value) {
        this.childrenTerritoryText = value;
    }

    /**
     * Gets the value of the childrenQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenQuantity() {
        return childrenQuantity;
    }

    /**
     * Sets the value of the childrenQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenQuantity(Integer value) {
        this.childrenQuantity = value;
    }

}
