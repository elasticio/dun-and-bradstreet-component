
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to requests for a product or products. This may include such details as the type of product required, the subject about which the product should be produced, the content of the product.
 *          
 * 
 * <p>Java class for GetDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetDataRequestDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrderProductRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataRequest", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "getDataRequestDetail"
})
public class GetDataRequest
    extends Request
{

    @XmlElement(name = "GetDataRequestDetail", required = true)
    protected OrderProductRequestDetail getDataRequestDetail;

    /**
     * Gets the value of the getDataRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProductRequestDetail }
     *     
     */
    public OrderProductRequestDetail getGetDataRequestDetail() {
        return getDataRequestDetail;
    }

    /**
     * Sets the value of the getDataRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProductRequestDetail }
     *     
     */
    public void setGetDataRequestDetail(OrderProductRequestDetail value) {
        this.getDataRequestDetail = value;
    }

}
