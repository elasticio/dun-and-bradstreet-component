
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSupplierListResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierListResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierListInquiryDetail"/>
 *         &lt;element name="SupplierDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierDetail" maxOccurs="unbounded"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierListResponseDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "supplierDetail",
    "inquiryReferenceDetail"
})
public class GetSupplierListResponseDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected SupplierListInquiryDetail inquiryDetail;
    @XmlElement(name = "SupplierDetail", required = true)
    protected List<SupplierDetail> supplierDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierListInquiryDetail }
     *     
     */
    public SupplierListInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierListInquiryDetail }
     *     
     */
    public void setInquiryDetail(SupplierListInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the supplierDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierDetail }
     * 
     * 
     */
    public List<SupplierDetail> getSupplierDetail() {
        if (supplierDetail == null) {
            supplierDetail = new ArrayList<SupplierDetail>();
        }
        return this.supplierDetail;
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
