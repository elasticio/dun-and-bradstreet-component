
package com.dnb.services.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ContactProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="OrderProductResponseDetail" type="{http://services.dnb.com/ContactProductServiceV2.0}OrderProductResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProductResponse", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "orderProductResponseDetail"
})
public class OrderProductResponse
    extends Response
{

    @XmlElement(name = "OrderProductResponseDetail")
    protected OrderProductResponseDetail orderProductResponseDetail;

    /**
     * Gets the value of the orderProductResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProductResponseDetail }
     *     
     */
    public OrderProductResponseDetail getOrderProductResponseDetail() {
        return orderProductResponseDetail;
    }

    /**
     * Sets the value of the orderProductResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProductResponseDetail }
     *     
     */
    public void setOrderProductResponseDetail(OrderProductResponseDetail value) {
        this.orderProductResponseDetail = value;
    }

}
