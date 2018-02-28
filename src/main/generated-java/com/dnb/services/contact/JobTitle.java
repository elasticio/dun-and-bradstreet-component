
package com.dnb.services.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobTitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobTitleText" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="JobTitleAdditionalInformationText" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobTitle", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "jobTitleText",
    "jobTitleAdditionalInformationText",
    "startDate",
    "endDate"
})
public class JobTitle {

    @XmlElement(name = "JobTitleText")
    protected DNBStringType jobTitleText;
    @XmlElement(name = "JobTitleAdditionalInformationText")
    protected DNBStringType jobTitleAdditionalInformationText;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;

    /**
     * Gets the value of the jobTitleText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getJobTitleText() {
        return jobTitleText;
    }

    /**
     * Sets the value of the jobTitleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setJobTitleText(DNBStringType value) {
        this.jobTitleText = value;
    }

    /**
     * Gets the value of the jobTitleAdditionalInformationText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getJobTitleAdditionalInformationText() {
        return jobTitleAdditionalInformationText;
    }

    /**
     * Sets the value of the jobTitleAdditionalInformationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setJobTitleAdditionalInformationText(DNBStringType value) {
        this.jobTitleAdditionalInformationText = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndDate(DNBDateType value) {
        this.endDate = value;
    }

}
