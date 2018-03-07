
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebarmentsInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebarmentsInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DebarmentsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}DebarmentsSummaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebarmentsInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "debarmentsSummary"
})
public class DebarmentsInformation {

    @XmlElement(name = "DebarmentsSummary", required = true)
    protected DebarmentsSummaryType debarmentsSummary;

    /**
     * Gets the value of the debarmentsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DebarmentsSummaryType }
     *     
     */
    public DebarmentsSummaryType getDebarmentsSummary() {
        return debarmentsSummary;
    }

    /**
     * Sets the value of the debarmentsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebarmentsSummaryType }
     *     
     */
    public void setDebarmentsSummary(DebarmentsSummaryType value) {
        this.debarmentsSummary = value;
    }

}
