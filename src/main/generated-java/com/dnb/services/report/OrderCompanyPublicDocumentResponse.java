
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the D&amp;B Company Document Web Service to respond to the request from the Customer/User to access and download publicly filed documents from an external official registry body, e.g., Annual Accounts, Annual Returns.  For UK business subjects these documents are provided by the UK Companies House for those documents which have been filed over the last 5 years .
 *          
 * 
 * <p>Java class for OrderCompanyPublicDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCompanyPublicDocumentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="OrderCompanyPublicDocumentResponseDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrderCompanyPublicDocumentResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCompanyPublicDocumentResponse", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "orderCompanyPublicDocumentResponseDetail"
})
public class OrderCompanyPublicDocumentResponse
    extends Response
{

    @XmlElement(name = "OrderCompanyPublicDocumentResponseDetail")
    protected OrderCompanyPublicDocumentResponseDetail orderCompanyPublicDocumentResponseDetail;

    /**
     * Gets the value of the orderCompanyPublicDocumentResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCompanyPublicDocumentResponseDetail }
     *     
     */
    public OrderCompanyPublicDocumentResponseDetail getOrderCompanyPublicDocumentResponseDetail() {
        return orderCompanyPublicDocumentResponseDetail;
    }

    /**
     * Sets the value of the orderCompanyPublicDocumentResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCompanyPublicDocumentResponseDetail }
     *     
     */
    public void setOrderCompanyPublicDocumentResponseDetail(OrderCompanyPublicDocumentResponseDetail value) {
        this.orderCompanyPublicDocumentResponseDetail = value;
    }

}
