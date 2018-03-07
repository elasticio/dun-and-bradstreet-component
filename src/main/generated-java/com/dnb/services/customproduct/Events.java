
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the information about that different events against the subject, e.g., legal event, financial event, significant event.
 *          
 * 
 * <p>Java class for Events complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Events">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicFilingHeader" type="{http://services.dnb.com/CustomProductServiceV2.0}PublicFilingHeaderType" minOccurs="0"/>
 *         &lt;element name="LegalEvents" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEvents" minOccurs="0"/>
 *         &lt;element name="FinancingEvents" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingEvents" minOccurs="0"/>
 *         &lt;element name="SignificantEvents" type="{http://services.dnb.com/CustomProductServiceV2.0}SignificantEvents" minOccurs="0"/>
 *         &lt;element name="OperationalSpecialEventsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancialOrLegalOrSpecialEventsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OtherSpecialEventsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalGovernmentLoanAssistanceRecipientIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalGovernmentAdministrativeDebtIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalGovernmentContractRecipientIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalGovernmentGrantRecipientIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalProgramExclusionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FreeFormEvent" type="{http://services.dnb.com/CustomProductServiceV2.0}FreeFormEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SevereNegativeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Events", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "publicFilingHeader",
    "legalEvents",
    "financingEvents",
    "significantEvents",
    "operationalSpecialEventsIndicator",
    "financialOrLegalOrSpecialEventsIndicator",
    "otherSpecialEventsIndicator",
    "federalGovernmentLoanAssistanceRecipientIndicator",
    "federalGovernmentAdministrativeDebtIndicator",
    "federalGovernmentContractRecipientIndicator",
    "federalGovernmentGrantRecipientIndicator",
    "federalProgramExclusionIndicator",
    "freeFormEvent",
    "severeNegativeIndicator"
})
public class Events {

    @XmlElement(name = "PublicFilingHeader")
    protected PublicFilingHeaderType publicFilingHeader;
    @XmlElement(name = "LegalEvents")
    protected LegalEvents legalEvents;
    @XmlElement(name = "FinancingEvents")
    protected FinancingEvents financingEvents;
    @XmlElement(name = "SignificantEvents")
    protected SignificantEvents significantEvents;
    @XmlElement(name = "OperationalSpecialEventsIndicator")
    protected Boolean operationalSpecialEventsIndicator;
    @XmlElement(name = "FinancialOrLegalOrSpecialEventsIndicator")
    protected Boolean financialOrLegalOrSpecialEventsIndicator;
    @XmlElement(name = "OtherSpecialEventsIndicator")
    protected Boolean otherSpecialEventsIndicator;
    @XmlElement(name = "FederalGovernmentLoanAssistanceRecipientIndicator")
    protected Boolean federalGovernmentLoanAssistanceRecipientIndicator;
    @XmlElement(name = "FederalGovernmentAdministrativeDebtIndicator")
    protected Boolean federalGovernmentAdministrativeDebtIndicator;
    @XmlElement(name = "FederalGovernmentContractRecipientIndicator")
    protected Boolean federalGovernmentContractRecipientIndicator;
    @XmlElement(name = "FederalGovernmentGrantRecipientIndicator")
    protected Boolean federalGovernmentGrantRecipientIndicator;
    @XmlElement(name = "FederalProgramExclusionIndicator")
    protected Boolean federalProgramExclusionIndicator;
    @XmlElement(name = "FreeFormEvent")
    protected List<FreeFormEvent> freeFormEvent;
    @XmlElement(name = "SevereNegativeIndicator")
    protected Boolean severeNegativeIndicator;

    /**
     * Gets the value of the publicFilingHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilingHeaderType }
     *     
     */
    public PublicFilingHeaderType getPublicFilingHeader() {
        return publicFilingHeader;
    }

    /**
     * Sets the value of the publicFilingHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilingHeaderType }
     *     
     */
    public void setPublicFilingHeader(PublicFilingHeaderType value) {
        this.publicFilingHeader = value;
    }

    /**
     * Gets the value of the legalEvents property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEvents }
     *     
     */
    public LegalEvents getLegalEvents() {
        return legalEvents;
    }

    /**
     * Sets the value of the legalEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEvents }
     *     
     */
    public void setLegalEvents(LegalEvents value) {
        this.legalEvents = value;
    }

