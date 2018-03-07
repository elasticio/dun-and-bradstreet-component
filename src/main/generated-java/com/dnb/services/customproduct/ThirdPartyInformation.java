
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}OtherThirdPartyInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FileHitValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ErrorValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MismatchMessageTypeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MismatchedAddressTypeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InformationTypeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubscriberOrSourceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountOrDocketNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AffiliateRemarkOrPublicRecordTypeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GenericRemarkValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RatingHistoryRemarkValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ComplianceRemarkValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreDerogatoryAndInquiryAlertValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ComplianceMiscellenousInformationText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsumerStatementContentTypeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsumerStatementText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
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
@XmlType(name = "ThirdPartyInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "otherInformation",
    "fileHitValue",
    "errorValue",
    "mismatchMessageTypeValue",
    "mismatchedAddressTypeValue",
    "informationTypeValue",
    "subscriberOrSourceName",
    "accountOrDocketNumber",
    "affiliateRemarkOrPublicRecordTypeValue",
    "genericRemarkValue",
    "ratingHistoryRemarkValue",
    "complianceRemarkValue",
    "scoreDerogatoryAndInquiryAlertValue",
    "complianceMiscellenousInformationText",
    "consumerStatementContentTypeValue",
    "consumerStatementText"
})
public class ThirdPartyInformation {

    @XmlElement(name = "OtherInformation")
    protected List<OtherThirdPartyInformation> otherInformation;
    @XmlElement(name = "FileHitValue")
    protected String fileHitValue;
    @XmlElement(name = "ErrorValue")
    protected String errorValue;
    @XmlElement(name = "MismatchMessageTypeValue")
    protected String mismatchMessageTypeValue;
    @XmlElement(name = "MismatchedAddressTypeValue")
    protected String mismatchedAddressTypeValue;
    @XmlElement(name = "InformationTypeValue")
    protected String informationTypeValue;
    @XmlElement(name = "SubscriberOrSourceName")
    protected String subscriberOrSourceName;
    @XmlElement(name = "AccountOrDocketNumber")
    protected String accountOrDocketNumber;
    @XmlElement(name = "AffiliateRemarkOrPublicRecordTypeValue")
    protected String affiliateRemarkOrPublicRecordTypeValue;
    @XmlElement(name = "GenericRemarkValue")
    protected String genericRemarkValue;
    @XmlElement(name = "RatingHistoryRemarkValue")
    protected String ratingHistoryRemarkValue;
    @XmlElement(name = "ComplianceRemarkValue")
    protected String complianceRemarkValue;
    @XmlElement(name = "ScoreDerogatoryAndInquiryAlertValue")
    protected String scoreDerogatoryAndInquiryAlertValue;
    @XmlElement(name = "ComplianceMiscellenousInformationText")
    protected String complianceMiscellenousInformationText;
    @XmlElement(name = "ConsumerStatementContentTypeValue")
    protected String consumerStatementContentTypeValue;
    @XmlElement(name = "ConsumerStatementText")
    protected String consumerStatementText;

    /**
     * Gets the value of the otherInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherThirdPartyInformation }
     * 
     * 
     */
    public List<OtherThirdPartyInformation> getOtherInformation() {
        if (otherInformation == null) {
            otherInformation = new ArrayList<OtherThirdPartyInformation>();
        }
        return this.otherInformation;
    }

    /**
     * Gets the value of the fileHitValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHitValue() {
        return fileHitValue;
    }

    /**
     * Sets the value of the fileHitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHitValue(String value) {
        this.fileHitValue = value;
    }

    /**
     * Gets the value of the errorValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorValue() {
        return errorValue;
    }

    /**
     * Sets the value of the errorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorValue(String value) {
        this.errorValue = value;
    }

    /**
     * Gets the value of the mismatchMessageTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMismatchMessageTypeValue() {
        return mismatchMessageTypeValue;
    }

    /**
     * Sets the value of the mismatchMessageTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMismatchMessageTypeValue(String value) {
        this.mismatchMessageTypeValue = value;
    }

    /**
     * Gets the value of the mismatchedAddressTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMismatchedAddressTypeValue() {
        return mismatchedAddressTypeValue;
    }

    /**
     * Sets the value of the mismatchedAddressTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMismatchedAddressTypeValue(String value) {
        this.mismatchedAddressTypeValue = value;
    }

    /**
     * Gets the value of the informationTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationTypeValue() {
        return informationTypeValue;
    }

    /**
     * Sets the value of the informationTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationTypeValue(String value) {
        this.informationTypeValue = value;
    }

    /**
     * Gets the value of the subscriberOrSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberOrSourceName() {
        return subscriberOrSourceName;
    }

    /**
     * Sets the value of the subscriberOrSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberOrSourceName(String value) {
        this.subscriberOrSourceName = value;
    }

    /**
     * Gets the value of the accountOrDocketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOrDocketNumber() {
        return accountOrDocketNumber;
    }

    /**
     * Sets the value of the accountOrDocketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOrDocketNumber(String value) {
        this.accountOrDocketNumber = value;
    }

    /**
     * Gets the value of the affiliateRemarkOrPublicRecordTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateRemarkOrPublicRecordTypeValue() {
        return affiliateRemarkOrPublicRecordTypeValue;
    }

    /**
     * Sets the value of the affiliateRemarkOrPublicRecordTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateRemarkOrPublicRecordTypeValue(String value) {
        this.affiliateRemarkOrPublicRecordTypeValue = value;
    }

    /**
     * Gets the value of the genericRemarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericRemarkValue() {
        return genericRemarkValue;
    }

    /**
     * Sets the value of the genericRemarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericRemarkValue(String value) {
        this.genericRemarkValue = value;
    }

    /**
     * Gets the value of the ratingHistoryRemarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingHistoryRemarkValue() {
        return ratingHistoryRemarkValue;
    }

    /**
     * Sets the value of the ratingHistoryRemarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingHistoryRemarkValue(String value) {
        this.ratingHistoryRemarkValue = value;
    }

    /**
     * Gets the value of the complianceRemarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceRemarkValue() {
        return complianceRemarkValue;
    }

    /**
     * Sets the value of the complianceRemarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceRemarkValue(String value) {
        this.complianceRemarkValue = value;
    }

    /**
     * Gets the value of the scoreDerogatoryAndInquiryAlertValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreDerogatoryAndInquiryAlertValue() {
        return scoreDerogatoryAndInquiryAlertValue;
    }

    /**
     * Sets the value of the scoreDerogatoryAndInquiryAlertValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreDerogatoryAndInquiryAlertValue(String value) {
        this.scoreDerogatoryAndInquiryAlertValue = value;
    }

    /**
     * Gets the value of the complianceMiscellenousInformationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceMiscellenousInformationText() {
        return complianceMiscellenousInformationText;
    }

    /**
     * Sets the value of the complianceMiscellenousInformationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceMiscellenousInformationText(String value) {
        this.complianceMiscellenousInformationText = value;
    }

    /**
     * Gets the value of the consumerStatementContentTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerStatementContentTypeValue() {
        return consumerStatementContentTypeValue;
    }

    /**
     * Sets the value of the consumerStatementContentTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerStatementContentTypeValue(String value) {
        this.consumerStatementContentTypeValue = value;
    }

    /**
     * Gets the value of the consumerStatementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerStatementText() {
        return consumerStatementText;
    }

    /**
     * Sets the value of the consumerStatementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerStatementText(String value) {
        this.consumerStatementText = value;
    }

}
