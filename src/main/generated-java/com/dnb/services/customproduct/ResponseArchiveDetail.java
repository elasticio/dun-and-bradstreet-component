
package com.dnb.services.customproduct;

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
 *         &lt;element name="PortfolioAssetID" type="{http://services.dnb.com/CustomProductServiceV2.0}PortfolioAssetIDType"/>
 *         &lt;element name="PortfolioAssetContainerID" type="{http://services.dnb.com/CustomProductServiceV2.0}PortfolioAssetContainerIDType" minOccurs="0"/>
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
@XmlType(name = "ResponseArchiveDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "portfolioAssetID",
    "portfolioAssetContainerID",
    "extendedArchiveIndicator"
})
public class ResponseArchiveDetail {

    @XmlElement(name = "PortfolioAssetID")
    protected long portfolioAssetID;
    @XmlElement(name = "PortfolioAssetContainerID")
    protected Long portfolioAssetContainerID;
    @XmlElement(name = "ExtendedArchiveIndicator")
    protected Boolean extendedArchiveIndicator;

    /**
     * Gets the value of the portfolioAssetID property.
     * 
     */
    public long getPortfolioAssetID() {
        return portfolioAssetID;
    }

    /**
     * Sets the value of the portfolioAssetID property.
     * 
     */
    public void setPortfolioAssetID(long value) {
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
