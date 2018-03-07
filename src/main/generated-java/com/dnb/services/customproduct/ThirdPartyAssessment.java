
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the assessment information pertaining to this principal as assigned by sources other than the D&B Worldwide Network (WWN).
 *          
 * 
 * <p>Java class for ThirdPartyAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AssessmentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AssessmentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssessmentTypeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlendedScoreFactorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ThirdPartyInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}ThirdPartyInformation" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="DataProviderOfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssessmentReason" type="{http://services.dnb.com/CustomProductServiceV2.0}ThirdPartyAssessmentReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessmenUnavailableReason" type="{http://services.dnb.com/CustomProductServiceV2.0}ThirdPartyAssessmenUnavailableReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObjectAttachment" type="{http://services.dnb.com/CustomProductServiceV2.0}ObjectAttachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyAssessment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assessmentTypeText",
    "assessmentDate",
    "assessmentValue",
    "assessmentTypeValue",
    "blendedScoreFactorIndicator",
    "thirdPartyInformation",
    "dataProviderName",
    "dataProviderOfficeID",
    "assessmentReason",
    "assessmenUnavailableReason",
    "objectAttachment"
})
public class ThirdPartyAssessment {

    @XmlElement(name = "AssessmentTypeText")
    protected DNBDecodedStringType assessmentTypeText;
    @XmlElement(name = "AssessmentDate")
    protected DNBDateType assessmentDate;
    @XmlElement(name = "AssessmentValue")
    protected String assessmentValue;
    @XmlElement(name = "AssessmentTypeValue")
    protected String assessmentTypeValue;
    @XmlElement(name = "BlendedScoreFactorIndicator")
    protected Boolean blendedScoreFactorIndicator;
    @XmlElement(name = "ThirdPartyInformation")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "DataProviderOfficeID")
    protected String dataProviderOfficeID;
    @XmlElement(name = "AssessmentReason")
    protected List<ThirdPartyAssessmentReason> assessmentReason;
    @XmlElement(name = "AssessmenUnavailableReason")
    protected List<ThirdPartyAssessmenUnavailableReason> assessmenUnavailableReason;
    @XmlElement(name = "ObjectAttachment")
    protected ObjectAttachment objectAttachment;

    /**
     * Gets the value of the assessmentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAssessmentTypeText() {
        return assessmentTypeText;
    }

    /**
     * Sets the value of the assessmentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAssessmentTypeText(DNBDecodedStringType value) {
        this.assessmentTypeText = value;
    }

    /**
     * Gets the value of the assessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAssessmentDate() {
        return assessmentDate;
    }

    /**
     * Sets the value of the assessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAssessmentDate(DNBDateType value) {
        this.assessmentDate = value;
    }

    /**
     * Gets the value of the assessmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentValue() {
        return assessmentValue;
    }

    /**
     * Sets the value of the assessmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentValue(String value) {
        this.assessmentValue = value;
    }

    /**
     * Gets the value of the assessmentTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeValue() {
        return assessmentTypeValue;
    }

    /**
     * Sets the value of the assessmentTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeValue(String value) {
        this.assessmentTypeValue = value;
    }

    /**
     * Gets the value of the blendedScoreFactorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlendedScoreFactorIndicator() {
        return blendedScoreFactorIndicator;
    }

    /**
     * Sets the value of the blendedScoreFactorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlendedScoreFactorIndicator(Boolean value) {
        this.blendedScoreFactorIndicator = value;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public ThirdPartyInformation getThirdPartyInformation() {
        return thirdPartyInformation;
    }

    /**
     * Sets the value of the thirdPartyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public void setThirdPartyInformation(ThirdPartyInformation value) {
        this.thirdPartyInformation = value;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

    /**
     * Gets the value of the dataProviderOfficeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderOfficeID() {
        return dataProviderOfficeID;
    }

    /**
     * Sets the value of the dataProviderOfficeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProviderOfficeID(String value) {
        this.dataProviderOfficeID = value;
    }

    /**
     * Gets the value of the assessmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyAssessmentReason }
     * 
     * 
     */
    public List<ThirdPartyAssessmentReason> getAssessmentReason() {
        if (assessmentReason == null) {
            assessmentReason = new ArrayList<ThirdPartyAssessmentReason>();
        }
        return this.assessmentReason;
    }

    /**
     * Gets the value of the assessmenUnavailableReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmenUnavailableReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmenUnavailableReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyAssessmenUnavailableReason }
     * 
     * 
     */
    public List<ThirdPartyAssessmenUnavailableReason> getAssessmenUnavailableReason() {
        if (assessmenUnavailableReason == null) {
            assessmenUnavailableReason = new ArrayList<ThirdPartyAssessmenUnavailableReason>();
        }
        return this.assessmenUnavailableReason;
    }

    /**
     * Gets the value of the objectAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectAttachment }
     *     
     */
    public ObjectAttachment getObjectAttachment() {
        return objectAttachment;
    }

    /**
     * Sets the value of the objectAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAttachment }
     *     
     */
    public void setObjectAttachment(ObjectAttachment value) {
        this.objectAttachment = value;
    }

}
