
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the user to view the status of the supplier records in a registration batch file uploaded by the user.
 *          
 * 
 * <p>Java class for GetSupplierRegistrationBatchStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierRegistrationBatchStatusRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetSupplierRegistrationBatchStatusRequestDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}GetSupplierRegistrationBatchStatusRequestDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierRegistrationBatchStatusRequest", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "getSupplierRegistrationBatchStatusRequestDetail"
})
public class GetSupplierRegistrationBatchStatusRequest
    extends Request
{

    @XmlElement(name = "GetSupplierRegistrationBatchStatusRequestDetail")
    protected GetSupplierRegistrationBatchStatusRequestDetail getSupplierRegistrationBatchStatusRequestDetail;

    /**
     * Gets the value of the getSupplierRegistrationBatchStatusRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetSupplierRegistrationBatchStatusRequestDetail }
     *     
     */
    public GetSupplierRegistrationBatchStatusRequestDetail getGetSupplierRegistrationBatchStatusRequestDetail() {
        return getSupplierRegistrationBatchStatusRequestDetail;
    }

    /**
     * Sets the value of the getSupplierRegistrationBatchStatusRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupplierRegistrationBatchStatusRequestDetail }
     *     
     */
    public void setGetSupplierRegistrationBatchStatusRequestDetail(GetSupplierRegistrationBatchStatusRequestDetail value) {
        this.getSupplierRegistrationBatchStatusRequestDetail = value;
    }

}
