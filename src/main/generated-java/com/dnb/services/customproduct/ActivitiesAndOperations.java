
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the description of operations continued by a business including market information such as the number of customers, agency details and import/export details.
 *          
 * 
 * <p>Java class for ActivitiesAndOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitiesAndOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccountSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}CustomerAccountSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerMarketDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CustomerMarketDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FranchiseOperationTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SeasonalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PeakPeriodDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}PeakPeriodDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}LineOfBusinessDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImportDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ImportDetailsType" minOccurs="0"/>
 *         &lt;element name="ExportDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ExportDetailsType" minOccurs="0"/>
 *         &lt;element name="DomesticMarketTerritoryDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}DomesticMarketTerritoryDetailsType" minOccurs="0"/>
 *         &lt;element name="CustomerDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CustomerDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectIsAgentDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectIsAgentDetailsType" minOccurs="0"/>
 *         &lt;element name="ContractsSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}ContractsSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectUsesAgentDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectUsesAgentDetailsType" minOccurs="0"/>
 *         &lt;element name="TradingTermsDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}TradingTermsDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancingDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartTimeOperationsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimarySICCategoryValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OtherActivitiesDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}OtherActivitiesType" minOccurs="0"/>
 *         &lt;element name="OperationsText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationHistoryText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManufacturingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessHistory" type="{http://services.dnb.com/CustomProductServiceV2.0}BusinessHistoryType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitiesAndOperations", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "customerAccountSummary",
    "customerMarketDetails",
    "franchiseOperationTypeText",
    "seasonalIndicator",
    "peakPeriodDetails",
    "lineOfBusinessDetails",
    "importDetails",
    "exportDetails",
    "domesticMarketTerritoryDetails",
    "customerDetails",
    "subjectIsAgentDetails",
    "contractsSummary",
    "subjectUsesAgentDetails",
    "tradingTermsDetails",
    "financingDetails",
    "partTimeOperationsIndicator",
    "primarySICCategoryValue",
    "otherActivitiesDetails",
    "operationsText",
    "organizationHistoryText",
    "manufacturingIndicator",
    "textEntry",
    "businessHistory",
    "lastUpdateDate"
})
public class ActivitiesAndOperations {

