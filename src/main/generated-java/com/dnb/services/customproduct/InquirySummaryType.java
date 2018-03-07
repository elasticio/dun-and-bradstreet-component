
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquirySummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquirySummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inquiry24MonthsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Inquiry12MonthsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Inquiry90DaysCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Inquiry30DaysCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MostRecentInquiryDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquirySummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiry24MonthsCount",
    "inquiry12MonthsCount",
    "inquiry90DaysCount",
    "inquiry30DaysCount",
    "mostRecentInquiryDate"
})
public class InquirySummaryType {

    @XmlElement(name = "Inquiry24MonthsCount")
    protected Integer inquiry24MonthsCount;
    @XmlElement(name = "Inquiry12MonthsCount")
    protected Integer inquiry12MonthsCount;
    @XmlElement(name = "Inquiry90DaysCount")
    protected Integer inquiry90DaysCount;
    @XmlElement(name = "Inquiry30DaysCount")
    protected Integer inquiry30DaysCount;
    @XmlElement(name = "MostRecentInquiryDate")
    protected DNBDateType mostRecentInquiryDate;

    /**
     * Gets the value of the inquiry24MonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiry24MonthsCount() {
        return inquiry24MonthsCount;
    }

    /**
     * Sets the value of the inquiry24MonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiry24MonthsCount(Integer value) {
        this.inquiry24MonthsCount = value;
    }

    /**
     * Gets the value of the inquiry12MonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiry12MonthsCount() {
        return inquiry12MonthsCount;
    }

    /**
     * Sets the value of the inquiry12MonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiry12MonthsCount(Integer value) {
        this.inquiry12MonthsCount = value;
    }

    /**
     * Gets the value of the inquiry90DaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiry90DaysCount() {
        return inquiry90DaysCount;
    }

    /**
     * Sets the value of the inquiry90DaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiry90DaysCount(Integer value) {
        this.inquiry90DaysCount = value;
    }

    /**
     * Gets the value of the inquiry30DaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiry30DaysCount() {
        return inquiry30DaysCount;
    }

    /**
     * Sets the value of the inquiry30DaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiry30DaysCount(Integer value) {
        this.inquiry30DaysCount = value;
    }

    /**
     * Gets the value of the mostRecentInquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentInquiryDate() {
        return mostRecentInquiryDate;
    }

    /**
     * Sets the value of the mostRecentInquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentInquiryDate(DNBDateType value) {
        this.mostRecentInquiryDate = value;
    }

}
