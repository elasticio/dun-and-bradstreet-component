
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}Message">
 *       &lt;sequence>
 *         &lt;element name="TransactionDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}RequestTransactionDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServiceVersionNumber" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ServiceVersionNumber" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "transactionDetail"
})
@XmlSeeAlso({
    RetrieveProductRequest.class,
    OrderProductRequest.class
})
public class Request
    extends Message
{

    @XmlElement(name = "TransactionDetail")
    protected RequestTransactionDetail transactionDetail;
    @XmlAttribute(name = "ServiceVersionNumber")
    protected String serviceVersionNumber;

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTransactionDetail }
     *     
     */
    public RequestTransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTransactionDetail }
     *     
     */
    public void setTransactionDetail(RequestTransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the serviceVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersionNumber() {
        return serviceVersionNumber;
    }

    /**
     * Sets the value of the serviceVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersionNumber(String value) {
        this.serviceVersionNumber = value;
    }

}
