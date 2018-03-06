
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to requests for a product or products. This may include such details as the type of product required, the subject about which the product should be produced, the content of the product.
 *          
 * 
 * <p>Java class for OrderProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="OrderProductRequestDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}OrderProductRequestDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProductRequest", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "orderProductRequestDetail"
})
public class OrderProductRequest
    extends Request
{

    @XmlElement(name = "OrderProductRequestDetail")
    protected OrderProductRequestDetail orderProductRequestDetail;

    /**
     * Gets the value of the orderProductRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProductRequestDetail }
     *     
     */
    public OrderProductRequestDetail getOrderProductRequestDetail() {
        return orderProductRequestDetail;
    }

    /**
     * Sets the value of the orderProductRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProductRequestDetail }
     *     
     */
    public void setOrderProductRequestDetail(OrderProductRequestDetail value) {
        this.orderProductRequestDetail = value;
    }

}
