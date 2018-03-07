
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessAgeNorm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessAgeNorm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NormCalculationTimeStamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="BusinessAgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LowerQuartile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MedianValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UpperQuartile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessAgeNorm", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "normCalculationTimeStamp",
    "businessAgeText",
    "normTypeText",
    "lowerQuartile",
    "medianValue",
    "upperQuartile"
})
public class BusinessAgeNorm {

    @XmlElement(name = "NormCalculationTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar normCalculationTimeStamp;
    @XmlElement(name = "BusinessAgeText")
    protected String businessAgeText;
    @XmlElement(name = "NormTypeText")
    protected DNBDecodedStringType normTypeText;
    @XmlElement(name = "LowerQuartile")
    protected BigDecimal lowerQuartile;
    @XmlElement(name = "MedianValue")
    protected BigDecimal medianValue;
    @XmlElement(name = "UpperQuartile")
    protected BigDecimal upperQuartile;

    /**
     * Gets the value of the normCalculationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNormCalculationTimeStamp() {
        return normCalculationTimeStamp;
    }

    /**
     * Sets the value of the normCalculationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNormCalculationTimeStamp(XMLGregorianCalendar value) {
        this.normCalculationTimeStamp = value;
    }

    /**
     * Gets the value of the businessAgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAgeText() {
        return businessAgeText;
    }

    /**
     * Sets the value of the businessAgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAgeText(String value) {
        this.businessAgeText = value;
    }

    /**
     * Gets the value of the normTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNormTypeText() {
        return normTypeText;
    }

    /**
     * Sets the value of the normTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNormTypeText(DNBDecodedStringType value) {
        this.normTypeText = value;
    }

    /**
     * Gets the value of the lowerQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerQuartile() {
        return lowerQuartile;
    }

    /**
     * Sets the value of the lowerQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerQuartile(BigDecimal value) {
        this.lowerQuartile = value;
    }

    /**
     * Gets the value of the medianValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianValue() {
        return medianValue;
    }

    /**
     * Sets the value of the medianValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianValue(BigDecimal value) {
        this.medianValue = value;
    }

    /**
     * Gets the value of the upperQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperQuartile() {
        return upperQuartile;
    }

    /**
     * Sets the value of the upperQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperQuartile(BigDecimal value) {
        this.upperQuartile = value;
    }

}
