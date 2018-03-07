
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClassScoreNormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassScoreNormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerQuartileValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MedianValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UpperQuartileValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NormCalculationTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="ClassScoreDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NormCalculationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassScoreNormType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "lowerQuartileValue",
    "medianValue",
    "upperQuartileValue",
    "normCalculationTimestamp",
    "classScoreDescription",
    "normCalculationDate"
})
public class ClassScoreNormType {

    @XmlElement(name = "LowerQuartileValue")
    protected BigDecimal lowerQuartileValue;
    @XmlElement(name = "MedianValue")
    protected BigDecimal medianValue;
    @XmlElement(name = "UpperQuartileValue")
    protected BigDecimal upperQuartileValue;
    @XmlElement(name = "NormCalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar normCalculationTimestamp;
    @XmlElement(name = "ClassScoreDescription")
    protected String classScoreDescription;
    @XmlElement(name = "NormCalculationDate")
    protected DNBDateType normCalculationDate;

    /**
     * Gets the value of the lowerQuartileValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerQuartileValue() {
        return lowerQuartileValue;
    }

    /**
     * Sets the value of the lowerQuartileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerQuartileValue(BigDecimal value) {
        this.lowerQuartileValue = value;
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
     * Gets the value of the upperQuartileValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperQuartileValue() {
        return upperQuartileValue;
    }

    /**
     * Sets the value of the upperQuartileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperQuartileValue(BigDecimal value) {
        this.upperQuartileValue = value;
    }

    /**
     * Gets the value of the normCalculationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNormCalculationTimestamp() {
        return normCalculationTimestamp;
    }

    /**
     * Sets the value of the normCalculationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNormCalculationTimestamp(XMLGregorianCalendar value) {
        this.normCalculationTimestamp = value;
    }

    /**
     * Gets the value of the classScoreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassScoreDescription() {
        return classScoreDescription;
    }

    /**
     * Sets the value of the classScoreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassScoreDescription(String value) {
        this.classScoreDescription = value;
    }

    /**
     * Gets the value of the normCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getNormCalculationDate() {
        return normCalculationDate;
    }

    /**
     * Sets the value of the normCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setNormCalculationDate(DNBDateType value) {
        this.normCalculationDate = value;
    }

}
