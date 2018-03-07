
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Contains all the sub-sections and elements belonging to the PublicFilings Data bucket.
 *          
 * 
 * <p>Java class for LegalEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankruptcyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuitsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LiensIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JudgmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancialEmbarrassmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BankruptcyInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}BankruptcyInformation" minOccurs="0"/>
 *         &lt;element name="SuitInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}SuitInformation" minOccurs="0"/>
 *         &lt;element name="LienInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}LienInformation" minOccurs="0"/>
 *         &lt;element name="JudgmentInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}JudgmentInformation" minOccurs="0"/>
 *         &lt;element name="OtherLegalEventInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}OtherLegalEventInformation" minOccurs="0"/>
 *         &lt;element name="DebarmentsInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}DebarmentsInformation" minOccurs="0"/>
 *         &lt;element name="ClaimInformation" type="{http://services.dnb.com/CustomProductServiceV2.0}ClaimInformation" minOccurs="0"/>
 *         &lt;element name="CriminalProceedingsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuitsAndOrJudgmentsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClaimsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MostRecentFinancialEmbarassmentDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="AdditionalSuitLienJudgmentAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsolvencyProcessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuspensionofPaymentsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JudicialActionSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}JudicialActionSummaryType" minOccurs="0"/>
 *         &lt;element name="AdministrativeActionSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}JudicialActionSummaryType" minOccurs="0"/>
 *         &lt;element name="DebtorsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsolvencyProcessinformation" type="{http://services.dnb.com/CustomProductServiceV2.0}InsolvencyProcessinformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEvents", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "bankruptcyIndicator",
    "suitsIndicator",
    "liensIndicator",
    "judgmentIndicator",
    "financialEmbarrassmentIndicator",
    "bankruptcyInformation",
    "suitInformation",
    "lienInformation",
    "judgmentInformation",
    "otherLegalEventInformation",
    "debarmentsInformation",
    "claimInformation",
    "criminalProceedingsIndicator",
    "suitsAndOrJudgmentsIndicator",
    "claimsIndicator",
    "mostRecentFinancialEmbarassmentDate",
    "additionalSuitLienJudgmentAvailabilityIndicator",
    "insolvencyProcessIndicator",
    "suspensionofPaymentsIndicator",
    "textEntry",
    "judicialActionSummary",
    "administrativeActionSummary",
    "debtorsCount",
    "insolvencyProcessinformation"
})
public class LegalEvents {