    @XmlElement(name = "CustomerAccountSummary")
    protected List<CustomerAccountSummary> customerAccountSummary;
    @XmlElement(name = "CustomerMarketDetails")
    protected List<CustomerMarketDetails> customerMarketDetails;
    @XmlElement(name = "FranchiseOperationTypeText")
    protected DNBDecodedStringType franchiseOperationTypeText;
    @XmlElement(name = "SeasonalIndicator")
    protected Boolean seasonalIndicator;
    @XmlElement(name = "PeakPeriodDetails")
    protected List<PeakPeriodDetailsType> peakPeriodDetails;
    @XmlElement(name = "LineOfBusinessDetails")
    protected List<LineOfBusinessDetailsType> lineOfBusinessDetails;
    @XmlElement(name = "ImportDetails")
    protected ImportDetailsType importDetails;
    @XmlElement(name = "ExportDetails")
    protected ExportDetailsType exportDetails;
    @XmlElement(name = "DomesticMarketTerritoryDetails")
    protected DomesticMarketTerritoryDetailsType domesticMarketTerritoryDetails;
    @XmlElement(name = "CustomerDetails")
    protected List<CustomerDetailsType> customerDetails;
    @XmlElement(name = "SubjectIsAgentDetails")
    protected SubjectIsAgentDetailsType subjectIsAgentDetails;
    @XmlElement(name = "ContractsSummary")
    protected List<ContractsSummary> contractsSummary;
    @XmlElement(name = "SubjectUsesAgentDetails")
    protected SubjectUsesAgentDetailsType subjectUsesAgentDetails;
    @XmlElement(name = "TradingTermsDetails")
    protected List<TradingTermsDetailsType> tradingTermsDetails;
    @XmlElement(name = "FinancingDetails")
    protected List<FinancingDetails> financingDetails;
    @XmlElement(name = "PartTimeOperationsIndicator")
    protected Boolean partTimeOperationsIndicator;
    @XmlElement(name = "PrimarySICCategoryValue")
    protected String primarySICCategoryValue;
    @XmlElement(name = "OtherActivitiesDetails")
    protected OtherActivitiesType otherActivitiesDetails;
    @XmlElement(name = "OperationsText")
    protected List<String> operationsText;
    @XmlElement(name = "OrganizationHistoryText")
    protected List<String> organizationHistoryText;
    @XmlElement(name = "ManufacturingIndicator")
    protected Boolean manufacturingIndicator;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "BusinessHistory")
    protected BusinessHistoryType businessHistory;
    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;

    /**
     * Gets the value of the customerAccountSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccountSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccountSummary }
     * 
     * 
     */
    public List<CustomerAccountSummary> getCustomerAccountSummary() {
        if (customerAccountSummary == null) {
            customerAccountSummary = new ArrayList<CustomerAccountSummary>();
        }
        return this.customerAccountSummary;
    }

    /**
     * Gets the value of the customerMarketDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerMarketDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerMarketDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMarketDetails }
     * 
     * 
     */
    public List<CustomerMarketDetails> getCustomerMarketDetails() {
        if (customerMarketDetails == null) {
            customerMarketDetails = new ArrayList<CustomerMarketDetails>();
        }
        return this.customerMarketDetails;
    }

    /**
     * Gets the value of the franchiseOperationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFranchiseOperationTypeText() {
        return franchiseOperationTypeText;
    }

    /**
     * Sets the value of the franchiseOperationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFranchiseOperationTypeText(DNBDecodedStringType value) {
        this.franchiseOperationTypeText = value;
    }

    /**
     * Gets the value of the seasonalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeasonalIndicator() {
        return seasonalIndicator;
    }

    /**
     * Sets the value of the seasonalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeasonalIndicator(Boolean value) {
        this.seasonalIndicator = value;
    }

    /**
     * Gets the value of the peakPeriodDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peakPeriodDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeakPeriodDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeakPeriodDetailsType }
     * 
     * 
     */
    public List<PeakPeriodDetailsType> getPeakPeriodDetails() {
        if (peakPeriodDetails == null) {
            peakPeriodDetails = new ArrayList<PeakPeriodDetailsType>();
        }
        return this.peakPeriodDetails;
    }

    /**
     * Gets the value of the lineOfBusinessDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOfBusinessDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOfBusinessDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusinessDetailsType }
     * 
     * 
     */
    public List<LineOfBusinessDetailsType> getLineOfBusinessDetails() {
        if (lineOfBusinessDetails == null) {
            lineOfBusinessDetails = new ArrayList<LineOfBusinessDetailsType>();
        }
        return this.lineOfBusinessDetails;
    }

    /**
     * Gets the value of the importDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDetailsType }
     *     
     */
    public ImportDetailsType getImportDetails() {
        return importDetails;
    }

    /**
     * Sets the value of the importDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDetailsType }
     *     
     */
    public void setImportDetails(ImportDetailsType value) {
        this.importDetails = value;
    }

    /**
     * Gets the value of the exportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDetailsType }
     *     
     */
    public ExportDetailsType getExportDetails() {
        return exportDetails;
    }

    /**
     * Sets the value of the exportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDetailsType }
     *     
     */
    public void setExportDetails(ExportDetailsType value) {
        this.exportDetails = value;
    }

    /**
     * Gets the value of the domesticMarketTerritoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticMarketTerritoryDetailsType }
     *     
     */
    public DomesticMarketTerritoryDetailsType getDomesticMarketTerritoryDetails() {
        return domesticMarketTerritoryDetails;
    }

    /**
     * Sets the value of the domesticMarketTerritoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticMarketTerritoryDetailsType }
     *     
     */
    public void setDomesticMarketTerritoryDetails(DomesticMarketTerritoryDetailsType value) {
        this.domesticMarketTerritoryDetails = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDetailsType }
     * 
     * 
     */
    public List<CustomerDetailsType> getCustomerDetails() {
        if (customerDetails == null) {
            customerDetails = new ArrayList<CustomerDetailsType>();
        }
        return this.customerDetails;
    }

    /**
     * Gets the value of the subjectIsAgentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectIsAgentDetailsType }
     *     
     */
    public SubjectIsAgentDetailsType getSubjectIsAgentDetails() {
        return subjectIsAgentDetails;
    }

    /**
     * Sets the value of the subjectIsAgentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectIsAgentDetailsType }
     *     
     */
    public void setSubjectIsAgentDetails(SubjectIsAgentDetailsType value) {
        this.subjectIsAgentDetails = value;
    }

    /**
     * Gets the value of the contractsSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractsSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractsSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractsSummary }
     * 
     * 
     */
    public List<ContractsSummary> getContractsSummary() {
        if (contractsSummary == null) {
            contractsSummary = new ArrayList<ContractsSummary>();
        }
        return this.contractsSummary;
    }

    /**
     * Gets the value of the subjectUsesAgentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectUsesAgentDetailsType }
     *     
     */
    public SubjectUsesAgentDetailsType getSubjectUsesAgentDetails() {
        return subjectUsesAgentDetails;
    }

    /**
     * Sets the value of the subjectUsesAgentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectUsesAgentDetailsType }
     *     
     */
    public void setSubjectUsesAgentDetails(SubjectUsesAgentDetailsType value) {
        this.subjectUsesAgentDetails = value;
    }

    /**
     * Gets the value of the tradingTermsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingTermsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingTermsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingTermsDetailsType }
     * 
     * 
     */
    public List<TradingTermsDetailsType> getTradingTermsDetails() {
        if (tradingTermsDetails == null) {
            tradingTermsDetails = new ArrayList<TradingTermsDetailsType>();
        }
        return this.tradingTermsDetails;
    }

    /**
     * Gets the value of the financingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingDetails }
     * 
     * 
     */
    public List<FinancingDetails> getFinancingDetails() {
        if (financingDetails == null) {
            financingDetails = new ArrayList<FinancingDetails>();
        }
        return this.financingDetails;
    }

    /**
     * Gets the value of the partTimeOperationsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTimeOperationsIndicator() {
        return partTimeOperationsIndicator;
    }

    /**
     * Sets the value of the partTimeOperationsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTimeOperationsIndicator(Boolean value) {
        this.partTimeOperationsIndicator = value;
    }

    /**
     * Gets the value of the primarySICCategoryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySICCategoryValue() {
        return primarySICCategoryValue;
    }

    /**
     * Sets the value of the primarySICCategoryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySICCategoryValue(String value) {
        this.primarySICCategoryValue = value;
    }

    /**
     * Gets the value of the otherActivitiesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OtherActivitiesType }
     *     
     */
    public OtherActivitiesType getOtherActivitiesDetails() {
        return otherActivitiesDetails;
    }

    /**
     * Sets the value of the otherActivitiesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherActivitiesType }
     *     
     */
    public void setOtherActivitiesDetails(OtherActivitiesType value) {
        this.otherActivitiesDetails = value;
    }

    /**
     * Gets the value of the operationsText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationsText() {
        if (operationsText == null) {
            operationsText = new ArrayList<String>();
        }
        return this.operationsText;
    }

    /**
     * Gets the value of the organizationHistoryText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationHistoryText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationHistoryText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganizationHistoryText() {
        if (organizationHistoryText == null) {
            organizationHistoryText = new ArrayList<String>();
        }
        return this.organizationHistoryText;
    }

    /**
     * Gets the value of the manufacturingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManufacturingIndicator() {
        return manufacturingIndicator;
    }

    /**
     * Sets the value of the manufacturingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManufacturingIndicator(Boolean value) {
        this.manufacturingIndicator = value;
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
     * Gets the value of the businessHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessHistoryType }
     *     
     */
    public BusinessHistoryType getBusinessHistory() {
        return businessHistory;
    }

    /**
     * Sets the value of the businessHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessHistoryType }
     *     
     */
    public void setBusinessHistory(BusinessHistoryType value) {
        this.businessHistory = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLastUpdateDate(DNBDateType value) {
        this.lastUpdateDate = value;
    }

}
