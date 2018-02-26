
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records search criteria provided by the customer to find a potential list of industries represented by D&B Hoovers Industry Coding scheme from the D&B database; e.g., US SIC, UK SIC, Keyword.
 *          
 * 
 * <p>Java class for FindIndustryInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindIndustryInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/EntityListServiceV2.0}FindIndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeywordText" type="{http://services.dnb.com/EntityListServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindIndustryInquiryDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "industryCode",
    "keywordText"
})
public class FindIndustryInquiryDetail {

    @XmlElement(name = "IndustryCode")
    protected List<FindIndustryCodeType> industryCode;
    @XmlElement(name = "KeywordText")
    protected String keywordText;

    /**
     * Gets the value of the industryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FindIndustryCodeType }
     * 
     * 
     */
    public List<FindIndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<FindIndustryCodeType>();
        }
        return this.industryCode;
    }

    /**
     * Gets the value of the keywordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordText() {
        return keywordText;
    }

    /**
     * Sets the value of the keywordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordText(String value) {
        this.keywordText = value;
    }

}
