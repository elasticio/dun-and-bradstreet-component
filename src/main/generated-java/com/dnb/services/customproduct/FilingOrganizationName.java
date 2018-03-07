
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the different names of the filing organization by which it is known as well as names of other organizations that have a similar name to this organization.
 *          
 * 
 * <p>Java class for FilingOrganizationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingOrganizationName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingOrganizationNameBaseType" minOccurs="0"/>
 *         &lt;element name="OrganizationRegisteredName" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingOrganizationNameBaseType" minOccurs="0"/>
 *         &lt;element name="TradeStyleName" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingOrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegisteredTradeStyleName" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingOrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerOrganizationRegisteredName" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingOrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingOrganizationName", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationPrimaryName",
    "organizationRegisteredName",
    "tradeStyleName",
    "registeredTradeStyleName",
    "formerOrganizationRegisteredName"
})
public class FilingOrganizationName {

    @XmlElement(name = "OrganizationPrimaryName")
    protected FilingOrganizationNameBaseType organizationPrimaryName;
    @XmlElement(name = "OrganizationRegisteredName")
    protected FilingOrganizationNameBaseType organizationRegisteredName;
    @XmlElement(name = "TradeStyleName")
    protected List<FilingOrganizationNameBaseType> tradeStyleName;
    @XmlElement(name = "RegisteredTradeStyleName")
    protected List<FilingOrganizationNameBaseType> registeredTradeStyleName;
    @XmlElement(name = "FormerOrganizationRegisteredName")
    protected List<FilingOrganizationNameBaseType> formerOrganizationRegisteredName;

    /**
     * Gets the value of the organizationPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link FilingOrganizationNameBaseType }
     *     
     */
    public FilingOrganizationNameBaseType getOrganizationPrimaryName() {
        return organizationPrimaryName;
    }

    /**
     * Sets the value of the organizationPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingOrganizationNameBaseType }
     *     
     */
    public void setOrganizationPrimaryName(FilingOrganizationNameBaseType value) {
        this.organizationPrimaryName = value;
    }

    /**
     * Gets the value of the organizationRegisteredName property.
     * 
     * @return
     *     possible object is
     *     {@link FilingOrganizationNameBaseType }
     *     
     */
    public FilingOrganizationNameBaseType getOrganizationRegisteredName() {
        return organizationRegisteredName;
    }

    /**
     * Sets the value of the organizationRegisteredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingOrganizationNameBaseType }
     *     
     */
    public void setOrganizationRegisteredName(FilingOrganizationNameBaseType value) {
        this.organizationRegisteredName = value;
    }

    /**
     * Gets the value of the tradeStyleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeStyleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeStyleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingOrganizationNameBaseType }
     * 
     * 
     */
    public List<FilingOrganizationNameBaseType> getTradeStyleName() {
        if (tradeStyleName == null) {
            tradeStyleName = new ArrayList<FilingOrganizationNameBaseType>();
        }
        return this.tradeStyleName;
    }

    /**
     * Gets the value of the registeredTradeStyleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredTradeStyleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredTradeStyleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingOrganizationNameBaseType }
     * 
     * 
     */
    public List<FilingOrganizationNameBaseType> getRegisteredTradeStyleName() {
        if (registeredTradeStyleName == null) {
            registeredTradeStyleName = new ArrayList<FilingOrganizationNameBaseType>();
        }
        return this.registeredTradeStyleName;
    }

    /**
     * Gets the value of the formerOrganizationRegisteredName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerOrganizationRegisteredName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerOrganizationRegisteredName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingOrganizationNameBaseType }
     * 
     * 
     */
    public List<FilingOrganizationNameBaseType> getFormerOrganizationRegisteredName() {
        if (formerOrganizationRegisteredName == null) {
            formerOrganizationRegisteredName = new ArrayList<FilingOrganizationNameBaseType>();
        }
        return this.formerOrganizationRegisteredName;
    }

}
