
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of details about the evaluation took place of the subject's ability to meet the tax obligations
 *          
 * 
 * <p>Java class for TaxPaymentAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPaymentAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="PaymentAssessmentText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPaymentAssessment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assessmentDate",
    "paymentAssessmentText"
})
public class TaxPaymentAssessment {

    @XmlElement(name = "AssessmentDate")
    protected DNBDateType assessmentDate;
    @XmlElement(name = "PaymentAssessmentText")
    protected DNBDecodedStringType paymentAssessmentText;

    /**
     * Gets the value of the assessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getAssessmentDate() {
        return assessmentDate;
    }

    /**
     * Sets the value of the assessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setAssessmentDate(DNBDateType value) {
        this.assessmentDate = value;
    }

    /**
     * Gets the value of the paymentAssessmentText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPaymentAssessmentText() {
        return paymentAssessmentText;
    }

    /**
     * Sets the value of the paymentAssessmentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPaymentAssessmentText(DNBDecodedStringType value) {
        this.paymentAssessmentText = value;
    }

}
