
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of several outcomes this Legal Event had or is having on the subject.
 *          
 * 
 * <p>Java class for EventResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventResultText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="EventResultDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SubsequentEventNonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SubsequentEventDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubsequentEventDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventResult", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "eventResultText",
    "eventResultDate",
    "subsequentEventNonPaymentAmount",
    "subsequentEventDetail"
})
public class EventResult {

    @XmlElement(name = "EventResultText")
    protected DNBDecodedStringType eventResultText;
    @XmlElement(name = "EventResultDate")
    protected DNBDateType eventResultDate;
    @XmlElement(name = "SubsequentEventNonPaymentAmount")
    protected AmountType subsequentEventNonPaymentAmount;
    @XmlElement(name = "SubsequentEventDetail")
    protected SubsequentEventDetail subsequentEventDetail;

    /**
     * Gets the value of the eventResultText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getEventResultText() {
        return eventResultText;
    }

    /**
     * Sets the value of the eventResultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setEventResultText(DNBDecodedStringType value) {
        this.eventResultText = value;
    }

    /**
     * Gets the value of the eventResultDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEventResultDate() {
        return eventResultDate;
    }

    /**
     * Sets the value of the eventResultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEventResultDate(DNBDateType value) {
        this.eventResultDate = value;
    }

    /**
     * Gets the value of the subsequentEventNonPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubsequentEventNonPaymentAmount() {
        return subsequentEventNonPaymentAmount;
    }

    /**
     * Sets the value of the subsequentEventNonPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubsequentEventNonPaymentAmount(AmountType value) {
        this.subsequentEventNonPaymentAmount = value;
    }

    /**
     * Gets the value of the subsequentEventDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SubsequentEventDetail }
     *     
     */
    public SubsequentEventDetail getSubsequentEventDetail() {
        return subsequentEventDetail;
    }

    /**
     * Sets the value of the subsequentEventDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsequentEventDetail }
     *     
     */
    public void setSubsequentEventDetail(SubsequentEventDetail value) {
        this.subsequentEventDetail = value;
    }

}
