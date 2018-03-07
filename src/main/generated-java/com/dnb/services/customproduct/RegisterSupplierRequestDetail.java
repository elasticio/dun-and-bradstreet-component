
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to requests for supplier registeration. This may include such details as the product required, the subject about which the product should be produced, the content of the product.
 *          
 * 
 * <p>Java class for RegisterSupplierRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterSupplierRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisterSupplierInquiryDetail"/>
 *         &lt;element name="RegisterSupplierSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisterSupplierSpecification" minOccurs="0"/>
 *         &lt;element name="CustomerFileDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CustomerFileDetails" minOccurs="0"/>
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
@XmlType(name = "RegisterSupplierRequestDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "registerSupplierSpecification",
    "customerFileDetails",
    "inquiryReferenceDetail"
})
public class RegisterSupplierRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected RegisterSupplierInquiryDetail inquiryDetail;
    @XmlElement(name = "RegisterSupplierSpecification")
    protected RegisterSupplierSpecification registerSupplierSpecification;
    @XmlElement(name = "CustomerFileDetails")
    protected CustomerFileDetails customerFileDetails;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterSupplierInquiryDetail }
     *     
     */
    public RegisterSupplierInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterSupplierInquiryDetail }
     *     
     */
    public void setInquiryDetail(RegisterSupplierInquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the registerSupplierSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterSupplierSpecification }
     *     
     */
    public RegisterSupplierSpecification getRegisterSupplierSpecification() {
        return registerSupplierSpecification;
    }

    /**
     * Sets the value of the registerSupplierSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterSupplierSpecification }
     *     
     */
    public void setRegisterSupplierSpecification(RegisterSupplierSpecification value) {
        this.registerSupplierSpecification = value;
    }

    /**
     * Gets the value of the customerFileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFileDetails }
     *     
     */
    public CustomerFileDetails getCustomerFileDetails() {
        return customerFileDetails;
    }

    /**
     * Sets the value of the customerFileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFileDetails }
     *     
     */
    public void setCustomerFileDetails(CustomerFileDetails value) {
        this.customerFileDetails = value;
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
