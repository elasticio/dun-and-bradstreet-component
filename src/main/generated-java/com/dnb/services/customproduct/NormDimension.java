
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the main feature of the collection of organizations used for norm calculation e.g. geographical location, industry, organizational size and etc.
 *          
 * 
 * <p>Java class for NormDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormDimension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NormDimensionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="NormDimensionValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImportanceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormDimension", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "normDimensionText",
    "normDimensionValue",
    "importanceLevel"
})
public class NormDimension {

    @XmlElement(name = "NormDimensionText", required = true)
    protected DNBDecodedStringType normDimensionText;
    @XmlElement(name = "NormDimensionValue", required = true)
    protected String normDimensionValue;
    @XmlElement(name = "ImportanceLevel", required = true)
    protected String importanceLevel;

    /**
     * Gets the value of the normDimensionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNormDimensionText() {
        return normDimensionText;
    }

    /**
     * Sets the value of the normDimensionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNormDimensionText(DNBDecodedStringType value) {
        this.normDimensionText = value;
    }

    /**
     * Gets the value of the normDimensionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormDimensionValue() {
        return normDimensionValue;
    }

    /**
     * Sets the value of the normDimensionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormDimensionValue(String value) {
        this.normDimensionValue = value;
    }

    /**
     * Gets the value of the importanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportanceLevel() {
        return importanceLevel;
    }

    /**
     * Sets the value of the importanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportanceLevel(String value) {
        this.importanceLevel = value;
    }

}
