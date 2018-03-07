
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation returns a list of suppliers within a specific supplier registration workflow domain; e.g.,suppliers within a specific queue under a specific division.
 *          
 * 
 * <p>Java class for GetSupplierListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetSupplierListResponseDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}GetSupplierListResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierListResponse", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "getSupplierListResponseDetail"
})
public class GetSupplierListResponse
    extends Response
{

    @XmlElement(name = "GetSupplierListResponseDetail")
    protected GetSupplierListResponseDetail getSupplierListResponseDetail;

    /**
     * Gets the value of the getSupplierListResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetSupplierListResponseDetail }
     *     
     */
    public GetSupplierListResponseDetail getGetSupplierListResponseDetail() {
        return getSupplierListResponseDetail;
    }

    /**
     * Sets the value of the getSupplierListResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupplierListResponseDetail }
     *     
     */
    public void setGetSupplierListResponseDetail(GetSupplierListResponseDetail value) {
        this.getSupplierListResponseDetail = value;
    }

}
