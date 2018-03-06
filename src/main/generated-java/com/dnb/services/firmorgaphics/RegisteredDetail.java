
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the constitutional status of a subject as defined under the laws of a country E.g.; Limited Company, Partnership, co-operative Society and the Stock Equity or share structure employed by a business according to the legal form and rules of incorporation. The owners of the stock or shares are the owners of the business.
 *          
 * 
 * <p>Java class for RegisteredDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalFormDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}LegalFormDetailsType" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}OrganizationIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StockExchangeDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}StockExchangeDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShareCapitalDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ShareCapitalDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncorporationYear" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="IssuedShareCapitalAmount" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "legalFormDetails",
    "organizationIdentificationNumberDetail",
    "stockExchangeDetails",
    "shareCapitalDetails",
    "incorporationYear",
    "issuedShareCapitalAmount"
})
public class RegisteredDetail {

    @XmlElement(name = "LegalFormDetails")
    protected LegalFormDetailsType legalFormDetails;
    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected List<OrganizationIdentificationNumberType> organizationIdentificationNumberDetail;
    @XmlElement(name = "StockExchangeDetails")
    protected List<StockExchangeDetails> stockExchangeDetails;
    @XmlElement(name = "ShareCapitalDetails")
    protected List<ShareCapitalDetailsType> shareCapitalDetails;
    @XmlElement(name = "IncorporationYear")
    protected String incorporationYear;
    @XmlElement(name = "IssuedShareCapitalAmount")
    protected AmountType issuedShareCapitalAmount;

    /**
     * Gets the value of the legalFormDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFormDetailsType }
     *     
     */
    public LegalFormDetailsType getLegalFormDetails() {
        return legalFormDetails;
    }

    /**
     * Sets the value of the legalFormDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFormDetailsType }
     *     
     */
    public void setLegalFormDetails(LegalFormDetailsType value) {
        this.legalFormDetails = value;
    }

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationIdentificationNumberType }
     * 
     * 
     */
    public List<OrganizationIdentificationNumberType> getOrganizationIdentificationNumberDetail() {
        if (organizationIdentificationNumberDetail == null) {
            organizationIdentificationNumberDetail = new ArrayList<OrganizationIdentificationNumberType>();
        }
        return this.organizationIdentificationNumberDetail;
    }

    /**
     * Gets the value of the stockExchangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockExchangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockExchangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockExchangeDetails }
     * 
     * 
     */
    public List<StockExchangeDetails> getStockExchangeDetails() {
        if (stockExchangeDetails == null) {
            stockExchangeDetails = new ArrayList<StockExchangeDetails>();
        }
        return this.stockExchangeDetails;
    }

    /**
     * Gets the value of the shareCapitalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareCapitalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareCapitalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareCapitalDetailsType }
     * 
     * 
     */
    public List<ShareCapitalDetailsType> getShareCapitalDetails() {
        if (shareCapitalDetails == null) {
            shareCapitalDetails = new ArrayList<ShareCapitalDetailsType>();
        }
        return this.shareCapitalDetails;
    }

    /**
     * Gets the value of the incorporationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporationYear() {
        return incorporationYear;
    }

    /**
     * Sets the value of the incorporationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporationYear(String value) {
        this.incorporationYear = value;
    }

    /**
     * Gets the value of the issuedShareCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIssuedShareCapitalAmount() {
        return issuedShareCapitalAmount;
    }

    /**
     * Sets the value of the issuedShareCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIssuedShareCapitalAmount(AmountType value) {
        this.issuedShareCapitalAmount = value;
    }

}
