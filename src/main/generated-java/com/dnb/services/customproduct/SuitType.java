
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This section provides details on a proceeding filed by a plaintiff(s) against the company in a court of law, in which the plaintiff(s) seeks monetary and/or non-monetary relief.
 *          
 * 
 * <p>Java class for SuitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventBaseType">
 *       &lt;sequence>
 *         &lt;element name="FilingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="FilingAmountComparisonOperatorText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ActualLegalHearingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="LegalHearingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RemedyFiled" type="{http://services.dnb.com/CustomProductServiceV2.0}RemedyFiled" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonPaymentAmountComparisonOperatorText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuitType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingAmount",
    "filingAmountComparisonOperatorText",
    "actualLegalHearingDate",
    "legalHearingDate",
    "remedyFiled",
    "nonPaymentAmountComparisonOperatorText"
})
public class SuitType
    extends LegalEventBaseType
{

    @XmlElement(name = "FilingAmount")
    protected AmountType filingAmount;
    @XmlElement(name = "FilingAmountComparisonOperatorText")
    protected DNBDecodedStringType filingAmountComparisonOperatorText;
    @XmlElement(name = "ActualLegalHearingDate")
    protected DNBDateType actualLegalHearingDate;
    @XmlElement(name = "LegalHearingDate")
    protected DNBDateType legalHearingDate;
    @XmlElement(name = "RemedyFiled")
    protected List<RemedyFiled> remedyFiled;
    @XmlElement(name = "NonPaymentAmountComparisonOperatorText")
    protected DNBDecodedStringType nonPaymentAmountComparisonOperatorText;

    /**
     * Gets the value of the filingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFilingAmount() {
        return filingAmount;
    }

    /**
     * Sets the value of the filingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFilingAmount(AmountType value) {
        this.filingAmount = value;
    }

    /**
     * Gets the value of the filingAmountComparisonOperatorText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingAmountComparisonOperatorText() {
        return filingAmountComparisonOperatorText;
    }

    /**
     * Sets the value of the filingAmountComparisonOperatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingAmountComparisonOperatorText(DNBDecodedStringType value) {
        this.filingAmountComparisonOperatorText = value;
    }

    /**
     * Gets the value of the actualLegalHearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getActualLegalHearingDate() {
        return actualLegalHearingDate;
    }

    /**
     * Sets the value of the actualLegalHearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setActualLegalHearingDate(DNBDateType value) {
        this.actualLegalHearingDate = value;
    }

    /**
     * Gets the value of the legalHearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLegalHearingDate() {
        return legalHearingDate;
    }

    /**
     * Sets the value of the legalHearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLegalHearingDate(DNBDateType value) {
        this.legalHearingDate = value;
    }

    /**
     * Gets the value of the remedyFiled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remedyFiled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemedyFiled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemedyFiled }
     * 
     * 
     */
    public List<RemedyFiled> getRemedyFiled() {
        if (remedyFiled == null) {
            remedyFiled = new ArrayList<RemedyFiled>();
        }
        return this.remedyFiled;
    }

    /**
     * Gets the value of the nonPaymentAmountComparisonOperatorText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNonPaymentAmountComparisonOperatorText() {
        return nonPaymentAmountComparisonOperatorText;
    }

    /**
     * Sets the value of the nonPaymentAmountComparisonOperatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNonPaymentAmountComparisonOperatorText(DNBDecodedStringType value) {
        this.nonPaymentAmountComparisonOperatorText = value;
    }

}
