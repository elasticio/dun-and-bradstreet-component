
package com.dnb.services.entitylist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFormDetailsCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFormDetailsCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalFormCode" type="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFormDetailsCodeType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "legalFormCode"
})
public class LegalFormDetailsCodeType {

    @XmlElement(name = "LegalFormCode", required = true)
    protected BigInteger legalFormCode;

    /**
     * Gets the value of the legalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegalFormCode() {
        return legalFormCode;
    }

    /**
     * Sets the value of the legalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegalFormCode(BigInteger value) {
        this.legalFormCode = value;
    }

}
