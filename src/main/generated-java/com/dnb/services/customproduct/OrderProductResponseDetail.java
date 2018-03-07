
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderProductResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryDetail" minOccurs="0"/>
 *         &lt;element name="CreditDecisionSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditDecisionSpecification" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://services.dnb.com/CustomProductServiceV2.0}Product"/>
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
@XmlType(name = "OrderProductResponseDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "creditDecisionSpecification",
    "product",
    "inquiryReferenceDetail"
})
public class OrderProductResponseDetail {

    @XmlElement(name = "InquiryDetail")
    protected InquiryDetail inquiryDetail;
    @XmlElement(name = "CreditDecisionSpecification")
    protected CreditDecisionSpecification creditDecisionSpecification;
    @XmlElement(name = "Product", required = true)
    protected Product product;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryDetail }
     *     
     */
    public InquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryDetail }
     *     
     */
    public void setInquiryDetail(InquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the creditDecisionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDecisionSpecification }
     *     
     */
    public CreditDecisionSpecification getCreditDecisionSpecification() {
        return creditDecisionSpecification;
    }

    /**
     * Sets the value of the creditDecisionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDecisionSpecification }
     *     
     */
    public void setCreditDecisionSpecification(CreditDecisionSpecification value) {
        this.creditDecisionSpecification = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
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
