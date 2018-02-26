
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to the industries represented by D&B Hoovers Industry Coding scheme from the D&B database based on search criteria.
 *          
 * 
 * <p>Java class for FindIndustryResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindIndustryResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CandidateReturnedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FindIndustryResponseDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "candidateMatchedQuantity",
    "candidateReturnedQuantity",
    "industryCode",
    "inquiryReferenceDetail"
})
public class FindIndustryResponseDetail {

    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "CandidateReturnedQuantity")
    protected Integer candidateReturnedQuantity;
    @XmlElement(name = "IndustryCode")
    protected List<IndustryCodeType> industryCode;
    @XmlElement(name = "InquiryReferenceDetail")
    protected List<InquiryReferenceDetail> inquiryReferenceDetail;

    /**
     * Gets the value of the candidateMatchedQuantity property.
     * 
     */
    public int getCandidateMatchedQuantity() {
        return candidateMatchedQuantity;
    }

    /**
     * Sets the value of the candidateMatchedQuantity property.
     * 
     */
    public void setCandidateMatchedQuantity(int value) {
        this.candidateMatchedQuantity = value;
    }

    /**
     * Gets the value of the candidateReturnedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCandidateReturnedQuantity() {
        return candidateReturnedQuantity;
    }

    /**
     * Sets the value of the candidateReturnedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateReturnedQuantity(Integer value) {
        this.candidateReturnedQuantity = value;
    }

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
     * {@link IndustryCodeType }
     * 
     * 
     */
    public List<IndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<IndustryCodeType>();
        }
        return this.industryCode;
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
