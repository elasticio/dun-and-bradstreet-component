
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNameResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HashedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SearchDirectionStatusText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SearchDirectionText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="BestMatchCandidateDisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicFilingCandidate" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNameCandidate" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SearchByFilingNameResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "candidateMatchedQuantity",
    "hashedName",
    "searchDirectionStatusText",
    "searchDirectionText",
    "bestMatchCandidateDisplaySequence",
    "publicFilingCandidate",
    "inquiryReferenceDetail"
})
public class SearchByFilingNameResponseDetail {

    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "HashedName")
    protected String hashedName;
    @XmlElement(name = "SearchDirectionStatusText")
    protected DNBDecodedStringType searchDirectionStatusText;
    @XmlElement(name = "SearchDirectionText")
    protected DNBDecodedStringType searchDirectionText;
    @XmlElement(name = "BestMatchCandidateDisplaySequence")
    protected Integer bestMatchCandidateDisplaySequence;
    @XmlElement(name = "PublicFilingCandidate")
    protected List<SearchByFilingNameCandidate> publicFilingCandidate;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

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
     * Gets the value of the hashedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedName() {
        return hashedName;
    }

    /**
     * Sets the value of the hashedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedName(String value) {
        this.hashedName = value;
    }

    /**
     * Gets the value of the searchDirectionStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSearchDirectionStatusText() {
        return searchDirectionStatusText;
    }

    /**
     * Sets the value of the searchDirectionStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSearchDirectionStatusText(DNBDecodedStringType value) {
        this.searchDirectionStatusText = value;
    }

    /**
     * Gets the value of the searchDirectionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSearchDirectionText() {
        return searchDirectionText;
    }

    /**
     * Sets the value of the searchDirectionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSearchDirectionText(DNBDecodedStringType value) {
        this.searchDirectionText = value;
    }

    /**
     * Gets the value of the bestMatchCandidateDisplaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBestMatchCandidateDisplaySequence() {
        return bestMatchCandidateDisplaySequence;
    }

    /**
     * Sets the value of the bestMatchCandidateDisplaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBestMatchCandidateDisplaySequence(Integer value) {
        this.bestMatchCandidateDisplaySequence = value;
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
     * {@link SearchByFilingNameCandidate }
     * 
     * 
     */
    public List<SearchByFilingNameCandidate> getPublicFilingCandidate() {
        if (publicFilingCandidate == null) {
            publicFilingCandidate = new ArrayList<SearchByFilingNameCandidate>();
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
