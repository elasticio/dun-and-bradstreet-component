
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for InquirySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquirySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InquiryPeriod" type="{http://services.dnb.com/SBRIProductServiceV2.0}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquirySummary", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "inquiryCount",
    "inquiryPeriod"
})
public class InquirySummary {

    @XmlElement(name = "InquiryCount")
    protected Integer inquiryCount;
    @XmlElement(name = "InquiryPeriod")
    protected Duration inquiryPeriod;

    /**
     * Gets the value of the inquiryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInquiryCount() {
        return inquiryCount;
    }

    /**
     * Sets the value of the inquiryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInquiryCount(Integer value) {
        this.inquiryCount = value;
    }

    /**
     * Gets the value of the inquiryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getInquiryPeriod() {
        return inquiryPeriod;
    }

    /**
     * Sets the value of the inquiryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setInquiryPeriod(Duration value) {
        this.inquiryPeriod = value;
    }

}
