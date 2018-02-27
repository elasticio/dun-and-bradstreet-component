
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to the details for the retrieving the refresh check data for a list of the subjects that have been updated in the last 90 days.
 *          
 * 
 * <p>Java class for GetRefreshByOrganizationsRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRefreshByOrganizationsRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetRefreshByOrganizationsInquiryDetail" maxOccurs="1000"/>
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
@XmlType(name = "GetRefreshByOrganizationsRequestDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "inquiryReferenceDetail"
})
public class GetRefreshByOrganizationsRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected List<GetRefreshByOrganizationsInquiryDetail> inquiryDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inquiryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInquiryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRefreshByOrganizationsInquiryDetail }
     * 
     * 
     */
    public List<GetRefreshByOrganizationsInquiryDetail> getInquiryDetail() {
        if (inquiryDetail == null) {
            inquiryDetail = new ArrayList<GetRefreshByOrganizationsInquiryDetail>();
        }
        return this.inquiryDetail;
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
