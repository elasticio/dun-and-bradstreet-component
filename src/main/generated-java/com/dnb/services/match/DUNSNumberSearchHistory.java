
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DUNSNumberSearchHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DUNSNumberSearchHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequentlySearchedDUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}FrequentlySearchedDUNSNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DUNSNumberNotUsedSearchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtherDUNSNumberUsedSearchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DUNSNumberSearchHistory", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "frequentlySearchedDUNSNumber",
    "dunsNumberNotUsedSearchCount",
    "otherDUNSNumberUsedSearchCount"
})
public class DUNSNumberSearchHistory {

    @XmlElement(name = "FrequentlySearchedDUNSNumber")
    protected List<FrequentlySearchedDUNSNumber> frequentlySearchedDUNSNumber;
    @XmlElement(name = "DUNSNumberNotUsedSearchCount")
    protected Integer dunsNumberNotUsedSearchCount;
    @XmlElement(name = "OtherDUNSNumberUsedSearchCount")
    protected Integer otherDUNSNumberUsedSearchCount;

    /**
     * Gets the value of the frequentlySearchedDUNSNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentlySearchedDUNSNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentlySearchedDUNSNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentlySearchedDUNSNumber }
     * 
     * 
     */
    public List<FrequentlySearchedDUNSNumber> getFrequentlySearchedDUNSNumber() {
        if (frequentlySearchedDUNSNumber == null) {
            frequentlySearchedDUNSNumber = new ArrayList<FrequentlySearchedDUNSNumber>();
        }
        return this.frequentlySearchedDUNSNumber;
    }

    /**
     * Gets the value of the dunsNumberNotUsedSearchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDUNSNumberNotUsedSearchCount() {
        return dunsNumberNotUsedSearchCount;
    }

    /**
     * Sets the value of the dunsNumberNotUsedSearchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDUNSNumberNotUsedSearchCount(Integer value) {
        this.dunsNumberNotUsedSearchCount = value;
    }

    /**
     * Gets the value of the otherDUNSNumberUsedSearchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherDUNSNumberUsedSearchCount() {
        return otherDUNSNumberUsedSearchCount;
    }

    /**
     * Sets the value of the otherDUNSNumberUsedSearchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherDUNSNumberUsedSearchCount(Integer value) {
        this.otherDUNSNumberUsedSearchCount = value;
    }

}
