
package com.dnb.services.customproduct;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalPastDueCycleSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPastDueCycleSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CycleName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalPastDueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPastDueCycleSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "cycleName",
    "totalPastDueAmount"
})
public class TotalPastDueCycleSummary {

    @XmlElement(name = "CycleName", required = true, nillable = true)
    protected String cycleName;
    @XmlElementRef(name = "TotalPastDueAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalPastDueAmount;

    /**
     * Gets the value of the cycleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleName() {
        return cycleName;
    }

    /**
     * Sets the value of the cycleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleName(String value) {
        this.cycleName = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalPastDueAmount(JAXBElement<AmountType> value) {
        this.totalPastDueAmount = value;
    }

}
