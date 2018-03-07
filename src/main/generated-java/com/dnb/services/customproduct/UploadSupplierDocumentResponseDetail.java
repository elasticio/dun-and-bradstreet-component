
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the data being returned to the customer as a result of a product request.
 *          
 * 
 * <p>Java class for UploadSupplierDocumentResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSupplierDocumentResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}UserDetailForSupplier" minOccurs="0"/>
 *         &lt;element name="ObjectAttachment" type="{http://services.dnb.com/CustomProductServiceV2.0}ObjectAttachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSupplierDocumentResponseDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "userDetail",
    "objectAttachment"
})
public class UploadSupplierDocumentResponseDetail {

    @XmlElement(name = "UserDetail")
    protected UserDetailForSupplier userDetail;
    @XmlElement(name = "ObjectAttachment")
    protected ObjectAttachment objectAttachment;

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

}
