
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="InquiryPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="IndustrySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InquirerIndustrySummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InquirerTypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquirySummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryCount",
    "inquiryPeriod",
    "industrySummary",
    "inquirerTypeText"
})
public class InquirySummary {

    @XmlElement(name = "InquiryCount")
    protected Integer inquiryCount;
    @XmlElement(name = "InquiryPeriod")
    protected Duration inquiryPeriod;
    @XmlElement(name = "IndustrySummary")
    protected List<InquirerIndustrySummaryType> industrySummary;
    @XmlElement(name = "InquirerTypeText")
    protected String inquirerTypeText;

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

    /**
     * Gets the value of the industrySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industrySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustrySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InquirerIndustrySummaryType }
     * 
     * 
     */
    public List<InquirerIndustrySummaryType> getIndustrySummary() {
        if (industrySummary == null) {
            industrySummary = new ArrayList<InquirerIndustrySummaryType>();
        }
        return this.industrySummary;
    }

    /**
     * Gets the value of the inquirerTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquirerTypeText() {
        return inquirerTypeText;
    }

    /**
     * Sets the value of the inquirerTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquirerTypeText(String value) {
        this.inquirerTypeText = value;
    }

}
