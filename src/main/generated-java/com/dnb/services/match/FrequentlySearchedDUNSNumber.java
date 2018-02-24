
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequentlySearchedDUNSNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentlySearchedDUNSNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="SearchCount" type="{http://services.dnb.com/CompanyServiceV2.0}SearchCountBaseType"/>
 *         &lt;element name="ImportanceLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentlySearchedDUNSNumber", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "dunsNumber",
    "searchCount",
    "importanceLevel"
})
public class FrequentlySearchedDUNSNumber {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "SearchCount")
    protected int searchCount;
    @XmlElement(name = "ImportanceLevel")
    protected int importanceLevel;

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
     * Gets the value of the searchCount property.
     * 
     */
    public int getSearchCount() {
        return searchCount;
    }

    /**
     * Sets the value of the searchCount property.
     * 
     */
    public void setSearchCount(int value) {
        this.searchCount = value;
    }

    /**
     * Gets the value of the importanceLevel property.
     * 
     */
    public int getImportanceLevel() {
        return importanceLevel;
    }

    /**
     * Sets the value of the importanceLevel property.
     * 
     */
    public void setImportanceLevel(int value) {
        this.importanceLevel = value;
    }

}
