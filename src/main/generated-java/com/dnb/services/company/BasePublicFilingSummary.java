
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasePublicFilingSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasePublicFilingSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TotalFilingsCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePublicFilingSummary", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "filingTypeText",
    "totalFilingsCount"
})
@XmlSeeAlso({
    PublicFilingSummary.class
})
public class BasePublicFilingSummary {

    @XmlElement(name = "FilingTypeText")
    protected DNBDecodedStringType filingTypeText;
    @XmlElement(name = "TotalFilingsCount")
    protected Integer totalFilingsCount;

    /**
     * Gets the value of the filingTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingTypeText() {
        return filingTypeText;
    }

    /**
     * Sets the value of the filingTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingTypeText(DNBDecodedStringType value) {
        this.filingTypeText = value;
    }

    /**
     * Gets the value of the totalFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalFilingsCount() {
        return totalFilingsCount;
    }

    /**
     * Sets the value of the totalFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalFilingsCount(Integer value) {
        this.totalFilingsCount = value;
    }

}
