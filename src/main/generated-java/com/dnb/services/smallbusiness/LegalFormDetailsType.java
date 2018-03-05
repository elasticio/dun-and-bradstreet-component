
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFormDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFormDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalFormText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="LegalFormClassText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFormDetailsType", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "legalFormText",
    "legalFormClassText"
})
public class LegalFormDetailsType {

    @XmlElement(name = "LegalFormText", required = true)
    protected DNBDecodedStringType legalFormText;
    @XmlElement(name = "LegalFormClassText")
    protected DNBDecodedStringType legalFormClassText;

    /**
     * Gets the value of the legalFormText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalFormText() {
        return legalFormText;
    }

    /**
     * Sets the value of the legalFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalFormText(DNBDecodedStringType value) {
        this.legalFormText = value;
    }

    /**
     * Gets the value of the legalFormClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalFormClassText() {
        return legalFormClassText;
    }

    /**
     * Sets the value of the legalFormClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalFormClassText(DNBDecodedStringType value) {
        this.legalFormClassText = value;
    }

}
