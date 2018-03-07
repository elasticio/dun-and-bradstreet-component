
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to requests for search based customer ID.
 *          
 * 
 * <p>Java class for GetSupplierRegistrationBatchStatusRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierRegistrationBatchStatusRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryDetailForSupplierBatch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierRegistrationBatchStatusRequestDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail"
})
public class GetSupplierRegistrationBatchStatusRequestDetail {

    @XmlElement(name = "InquiryDetail")
    protected InquiryDetailForSupplierBatch inquiryDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryDetailForSupplierBatch }
     *     
     */
    public InquiryDetailForSupplierBatch getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryDetailForSupplierBatch }
     *     
     */
    public void setInquiryDetail(InquiryDetailForSupplierBatch value) {
        this.inquiryDetail = value;
    }

}
