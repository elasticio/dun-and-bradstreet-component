//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.22 at 01:48:05 PM EET 
//


package com.dnb.services.industry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the data being returned to the customer as a result of a product request.
 *          
 * 
 * <p>Java class for OrderProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/IndustryProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="OrderProductResponseDetail" type="{http://services.dnb.com/IndustryProductServiceV2.0}OrderProductResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProductResponse", propOrder = {
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
