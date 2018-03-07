
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryProfileDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryProfileDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponseIndustryCodeType" maxOccurs="unbounded"/>
 *         &lt;element name="IndustryProfileChapterDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryChapterDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedIndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponseIndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryProfileDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryCode",
    "industryProfileChapterDetail",
    "relatedIndustryCode",
    "dataProviderName"
})
public class IndustryProfileDetail {

    @XmlElement(name = "IndustryCode", required = true)
    protected List<ResponseIndustryCodeType> industryCode;
    @XmlElement(name = "IndustryProfileChapterDetail")
    protected List<IndustryChapterDetail> industryProfileChapterDetail;
    @XmlElement(name = "RelatedIndustryCode")
    protected List<ResponseIndustryCodeType> relatedIndustryCode;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;

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
     * {@link ResponseIndustryCodeType }
     * 
     * 
     */
    public List<ResponseIndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<ResponseIndustryCodeType>();
        }
        return this.industryCode;
    }

    /**
     * Gets the value of the industryProfileChapterDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryProfileChapterDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryProfileChapterDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryChapterDetail }
     * 
     * 
     */
    public List<IndustryChapterDetail> getIndustryProfileChapterDetail() {
        if (industryProfileChapterDetail == null) {
            industryProfileChapterDetail = new ArrayList<IndustryChapterDetail>();
        }
        return this.industryProfileChapterDetail;
    }

    /**
     * Gets the value of the relatedIndustryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedIndustryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseIndustryCodeType }
     * 
     * 
     */
    public List<ResponseIndustryCodeType> getRelatedIndustryCode() {
        if (relatedIndustryCode == null) {
            relatedIndustryCode = new ArrayList<ResponseIndustryCodeType>();
        }
        return this.relatedIndustryCode;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

}
