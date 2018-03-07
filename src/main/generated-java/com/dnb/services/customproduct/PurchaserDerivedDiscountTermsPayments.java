
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserDerivedDiscountTermsPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserDerivedDiscountTermsPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserDerivedDiscountTermsPayments", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "experienceCount",
    "highCreditTotalAmount",
    "highCreditMaximumAmount",
    "highCreditPromptTotalAmount",
    "promptPercentage",
    "summarizedSlow"
})
public class PurchaserDerivedDiscountTermsPayments {

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

}
