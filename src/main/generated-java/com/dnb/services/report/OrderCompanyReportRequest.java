
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the Customer/User to request for a product offered by Damp;B
 *          
 * 
 * <p>Java class for OrderCompanyReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCompanyReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="OrderCompanyReportRequestDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCompanyReportRequestDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCompanyReportRequest", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "orderCompanyReportRequestDetail"
})
public class OrderCompanyReportRequest
    extends Request
{

    @XmlElement(name = "OrderCompanyReportRequestDetail")
    protected OrderCompanyReportRequestDetail orderCompanyReportRequestDetail;

    /**
     * Gets the value of the orderCompanyReportRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCompanyReportRequestDetail }
     *     
     */
    public OrderCompanyReportRequestDetail getOrderCompanyReportRequestDetail() {
        return orderCompanyReportRequestDetail;
    }

    /**
     * Sets the value of the orderCompanyReportRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCompanyReportRequestDetail }
     *     
     */
    public void setOrderCompanyReportRequestDetail(OrderCompanyReportRequestDetail value) {
        this.orderCompanyReportRequestDetail = value;
    }

}
