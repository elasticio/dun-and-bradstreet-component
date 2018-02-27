
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNumberResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNumberResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNumberInquiryDetail"/>
 *         &lt;element name="CandidateMatchedQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicFilingCandidate" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNumberCandidate" maxOccurs="unbounded"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/CompanyServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNumberResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "candidateMatchedQuantity",
    "publicFilingCandidate",
    "inquiryReferenceDetail"
})
public class SearchByFilingNumberResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected SearchByFilingNumberInquiryDetail inquiryDetail;
    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "PublicFilingCandidate", required = true)
    protected List<SearchByFilingNumberCandidate> publicFilingCandidate;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNumberInquiryDetail }
     *     
     */
    public SearchByFilingNumberInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNumberInquiryDetail }
     *     
     */
    public void setInquiryDetail(SearchByFilingNumberInquiryDetail value) {
        this.inquiryDetail = value;
    }

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
     * Gets the value of the publicFilingCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicFilingCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicFilingCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchByFilingNumberCandidate }
     * 
     * 
     */
    public List<SearchByFilingNumberCandidate> getPublicFilingCandidate() {
        if (publicFilingCandidate == null) {
            publicFilingCandidate = new ArrayList<SearchByFilingNumberCandidate>();
        }
        return this.publicFilingCandidate;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }

    /**
     * Sets the value of the inquiryReferenceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public void setInquiryReferenceDetail(InquiryReferenceDetail value) {
        this.inquiryReferenceDetail = value;
    }

}
