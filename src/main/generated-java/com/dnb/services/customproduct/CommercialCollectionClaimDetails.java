
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialCollectionClaimDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialCollectionClaimDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="StartedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ClaimDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReceivedAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="NonPaymentStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *         &lt;element name="ClaimDisputedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForeignIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegalActionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActivityDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ActivityDetailsForCommercialCollectionClaims" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialCollectionClaimDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "startDate",
    "startedByDate",
    "endDate",
    "endedByDate",
    "claimDuration",
    "paymentReceivedAmount",
    "nonPaymentAmount",
    "nonPaymentStatusText",
    "claimDisputedIndicator",
    "foreignIndicator",
    "legalActionIndicator",
    "activityDetails"
})
public class CommercialCollectionClaimDetails {

    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "StartedByDate")
    protected DNBDateType startedByDate;
    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "ClaimDuration")
    protected Integer claimDuration;
    @XmlElement(name = "PaymentReceivedAmount")
    protected AmountType paymentReceivedAmount;
    @XmlElement(name = "NonPaymentAmount")
    protected AmountType nonPaymentAmount;
    @XmlElement(name = "NonPaymentStatusText")
    protected DNBDecodedStringNewType nonPaymentStatusText;
    @XmlElement(name = "ClaimDisputedIndicator")
    protected Boolean claimDisputedIndicator;
    @XmlElement(name = "ForeignIndicator")
    protected Boolean foreignIndicator;
    @XmlElement(name = "LegalActionIndicator")
    protected Boolean legalActionIndicator;
    @XmlElement(name = "ActivityDetails")
    protected List<ActivityDetailsForCommercialCollectionClaims> activityDetails;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartedByDate() {
        return startedByDate;
    }

    /**
     * Sets the value of the startedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartedByDate(DNBDateType value) {
        this.startedByDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndDate(DNBDateType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndedByDate() {
        return endedByDate;
    }

    /**
     * Sets the value of the endedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndedByDate(DNBDateType value) {
        this.endedByDate = value;
    }

    /**
     * Gets the value of the claimDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClaimDuration() {
        return claimDuration;
    }

    /**
     * Sets the value of the claimDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClaimDuration(Integer value) {
        this.claimDuration = value;
    }

    /**
     * Gets the value of the paymentReceivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentReceivedAmount() {
        return paymentReceivedAmount;
    }

    /**
     * Sets the value of the paymentReceivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentReceivedAmount(AmountType value) {
        this.paymentReceivedAmount = value;
    }

    /**
     * Gets the value of the nonPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonPaymentAmount() {
        return nonPaymentAmount;
    }

    /**
     * Sets the value of the nonPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonPaymentAmount(AmountType value) {
        this.nonPaymentAmount = value;
    }

    /**
     * Gets the value of the nonPaymentStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getNonPaymentStatusText() {
        return nonPaymentStatusText;
    }

    /**
     * Sets the value of the nonPaymentStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setNonPaymentStatusText(DNBDecodedStringNewType value) {
        this.nonPaymentStatusText = value;
    }

    /**
     * Gets the value of the claimDisputedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimDisputedIndicator() {
        return claimDisputedIndicator;
    }

    /**
     * Sets the value of the claimDisputedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimDisputedIndicator(Boolean value) {
        this.claimDisputedIndicator = value;
    }

    /**
     * Gets the value of the foreignIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignIndicator() {
        return foreignIndicator;
    }

    /**
     * Sets the value of the foreignIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignIndicator(Boolean value) {
        this.foreignIndicator = value;
    }

    /**
     * Gets the value of the legalActionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalActionIndicator() {
        return legalActionIndicator;
    }

    /**
     * Sets the value of the legalActionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalActionIndicator(Boolean value) {
        this.legalActionIndicator = value;
    }

    /**
     * Gets the value of the activityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityDetailsForCommercialCollectionClaims }
     * 
     * 
     */
    public List<ActivityDetailsForCommercialCollectionClaims> getActivityDetails() {
        if (activityDetails == null) {
            activityDetails = new ArrayList<ActivityDetailsForCommercialCollectionClaims>();
        }
        return this.activityDetails;
    }

}
