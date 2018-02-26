
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the search criteria provided by the Customer/User to find a potential list of industries represented by D&B Hoovers Industry Coding scheme from the D&B database and the specification details provided by the Customer/User to refine the expected search result set.
 * 
 *          
 * 
 * <p>Java class for FindIndustryRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindIndustryRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindIndustryInquiryDetail"/>
 *         &lt;element name="FindIndustrySpecification" type="{http://services.dnb.com/EntityListServiceV2.0}FindIndustrySpecification" minOccurs="0"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/EntityListServiceV2.0}InquiryReferenceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindIndustryRequestDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inquiryDetail",
    "findIndustrySpecification",
    "inquiryReferenceDetail"
})
public class FindIndustryRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected FindIndustryInquiryDetail inquiryDetail;
    @XmlElement(name = "FindIndustrySpecification")
    protected FindIndustrySpecification findIndustrySpecification;
    @XmlElement(name = "InquiryReferenceDetail")
    protected List<InquiryReferenceDetail> inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindIndustryInquiryDetail }
     *     
     */
    public FindIndustryInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindIndustryInquiryDetail }
     *     
     */
    public void setInquiryDetail(FindIndustryInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the findIndustrySpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FindIndustrySpecification }
     *     
     */
    public FindIndustrySpecification getFindIndustrySpecification() {
        return findIndustrySpecification;
    }

    /**
     * Sets the value of the findIndustrySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindIndustrySpecification }
     *     
     */
    public void setFindIndustrySpecification(FindIndustrySpecification value) {
        this.findIndustrySpecification = value;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inquiryReferenceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInquiryReferenceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InquiryReferenceDetail }
     * 
     * 
     */
    public List<InquiryReferenceDetail> getInquiryReferenceDetail() {
        if (inquiryReferenceDetail == null) {
            inquiryReferenceDetail = new ArrayList<InquiryReferenceDetail>();
        }
        return this.inquiryReferenceDetail;
    }

}
