
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the market analysis information on a location as recorded by the data provider. The market analysis information may include deliver industry and economic insight, employment and real estate trends, and valuable resource links for the location.
 *          
 * 
 * <p>Java class for LocationProfileDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationProfileDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://services.dnb.com/CustomProductServiceV2.0}ProfileLocation"/>
 *         &lt;element name="LocationProfileChapterDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryChapterDetail" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LocationProfileDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "location",
    "locationProfileChapterDetail",
    "relatedIndustryCode",
    "dataProviderName"
})
public class LocationProfileDetail {

    @XmlElement(name = "Location", required = true)
    protected ProfileLocation location;
    @XmlElement(name = "LocationProfileChapterDetail")
    protected List<IndustryChapterDetail> locationProfileChapterDetail;
    @XmlElement(name = "RelatedIndustryCode")
    protected List<ResponseIndustryCodeType> relatedIndustryCode;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileLocation }
     *     
     */
    public ProfileLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileLocation }
     *     
     */
    public void setLocation(ProfileLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationProfileChapterDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationProfileChapterDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationProfileChapterDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryChapterDetail }
     * 
     * 
     */
    public List<IndustryChapterDetail> getLocationProfileChapterDetail() {
        if (locationProfileChapterDetail == null) {
            locationProfileChapterDetail = new ArrayList<IndustryChapterDetail>();
        }
        return this.locationProfileChapterDetail;
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