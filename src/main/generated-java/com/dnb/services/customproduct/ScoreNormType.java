
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreNormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreNormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreModelText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NationalPercentileIndustryNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}NationalPercentileIndustryNorm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RawScoreIndustryNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}NormType" minOccurs="0"/>
 *         &lt;element name="ClassScoreIndustryNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}ClassScoreNormType" minOccurs="0"/>
 *         &lt;element name="ScoreModelVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidencePercentageIndustryNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}NormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustryNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryNormType" minOccurs="0"/>
 *         &lt;element name="GeographicNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}GeographicNormType" minOccurs="0"/>
 *         &lt;element name="BusinessAgeNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}BusinessAgeNorm" minOccurs="0"/>
 *         &lt;element name="BusinessSizeNorm" type="{http://services.dnb.com/CustomProductServiceV2.0}BusinessSizeNorm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreNormType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "scoreModelText",
    "nationalPercentileIndustryNorm",
    "rawScoreIndustryNorm",
    "classScoreIndustryNorm",
    "scoreModelVersionNumber",
    "riskIncidencePercentageIndustryNorm",
    "industryNorm",
    "geographicNorm",
    "businessAgeNorm",
    "businessSizeNorm"
})
public class ScoreNormType {

    @XmlElement(name = "ScoreModelText")
    protected DNBDecodedStringType scoreModelText;
    @XmlElement(name = "NationalPercentileIndustryNorm")
    protected List<NationalPercentileIndustryNorm> nationalPercentileIndustryNorm;
    @XmlElement(name = "RawScoreIndustryNorm")
    protected NormType rawScoreIndustryNorm;
    @XmlElement(name = "ClassScoreIndustryNorm")
    protected ClassScoreNormType classScoreIndustryNorm;
    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "RiskIncidencePercentageIndustryNorm")
    protected List<NormType> riskIncidencePercentageIndustryNorm;
    @XmlElement(name = "IndustryNorm")
    protected IndustryNormType industryNorm;
    @XmlElement(name = "GeographicNorm")
    protected GeographicNormType geographicNorm;
    @XmlElement(name = "BusinessAgeNorm")
    protected BusinessAgeNorm businessAgeNorm;
    @XmlElement(name = "BusinessSizeNorm")
    protected BusinessSizeNorm businessSizeNorm;

    /**
     * Gets the value of the scoreModelText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getScoreModelText() {
        return scoreModelText;
    }

    /**
     * Sets the value of the scoreModelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setScoreModelText(DNBDecodedStringType value) {
        this.scoreModelText = value;
    }

    /**
     * Gets the value of the nationalPercentileIndustryNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalPercentileIndustryNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalPercentileIndustryNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalPercentileIndustryNorm }
     * 
     * 
     */
    public List<NationalPercentileIndustryNorm> getNationalPercentileIndustryNorm() {
        if (nationalPercentileIndustryNorm == null) {
            nationalPercentileIndustryNorm = new ArrayList<NationalPercentileIndustryNorm>();
        }
        return this.nationalPercentileIndustryNorm;
    }

    /**
     * Gets the value of the rawScoreIndustryNorm property.
     * 
     * @return
     *     possible object is
     *     {@link NormType }
     *     
     */
    public NormType getRawScoreIndustryNorm() {
        return rawScoreIndustryNorm;
    }

    /**
     * Sets the value of the rawScoreIndustryNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormType }
     *     
     */
    public void setRawScoreIndustryNorm(NormType value) {
        this.rawScoreIndustryNorm = value;
    }

    /**
     * Gets the value of the classScoreIndustryNorm property.
     * 
     * @return
     *     possible object is
     *     {@link ClassScoreNormType }
     *     
     */
    public ClassScoreNormType getClassScoreIndustryNorm() {
        return classScoreIndustryNorm;
    }

    /**
     * Sets the value of the classScoreIndustryNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassScoreNormType }
     *     
     */
    public void setClassScoreIndustryNorm(ClassScoreNormType value) {
        this.classScoreIndustryNorm = value;
    }

    /**
     * Gets the value of the scoreModelVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreModelVersionNumber() {
        return scoreModelVersionNumber;
    }

    /**
     * Sets the value of the scoreModelVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreModelVersionNumber(String value) {
        this.scoreModelVersionNumber = value;
    }

    /**
     * Gets the value of the riskIncidencePercentageIndustryNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskIncidencePercentageIndustryNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskIncidencePercentageIndustryNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormType }
     * 
     * 
     */
    public List<NormType> getRiskIncidencePercentageIndustryNorm() {
        if (riskIncidencePercentageIndustryNorm == null) {
            riskIncidencePercentageIndustryNorm = new ArrayList<NormType>();
        }
        return this.riskIncidencePercentageIndustryNorm;
    }

    /**
     * Gets the value of the industryNorm property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryNormType }
     *     
     */
    public IndustryNormType getIndustryNorm() {
        return industryNorm;
    }

    /**
     * Sets the value of the industryNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryNormType }
     *     
     */
    public void setIndustryNorm(IndustryNormType value) {
        this.industryNorm = value;
    }

    /**
     * Gets the value of the geographicNorm property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicNormType }
     *     
     */
    public GeographicNormType getGeographicNorm() {
        return geographicNorm;
    }

    /**
     * Sets the value of the geographicNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicNormType }
     *     
     */
    public void setGeographicNorm(GeographicNormType value) {
        this.geographicNorm = value;
    }

    /**
     * Gets the value of the businessAgeNorm property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAgeNorm }
     *     
     */
    public BusinessAgeNorm getBusinessAgeNorm() {
        return businessAgeNorm;
    }

    /**
     * Sets the value of the businessAgeNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAgeNorm }
     *     
     */
    public void setBusinessAgeNorm(BusinessAgeNorm value) {
        this.businessAgeNorm = value;
    }

    /**
     * Gets the value of the businessSizeNorm property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSizeNorm }
     *     
     */
    public BusinessSizeNorm getBusinessSizeNorm() {
        return businessSizeNorm;
    }

    /**
     * Sets the value of the businessSizeNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSizeNorm }
     *     
     */
    public void setBusinessSizeNorm(BusinessSizeNorm value) {
        this.businessSizeNorm = value;
    }

}
