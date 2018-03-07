
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IndustryNormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryNormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NormCalculationTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="IndustryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndustryCodeTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="IndustryCodeDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NormTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NormDimension" type="{http://services.dnb.com/CustomProductServiceV2.0}NormDimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AverageValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="SubjectQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GreaterValueSubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EqualValueSubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LowerValueSubjectCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AverageRiskIncidencePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryNormType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "normCalculationTimestamp",
    "industryCode",
    "industryCodeTypeText",
    "industryCodeDescription",
    "normTypeText",
    "normDimension",
    "averageValue",
    "lowerQuartileValue",
    "medianValue",
    "upperQuartileValue",
    "subjectQuantity",
    "greaterValueSubjectCount",
    "equalValueSubjectCount",
    "lowerValueSubjectCount",
    "averageRiskIncidencePercentage"
})
public class IndustryNormType {

    @XmlElement(name = "NormCalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar normCalculationTimestamp;
    @XmlElement(name = "IndustryCode")
    protected String industryCode;
    @XmlElement(name = "IndustryCodeTypeText")
    protected DNBDecodedStringType industryCodeTypeText;
    @XmlElement(name = "IndustryCodeDescription")
    protected List<IndustryCodeDescriptionType> industryCodeDescription;
    @XmlElement(name = "NormTypeText")
    protected DNBDecodedStringType normTypeText;
    @XmlElement(name = "NormDimension")
    protected List<NormDimension> normDimension;
    @XmlElement(name = "AverageValue")
    protected BigDecimal averageValue;
    @XmlElement(name = "LowerQuartileValue")
    protected BigDecimal lowerQuartileValue;
    @XmlElement(name = "MedianValue")
    protected BigDecimal medianValue;
    @XmlElement(name = "UpperQuartileValue")
    protected BigDecimal upperQuartileValue;
    @XmlElement(name = "SubjectQuantity")
    protected Integer subjectQuantity;
    @XmlElement(name = "GreaterValueSubjectCount")
    protected Long greaterValueSubjectCount;
    @XmlElement(name = "EqualValueSubjectCount")
    protected Long equalValueSubjectCount;
    @XmlElement(name = "LowerValueSubjectCount")
    protected Long lowerValueSubjectCount;
    @XmlElement(name = "AverageRiskIncidencePercentage")
    protected BigDecimal averageRiskIncidencePercentage;

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
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCode(String value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the industryCodeTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getIndustryCodeTypeText() {
        return industryCodeTypeText;
    }

    /**
     * Sets the value of the industryCodeTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setIndustryCodeTypeText(DNBDecodedStringType value) {
        this.industryCodeTypeText = value;
    }

    /**
     * Gets the value of the industryCodeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCodeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCodeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryCodeDescriptionType }
     * 
     * 
     */
    public List<IndustryCodeDescriptionType> getIndustryCodeDescription() {
        if (industryCodeDescription == null) {
            industryCodeDescription = new ArrayList<IndustryCodeDescriptionType>();
        }
        return this.industryCodeDescription;
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
     * Gets the value of the normDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormDimension }
     * 
     * 
     */
    public List<NormDimension> getNormDimension() {
        if (normDimension == null) {
            normDimension = new ArrayList<NormDimension>();
        }
        return this.normDimension;
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
     * Gets the value of the subjectQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectQuantity() {
        return subjectQuantity;
    }

    /**
     * Sets the value of the subjectQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectQuantity(Integer value) {
        this.subjectQuantity = value;
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
     * Gets the value of the averageRiskIncidencePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageRiskIncidencePercentage() {
        return averageRiskIncidencePercentage;
    }

    /**
     * Sets the value of the averageRiskIncidencePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageRiskIncidencePercentage(BigDecimal value) {
        this.averageRiskIncidencePercentage = value;
    }

}
