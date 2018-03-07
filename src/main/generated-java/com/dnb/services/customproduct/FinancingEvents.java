
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details of events which have occurred which directly affect the subject's finances. For example the means by which moneys are obtained by the subject or financial securities which have been filed which affect the subject.
 *          
 * 
 * <p>Java class for FinancingEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecuredFilingsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancingStatementFilingInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingStatementFilingInformation" minOccurs="0"/>
 *         &lt;element name="OtherFinancingEventInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}OtherFinancialEventInformation" minOccurs="0"/>
 *         &lt;element name="SecuredFilingsInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}SecuredFilingsInformation" minOccurs="0"/>
 *         &lt;element name="LetterOfLiabilityInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}LetterOfLiabilityInformation" minOccurs="0"/>
 *         &lt;element name="UCCFilingsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UCCFilingInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}UCCFilingInformation" minOccurs="0"/>
 *         &lt;element name="MortgagesAndChargesInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}MortgagesAndChargesInformation" minOccurs="0"/>
 *         &lt;element name="RemovedLetterofLiabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LetterOfAgreementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingEvents", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "securedFilingsIndicator",
    "financingStatementFilingInformation",
    "otherFinancingEventInformation",
    "securedFilingsInformation",
    "letterOfLiabilityInformation",
    "uccFilingsIndicator",
    "uccFilingInformation",
    "mortgagesAndChargesInformation",
    "removedLetterofLiabilityIndicator",
    "letterOfAgreementIndicator"
})
public class FinancingEvents {

    @XmlElement(name = "SecuredFilingsIndicator")
    protected Boolean securedFilingsIndicator;
    @XmlElement(name = "FinancingStatementFilingInformation")
    protected FinancingStatementFilingInformation financingStatementFilingInformation;
    @XmlElement(name = "OtherFinancingEventInformation")
    protected OtherFinancialEventInformation otherFinancingEventInformation;
    @XmlElement(name = "SecuredFilingsInformation")
    protected SecuredFilingsInformation securedFilingsInformation;
    @XmlElement(name = "LetterOfLiabilityInformation")
    protected LetterOfLiabilityInformation letterOfLiabilityInformation;
    @XmlElement(name = "UCCFilingsIndicator")
    protected Boolean uccFilingsIndicator;
    @XmlElement(name = "UCCFilingInformation")
    protected UCCFilingInformation uccFilingInformation;
    @XmlElement(name = "MortgagesAndChargesInformation")
    protected MortgagesAndChargesInformation mortgagesAndChargesInformation;
    @XmlElement(name = "RemovedLetterofLiabilityIndicator")
    protected Boolean removedLetterofLiabilityIndicator;
    @XmlElement(name = "LetterOfAgreementIndicator")
    protected Boolean letterOfAgreementIndicator;

    /**
     * Gets the value of the securedFilingsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuredFilingsIndicator() {
        return securedFilingsIndicator;
    }

    /**
     * Sets the value of the securedFilingsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuredFilingsIndicator(Boolean value) {
        this.securedFilingsIndicator = value;
    }

    /**
     * Gets the value of the financingStatementFilingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingStatementFilingInformation }
     *     
     */
    public FinancingStatementFilingInformation getFinancingStatementFilingInformation() {
        return financingStatementFilingInformation;
    }

    /**
     * Sets the value of the financingStatementFilingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingStatementFilingInformation }
     *     
     */
    public void setFinancingStatementFilingInformation(FinancingStatementFilingInformation value) {
        this.financingStatementFilingInformation = value;
    }

    /**
     * Gets the value of the otherFinancingEventInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFinancialEventInformation }
     *     
     */
    public OtherFinancialEventInformation getOtherFinancingEventInformation() {
        return otherFinancingEventInformation;
    }

    /**
     * Sets the value of the otherFinancingEventInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFinancialEventInformation }
     *     
     */
    public void setOtherFinancingEventInformation(OtherFinancialEventInformation value) {
        this.otherFinancingEventInformation = value;
    }

    /**
     * Gets the value of the securedFilingsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredFilingsInformation }
     *     
     */
    public SecuredFilingsInformation getSecuredFilingsInformation() {
        return securedFilingsInformation;
    }

    /**
     * Sets the value of the securedFilingsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredFilingsInformation }
     *     
     */
    public void setSecuredFilingsInformation(SecuredFilingsInformation value) {
        this.securedFilingsInformation = value;
    }

    /**
     * Gets the value of the letterOfLiabilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfLiabilityInformation }
     *     
     */
    public LetterOfLiabilityInformation getLetterOfLiabilityInformation() {
        return letterOfLiabilityInformation;
    }

    /**
     * Sets the value of the letterOfLiabilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfLiabilityInformation }
     *     
     */
    public void setLetterOfLiabilityInformation(LetterOfLiabilityInformation value) {
        this.letterOfLiabilityInformation = value;
    }

    /**
     * Gets the value of the uccFilingsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUCCFilingsIndicator() {
        return uccFilingsIndicator;
    }

    /**
     * Sets the value of the uccFilingsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUCCFilingsIndicator(Boolean value) {
        this.uccFilingsIndicator = value;
    }

    /**
     * Gets the value of the uccFilingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link UCCFilingInformation }
     *     
     */
    public UCCFilingInformation getUCCFilingInformation() {
        return uccFilingInformation;
    }

    /**
     * Sets the value of the uccFilingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCCFilingInformation }
     *     
     */
    public void setUCCFilingInformation(UCCFilingInformation value) {
        this.uccFilingInformation = value;
    }

    /**
     * Gets the value of the mortgagesAndChargesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MortgagesAndChargesInformation }
     *     
     */
    public MortgagesAndChargesInformation getMortgagesAndChargesInformation() {
        return mortgagesAndChargesInformation;
    }

    /**
     * Sets the value of the mortgagesAndChargesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MortgagesAndChargesInformation }
     *     
     */
    public void setMortgagesAndChargesInformation(MortgagesAndChargesInformation value) {
        this.mortgagesAndChargesInformation = value;
    }

    /**
     * Gets the value of the removedLetterofLiabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovedLetterofLiabilityIndicator() {
        return removedLetterofLiabilityIndicator;
    }

    /**
     * Sets the value of the removedLetterofLiabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovedLetterofLiabilityIndicator(Boolean value) {
        this.removedLetterofLiabilityIndicator = value;
    }

    /**
     * Gets the value of the letterOfAgreementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterOfAgreementIndicator() {
        return letterOfAgreementIndicator;
    }

    /**
     * Sets the value of the letterOfAgreementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterOfAgreementIndicator(Boolean value) {
        this.letterOfAgreementIndicator = value;
    }

}
