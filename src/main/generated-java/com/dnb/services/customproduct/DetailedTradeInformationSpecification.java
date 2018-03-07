
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for DetailedTradeInformationSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedTradeInformationSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeHeadquartesAndBranchesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TradeInformationPeriod" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTradeInformationSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "includeHeadquartesAndBranchesIndicator",
    "tradeInformationPeriod"
})
public class DetailedTradeInformationSpecification {

    @XmlElement(name = "IncludeHeadquartesAndBranchesIndicator")
    protected Boolean includeHeadquartesAndBranchesIndicator;
    @XmlElement(name = "TradeInformationPeriod")
    protected Duration tradeInformationPeriod;

    /**
     * Gets the value of the includeHeadquartesAndBranchesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHeadquartesAndBranchesIndicator() {
        return includeHeadquartesAndBranchesIndicator;
    }

    /**
     * Sets the value of the includeHeadquartesAndBranchesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHeadquartesAndBranchesIndicator(Boolean value) {
        this.includeHeadquartesAndBranchesIndicator = value;
    }

    /**
     * Gets the value of the tradeInformationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTradeInformationPeriod() {
        return tradeInformationPeriod;
    }

    /**
     * Sets the value of the tradeInformationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTradeInformationPeriod(Duration value) {
        this.tradeInformationPeriod = value;
    }

}
