
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataTopicText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfirmationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FutureReviewDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationConfirmation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dataTopicText",
    "availableIndicator",
    "confirmationDate",
    "updateDate",
    "futureReviewDate"
})
public class InformationConfirmation {

    @XmlElement(name = "DataTopicText", required = true)
    protected DNBDecodedStringType dataTopicText;
    @XmlElement(name = "AvailableIndicator")
    protected boolean availableIndicator;
    @XmlElement(name = "ConfirmationDate")
    protected DNBDateType confirmationDate;
    @XmlElement(name = "UpdateDate")
    protected DNBDateType updateDate;
    @XmlElement(name = "FutureReviewDate")
    protected DNBDateType futureReviewDate;

    /**
     * Gets the value of the dataTopicText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataTopicText() {
        return dataTopicText;
    }

    /**
     * Sets the value of the dataTopicText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataTopicText(DNBDecodedStringType value) {
        this.dataTopicText = value;
    }

    /**
     * Gets the value of the availableIndicator property.
     * 
     */
    public boolean isAvailableIndicator() {
        return availableIndicator;
    }

    /**
     * Sets the value of the availableIndicator property.
     * 
     */
    public void setAvailableIndicator(boolean value) {
        this.availableIndicator = value;
    }

    /**
     * Gets the value of the confirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getConfirmationDate() {
        return confirmationDate;
    }

    /**
     * Sets the value of the confirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setConfirmationDate(DNBDateType value) {
        this.confirmationDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setUpdateDate(DNBDateType value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the futureReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFutureReviewDate() {
        return futureReviewDate;
    }

    /**
     * Sets the value of the futureReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFutureReviewDate(DNBDateType value) {
        this.futureReviewDate = value;
    }

}
