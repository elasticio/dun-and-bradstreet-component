
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneNumberSearchHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumberSearchHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequentlySearchedTelephoneNumber" type="{http://services.dnb.com/CompanyServiceV2.0}FrequentlySearchedTelephoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneNumberNotUsedSearchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtherTelephoneNumberUsedSearchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberSearchHistory", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "frequentlySearchedTelephoneNumber",
    "telephoneNumberNotUsedSearchCount",
    "otherTelephoneNumberUsedSearchCount"
})
public class TelephoneNumberSearchHistory {

    @XmlElement(name = "FrequentlySearchedTelephoneNumber")
    protected List<FrequentlySearchedTelephoneNumber> frequentlySearchedTelephoneNumber;
    @XmlElement(name = "TelephoneNumberNotUsedSearchCount")
    protected Integer telephoneNumberNotUsedSearchCount;
    @XmlElement(name = "OtherTelephoneNumberUsedSearchCount")
    protected Integer otherTelephoneNumberUsedSearchCount;

    /**
     * Gets the value of the frequentlySearchedTelephoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentlySearchedTelephoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentlySearchedTelephoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentlySearchedTelephoneNumber }
     * 
     * 
     */
    public List<FrequentlySearchedTelephoneNumber> getFrequentlySearchedTelephoneNumber() {
        if (frequentlySearchedTelephoneNumber == null) {
            frequentlySearchedTelephoneNumber = new ArrayList<FrequentlySearchedTelephoneNumber>();
        }
        return this.frequentlySearchedTelephoneNumber;
    }

    /**
     * Gets the value of the telephoneNumberNotUsedSearchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTelephoneNumberNotUsedSearchCount() {
        return telephoneNumberNotUsedSearchCount;
    }

    /**
     * Sets the value of the telephoneNumberNotUsedSearchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTelephoneNumberNotUsedSearchCount(Integer value) {
        this.telephoneNumberNotUsedSearchCount = value;
    }

    /**
     * Gets the value of the otherTelephoneNumberUsedSearchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherTelephoneNumberUsedSearchCount() {
        return otherTelephoneNumberUsedSearchCount;
    }

    /**
     * Sets the value of the otherTelephoneNumberUsedSearchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherTelephoneNumberUsedSearchCount(Integer value) {
        this.otherTelephoneNumberUsedSearchCount = value;
    }

}
