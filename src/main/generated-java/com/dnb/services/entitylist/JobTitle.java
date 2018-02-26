
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the name used by the organization to describe this person's job, e.g., Leader Global Communication, Manager National Technical Support Center.
 *          
 * 
 * <p>Java class for JobTitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobTitleText" type="{http://services.dnb.com/EntityListServiceV2.0}DNBStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobTitle", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "jobTitleText"
})
@XmlSeeAlso({
    com.dnb.services.entitylist.FindContactResponseDetail.NavigatorDetail.JobTitleNavigatorDetail.JobTitle.class
})
public class JobTitle {

    @XmlElement(name = "JobTitleText")
    protected DNBStringType jobTitleText;

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

}
