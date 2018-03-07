
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records D&B's proprietary analytics information that classifies the organization based on Financial data, Trade Payments, Organization Size and Years in Business.
 *          
 * 
 * <p>Java class for OrganizationProfileDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationProfileDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationProfileRating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinancialDataAvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TradeDataAvailabilityDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}TradeDataAvailabilityDetail" minOccurs="0"/>
 *         &lt;element name="OrganizationSizeDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationSizeDetail" minOccurs="0"/>
 *         &lt;element name="YearsInBusinessDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}YearsInBusinessDetail" minOccurs="0"/>
 *         &lt;element name="AssessmentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationProfileDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationProfileRating",
    "financialDataAvailableIndicator",
    "tradeDataAvailabilityDetail",
    "organizationSizeDetail",
    "yearsInBusinessDetail",
    "assessmentText"
})
public class OrganizationProfileDetailType {

    @XmlElement(name = "OrganizationProfileRating", required = true)
    protected String organizationProfileRating;
    @XmlElement(name = "FinancialDataAvailableIndicator")
    protected Boolean financialDataAvailableIndicator;
    @XmlElement(name = "TradeDataAvailabilityDetail")
    protected TradeDataAvailabilityDetail tradeDataAvailabilityDetail;
    @XmlElement(name = "OrganizationSizeDetail")
    protected OrganizationSizeDetail organizationSizeDetail;
    @XmlElement(name = "YearsInBusinessDetail")
    protected YearsInBusinessDetail yearsInBusinessDetail;
    @XmlElement(name = "AssessmentText")
    protected String assessmentText;

    /**
     * Gets the value of the organizationProfileRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationProfileRating() {
        return organizationProfileRating;
    }

    /**
     * Sets the value of the organizationProfileRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationProfileRating(String value) {
        this.organizationProfileRating = value;
    }

    /**
     * Gets the value of the financialDataAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialDataAvailableIndicator() {
        return financialDataAvailableIndicator;
    }

    /**
     * Sets the value of the financialDataAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialDataAvailableIndicator(Boolean value) {
        this.financialDataAvailableIndicator = value;
    }

    /**
     * Gets the value of the tradeDataAvailabilityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataAvailabilityDetail }
     *     
     */
    public TradeDataAvailabilityDetail getTradeDataAvailabilityDetail() {
        return tradeDataAvailabilityDetail;
    }

    /**
     * Sets the value of the tradeDataAvailabilityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataAvailabilityDetail }
     *     
     */
    public void setTradeDataAvailabilityDetail(TradeDataAvailabilityDetail value) {
        this.tradeDataAvailabilityDetail = value;
    }

    /**
     * Gets the value of the organizationSizeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSizeDetail }
     *     
     */
    public OrganizationSizeDetail getOrganizationSizeDetail() {
        return organizationSizeDetail;
    }

    /**
     * Sets the value of the organizationSizeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSizeDetail }
     *     
     */
    public void setOrganizationSizeDetail(OrganizationSizeDetail value) {
        this.organizationSizeDetail = value;
    }

    /**
     * Gets the value of the yearsInBusinessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link YearsInBusinessDetail }
     *     
     */
    public YearsInBusinessDetail getYearsInBusinessDetail() {
        return yearsInBusinessDetail;
    }

    /**
     * Sets the value of the yearsInBusinessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearsInBusinessDetail }
     *     
     */
    public void setYearsInBusinessDetail(YearsInBusinessDetail value) {
        this.yearsInBusinessDetail = value;
    }

    /**
     * Gets the value of the assessmentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentText() {
        return assessmentText;
    }

    /**
     * Sets the value of the assessmentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentText(String value) {
        this.assessmentText = value;
    }

}
