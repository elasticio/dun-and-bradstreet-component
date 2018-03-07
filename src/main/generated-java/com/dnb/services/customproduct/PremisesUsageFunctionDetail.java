
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which specifies how the premises are explicitly being used, or not used, by the subject, e.g., for cattle ranching, for food preparation, for accounting, for catering.
 *          
 * 
 * <p>Java class for PremisesUsageFunctionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesUsageFunctionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremisesFunctionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ExcludedPremisesFunctionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesUsageFunctionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "premisesFunctionText",
    "excludedPremisesFunctionIndicator"
})
public class PremisesUsageFunctionDetail {

    @XmlElement(name = "PremisesFunctionText")
    protected DNBDecodedStringType premisesFunctionText;
    @XmlElement(name = "ExcludedPremisesFunctionIndicator")
    protected Boolean excludedPremisesFunctionIndicator;

    /**
     * Gets the value of the premisesFunctionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesFunctionText() {
        return premisesFunctionText;
    }

    /**
     * Sets the value of the premisesFunctionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesFunctionText(DNBDecodedStringType value) {
        this.premisesFunctionText = value;
    }

    /**
     * Gets the value of the excludedPremisesFunctionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludedPremisesFunctionIndicator() {
        return excludedPremisesFunctionIndicator;
    }

    /**
     * Sets the value of the excludedPremisesFunctionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludedPremisesFunctionIndicator(Boolean value) {
        this.excludedPremisesFunctionIndicator = value;
    }

}
