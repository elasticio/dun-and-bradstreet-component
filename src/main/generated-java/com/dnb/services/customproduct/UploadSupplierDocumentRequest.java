
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
 * <p>Java class for UploadSupplierDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSupplierDocumentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="UploadSupplierDocumentRequestDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}UploadSupplierDocumentRequestDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSupplierDocumentRequest", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "uploadSupplierDocumentRequestDetail"
})
public class UploadSupplierDocumentRequest
    extends Request
{

    @XmlElement(name = "UploadSupplierDocumentRequestDetail")
    protected UploadSupplierDocumentRequestDetail uploadSupplierDocumentRequestDetail;

    /**
     * Gets the value of the uploadSupplierDocumentRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UploadSupplierDocumentRequestDetail }
     *     
     */
    public UploadSupplierDocumentRequestDetail getUploadSupplierDocumentRequestDetail() {
        return uploadSupplierDocumentRequestDetail;
    }

    /**
     * Sets the value of the uploadSupplierDocumentRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadSupplierDocumentRequestDetail }
     *     
     */
    public void setUploadSupplierDocumentRequestDetail(UploadSupplierDocumentRequestDetail value) {
        this.uploadSupplierDocumentRequestDetail = value;
    }

}
