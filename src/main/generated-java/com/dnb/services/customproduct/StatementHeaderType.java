
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialStatementToDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="StatementTemplateTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CurrencyISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="InterimIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FiscalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartialInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProformaIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpeningIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TrialBalanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnbalancedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuditIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatementHeaderText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementHeaderType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialStatementToDate",
    "statementTemplateTypeText",
    "currencyISOAlpha3Code",
    "interimIndicator",
    "fiscalIndicator",
    "partialInformationIndicator",
    "finalIndicator",
    "proformaIndicator",
    "openingIndicator",
    "trialBalanceIndicator",
    "signedIndicator",
    "restatedIndicator",
    "unbalancedIndicator",
    "auditIndicator",
    "statementHeaderText"
})
@XmlSeeAlso({
    StatementHeaderDetails.class
})
public class StatementHeaderType {

    @XmlElement(name = "FinancialStatementToDate")
    protected DNBDateType financialStatementToDate;
    @XmlElement(name = "StatementTemplateTypeText")
    protected DNBDecodedStringType statementTemplateTypeText;
    @XmlElement(name = "CurrencyISOAlpha3Code")
    protected String currencyISOAlpha3Code;
    @XmlElement(name = "InterimIndicator")
    protected Boolean interimIndicator;
    @XmlElement(name = "FiscalIndicator")
    protected Boolean fiscalIndicator;
    @XmlElement(name = "PartialInformationIndicator")
    protected Boolean partialInformationIndicator;
    @XmlElement(name = "FinalIndicator")
    protected Boolean finalIndicator;
    @XmlElement(name = "ProformaIndicator")
    protected Boolean proformaIndicator;
    @XmlElement(name = "OpeningIndicator")
    protected Boolean openingIndicator;
    @XmlElement(name = "TrialBalanceIndicator")
    protected Boolean trialBalanceIndicator;
    @XmlElement(name = "SignedIndicator")
    protected Boolean signedIndicator;
    @XmlElement(name = "RestatedIndicator")
    protected Boolean restatedIndicator;
    @XmlElement(name = "UnbalancedIndicator")
    protected Boolean unbalancedIndicator;
    @XmlElement(name = "AuditIndicator")
    protected Boolean auditIndicator;
    @XmlElement(name = "StatementHeaderText")
    protected String statementHeaderText;

    /**
     * Gets the value of the financialStatementToDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFinancialStatementToDate() {
        return financialStatementToDate;
    }

    /**
     * Sets the value of the financialStatementToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFinancialStatementToDate(DNBDateType value) {
        this.financialStatementToDate = value;
    }

    /**
     * Gets the value of the statementTemplateTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getStatementTemplateTypeText() {
        return statementTemplateTypeText;
    }

    /**
     * Sets the value of the statementTemplateTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setStatementTemplateTypeText(DNBDecodedStringType value) {
        this.statementTemplateTypeText = value;
    }

    /**
     * Gets the value of the currencyISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISOAlpha3Code() {
        return currencyISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISOAlpha3Code(String value) {
        this.currencyISOAlpha3Code = value;
    }

    /**
     * Gets the value of the interimIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterimIndicator() {
        return interimIndicator;
    }

    /**
     * Sets the value of the interimIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterimIndicator(Boolean value) {
        this.interimIndicator = value;
    }

    /**
     * Gets the value of the fiscalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiscalIndicator() {
        return fiscalIndicator;
    }

    /**
     * Sets the value of the fiscalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiscalIndicator(Boolean value) {
        this.fiscalIndicator = value;
    }

    /**
     * Gets the value of the partialInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialInformationIndicator() {
        return partialInformationIndicator;
    }

    /**
     * Sets the value of the partialInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialInformationIndicator(Boolean value) {
        this.partialInformationIndicator = value;
    }

    /**
     * Gets the value of the finalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalIndicator() {
        return finalIndicator;
    }

    /**
     * Sets the value of the finalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalIndicator(Boolean value) {
        this.finalIndicator = value;
    }

    /**
     * Gets the value of the proformaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProformaIndicator() {
        return proformaIndicator;
    }

    /**
     * Sets the value of the proformaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProformaIndicator(Boolean value) {
        this.proformaIndicator = value;
    }

    /**
     * Gets the value of the openingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpeningIndicator() {
        return openingIndicator;
    }

    /**
     * Sets the value of the openingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpeningIndicator(Boolean value) {
        this.openingIndicator = value;
    }

    /**
     * Gets the value of the trialBalanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrialBalanceIndicator() {
        return trialBalanceIndicator;
    }

    /**
     * Sets the value of the trialBalanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrialBalanceIndicator(Boolean value) {
        this.trialBalanceIndicator = value;
    }

    /**
     * Gets the value of the signedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignedIndicator() {
        return signedIndicator;
    }

    /**
     * Sets the value of the signedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignedIndicator(Boolean value) {
        this.signedIndicator = value;
    }

    /**
     * Gets the value of the restatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestatedIndicator() {
        return restatedIndicator;
    }

    /**
     * Sets the value of the restatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestatedIndicator(Boolean value) {
        this.restatedIndicator = value;
    }

    /**
     * Gets the value of the unbalancedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnbalancedIndicator() {
        return unbalancedIndicator;
    }

    /**
     * Sets the value of the unbalancedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnbalancedIndicator(Boolean value) {
        this.unbalancedIndicator = value;
    }

    /**
     * Gets the value of the auditIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditIndicator() {
        return auditIndicator;
    }

    /**
     * Sets the value of the auditIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditIndicator(Boolean value) {
        this.auditIndicator = value;
    }

    /**
     * Gets the value of the statementHeaderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementHeaderText() {
        return statementHeaderText;
    }

    /**
     * Sets the value of the statementHeaderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementHeaderText(String value) {
        this.statementHeaderText = value;
    }

}
