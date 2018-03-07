
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
 * <p>Java class for GetDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetDataResponseDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrderProductResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataResponse", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "getDataResponseDetail"
})
public class GetDataResponse
    extends Response
{

    @XmlElement(name = "GetDataResponseDetail")
    protected OrderProductResponseDetail getDataResponseDetail;

    /**
     * Gets the value of the getDataResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProductResponseDetail }
     *     
     */
    public OrderProductResponseDetail getGetDataResponseDetail() {
        return getDataResponseDetail;
    }

    /**
     * Sets the value of the getDataResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProductResponseDetail }
     *     
     */
    public void setGetDataResponseDetail(OrderProductResponseDetail value) {
        this.getDataResponseDetail = value;
    }

}
