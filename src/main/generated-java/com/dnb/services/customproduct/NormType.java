
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NormCalculationTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="NormIndexTimePeriodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AverageValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="SubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GreaterValueSubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EqualValueSubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LowerValueSubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NormCalculationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RiskIncidenceScoreableUniverseSubjectPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "NormType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "normCalculationTimestamp",
    "normIndexTimePeriodText",
    "averageValue",
    "lowerQuartileValue",
    "medianValue",
    "upperQuartileValue",
    "subjectCount",
    "greaterValueSubjectCount",
    "equalValueSubjectCount",
    "lowerValueSubjectCount",
    "normCalculationDate",
    "riskIncidenceScoreableUniverseSubjectPercentage"
})
@XmlSeeAlso({
    NationalPercentileIndustryNorm.class,
    RiskIncidencePercentageIndustryNorm.class
})
public class NormType {

    @XmlElement(name = "NormCalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar normCalculationTimestamp;
    @XmlElement(name = "NormIndexTimePeriodText")
    protected DNBDecodedStringType normIndexTimePeriodText;
    @XmlElement(name = "AverageValue")
    protected BigDecimal averageValue;
    @XmlElement(name = "LowerQuartileValue")
    protected BigDecimal lowerQuartileValue;
    @XmlElement(name = "MedianValue")
    protected BigDecimal medianValue;
    @XmlElement(name = "UpperQuartileValue")
    protected BigDecimal upperQuartileValue;
    @XmlElement(name = "SubjectCount")
    protected Long subjectCount;
    @XmlElement(name = "GreaterValueSubjectCount")
    protected Long greaterValueSubjectCount;
    @XmlElement(name = "EqualValueSubjectCount")
    protected Long equalValueSubjectCount;
    @XmlElement(name = "LowerValueSubjectCount")
    protected Long lowerValueSubjectCount;
    @XmlElement(name = "NormCalculationDate")
    protected DNBDateType normCalculationDate;
    @XmlElement(name = "RiskIncidenceScoreableUniverseSubjectPercentage")
    protected BigDecimal riskIncidenceScoreableUniverseSubjectPercentage;

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
     * Gets the value of the normIndexTimePeriodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNormIndexTimePeriodText() {
        return normIndexTimePeriodText;
    }

    /**
     * Sets the value of the normIndexTimePeriodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNormIndexTimePeriodText(DNBDecodedStringType value) {
        this.normIndexTimePeriodText = value;
    }

    /**
     * Gets the value of the averageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageValue() {
        return averageValue;
    }

    /**
     * Sets the value of the averageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageValue(BigDecimal value) {
        this.averageValue = value;
    }

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
     * Gets the value of the subjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectCount() {
        return subjectCount;
    }

    /**
     * Sets the value of the subjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectCount(Long value) {
        this.subjectCount = value;
    }

    /**
     * Gets the value of the greaterValueSubjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGreaterValueSubjectCount() {
        return greaterValueSubjectCount;
    }

    /**
     * Sets the value of the greaterValueSubjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGreaterValueSubjectCount(Long value) {
        this.greaterValueSubjectCount = value;
    }

    /**
     * Gets the value of the equalValueSubjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEqualValueSubjectCount() {
        return equalValueSubjectCount;
    }

    /**
     * Sets the value of the equalValueSubjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEqualValueSubjectCount(Long value) {
        this.equalValueSubjectCount = value;
    }

    /**
     * Gets the value of the lowerValueSubjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLowerValueSubjectCount() {
        return lowerValueSubjectCount;
    }

    /**
     * Sets the value of the lowerValueSubjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLowerValueSubjectCount(Long value) {
        this.lowerValueSubjectCount = value;
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

    /**
     * Gets the value of the riskIncidenceScoreableUniverseSubjectPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskIncidenceScoreableUniverseSubjectPercentage() {
        return riskIncidenceScoreableUniverseSubjectPercentage;
    }

    /**
     * Sets the value of the riskIncidenceScoreableUniverseSubjectPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskIncidenceScoreableUniverseSubjectPercentage(BigDecimal value) {
        this.riskIncidenceScoreableUniverseSubjectPercentage = value;
    }

}
