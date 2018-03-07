
package com.dnb.services.customproduct;

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
 *         &lt;element name="DocumentFilingDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}DocumentFilingDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LegalFormDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalFormDetailsType" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StockExchangeDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}StockExchangeDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShareCapitalDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ShareCapitalDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncorporationYear" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="IssuedShareCapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AuthorisedShareCapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PaidUpShareCapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RegisteredOrganizationStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RegisteredDetailText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisclaimerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentFilingRequirementDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}DocumentFilingRequirementDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObligatedToFileAccountsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockExchangeQuotedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegalFormDetailsHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalFormDetailsHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "documentFilingDetails",
    "legalFormDetails",
    "organizationIdentificationNumberDetail",
    "stockExchangeDetails",
    "shareCapitalDetails",
    "incorporationYear",
    "issuedShareCapitalAmount",
    "authorisedShareCapitalAmount",
    "paidUpShareCapitalAmount",
    "registeredOrganizationStatusText",
    "registeredDetailText",
    "disclaimerText",
    "documentFilingRequirementDetails",
    "obligatedToFileAccountsIndicator",
    "stockExchangeQuotedIndicator",
    "legalFormDetailsHistory"
})
public class RegisteredDetail {

    @XmlElement(name = "DocumentFilingDetails")
    protected List<DocumentFilingDetails> documentFilingDetails;
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
    @XmlElement(name = "AuthorisedShareCapitalAmount")
    protected AmountType authorisedShareCapitalAmount;
    @XmlElement(name = "PaidUpShareCapitalAmount")
    protected AmountType paidUpShareCapitalAmount;
    @XmlElement(name = "RegisteredOrganizationStatusText")
    protected DNBDecodedStringType registeredOrganizationStatusText;
    @XmlElement(name = "RegisteredDetailText")
    protected String registeredDetailText;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;
    @XmlElement(name = "DocumentFilingRequirementDetails")
    protected List<DocumentFilingRequirementDetails> documentFilingRequirementDetails;
    @XmlElement(name = "ObligatedToFileAccountsIndicator")
    protected Boolean obligatedToFileAccountsIndicator;
    @XmlElement(name = "StockExchangeQuotedIndicator")
    protected Boolean stockExchangeQuotedIndicator;
    @XmlElement(name = "LegalFormDetailsHistory")
    protected List<LegalFormDetailsHistory> legalFormDetailsHistory;

    /**
     * Gets the value of the documentFilingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentFilingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentFilingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFilingDetails }
     * 
     * 
     */
    public List<DocumentFilingDetails> getDocumentFilingDetails() {
        if (documentFilingDetails == null) {
            documentFilingDetails = new ArrayList<DocumentFilingDetails>();
        }
        return this.documentFilingDetails;
    }

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

    /**
     * Gets the value of the authorisedShareCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuthorisedShareCapitalAmount() {
        return authorisedShareCapitalAmount;
    }

    /**
     * Sets the value of the authorisedShareCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuthorisedShareCapitalAmount(AmountType value) {
        this.authorisedShareCapitalAmount = value;
    }

    /**
     * Gets the value of the paidUpShareCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaidUpShareCapitalAmount() {
        return paidUpShareCapitalAmount;
    }

    /**
     * Sets the value of the paidUpShareCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaidUpShareCapitalAmount(AmountType value) {
        this.paidUpShareCapitalAmount = value;
    }

    /**
     * Gets the value of the registeredOrganizationStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getRegisteredOrganizationStatusText() {
        return registeredOrganizationStatusText;
    }

    /**
     * Sets the value of the registeredOrganizationStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setRegisteredOrganizationStatusText(DNBDecodedStringType value) {
        this.registeredOrganizationStatusText = value;
    }

    /**
     * Gets the value of the registeredDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredDetailText() {
        return registeredDetailText;
    }

    /**
     * Sets the value of the registeredDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredDetailText(String value) {
        this.registeredDetailText = value;
    }

    /**
     * Gets the value of the disclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerText() {
        return disclaimerText;
    }

    /**
     * Sets the value of the disclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerText(String value) {
        this.disclaimerText = value;
    }

    /**
     * Gets the value of the documentFilingRequirementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentFilingRequirementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentFilingRequirementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFilingRequirementDetails }
     * 
     * 
     */
    public List<DocumentFilingRequirementDetails> getDocumentFilingRequirementDetails() {
        if (documentFilingRequirementDetails == null) {
            documentFilingRequirementDetails = new ArrayList<DocumentFilingRequirementDetails>();
        }
        return this.documentFilingRequirementDetails;
    }

    /**
     * Gets the value of the obligatedToFileAccountsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligatedToFileAccountsIndicator() {
        return obligatedToFileAccountsIndicator;
    }

    /**
     * Sets the value of the obligatedToFileAccountsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligatedToFileAccountsIndicator(Boolean value) {
        this.obligatedToFileAccountsIndicator = value;
    }

    /**
     * Gets the value of the stockExchangeQuotedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockExchangeQuotedIndicator() {
        return stockExchangeQuotedIndicator;
    }

    /**
     * Sets the value of the stockExchangeQuotedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStockExchangeQuotedIndicator(Boolean value) {
        this.stockExchangeQuotedIndicator = value;
    }

    /**
     * Gets the value of the legalFormDetailsHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalFormDetailsHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalFormDetailsHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalFormDetailsHistory }
     * 
     * 
     */
    public List<LegalFormDetailsHistory> getLegalFormDetailsHistory() {
        if (legalFormDetailsHistory == null) {
            legalFormDetailsHistory = new ArrayList<LegalFormDetailsHistory>();
        }
        return this.legalFormDetailsHistory;
    }

}
