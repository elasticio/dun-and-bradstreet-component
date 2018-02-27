
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchDataProfileComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchDataProfileComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchDataProfileComponentTypeText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="MatchDataProfileComponentValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "MatchDataProfileComponent", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "matchDataProfileComponentTypeText",
    "matchDataProfileComponentValue"
})
public class MatchDataProfileComponent {

    @XmlElement(name = "MatchDataProfileComponentTypeText", required = true)
    protected DNBDecodedStringType matchDataProfileComponentTypeText;
    @XmlElement(name = "MatchDataProfileComponentValue", required = true)
    protected String matchDataProfileComponentValue;

    /**
     * Gets the value of the matchDataProfileComponentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getMatchDataProfileComponentTypeText() {
        return matchDataProfileComponentTypeText;
    }

    /**
     * Sets the value of the matchDataProfileComponentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setMatchDataProfileComponentTypeText(DNBDecodedStringType value) {
        this.matchDataProfileComponentTypeText = value;
    }

    /**
     * Gets the value of the matchDataProfileComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchDataProfileComponentValue() {
        return matchDataProfileComponentValue;
    }

    /**
     * Sets the value of the matchDataProfileComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchDataProfileComponentValue(String value) {
        this.matchDataProfileComponentValue = value;
    }

}