    /**
     * Gets the value of the financingEvents property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingEvents }
     *     
     */
    public FinancingEvents getFinancingEvents() {
        return financingEvents;
    }

    /**
     * Sets the value of the financingEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingEvents }
     *     
     */
    public void setFinancingEvents(FinancingEvents value) {
        this.financingEvents = value;
    }

    /**
     * Gets the value of the significantEvents property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantEvents }
     *     
     */
    public SignificantEvents getSignificantEvents() {
        return significantEvents;
    }

    /**
     * Sets the value of the significantEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantEvents }
     *     
     */
    public void setSignificantEvents(SignificantEvents value) {
        this.significantEvents = value;
    }

    /**
     * Gets the value of the operationalSpecialEventsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationalSpecialEventsIndicator() {
        return operationalSpecialEventsIndicator;
    }

    /**
     * Sets the value of the operationalSpecialEventsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationalSpecialEventsIndicator(Boolean value) {
        this.operationalSpecialEventsIndicator = value;
    }

    /**
     * Gets the value of the financialOrLegalOrSpecialEventsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialOrLegalOrSpecialEventsIndicator() {
        return financialOrLegalOrSpecialEventsIndicator;
    }

    /**
     * Sets the value of the financialOrLegalOrSpecialEventsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialOrLegalOrSpecialEventsIndicator(Boolean value) {
        this.financialOrLegalOrSpecialEventsIndicator = value;
    }

    /**
     * Gets the value of the otherSpecialEventsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherSpecialEventsIndicator() {
        return otherSpecialEventsIndicator;
    }

    /**
     * Sets the value of the otherSpecialEventsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherSpecialEventsIndicator(Boolean value) {
        this.otherSpecialEventsIndicator = value;
    }

    /**
     * Gets the value of the federalGovernmentLoanAssistanceRecipientIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalGovernmentLoanAssistanceRecipientIndicator() {
        return federalGovernmentLoanAssistanceRecipientIndicator;
    }

    /**
     * Sets the value of the federalGovernmentLoanAssistanceRecipientIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalGovernmentLoanAssistanceRecipientIndicator(Boolean value) {
        this.federalGovernmentLoanAssistanceRecipientIndicator = value;
    }

    /**
     * Gets the value of the federalGovernmentAdministrativeDebtIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalGovernmentAdministrativeDebtIndicator() {
        return federalGovernmentAdministrativeDebtIndicator;
    }

    /**
     * Sets the value of the federalGovernmentAdministrativeDebtIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalGovernmentAdministrativeDebtIndicator(Boolean value) {
        this.federalGovernmentAdministrativeDebtIndicator = value;
    }

    /**
     * Gets the value of the federalGovernmentContractRecipientIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalGovernmentContractRecipientIndicator() {
        return federalGovernmentContractRecipientIndicator;
    }

    /**
     * Sets the value of the federalGovernmentContractRecipientIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalGovernmentContractRecipientIndicator(Boolean value) {
        this.federalGovernmentContractRecipientIndicator = value;
    }

    /**
     * Gets the value of the federalGovernmentGrantRecipientIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalGovernmentGrantRecipientIndicator() {
        return federalGovernmentGrantRecipientIndicator;
    }

    /**
     * Sets the value of the federalGovernmentGrantRecipientIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalGovernmentGrantRecipientIndicator(Boolean value) {
        this.federalGovernmentGrantRecipientIndicator = value;
    }

    /**
     * Gets the value of the federalProgramExclusionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalProgramExclusionIndicator() {
        return federalProgramExclusionIndicator;
    }

    /**
     * Sets the value of the federalProgramExclusionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalProgramExclusionIndicator(Boolean value) {
        this.federalProgramExclusionIndicator = value;
    }

    /**
     * Gets the value of the freeFormEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeFormEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeFormEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeFormEvent }
     * 
     * 
     */
    public List<FreeFormEvent> getFreeFormEvent() {
        if (freeFormEvent == null) {
            freeFormEvent = new ArrayList<FreeFormEvent>();
        }
        return this.freeFormEvent;
    }

    /**
     * Gets the value of the severeNegativeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSevereNegativeIndicator() {
        return severeNegativeIndicator;
    }

    /**
     * Sets the value of the severeNegativeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSevereNegativeIndicator(Boolean value) {
        this.severeNegativeIndicator = value;
    }

}
