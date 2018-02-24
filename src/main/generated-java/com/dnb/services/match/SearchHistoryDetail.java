
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchHistoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchHistoryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SICDivisionSearchHistory" type="{http://services.dnb.com/CompanyServiceV2.0}SICDivisionSearchHistory" minOccurs="0"/>
 *         &lt;element name="DUNSNumberSearchHistory" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberSearchHistory" minOccurs="0"/>
 *         &lt;element name="TelephoneNumberSearchHistory" type="{http://services.dnb.com/CompanyServiceV2.0}TelephoneNumberSearchHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchHistoryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "matchCount",
    "sicDivisionSearchHistory",
    "dunsNumberSearchHistory",
    "telephoneNumberSearchHistory"
})
public class SearchHistoryDetail {

    @XmlElement(name = "MatchCount")
    protected Integer matchCount;
    @XmlElement(name = "SICDivisionSearchHistory")
    protected SICDivisionSearchHistory sicDivisionSearchHistory;
    @XmlElement(name = "DUNSNumberSearchHistory")
    protected DUNSNumberSearchHistory dunsNumberSearchHistory;
    @XmlElement(name = "TelephoneNumberSearchHistory")
    protected TelephoneNumberSearchHistory telephoneNumberSearchHistory;

    /**
     * Gets the value of the matchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchCount(Integer value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the sicDivisionSearchHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SICDivisionSearchHistory }
     *     
     */
    public SICDivisionSearchHistory getSICDivisionSearchHistory() {
        return sicDivisionSearchHistory;
    }

    /**
     * Sets the value of the sicDivisionSearchHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICDivisionSearchHistory }
     *     
     */
    public void setSICDivisionSearchHistory(SICDivisionSearchHistory value) {
        this.sicDivisionSearchHistory = value;
    }

    /**
     * Gets the value of the dunsNumberSearchHistory property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSNumberSearchHistory }
     *     
     */
    public DUNSNumberSearchHistory getDUNSNumberSearchHistory() {
        return dunsNumberSearchHistory;
    }

    /**
     * Sets the value of the dunsNumberSearchHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSNumberSearchHistory }
     *     
     */
    public void setDUNSNumberSearchHistory(DUNSNumberSearchHistory value) {
        this.dunsNumberSearchHistory = value;
    }

    /**
     * Gets the value of the telephoneNumberSearchHistory property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberSearchHistory }
     *     
     */
    public TelephoneNumberSearchHistory getTelephoneNumberSearchHistory() {
        return telephoneNumberSearchHistory;
    }

    /**
     * Sets the value of the telephoneNumberSearchHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberSearchHistory }
     *     
     */
    public void setTelephoneNumberSearchHistory(TelephoneNumberSearchHistory value) {
        this.telephoneNumberSearchHistory = value;
    }

}
