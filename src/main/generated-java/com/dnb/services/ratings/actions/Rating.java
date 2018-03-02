
package com.dnb.services.ratings.actions;

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
 *         &lt;element name="RatingReason" type="{http://services.dnb.com/AssessmentProductServiceV2.0}RatingReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rating", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "ratingReason"
})
@XmlSeeAlso({
    DNBStandardRatingType.class
})
public class Rating {

    @XmlElement(name = "RatingReason")
    protected List<RatingReason> ratingReason;

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

}
