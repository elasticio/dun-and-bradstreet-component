
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Based on information contained in the BIR, indicates the estimated financial strength and composite credit appraisal assigned by the Business Reporter on a subjective basis at the time the report is written.
 *          
 * 
 * <p>Java class for DNBStandardRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBStandardRatingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/AssessmentProductServiceV2.0}Rating">
 *       &lt;sequence>
 *         &lt;element name="DNBStandardRating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RatingSummaryText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBStandardRatingType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "dnbStandardRating",
    "ratingSummaryText"
})
public class DNBStandardRatingType
    extends Rating
{

    @XmlElement(name = "DNBStandardRating", required = true)
    protected String dnbStandardRating;
    @XmlElement(name = "RatingSummaryText")
    protected String ratingSummaryText;

    /**
     * Gets the value of the dnbStandardRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBStandardRating() {
        return dnbStandardRating;
    }

    /**
     * Sets the value of the dnbStandardRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBStandardRating(String value) {
        this.dnbStandardRating = value;
    }

    /**
     * Gets the value of the ratingSummaryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingSummaryText() {
        return ratingSummaryText;
    }

    /**
     * Sets the value of the ratingSummaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingSummaryText(String value) {
        this.ratingSummaryText = value;
    }

}
