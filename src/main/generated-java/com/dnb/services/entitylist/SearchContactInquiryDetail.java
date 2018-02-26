
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchContactInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchContactInquiryDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}SearchInquiryDetail">
 *       &lt;sequence>
 *         &lt;element name="IndividualAgeLowRangeValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndividualAgeHighRangeValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManagementResponsibilityCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BaseSalaryLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BaseSalaryHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BonusCompensationLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="BonusCompensationHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCompensationLowRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCompensationHighRangeAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="KeywordContactText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KeywordContactScopeText" type="{http://services.dnb.com/EntityListServiceV2.0}ContactSearchScopeTextEnum" minOccurs="0"/>
 *         &lt;element name="ContactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobFunction" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchContactInquiryDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "individualAgeLowRangeValue",
    "individualAgeHighRangeValue",
    "managementResponsibilityCode",
    "baseSalaryLowRangeAmount",
    "baseSalaryHighRangeAmount",
    "bonusCompensationLowRangeAmount",
    "bonusCompensationHighRangeAmount",
    "totalCompensationLowRangeAmount",
    "totalCompensationHighRangeAmount",
    "keywordContactText",
    "keywordContactScopeText",
    "contactName",
    "contactEmailAddress",
    "jobFunction"
})
public class SearchContactInquiryDetail
    extends SearchInquiryDetail
{

    @XmlElement(name = "IndividualAgeLowRangeValue")
    protected Integer individualAgeLowRangeValue;
    @XmlElement(name = "IndividualAgeHighRangeValue")
    protected Integer individualAgeHighRangeValue;
    @XmlElement(name = "ManagementResponsibilityCode")
    protected List<String> managementResponsibilityCode;
    @XmlElement(name = "BaseSalaryLowRangeAmount")
    protected AmountType baseSalaryLowRangeAmount;
    @XmlElement(name = "BaseSalaryHighRangeAmount")
    protected AmountType baseSalaryHighRangeAmount;
    @XmlElement(name = "BonusCompensationLowRangeAmount")
    protected AmountType bonusCompensationLowRangeAmount;
    @XmlElement(name = "BonusCompensationHighRangeAmount")
    protected AmountType bonusCompensationHighRangeAmount;
    @XmlElement(name = "TotalCompensationLowRangeAmount")
    protected AmountType totalCompensationLowRangeAmount;
    @XmlElement(name = "TotalCompensationHighRangeAmount")
    protected AmountType totalCompensationHighRangeAmount;
    @XmlElement(name = "KeywordContactText")
    protected String keywordContactText;
    @XmlElement(name = "KeywordContactScopeText")
    @XmlSchemaType(name = "string")
    protected ContactSearchScopeTextEnum keywordContactScopeText;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "ContactEmailAddress")
    protected String contactEmailAddress;
    @XmlElement(name = "JobFunction")
    protected List<String> jobFunction;

    /**
     * Gets the value of the individualAgeLowRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndividualAgeLowRangeValue() {
        return individualAgeLowRangeValue;
    }

    /**
     * Sets the value of the individualAgeLowRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndividualAgeLowRangeValue(Integer value) {
        this.individualAgeLowRangeValue = value;
    }

    /**
     * Gets the value of the individualAgeHighRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndividualAgeHighRangeValue() {
        return individualAgeHighRangeValue;
    }

    /**
     * Sets the value of the individualAgeHighRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndividualAgeHighRangeValue(Integer value) {
        this.individualAgeHighRangeValue = value;
    }

    /**
     * Gets the value of the managementResponsibilityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementResponsibilityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementResponsibilityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagementResponsibilityCode() {
        if (managementResponsibilityCode == null) {
            managementResponsibilityCode = new ArrayList<String>();
        }
        return this.managementResponsibilityCode;
    }

    /**
     * Gets the value of the baseSalaryLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseSalaryLowRangeAmount() {
        return baseSalaryLowRangeAmount;
    }

    /**
     * Sets the value of the baseSalaryLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBaseSalaryLowRangeAmount(AmountType value) {
        this.baseSalaryLowRangeAmount = value;
    }

    /**
     * Gets the value of the baseSalaryHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseSalaryHighRangeAmount() {
        return baseSalaryHighRangeAmount;
    }

    /**
     * Sets the value of the baseSalaryHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBaseSalaryHighRangeAmount(AmountType value) {
        this.baseSalaryHighRangeAmount = value;
    }

    /**
     * Gets the value of the bonusCompensationLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBonusCompensationLowRangeAmount() {
        return bonusCompensationLowRangeAmount;
    }

    /**
     * Sets the value of the bonusCompensationLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBonusCompensationLowRangeAmount(AmountType value) {
        this.bonusCompensationLowRangeAmount = value;
    }

    /**
     * Gets the value of the bonusCompensationHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBonusCompensationHighRangeAmount() {
        return bonusCompensationHighRangeAmount;
    }

    /**
     * Sets the value of the bonusCompensationHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBonusCompensationHighRangeAmount(AmountType value) {
        this.bonusCompensationHighRangeAmount = value;
    }

    /**
     * Gets the value of the totalCompensationLowRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCompensationLowRangeAmount() {
        return totalCompensationLowRangeAmount;
    }

    /**
     * Sets the value of the totalCompensationLowRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCompensationLowRangeAmount(AmountType value) {
        this.totalCompensationLowRangeAmount = value;
    }

    /**
     * Gets the value of the totalCompensationHighRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCompensationHighRangeAmount() {
        return totalCompensationHighRangeAmount;
    }

    /**
     * Sets the value of the totalCompensationHighRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCompensationHighRangeAmount(AmountType value) {
        this.totalCompensationHighRangeAmount = value;
    }

    /**
     * Gets the value of the keywordContactText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordContactText() {
        return keywordContactText;
    }

    /**
     * Sets the value of the keywordContactText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordContactText(String value) {
        this.keywordContactText = value;
    }

    /**
     * Gets the value of the keywordContactScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchScopeTextEnum }
     *     
     */
    public ContactSearchScopeTextEnum getKeywordContactScopeText() {
        return keywordContactScopeText;
    }

    /**
     * Sets the value of the keywordContactScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchScopeTextEnum }
     *     
     */
    public void setKeywordContactScopeText(ContactSearchScopeTextEnum value) {
        this.keywordContactScopeText = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Sets the value of the contactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailAddress(String value) {
        this.contactEmailAddress = value;
    }

    /**
     * Gets the value of the jobFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobFunction() {
        if (jobFunction == null) {
            jobFunction = new ArrayList<String>();
        }
        return this.jobFunction;
    }

}
