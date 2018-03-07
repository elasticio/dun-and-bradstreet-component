
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LienSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LienSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventSummaryType">
 *       &lt;sequence>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LienSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "disclaimerText"
})
public class LienSummaryType
    extends LegalEventSummaryType
{

    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;

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

}
