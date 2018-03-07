
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
 * <p>Java class for UploadSupplierDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSupplierDocumentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="UploadSupplierDocumentResponseDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}UploadSupplierDocumentResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSupplierDocumentResponse", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "uploadSupplierDocumentResponseDetail"
})
public class UploadSupplierDocumentResponse
    extends Response
{

    @XmlElement(name = "UploadSupplierDocumentResponseDetail")
    protected UploadSupplierDocumentResponseDetail uploadSupplierDocumentResponseDetail;

    /**
     * Gets the value of the uploadSupplierDocumentResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UploadSupplierDocumentResponseDetail }
     *     
     */
    public UploadSupplierDocumentResponseDetail getUploadSupplierDocumentResponseDetail() {
        return uploadSupplierDocumentResponseDetail;
    }

    /**
     * Sets the value of the uploadSupplierDocumentResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadSupplierDocumentResponseDetail }
     *     
     */
    public void setUploadSupplierDocumentResponseDetail(UploadSupplierDocumentResponseDetail value) {
        this.uploadSupplierDocumentResponseDetail = value;
    }

}
