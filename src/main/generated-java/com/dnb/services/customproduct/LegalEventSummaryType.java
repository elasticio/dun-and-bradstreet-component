
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalEventSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEventSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalFilingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MostRecentFilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OpenFilingsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenFilingsAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalFilingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="ClosedFilingsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenBankruptcyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEventSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalFilingCount",
    "mostRecentFilingDate",
    "openFilingsCount",
    "openFilingsAmount",
    "totalFilingAmount",
    "closedFilingsCount",
    "openBankruptcyIndicator"
})
@XmlSeeAlso({
    LienSummaryType.class,
    UCCFilingSummaryType.class,
    SuitSummaryType.class,
    DebarmentsSummaryType.class
})
public class LegalEventSummaryType {

    @XmlElement(name = "TotalFilingCount")
    protected Integer totalFilingCount;
    @XmlElement(name = "MostRecentFilingDate")
    protected DNBDateType mostRecentFilingDate;
    @XmlElement(name = "OpenFilingsCount")
    protected Integer openFilingsCount;
    @XmlElement(name = "OpenFilingsAmount")
    protected AmountType openFilingsAmount;
    @XmlElement(name = "TotalFilingAmount")
    protected AmountType totalFilingAmount;
    @XmlElement(name = "ClosedFilingsCount")
    protected Integer closedFilingsCount;
    @XmlElement(name = "OpenBankruptcyIndicator")
    protected Boolean openBankruptcyIndicator;

    /**
     * Gets the value of the totalFilingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalFilingCount() {
        return totalFilingCount;
    }

    /**
     * Sets the value of the totalFilingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalFilingCount(Integer value) {
        this.totalFilingCount = value;
    }

    /**
     * Gets the value of the mostRecentFilingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentFilingDate() {
        return mostRecentFilingDate;
    }

    /**
     * Sets the value of the mostRecentFilingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentFilingDate(DNBDateType value) {
        this.mostRecentFilingDate = value;
    }

    /**
     * Gets the value of the openFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenFilingsCount() {
        return openFilingsCount;
    }

    /**
     * Sets the value of the openFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenFilingsCount(Integer value) {
        this.openFilingsCount = value;
    }

    /**
     * Gets the value of the openFilingsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOpenFilingsAmount() {
        return openFilingsAmount;
    }

    /**
     * Sets the value of the openFilingsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOpenFilingsAmount(AmountType value) {
        this.openFilingsAmount = value;
    }

    /**
     * Gets the value of the totalFilingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalFilingAmount() {
        return totalFilingAmount;
    }

    /**
     * Sets the value of the totalFilingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalFilingAmount(AmountType value) {
        this.totalFilingAmount = value;
    }

    /**
     * Gets the value of the closedFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClosedFilingsCount() {
        return closedFilingsCount;
    }

    /**
     * Sets the value of the closedFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClosedFilingsCount(Integer value) {
        this.closedFilingsCount = value;
    }

    /**
     * Gets the value of the openBankruptcyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenBankruptcyIndicator() {
        return openBankruptcyIndicator;
    }

    /**
     * Sets the value of the openBankruptcyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenBankruptcyIndicator(Boolean value) {
        this.openBankruptcyIndicator = value;
    }

}
