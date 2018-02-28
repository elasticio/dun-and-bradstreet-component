
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to requests for a product or products. This may include such details as the type of product required, the subject about which the product should be produced, the content of the product.
 *          
 * 
 * <p>Java class for OrderCountryReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCountryReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="OrderCountryReportRequestDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCountryReportRequestDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCountryReportRequest", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "orderCountryReportRequestDetail"
})
public class OrderCountryReportRequest
    extends Request
{

    @XmlElement(name = "OrderCountryReportRequestDetail")
    protected OrderCountryReportRequestDetail orderCountryReportRequestDetail;

    /**
     * Gets the value of the orderCountryReportRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCountryReportRequestDetail }
     *     
     */
    public OrderCountryReportRequestDetail getOrderCountryReportRequestDetail() {
        return orderCountryReportRequestDetail;
    }

    /**
     * Sets the value of the orderCountryReportRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCountryReportRequestDetail }
     *     
     */
    public void setOrderCountryReportRequestDetail(OrderCountryReportRequestDetail value) {
        this.orderCountryReportRequestDetail = value;
    }

}
