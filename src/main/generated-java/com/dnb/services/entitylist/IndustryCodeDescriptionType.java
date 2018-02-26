
package com.dnb.services.entitylist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for IndustryCodeDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryCodeDescriptionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>StringBaseType256">
 *       &lt;attribute name="IndustryCodeDescriptionLengthCode" type="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryCodeDescriptionType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "value"
})
public class IndustryCodeDescriptionType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "IndustryCodeDescriptionLengthCode")
    protected BigInteger industryCodeDescriptionLengthCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the industryCodeDescriptionLengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndustryCodeDescriptionLengthCode() {
        return industryCodeDescriptionLengthCode;
    }

    /**
     * Sets the value of the industryCodeDescriptionLengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndustryCodeDescriptionLengthCode(BigInteger value) {
        this.industryCodeDescriptionLengthCode = value;
    }

}
