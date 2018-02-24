
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequentlySearchedTelephoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentlySearchedTelephoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/CompanyServiceV2.0}TelecommunicationNumberSimpleType"/>
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
@XmlType(name = "FrequentlySearchedTelephoneNumber", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "telephoneNumber",
    "searchCount",
    "importanceLevel"
})
public class FrequentlySearchedTelephoneNumber {

    @XmlElement(name = "TelephoneNumber", required = true)
    protected TelecommunicationNumberSimpleType telephoneNumber;
    @XmlElement(name = "SearchCount")
    protected int searchCount;
    @XmlElement(name = "ImportanceLevel")
    protected int importanceLevel;

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public TelecommunicationNumberSimpleType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationNumberSimpleType }
     *     
     */
    public void setTelephoneNumber(TelecommunicationNumberSimpleType value) {
        this.telephoneNumber = value;
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
