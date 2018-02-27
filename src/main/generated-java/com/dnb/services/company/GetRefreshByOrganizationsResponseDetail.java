
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data returned by refresh check service for the list of inquired subjects that have been updated in the last 90 days.
 *          
 * 
 * <p>Java class for GetRefreshByOrganizationsResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRefreshByOrganizationsResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckRefreshCandidateDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CheckRefreshCandidateDetail" maxOccurs="unbounded"/>
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
@XmlType(name = "GetRefreshByOrganizationsResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "checkRefreshCandidateDetail",
    "inquiryReferenceDetail"
})
public class GetRefreshByOrganizationsResponseDetail {

    @XmlElement(name = "CheckRefreshCandidateDetail", required = true)
    protected List<CheckRefreshCandidateDetail> checkRefreshCandidateDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the checkRefreshCandidateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkRefreshCandidateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckRefreshCandidateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckRefreshCandidateDetail }
     * 
     * 
     */
    public List<CheckRefreshCandidateDetail> getCheckRefreshCandidateDetail() {
        if (checkRefreshCandidateDetail == null) {
            checkRefreshCandidateDetail = new ArrayList<CheckRefreshCandidateDetail>();
        }
        return this.checkRefreshCandidateDetail;
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
