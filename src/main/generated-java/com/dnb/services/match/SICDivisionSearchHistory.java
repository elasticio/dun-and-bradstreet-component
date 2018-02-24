
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SICDivisionSearchHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SICDivisionSearchHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SICDivisionSearchHistoryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SICDivisionSearchHistoryDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecentSearchHistory" type="{http://services.dnb.com/CompanyServiceV2.0}RecentSearchHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SICDivisionSearchHistory", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "sicDivisionSearchHistoryDetail",
    "recentSearchHistory"
})
public class SICDivisionSearchHistory {

    @XmlElement(name = "SICDivisionSearchHistoryDetail")
    protected List<SICDivisionSearchHistoryDetail> sicDivisionSearchHistoryDetail;
    @XmlElement(name = "RecentSearchHistory")
    protected List<RecentSearchHistory> recentSearchHistory;

    /**
     * Gets the value of the sicDivisionSearchHistoryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicDivisionSearchHistoryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICDivisionSearchHistoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SICDivisionSearchHistoryDetail }
     * 
     * 
     */
    public List<SICDivisionSearchHistoryDetail> getSICDivisionSearchHistoryDetail() {
        if (sicDivisionSearchHistoryDetail == null) {
            sicDivisionSearchHistoryDetail = new ArrayList<SICDivisionSearchHistoryDetail>();
        }
        return this.sicDivisionSearchHistoryDetail;
    }

    /**
     * Gets the value of the recentSearchHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recentSearchHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecentSearchHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecentSearchHistory }
     * 
     * 
     */
    public List<RecentSearchHistory> getRecentSearchHistory() {
        if (recentSearchHistory == null) {
            recentSearchHistory = new ArrayList<RecentSearchHistory>();
        }
        return this.recentSearchHistory;
    }

}
