
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterSupplierSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterSupplierSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSInvestigationRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptOutOnDataUnavailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterSupplierSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsInvestigationRequiredIndicator",
    "optOutOnDataUnavailableIndicator"
})
public class RegisterSupplierSpecification {

    @XmlElement(name = "DUNSInvestigationRequiredIndicator")
    protected Boolean dunsInvestigationRequiredIndicator;
    @XmlElement(name = "OptOutOnDataUnavailableIndicator")
    protected Boolean optOutOnDataUnavailableIndicator;

    /**
     * Gets the value of the dunsInvestigationRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDUNSInvestigationRequiredIndicator() {
        return dunsInvestigationRequiredIndicator;
    }

    /**
     * Sets the value of the dunsInvestigationRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDUNSInvestigationRequiredIndicator(Boolean value) {
        this.dunsInvestigationRequiredIndicator = value;
    }

    /**
     * Gets the value of the optOutOnDataUnavailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptOutOnDataUnavailableIndicator() {
        return optOutOnDataUnavailableIndicator;
    }

    /**
     * Sets the value of the optOutOnDataUnavailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptOutOnDataUnavailableIndicator(Boolean value) {
        this.optOutOnDataUnavailableIndicator = value;
    }

}
