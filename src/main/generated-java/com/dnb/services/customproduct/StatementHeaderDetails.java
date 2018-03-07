
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatementHeaderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementHeaderDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}StatementHeaderType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryMethodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NonSpecificInformationSourceText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NotAuditedReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="InformationSourceIndividualName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InformationSourcePositionTitleText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinancialStatementFromDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="UnitOfSizeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AuditQualificationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InformationScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ReliabilityText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FinancialPeriodDuration" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ReceivedTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="AuditUnknownIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancialSummaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncompleteIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimePeriodText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ComparativeStatementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InformationBreadthDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementHeaderDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "deliveryMethodText",
    "nonSpecificInformationSourceText",
    "notAuditedReasonText",
    "informationSourceIndividualName",
    "informationSourcePositionTitleText",
    "financialStatementFromDate",
    "unitOfSizeText",
    "auditQualificationIndicator",
    "informationScopeText",
    "reliabilityText",
    "financialPeriodDuration",
    "dataProviderName",
    "receivedTimestamp",
    "auditUnknownIndicator",
    "financialSummaryIndicator",
    "incompleteIndicator",
    "timePeriodText",
    "comparativeStatementIndicator",
    "informationBreadthDescription"
})
public class StatementHeaderDetails
    extends StatementHeaderType
{

    @XmlElement(name = "DeliveryMethodText")
    protected DNBDecodedStringType deliveryMethodText;
    @XmlElement(name = "NonSpecificInformationSourceText")
    protected DNBDecodedStringType nonSpecificInformationSourceText;
    @XmlElement(name = "NotAuditedReasonText")
    protected DNBDecodedStringType notAuditedReasonText;
    @XmlElement(name = "InformationSourceIndividualName")
    protected List<IndividualNameType> informationSourceIndividualName;
    @XmlElement(name = "InformationSourcePositionTitleText")
    protected String informationSourcePositionTitleText;
    @XmlElement(name = "FinancialStatementFromDate")
    protected DNBDateType financialStatementFromDate;
    @XmlElement(name = "UnitOfSizeText")
    protected DNBDecodedStringType unitOfSizeText;
    @XmlElement(name = "AuditQualificationIndicator")
    protected Boolean auditQualificationIndicator;
    @XmlElement(name = "InformationScopeText")
    protected DNBDecodedStringType informationScopeText;
    @XmlElement(name = "ReliabilityText")
    protected DNBDecodedStringType reliabilityText;
    @XmlElement(name = "FinancialPeriodDuration")
    protected Duration financialPeriodDuration;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "ReceivedTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedTimestamp;
    @XmlElement(name = "AuditUnknownIndicator")
    protected Boolean auditUnknownIndicator;
    @XmlElement(name = "FinancialSummaryIndicator")
    protected Boolean financialSummaryIndicator;
    @XmlElement(name = "IncompleteIndicator")
    protected Boolean incompleteIndicator;
    @XmlElement(name = "TimePeriodText")
    protected DNBDecodedStringType timePeriodText;
    @XmlElement(name = "ComparativeStatementIndicator")
    protected Boolean comparativeStatementIndicator;
    @XmlElement(name = "InformationBreadthDescription")
    protected DNBDecodedStringNewType informationBreadthDescription;

    /**
     * Gets the value of the deliveryMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDeliveryMethodText() {
        return deliveryMethodText;
    }

    /**
     * Sets the value of the deliveryMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDeliveryMethodText(DNBDecodedStringType value) {
        this.deliveryMethodText = value;
    }

    /**
     * Gets the value of the nonSpecificInformationSourceText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNonSpecificInformationSourceText() {
        return nonSpecificInformationSourceText;
    }

    /**
     * Sets the value of the nonSpecificInformationSourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNonSpecificInformationSourceText(DNBDecodedStringType value) {
        this.nonSpecificInformationSourceText = value;
    }

    /**
     * Gets the value of the notAuditedReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNotAuditedReasonText() {
        return notAuditedReasonText;
    }

    /**
     * Sets the value of the notAuditedReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNotAuditedReasonText(DNBDecodedStringType value) {
        this.notAuditedReasonText = value;
    }

    /**
     * Gets the value of the informationSourceIndividualName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSourceIndividualName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSourceIndividualName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameType }
     * 
     * 
     */
    public List<IndividualNameType> getInformationSourceIndividualName() {
        if (informationSourceIndividualName == null) {
            informationSourceIndividualName = new ArrayList<IndividualNameType>();
        }
        return this.informationSourceIndividualName;
    }

    /**
     * Gets the value of the informationSourcePositionTitleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationSourcePositionTitleText() {
        return informationSourcePositionTitleText;
    }

    /**
     * Sets the value of the informationSourcePositionTitleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationSourcePositionTitleText(String value) {
        this.informationSourcePositionTitleText = value;
    }

    /**
     * Gets the value of the financialStatementFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFinancialStatementFromDate() {
        return financialStatementFromDate;
    }

    /**
     * Sets the value of the financialStatementFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFinancialStatementFromDate(DNBDateType value) {
        this.financialStatementFromDate = value;
    }

    /**
     * Gets the value of the unitOfSizeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getUnitOfSizeText() {
        return unitOfSizeText;
    }

    /**
     * Sets the value of the unitOfSizeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setUnitOfSizeText(DNBDecodedStringType value) {
        this.unitOfSizeText = value;
    }

    /**
     * Gets the value of the auditQualificationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditQualificationIndicator() {
        return auditQualificationIndicator;
    }

    /**
     * Sets the value of the auditQualificationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditQualificationIndicator(Boolean value) {
        this.auditQualificationIndicator = value;
    }

    /**
     * Gets the value of the informationScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getInformationScopeText() {
        return informationScopeText;
    }

    /**
     * Sets the value of the informationScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setInformationScopeText(DNBDecodedStringType value) {
        this.informationScopeText = value;
    }

    /**
     * Gets the value of the reliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getReliabilityText() {
        return reliabilityText;
    }

    /**
     * Sets the value of the reliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setReliabilityText(DNBDecodedStringType value) {
        this.reliabilityText = value;
    }

    /**
     * Gets the value of the financialPeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFinancialPeriodDuration() {
        return financialPeriodDuration;
    }

    /**
     * Sets the value of the financialPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFinancialPeriodDuration(Duration value) {
        this.financialPeriodDuration = value;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

    /**
     * Gets the value of the receivedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedTimestamp() {
        return receivedTimestamp;
    }

    /**
     * Sets the value of the receivedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedTimestamp(XMLGregorianCalendar value) {
        this.receivedTimestamp = value;
    }

    /**
     * Gets the value of the auditUnknownIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditUnknownIndicator() {
        return auditUnknownIndicator;
    }

    /**
     * Sets the value of the auditUnknownIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditUnknownIndicator(Boolean value) {
        this.auditUnknownIndicator = value;
    }

    /**
     * Gets the value of the financialSummaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialSummaryIndicator() {
        return financialSummaryIndicator;
    }

    /**
     * Sets the value of the financialSummaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialSummaryIndicator(Boolean value) {
        this.financialSummaryIndicator = value;
    }

    /**
     * Gets the value of the incompleteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncompleteIndicator() {
        return incompleteIndicator;
    }

    /**
     * Sets the value of the incompleteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncompleteIndicator(Boolean value) {
        this.incompleteIndicator = value;
    }

    /**
     * Gets the value of the timePeriodText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getTimePeriodText() {
        return timePeriodText;
    }

    /**
     * Sets the value of the timePeriodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setTimePeriodText(DNBDecodedStringType value) {
        this.timePeriodText = value;
    }

    /**
     * Gets the value of the comparativeStatementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComparativeStatementIndicator() {
        return comparativeStatementIndicator;
    }

    /**
     * Sets the value of the comparativeStatementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComparativeStatementIndicator(Boolean value) {
        this.comparativeStatementIndicator = value;
    }

    /**
     * Gets the value of the informationBreadthDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getInformationBreadthDescription() {
        return informationBreadthDescription;
    }

    /**
     * Sets the value of the informationBreadthDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setInformationBreadthDescription(DNBDecodedStringNewType value) {
        this.informationBreadthDescription = value;
    }

}
