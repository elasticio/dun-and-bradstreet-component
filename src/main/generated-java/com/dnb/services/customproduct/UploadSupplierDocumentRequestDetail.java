
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data required for business users to upload the document which has supplier information.
 *          
 * 
 * <p>Java class for UploadSupplierDocumentRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSupplierDocumentRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}UserDetailForSupplier"/>
 *         &lt;element name="ObjectAttachment" type="{http://services.dnb.com/CustomProductServiceV2.0}ObjectAttachment" minOccurs="0"/>
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
@XmlType(name = "UploadSupplierDocumentRequestDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "userDetail",
    "objectAttachment",
    "inquiryReferenceDetail"
})
public class UploadSupplierDocumentRequestDetail {

    @XmlElement(name = "UserDetail", required = true)
    protected UserDetailForSupplier userDetail;
    @XmlElement(name = "ObjectAttachment")
    protected ObjectAttachment objectAttachment;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the userDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailForSupplier }
     *     
     */
    public UserDetailForSupplier getUserDetail() {
        return userDetail;
    }

    /**
     * Sets the value of the userDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailForSupplier }
     *     
     */
    public void setUserDetail(UserDetailForSupplier value) {
        this.userDetail = value;
    }

    /**
     * Gets the value of the objectAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectAttachment }
     *     
     */
    public ObjectAttachment getObjectAttachment() {
        return objectAttachment;
    }

    /**
     * Sets the value of the objectAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAttachment }
     *     
     */
    public void setObjectAttachment(ObjectAttachment value) {
        this.objectAttachment = value;
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
