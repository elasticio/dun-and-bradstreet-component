
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SICDivisionSearchHistoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SICDivisionSearchHistoryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCodeDescription" type="{http://services.dnb.com/CompanyServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="SearchPeriodDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchPeriodDetail" maxOccurs="unbounded"/>
 *         &lt;element name="TotalSearchCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SICDivisionSearchHistoryDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "industryCodeDescription",
    "searchPeriodDetail",
    "totalSearchCount"
})
public class SICDivisionSearchHistoryDetail {

    @XmlElement(name = "IndustryCodeDescription")
    protected String industryCodeDescription;
    @XmlElement(name = "SearchPeriodDetail", required = true)
    protected List<SearchPeriodDetail> searchPeriodDetail;
    @XmlElement(name = "TotalSearchCount")
    protected int totalSearchCount;

    /**
     * Gets the value of the industryCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCodeDescription() {
        return industryCodeDescription;
    }

    /**
     * Sets the value of the industryCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCodeDescription(String value) {
        this.industryCodeDescription = value;
    }

    /**
     * Gets the value of the searchPeriodDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPeriodDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPeriodDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPeriodDetail }
     * 
     * 
     */
    public List<SearchPeriodDetail> getSearchPeriodDetail() {
        if (searchPeriodDetail == null) {
            searchPeriodDetail = new ArrayList<SearchPeriodDetail>();
        }
        return this.searchPeriodDetail;
    }

    /**
     * Gets the value of the totalSearchCount property.
     * 
     */
    public int getTotalSearchCount() {
        return totalSearchCount;
    }

    /**
     * Sets the value of the totalSearchCount property.
     * 
     */
    public void setTotalSearchCount(int value) {
        this.totalSearchCount = value;
    }

}
