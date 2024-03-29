//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.22 at 01:48:05 PM EET 
//


package com.dnb.services.industry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseArchiveDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseArchiveDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortfolioAssetID" type="{http://services.dnb.com/IndustryProductServiceV2.0}PortfolioAssetIDType" minOccurs="0"/>
 *         &lt;element name="PortfolioAssetContainerID" type="{http://services.dnb.com/IndustryProductServiceV2.0}PortfolioAssetContainerIDType" minOccurs="0"/>
 *         &lt;element name="ExtendedArchiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseArchiveDetail", propOrder = {
    "portfolioAssetID",
    "portfolioAssetContainerID",
    "extendedArchiveIndicator"
})
public class ResponseArchiveDetail {

    @XmlElement(name = "PortfolioAssetID")
    protected Long portfolioAssetID;
    @XmlElement(name = "PortfolioAssetContainerID")
    protected Long portfolioAssetContainerID;
    @XmlElement(name = "ExtendedArchiveIndicator")
    protected Boolean extendedArchiveIndicator;

    /**
     * Gets the value of the portfolioAssetID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioAssetID() {
        return portfolioAssetID;
    }

    /**
     * Sets the value of the portfolioAssetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioAssetID(Long value) {
        this.portfolioAssetID = value;
    }

    /**
     * Gets the value of the portfolioAssetContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioAssetContainerID() {
        return portfolioAssetContainerID;
    }

    /**
     * Sets the value of the portfolioAssetContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioAssetContainerID(Long value) {
        this.portfolioAssetContainerID = value;
    }

    /**
     * Gets the value of the extendedArchiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedArchiveIndicator() {
        return extendedArchiveIndicator;
    }

    /**
     * Sets the value of the extendedArchiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedArchiveIndicator(Boolean value) {
        this.extendedArchiveIndicator = value;
    }

}
