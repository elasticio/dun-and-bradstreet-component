
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records subject&apos;s current Composite Paydex Score which is the numeric average of the Paydex scores from last 12 months.
 *          
 * 
 * <p>Java class for CompositePaydexScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositePaydexScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompositePaydexScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScoreDate" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositePaydexScoreType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "compositePaydexScore",
    "scoreDate"
})
public class CompositePaydexScoreType {

    @XmlElement(name = "CompositePaydexScore")
    protected int compositePaydexScore;
    @XmlElement(name = "ScoreDate")
    protected DNBDateType scoreDate;

    /**
     * Gets the value of the compositePaydexScore property.
     * 
     */
    public int getCompositePaydexScore() {
        return compositePaydexScore;
    }

    /**
     * Sets the value of the compositePaydexScore property.
     * 
     */
    public void setCompositePaydexScore(int value) {
        this.compositePaydexScore = value;
    }

    /**
     * Gets the value of the scoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getScoreDate() {
        return scoreDate;
    }

    /**
     * Sets the value of the scoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setScoreDate(DNBDateType value) {
        this.scoreDate = value;
    }

}
