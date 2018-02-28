
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyDocumentProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDocumentProductSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradeUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentDetails" type="{http://services.dnb.com/ReportProductServiceV2.0}DocumentDetails" minOccurs="0"/>
 *         &lt;element name="DocumentFilingHistoryRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "CompanyDocumentProductSpecification", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "tradeUpIndicator",
    "documentDetails",
    "documentFilingHistoryRequiredIndicator",
    "includeAttachmentIndicator"
})
public class CompanyDocumentProductSpecification {

    @XmlElement(name = "TradeUpIndicator")
    protected Boolean tradeUpIndicator;
    @XmlElement(name = "DocumentDetails")
    protected DocumentDetails documentDetails;
    @XmlElement(name = "DocumentFilingHistoryRequiredIndicator")
    protected Boolean documentFilingHistoryRequiredIndicator;
    @XmlElement(name = "IncludeAttachmentIndicator")
    protected Boolean includeAttachmentIndicator;

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
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetails }
     *     
     */
    public DocumentDetails getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetails }
     *     
     */
    public void setDocumentDetails(DocumentDetails value) {
        this.documentDetails = value;
    }

    /**
     * Gets the value of the documentFilingHistoryRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentFilingHistoryRequiredIndicator() {
        return documentFilingHistoryRequiredIndicator;
    }

    /**
     * Sets the value of the documentFilingHistoryRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentFilingHistoryRequiredIndicator(Boolean value) {
        this.documentFilingHistoryRequiredIndicator = value;
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
