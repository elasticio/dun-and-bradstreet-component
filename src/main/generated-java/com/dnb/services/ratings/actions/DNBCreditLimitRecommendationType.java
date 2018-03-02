
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBCreditLimitRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBCreditLimitRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumRecommendedLimitAmount" type="{http://services.dnb.com/AssessmentProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBCreditLimitRecommendationType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "maximumRecommendedLimitAmount"
})
public class DNBCreditLimitRecommendationType {

    @XmlElement(name = "MaximumRecommendedLimitAmount")
    protected AmountType maximumRecommendedLimitAmount;

    /**
     * Gets the value of the maximumRecommendedLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumRecommendedLimitAmount() {
        return maximumRecommendedLimitAmount;
    }

    /**
     * Sets the value of the maximumRecommendedLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumRecommendedLimitAmount(AmountType value) {
        this.maximumRecommendedLimitAmount = value;
    }

}
