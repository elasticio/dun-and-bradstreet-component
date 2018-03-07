
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedPaymentsToSupplierIndustry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedPaymentsToSupplierIndustry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndustryCodeDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCodeDescriptionType" maxOccurs="unbounded"/>
 *         &lt;element name="ExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighCreditTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditMaximumAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighCreditPromptTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PromptPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SummarizedSlow" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedSlowType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedPaymentsToSupplierIndustry", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryCode",
    "industryCodeDescription",
    "experienceCount",
    "highCreditTotalAmount",
    "highCreditMaximumAmount",
    "highCreditPromptTotalAmount",
    "promptPercentage",
    "summarizedSlow"
})
public class PurchaserDerivedPaymentsToSupplierIndustry {

    @XmlElement(name = "IndustryCode", required = true)
    protected String industryCode;
    @XmlElement(name = "IndustryCodeDescription", required = true)
    protected List<IndustryCodeDescriptionType> industryCodeDescription;
    @XmlElement(name = "ExperienceCount")
    protected Integer experienceCount;
    @XmlElement(name = "HighCreditTotalAmount")
    protected AmountType highCreditTotalAmount;
    @XmlElement(name = "HighCreditMaximumAmount")
    protected AmountType highCreditMaximumAmount;
    @XmlElement(name = "HighCreditPromptTotalAmount")
    protected AmountType highCreditPromptTotalAmount;
    @XmlElement(name = "PromptPercentage")
    protected BigDecimal promptPercentage;
    @XmlElement(name = "SummarizedSlow")
    protected List<SummarizedSlowType> summarizedSlow;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "TypeText")
    protected String typeText;

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
     * Gets the value of the experienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceCount() {
        return experienceCount;
    }

    /**
     * Sets the value of the experienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceCount(Integer value) {
        this.experienceCount = value;
    }

    /**
     * Gets the value of the highCreditTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditTotalAmount() {
        return highCreditTotalAmount;
    }

    /**
     * Sets the value of the highCreditTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditTotalAmount(AmountType value) {
        this.highCreditTotalAmount = value;
    }

    /**
     * Gets the value of the highCreditMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditMaximumAmount() {
        return highCreditMaximumAmount;
    }

    /**
     * Sets the value of the highCreditMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditMaximumAmount(AmountType value) {
        this.highCreditMaximumAmount = value;
    }

    /**
     * Gets the value of the highCreditPromptTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighCreditPromptTotalAmount() {
        return highCreditPromptTotalAmount;
    }

    /**
     * Sets the value of the highCreditPromptTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighCreditPromptTotalAmount(AmountType value) {
        this.highCreditPromptTotalAmount = value;
    }

    /**
     * Gets the value of the promptPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromptPercentage() {
        return promptPercentage;
    }

    /**
     * Sets the value of the promptPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromptPercentage(BigDecimal value) {
        this.promptPercentage = value;
    }

    /**
     * Gets the value of the summarizedSlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarizedSlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarizedSlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarizedSlowType }
     * 
     * 
     */
    public List<SummarizedSlowType> getSummarizedSlow() {
        if (summarizedSlow == null) {
            summarizedSlow = new ArrayList<SummarizedSlowType>();
        }
        return this.summarizedSlow;
    }

    /**
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDNBCodeTableNumber(Integer value) {
        this.dnbCodeTableNumber = value;
    }

    /**
     * Gets the value of the dnbCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeValue() {
        return dnbCodeValue;
    }

    /**
     * Sets the value of the dnbCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeValue(BigInteger value) {
        this.dnbCodeValue = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

}
