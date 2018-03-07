
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryPaymentExperienceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryPaymentExperienceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="IndustryClassificationtext" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256"/>
 *         &lt;element name="TwelveMonthsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryPaymentExperienceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryPaymentExperienceSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "summaryDate",
    "industryClassificationtext",
    "twelveMonthsSummary"
})
public class IndustryPaymentExperienceSummaryType {

    @XmlElement(name = "SummaryDate")
    protected DNBDateType summaryDate;
    @XmlElement(name = "IndustryClassificationtext", required = true)
    protected String industryClassificationtext;
    @XmlElement(name = "TwelveMonthsSummary")
    protected IndustryPaymentExperienceType twelveMonthsSummary;

    /**
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setSummaryDate(DNBDateType value) {
        this.summaryDate = value;
    }

    /**
     * Gets the value of the industryClassificationtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryClassificationtext() {
        return industryClassificationtext;
    }

    /**
     * Sets the value of the industryClassificationtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryClassificationtext(String value) {
        this.industryClassificationtext = value;
    }

    /**
     * Gets the value of the twelveMonthsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryPaymentExperienceType }
     *     
     */
    public IndustryPaymentExperienceType getTwelveMonthsSummary() {
        return twelveMonthsSummary;
    }

    /**
     * Sets the value of the twelveMonthsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryPaymentExperienceType }
     *     
     */
    public void setTwelveMonthsSummary(IndustryPaymentExperienceType value) {
        this.twelveMonthsSummary = value;
    }

}
