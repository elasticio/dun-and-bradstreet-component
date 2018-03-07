
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the user to request for a list of suppliers within a specific supplier registration workflow domain; e.g.,suppliers within a specific queue under a specific division.
 *          
 * 
 * <p>Java class for GetSupplierListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetSupplierListRequestDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}GetSupplierListRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierListRequest", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "getSupplierListRequestDetail"
})
public class GetSupplierListRequest
    extends Request
{

    @XmlElement(name = "GetSupplierListRequestDetail", required = true)
    protected GetSupplierListRequestDetail getSupplierListRequestDetail;

    /**
     * Gets the value of the getSupplierListRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetSupplierListRequestDetail }
     *     
     */
    public GetSupplierListRequestDetail getGetSupplierListRequestDetail() {
        return getSupplierListRequestDetail;
    }

    /**
     * Sets the value of the getSupplierListRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupplierListRequestDetail }
     *     
     */
    public void setGetSupplierListRequestDetail(GetSupplierListRequestDetail value) {
        this.getSupplierListRequestDetail = value;
    }

}
