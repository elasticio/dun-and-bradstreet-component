
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the Damp;B services to respond to the Customer/Userapos;s request for a product.
 *          
 * 
 * <p>Java class for OrderCompanyReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCompanyReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="OrderCompanyReportResponseDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCompanyReportResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCompanyReportResponse", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "orderCompanyReportResponseDetail"
})
public class OrderCompanyReportResponse
    extends Response
{

    @XmlElement(name = "OrderCompanyReportResponseDetail")
    protected OrderCompanyReportResponseDetail orderCompanyReportResponseDetail;

    /**
     * Gets the value of the orderCompanyReportResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCompanyReportResponseDetail }
     *     
     */
    public OrderCompanyReportResponseDetail getOrderCompanyReportResponseDetail() {
        return orderCompanyReportResponseDetail;
    }

    /**
     * Sets the value of the orderCompanyReportResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCompanyReportResponseDetail }
     *     
     */
    public void setOrderCompanyReportResponseDetail(OrderCompanyReportResponseDetail value) {
        this.orderCompanyReportResponseDetail = value;
    }

}
