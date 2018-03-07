
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataProviderSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProviderSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataProviderCategoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignalsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StrongSignalsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProviderSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dataProviderCategoryText",
    "signalsCount",
    "strongSignalsCount"
})
public class DataProviderSummaryType {

    @XmlElement(name = "DataProviderCategoryText", required = true)
    protected String dataProviderCategoryText;
    @XmlElement(name = "SignalsCount")
    protected Integer signalsCount;
    @XmlElement(name = "StrongSignalsCount")
    protected Integer strongSignalsCount;

    /**
     * Gets the value of the dataProviderCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderCategoryText() {
        return dataProviderCategoryText;
    }

    /**
     * Sets the value of the dataProviderCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProviderCategoryText(String value) {
        this.dataProviderCategoryText = value;
    }

    /**
     * Gets the value of the signalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignalsCount() {
        return signalsCount;
    }

    /**
     * Sets the value of the signalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignalsCount(Integer value) {
        this.signalsCount = value;
    }

    /**
     * Gets the value of the strongSignalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrongSignalsCount() {
        return strongSignalsCount;
    }

    /**
     * Sets the value of the strongSignalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrongSignalsCount(Integer value) {
        this.strongSignalsCount = value;
    }

}
