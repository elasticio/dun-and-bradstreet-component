
package com.dnb.services.smallbusiness;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalPaymentsCountCycleSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPaymentsCountCycleSummary">
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
 *         &lt;element name="TotalPastDuePaymentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPaymentsCountCycleSummary", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "cycleName",
    "totalPastDuePaymentCount"
})
public class TotalPaymentsCountCycleSummary {

    @XmlElement(name = "CycleName", required = true, nillable = true)
    protected String cycleName;
    @XmlElementRef(name = "TotalPastDuePaymentCount", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalPastDuePaymentCount;

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
     * Gets the value of the totalPastDuePaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalPastDuePaymentCount() {
        return totalPastDuePaymentCount;
    }

    /**
     * Sets the value of the totalPastDuePaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalPastDuePaymentCount(JAXBElement<Integer> value) {
        this.totalPastDuePaymentCount = value;
    }

}
