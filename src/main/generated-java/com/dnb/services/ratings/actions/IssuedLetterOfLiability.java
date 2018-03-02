
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuedLetterOfLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedLetterOfLiability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberInfomation" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SubscriberInfomation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedLetterOfLiability", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "subscriberInfomation"
})
public class IssuedLetterOfLiability {

    @XmlElement(name = "SubscriberInfomation")
    protected SubscriberInfomation subscriberInfomation;

    /**
     * Gets the value of the subscriberInfomation property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfomation }
     *     
     */
    public SubscriberInfomation getSubscriberInfomation() {
        return subscriberInfomation;
    }

    /**
     * Sets the value of the subscriberInfomation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfomation }
     *     
     */
    public void setSubscriberInfomation(SubscriberInfomation value) {
        this.subscriberInfomation = value;
    }

}
