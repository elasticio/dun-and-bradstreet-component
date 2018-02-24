
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNameInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationSearchName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingLocation" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNameFilingLocation" minOccurs="0"/>
 *         &lt;element name="HashedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrganizationExtendedSearchName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryExtendedSearchName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FilingDetail" type="{http://services.dnb.com/CompanyServiceV2.0}RequestedPublicFilingDetail" maxOccurs="25"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNameInquiryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "organizationSearchName",
    "filingLocation",
    "hashedName",
    "organizationExtendedSearchName",
    "territoryExtendedSearchName",
    "filingDetail"
})
public class SearchByFilingNameInquiryDetail {

    @XmlElement(name = "OrganizationSearchName", required = true)
    protected String organizationSearchName;
    @XmlElement(name = "FilingLocation")
    protected SearchByFilingNameFilingLocation filingLocation;
    @XmlElement(name = "HashedName")
    protected String hashedName;
    @XmlElement(name = "OrganizationExtendedSearchName")
    protected String organizationExtendedSearchName;
    @XmlElement(name = "TerritoryExtendedSearchName")
    protected String territoryExtendedSearchName;
    @XmlElement(name = "FilingDetail", required = true)
    protected List<RequestedPublicFilingDetail> filingDetail;

    /**
     * Gets the value of the organizationSearchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationSearchName() {
        return organizationSearchName;
    }

    /**
     * Sets the value of the organizationSearchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationSearchName(String value) {
        this.organizationSearchName = value;
    }

    /**
     * Gets the value of the filingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNameFilingLocation }
     *     
     */
    public SearchByFilingNameFilingLocation getFilingLocation() {
        return filingLocation;
    }

    /**
     * Sets the value of the filingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNameFilingLocation }
     *     
     */
    public void setFilingLocation(SearchByFilingNameFilingLocation value) {
        this.filingLocation = value;
    }

    /**
     * Gets the value of the hashedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedName() {
        return hashedName;
    }

    /**
     * Sets the value of the hashedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedName(String value) {
        this.hashedName = value;
    }

    /**
     * Gets the value of the organizationExtendedSearchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationExtendedSearchName() {
        return organizationExtendedSearchName;
    }

    /**
     * Sets the value of the organizationExtendedSearchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationExtendedSearchName(String value) {
        this.organizationExtendedSearchName = value;
    }

    /**
     * Gets the value of the territoryExtendedSearchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryExtendedSearchName() {
        return territoryExtendedSearchName;
    }

    /**
     * Sets the value of the territoryExtendedSearchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryExtendedSearchName(String value) {
        this.territoryExtendedSearchName = value;
    }

    /**
     * Gets the value of the filingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedPublicFilingDetail }
     * 
     * 
     */
    public List<RequestedPublicFilingDetail> getFilingDetail() {
        if (filingDetail == null) {
            filingDetail = new ArrayList<RequestedPublicFilingDetail>();
        }
        return this.filingDetail;
    }

}
