
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalEventSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEventSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalFilingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEventSummaryType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "totalFilingCount"
})
@XmlSeeAlso({
    DebarmentsSummaryType.class
})
public class LegalEventSummaryType {

    @XmlElement(name = "TotalFilingCount")
    protected Integer totalFilingCount;

    /**
     * Gets the value of the totalFilingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalFilingCount() {
        return totalFilingCount;
    }

    /**
     * Sets the value of the totalFilingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalFilingCount(Integer value) {
        this.totalFilingCount = value;
    }

}
