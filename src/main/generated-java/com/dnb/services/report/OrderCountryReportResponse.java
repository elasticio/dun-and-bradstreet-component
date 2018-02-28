
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the data being returned to the customer as a result of a product request.
 *          
 * 
 * <p>Java class for OrderCountryReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCountryReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="OrderCountryReportResponseDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCountryReportResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCountryReportResponse", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "orderCountryReportResponseDetail"
})
public class OrderCountryReportResponse
    extends Response
{

    @XmlElement(name = "OrderCountryReportResponseDetail")
    protected OrderCountryReportResponseDetail orderCountryReportResponseDetail;

    /**
     * Gets the value of the orderCountryReportResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCountryReportResponseDetail }
     *     
     */
    public OrderCountryReportResponseDetail getOrderCountryReportResponseDetail() {
        return orderCountryReportResponseDetail;
    }

    /**
     * Sets the value of the orderCountryReportResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCountryReportResponseDetail }
     *     
     */
    public void setOrderCountryReportResponseDetail(OrderCountryReportResponseDetail value) {
        this.orderCountryReportResponseDetail = value;
    }

}
