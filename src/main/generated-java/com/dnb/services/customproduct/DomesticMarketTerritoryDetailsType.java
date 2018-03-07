
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomesticMarketTerritoryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticMarketTerritoryDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketTerritoryLocalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketTerritoryRegionalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketTerritoryNationalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomesticMarketTerritoryDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "marketTerritoryLocalIndicator",
    "marketTerritoryRegionalIndicator",
    "marketTerritoryNationalIndicator"
})
public class DomesticMarketTerritoryDetailsType {

    @XmlElement(name = "MarketTerritoryLocalIndicator")
    protected Boolean marketTerritoryLocalIndicator;
    @XmlElement(name = "MarketTerritoryRegionalIndicator")
    protected Boolean marketTerritoryRegionalIndicator;
    @XmlElement(name = "MarketTerritoryNationalIndicator")
    protected Boolean marketTerritoryNationalIndicator;

    /**
     * Gets the value of the marketTerritoryLocalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketTerritoryLocalIndicator() {
        return marketTerritoryLocalIndicator;
    }

    /**
     * Sets the value of the marketTerritoryLocalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketTerritoryLocalIndicator(Boolean value) {
        this.marketTerritoryLocalIndicator = value;
    }

    /**
     * Gets the value of the marketTerritoryRegionalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketTerritoryRegionalIndicator() {
        return marketTerritoryRegionalIndicator;
    }

    /**
     * Sets the value of the marketTerritoryRegionalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketTerritoryRegionalIndicator(Boolean value) {
        this.marketTerritoryRegionalIndicator = value;
    }

    /**
     * Gets the value of the marketTerritoryNationalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketTerritoryNationalIndicator() {
        return marketTerritoryNationalIndicator;
    }

    /**
     * Sets the value of the marketTerritoryNationalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketTerritoryNationalIndicator(Boolean value) {
        this.marketTerritoryNationalIndicator = value;
    }

}
