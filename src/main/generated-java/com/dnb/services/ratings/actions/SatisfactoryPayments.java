
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of payment experiences considered satisfactory.Satisfactory indicated by "SATISFACTORY" in Payment notes or indication of "ANTIC", "ANTIC-DISC", "ANTIC-PPT", "DISC", "DISC-PPT", "PPT" as Payment Manner
 *          
 * 
 * <p>Java class for SatisfactoryPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SatisfactoryPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperienceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SatisfactoryPayments", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "experienceCount"
})
public class SatisfactoryPayments {

    @XmlElement(name = "ExperienceCount")
    protected Integer experienceCount;

    /**
     * Gets the value of the experienceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceCount() {
        return experienceCount;
    }

    /**
     * Sets the value of the experienceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceCount(Integer value) {
        this.experienceCount = value;
    }

}
