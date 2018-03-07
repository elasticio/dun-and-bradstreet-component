
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RatingReason" type="{http://services.dnb.com/CustomProductServiceV2.0}RatingReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RatingOverrideReason" type="{http://services.dnb.com/CustomProductServiceV2.0}RatingOverrideReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rating", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "ratingDate",
    "ratingReason",
    "ratingOverrideReason"
})
@XmlSeeAlso({
    DNBStandardRatingType.class
})
public class Rating {

    @XmlElement(name = "RatingDate")
    protected DNBDateType ratingDate;
    @XmlElement(name = "RatingReason")
    protected List<RatingReason> ratingReason;
    @XmlElement(name = "RatingOverrideReason")
    protected List<RatingOverrideReason> ratingOverrideReason;

    /**
     * Gets the value of the ratingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getRatingDate() {
        return ratingDate;
    }

    /**
     * Sets the value of the ratingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setRatingDate(DNBDateType value) {
        this.ratingDate = value;
    }

    /**
     * Gets the value of the ratingReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingReason }
     * 
     * 
     */
    public List<RatingReason> getRatingReason() {
        if (ratingReason == null) {
            ratingReason = new ArrayList<RatingReason>();
        }
        return this.ratingReason;
    }

    /**
     * Gets the value of the ratingOverrideReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingOverrideReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingOverrideReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingOverrideReason }
     * 
     * 
     */
    public List<RatingOverrideReason> getRatingOverrideReason() {
        if (ratingOverrideReason == null) {
            ratingOverrideReason = new ArrayList<RatingOverrideReason>();
        }
        return this.ratingOverrideReason;
    }

}
