
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the user to view the status of the supplier records in a registration batch file uploaded by the user.
 *          
 * 
 * <p>Java class for GetSupplierRegistrationBatchStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierRegistrationBatchStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetSupplierRegistrationBatchResponseDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}GetSupplierRegistrationBatchStatusResponseDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierRegistrationBatchStatusResponse", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "getSupplierRegistrationBatchResponseDetail"
})
public class GetSupplierRegistrationBatchStatusResponse
    extends Response
{

    @XmlElement(name = "GetSupplierRegistrationBatchResponseDetail")
    protected List<GetSupplierRegistrationBatchStatusResponseDetail> getSupplierRegistrationBatchResponseDetail;

    /**
     * Gets the value of the getSupplierRegistrationBatchResponseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getSupplierRegistrationBatchResponseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetSupplierRegistrationBatchResponseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetSupplierRegistrationBatchStatusResponseDetail }
     * 
     * 
     */
    public List<GetSupplierRegistrationBatchStatusResponseDetail> getGetSupplierRegistrationBatchResponseDetail() {
        if (getSupplierRegistrationBatchResponseDetail == null) {
            getSupplierRegistrationBatchResponseDetail = new ArrayList<GetSupplierRegistrationBatchStatusResponseDetail>();
        }
        return this.getSupplierRegistrationBatchResponseDetail;
    }

}