    @XmlElement(name = "BankruptcyIndicator")
    protected Boolean bankruptcyIndicator;
    @XmlElement(name = "SuitsIndicator")
    protected Boolean suitsIndicator;
    @XmlElement(name = "LiensIndicator")
    protected Boolean liensIndicator;
    @XmlElement(name = "JudgmentIndicator")
    protected Boolean judgmentIndicator;
    @XmlElement(name = "FinancialEmbarrassmentIndicator")
    protected Boolean financialEmbarrassmentIndicator;
    @XmlElement(name = "BankruptcyInformation")
    protected BankruptcyInformation bankruptcyInformation;
    @XmlElement(name = "SuitInformation")
    protected SuitInformation suitInformation;
    @XmlElement(name = "LienInformation")
    protected LienInformation lienInformation;
    @XmlElement(name = "JudgmentInformation")
    protected JudgmentInformation judgmentInformation;
    @XmlElement(name = "OtherLegalEventInformation")
    protected OtherLegalEventInformation otherLegalEventInformation;
    @XmlElement(name = "DebarmentsInformation")
    protected DebarmentsInformation debarmentsInformation;
    @XmlElement(name = "ClaimInformation")
    protected ClaimInformation claimInformation;
    @XmlElement(name = "CriminalProceedingsIndicator")
    protected Boolean criminalProceedingsIndicator;
    @XmlElement(name = "SuitsAndOrJudgmentsIndicator")
    protected Boolean suitsAndOrJudgmentsIndicator;
    @XmlElement(name = "ClaimsIndicator")
    protected Boolean claimsIndicator;
    @XmlElement(name = "MostRecentFinancialEmbarassmentDate")
    protected DNBDateType mostRecentFinancialEmbarassmentDate;
    @XmlElement(name = "AdditionalSuitLienJudgmentAvailabilityIndicator")
    protected Boolean additionalSuitLienJudgmentAvailabilityIndicator;
    @XmlElement(name = "InsolvencyProcessIndicator")
    protected Boolean insolvencyProcessIndicator;
    @XmlElement(name = "SuspensionofPaymentsIndicator")
    protected Boolean suspensionofPaymentsIndicator;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "JudicialActionSummary")
    protected JudicialActionSummaryType judicialActionSummary;
    @XmlElement(name = "AdministrativeActionSummary")
    protected JudicialActionSummaryType administrativeActionSummary;
    @XmlElement(name = "DebtorsCount")
    protected Integer debtorsCount;
    @XmlElement(name = "InsolvencyProcessinformation")
    protected InsolvencyProcessinformation insolvencyProcessinformation;

    /**
     * Gets the value of the bankruptcyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankruptcyIndicator() {
        return bankruptcyIndicator;
    }

    /**
     * Sets the value of the bankruptcyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankruptcyIndicator(Boolean value) {
        this.bankruptcyIndicator = value;
    }

    /**
     * Gets the value of the suitsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitsIndicator() {
        return suitsIndicator;
    }

    /**
     * Sets the value of the suitsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitsIndicator(Boolean value) {
        this.suitsIndicator = value;
    }

    /**
     * Gets the value of the liensIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLiensIndicator() {
        return liensIndicator;
    }

    /**
     * Sets the value of the liensIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiensIndicator(Boolean value) {
        this.liensIndicator = value;
    }

    /**
     * Gets the value of the judgmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJudgmentIndicator() {
        return judgmentIndicator;
    }

    /**
     * Sets the value of the judgmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJudgmentIndicator(Boolean value) {
        this.judgmentIndicator = value;
    }

    /**
     * Gets the value of the financialEmbarrassmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialEmbarrassmentIndicator() {
        return financialEmbarrassmentIndicator;
    }

    /**
     * Sets the value of the financialEmbarrassmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialEmbarrassmentIndicator(Boolean value) {
        this.financialEmbarrassmentIndicator = value;
    }

    /**
     * Gets the value of the bankruptcyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BankruptcyInformation }
     *     
     */
    public BankruptcyInformation getBankruptcyInformation() {
        return bankruptcyInformation;
    }

    /**
     * Sets the value of the bankruptcyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankruptcyInformation }
     *     
     */
    public void setBankruptcyInformation(BankruptcyInformation value) {
        this.bankruptcyInformation = value;
    }

    /**
     * Gets the value of the suitInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SuitInformation }
     *     
     */
    public SuitInformation getSuitInformation() {
        return suitInformation;
    }

    /**
     * Sets the value of the suitInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitInformation }
     *     
     */
    public void setSuitInformation(SuitInformation value) {
        this.suitInformation = value;
    }

    /**
     * Gets the value of the lienInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LienInformation }
     *     
     */
    public LienInformation getLienInformation() {
        return lienInformation;
    }

    /**
     * Sets the value of the lienInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienInformation }
     *     
     */
    public void setLienInformation(LienInformation value) {
        this.lienInformation = value;
    }

    /**
     * Gets the value of the judgmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentInformation }
     *     
     */
    public JudgmentInformation getJudgmentInformation() {
        return judgmentInformation;
    }

    /**
     * Sets the value of the judgmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentInformation }
     *     
     */
    public void setJudgmentInformation(JudgmentInformation value) {
        this.judgmentInformation = value;
    }

    /**
     * Gets the value of the otherLegalEventInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherLegalEventInformation }
     *     
     */
    public OtherLegalEventInformation getOtherLegalEventInformation() {
        return otherLegalEventInformation;
    }

    /**
     * Sets the value of the otherLegalEventInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLegalEventInformation }
     *     
     */
    public void setOtherLegalEventInformation(OtherLegalEventInformation value) {
        this.otherLegalEventInformation = value;
    }

    /**
     * Gets the value of the debarmentsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DebarmentsInformation }
     *     
     */
    public DebarmentsInformation getDebarmentsInformation() {
        return debarmentsInformation;
    }

    /**
     * Sets the value of the debarmentsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebarmentsInformation }
     *     
     */
    public void setDebarmentsInformation(DebarmentsInformation value) {
        this.debarmentsInformation = value;
    }

    /**
     * Gets the value of the claimInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInformation }
     *     
     */
    public ClaimInformation getClaimInformation() {
        return claimInformation;
    }

    /**
     * Sets the value of the claimInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInformation }
     *     
     */
    public void setClaimInformation(ClaimInformation value) {
        this.claimInformation = value;
    }

    /**
     * Gets the value of the criminalProceedingsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCriminalProceedingsIndicator() {
        return criminalProceedingsIndicator;
    }

    /**
     * Sets the value of the criminalProceedingsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCriminalProceedingsIndicator(Boolean value) {
        this.criminalProceedingsIndicator = value;
    }

    /**
     * Gets the value of the suitsAndOrJudgmentsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitsAndOrJudgmentsIndicator() {
        return suitsAndOrJudgmentsIndicator;
    }

    /**
     * Sets the value of the suitsAndOrJudgmentsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitsAndOrJudgmentsIndicator(Boolean value) {
        this.suitsAndOrJudgmentsIndicator = value;
    }

    /**
     * Gets the value of the claimsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimsIndicator() {
        return claimsIndicator;
    }

    /**
     * Sets the value of the claimsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimsIndicator(Boolean value) {
        this.claimsIndicator = value;
    }

    /**
     * Gets the value of the mostRecentFinancialEmbarassmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getMostRecentFinancialEmbarassmentDate() {
        return mostRecentFinancialEmbarassmentDate;
    }

    /**
     * Sets the value of the mostRecentFinancialEmbarassmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setMostRecentFinancialEmbarassmentDate(DNBDateType value) {
        this.mostRecentFinancialEmbarassmentDate = value;
    }

    /**
     * Gets the value of the additionalSuitLienJudgmentAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalSuitLienJudgmentAvailabilityIndicator() {
        return additionalSuitLienJudgmentAvailabilityIndicator;
    }

    /**
     * Sets the value of the additionalSuitLienJudgmentAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalSuitLienJudgmentAvailabilityIndicator(Boolean value) {
        this.additionalSuitLienJudgmentAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the insolvencyProcessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsolvencyProcessIndicator() {
        return insolvencyProcessIndicator;
    }

    /**
     * Sets the value of the insolvencyProcessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsolvencyProcessIndicator(Boolean value) {
        this.insolvencyProcessIndicator = value;
    }

    /**
     * Gets the value of the suspensionofPaymentsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspensionofPaymentsIndicator() {
        return suspensionofPaymentsIndicator;
    }

    /**
     * Sets the value of the suspensionofPaymentsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspensionofPaymentsIndicator(Boolean value) {
        this.suspensionofPaymentsIndicator = value;
    }

    /**
     * Gets the value of the textEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getTextEntry() {
        if (textEntry == null) {
            textEntry = new ArrayList<TextEntryType>();
        }
        return this.textEntry;
    }

    /**
     * Gets the value of the judicialActionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialActionSummaryType }
     *     
     */
    public JudicialActionSummaryType getJudicialActionSummary() {
        return judicialActionSummary;
    }

    /**
     * Sets the value of the judicialActionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialActionSummaryType }
     *     
     */
    public void setJudicialActionSummary(JudicialActionSummaryType value) {
        this.judicialActionSummary = value;
    }

    /**
     * Gets the value of the administrativeActionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialActionSummaryType }
     *     
     */
    public JudicialActionSummaryType getAdministrativeActionSummary() {
        return administrativeActionSummary;
    }

    /**
     * Sets the value of the administrativeActionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialActionSummaryType }
     *     
     */
    public void setAdministrativeActionSummary(JudicialActionSummaryType value) {
        this.administrativeActionSummary = value;
    }

    /**
     * Gets the value of the debtorsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebtorsCount() {
        return debtorsCount;
    }

    /**
     * Sets the value of the debtorsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebtorsCount(Integer value) {
        this.debtorsCount = value;
    }

    /**
     * Gets the value of the insolvencyProcessinformation property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyProcessinformation }
     *     
     */
    public InsolvencyProcessinformation getInsolvencyProcessinformation() {
        return insolvencyProcessinformation;
    }

    /**
     * Sets the value of the insolvencyProcessinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyProcessinformation }
     *     
     */
    public void setInsolvencyProcessinformation(InsolvencyProcessinformation value) {
        this.insolvencyProcessinformation = value;
    }

}
