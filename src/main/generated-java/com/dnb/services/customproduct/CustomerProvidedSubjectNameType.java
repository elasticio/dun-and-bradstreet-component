
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProvidedSubjectNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProvidedSubjectNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="PhoenticText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WritingScriptISOAlpha4Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProvidedSubjectNameType", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
public class CustomerProvidedSubjectNameType {

    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "PhoenticText")
    protected String phoenticText;
    @XmlAttribute(name = "WritingScriptISOAlpha4Code")
    protected String writingScriptISOAlpha4Code;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguageCode(BigInteger value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the phoenticText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoenticText() {
        return phoenticText;
    }

    /**
     * Sets the value of the phoenticText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoenticText(String value) {
        this.phoenticText = value;
    }

    /**
     * Gets the value of the writingScriptISOAlpha4Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingScriptISOAlpha4Code() {
        return writingScriptISOAlpha4Code;
    }

    /**
     * Sets the value of the writingScriptISOAlpha4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingScriptISOAlpha4Code(String value) {
        this.writingScriptISOAlpha4Code = value;
    }

}
