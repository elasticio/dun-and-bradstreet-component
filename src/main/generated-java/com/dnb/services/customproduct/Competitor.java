
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to record information on a competing organization.
 *          
 * 
 * <p>Java class for Competitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Competitor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesRevenueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndividualEmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IssuedShareCapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
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
@XmlType(name = "Competitor", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationPrimaryName",
    "salesRevenueAmount",
    "individualEmployeeQuantity",
    "issuedShareCapitalAmount",
    "topCompetitorIndicator"
})
public class Competitor {

    @XmlElement(name = "OrganizationPrimaryName")
    protected List<OrganizationPrimaryNameType> organizationPrimaryName;
    @XmlElement(name = "SalesRevenueAmount")
    protected List<AmountType> salesRevenueAmount;
    @XmlElement(name = "IndividualEmployeeQuantity")
    protected Long individualEmployeeQuantity;
    @XmlElement(name = "IssuedShareCapitalAmount")
    protected AmountType issuedShareCapitalAmount;
    @XmlElement(name = "TopCompetitorIndicator")
    protected Boolean topCompetitorIndicator;

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationPrimaryNameType }
     * 
     * 
     */
    public List<OrganizationPrimaryNameType> getOrganizationPrimaryName() {
        if (organizationPrimaryName == null) {
            organizationPrimaryName = new ArrayList<OrganizationPrimaryNameType>();
        }
        return this.organizationPrimaryName;
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
     * Gets the value of the individualEmployeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndividualEmployeeQuantity() {
        return individualEmployeeQuantity;
    }

    /**
     * Sets the value of the individualEmployeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndividualEmployeeQuantity(Long value) {
        this.individualEmployeeQuantity = value;
    }

    /**
     * Gets the value of the issuedShareCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIssuedShareCapitalAmount() {
        return issuedShareCapitalAmount;
    }

    /**
     * Sets the value of the issuedShareCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIssuedShareCapitalAmount(AmountType value) {
        this.issuedShareCapitalAmount = value;
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
