
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the information on a subject that has been updated in the last 90 days.
 *          
 * 
 * <p>Java class for CheckRefreshCandidateDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRefreshCandidateDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CompanyServiceV2.0}DUNSNumberType"/>
 *         &lt;element name="CheckRefreshResult" type="{http://services.dnb.com/CompanyServiceV2.0}TransactionResult" minOccurs="0"/>
 *         &lt;element name="TransferDUNSNumberRegistration" type="{http://services.dnb.com/CompanyServiceV2.0}TransferDUNSNumberRegistration" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDateSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRefreshCandidateDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "dunsNumber",
    "checkRefreshResult",
    "transferDUNSNumberRegistration",
    "lastUpdateDate"
})
public class CheckRefreshCandidateDetail {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "CheckRefreshResult")
    protected TransactionResult checkRefreshResult;
    @XmlElement(name = "TransferDUNSNumberRegistration")
    protected TransferDUNSNumberRegistration transferDUNSNumberRegistration;
    @XmlElement(name = "LastUpdateDate")
    protected String lastUpdateDate;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the checkRefreshResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionResult }
     *     
     */
    public TransactionResult getCheckRefreshResult() {
        return checkRefreshResult;
    }

    /**
     * Sets the value of the checkRefreshResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionResult }
     *     
     */
    public void setCheckRefreshResult(TransactionResult value) {
        this.checkRefreshResult = value;
    }

    /**
     * Gets the value of the transferDUNSNumberRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link TransferDUNSNumberRegistration }
     *     
     */
    public TransferDUNSNumberRegistration getTransferDUNSNumberRegistration() {
        return transferDUNSNumberRegistration;
    }

    /**
     * Sets the value of the transferDUNSNumberRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDUNSNumberRegistration }
     *     
     */
    public void setTransferDUNSNumberRegistration(TransferDUNSNumberRegistration value) {
        this.transferDUNSNumberRegistration = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }

}
