
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesInternalUnitDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesInternalUnitDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiInternalUnitOccurrenceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PremisesUnitTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PremisesUsageTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesInternalUnitDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "multiInternalUnitOccurrenceIndicator",
    "premisesUnitTotalCount",
    "premisesUsageTypeText"
})
public class PremisesInternalUnitDetailType {

    @XmlElement(name = "MultiInternalUnitOccurrenceIndicator")
    protected Boolean multiInternalUnitOccurrenceIndicator;
    @XmlElement(name = "PremisesUnitTotalCount")
    protected Integer premisesUnitTotalCount;
    @XmlElement(name = "PremisesUsageTypeText")
    protected DNBDecodedStringType premisesUsageTypeText;

    /**
     * Gets the value of the multiInternalUnitOccurrenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiInternalUnitOccurrenceIndicator() {
        return multiInternalUnitOccurrenceIndicator;
    }

    /**
     * Sets the value of the multiInternalUnitOccurrenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiInternalUnitOccurrenceIndicator(Boolean value) {
        this.multiInternalUnitOccurrenceIndicator = value;
    }

    /**
     * Gets the value of the premisesUnitTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremisesUnitTotalCount() {
        return premisesUnitTotalCount;
    }

    /**
     * Sets the value of the premisesUnitTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremisesUnitTotalCount(Integer value) {
        this.premisesUnitTotalCount = value;
    }

    /**
     * Gets the value of the premisesUsageTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesUsageTypeText() {
        return premisesUsageTypeText;
    }

    /**
     * Sets the value of the premisesUsageTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesUsageTypeText(DNBDecodedStringType value) {
        this.premisesUsageTypeText = value;
    }

}
