
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpactDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpactDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImpactExpectedEndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ImpactScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ImpactTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpactDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "impactExpectedEndDate",
    "impactScopeText",
    "impactTypeText"
})
public class ImpactDetailType {

    @XmlElement(name = "ImpactExpectedEndDate")
    protected DNBDateType impactExpectedEndDate;
    @XmlElement(name = "ImpactScopeText")
    protected DNBDecodedStringType impactScopeText;
    @XmlElement(name = "ImpactTypeText")
    protected DNBDecodedStringType impactTypeText;

    /**
     * Gets the value of the impactExpectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getImpactExpectedEndDate() {
        return impactExpectedEndDate;
    }

    /**
     * Sets the value of the impactExpectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setImpactExpectedEndDate(DNBDateType value) {
        this.impactExpectedEndDate = value;
    }

    /**
     * Gets the value of the impactScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getImpactScopeText() {
        return impactScopeText;
    }

    /**
     * Sets the value of the impactScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setImpactScopeText(DNBDecodedStringType value) {
        this.impactScopeText = value;
    }

    /**
     * Gets the value of the impactTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getImpactTypeText() {
        return impactTypeText;
    }

    /**
     * Sets the value of the impactTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setImpactTypeText(DNBDecodedStringType value) {
        this.impactTypeText = value;
    }

}
