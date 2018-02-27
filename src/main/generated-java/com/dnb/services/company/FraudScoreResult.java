
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudScoreResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudScoreResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FraudRiskScore" type="{http://services.dnb.com/CompanyServiceV2.0}FraudRiskScore" minOccurs="0"/>
 *         &lt;element name="SearchHistoryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchHistoryDetail" minOccurs="0"/>
 *         &lt;element name="OrganizationMisrepresentationDetail" type="{http://services.dnb.com/CompanyServiceV2.0}OrganizationMisrepresentationDetail" minOccurs="0"/>
 *         &lt;element name="StandardizedAddressDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreStandardizedAddressDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudScoreResult", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "fraudRiskScore",
    "searchHistoryDetail",
    "organizationMisrepresentationDetail",
    "standardizedAddressDetail"
})
public class FraudScoreResult {

    @XmlElement(name = "FraudRiskScore")
    protected FraudRiskScore fraudRiskScore;
    @XmlElement(name = "SearchHistoryDetail")
    protected SearchHistoryDetail searchHistoryDetail;
    @XmlElement(name = "OrganizationMisrepresentationDetail")
    protected OrganizationMisrepresentationDetail organizationMisrepresentationDetail;
    @XmlElement(name = "StandardizedAddressDetail")
    protected GetFraudScoreStandardizedAddressDetail standardizedAddressDetail;

    /**
     * Gets the value of the fraudRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link FraudRiskScore }
     *     
     */
    public FraudRiskScore getFraudRiskScore() {
        return fraudRiskScore;
    }

    /**
     * Sets the value of the fraudRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudRiskScore }
     *     
     */
    public void setFraudRiskScore(FraudRiskScore value) {
        this.fraudRiskScore = value;
    }

    /**
     * Gets the value of the searchHistoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchHistoryDetail }
     *     
     */
    public SearchHistoryDetail getSearchHistoryDetail() {
        return searchHistoryDetail;
    }

    /**
     * Sets the value of the searchHistoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchHistoryDetail }
     *     
     */
    public void setSearchHistoryDetail(SearchHistoryDetail value) {
        this.searchHistoryDetail = value;
    }

    /**
     * Gets the value of the organizationMisrepresentationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationMisrepresentationDetail }
     *     
     */
    public OrganizationMisrepresentationDetail getOrganizationMisrepresentationDetail() {
        return organizationMisrepresentationDetail;
    }

    /**
     * Sets the value of the organizationMisrepresentationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationMisrepresentationDetail }
     *     
     */
    public void setOrganizationMisrepresentationDetail(OrganizationMisrepresentationDetail value) {
        this.organizationMisrepresentationDetail = value;
    }

    /**
     * Gets the value of the standardizedAddressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetFraudScoreStandardizedAddressDetail }
     *     
     */
    public GetFraudScoreStandardizedAddressDetail getStandardizedAddressDetail() {
        return standardizedAddressDetail;
    }

    /**
     * Sets the value of the standardizedAddressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFraudScoreStandardizedAddressDetail }
     *     
     */
    public void setStandardizedAddressDetail(GetFraudScoreStandardizedAddressDetail value) {
        this.standardizedAddressDetail = value;
    }

}
