
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records information on the competitor organizations listed in the search response.
 *          
 * 
 * <p>Java class for FindCompetitorResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompetitorResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/EntityListServiceV2.0}OrganizationPrimaryNameType"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/EntityListServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateDUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="ParentDUNSNumber" type="{http://services.dnb.com/EntityListServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SalesRevenueAmount" type="{http://services.dnb.com/EntityListServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TopCompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompetitorResult", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationPrimaryName",
    "primaryAddress",
    "globalUltimateDUNSNumber",
    "parentDUNSNumber",
    "salesRevenueAmount",
    "topCompetitorIndicator"
})
public class FindCompetitorResult {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "OrganizationPrimaryName", required = true)
    protected OrganizationPrimaryNameType organizationPrimaryName;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddressType primaryAddress;
    @XmlElement(name = "GlobalUltimateDUNSNumber")
    protected String globalUltimateDUNSNumber;
    @XmlElement(name = "ParentDUNSNumber")
    protected String parentDUNSNumber;
    @XmlElement(name = "SalesRevenueAmount")
    protected List<AmountType> salesRevenueAmount;
    @XmlElement(name = "TopCompetitorIndicator")
    protected Boolean topCompetitorIndicator;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public OrganizationPrimaryNameType getOrganizationPrimaryName() {
        return organizationPrimaryName;
    }

    /**
     * Sets the value of the organizationPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPrimaryNameType }
     *     
     */
    public void setOrganizationPrimaryName(OrganizationPrimaryNameType value) {
        this.organizationPrimaryName = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setPrimaryAddress(PrimaryAddressType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the globalUltimateDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalUltimateDUNSNumber() {
        return globalUltimateDUNSNumber;
    }

    /**
     * Sets the value of the globalUltimateDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalUltimateDUNSNumber(String value) {
        this.globalUltimateDUNSNumber = value;
    }

    /**
     * Gets the value of the parentDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDUNSNumber() {
        return parentDUNSNumber;
    }

    /**
     * Sets the value of the parentDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDUNSNumber(String value) {
        this.parentDUNSNumber = value;
    }

    /**
     * Gets the value of the salesRevenueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRevenueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRevenueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSalesRevenueAmount() {
        if (salesRevenueAmount == null) {
            salesRevenueAmount = new ArrayList<AmountType>();
        }
        return this.salesRevenueAmount;
    }

    /**
     * Gets the value of the topCompetitorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopCompetitorIndicator() {
        return topCompetitorIndicator;
    }

    /**
     * Sets the value of the topCompetitorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopCompetitorIndicator(Boolean value) {
        this.topCompetitorIndicator = value;
    }

}
