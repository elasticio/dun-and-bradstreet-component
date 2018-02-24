
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPeriodDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPeriodDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCount" type="{http://services.dnb.com/CompanyServiceV2.0}SearchCountType"/>
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
@XmlType(name = "SearchPeriodDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "searchCount",
    "importanceLevel"
})
public class SearchPeriodDetail {

    @XmlElement(name = "SearchCount", required = true)
    protected SearchCountType searchCount;
    @XmlElement(name = "ImportanceLevel")
    protected int importanceLevel;

    /**
     * Gets the value of the searchCount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCountType }
     *     
     */
    public SearchCountType getSearchCount() {
        return searchCount;
    }

    /**
     * Sets the value of the searchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCountType }
     *     
     */
    public void setSearchCount(SearchCountType value) {
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
