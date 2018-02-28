
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the Customer/User to access and download publicly filed documents from an external official registry body, e.g., Annual Accounts, Annual Returns.For UK business subjects these documents are provided by the UK Companies House for those documents which have been filed over the last 5 years .
 *          
 * 
 * <p>Java class for OrderCompanyPublicDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCompanyPublicDocumentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="OrderCompanyPublicDocumentRequestDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCompanyPublicDocumentRequestDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCompanyPublicDocumentRequest", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "orderCompanyPublicDocumentRequestDetail"
})
public class OrderCompanyPublicDocumentRequest
    extends Request
{

    @XmlElement(name = "OrderCompanyPublicDocumentRequestDetail")
    protected OrderCompanyPublicDocumentRequestDetail orderCompanyPublicDocumentRequestDetail;

    /**
     * Gets the value of the orderCompanyPublicDocumentRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCompanyPublicDocumentRequestDetail }
     *     
     */
    public OrderCompanyPublicDocumentRequestDetail getOrderCompanyPublicDocumentRequestDetail() {
        return orderCompanyPublicDocumentRequestDetail;
    }

    /**
     * Sets the value of the orderCompanyPublicDocumentRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCompanyPublicDocumentRequestDetail }
     *     
     */
    public void setOrderCompanyPublicDocumentRequestDetail(OrderCompanyPublicDocumentRequestDetail value) {
        this.orderCompanyPublicDocumentRequestDetail = value;
    }

}
