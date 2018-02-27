
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckRefreshResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRefreshResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CheckRefreshInquiryDetail"/>
 *         &lt;element name="RefreshAvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransferDUNSNumberRegistration" type="{http://services.dnb.com/CompanyServiceV2.0}TransferDUNSNumberRegistration" minOccurs="0"/>
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
@XmlType(name = "CheckRefreshResponseDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "inquiryDetail",
    "refreshAvailableIndicator",
    "transferDUNSNumberRegistration",
    "inquiryReferenceDetail"
})
public class CheckRefreshResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected CheckRefreshInquiryDetail inquiryDetail;
    @XmlElement(name = "RefreshAvailableIndicator")
    protected Boolean refreshAvailableIndicator;
    @XmlElement(name = "TransferDUNSNumberRegistration")
    protected TransferDUNSNumberRegistration transferDUNSNumberRegistration;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRefreshInquiryDetail }
     *     
     */
    public CheckRefreshInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRefreshInquiryDetail }
     *     
     */
    public void setInquiryDetail(CheckRefreshInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the refreshAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshAvailableIndicator() {
        return refreshAvailableIndicator;
    }

    /**
     * Sets the value of the refreshAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshAvailableIndicator(Boolean value) {
        this.refreshAvailableIndicator = value;
    }

    /**
     * Gets the value of the transferDUNSNumberRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link TransferDUNSNumberRegistration }
     *     
     */
    public TransferDUNSNumberRegistration getTransferDUNSNumberRegistration() {
        return transferDUNSNumberRegistration;
    }

    /**
     * Sets the value of the transferDUNSNumberRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDUNSNumberRegistration }
     *     
     */
    public void setTransferDUNSNumberRegistration(TransferDUNSNumberRegistration value) {
        this.transferDUNSNumberRegistration = value;
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
