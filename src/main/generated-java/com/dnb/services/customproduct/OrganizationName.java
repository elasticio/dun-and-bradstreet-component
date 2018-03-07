
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}SubjectName">
 *       &lt;sequence>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationRegisteredName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationRegisteredNameType" minOccurs="0"/>
 *         &lt;element name="OrganizationNameUnknownTypeName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradeStyleName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DoNotConfuseOrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegisteredTradeStyleName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerOrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}FormerOrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerOrganizationRegisteredName" type="{http://services.dnb.com/CustomProductServiceV2.0}FormerOrganizationRegisteredNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerTradeStyleName" type="{http://services.dnb.com/CustomProductServiceV2.0}FormerOrganizationPrimaryNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BrandName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegisteredAcronymName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KnownByName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketingName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationName", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationPrimaryName",
    "organizationRegisteredName",
    "organizationNameUnknownTypeName",
    "tradeStyleName",
    "doNotConfuseOrganizationName",
    "registeredTradeStyleName",
    "formerOrganizationPrimaryName",
    "formerOrganizationRegisteredName",
    "formerTradeStyleName",
    "brandName",
    "registeredAcronymName",
    "knownByName",
    "marketingName"
})
public class OrganizationName
    extends SubjectName
{

    @XmlElement(name = "OrganizationPrimaryName")
    protected List<OrganizationPrimaryNameType> organizationPrimaryName;
    @XmlElement(name = "OrganizationRegisteredName")
    protected OrganizationRegisteredNameType organizationRegisteredName;
    @XmlElement(name = "OrganizationNameUnknownTypeName")
    protected List<OrganizationNameBaseType> organizationNameUnknownTypeName;
    @XmlElement(name = "TradeStyleName")
    protected List<OrganizationNameBaseType> tradeStyleName;
    @XmlElement(name = "DoNotConfuseOrganizationName")
    protected List<OrganizationNameBaseType> doNotConfuseOrganizationName;
    @XmlElement(name = "RegisteredTradeStyleName")
    protected List<OrganizationNameBaseType> registeredTradeStyleName;
    @XmlElement(name = "FormerOrganizationPrimaryName")
    protected List<FormerOrganizationPrimaryNameType> formerOrganizationPrimaryName;
    @XmlElement(name = "FormerOrganizationRegisteredName")
    protected List<FormerOrganizationRegisteredNameType> formerOrganizationRegisteredName;
    @XmlElement(name = "FormerTradeStyleName")
    protected List<FormerOrganizationPrimaryNameType> formerTradeStyleName;
    @XmlElement(name = "BrandName")
    protected List<OrganizationNameBaseType> brandName;
    @XmlElement(name = "RegisteredAcronymName")
    protected List<OrganizationNameBaseType> registeredAcronymName;
    @XmlElement(name = "KnownByName")
    protected List<OrganizationNameBaseType> knownByName;
    @XmlElement(name = "MarketingName")
    protected List<OrganizationNameBaseType> marketingName;

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
     * Gets the value of the organizationRegisteredName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRegisteredNameType }
     *     
     */
    public OrganizationRegisteredNameType getOrganizationRegisteredName() {
        return organizationRegisteredName;
    }

    /**
     * Sets the value of the organizationRegisteredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRegisteredNameType }
     *     
     */
    public void setOrganizationRegisteredName(OrganizationRegisteredNameType value) {
        this.organizationRegisteredName = value;
    }

    /**
     * Gets the value of the organizationNameUnknownTypeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationNameUnknownTypeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationNameUnknownTypeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getOrganizationNameUnknownTypeName() {
        if (organizationNameUnknownTypeName == null) {
            organizationNameUnknownTypeName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.organizationNameUnknownTypeName;
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
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getTradeStyleName() {
        if (tradeStyleName == null) {
            tradeStyleName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.tradeStyleName;
    }

    /**
     * Gets the value of the doNotConfuseOrganizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doNotConfuseOrganizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoNotConfuseOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getDoNotConfuseOrganizationName() {
        if (doNotConfuseOrganizationName == null) {
            doNotConfuseOrganizationName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.doNotConfuseOrganizationName;
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
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getRegisteredTradeStyleName() {
        if (registeredTradeStyleName == null) {
            registeredTradeStyleName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.registeredTradeStyleName;
    }

    /**
     * Gets the value of the formerOrganizationPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerOrganizationPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerOrganizationPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerOrganizationPrimaryNameType }
     * 
     * 
     */
    public List<FormerOrganizationPrimaryNameType> getFormerOrganizationPrimaryName() {
        if (formerOrganizationPrimaryName == null) {
            formerOrganizationPrimaryName = new ArrayList<FormerOrganizationPrimaryNameType>();
        }
        return this.formerOrganizationPrimaryName;
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
     * {@link FormerOrganizationRegisteredNameType }
     * 
     * 
     */
    public List<FormerOrganizationRegisteredNameType> getFormerOrganizationRegisteredName() {
        if (formerOrganizationRegisteredName == null) {
            formerOrganizationRegisteredName = new ArrayList<FormerOrganizationRegisteredNameType>();
        }
        return this.formerOrganizationRegisteredName;
    }

    /**
     * Gets the value of the formerTradeStyleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerTradeStyleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerTradeStyleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerOrganizationPrimaryNameType }
     * 
     * 
     */
    public List<FormerOrganizationPrimaryNameType> getFormerTradeStyleName() {
        if (formerTradeStyleName == null) {
            formerTradeStyleName = new ArrayList<FormerOrganizationPrimaryNameType>();
        }
        return this.formerTradeStyleName;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getBrandName() {
        if (brandName == null) {
            brandName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.brandName;
    }

    /**
     * Gets the value of the registeredAcronymName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredAcronymName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredAcronymName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getRegisteredAcronymName() {
        if (registeredAcronymName == null) {
            registeredAcronymName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.registeredAcronymName;
    }

    /**
     * Gets the value of the knownByName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownByName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownByName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getKnownByName() {
        if (knownByName == null) {
            knownByName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.knownByName;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getMarketingName() {
        if (marketingName == null) {
            marketingName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.marketingName;
    }

}
