
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBRatingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBRatingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiskTrendText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="DNBRatingTrendText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RatingUpdatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBRatingDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "riskTrendText",
    "dnbRatingTrendText",
    "dnbStandardRating",
    "lastUpdateDate",
    "ratingUpdatedIndicator"
})
public class DNBRatingDetails {

    @XmlElement(name = "RiskTrendText")
    protected DNBDecodedStringType riskTrendText;
    @XmlElement(name = "DNBRatingTrendText")
    protected DNBDecodedStringType dnbRatingTrendText;
    @XmlElement(name = "DNBStandardRating")
    protected DNBDecodedStringType dnbStandardRating;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "RatingUpdatedIndicator")
    protected Boolean ratingUpdatedIndicator;

    /**
     * Gets the value of the riskTrendText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRiskTrendText() {
        return riskTrendText;
    }

    /**
     * Sets the value of the riskTrendText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRiskTrendText(DNBDecodedStringType value) {
        this.riskTrendText = value;
    }

    /**
     * Gets the value of the dnbRatingTrendText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDNBRatingTrendText() {
        return dnbRatingTrendText;
    }

    /**
     * Sets the value of the dnbRatingTrendText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDNBRatingTrendText(DNBDecodedStringType value) {
        this.dnbRatingTrendText = value;
    }

    /**
     * Gets the value of the dnbStandardRating property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDNBStandardRating() {
        return dnbStandardRating;
    }

    /**
     * Sets the value of the dnbStandardRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDNBStandardRating(DNBDecodedStringType value) {
        this.dnbStandardRating = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLastUpdateDate(DNBDateType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the ratingUpdatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRatingUpdatedIndicator() {
        return ratingUpdatedIndicator;
    }

    /**
     * Sets the value of the ratingUpdatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRatingUpdatedIndicator(Boolean value) {
        this.ratingUpdatedIndicator = value;
    }

}
