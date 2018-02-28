
package com.dnb.services.report;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID" type="{http://services.dnb.com/ReportProductServiceV2.0}ProductCode"/>
 *         &lt;element name="DNBProductModuleID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MergeModuleAttachmentsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductFormatPreferenceCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="CharacterSetPreferenceCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="LanguagePreferenceCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="OrderReasonCode" type="{http://services.dnb.com/ReportProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="TradeUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnOnlyInDateDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeAttachmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "dnbProductID",
    "dnbProductModuleID",
    "mergeModuleAttachmentsIndicator",
    "productFormatPreferenceCode",
    "characterSetPreferenceCode",
    "languagePreferenceCode",
    "orderReasonCode",
    "tradeUpIndicator",
    "returnOnlyInDateDataIndicator",
    "includeAttachmentIndicator"
})
public class ProductSpecification {

    @XmlElement(name = "DNBProductID", required = true)
    protected String dnbProductID;
    @XmlElement(name = "DNBProductModuleID")
    protected List<String> dnbProductModuleID;
    @XmlElement(name = "MergeModuleAttachmentsIndicator")
    protected Boolean mergeModuleAttachmentsIndicator;
    @XmlElement(name = "ProductFormatPreferenceCode")
    protected BigInteger productFormatPreferenceCode;
    @XmlElement(name = "CharacterSetPreferenceCode")
    protected BigInteger characterSetPreferenceCode;
    @XmlElement(name = "LanguagePreferenceCode")
    protected BigInteger languagePreferenceCode;
    @XmlElement(name = "OrderReasonCode")
    protected BigInteger orderReasonCode;
    @XmlElement(name = "TradeUpIndicator")
    protected Boolean tradeUpIndicator;
    @XmlElement(name = "ReturnOnlyInDateDataIndicator")
    protected Boolean returnOnlyInDateDataIndicator;
    @XmlElement(name = "IncludeAttachmentIndicator")
    protected Boolean includeAttachmentIndicator;

    /**
     * Gets the value of the dnbProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBProductID() {
        return dnbProductID;
    }

    /**
     * Sets the value of the dnbProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBProductID(String value) {
        this.dnbProductID = value;
    }

    /**
     * Gets the value of the dnbProductModuleID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnbProductModuleID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNBProductModuleID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDNBProductModuleID() {
        if (dnbProductModuleID == null) {
            dnbProductModuleID = new ArrayList<String>();
        }
        return this.dnbProductModuleID;
    }

    /**
     * Gets the value of the mergeModuleAttachmentsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeModuleAttachmentsIndicator() {
        return mergeModuleAttachmentsIndicator;
    }

    /**
     * Sets the value of the mergeModuleAttachmentsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeModuleAttachmentsIndicator(Boolean value) {
        this.mergeModuleAttachmentsIndicator = value;
    }

    /**
     * Gets the value of the productFormatPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductFormatPreferenceCode() {
        return productFormatPreferenceCode;
    }

    /**
     * Sets the value of the productFormatPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductFormatPreferenceCode(BigInteger value) {
        this.productFormatPreferenceCode = value;
    }

    /**
     * Gets the value of the characterSetPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharacterSetPreferenceCode() {
        return characterSetPreferenceCode;
    }

    /**
     * Sets the value of the characterSetPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharacterSetPreferenceCode(BigInteger value) {
        this.characterSetPreferenceCode = value;
    }

    /**
     * Gets the value of the languagePreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }

    /**
     * Sets the value of the languagePreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguagePreferenceCode(BigInteger value) {
        this.languagePreferenceCode = value;
    }

    /**
     * Gets the value of the orderReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Sets the value of the orderReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderReasonCode(BigInteger value) {
        this.orderReasonCode = value;
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradeUpIndicator(Boolean value) {
        this.tradeUpIndicator = value;
    }

    /**
     * Gets the value of the returnOnlyInDateDataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOnlyInDateDataIndicator() {
        return returnOnlyInDateDataIndicator;
    }

    /**
     * Sets the value of the returnOnlyInDateDataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnlyInDateDataIndicator(Boolean value) {
        this.returnOnlyInDateDataIndicator = value;
    }

    /**
     * Gets the value of the includeAttachmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAttachmentIndicator() {
        return includeAttachmentIndicator;
    }

    /**
     * Sets the value of the includeAttachmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAttachmentIndicator(Boolean value) {
        this.includeAttachmentIndicator = value;
    }

}
