
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}Message">
 *       &lt;sequence>
 *         &lt;element name="TransactionDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ResponseTransactionDetail"/>
 *         &lt;element name="TransactionResult" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}TransactionResult"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServiceVersionNumber" use="required" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}ServiceVersionNumber" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "transactionDetail",
    "transactionResult"
})
@XmlSeeAlso({
    OrderProductResponse.class,
    RetrieveProductResponse.class
})
public class Response
    extends Message
{

    @XmlElement(name = "TransactionDetail", required = true)
    protected ResponseTransactionDetail transactionDetail;
    @XmlElement(name = "TransactionResult", required = true)
    protected TransactionResult transactionResult;
    @XmlAttribute(name = "ServiceVersionNumber", required = true)
    protected String serviceVersionNumber;

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTransactionDetail }
     *     
     */
    public ResponseTransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTransactionDetail }
     *     
     */
    public void setTransactionDetail(ResponseTransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the transactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionResult }
     *     
     */
    public TransactionResult getTransactionResult() {
        return transactionResult;
    }

    /**
     * Sets the value of the transactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionResult }
     *     
     */
    public void setTransactionResult(TransactionResult value) {
        this.transactionResult = value;
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
