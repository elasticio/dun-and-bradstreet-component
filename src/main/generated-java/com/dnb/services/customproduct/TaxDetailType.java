
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of details about various kinds of taxes for which the Subject is responsible as recorded in the document filed with the registry or a similar body.
 *          
 * 
 * <p>Java class for TaxDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TaxPaidDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="TaxFinancialItem" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxPaymentAssessment" type="{http://services.dnb.com/CustomProductServiceV2.0}TaxPaymentAssessment" minOccurs="0"/>
 *         &lt;element name="TaxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "taxTypeText",
    "taxPaidDate",
    "taxFinancialItem",
    "taxPaymentAssessment",
    "taxPercentage",
    "taxAddress"
})
public class TaxDetailType {

    @XmlElement(name = "TaxTypeText")
    protected DNBDecodedStringType taxTypeText;
    @XmlElement(name = "TaxPaidDate")
    protected DNBDateType taxPaidDate;
    @XmlElement(name = "TaxFinancialItem")
    protected List<StatementItem> taxFinancialItem;
    @XmlElement(name = "TaxPaymentAssessment")
    protected TaxPaymentAssessment taxPaymentAssessment;
    @XmlElement(name = "TaxPercentage")
    protected BigDecimal taxPercentage;
    @XmlElement(name = "TaxAddress")
    protected PrimaryAddressType taxAddress;

    /**
     * Gets the value of the taxTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTaxTypeText() {
        return taxTypeText;
    }

    /**
     * Sets the value of the taxTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTaxTypeText(DNBDecodedStringType value) {
        this.taxTypeText = value;
    }

    /**
     * Gets the value of the taxPaidDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getTaxPaidDate() {
        return taxPaidDate;
    }

    /**
     * Sets the value of the taxPaidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setTaxPaidDate(DNBDateType value) {
        this.taxPaidDate = value;
    }

    /**
     * Gets the value of the taxFinancialItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxFinancialItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxFinancialItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementItem }
     * 
     * 
     */
    public List<StatementItem> getTaxFinancialItem() {
        if (taxFinancialItem == null) {
            taxFinancialItem = new ArrayList<StatementItem>();
        }
        return this.taxFinancialItem;
    }

    /**
     * Gets the value of the taxPaymentAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPaymentAssessment }
     *     
     */
    public TaxPaymentAssessment getTaxPaymentAssessment() {
        return taxPaymentAssessment;
    }

    /**
     * Sets the value of the taxPaymentAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPaymentAssessment }
     *     
     */
    public void setTaxPaymentAssessment(TaxPaymentAssessment value) {
        this.taxPaymentAssessment = value;
    }

    /**
     * Gets the value of the taxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets the value of the taxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPercentage(BigDecimal value) {
        this.taxPercentage = value;
    }

    /**
     * Gets the value of the taxAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getTaxAddress() {
        return taxAddress;
    }

    /**
     * Sets the value of the taxAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setTaxAddress(PrimaryAddressType value) {
        this.taxAddress = value;
    }

}
