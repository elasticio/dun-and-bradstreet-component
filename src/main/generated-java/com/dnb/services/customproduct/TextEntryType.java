
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TextTypeDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="Text" type="{http://services.dnb.com/CustomProductServiceV2.0}Text"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GroupDisplaySequenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="WritingScriptISOAlpha4Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextEntryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "textTypeDescription",
    "text",
    "displaySequence",
    "groupDisplaySequenceNumber"
})
public class TextEntryType {

    @XmlElement(name = "TextTypeDescription", required = true)
    protected DNBDecodedStringType textTypeDescription;
    @XmlElement(name = "Text", required = true)
    protected Text text;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "GroupDisplaySequenceNumber")
    protected Integer groupDisplaySequenceNumber;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptISOAlpha4Code")
    protected String writingScriptISOAlpha4Code;

    /**
     * Gets the value of the textTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTextTypeDescription() {
        return textTypeDescription;
    }

    /**
     * Sets the value of the textTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTextTypeDescription(DNBDecodedStringType value) {
        this.textTypeDescription = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the groupDisplaySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupDisplaySequenceNumber() {
        return groupDisplaySequenceNumber;
    }

    /**
     * Sets the value of the groupDisplaySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupDisplaySequenceNumber(Integer value) {
        this.groupDisplaySequenceNumber = value;
    }

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
