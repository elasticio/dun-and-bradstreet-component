
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholderSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareholderSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareHoldingPercentageValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncludeUndisclosedShareHoldingPercentageIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeDUNSNumberedShareholdersOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeNonDUNSNumberedShareholdersOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnFromTopCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnFromBottomCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisplayStartSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PerPageMaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholderSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "shareHoldingPercentageValue",
    "includeUndisclosedShareHoldingPercentageIndicator",
    "includeDUNSNumberedShareholdersOnlyIndicator",
    "includeNonDUNSNumberedShareholdersOnlyIndicator",
    "returnFromTopCount",
    "returnFromBottomCount",
    "displayStartSequenceNumber",
    "perPageMaximumQuantity"
})
public class ShareholderSpecification {

    @XmlElement(name = "ShareHoldingPercentageValue")
    protected String shareHoldingPercentageValue;
    @XmlElement(name = "IncludeUndisclosedShareHoldingPercentageIndicator")
    protected Boolean includeUndisclosedShareHoldingPercentageIndicator;
    @XmlElement(name = "IncludeDUNSNumberedShareholdersOnlyIndicator")
    protected Boolean includeDUNSNumberedShareholdersOnlyIndicator;
    @XmlElement(name = "IncludeNonDUNSNumberedShareholdersOnlyIndicator")
    protected Boolean includeNonDUNSNumberedShareholdersOnlyIndicator;
    @XmlElement(name = "ReturnFromTopCount")
    protected Integer returnFromTopCount;
    @XmlElement(name = "ReturnFromBottomCount")
    protected Integer returnFromBottomCount;
    @XmlElement(name = "DisplayStartSequenceNumber")
    protected Integer displayStartSequenceNumber;
    @XmlElement(name = "PerPageMaximumQuantity")
    protected Integer perPageMaximumQuantity;

    /**
     * Gets the value of the shareHoldingPercentageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareHoldingPercentageValue() {
        return shareHoldingPercentageValue;
    }

    /**
     * Sets the value of the shareHoldingPercentageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareHoldingPercentageValue(String value) {
        this.shareHoldingPercentageValue = value;
    }

    /**
     * Gets the value of the includeUndisclosedShareHoldingPercentageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUndisclosedShareHoldingPercentageIndicator() {
        return includeUndisclosedShareHoldingPercentageIndicator;
    }

    /**
     * Sets the value of the includeUndisclosedShareHoldingPercentageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUndisclosedShareHoldingPercentageIndicator(Boolean value) {
        this.includeUndisclosedShareHoldingPercentageIndicator = value;
    }

    /**
     * Gets the value of the includeDUNSNumberedShareholdersOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDUNSNumberedShareholdersOnlyIndicator() {
        return includeDUNSNumberedShareholdersOnlyIndicator;
    }

    /**
     * Sets the value of the includeDUNSNumberedShareholdersOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDUNSNumberedShareholdersOnlyIndicator(Boolean value) {
        this.includeDUNSNumberedShareholdersOnlyIndicator = value;
    }

    /**
     * Gets the value of the includeNonDUNSNumberedShareholdersOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNonDUNSNumberedShareholdersOnlyIndicator() {
        return includeNonDUNSNumberedShareholdersOnlyIndicator;
    }

    /**
     * Sets the value of the includeNonDUNSNumberedShareholdersOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNonDUNSNumberedShareholdersOnlyIndicator(Boolean value) {
        this.includeNonDUNSNumberedShareholdersOnlyIndicator = value;
    }

    /**
     * Gets the value of the returnFromTopCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnFromTopCount() {
        return returnFromTopCount;
    }

    /**
     * Sets the value of the returnFromTopCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnFromTopCount(Integer value) {
        this.returnFromTopCount = value;
    }

    /**
     * Gets the value of the returnFromBottomCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnFromBottomCount() {
        return returnFromBottomCount;
    }

    /**
     * Sets the value of the returnFromBottomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnFromBottomCount(Integer value) {
        this.returnFromBottomCount = value;
    }

    /**
     * Gets the value of the displayStartSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayStartSequenceNumber() {
        return displayStartSequenceNumber;
    }

    /**
     * Sets the value of the displayStartSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayStartSequenceNumber(Integer value) {
        this.displayStartSequenceNumber = value;
    }

    /**
     * Gets the value of the perPageMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerPageMaximumQuantity() {
        return perPageMaximumQuantity;
    }

    /**
     * Sets the value of the perPageMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerPageMaximumQuantity(Integer value) {
        this.perPageMaximumQuantity = value;
    }

}
