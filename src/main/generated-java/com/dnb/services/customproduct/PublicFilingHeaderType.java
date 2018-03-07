
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicFilingHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicFilingHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType720" minOccurs="0"/>
 *         &lt;element name="NoPublicFilingOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicFilingHeaderType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "disclaimerText",
    "noPublicFilingOnFileIndicator"
})
public class PublicFilingHeaderType {

    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;
    @XmlElement(name = "NoPublicFilingOnFileIndicator")
    protected Boolean noPublicFilingOnFileIndicator;

    /**
     * Gets the value of the disclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerText() {
        return disclaimerText;
    }

    /**
     * Sets the value of the disclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerText(String value) {
        this.disclaimerText = value;
    }

    /**
     * Gets the value of the noPublicFilingOnFileIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPublicFilingOnFileIndicator() {
        return noPublicFilingOnFileIndicator;
    }

    /**
     * Sets the value of the noPublicFilingOnFileIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPublicFilingOnFileIndicator(Boolean value) {
        this.noPublicFilingOnFileIndicator = value;
    }

}
